package SubstractionOperation;

import operation.Operation;

public class SubtractionDoubleDouble implements Operation {

    @Override
    public Object execute(Object left, Object right) {
        return (double) left - (double) right;
    }
}
