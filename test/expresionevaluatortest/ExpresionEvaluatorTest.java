package expresionevaluatortest;

import Expresion.AdditionExpression;
import Expresion.Constant;
import parser.Parser;
import parser.ShuttingYardParser;
import Tokenaiser.Token;
import Tokenaiser.Token.*;
import Tokenaiser.Tokenaiser;
import java.util.ArrayList;
import java.util.List;
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
    public void ParserSimpleExampleTest() {
        Parser parser = new Parser(new ShuttingYardParser());

        List<Token> tokens = new ArrayList<>();
        List<Token> tokensOutput = new ArrayList<>();
        
        tokens.add(new Value(3));
        
        tokensOutput = parser.parse(tokens);
        Value value = (Value) tokensOutput.get(0);

        Assert.assertEquals("3", String.valueOf(value.getValue()));
    }
    
    @Test
    public void parserTestAdditionOperation(){
        Parser parser = new Parser(new ShuttingYardParser());
        
        List<Token> tokens = new ArrayList<>();
        List<Token> tokensOutput;
        
        tokens.add(new Value<>(3));
        tokens.add(new Operator("+"));
        tokens.add(new Value(4));        
        
        tokensOutput = parser.parse(tokens);

        Value value = (Value) tokensOutput.get(0);
        Assert.assertEquals("3", String.valueOf(value.getValue()));
        
        value = (Value) tokensOutput.get(1);
        Assert.assertEquals("4", String.valueOf(value.getValue()));
        
        Operator operator = (Operator) tokensOutput.get(2);
        Assert.assertEquals("+", operator.getValue());
    }
    
    @Test
    public void parserTestOperation(){
        Parser parser = new Parser(new ShuttingYardParser());
        
        List<Token> tokens = new ArrayList<>();
        List<Token> tokensOutput;
        
        tokens.add(new Value<>(3));
        tokens.add(new Operator("+"));
        tokens.add(new Value(4));        
        tokens.add(new Operator("*"));
        tokens.add(new Value(2));        
        tokens.add(new Operator("-"));
        tokens.add(new Value(5));        
        
        tokensOutput = parser.parse(tokens);

        Value value = (Value) tokensOutput.get(0);
        Assert.assertEquals("3", String.valueOf(value.getValue()));
        
        value = (Value) tokensOutput.get(1);
        Assert.assertEquals("4", String.valueOf(value.getValue()));
        
        value = (Value) tokensOutput.get(2);
        Assert.assertEquals("2", String.valueOf(value.getValue()));
        
        Operator operator = (Operator) tokensOutput.get(3);
        Assert.assertEquals("*", operator.getValue());
        
        operator = (Operator) tokensOutput.get(4);
        Assert.assertEquals("+", operator.getValue());
        
        value = (Value) tokensOutput.get(5);
        Assert.assertEquals("5", String.valueOf(value.getValue()));
        
        operator = (Operator) tokensOutput.get(6);
        Assert.assertEquals("-", operator.getValue());
    }
}
