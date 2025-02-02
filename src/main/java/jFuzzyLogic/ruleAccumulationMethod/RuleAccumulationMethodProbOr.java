package jFuzzyLogic.ruleAccumulationMethod;

/**
 * Rule accumulation mathod: Probabilistic or
 * @author pcingola@users.sourceforge.net
 */
public class RuleAccumulationMethodProbOr extends RuleAccumulationMethod {

	public RuleAccumulationMethodProbOr() {
		super();
		name = "probOr";
	}

	/**
	 * @see jFuzzyLogic.ruleAccumulationMethod.RuleAccumulationMethod#aggregate(double, double)
	 */
	public double aggregate(double defuzzifierValue, double valueToAggregate) {
		return defuzzifierValue + valueToAggregate - defuzzifierValue * valueToAggregate;
	}

	/**
	 * @see jFuzzyLogic.ruleAccumulationMethod.RuleAccumulationMethod#toStringFcl()
	 */
	public String toStringFcl() {
		return "ACCU : PROBOR;";
	}

}
