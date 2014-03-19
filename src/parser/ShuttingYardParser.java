package parser;

import Tokenaiser.Token;
import java.util.Stack;

import Expresion.*;
import Tokenaiser.Token.*;
import java.util.ArrayList;

public class ShuttingYardParser implements ParserStrategy {

    @Override
    public Object evaluate(Token[] tokens) {
        
         Stack<Token.Operator> operators = new Stack<>();
         Stack<Token.Value> values = new Stack<>();
         
         ArrayList<Token> expresionTokens = new ArrayList<>();
        
         for (Object value : tokens) {

            if (value instanceof Token.Operator) {
                operators.push((Token.Operator) value);
            }

            if (value instanceof Token.Value) {
                values.push((Token.Value) value);
            }
        }

        Value value, value2;
        Operator symbol;

        value = values.pop();

        while (operators.size() >= 1) {
            symbol = operators.pop();
            value2 = values.pop();

            if (symbol.getValue().equals("+")) {
                value.setValue(new AdditionExpression(value.getValue(), value2.getValue()).calculate());
            }

            if (symbol.getValue().equals("-")) {
                value.setValue(new SubstractionExpression(value.getValue(), value2.getValue()).calculate());
            }

        }

        return value.getValue();
    }

}
