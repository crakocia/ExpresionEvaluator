package parser;

import expresionevaluator.AdditionOperation;
import java.util.Stack;
import parser.Token.*;

public class ShuttingYardParser implements Parser{
    
    private Stack<Operator> operators;
    private Stack<Value> values;

    public ShuttingYardParser() {

        operators = new Stack<>();
        values = new Stack<>();
    }

    @Override
    public Object evaluate(Token[] tokens) {
        for (Object value : tokens) {

            if (value instanceof Operator) 
                operators.push((Operator) value);            

            if (value instanceof Value) 
                values.push((Value) value);          
        }

        Value value, value2;
        Operator symbol;
   
        value = values.pop();
        
        while (operators.size() >= 1){
                symbol = operators.pop();                
                value2 = values.pop();

                if (symbol.getValue().equals("+"))
                    value.setValue(new AdditionOperation(value.getValue(), value2.getValue()).calculate());
        }
        
        return value.getValue();
    }

}
