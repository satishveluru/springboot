package example.quickstart.exceptions;

public class ValidationException extends RuntimeException {

    public ValidationException(String message) {
	super(message);
    }

    public ValidationException(String mesage, Throwable cause) {
	super(mesage, cause);
    }

}
