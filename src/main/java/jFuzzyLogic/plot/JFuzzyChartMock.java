package jFuzzyLogic.plot;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import jFuzzyLogic.FIS;
import jFuzzyLogic.FunctionBlock;
import jFuzzyLogic.defuzzifier.Defuzzifier;
import jFuzzyLogic.membership.MembershipFunction;
import jFuzzyLogic.rule.LinguisticTerm;
import jFuzzyLogic.rule.Variable;

/**
 * 
 * Charts variables, membership functions, function blocks, etc.
 * 
 * Stub class to avoid including jFreeCharts in minimal libraries
 * 
 * Code provided by: Carmelo (cswi)
 *
 */
public class JFuzzyChartMock extends JFuzzyChart {

	protected JFuzzyChartMock() {
	}

	@Override
	public void chart(Defuzzifier def, String title, boolean showIt) {
	}

	@Override
	public void chart(FIS fis) {
	}

	@Override
	public void chart(FunctionBlock fb) {
	}

	@Override
	public void chart(LinguisticTerm lt, boolean showIt) {
	}

	@Override
	public void chart(MembershipFunction mf, String title, boolean showIt) {
	}

	@Override
	public void chart(Variable var, boolean showIt) {
	}

	@Override
	public void chart(Variable var, Defuzzifier defuzzifier, boolean showIt) {
	}

	@Override
	public void draw(Graphics2D g, Rectangle2D rect, Variable var) {
	}

}
