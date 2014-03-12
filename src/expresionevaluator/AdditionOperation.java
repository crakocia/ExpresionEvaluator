package expresionevaluator;


import Expresion.BinaryExpresion;
import operation.OperationFactory;

public class AdditionOperation extends BinaryExpresion {

    public AdditionOperation(Object left, Object right) {
        super(left, right);
    }

    @Override
    public Object calculate() {
        OperationFactory operationfactory = new OperationFactory();
        return operationfactory.builder("Addition", left, right);
    }
}

