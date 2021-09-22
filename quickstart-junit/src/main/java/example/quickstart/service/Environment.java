package example.quickstart.service;

import java.util.ResourceBundle;

public class Environment {
	public String getName() {
		ResourceBundle resourceBundle = ResourceBundle
				.getBundle("environment");
		return resourceBundle.getString("env");
	}
}
