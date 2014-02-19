package expresionevaluator;


public class AdditionIntegerDouble implements Operation{

    @Override
    public Object execute(Object left, Object right) {
        return (int)left + (double)right;
    }

}
