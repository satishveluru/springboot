package example.quickstart.service.impl.staticblock;

import java.util.Date;

public class StaticBlockOwner {

	private static StaticBlockDependency blockDependency;
	static {
		blockDependency = new StaticBlockDependency();
		blockDependency.loadTime = new Date();
	}
	
	public void testMe() {
		
	}
}
