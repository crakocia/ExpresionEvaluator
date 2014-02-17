package expresionevaluator;

import java.util.HashMap;


public class Factory {
    
    private HashMap<String, Operation> operations;

    public Factory() {
        operations = new HashMap<String, Operation>();
        
        operations.put("AdditionItegerInteger", new Operation() {

            @Override
            public Object execute(Object left, Object right) {
                return (int)left + (int)right;
            }
        });
        operations.put("AdditionItegerDouble", new Operation() {

            @Override
            public Object execute(Object left, Object right) {
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

    public Object createAddition(Object left, Object right) {
        return operations.get("Addition"+left.getClass().getName()+right.getClass().getName()).execute(left, right);
    }

    private interface Operation {
        public Object execute(Object left, Object right);
    }
    
    

}
