package View.GUI;

import Languaje.Compiler.PythonCompiler;
import Languaje.Grammar.StructFileGrammarBaseVisitor;
import Languaje.Grammar.StructFileGrammarLexer;
import Languaje.Grammar.StructFileGrammarParser;
import Languaje.TranslateToPython.TranslateToPython;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        // Crear analizador lexico (Nombre de la gramatica + Lexer)
        StructFileGrammarLexer lexer = new StructFileGrammarLexer(CharStreams.fromFileName("src/Data/In/In.sf"));
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
        lexer.addErrorListener(new LexicError());

        // Crear objeto que realiza el reorrido de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crear analizador sintáctico (Nombre de la gramatica + Parser)
        StructFileGrammarParser parser = new StructFileGrammarParser(tokens);
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
        parser.addErrorListener(new SintacticError());

        // Crear objeto que realiza el reorrido de la gramatica desde la regla inicial (parcer. + nombre de la regla inicial de la gramatica + ())
        ParseTree tree = parser.init();

        // Crear objeto que realiza acciones en el recorrido de la gramatica
        TranslateToPython visitor = new TranslateToPython();

        // Realizar recorrido con las acciones de traducción de la gramatica dada
        visitor.visit(tree);

        // Ejecutar traducción
        PythonCompiler.run();

    }

}

class LexicError extends BaseErrorListener {
    public static final org.antlr.v4.runtime.ConsoleErrorListener INSTANCE = new org.antlr.v4.runtime.ConsoleErrorListener();
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        System.err.println("Error léxico: Se encontró el simbolo desconocido '" + msg.split("'")[1] + "' en la posición <"+ line + ":" + charPositionInLine + ">");
        System.exit(-1);
    }
}

class SintacticError extends BaseErrorListener {
    public static final org.antlr.v4.runtime.ConsoleErrorListener INSTANCE = new org.antlr.v4.runtime.ConsoleErrorListener();
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        if (msg.split(" ")[0].equals("mismatched")) {
            System.err.println("Error sintáctico: Se encontró  '" + msg.split("'")[1] + "' en la posición <"+ line + ":" + charPositionInLine + "> y se esperaba " + msg.split("[{]")[1].substring(0, msg.split("[{]")[1].length()-1));
        } else if (msg.split(" ")[0].equals("missing")) {
            System.err.println("Error sintáctico: Se encontró  '" + msg.split("'")[3] + "' en la posición <"+ line + ":" + charPositionInLine + "> y se esperaba '" + msg.split("'")[1] + "'");
        } else if (msg.split(" ")[0].equals("no")) {
            System.err.println("Error sintáctico: Alternativa no viable para el valor '" + ((CommonToken) offendingSymbol).getText() + "' en la posición <"+ line + ":" + charPositionInLine + ">");
        } else {
            System.err.println("Error sintáctico: line " + line + ":" + charPositionInLine + " " + msg);
        }
        System.exit(-1);
    }
}

