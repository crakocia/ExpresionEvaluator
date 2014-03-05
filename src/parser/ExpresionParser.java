package parser;

import expresionevaluator.AdditionOperation;
import expresionevaluator.OperationFactory;
import java.util.Stack;
import parser.Token.*;

public class ExpresionParser {

    private OperationFactory factory;

    private Stack<Operator> symbols;
    private Stack<Value> values;

    public ExpresionParser() {
        factory = new OperationFactory();

        symbols = new Stack<>();
        values = new Stack<>();
    }

    public Object evaluate(Token[] tokens) {
        for (Object value : tokens) {

            if (value instanceof Operator) 
                symbols.push((Operator) value);            

            if (value instanceof Value) 
                values.push((Value) value);          
        }

        Value value, value2;
        Operator symbol;
   
        value = values.pop();
        
        while (symbols.size() >= 1){
                symbol = symbols.pop();                
                value2 = values.pop();

                value.setValue(new AdditionOperation(value.getValue(), value2.getValue()).calculate());
        }
        
        return value.getValue();
    }

}
