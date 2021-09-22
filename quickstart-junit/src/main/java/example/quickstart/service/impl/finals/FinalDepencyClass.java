package example.quickstart.service.impl.finals;

import example.quickstart.service.impl.TestingImpedimentException;

public final class FinalDepencyClass {

	public void poison() {
		throw new TestingImpedimentException("Finals cannot be mocked");
	}
}
