package parser;

import expresionevaluator.AdditionOperation;
import parser.Token;
import expresionevaluator.ExpresionFactory;
import expresionevaluator.OperationFactory;
import parser.Token.number;
import parser.Token.symbol;
import java.util.Stack;

public class ExpresionParser {

    private OperationFactory factory;

    private Stack<symbol> symbols;
    private Stack<number> numbers;

    public ExpresionParser() {
        factory = new OperationFactory();

        symbols = new Stack<>();
        numbers = new Stack<>();
    }

    public Object evaluate(Token[] tokens) {
        for (Object value : tokens) {

            if (value instanceof symbol) {
                symbols.push((symbol) value);
            }

            if (value instanceof number) {
                numbers.push((number) value);
            }
        }

        number left = null;
        number right = null;
        symbol operator = null;

        String operation = "";
        
        Object result = null;

        while (numbers.size() >= 1) {
            left = numbers.pop();
            
            if (symbols.size() != 0) {
                operator = symbols.pop();
                right = numbers.pop();

                if (operator.getValue().equals("+")){
                    result = new AdditionOperation(left.getValue(), right.getValue()).calculate();
                }            
            }
            
            else return left.getValue();

        }

        return result;
    }

}
