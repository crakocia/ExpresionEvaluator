package expresionevaluator;


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
    
    
   public static class constant <Type> extends Token{
       
       private final Type constant;

        public constant(Type constant) {
            this.constant = constant;
        }   
        
        public Type getValue(){
            return constant;
        }
   };
   

}
