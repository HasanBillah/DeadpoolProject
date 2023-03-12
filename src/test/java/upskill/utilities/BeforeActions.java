package upskill.utilities;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeActions {
	@Before																
	public void beforeActions(Scenario scen){							
		System.out.println("--->>>> Initializing Driver....");			
		SetupDrivers.setupDriver();										
		System.out.println("Test Scenario Name : " + scen.getName());
}

}
