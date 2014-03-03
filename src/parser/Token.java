package parser;


public class Token {
    
    public static class symbol extends Token {
        
        private final String symbol;

        public symbol(String symbol) {
            this.symbol = symbol;
        }       
        
        public String getValue(){
            return symbol;
        }
    };
    
    
   public static class number <Type> extends Token{
       
       private final Type constant;

        public number(Type constant) {
            this.constant = constant;
        }   
        
        public Type getValue(){
            return constant;
        }
   };
   

}
