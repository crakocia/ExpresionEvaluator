package expresionevaluator;


public class Constant implements Expresion{
    
    Object value;
    
    public Constant(Object value) {
        this.value = value;
    }

    @Override
    public Object calculate() {
        return value;
    }


    
    
}
