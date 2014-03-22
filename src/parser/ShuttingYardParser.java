package parser;

import Tokenaiser.Token;
import java.util.Stack;

import Tokenaiser.Token.*;
import java.util.ArrayList;
import java.util.List;

public class ShuttingYardParser implements ParserStrategy {

    @Override
    public List<Token> evaluate(List<Token> tokens) {
        
         Stack<Operator> operatorsStack = new Stack<>();
         List<Token> outputList = new ArrayList<>();

         Operator anterior = new Operator("");

         for (Object value : tokens) {

            if (value instanceof Operator) {                
                if (anterior.equals("*")){
                    Operator operator = (Operator)value;
                    if (operator.equals("+") || operator.equals("-"))
                        while(operatorsStack.size() != 0)
                            outputList.add(operatorsStack.pop());                    
                }
               
                operatorsStack.push((Operator) value);                
                anterior = (Operator) value;
            }

            if (value instanceof Value) 
                outputList.add((Value) value);
            
        }     
         
        while(operatorsStack.size() != 0)
            outputList.add(operatorsStack.pop());      

        return outputList;
    }

}
