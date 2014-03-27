package Expresion;

import operation.OperationFactory;

public class ExpressionFactory {

    OperationFactory operationFactory;

    public ExpressionFactory() {
    }

    public Object builder(String operator, Object left, Object right) {
        if (operator.equals("+")) {
            return new AdditionExpression(left, right).calculate();
        }
        
        if (operator.equals("-")) {
            return new SubstractionExpression(left, right).calculate();
        }
        
        if (operator.equals("*")) {
            return new MultiplyExpression(left, right).calculate();
        }

        return null;
    }

}
