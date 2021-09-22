package example.quickstart.service.impl.privates;

import example.quickstart.service.impl.GraphicalInterface;

public class PrivateMethod {
	
	public Object validate(Object arg) {
		if(arg == null) {
			showError("Null input");
		}
		
		return arg;
	}

	private void showError(String msg) {
		GraphicalInterface.showMessage(msg);
	}
}
