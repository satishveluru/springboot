package example.quickstart.service.impl.newexpression;

import example.quickstart.service.impl.TestingImpedimentException;

public class PoisonIvy {

	public PoisonIvy() {
		throw new TestingImpedimentException(
				"Do not instantiate concrete class, use interfaces");
	}

	public void poison() {

	}
}
