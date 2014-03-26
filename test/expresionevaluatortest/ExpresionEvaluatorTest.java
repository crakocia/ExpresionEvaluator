package expresionevaluatortest;

import Expresion.AdditionExpression;
import Expresion.Constant;
import parser.Token.*;
import org.junit.Assert;
import org.junit.Test;

public class ExpresionEvaluatorTest {

    @Test
    public void simpleTest() {
        Assert.assertEquals(8, new Constant(8).calculate());
        Assert.assertEquals(2, new Constant(2).calculate());
        Assert.assertEquals(15.0, new Constant(15.0).calculate());
    }

    @Test
    public void additionTest() {
        Assert.assertEquals(12, new AdditionExpression(new Constant(6).calculate(), new Constant(6).calculate()).calculate());
        Assert.assertEquals(19, new AdditionExpression(new Constant(12).calculate(), new Constant(7).calculate()).calculate());
        Assert.assertEquals(25.0, new AdditionExpression(new Constant(20.0).calculate(), new Constant(5.0).calculate()).calculate());
    }
}
