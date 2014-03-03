package expresionevaluator;


public class AdditionOperation extends BinaryOperation{

    public AdditionOperation(Object left, Object right) {
        super(left, right);
    }

    @Override
    public Object calculate() {
        OperationFactory operationDictionary = new OperationFactory();
        return operationDictionary.builder("Addition", left, right);
    }
}

