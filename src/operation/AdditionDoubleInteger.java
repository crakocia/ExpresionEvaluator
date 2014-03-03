package operation;

import operation.Operation;

public class AdditionDoubleInteger implements Operation {

    @Override
    public Object execute(Object left, Object right) {
        return (double) left + (int) right;
    }
}
