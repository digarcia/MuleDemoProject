package exceptions;
import org.mule.api.MuleEvent;
import org.mule.extension.validation.api.ExceptionFactory;
import org.mule.extension.validation.api.ValidationResult;


public class CustomBadRequestFactoryException implements ExceptionFactory{

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Exception> T createException(ValidationResult result, Class<T> exceptionClass, MuleEvent event) {
		return (T) new CustomBadRequestException(result, event);
	}

	@Override
	public Exception createException(ValidationResult result, String exceptionClassName, MuleEvent event) {
		// TODO Auto-generated method stub
		return null;
	}

}
