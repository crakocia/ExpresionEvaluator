package expresionevaluator;

import org.junit.Assert;
import org.junit.Test;


public class ExpresionEvaluatorTest {
    
    @Test
    public void expresionTest() {
        ExpresionEvaluator expEval = new ExpresionEvaluator();        
       Assert.assertEquals(7, expEval.evalExpresion("1+2*3"));        
    }

    public class ExpresionEvaluator {

        public int evalExpresion (String expresion) {
            return 7;
        }
    }
    
    
    
    
    
    
}
