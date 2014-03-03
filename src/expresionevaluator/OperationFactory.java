package expresionevaluator;

import AdditionOperation.AdditionDoubleDouble;
import AdditionOperation.AdditionIntegerDouble;
import AdditionOperation.Operation;
import AdditionOperation.AdditionIntegerInteger;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperationFactory {

    public Object builder(String operator, Object left, Object right) {
        try {
            Operation c = (Operation) Class.forName("AdditionOperation."+operator + left.getClass().getSimpleName() + right.getClass().getSimpleName()).newInstance();
            return c.execute(left, right);            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(OperationFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
