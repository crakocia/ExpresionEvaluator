package MultiplyOperation;

import operation.Operation;

public class MultiplyIntegerInteger implements Operation{

    @Override
    public Object execute(Object left, Object right) {
        return (int)left * (int)right;
    }
}