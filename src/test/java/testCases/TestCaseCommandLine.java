package testCases;

import junit.framework.TestCase;
import jFuzzyLogic.FIS;
import jFuzzyLogic.Gpr;
import jFuzzyLogic.JFuzzyLogic;

import org.junit.Assert;
import org.junit.Test;

public class TestCaseCommandLine extends TestCase {

	public static final double EPSILON = 1e-6;

	@Test
	public void test() {
		Gpr.debug("Test");

		// Prepare command line
		String fileName = "tests/tipper.fcl";
		String args[] = { "-noCharts", "-e", fileName, "8.5", "9" };

		// Run
		JFuzzyLogic jFuzzyLogic = new JFuzzyLogic(args);
		jFuzzyLogic.run();
		FIS fis = jFuzzyLogic.getFis();

		// Check input variables
		Assert.assertEquals(fis.getVariable("food").getValue(), 8.5, EPSILON);
		Assert.assertEquals(fis.getVariable("service").getValue(), 9, EPSILON);
	}

}
