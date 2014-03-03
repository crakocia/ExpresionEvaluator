package expresionevaluator;

import expresionevaluator.ExpresionFactory;
import expresionevaluator.Token.constant;
import expresionevaluator.Token.symbol;
import java.util.Stack;


public class ExpresionParser {
    private ExpresionFactory factory;
    
    private Stack<symbol> symbols;
    private Stack<constant> constants;

    public ExpresionParser() {
        factory = new ExpresionFactory();
        
        symbols = new Stack<>();
        constants = new Stack<>();
    }

    public Object evaluate(Token[] tokens) {
        for (Object value : tokens) {
            
            if (value instanceof symbol){
                symbols.push((symbol)value);
            }   
            
            if (value instanceof constant){
                constants.push((constant)value);
            }
        }
        
        
        constant value = null;
        if(constants.size() >= 1){
             value = constants.pop();
        }
        
        return value.getValue();
    }

}
