package parser;


public class Token {
    
    public static class Operator extends Token {
        
        private final String operator;

        public Operator(String symbol) {
            this.operator = symbol;
        }       
        
        public String getValue(){
            return operator;
        }
    };
    
    
   public static class Value <Type> extends Token{
       
       private Type value;

        public Value(Type constant) {
            this.value = constant;
        }   
        
        public Type getValue(){
            return value;
        }
        
        public void setValue(Type constant){
            this.value = constant;
        }
   };
}
