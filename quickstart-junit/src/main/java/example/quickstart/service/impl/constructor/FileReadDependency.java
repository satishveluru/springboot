package example.quickstart.service.impl.constructor;

import example.quickstart.service.impl.TestingImpedimentException;

public class FileReadDependency {
	public FileReadDependency() {
		throw new TestingImpedimentException("File read error");
	}
}
