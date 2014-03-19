package SubstractionOperation;

import AdditionOperation.*;
import operation.Operation;
import operation.Operation;

public class SubstractionDoubleInteger implements Operation {

    @Override
    public Object execute(Object left, Object right) {
        return (double) left - (int) right;
    }
}
