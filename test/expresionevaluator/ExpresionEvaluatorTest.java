package expresionevaluator;

import org.junit.Assert;
import org.junit.Test;

public class ExpresionEvaluatorTest {

    @Test
    public void simpleExpresionTest() {
        ExpresionEvaluator expEval = new ExpresionEvaluator();
        Assert.assertEquals(1, expEval.evalExpresion("1"));
        Assert.assertEquals(2, expEval.evalExpresion("2"));
        Assert.assertEquals(3, expEval.evalExpresion("3"));
    }

}
