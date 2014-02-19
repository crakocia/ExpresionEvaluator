package expresionevaluator;


public class AdditionOperation extends BinaryOperation{

    public AdditionOperation(Object left, Object right) {
        super(left, right);
    }

    @Override
    public Object calculate() {
        OperationDictionary operationDictionary = new OperationDictionary();
        return operationDictionary.builder("Addition", left, right);
    }
}

