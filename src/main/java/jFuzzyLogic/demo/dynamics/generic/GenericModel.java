package jFuzzyLogic.demo.dynamics.generic;

import java.util.List;

import jFuzzyLogic.demo.dynamics.ForceDrivenModel;
import jFuzzyLogic.demo.dynamics.Model;
import jFuzzyLogic.rule.Variable;

/**
 * An IPModel object represents the dynamics of an inverted pendulum attached to a
 * sliding block.
 * @author Andrew Kaluzniacki
 */
public final class GenericModel implements Model {

        List<Variable> variables;
        

	/**
	 * propagate the model state through deltaTime using the Runge-Kutta method.
	 */
	public void update(double deltaTime) {

//		double endTime = time + deltaTime;
//		// break deltaTime into even smaller time steps.
//		while(time < endTime)
//			stepRK(timeStep);

	}

    Iterable<Variable> getVariables() {
       return variables;
    }
    
    public void setVariables(List<Variable> v){ 
            variables=v;
    }


    
}
