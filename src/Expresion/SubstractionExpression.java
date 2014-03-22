package Expresion;

import operation.OperationFactory;

public class SubstractionExpression extends BinaryExpresion {

    public SubstractionExpression(Object left, Object right) {
        super(left, right);
    }

    @Override
    public Object calculate() {
        OperationFactory operationfactory = new OperationFactory();
        return operationfactory.builder("Substraction", left, right);
    }

}
