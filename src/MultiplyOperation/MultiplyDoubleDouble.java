package MultiplyOperation;


import operation.Operation;

public class MultiplyDoubleDouble implements Operation {

    @Override
    public Object execute(Object left, Object right) {
        return (double) left * (double) right;
    }
}
