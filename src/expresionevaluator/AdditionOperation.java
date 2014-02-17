package expresionevaluator;


public class AdditionOperation extends BinaryOperation{

    public AdditionOperation(Object left, Object right) {
        super(left, right);
    }

    @Override
    public Object calculate() {
        Factory factoryOperation = new Factory();
        return factoryOperation.createAddition(left, right);
    }
}

