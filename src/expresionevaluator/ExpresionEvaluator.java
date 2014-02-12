package expresionevaluator;

public class ExpresionEvaluator {

    public int evalExpresion(String expresion) {        
        return calculateAddition(expresion);
    }
    
    public int calculateAddition(String expresion){
        String[] additionValues = expresion.split("\\+");
        
        int additionResult = 0;
        for (int i = 0; i < additionValues.length; i++) {            
            additionResult += Integer.valueOf(calculateMultiplication(additionValues, i));
        }   
        
        return additionResult;
    }

    private int calculateMultiplication(String[] additionValues, int i) throws NumberFormatException {
        String[] MultiplicationValues = additionValues[i].split("\\*");
        
        int multiplicationResult = 1;
        for (int j = 0; j < MultiplicationValues.length; j++) {
            multiplicationResult *= Integer.valueOf(MultiplicationValues[j]);
        }
        
        return multiplicationResult;
    }

}
