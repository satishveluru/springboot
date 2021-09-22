package example.quickstart.service.impl.staticblock;

import java.util.Date;

import example.quickstart.service.impl.TestingImpedimentException;

public class StaticBlockDependency {
    public static Date loadTime;
	public StaticBlockDependency() {
		throw new TestingImpedimentException("static blocks suck");
	}
}
