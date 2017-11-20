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

/**
 * Configure the server to catch validation exceptions and use them to send a user friendly response to the client.
 * @author OthmaneSENOUCI
 *
 */
@ControllerAdvice 
public class GlobalDefaultExceptionHandler {

	/**
	 * Used to catch all the exceptions thrown by validation rules and converts them into the standard response that the API returns.
	 * @param e an exception that contains a list of validation errors.
	 * @return response object that will be translated into a JSON.
	 */
	@ExceptionHandler({ ConstraintViolationException.class }) 
    public ResponseEntity<APIResponse> constraintViolation(ConstraintViolationException e) { 
       
        APIResponse result = new APIResponse(); 
        ArrayList<Error> errors = new ArrayList<>();
        
        for (@SuppressWarnings("rawtypes") ConstraintViolation violation : e.getConstraintViolations()) { 					// Loop and add the different validation errors to the response.
            
            if (violation.getPropertyPath() != null) { 																		// Only show errors that are linked to fields.
            	String property = violation.getPropertyPath().toString();
                errors.add(new Error(property.substring(property.lastIndexOf('.') + 1).trim(), violation.getMessage()));	// Add to the error arrayList.
            }
        } 
        
        result.setError(errors);
        return new ResponseEntity<>(result, HttpStatus.OK); 																// Send the response to the client.
    } 	

	
	/***
	 * Used to catch unexpected errors and returns a standard response that the API uses.
	 * @param e unhandled exception
	 * @return response object that will be translated into a JSON.
	 */
    @ExceptionHandler({ MethodArgumentNotValidException.class, NotFoundException.class, EntityNotFoundException.class, MethodArgumentTypeMismatchException.class }) 
    public ResponseEntity<APIResponse> validationFailed(MethodArgumentNotValidException e) { 
        APIResponse result = new APIResponse(); 
        result.setError("An error took place while trying to carry out your request. Please check your query and try again.");        
        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST); 
    } 

}
