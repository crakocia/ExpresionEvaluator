package Expresion;


import operation.OperationFactory;

public class MultiplyExpression extends BinaryExpresion {

    public MultiplyExpression(Object left, Object right) {
        super(left, right);
    }

    @Override
    public Object calculate() {
        OperationFactory operationfactory = new OperationFactory();
        return operationfactory.builder("Multiply", left, right);
    }
}