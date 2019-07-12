package jFuzzyLogic.ruleAccumulationMethod;

/**
 * Rule accumulation mathod: Sum
 * @author pcingola@users.sourceforge.net
 */
public class RuleAccumulationMethodSum extends RuleAccumulationMethod {

	public RuleAccumulationMethodSum() {
		super();
		name = "sum";
	}

	/**
	 * @see jFuzzyLogic.ruleAccumulationMethod.RuleAccumulationMethod#aggregate(double, double)
	 */
	public double aggregate(double defuzzifierValue, double valueToAggregate) {
		return defuzzifierValue + valueToAggregate;
	}

	/**
	 * @see jFuzzyLogic.ruleAccumulationMethod.RuleAccumulationMethod#toStringFcl()
	 */
	public String toStringFcl() {
		return "ACCU : SUM;";
	}
}
