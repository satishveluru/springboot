package example.quickstart.service.impl.instantiate;

import example.quickstart.service.impl.constructor.DatabaseDependency;

public class VariableInitialization {
  DatabaseDependency dependency1;
  
  public VariableInitialization(DatabaseDependency dependency1) {
	this.dependency1 = dependency1;
}

public void testMe(Object obj) {
	  
  }
}
