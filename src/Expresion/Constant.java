package Expresion;


public class Constant implements Expression {
    
    Object value;
    
    public Constant(Object value) {
        this.value = value;
    }

    @Override
    public Object calculate() {
        return value;
    }


    
    
}
