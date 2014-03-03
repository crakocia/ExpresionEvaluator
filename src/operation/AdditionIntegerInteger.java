package operation;

import operation.Operation;


public class AdditionIntegerInteger implements Operation{

    @Override
    public Object execute(Object left, Object right) {
        return (int)left + (int)right;
    }

}
