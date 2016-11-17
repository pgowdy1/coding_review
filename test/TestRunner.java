package test;
 
import org.junit.runner.*;
import org.junit.runner.notification.*;

import java.util.*;

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestAirport.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}
}
