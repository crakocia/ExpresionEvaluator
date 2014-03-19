package parser;

import Tokenaiser.Token;

public interface ParserStrategy {
    public Object evaluate(Token[] tokens);
}
