package AdditionOperation;

import operation.Operation;
import operation.Operation;


public class AdditionIntegerDouble implements Operation{

    @Override
    public Object execute(Object left, Object right) {
        return (int)left + (double)right;
    }

}
