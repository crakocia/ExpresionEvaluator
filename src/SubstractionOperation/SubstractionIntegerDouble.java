package SubstractionOperation;

import AdditionOperation.*;
import operation.Operation;
import operation.Operation;


public class SubstractionIntegerDouble implements Operation{

    @Override
    public Object execute(Object left, Object right) {
        return (int)left - (double)right;
    }

}
