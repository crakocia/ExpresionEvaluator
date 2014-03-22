package AdditionOperation;

import operation.Operation;
import operation.Operation;

public class AdditionDoubleDouble implements Operation {

    @Override
    public Object execute(Object left, Object right) {
        return (double) left + (double) right;
    }
}
