package example.quickstart.service.impl.newexpression;

public class NewExpressionDependency {

	public void testMe() {
		PoisonIvy ivy = new PoisonIvy();
		ivy.poison();
	}
}
