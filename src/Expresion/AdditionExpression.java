package Expresion;


import Expresion.BinaryExpresion;
import operation.OperationFactory;

public class AdditionExpression extends BinaryExpresion {

    public AdditionExpression(Object left, Object right) {
        super(left, right);
    }

    @Override
    public Object calculate() {
        OperationFactory operationfactory = new OperationFactory();
        return operationfactory.builder("Addition", left, right);
    }
}

