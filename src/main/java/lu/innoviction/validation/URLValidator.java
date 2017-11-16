package lu.innoviction.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



public class URLValidator implements ConstraintValidator<URL, String> {

	@Override
	public void initialize(URL constraintAnnotation) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		try {
			
			new java.net.URL(value);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

}
