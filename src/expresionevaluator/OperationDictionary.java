package expresionevaluator;


import AdditionOperation.AdditionDoubleDouble;
import AdditionOperation.AdditionIntegerDouble;
import AdditionOperation.Operation;
import AdditionOperation.AdditionIntegerInteger;
import java.util.HashMap;


public class OperationDictionary {
    
    private final HashMap<String, Operation> operations;

    public OperationDictionary() {
        operations = new HashMap<>();
        
        operations.put("AdditionIntegerInteger", new AdditionIntegerInteger());        
        operations.put("AdditionIntegerDouble", new AdditionIntegerDouble());        
        operations.put("AdditionDoubleInteger", new AdditionIntegerDouble());
        operations.put("AdditionDoubleDouble", new AdditionDoubleDouble());        
    }

    public Object builder(String operator, Object left, Object right) {
        return operations.get(operator+left.getClass().getSimpleName()+right.getClass().getSimpleName()).execute(left, right);
    }
    
    

}
