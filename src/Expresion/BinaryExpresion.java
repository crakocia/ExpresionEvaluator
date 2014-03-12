package Expresion;


public abstract class BinaryExpresion implements Expression {
    protected Object left;
    protected Object right;

    public BinaryExpresion(Object left, Object right) {
        this.left = left;
        this.right = right;
    }    
}
