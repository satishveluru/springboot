package example.quickstart.service.impl;

public class FileReadDependency {
	public FileReadDependency() {
		throw new TestingImpedimentException("File read error");
	}
}
