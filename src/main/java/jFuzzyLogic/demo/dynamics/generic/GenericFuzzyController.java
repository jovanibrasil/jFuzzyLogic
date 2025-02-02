package jFuzzyLogic.demo.dynamics.generic;

import java.io.InputStream;

import jFuzzyLogic.FunctionBlock;
import jFuzzyLogic.demo.dynamics.FuzzyController;
import jFuzzyLogic.rule.Variable;

/**
 *
 * @author pjl
 */
public class GenericFuzzyController extends FuzzyController {

	private FunctionBlock functionBlock;

	public GenericFuzzyController(GenericModel model, InputStream file) {
		super(file, model);
	}

	@Override
	protected void init() {
		if( fis == null ) { return; }
		functionBlock = fis.getFunctionBlock(null);
		variables.clear();
		FunctionBlock block = fis.getFunctionBlock(null);

		for( Variable x : block.variables() )
			variables.add(x);
		((GenericModel) model).setVariables(variables);
	}

	@Override
	public void control() {
		if( functionBlock == null ) { return; }
		GenericModel bmodel = (GenericModel) this.model;
		functionBlock.evaluate();
	}

	@Override
	public String showState() {
		return "HELLO IMPLEMENT ME";
	}
}
