package parser;

import Tokenaiser.Token;
import java.util.List;

public interface ParserStrategy {
    public List<Token> evaluate(List<Token> tokens);
}
