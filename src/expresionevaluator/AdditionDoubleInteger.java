package expresionevaluator;

public class AdditionDoubleInteger implements Operation {

    @Override
    public Object execute(Object left, Object right) {
        return (double) left + (int) right;
    }
}
