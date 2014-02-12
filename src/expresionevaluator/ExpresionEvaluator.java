package expresionevaluator;

public class ExpresionEvaluator {

    public int evalExpresion(String expresion) {

        String[] values = expresion.split("\\+");

        String[] additionValues;
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            additionValues = values[i].split("\\*");

            int resultM = 1;
            for (int j = 0; j < additionValues.length; j++) {
                resultM *= Integer.valueOf(additionValues[j]);
            }
            result += Integer.valueOf(resultM);
        }

        return result;
    }

}
