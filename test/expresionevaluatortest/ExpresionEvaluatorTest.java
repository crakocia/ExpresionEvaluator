package expresionevaluatortest;

import expresionevaluator.AdditionOperation;
import expresionevaluator.Constant;
import parser.ExpresionParser;
import parser.Token;
import parser.Token.*;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class ExpresionEvaluatorTest {

    @Test
    public void simpleTest() {
        Assert.assertEquals(8, new Constant(8).calculate());
        Assert.assertEquals(2, new Constant(2).calculate());
        Assert.assertEquals(15.0, new Constant(15.0).calculate());        
    }
    
    @Test 
    public void additionTest(){
        Assert.assertEquals(12, new AdditionOperation(new Constant(6).calculate(), new Constant(6).calculate()).calculate());
        Assert.assertEquals(19, new AdditionOperation(new Constant(12).calculate(), new Constant(7).calculate()).calculate());
        Assert.assertEquals(25.0, new AdditionOperation(new Constant(20.0).calculate(), new Constant(5.0).calculate()).calculate());        
    } 
    
    @Test
    public void parserTest(){  
        ExpresionParser parser = new ExpresionParser();
        
        Token[] tokens = {new number<>(3)};        
        
        Assert.assertEquals(3, (int) parser.evaluate(tokens));    
        
         Token[] tokens2 = {new number<>(3),
                          new symbol("+"),
                          new number<>(4)};
        
        Assert.assertEquals(7, (int) parser.evaluate(tokens2));
        
    }
}
