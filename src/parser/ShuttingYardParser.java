package parser;

import Expresion.ExpressionFactory;
import java.util.Stack;

import parser.Token.*;
import java.util.ArrayList;
import java.util.List;
import operation.OperationFactory;

public class ShuttingYardParser implements ParserStrategy {

    @Override
    public Object parse(List<Token> tokens) {
        List<Token> outputList;
        outputList = evaluateTokens(tokens);

        return calculate(outputList);
    }

    private List<Token> evaluateTokens(List<Token> tokens) {
        Stack<Operator> operatorsStack = new Stack<>();
        List<Token> outputList = new ArrayList<>();

        for (Object value : tokens) {

            if (value instanceof Operator) {
                operatorPrecedent(operatorsStack, value, outputList);
                operatorsStack.push((Operator) value);
            } else if (value instanceof Value) {
                outputList.add((Value) value);
            }
        }

        cleanOperatorStack(operatorsStack, outputList);

        return outputList;
    }

    private void cleanOperatorStack(Stack<Operator> operatorsStack, List<Token> outputList) {
        while (operatorsStack.size() != 0) {
              if (operatorsStack.peek().equals("(")) break;
            outputList.add(operatorsStack.pop());
        }
    }
    
     private void cleanOperatorStackUntilParenthesis(Stack<Operator> operatorsStack, List<Token> outputList) {
        while (operatorsStack.size() != 0) {
            Operator operator = operatorsStack.pop();
            if (!operator.equals("(") && !operator.equals(")")) {
                outputList.add(operator);
            }
        }
    }

    private void operatorPrecedent(Stack<Operator> operatorsStack, Object value, List<Token> outputList) {
        if (!operatorsStack.empty()) {
             Operator anterior = (Operator) operatorsStack.peek();
            if(anterior.equals(")"))
               cleanOperatorStackUntilParenthesis(operatorsStack, outputList);
            else if (anterior.equals("*") || anterior.equals("/")) {
                Operator operator = (Operator) value;
                if (operator.equals("+") || operator.equals("-")) {
                    cleanOperatorStack(operatorsStack, outputList);
                }
            }
            
            
        }
    }

    private Object calculate(List<Token> tokens) {

        Stack<Value> valueStack = new Stack<>();

        ExpressionFactory expressionFactory = new ExpressionFactory();

        for (Object value : tokens) {

            if (value instanceof Value) {
                valueStack.push((Value) value);
            }

            if (value instanceof Operator) {
                Value left = valueStack.pop();
                Value right = valueStack.pop();
                valueStack.push(new Value(expressionFactory.builder(((Operator) value).getValue(), left.getValue(), right.getValue())));
            }
        }

        return valueStack.peek().getValue();
    }

}
