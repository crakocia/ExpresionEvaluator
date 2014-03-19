package parser;

import Tokenaiser.Token;

public class Parser {

    private ParserStrategy parserStrategy;

    public Parser(ParserStrategy parserStrategy) {
        this.parserStrategy = parserStrategy;
    }

    public Object parse(Token[] tokens) {
        return parserStrategy.evaluate(tokens);
    }
}
