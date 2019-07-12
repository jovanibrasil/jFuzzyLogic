package jFuzzyLogic.ruleAccumulationMethod;


/**
 * Rule accumulation mathod: Sum
 * @author pcingola@users.sourceforge.net
 */
public class RuleAccumulationMethodNormedSum extends RuleAccumulationMethod {

	public RuleAccumulationMethodNormedSum() {
		super();
		name = "nsum";
	}

	/**
	 * @see jFuzzyLogic.ruleAccumulationMethod.RuleAccumulationMethod#aggregate(double, double)
	 */
	public double aggregate(double defuzzifierValue, double valueToAggregate) {
		return ( defuzzifierValue + valueToAggregate )  / Math.max(1.0, defuzzifierValue + valueToAggregate);
	}
	
	/**
	 * @see jFuzzyLogic.ruleAccumulationMethod.RuleAccumulationMethod#toStringFcl()
	 */
	public String toStringFcl() {
		return "ACCU : NSUM;";
	}
}
