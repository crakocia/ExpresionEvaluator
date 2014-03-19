package Tokenaiser;

import java.util.Stack;

public class Tokenaiser {

    private final Stack<Token.Operator> operators;
    private final Stack<Token.Value> values;

    public Tokenaiser(Token[] tokens) {
        operators = new Stack<>();
        values = new Stack<>();

        builder(tokens);
    }
    
    public void setTokens(Token[] tokens){
        builder(tokens);        
    }

    private void builder(Token[] tokens) {
       
    }

    public Stack<Token.Operator> getStackOperators() {
        return operators;
    }

    public Stack<Token.Value> getStackValues() {
        return values;
    }

}
