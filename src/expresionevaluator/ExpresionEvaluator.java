package expresionevaluator;


public class ExpresionEvaluator {

    public int evalExpresion(String expresion) {
        ExpresionParser expresionParser = new ExpresionParser();
        
        String[] values = expresionParser.toTree(expresion);
        
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            result += Integer.valueOf(values[i]);            
        }
        
        return result;
    }

}
