package Tokenaiser;


public class Token {
    
    public static class Operator extends Token {
        
        private final String operator;

        public Operator(String symbol) {
            this.operator = symbol;
        }       
        
        public String getValue(){
            return operator;
        }
        
        public boolean equals(String operator){
            return this.operator.equals(operator);
        }
    };
    
    
   public static class Value <Type> extends Token{
       
       private Type value;

        public Value(Type value) {
            this.value = value;
        }   
        
        public Type getValue(){
            return value;
        }
        
        public void setValue(Type constant){
            this.value = constant;
        }
   };
}
