package example.quickstart.service.impl.constructor;

import example.quickstart.service.impl.TestingImpedimentException;

public class DatabaseDependency {
	
	public DatabaseDependency() {
		throw new TestingImpedimentException("calls database");
	}
}
