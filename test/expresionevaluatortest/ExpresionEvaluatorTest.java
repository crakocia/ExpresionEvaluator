package expresionevaluatortest;

import Expresion.AdditionExpression;
import Expresion.Constant;
import parser.Parser;
import parser.ShuttingYardParser;
import Tokenaiser.Token;
import Tokenaiser.Token.*;
import Tokenaiser.Tokenaiser;
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

    @Test
    public void parserTest() {
        Parser parser = new Parser(new ShuttingYardParser());

        Token[] tokens = {new Value(3)};

        Assert.assertEquals(3, (int) parser.parse(tokens));

        Token[] tokens2 = {new Value<>(3),
            new Operator("+"),
            new Value(4)};

        Assert.assertEquals(7, (int) parser.parse(tokens2));

        Token[] tokens3 = {new Value<>(3),
            new Operator("+"),
            new Value(4),
            new Operator("+"),
            new Value(2)};

        Assert.assertEquals(9, (int) parser.parse(tokens3));
    }

    @Test
    public void substractTest() {
        Parser parser = new Parser(new ShuttingYardParser());

        Token[] token = {new Value<>(3),
            new Operator("-"),
            new Value(4)};

        Assert.assertEquals(1, (int) parser.parse(token));

        Token[] tokens2 = {new Value(3),
                            new Operator("+"),
                            new Value(4),
                            new Operator("-"),
                            new Value(15)};

        Assert.assertEquals(14, (int) parser.parse(tokens2));
    }
}
