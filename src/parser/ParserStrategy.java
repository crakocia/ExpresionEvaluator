package parser;

import java.util.List;

public interface ParserStrategy {
    public Object parse(List<Token> tokens);
}
