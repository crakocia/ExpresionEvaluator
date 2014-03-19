package operation;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OperationFactory {

    public Object builder(String operator, Object left, Object right) {
        try {
            Operation c = (Operation) Class.forName(operator+"Operation."+operator + left.getClass().getSimpleName() + right.getClass().getSimpleName()).newInstance();
            return c.execute(left, right);            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(OperationFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
