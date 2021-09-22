package example.quickstart.service.impl.staticmethods;

import example.quickstart.service.impl.TestingImpedimentException;

public class SingletonDependency {
	private static SingletonDependency singletonDependency;

	private SingletonDependency() {
	}

	public synchronized static SingletonDependency getInstance() {
		if (singletonDependency == null) {
			singletonDependency = new SingletonDependency();
		}

		return singletonDependency;
	}

	public static void callMe() {
		throw new TestingImpedimentException("Common we dont need singleton");
	}
	
	public void wrapper() {
		callMe();
	}
}
