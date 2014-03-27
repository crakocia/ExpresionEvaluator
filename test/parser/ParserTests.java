package parser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import junit.framework.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ParserTests {

    @Test
    public void parserStubCallMethosParseTest() {
        Parser parser = mock(Parser.class);

        List tokens = mock(List.class);

        parser.parse(tokens);

        verify(parser).parse(tokens);
    }

    @Test
    public void parseMockParseMethod() {
        Parser parser = mock(Parser.class);

        List tokens = mock(List.class);

        when(parser.parse(tokens)).thenReturn("8");

        Assert.assertEquals("8", parser.parse(tokens));
    }

    @Test
    public void parseSimpleAdditionTest() {
        Parser parser = new Parser(new ShuttingYardParser());

        List<Token> tokens = new ArrayList<>();

        tokens.add(new Token.Value(2));
        tokens.add(new Token.Operator("+"));
        tokens.add(new Token.Value(3));

        Assert.assertEquals(5, (int) parser.parse(tokens));
    }

    @Test
    public void parseSimpleSubstraction() {
        Parser parser = new Parser(new ShuttingYardParser());

        List<Token> tokens = new ArrayList<>();

        tokens.add(new Token.Value(2));
        tokens.add(new Token.Operator("-"));
        tokens.add(new Token.Value(3));

        Assert.assertEquals(1, (int) parser.parse(tokens));
    }

    @Test
    public void parseSimpleMultiply() {
        Parser parser = new Parser(new ShuttingYardParser());

        List<Token> tokens = new ArrayList<>();

        tokens.add(new Token.Value(2));
        tokens.add(new Token.Operator("*"));
        tokens.add(new Token.Value(3));

        Assert.assertEquals(6, (int) parser.parse(tokens));
    }

    @Test
    public void parseOperation() {
        Parser parser = new Parser(new ShuttingYardParser());

        List<Token> tokens = new ArrayList<>();

        tokens.add(new Token.Value(2));
        tokens.add(new Token.Operator("*"));
        tokens.add(new Token.Value(3));
        tokens.add(new Token.Operator("+"));
        tokens.add(new Token.Value(2));

        Assert.assertEquals(8, (int) parser.parse(tokens));

        tokens.clear();

        tokens.add(new Token.Value(2));
        tokens.add(new Token.Operator("-"));
        tokens.add(new Token.Value(1));
        tokens.add(new Token.Operator("+"));
        tokens.add(new Token.Value(5));

        Assert.assertEquals(4, (int) parser.parse(tokens));

        Collections.reverse(tokens);

        Assert.assertEquals(6, (int) parser.parse(tokens));

        tokens.clear();

        tokens.add(new Token.Value(2));
        tokens.add(new Token.Operator("-"));
        tokens.add(new Token.Value(1));
        tokens.add(new Token.Operator("*"));
        tokens.add(new Token.Value(5));

        Assert.assertEquals(3, (int) parser.parse(tokens));

        Collections.reverse(tokens);

        Assert.assertEquals(-3, (int) parser.parse(tokens));

        tokens.clear();

        tokens.add(new Token.Value(2));
        tokens.add(new Token.Operator("-"));
        tokens.add(new Token.Value(6));
        tokens.add(new Token.Operator("*"));
        tokens.add(new Token.Value(5));
        tokens.add(new Token.Operator("+"));
        tokens.add(new Token.Value(2));
        tokens.add(new Token.Operator("-"));
        tokens.add(new Token.Value(2));
        tokens.add(new Token.Operator("*"));
        tokens.add(new Token.Value(5));

        Assert.assertEquals(36, (int) parser.parse(tokens));

        Collections.reverse(tokens);

        Assert.assertEquals(-20, (int) parser.parse(tokens));
    }

    @Test
    public void parseParethesisExample() {
        Parser parser = new Parser(new ShuttingYardParser());

        List<Token> tokens = new ArrayList<>();

        tokens.add(new Token.Operator("("));
        tokens.add(new Token.Value(2));
        tokens.add(new Token.Operator("+"));
        tokens.add(new Token.Value(3));
        tokens.add(new Token.Operator(")"));
        tokens.add(new Token.Operator("*"));
        tokens.add(new Token.Value(3));

        Assert.assertEquals(15, (int) parser.parse(tokens));      
    }
}
