package expresionevaluator;


public abstract class BinaryOperation implements Expresion{
    
    Object left;
    Object right;

    public BinaryOperation(Object left, Object right) {
        this.left = left;
        this.right = right;
    }    
}
