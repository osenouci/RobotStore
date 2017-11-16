package lu.innoviction.configuration;

import java.util.ArrayList;

import javax.persistence.EntityNotFoundException;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javassist.NotFoundException;
import lu.innoviction.response.APIResponse;
import lu.innoviction.response.Error;

@ControllerAdvice 
public class GlobalDefaultExceptionHandler {


	@ExceptionHandler({ ConstraintViolationException.class }) 
    public ResponseEntity<APIResponse> constraintViolation(ConstraintViolationException e) { 
       
        APIResponse result = new APIResponse(); 
        ArrayList<Error> errors = new ArrayList<>();
        
        for (@SuppressWarnings("rawtypes") ConstraintViolation violation : e.getConstraintViolations()) { 
            
            if (violation.getPropertyPath() != null) { 
            	String property = violation.getPropertyPath().toString();
                errors.add(new Error(property.substring(property.lastIndexOf('.') + 1).trim(), violation.getMessage()));
            }
        } 
        
        result.setError(errors);
        return new ResponseEntity<>(result, HttpStatus.OK); 
    } 	
	

    @ExceptionHandler({ MethodArgumentNotValidException.class, NotFoundException.class, EntityNotFoundException.class, MethodArgumentTypeMismatchException.class }) 
    public ResponseEntity<APIResponse> validationFailed(MethodArgumentNotValidException e) { 
        APIResponse result = new APIResponse(); 
        result.setError("An error took place while trying to carry out your request. Please check your query and try again.");        
        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST); 
    } 

}
