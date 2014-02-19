package expresionevaluator;


public class AdditionOperation extends BinaryOperation{

    public AdditionOperation(Object left, Object right) {
        super(left, right);
    }

    @Override
    public Object calculate() {
        OperationDictionary factoryOperation = new OperationDictionary();
        return factoryOperation.createAddition(left, right);
    }
}

