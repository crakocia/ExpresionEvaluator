package expresionevaluator;

import java.util.HashMap;


public class Factory {
    
    private HashMap<String, Operation> operations;

    public Factory() {
        operations = new HashMap<String, Operation>();
        
        initAdditionIntegerInteger();
        
        operations.put("AdditionIntegerDouble", new Operation() {

            @Override
            public Object execute(Object left, Object right) {
                String temp = "int";
                Integer a = 3;
         
                return (int)left + (double)right;
            }
        });
        
        operations.put("AdditionDoubleInteger", new Operation() {

            @Override
            public Object execute(Object left, Object right) {
                return (double)left + (int)right;
            }
        });    
        
        operations.put("AdditionDoubleDouble", new Operation() {

            @Override
            public Object execute(Object left, Object right) {
                return (double)left + (double)right;
            }
        });        
    }

    private void initAdditionIntegerInteger() {
        operations.put("AdditionIntegerInteger", new Operation() {
            
            @Override
            public Object execute(Object left, Object right) {
                return (int)left + (int)right;
            }
        });
    }

    public Object createAddition(Object left, Object right) {
        return operations.get("Addition"+left.getClass().getSimpleName()+right.getClass().getSimpleName()).execute(left, right);
    }

    private interface Operation {
        public Object execute(Object left, Object right);
    }
    
    

}
