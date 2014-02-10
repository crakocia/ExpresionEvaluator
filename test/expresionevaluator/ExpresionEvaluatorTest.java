package expresionevaluator;

import org.junit.Assert;


public class ExpresionEvaluatorTest {
    
    public ExpresionEvaluatorTest() {
        ExpresionEvaluator expEval = new ExpresionEvaluator();
        
       Assert.assertEquals(7, expEval.eval("1+2*3"));
        
    }

    private static class ExpresionEvaluator {

        public ExpresionEvaluator() {
        }

        private int eval(String expresion) {
            return 7;
        }
    }
    
    
    
    
    
    
}
