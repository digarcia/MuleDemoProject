package exceptions;

import org.mule.api.MuleEvent;
import org.mule.extension.validation.api.ValidationException;
import org.mule.extension.validation.api.ValidationResult;

public class CustomBadRequestException extends ValidationException {

	public CustomBadRequestException(ValidationResult validationResult, MuleEvent event) {
		super(validationResult, event);

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
