package example.quickstart.error;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ApiValidationError extends ApiSubError {
	private String object;
	private String field;
	private Object rejectedValue;
	private String message;

	ApiValidationError(String object, String message, Object rejectedValue2, String message2) {
		this.object = object;
		this.message = message;
	}

	public ApiValidationError(String object2, String message2) {
	}
}
