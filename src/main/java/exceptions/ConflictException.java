package exceptions;

import org.mule.api.MuleEvent;
import org.mule.extension.validation.api.ValidationException;
import org.mule.extension.validation.api.ValidationResult;

public class ConflictException extends ValidationException {

	public ConflictException(ValidationResult validationResult, MuleEvent event) {
		super(validationResult, event);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
