package example.quickstart.service.impl.staticmethods;

public class VictimOfAPatternLover {
	private final SingletonDependency dependency;

	public VictimOfAPatternLover(SingletonDependency dependency) {
		this.dependency = dependency;
	}

	public void testMe() {
		dependency.wrapper();
	}
}
