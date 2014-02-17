package expresionevaluator;


public class AdditionOperation extends BinaryOperation{

    public AdditionOperation(Object left, Object right) {
        super(left, right);
    }

    @Override
    public Object calculate() {
        if (left instanceof Integer){
            if (right instanceof Integer){
                return (int)left + (int)right;
            }                
            else{
                if (right instanceof Double){
                    return (int)left + (double)right;
                }                    
            }       
        }
        else{
             if (right instanceof Integer){
                return (double)left + (int)right;
            }                
            else{
                if (right instanceof Double){
                    return (double)left + (double)right;
                }                    
            }      
        }
        return 0;
    }
}

