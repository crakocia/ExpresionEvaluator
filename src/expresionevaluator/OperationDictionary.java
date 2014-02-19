package expresionevaluator;

import java.util.HashMap;


public class OperationDictionary {
    
    private HashMap<String, Operation> operations;

    public OperationDictionary() {
        operations = new HashMap<String, Operation>();
        
        operations.put("AdditionIntegerInteger", new AdditionIntegerInteger());        
        operations.put("AdditionIntegerDouble", new AdditionIntegerDouble());        
        operations.put("AdditionDoubleInteger", new AdditionIntegerDouble());
        operations.put("AdditionDoubleDouble", new AdditionDoubleDouble());        
    }

    public Object createAddition(Object left, Object right) {
        return operations.get("Addition"+left.getClass().getSimpleName()+right.getClass().getSimpleName()).execute(left, right);
    }
    
    

}
