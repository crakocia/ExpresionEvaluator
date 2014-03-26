package MultiplyOperation;


import operation.Operation;

public class MultiplyIntegerDouble implements Operation{

    @Override
    public Object execute(Object left, Object right) {
        return (int)left * (double)right;
    }
}
