package jFuzzyLogic.optimization;
import jFuzzyLogic.rule.RuleBlock;

/**
 * Generic abstract error function
 */

public abstract class ErrorFunction {

	/** 
	 * Default constructor (does nothing)
	 */
	public ErrorFunction() {	
	}

	/** Evaluate error function for this fuzzyRuleSet */
	public abstract double evaluate(RuleBlock fuzzyRuleSet);
}
