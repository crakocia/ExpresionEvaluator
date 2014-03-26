package MultiplyOperation;


import operation.Operation;

public class MultiplyDoubleInteger implements Operation {

    @Override
    public Object execute(Object left, Object right) {
        return (double) left * (int) right;
    }
}
