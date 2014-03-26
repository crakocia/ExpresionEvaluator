package parser;

import java.util.List;

public class Parser {

    private ParserStrategy parserStrategy;

    public Parser(ParserStrategy parserStrategy) {
        this.parserStrategy = parserStrategy;
    }

    public Object parse(List<Token> tokens) {
        return parserStrategy.parse(tokens);
    }
}
