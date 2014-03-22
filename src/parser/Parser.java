package parser;

import Tokenaiser.Token;
import java.util.List;

public class Parser {

    private ParserStrategy parserStrategy;

    public Parser(ParserStrategy parserStrategy) {
        this.parserStrategy = parserStrategy;
    }

    public List<Token> parse(List<Token> tokens) {
        return parserStrategy.evaluate(tokens);
    }
}
