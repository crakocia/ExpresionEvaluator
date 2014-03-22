package SubstractionOperation;

import AdditionOperation.*;
import operation.Operation;
import operation.Operation;


public class SubstractionIntegerInteger implements Operation{

    @Override
    public Object execute(Object left, Object right) {
        return (int)left - (int)right;
    }

}
