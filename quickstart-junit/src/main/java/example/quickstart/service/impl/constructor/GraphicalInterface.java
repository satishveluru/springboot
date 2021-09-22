package example.quickstart.service.impl.constructor;

import example.quickstart.service.impl.TestingImpedimentException;

public class GraphicalInterface {

	public static void showMessage(String msg) {
		throw new TestingImpedimentException("GUI objects need manual intervention");
	}
}
