package expresionevaluator;

import org.junit.Assert;
import org.junit.Test;

public class ExpresionEvaluatorTest {

    @Test
    public void simpleTest() {
        ExpresionEvaluator expEval = new ExpresionEvaluator();
        
        Assert.assertEquals(1, expEval.evalExpresion("1"));
        Assert.assertEquals(2, expEval.evalExpresion("2"));
        Assert.assertEquals(3, expEval.evalExpresion("3"));
    }
    
    @Test
    public void AdditionTest(){
        ExpresionEvaluator expEval = new ExpresionEvaluator();
        
        Assert.assertEquals(4, expEval.evalExpresion("2+2"));
        Assert.assertEquals(5, expEval.evalExpresion("2+3"));
        Assert.assertEquals(9, expEval.evalExpresion("2+3+4"));    
        Assert.assertEquals(16, expEval.evalExpresion("4+4+8"));
    }
    
    @Test
    public void MultiplicationTest(){
        ExpresionEvaluator expEval = new ExpresionEvaluator();
        
        Assert.assertEquals(4, expEval.evalExpresion("1+2*3"));        
    }
}
