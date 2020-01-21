package Languaje.TranslateToPython;

import Languaje.Grammar.StructFileGrammarBaseVisitor;
import Languaje.Grammar.StructFileGrammarLexer;
import Languaje.Grammar.StructFileGrammarParser;
import org.antlr.v4.runtime.Token;

import java.io.*;
import java.util.*;

public class TranslateToPython extends StructFileGrammarBaseVisitor {

    // Alamcenar variables ya definidas <id, tipo>
    ArrayList<Object[]> variables;

    // Alamcenar funciones ya definidas <id, tipo, <id paramatros>, <tipos paramatros>>
    ArrayList<Object[]> functions;

    // Pila contadora de variables globales y locales
    Stack<Integer> varCont;

    // Pila contadora de funciones globales y locales
    Stack<Integer> functCont;

    // Lista de metodos por defecto
    // id StructFile, id Python, Tipo de retorno, tipo de los parametros
    Object[][] numMethods = {
            {"num", "num", StructFileGrammarLexer.TK_NUMBER},
            {"bol", "bol", StructFileGrammarLexer.TK_BOOLEAN},
            {"tex", "tex", StructFileGrammarLexer.TK_TEXT},
            {"fil", "fil", StructFileGrammarLexer.TK_FILE},
            {"gro", "gro", -StructFileGrammarLexer.TK_TEXT},
            {"lis", "lis", StructFileGrammarLexer.TK_LIST},
            {"cop", "cop", StructFileGrammarLexer.TK_TEXT},
            {"len", "len", StructFileGrammarLexer.TK_NUMBER}
    };
    // id StructFile, id Python, Tipo de retorno, tipo de los parametros
    Object[][] bolMethods = {
            {"num", "num", StructFileGrammarLexer.TK_NUMBER},
            {"bol", "bol", StructFileGrammarLexer.TK_BOOLEAN},
            {"tex", "tex", StructFileGrammarLexer.TK_TEXT},
            {"fil", "fil", StructFileGrammarLexer.TK_FILE},
            {"gro", "gro", -StructFileGrammarLexer.TK_TEXT},
            {"lis", "lis", StructFileGrammarLexer.TK_LIST},
            {"cop", "cop", StructFileGrammarLexer.TK_TEXT},
            {"len", "len", StructFileGrammarLexer.TK_NUMBER}
    };
    // id StructFile, id Python, Tipo de retorno, tipo de los parametros
    Object[][] texMethods = {
            {"num", "num", StructFileGrammarLexer.TK_NUMBER},
            {"bol", "bol", StructFileGrammarLexer.TK_BOOLEAN},
            {"tex", "tex", StructFileGrammarLexer.TK_TEXT},
            {"fil", "fil", StructFileGrammarLexer.TK_FILE},
            {"gro", "gro", -StructFileGrammarLexer.TK_TEXT},
            {"lis", "lis", StructFileGrammarLexer.TK_LIST},
            {"cop", "cop", StructFileGrammarLexer.TK_TEXT},
            {"len", "len", StructFileGrammarLexer.TK_NUMBER},
            {"sub", "sub1", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"sub", "sub2", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"char", "char", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER},
            {"sep", "sep1", -StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"sep", "sep2", -StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER},
            {"sep", "sep3", -StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"sep", "sep4", -StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER},
            {"sep", "sep5", -StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER},
            {"sep", "sep6", -StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER},
            {"sep", "sep7", -StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_TEXT},
            {"rem", "rem1", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"rem", "rem2", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER},
            {"rem", "rem3", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"rem", "rem4", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER},
            {"rem", "rem5", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER},
            {"rem", "rem6", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"rem", "rem7", StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER},
            {"rem", "rem8", StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_TEXT},
            {"rep", "rep1", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"rep", "rep2", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"rep", "rep3", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"rep", "rep4", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"rep", "rep5", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"rep", "rep6", StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_TEXT},
            {"con", "con1", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER},
            {"con", "con2", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"con", "con3", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"con", "con4", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"con", "con5", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"con", "con6", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"con", "con7", StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"con", "con8", StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER, -StructFileGrammarLexer.TK_TEXT},
            {"con", "con9", StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_TEXT},
            {"get", "get1", -StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"get", "get2", -StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER},
            {"get", "get3", -StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"get", "get4", -StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER},
            {"get", "get5", -StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER},
            {"get", "get6", -StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER},
            {"get", "get7", -StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_TEXT},
            {"ver", "ver1", StructFileGrammarLexer.TK_BOOLEAN, StructFileGrammarLexer.TK_TEXT},
            {"ver", "ver2", StructFileGrammarLexer.TK_BOOLEAN, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER},
            {"ver", "ver3", StructFileGrammarLexer.TK_BOOLEAN, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"ver", "ver4", StructFileGrammarLexer.TK_BOOLEAN, StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER},
            {"ver", "ver5", StructFileGrammarLexer.TK_BOOLEAN, StructFileGrammarLexer.TK_NUMBER},
            {"ver", "ver6", StructFileGrammarLexer.TK_BOOLEAN, -StructFileGrammarLexer.TK_NUMBER},
            {"ver", "ver7", StructFileGrammarLexer.TK_BOOLEAN, -StructFileGrammarLexer.TK_TEXT},
            {"pos", "pos1", -StructFileGrammarLexer.TK_GROUP, StructFileGrammarLexer.TK_TEXT},
            {"pos", "pos2", -StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER},
            {"pos", "pos3", -StructFileGrammarLexer.TK_GROUP, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"pos", "pos4", -StructFileGrammarLexer.TK_GROUP, StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER},
            {"pos", "pos5", -StructFileGrammarLexer.TK_GROUP, -StructFileGrammarLexer.TK_TEXT},
    };
    // id StructFile, id Python, Tipo de retorno, tipo de los parametros
    Object[][] filMethods = {
            {"num", "num", StructFileGrammarLexer.TK_NUMBER},
            {"bol", "bol", StructFileGrammarLexer.TK_BOOLEAN},
            {"tex", "tex", StructFileGrammarLexer.TK_TEXT},
            {"fil", "fil", StructFileGrammarLexer.TK_FILE},
            {"gro", "gro", -StructFileGrammarLexer.TK_FILE},
            {"lis", "lis", StructFileGrammarLexer.TK_LIST},
            {"cop", "cop", StructFileGrammarLexer.TK_FILE},
            {"len", "len", StructFileGrammarLexer.TK_NUMBER},
            {"name", "name1", StructFileGrammarLexer.TK_TEXT},
            {"name", "name2", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT},
            {"ext", "ext1", StructFileGrammarLexer.TK_TEXT},
            {"ext", "ext2", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT},
            {"cont", "cont1", StructFileGrammarLexer.TK_TEXT},
            {"cont", "cont2", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT},
            {"sub", "sub1", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"sub", "sub2", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"char", "char", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_NUMBER},
            {"sep", "sep1", -StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT},
            {"sep", "sep2", -StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER},
            {"sep", "sep3", -StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"sep", "sep4", -StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER},
            {"sep", "sep5", -StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_NUMBER},
            {"sep", "sep6", -StructFileGrammarLexer.TK_FILE, -StructFileGrammarLexer.TK_NUMBER},
            {"sep", "sep7", -StructFileGrammarLexer.TK_FILE, -StructFileGrammarLexer.TK_TEXT},
            {"rem", "rem1", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT},
            {"rem", "rem2", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER},
            {"rem", "rem3", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"rem", "rem4", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER},
            {"rem", "rem5", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_NUMBER},
            {"rem", "rem6", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"rem", "rem7", StructFileGrammarLexer.TK_FILE, -StructFileGrammarLexer.TK_NUMBER},
            {"rem", "rem8", StructFileGrammarLexer.TK_FILE, -StructFileGrammarLexer.TK_TEXT},
            {"rep", "rep1", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"rep", "rep2", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"rep", "rep3", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"rep", "rep4", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"rep", "rep5", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"rep", "rep6", StructFileGrammarLexer.TK_FILE, -StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_TEXT},
            {"con", "con1", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_NUMBER},
            {"con", "con2", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT},
            {"con", "con3", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"con", "con4", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"con", "con5", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"con", "con6", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"con", "con7", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"con", "con8", StructFileGrammarLexer.TK_FILE, -StructFileGrammarLexer.TK_NUMBER, -StructFileGrammarLexer.TK_TEXT},
            {"con", "con9", StructFileGrammarLexer.TK_FILE, -StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_TEXT},
            {"get", "get1", -StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT},
            {"get", "get2", -StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER},
            {"get", "get3", -StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"get", "get4", -StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER},
            {"get", "get5", -StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_NUMBER},
            {"get", "get6", -StructFileGrammarLexer.TK_FILE, -StructFileGrammarLexer.TK_NUMBER},
            {"get", "get7", -StructFileGrammarLexer.TK_FILE, -StructFileGrammarLexer.TK_TEXT},
            {"ver", "ver1", StructFileGrammarLexer.TK_BOOLEAN, StructFileGrammarLexer.TK_TEXT},
            {"ver", "ver2", StructFileGrammarLexer.TK_BOOLEAN, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER},
            {"ver", "ver3", StructFileGrammarLexer.TK_BOOLEAN, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"ver", "ver4", StructFileGrammarLexer.TK_BOOLEAN, StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER},
            {"ver", "ver5", StructFileGrammarLexer.TK_BOOLEAN, StructFileGrammarLexer.TK_NUMBER},
            {"ver", "ver6", StructFileGrammarLexer.TK_BOOLEAN, -StructFileGrammarLexer.TK_NUMBER},
            {"ver", "ver7", StructFileGrammarLexer.TK_BOOLEAN, -StructFileGrammarLexer.TK_TEXT},
            {"pos", "pos1", -StructFileGrammarLexer.TK_GROUP, StructFileGrammarLexer.TK_TEXT},
            {"pos", "pos2", -StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER},
            {"pos", "pos3", -StructFileGrammarLexer.TK_GROUP, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"pos", "pos4", -StructFileGrammarLexer.TK_GROUP, StructFileGrammarLexer.TK_TEXT, -StructFileGrammarLexer.TK_NUMBER},
            {"pos", "pos5", -StructFileGrammarLexer.TK_GROUP, -StructFileGrammarLexer.TK_TEXT},
            {"set", "set", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_FILE}
    };
    // id StructFile, id Python, Tipo de retorno, tipo de los parametros
    Object[][] treMethods = {
            {"num", "num", StructFileGrammarLexer.TK_NUMBER},
            {"numf", "numf", StructFileGrammarLexer.TK_NUMBER},
            {"numd", "numd", StructFileGrammarLexer.TK_NUMBER},
            {"tex", "tex", StructFileGrammarLexer.TK_TEXT},
            {"fil", "fil", StructFileGrammarLexer.TK_FILE},
            {"gro", "gro", -StructFileGrammarLexer.TK_TEXT},
            {"lis", "lis", StructFileGrammarLexer.TK_LIST},
            {"tre", "tre", StructFileGrammarLexer.TK_TREE},
            {"cop", "cop", StructFileGrammarLexer.TK_TEXT},
            {"len", "len", StructFileGrammarLexer.TK_NUMBER},
            {"name", "name1", StructFileGrammarLexer.TK_TEXT},
            {"name", "name2", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_TEXT},
            {"last", "last", StructFileGrammarLexer.TK_TREE},
            {"root", "root", StructFileGrammarLexer.TK_TREE},
            {"files", "files", -StructFileGrammarLexer.TK_FILE},
            {"ins", "ins1", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_FILE},
            {"ins", "ins2", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_FILE},
            {"ins", "ins3", StructFileGrammarLexer.TK_TREE, -StructFileGrammarLexer.TK_FILE},
            {"ins", "ins4", StructFileGrammarLexer.TK_TREE, -StructFileGrammarLexer.TK_NUMBER, -StructFileGrammarLexer.TK_FILE},
            {"ins", "ins5", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_TREE},
            {"ins", "ins6", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TREE},
            {"ins", "ins7", StructFileGrammarLexer.TK_TREE, -StructFileGrammarLexer.TK_TREE},
            {"ins", "ins8", StructFileGrammarLexer.TK_TREE, -StructFileGrammarLexer.TK_NUMBER, -StructFileGrammarLexer.TK_TREE},
            {"getf", "getf1", StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_NUMBER},
            {"getf", "getf2", -StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"getf", "getf3", -StructFileGrammarLexer.TK_FILE, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"getf", "getf4", -StructFileGrammarLexer.TK_FILE, -StructFileGrammarLexer.TK_NUMBER},
            {"getf", "getf5", -StructFileGrammarLexer.TK_FILE},
            {"getd", "getd1", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_NUMBER},
            {"getd", "getd2", -StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_TEXT},
            {"getd", "getd3", -StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"getd", "getd4", -StructFileGrammarLexer.TK_TREE, -StructFileGrammarLexer.TK_NUMBER},
            {"getd", "getd5", -StructFileGrammarLexer.TK_TREE},
            {"delf", "delf1", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_NUMBER},
            {"delf", "delf2", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"delf", "delf3", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"delf", "delf4", StructFileGrammarLexer.TK_TREE, -StructFileGrammarLexer.TK_NUMBER},
            {"delf", "delf5", StructFileGrammarLexer.TK_TREE},
            {"deld", "deld1", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_NUMBER},
            {"deld", "deld2", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_TEXT},
            {"deld", "deld3", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"deld", "deld4", StructFileGrammarLexer.TK_TREE, -StructFileGrammarLexer.TK_NUMBER},
            {"deld", "deld5", StructFileGrammarLexer.TK_TREE},
            {"del", "del1", StructFileGrammarLexer.TK_TREE},
            {"enumf", "enumf1", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"enumf", "enumf2", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"denumf", "denumf1", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_TEXT},
            {"renumf", "renumf1", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"renumf", "renumf2", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"enumd", "enumd1", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"enumd", "enumd2", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"denumd", "denumd1", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_TEXT},
            {"renumd", "renumd1", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_TEXT},
            {"renumd", "renumd2", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TEXT},
            {"set", "set", StructFileGrammarLexer.TK_TREE, StructFileGrammarLexer.TK_TREE}

    };
    // id StructFile, id Python, Tipo de retorno, tipo de los parametros
    Object[][] groMethods = {
        {"num", "num", StructFileGrammarLexer.TK_NUMBER},
        {"tex", "tex", StructFileGrammarLexer.TK_TEXT},
        {"gro", "gro", StructFileGrammarLexer.TK_GROUP},
        {"lis", "lis", StructFileGrammarLexer.TK_LIST},
        {"cop", "cop", StructFileGrammarLexer.TK_GROUP},
        {"len", "len", StructFileGrammarLexer.TK_NUMBER},
        {"join", "join1", 0},
        {"join", "join2", 0, StructFileGrammarLexer.TK_BOOLEAN},
        {"get", "get1", StructFileGrammarLexer.TK_GROUP, StructFileGrammarLexer.TK_BOOLEAN},
        {"get", "get2", 0, StructFileGrammarLexer.TK_NUMBER},
        {"get", "get3", 0, StructFileGrammarLexer.TK_BOOLEAN, StructFileGrammarLexer.TK_NUMBER},
        {"get", "get4", StructFileGrammarLexer.TK_GROUP, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
        {"get", "get5", 0, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
        {"st", "st1", StructFileGrammarLexer.TK_GROUP, StructFileGrammarLexer.TK_BOOLEAN},
        {"st", "st2", StructFileGrammarLexer.TK_GROUP, StructFileGrammarLexer.TK_BOOLEAN, StructFileGrammarLexer.TK_NUMBER},
        {"st", "st3", StructFileGrammarLexer.TK_GROUP, StructFileGrammarLexer.TK_BOOLEAN, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
        {"ins", "ins1", StructFileGrammarLexer.TK_GROUP, 0, StructFileGrammarLexer.TK_BOOLEAN},
        {"ins", "ins2", StructFileGrammarLexer.TK_GROUP, StructFileGrammarLexer.TK_NUMBER, 0, StructFileGrammarLexer.TK_BOOLEAN},
        {"ins", "ins3", StructFileGrammarLexer.TK_GROUP, StructFileGrammarLexer.TK_GROUP},
        {"ins", "ins4", StructFileGrammarLexer.TK_GROUP, -StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_GROUP},
        {"set", "set", StructFileGrammarLexer.TK_GROUP, StructFileGrammarLexer.TK_GROUP}
    };
    // id StructFile, id Python, Tipo de retorno, tipo de los parametros
    Object[][] lisMethods = {
            {"num", "num", StructFileGrammarLexer.TK_NUMBER},
            {"tex", "tex", StructFileGrammarLexer.TK_TEXT},
            {"gro", "gro", StructFileGrammarLexer.TK_GROUP},
            {"lis", "lis", StructFileGrammarLexer.TK_LIST},
            {"cop", "cop", StructFileGrammarLexer.TK_LIST},
            {"len", "len", StructFileGrammarLexer.TK_NUMBER},
            {"get", "get1", 0, StructFileGrammarLexer.TK_NUMBER},
            {"get", "get2", StructFileGrammarLexer.TK_LIST, StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_NUMBER},
            {"ins", "ins1", StructFileGrammarLexer.TK_LIST, 0},
            {"ins", "ins2", StructFileGrammarLexer.TK_LIST, StructFileGrammarLexer.TK_NUMBER, 0},
            {"ins", "ins3", StructFileGrammarLexer.TK_LIST, StructFileGrammarLexer.TK_LIST},
            {"ins", "ins4", StructFileGrammarLexer.TK_LIST, -StructFileGrammarLexer.TK_NUMBER, StructFileGrammarLexer.TK_LIST},
            {"set", "set", StructFileGrammarLexer.TK_LIST, StructFileGrammarLexer.TK_LIST}
    };

    // Constructor
    public TranslateToPython() {
        variables = new ArrayList<>();
        functions = new ArrayList<>();
        varCont = new Stack<>();
        varCont.add(0);
        functCont = new Stack<>();
        functCont.add(0);
        defaultFunctions();
    }

    // Ingresar funciones por defecto
    private void defaultFunctions() {
        functions.add(new Object[] {"out", StructFileGrammarLexer.TK_TREE,  new ArrayList<String>(Arrays.asList("tex")), new ArrayList<Integer>(Arrays.asList(StructFileGrammarLexer.TK_TEXT))});
        contFunct();
        functions.add(new Object[] {"read", StructFileGrammarLexer.TK_TREE,  new ArrayList<String>(Arrays.asList("dir")), new ArrayList<Integer>(Arrays.asList(StructFileGrammarLexer.TK_TEXT))});
        contFunct();
        functions.add(new Object[] {"write", StructFileGrammarLexer.TK_TREE,  new ArrayList<String>(Arrays.asList("dir", "tree")), new ArrayList<Integer>(Arrays.asList(StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TREE))});
        contFunct();
        functions.add(new Object[] {"owrite", StructFileGrammarLexer.TK_TREE,  new ArrayList<String>(Arrays.asList("dir", "tree")), new ArrayList<Integer>(Arrays.asList(StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TREE))});
        contFunct();
        functions.add(new Object[] {"append", StructFileGrammarLexer.TK_TREE,  new ArrayList<String>(Arrays.asList("dir", "tree")), new ArrayList<Integer>(Arrays.asList(StructFileGrammarLexer.TK_TEXT, StructFileGrammarLexer.TK_TREE))});
        contFunct();
    }

    // Indentación
    private String ind() {
        StringBuilder ind = new StringBuilder();
        for (int i = 0; i < varCont.size(); i++) {
            ind.append("    ");
        }
        return String.valueOf(ind);
    }

    // Escribir en archivo
    private void write(String write) {
        try {

            // Crear objeto de escritura
            FileWriter writer = new FileWriter("src/Data/Out/Out.py");

            // Flujo de escritura en el archivo
            BufferedWriter br = new BufferedWriter(writer);

            // Cargar estructura
            FileReader reader = new FileReader("src/Languaje/TranslateToPython/PythonStructure.py");
            BufferedReader br2 = new BufferedReader(reader);
            String structure = "";
            while (true) {
                String valor = br2.readLine();
                if(valor == null) {
                    break;
                } else {
                    structure += valor + "\n";
                }
            }

            // Escribir
            br.write(structure + write);

            // Cerrar flujo
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Obtener ultima función con el ID especificado
    private Object[] getLastVariable(String id) {
        for (int i = variables.size() - 1; i >= 0; i--) {
            if ((variables.get(i)[0]).equals(id)) {
                return variables.get(i);
            }
        }
        return null;
    }

    // Obtener ultima función con el ID especificado
    private Object[] getLastFuncion(String id) {
        for (int i = functions.size() - 1; i >= 0; i--) {
            if ((functions.get(i)[0]).equals(id)) {
                return functions.get(i);
            }
        }
        return null;
    }

    // Añadir nuevo nivel local para variables y funciones locales
    private void addLevel() {
        functCont.add(0);
        varCont.add(0);
    }

    // Borrar nivel local con sus variables y funciónes
    private void removeLevel() {
        int cont = functCont.pop();
        int size = functions.size();
        for (int i = size - 1; i >= size - cont; i--) {
            functions.remove(i);
        }
        cont = varCont.pop();
        size = variables.size();
        for (int i = size - 1; i >= size - cont; i--) {
            variables.remove(i);
        }
    }

    // Contar nueva función
    private void contFunct() {
        functCont.add(functCont.pop() + 1);
    }

    // Contar nueva variable
    private void contVar() {
        varCont.add(varCont.pop() + 1);
    }

    // Error semántico
    public static void semmanticError(String error){
        System.err.println(error);
        System.exit(-1);
    }

    // Obtener nombre segun tipo
    public String literalName(int type) {
        if (type >= 0) {
            return StructFileGrammarLexer.VOCABULARY.getLiteralName(type);
        } else {
            String group = StructFileGrammarLexer.VOCABULARY.getLiteralName(StructFileGrammarLexer.TK_GROUP);
            String val = StructFileGrammarLexer.VOCABULARY.getLiteralName(-type);
            return group.substring(0, group.length()-1) + " " + val.substring(1);
        }

    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitContent1(StructFileGrammarParser.Content1Context ctx) {
        return (Object[]) visit(ctx.variableDef());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitContent2(StructFileGrammarParser.Content2Context ctx) {
        return (Object[]) visit(ctx.variableAsign());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitContent3(StructFileGrammarParser.Content3Context ctx) {
        return (Object[]) visit(ctx.functionDef());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitContent4(StructFileGrammarParser.Content4Context ctx) {
        return (Object[]) visit(ctx.functionCall());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitContent5(StructFileGrammarParser.Content5Context ctx) {
        return (Object[]) visit(ctx.structures());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitAdd_content(StructFileGrammarParser.Add_contentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.content() == null) {
            object[0] = "";
            object[1] = 0;
        } else {
            object[0] = ind() + ((Object[]) visit(ctx.content()))[0] + "\n" + ((Object[]) visit(ctx.add_content()))[0];
            object[1] = 0;
        }
        return object;
    }

    @Override public Object visitInit(StructFileGrammarParser.InitContext ctx) {
        if (ctx.content() != null) {
            String out = "def main():\n" + ind() + ((Object[]) visit(ctx.content()))[0] + "\n"
                    + ((Object[]) visit(ctx.add_content()))[0] + "try:\n" + ind() + "main()\n" + "except Exception as e:\n" + ind() + "logging.Logger('catch_all').error(\"Error Python: \" + str(e))";
            write(out);
        }
        return null;
    }

    // Devuelve la traducción y el tipo del valor
    @Override
    public Object[] visitNumber_val(StructFileGrammarParser.Number_valContext ctx) {
        Object[] object = new Object[2];
        object[0] = "Number(" + ctx.NUMBER_VAL().getText() + ")";
        object[1] = StructFileGrammarLexer.TK_NUMBER;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override
    public Object[] visitText_val(StructFileGrammarParser.Text_valContext ctx) {
        Object[] object = new Object[2];
        if (ctx.TEXT_VAL().getText().charAt(0) == '\'') {
            object[0] = "Text(r" + ctx.TEXT_VAL().getText() + ")";
        } else {
            object[0] = "Text(" + ctx.TEXT_VAL().getText() + ")";
        }
        object[1] = StructFileGrammarLexer.TK_TEXT;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override
    public Object[] visitBoolean_val(StructFileGrammarParser.Boolean_valContext ctx) {
        Object[] object = new Object[2];
        if (ctx.TRUE_VAL() == null) {
            object[0] = "Boolean(False)";
        } else {
            object[0] = "Boolean(True)";
        }
        object[1] = StructFileGrammarLexer.TK_BOOLEAN;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override
    public Object[] visitFile_val(StructFileGrammarParser.File_valContext ctx) {
        String[] s = ctx.FILE_VAL().getSymbol().getText().split("\\.");
        String trad = "File([";
        if (s[2].charAt(0) != '\"' && s[2].charAt(0) != '\'') {
            trad += "\"" + s[2] + "\"";
        } else {
            trad += s[2];
        }
        if (s.length > 3) {
            if (s[3].charAt(0) != '\"' && s[3].charAt(0) != '\'') {
                trad += ", " + "\"" + s[3] + "\"";
            } else {
                trad += ", " + s[3];
            }
        };
        if (s.length > 4) trad += ", " + s[4];
        trad += "])";
        Object[] object = new Object[2];
        object[0] = trad;
        object[1] = StructFileGrammarLexer.TK_FILE;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override
    public Object[] visitTree_val(StructFileGrammarParser.Tree_valContext ctx) {
        String trad = "Tree([";
        if (ctx.id_dir().getText().charAt(1) != '\"' && ctx.id_dir().getText().charAt(1) != '\'') {
            trad += "\"" + ctx.id_dir().getText().substring(1) + "\"";
        } else {
            trad += ctx.id_dir().getText().substring(1);
        }
        if (ctx.tk_colon() != null) {
            trad = trad.substring(0, trad.length() - 1);
            if (trad.charAt(0) == '\"') {
                trad = ":\"";
            } else {
                trad = ":\"";
            }
        }
        trad += ", [" + ((Object[]) visit(ctx.direction()))[0] + "]])";
        Object[] object = new Object[2];
        object[0] = trad;
        object[1] = StructFileGrammarLexer.TK_TREE;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override
    public Object[] visitDirection1(StructFileGrammarParser.Direction1Context ctx) {
        // id_dir direction
        String trad = "Tree([";
        if (ctx.id_dir().getText().charAt(1) != '\"' && ctx.id_dir().getText().charAt(1) != '\'') {
            trad += "\"" + ctx.id_dir().getText().substring(1) + "\"";
        } else {
            trad += ctx.id_dir().getText().substring(1);
        }
        trad += ", [" + ((Object[]) visit(ctx.direction()))[0] + "]])";
        Object[] object = new Object[2];
        object[0] = trad;
        object[1] = StructFileGrammarLexer.TK_TREE;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override
    public Object[] visitDirection2(StructFileGrammarParser.Direction2Context ctx) {
        if (ctx.file_or_division() != null) {
            return (Object[]) visit(ctx.file_or_division());
        }
        Object[] object = new Object[2];
        object[0] = "";
        object[1] = 0;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override
    public Object[] visitFile_or_division1(StructFileGrammarParser.File_or_division1Context ctx) {
        return (Object[]) visit(ctx.file_val());
    }

    // Devuelve la traducción y el tipo del valor
    @Override
    public Object[] visitFile_or_division2(StructFileGrammarParser.File_or_division2Context ctx) {
        return (Object[]) visit(ctx.division());
    }

    // Devuelve la traducción y el tipo del valor
    @Override
    public Object[] visitDivision(StructFileGrammarParser.DivisionContext ctx) {
        Object[] object = new Object[2];
        object[0] = "" + ((Object[]) visit(ctx.direction()))[0] + ((Object[]) visit(ctx.add_directions()))[0] + "";
        object[1] = StructFileGrammarLexer.TK_TREE;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitAdd_directions(StructFileGrammarParser.Add_directionsContext ctx) {
        if (ctx.direction() != null) {
            Object[] object = new Object[2];
            Object[] direction = (Object[]) visit(ctx.direction());
            Object[] add_directions = (Object[]) visit(ctx.add_directions());
            object[0] = ", " + direction[0] + add_directions[0];
            object[1] = direction[1];
            return object;
        }
        Object[] object = new Object[2];
        object[0] = "";
        object[1] = 0;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitGroup_val(StructFileGrammarParser.Group_valContext ctx) {
        Object[] object = new Object[2];
        if(ctx.set_group() != null){
            Object[] set_group = ((Object[]) visit(ctx.set_group()));
            switch ((Integer) set_group[1]) {
                case -StructFileGrammarLexer.TK_NUMBER:
                    object[0] = "Group([" + set_group[0] + "], Number)";
                    object[1] = -StructFileGrammarLexer.TK_NUMBER;
                    break;
                case -StructFileGrammarLexer.TK_BOOLEAN:
                    object[0] = "Group([" + set_group[0] + "], Boolean)";
                    object[1] = -StructFileGrammarLexer.TK_BOOLEAN;
                    break;
                case -StructFileGrammarLexer.TK_TEXT:
                    object[0] = "Group([" + set_group[0] + "], Text)";
                    object[1] = -StructFileGrammarLexer.TK_TEXT;
                    break;
                case -StructFileGrammarLexer.TK_FILE:
                    object[0] = "Group([" + set_group[0] + "], File)";
                    object[1] = -StructFileGrammarLexer.TK_FILE;
                    break;
                case -StructFileGrammarLexer.TK_LIST:
                    object[0] = "Group([" + set_group[0] + "], List)";
                    object[1] = -StructFileGrammarLexer.TK_LIST;
                    break;
                case -StructFileGrammarLexer.TK_TREE:
                    object[0] = "Group([" + set_group[0] + "], Tree)";
                    object[1] = -StructFileGrammarLexer.TK_TREE;
                    break;
            }
            object[1] = set_group[1];
        } else {
            object[0] = "Group(None, None)";
            object[1] = StructFileGrammarLexer.TK_GROUP;
        }

        return object;
    }

    @Override public Object[] visitSet_group(StructFileGrammarParser.Set_groupContext ctx) {
        Object[] object = new Object[2];
        Object[] expression = ((Object[]) visit(ctx.expression(0)));
        object[0] = "[" + expression[0] + ", " + ((Object[]) visit(ctx.expression(1)))[0] + "]" + ((Object[]) visit(ctx.add_group_vals()))[0];
        object[1] = -(Integer) expression[1];
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitAdd_group_vals(StructFileGrammarParser.Add_group_valsContext ctx) {
        if (ctx.expression(0) != null) {
            Object[] object = new Object[2];
            object[0] = ", [" + ((Object[]) visit(ctx.expression(0)))[0] + ", " + ((Object[]) visit(ctx.expression(1)))[0] + "]";
            object[1] = StructFileGrammarLexer.TK_GROUP;
            return object;
        }
        Object[] object = new Object[2];
        object[0] = "";
        object[1] = 0;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitList_val(StructFileGrammarParser.List_valContext ctx) {
        Object[] object = new Object[2];
        object[0] = "List([" + ((Object[]) visit(ctx.expression()))[0] + ((Object[]) visit(ctx.add_expressions()))[0] + "])";
        object[1] = StructFileGrammarLexer.TK_LIST;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitAdd_expressions(StructFileGrammarParser.Add_expressionsContext ctx) {
        if (ctx.expression() != null) {
            Object[] object = new Object[2];
            object[0] = ", " + ((Object[]) visit(ctx.expression()))[0] + ((Object[]) visit(ctx.add_expressions()))[0];
            object[1] = StructFileGrammarLexer.TK_LIST;
            return object;
        }
        Object[] object = new Object[2];
        object[0] = "";
        object[1] = 0;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitValue1(StructFileGrammarParser.Value1Context ctx) {
        return (Object[]) visit(ctx.number_val());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitValue2(StructFileGrammarParser.Value2Context ctx) {
        return (Object[]) visit(ctx.boolean_val());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitValue3(StructFileGrammarParser.Value3Context ctx) {
        return (Object[]) visit(ctx.text_val());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitValue4(StructFileGrammarParser.Value4Context ctx) {
        return (Object[]) visit(ctx.file_val());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitValue5(StructFileGrammarParser.Value5Context ctx) {
        return (Object[]) visit(ctx.tree_val());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitValue6(StructFileGrammarParser.Value6Context ctx) {
        return (Object[]) visit(ctx.group_val());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitValue7(StructFileGrammarParser.Value7Context ctx) {
        return (Object[]) visit(ctx.list_val());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitValue8(StructFileGrammarParser.Value8Context ctx) {
        return (Object[]) visit(ctx.id_variable());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitValue9(StructFileGrammarParser.Value9Context ctx) {
        return (Object[]) visit(ctx.functionCall());
    }

    // Devuelve la traducción (0), el tipo de dato (1), el tipo de cada parametro (2), el id del metodo (3) y el tipo de llamado (4) ($ o $$ o .)
    @Override public Object[] visitValue_extras(StructFileGrammarParser.Value_extrasContext ctx) {
        return ((Object[]) visit(ctx.method_reference()));
    }

    // Devuelve el tipo de dato ,la traducción, el tipo de cada parametro, el id del metodo y el tipo de llamado ($ o $$ o .)
    @Override public Object[] visitMethod_reference(StructFileGrammarParser.Method_referenceContext ctx) {
        Object[] default_call = ((Object[]) visit(ctx.default_call()));
        Object[] object;
        if (ctx.separator().getText().equals("$")) {
            object = new Object[] {default_call[0], default_call[1], default_call[2], default_call[3], 1};
        } else {
            object = new Object[] {default_call[0], default_call[1], default_call[2], default_call[3], 2};
        }
        return object;
    }

    // Devuelve el tipo de dato ,la traducción, el tipo de cada parametro y el id del metodo
    @Override public Object[] visitDefault_call(StructFileGrammarParser.Default_callContext ctx) {
        Object[] object = new Object[4];
        Object[] call_default_parameters = ((Object[]) visit(ctx.call_default_parameters()));
        object[1] = 0;
        if (call_default_parameters[0].equals("")) {
            object[0] = "(" + call_default_parameters[0] + ")";
        } else {
            object[0] = "(" + call_default_parameters[0] + ",)";
        }
        object[2] = call_default_parameters[2];
        object[3] = ctx.id_function2().getText();
        return object;
    }

    // Devuelve el tipo de dato ,la traducción, y el tipo de cada parametro
    @Override public Object[] visitCall_default_parameters(StructFileGrammarParser.Call_default_parametersContext ctx) {
        Object[] object = new Object[3];
        if (ctx.add_default_expression() == null){
            object[1] = 0;
            object[0] = "";
            object[2] = new ArrayList<Integer>();
        } else {
            Object[] add_default_expression = ((Object[]) visit(ctx.add_default_expression()));
            Object[] expression = ((Object[]) visit(ctx.expression()));
            object[1] = expression[1];
            object[0] = expression[0] + "" + add_default_expression[0];
            object[2] = add_default_expression[2];
            ((ArrayList<Integer>) object[2]).add(0, (Integer) expression[1]);
        }
        return object;
    }

    // Devuelve el tipo de dato ,la traducción, y el tipo de cada parametro
    @Override public Object[] visitAdd_default_expression(StructFileGrammarParser.Add_default_expressionContext ctx) {
        Object[] object = new Object[3];
        if (ctx.add_default_expression() == null){
            object[1] = 0;
            object[0] = "";
            object[2] = new ArrayList<Integer>();
        } else {
            Object[] expression = ((Object[]) visit(ctx.expression()));
            Object[] add_default_expression = ((Object[]) visit(ctx.add_default_expression()));
            object[1] = expression[1];
            object[0] = expression[0] + ", " + add_default_expression[0];
            object[2] = add_default_expression[2];
            ((ArrayList<Integer>) object[2]).add(0, (Integer) expression[1]);
        }
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitId_variable(StructFileGrammarParser.Id_variableContext ctx) {
        Object[] variable = getLastVariable(ctx.ID().getText());
        if (variable == null) {
            semmanticError("Error semántico: La variable '" + ctx.ID().getText() + "' no está definida, en la posición <"+ ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine() + ">");
        }
        Object[] object = new Object[2];
        object[0] = "_" + ctx.ID().getText();
        object[1] = variable[1];
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitFunctionCall(StructFileGrammarParser.FunctionCallContext ctx) {
        Object[] function = getLastFuncion(ctx.id_function().getText());
        if (function == null) {
            semmanticError("Error semántico: La función '" + ctx.id_function().getText() + "' no ha sido definida, en la posición <"+ ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + ">");
        }
        Object[] object = new Object[2];
        object[0] = "_" + ctx.id_function().getText() + "(" + ((Object[]) visit(ctx.call_parameters()))[0] + ")";
        object[1] = function[1];
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitCall_parameters(StructFileGrammarParser.Call_parametersContext ctx) {
        ArrayList<Integer> types = (ArrayList<Integer>) getLastFuncion(ctx.id_function_)[3];
        Object[] object = new Object[2];
        if (ctx.expression() == null) {
            if (!types.isEmpty()) {
                semmanticError("Error semántico: En la función '" + ctx.id_function_ + "' se esperaban '" + types.size() + "' paramatros y se encontraron '" + 0 + "' parametros, en la posición <"+ ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + ">");
            }
            object[0] = "";
            object[1] = 0;
        } else {
            Object[] expression = (Object[]) visit(ctx.expression());
            int expected = types.get(0);
            int found = (int) expression[1];
            if (found != expected) {
                semmanticError("Error semántico: En el parametro '" + 1 + "' de La función '" + ctx.id_function_ + "' se encontró un " + literalName(found) + " y se esperaba un " + literalName(expected) + ", en la posición <"+ ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + ">");
            }
            object[0] = expression[0] + "" + ((Object[]) visit(ctx.add_expression()))[0];
            object[1] = expression[1];
        }
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitAdd_expression(StructFileGrammarParser.Add_expressionContext ctx) {
        ArrayList<Integer> types =(ArrayList<Integer>) getLastFuncion(ctx.id_function_)[3];
        Object[] object = new Object[2];
        if (ctx.expression() == null) {
            if (types.size() != ctx.cont) {
                semmanticError("Error semántico: En la función '" + ctx.id_function_ + "' se esperaban '" + types.size() + "' paramatros y se encontraron '" + (ctx.cont) + "' parametros, en la posición <"+ ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + ">");
            }
            object[0] = "";
            object[1] = 0;
        } else {
            if (types.size() == ctx.cont) {
                semmanticError("Error semántico: En la función '" + ctx.id_function_ + "' se esperaban '" + types.size() + "' paramatros y se encontraron mas parametros, en la posición <"+ ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + ">");
            }
            Object[] expression = (Object[]) visit(ctx.expression());
            int expected = types.get(ctx.cont);
            int found = (int) expression[1];
            if (found != expected) {
                semmanticError("Error semántico: En el parametro '" + (ctx.cont + 1) + "' de La función '" + ctx.id_function_ + "' se encontró un " + literalName(found) + " y se esperaba un " + literalName(expected) + ", en la posición <" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + ">");
            }
            object[0] = ", " + expression[0] + "" + ((Object[]) visit(ctx.add_expression()))[0];
            object[1] = expression[1];
        }
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitExpression1(StructFileGrammarParser.Expression1Context ctx) {
        Object[] object = new Object[2];
        Object[] expression = ((Object[]) visit(ctx.expression()));
        object[0] = "(" + expression[0] + ")";
        object[1] = expression[1];
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitExpression2(StructFileGrammarParser.Expression2Context ctx) {
        Object[] object = new Object[2];
        object[0] = "(" + ((Object[]) visit(ctx.expression(0)))[0] + " and " + ((Object[]) visit(ctx.expression(1)))[0] + ")";
        object[1] = StructFileGrammarLexer.TK_BOOLEAN;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitExpression3(StructFileGrammarParser.Expression3Context ctx) {
        Object[] object = new Object[2];
        object[0] = "(" + ((Object[]) visit(ctx.expression(0)))[0] + " or " + ((Object[]) visit(ctx.expression(1)))[0] + ")";
        object[1] = StructFileGrammarLexer.TK_BOOLEAN;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitExpression4(StructFileGrammarParser.Expression4Context ctx) {
        Object[] object = new Object[2];
        object[0] = "not (" + ((Object[]) visit(ctx.expression()))[0] + ")";
        object[1] = StructFileGrammarLexer.TK_BOOLEAN;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitExpression5(StructFileGrammarParser.Expression5Context ctx) {
        Object[] object = new Object[2];
        object[0] = "(" + ((Object[]) visit(ctx.expression(0)))[0] + " " +  ((Object[]) visit(ctx.tk_comparator()))[0] + " " + ((Object[]) visit(ctx.expression(1)))[0] + ")";
        object[1] = StructFileGrammarLexer.TK_BOOLEAN;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitExpression6(StructFileGrammarParser.Expression6Context ctx) {
        Object[] object = new Object[2];
        Object[] operator = ((Object[]) visit(ctx.tk_operator()));
        Object[] exp1 = ((Object[]) visit(ctx.expression(0)));
        Object[] exp2 = ((Object[]) visit(ctx.expression(1)));
        object[0] = "(" + exp1[0] + " " +  operator[0] + " " + exp2[0] + ")";
        switch ((int) exp1[1]) {
            case StructFileGrammarLexer.TK_NUMBER:
                switch ((int) operator[1]) {
                    case StructFileGrammarLexer.TK_SUM:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                object[1] = StructFileGrammarLexer.TK_TEXT;
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_HIPHEN:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_MULT:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                object[1] = StructFileGrammarLexer.TK_TEXT;
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_DIVR:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_DIVI:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_MOD:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                    case StructFileGrammarLexer.TK_EXP:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                }
                break;
            case StructFileGrammarLexer.TK_BOOLEAN:
                switch ((int) operator[1]) {
                    case StructFileGrammarLexer.TK_SUM:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                object[1] = StructFileGrammarLexer.TK_TEXT;
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_HIPHEN:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_MULT:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                object[1] = StructFileGrammarLexer.TK_TEXT;
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_DIVR:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_DIVI:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_MOD:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                    case StructFileGrammarLexer.TK_EXP:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_NUMBER;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                }
                break;
            case StructFileGrammarLexer.TK_TEXT:
                switch ((int) operator[1]) {
                    case StructFileGrammarLexer.TK_SUM:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_TEXT;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_TEXT;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                object[1] = StructFileGrammarLexer.TK_TEXT;
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_HIPHEN:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_TEXT;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_TEXT;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                object[1] = StructFileGrammarLexer.TK_TEXT;
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                object[1] = StructFileGrammarLexer.TK_TEXT;
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                object[1] = StructFileGrammarLexer.TK_TEXT;
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_MULT:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_TEXT;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_TEXT;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_DIVR:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_DIVI:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_MOD:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                    case StructFileGrammarLexer.TK_EXP:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                }
                break;
            case StructFileGrammarLexer.TK_FILE:
                switch ((int) operator[1]) {
                    case StructFileGrammarLexer.TK_SUM:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_HIPHEN:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_MULT:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_FILE;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_DIVR:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_DIVI:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                object[1] = StructFileGrammarLexer.TK_GROUP;
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_MOD:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                    case StructFileGrammarLexer.TK_EXP:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                }
                break;
            case StructFileGrammarLexer.TK_TREE:
                switch ((int) operator[1]) {
                    case StructFileGrammarLexer.TK_SUM:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_HIPHEN:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_MULT:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_DIVR:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_DIVI:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_MOD:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_EXP:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                }
                break;
            case StructFileGrammarLexer.TK_GROUP:
                switch ((int) operator[1]) {
                    case StructFileGrammarLexer.TK_SUM:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_HIPHEN:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_MULT:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_DIVR:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_DIVI:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_MOD:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_EXP:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                }
                break;
            case StructFileGrammarLexer.TK_LIST:
                switch ((int) operator[1]) {
                    case StructFileGrammarLexer.TK_SUM:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_HIPHEN:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_MULT:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                object[1] = StructFileGrammarLexer.TK_LIST;
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_DIVR:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_DIVI:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_MOD:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                        }
                        break;
                    case StructFileGrammarLexer.TK_EXP:
                        switch ((int) exp2[1]) {
                            case StructFileGrammarLexer.TK_NUMBER:
                                break;
                            case StructFileGrammarLexer.TK_BOOLEAN:
                                break;
                            case StructFileGrammarLexer.TK_TEXT:
                                break;
                            case StructFileGrammarLexer.TK_FILE:
                                break;
                            case StructFileGrammarLexer.TK_TREE:
                                break;
                            case StructFileGrammarLexer.TK_GROUP:
                                break;
                            case StructFileGrammarLexer.TK_LIST:
                                break;
                        }
                        break;
                }
                break;
        }
        if (object[1] == null) {
            semmanticError("Error semántico: La operación " + literalName((Integer) operator[1]) + " entre " + literalName((Integer) exp1[1]) + " y " + literalName((Integer) exp2[1]) + " no está soportada, en la posición <"+ ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + ">");
        }
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitExpression7(StructFileGrammarParser.Expression7Context ctx) {
        return (Object[]) visit(ctx.value());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitExpression8(StructFileGrammarParser.Expression8Context ctx) {
        {
            Object[] object = new Object[2];
            Object[] valuePart = ((Object[]) visit(ctx.expression()));
            Object[] value_extras = ((Object[]) visit(ctx.value_extras()));
            if (value_extras[0].equals("")) {
                object = valuePart;
            } else {

                // Obtener metodos del valor actual
                Object[][] methods = null;
                Object[][] groupmethods = null;
                switch ((int) valuePart[1]) {
                    case StructFileGrammarLexer.TK_NUMBER:
                        methods = numMethods;
                        break;
                    case StructFileGrammarLexer.TK_BOOLEAN:
                        methods = bolMethods;
                        break;
                    case StructFileGrammarLexer.TK_TEXT:
                        methods = texMethods;
                        break;
                    case StructFileGrammarLexer.TK_FILE:
                        methods = filMethods;
                        break;
                    case StructFileGrammarLexer.TK_TREE:
                        methods = treMethods;
                        break;
                    case StructFileGrammarLexer.TK_LIST:
                        methods = lisMethods;
                        break;
                    case -StructFileGrammarLexer.TK_NUMBER:
                        groupmethods = numMethods;
                        methods = groMethods;
                        break;
                    case -StructFileGrammarLexer.TK_BOOLEAN:
                        groupmethods = bolMethods;
                        methods = groMethods;
                        break;
                    case -StructFileGrammarLexer.TK_TEXT:
                        groupmethods = texMethods;
                        methods = groMethods;
                        break;
                    case -StructFileGrammarLexer.TK_FILE:
                        groupmethods = filMethods;
                        methods = groMethods;
                        break;
                    case -StructFileGrammarLexer.TK_TREE:
                        groupmethods = treMethods;
                        methods = groMethods;
                        break;
                    case -StructFileGrammarLexer.TK_LIST:
                        groupmethods = lisMethods;
                        methods = groMethods;
                        break;
                }

                // Si es un llamado a un metodo ordinario
                if ((int) value_extras[4] == 1) {

                    // Verificar si el metodo existe
                    boolean exist = false;
                    Object[] existMethod = null;
                    for (Object[] method: methods) {
                        // Si se encuentra el nombre
                        if (value_extras[3].equals(method[0])) {
                            // Si coinciden el numero de parametros
                            if (((ArrayList<Integer>) value_extras[2]).size() == method.length - 3) {
                                exist = true;
                                // Si no coinciden los tipos de los parametros
                                for (int i = 0; i < method.length - 3; i++) {
                                    if (((ArrayList<Integer>) value_extras[2]).get(i) != (int) method[i] - 3) {
                                        exist = false;
                                        break;
                                    }
                                }
                                if (exist) {
                                    existMethod = method;
                                    break;
                                }
                            }


                        }
                    }

                    // Si el metodo no exisite
                    if (!exist){
                        semmanticError("Error semántico: El método '" + value_extras[3] + "(...)' no ha sido definido, en la posición <"+ ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + ">");
                    } else {
                        object[0] = valuePart[0] + "." + existMethod[1] + value_extras[0];
                        object[1] = existMethod[2];
                    }

                } else {

                    // Verificar si el metodo existe
                    boolean exist = false;
                    Object[] existMethod = null;
                    for (Object[] method: groupmethods) {
                        // Si se encuentra el nombre
                        if (value_extras[3].equals(method[0])) {
                            // Si coinciden el numero de parametros
                            if (((ArrayList<Integer>) value_extras[2]).size() == method.length - 3) {
                                exist = true;
                                // Si no coinciden los tipos de los parametros
                                for (int i = 0; i < method.length - 3; i++) {
                                    if (((ArrayList<Integer>) value_extras[2]).get(i) != (int) method[i] - 3) {
                                        exist = false;
                                        break;
                                    }
                                }
                                if (exist) {
                                    existMethod = method;
                                    break;
                                }
                            }


                        }
                    }

                    // Si el metodo no exisite
                    if (!exist){
                        semmanticError("Error semántico: El método '" + value_extras[3] + "(...)' no ha sido definido, en la posición <"+ ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + ">");
                    } else {
                        object[0] = valuePart[0] + ".execRoot(\"" + existMethod[1] + "\", " + value_extras[0] + ")";
                        object[1] = -(Integer) existMethod[2];
                    }

                }

            }

            return object;
        }
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_comparator1(StructFileGrammarParser.Tk_comparator1Context ctx) {
        return (Object[]) visit(ctx.tk_great_than());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_comparator2(StructFileGrammarParser.Tk_comparator2Context ctx) {
        return (Object[]) visit(ctx.tk_great_equal_than());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_comparator3(StructFileGrammarParser.Tk_comparator3Context ctx) {
        return (Object[]) visit(ctx.tk_less_than());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_comparator4(StructFileGrammarParser.Tk_comparator4Context ctx) {
        return (Object[]) visit(ctx.tk_less_equal_than());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_comparator5(StructFileGrammarParser.Tk_comparator5Context ctx) {
        return (Object[]) visit(ctx.tk_equal());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_comparator6(StructFileGrammarParser.Tk_comparator6Context ctx) {
        return (Object[]) visit(ctx.tk_not_equal());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_great_than(StructFileGrammarParser.Tk_great_thanContext ctx) {
        Object[] object = new Object[2];
        object[0] = ">";
        object[1] = StructFileGrammarLexer.TK_GREAT_THAN;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_great_equal_than(StructFileGrammarParser.Tk_great_equal_thanContext ctx) {
        Object[] object = new Object[2];
        object[0] = ">=";
        object[1] = StructFileGrammarLexer.TK_GREAT_EQUAL_THAN;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_less_than(StructFileGrammarParser.Tk_less_thanContext ctx) {
        Object[] object = new Object[2];
        object[0] = "<";
        object[1] = StructFileGrammarLexer.TK_LESS_THAN;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_less_equal_than(StructFileGrammarParser.Tk_less_equal_thanContext ctx) {
        Object[] object = new Object[2];
        object[0] = "<=";
        object[1] = StructFileGrammarLexer.TK_LESS_EQUAL_THAN;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_equal(StructFileGrammarParser.Tk_equalContext ctx) {
        Object[] object = new Object[2];
        object[0] = "==";
        object[1] = StructFileGrammarLexer.TK_EQUAL;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_not_equal(StructFileGrammarParser.Tk_not_equalContext ctx) {
        Object[] object = new Object[2];
        object[0] = "!=";
        object[1] = StructFileGrammarLexer.TK_NOT_EQUAL;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_operator1(StructFileGrammarParser.Tk_operator1Context ctx) {
        return (Object[]) visit(ctx.tk_sum());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_operator2(StructFileGrammarParser.Tk_operator2Context ctx) {
        return (Object[]) visit(ctx.tk_minus());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_operator3(StructFileGrammarParser.Tk_operator3Context ctx) {
        return (Object[]) visit(ctx.tk_mult());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_operator4(StructFileGrammarParser.Tk_operator4Context ctx) {
        return (Object[]) visit(ctx.tk_divr());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_operator5(StructFileGrammarParser.Tk_operator5Context ctx) {
        return (Object[]) visit(ctx.tk_divi());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_operator6(StructFileGrammarParser.Tk_operator6Context ctx) {
        return (Object[]) visit(ctx.tk_mod());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_operator7(StructFileGrammarParser.Tk_operator7Context ctx) {
        return (Object[]) visit(ctx.tk_exp());
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_sum(StructFileGrammarParser.Tk_sumContext ctx) {
        Object[] object = new Object[2];
        object[0] = "+";
        object[1] = StructFileGrammarLexer.TK_SUM;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_minus(StructFileGrammarParser.Tk_minusContext ctx) {
        Object[] object = new Object[2];
        object[0] = "-";
        object[1] = StructFileGrammarLexer.TK_HIPHEN;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_mult(StructFileGrammarParser.Tk_multContext ctx) {
        Object[] object = new Object[2];
        object[0] = "*";
        object[1] = StructFileGrammarLexer.TK_MULT;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_divr(StructFileGrammarParser.Tk_divrContext ctx) {
        Object[] object = new Object[2];
        object[0] = "/";
        object[1] = StructFileGrammarLexer.TK_DIVR;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_divi(StructFileGrammarParser.Tk_diviContext ctx) {
        Object[] object = new Object[2];
        object[0] = "//";
        object[1] = StructFileGrammarLexer.TK_DIVI;
        return object;
    }

    // Devuelve la traducción y el tipo del valor
    @Override public Object[] visitTk_mod(StructFileGrammarParser.Tk_modContext ctx) {
        Object[] object = new Object[2];
        object[0] = "%";
        object[1] = StructFileGrammarLexer.TK_MOD;
        return object;
    }

    // Devuelve la traducción y el tipo del tk_semicolon
    @Override public Object[] visitTk_exp(StructFileGrammarParser.Tk_expContext ctx) {
        Object[] object = new Object[2];
        object[0] = "**";
        object[1] = StructFileGrammarLexer.TK_EXP;
        return object;
    }

    // Devuelve la traducción y el tipo de valor
    @Override public Object[] visitVariableDef1(StructFileGrammarParser.VariableDef1Context ctx) {
        if (ctx.type().start.getType() == StructFileGrammarLexer.TK_GROUP) {
            variables.add(new Object[] {ctx.id_variable().getText(), -ctx.type().stop.getType()});
        } else {
            variables.add(new Object[] {ctx.id_variable().getText(), ctx.type().start.getType()});
        }
        contVar();
        Object[] object = new Object[2];
        switch (ctx.type().start.getType()) {
            case StructFileGrammarLexer.TK_NUMBER:
                object[0] = ((Object[]) visit(ctx.id_variable()))[0] + " = Number(None)";
                object[1] = StructFileGrammarLexer.TK_NUMBER;
                break;
            case StructFileGrammarLexer.TK_BOOLEAN:
                object[0] = ((Object[]) visit(ctx.id_variable()))[0] + " = Boolean(None)";
                object[1] = StructFileGrammarLexer.TK_BOOLEAN;
                break;
            case StructFileGrammarLexer.TK_TEXT:
                object[0] = ((Object[]) visit(ctx.id_variable()))[0] + " = Text(None)";
                object[1] = StructFileGrammarLexer.TK_TEXT;
                break;
            case StructFileGrammarLexer.TK_FILE:
                object[0] = ((Object[]) visit(ctx.id_variable()))[0] + " = File(None)";
                object[1] = StructFileGrammarLexer.TK_FILE;
                break;
            case StructFileGrammarLexer.TK_LIST:
                object[0] = ((Object[]) visit(ctx.id_variable()))[0] + " = List(None)";
                object[1] = StructFileGrammarLexer.TK_LIST;
                break;
            case StructFileGrammarLexer.TK_GROUP:
                switch (ctx.type().stop.getType()) {
                    case StructFileGrammarLexer.TK_NUMBER:
                        object[0] = ((Object[]) visit(ctx.id_variable()))[0] + " = Group(None, Number)";
                        object[1] = -StructFileGrammarLexer.TK_NUMBER;
                        break;
                    case StructFileGrammarLexer.TK_BOOLEAN:
                        object[0] = ((Object[]) visit(ctx.id_variable()))[0] + " = Group(None, Boolean)";
                        object[1] = -StructFileGrammarLexer.TK_BOOLEAN;
                        break;
                    case StructFileGrammarLexer.TK_TEXT:
                        object[0] = ((Object[]) visit(ctx.id_variable()))[0] + " = Group(None, Text)";
                        object[1] = -StructFileGrammarLexer.TK_TEXT;
                        break;
                    case StructFileGrammarLexer.TK_FILE:
                        object[0] = ((Object[]) visit(ctx.id_variable()))[0] + " = Group(None, File)";
                        object[1] = -StructFileGrammarLexer.TK_FILE;
                        break;
                    case StructFileGrammarLexer.TK_LIST:
                        object[0] = ((Object[]) visit(ctx.id_variable()))[0] + " = Group(None, List)";
                        object[1] = -StructFileGrammarLexer.TK_LIST;
                        break;
                    case StructFileGrammarLexer.TK_TREE:
                        object[0] = ((Object[]) visit(ctx.id_variable()))[0] + " = Group(None, Tree)";
                        object[1] = -StructFileGrammarLexer.TK_TREE;
                        break;
                }
                break;
            case StructFileGrammarLexer.TK_TREE:
                object[0] = ((Object[]) visit(ctx.id_variable()))[0] + " = Tree(None)";
                object[1] = StructFileGrammarLexer.TK_TREE;
                break;
        }
        return object;
    }

    // Devuelve la traducción y el tipo de valor
    @Override public Object[] visitVariableDef2(StructFileGrammarParser.VariableDef2Context ctx) {
        Object[] expression = (Object[]) visit(ctx.variableAsign().expression());
        if (ctx.type().start.getType() == StructFileGrammarLexer.TK_GROUP) {
            variables.add(new Object[] {ctx.variableAsign().id_variable().getText(), -ctx.type().stop.getType()});
        } else {
            variables.add(new Object[] {ctx.variableAsign().id_variable().getText(), ctx.type().start.getType()});
        }
        contVar();
        Object[] variable = getLastVariable(ctx.variableAsign().id_variable().getText());
        if (variable == null) {
            semmanticError("Error semántico: La variable '" + ctx.variableAsign().id_variable().getText() + "' no está definida, en la posición <"+ ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + ">");
        }
        Integer found = (int) expression[1];
        if (!found.equals(variable[1])) {
            semmanticError("Error semántico: En la asignación de la variable '" + ctx.variableAsign().id_variable().getText() + "' se encontró un " + literalName(found) + " y se esperaba un " + literalName((Integer) variable[1]) + ", en la posición <"+ ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + ">");
        }
        Object[] object = new Object[2];
        object[0] = ((Object[]) visit(ctx.variableAsign().id_variable()))[0] + " = " + expression[0];
        object[1] = found;
        return object;
    }

    // Devuelve la traducción y el tipo de valor
    @Override public Object[] visitVariableAsign(StructFileGrammarParser.VariableAsignContext ctx) {
        Object[] variable = getLastVariable(ctx.id_variable().getText());
        if (variable == null) {
            semmanticError("Error semántico: La variable '" + ctx.id_variable().getText() + "' no está definida, en la posición <"+ ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + ">");
        }
        Integer found = (int) ((Object[]) visit(ctx.expression()))[1];
        if (!found.equals(variable[1])) {
            semmanticError("Error semántico: En la asignación de la variable '" + ctx.id_variable().getText() + "' se encontró un " + literalName(found) + " y se esperaba un " + literalName((Integer) variable[1]) + ", en la posición <"+ ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + ">");
        }
        Object[] object = new Object[2];
        object[0] = ((Object[]) visit(ctx.id_variable()))[0] + " = " + ((Object[]) visit(ctx.expression()))[0];
        object[1] = found;
        return object;
    }

    @Override public Object[] visitFunctionDef(StructFileGrammarParser.FunctionDefContext ctx) {
        int type = (int) ((Object[]) visit(ctx.return_()))[1];
        functions.add(new Object[] {ctx.id_function().getText(), type, new ArrayList<String>(), new ArrayList<Integer>()});
        contFunct();
        Object[] object = new Object[2];
        object[0] = "def " + ((Object[]) visit(ctx.id_function()))[0];
        addLevel();
        object[0] += "(" + ((Object[]) visit(ctx.parameters()))[0] + "): \n";
        String nonlocals = "";
        for (int i = 0; i < variables.size(); i++) {
            if (!((ArrayList<String>)(functions.get(functions.size()-1)[2])).contains(variables.get(i)[0])) {
                nonlocals += "_" + variables.get(i)[0] + ", ";
            }
        }
        if (!nonlocals.equals("")) {
            object[0] += ind() + "nonlocal " + nonlocals.substring(0, nonlocals.length() - 2) + "\n";
        }
        object[0] += "" + ((Object[]) visit(ctx.functionContent()))[0];
        object[0] = object[0].toString().substring(0, object[0].toString().length() - 1);
        removeLevel();
        object[1] = type;
        return object;
    }

    @Override public Object[] visitReturn_(StructFileGrammarParser.Return_Context ctx) {
        return new Object[] {"", ctx.type().start.getType()};
    }

    @Override public Object[] visitId_function(StructFileGrammarParser.Id_functionContext ctx) {
        Object[] function = getLastFuncion(ctx.ID().getText());
        if (function == null) {
            semmanticError("Error semántico: La función '" + ctx.ID().getText() + "' no está definida, en la posición <" + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine() + ">");
        }
        Object[] object = new Object[2];
        object[0] = "_" + ctx.ID().getText();
        object[1] = function[1];
        return object;
    }

    @Override public Object[] visitParameters(StructFileGrammarParser.ParametersContext ctx) {
        Object[] function = getLastFuncion(ctx.id_function_);
        Object[] object = new Object[2];
        if (ctx.variableDef() == null) {
            object[0] = "";
            object[1] = function[1];
        } else {
            String id = ctx.variableDef().getChild(1).getChild(0).getText();
            if (((ArrayList<String>)function[2]).contains(id)) {
                semmanticError("Error semántico: El parametro '" + id + "' ya está definido, en la posición <" + ctx.variableDef().start.getLine() + ":" + ctx.variableDef().start.getCharPositionInLine() + ">");
            }
            ((ArrayList<String>)function[2]).add(id);
            ((ArrayList<Integer>)function[3]).add(ctx.variableDef().start.getType());
            object[0] = ((Object[]) visit(ctx.variableDef()))[0] + "" + ((Object[]) visit(ctx.add_variableDef()))[0];
            object[1] = function[1];
        }
        return object;
    }

    @Override public Object[] visitAdd_variableDef(StructFileGrammarParser.Add_variableDefContext ctx) {
        Object[] function = getLastFuncion(ctx.id_function_);
        Object[] object = new Object[2];
        if (ctx.variableDef() == null) {
            object[0] = "";
            object[1] = 0;
        } else {
            String id = ctx.variableDef().getChild(1).getChild(0).getText();
            if (((ArrayList<String>)function[2]).contains(id)) {
                semmanticError("Error semántico: El parametro '" + id + "' ya está definido, en la posición <" + ctx.variableDef().start.getLine() + ":" + ctx.variableDef().start.getCharPositionInLine() + ">");
            }
            ((ArrayList<String>)function[2]).add(id);
            ((ArrayList<Integer>)function[3]).add(ctx.variableDef().start.getType());
            object[0] = ", " + ((Object[]) visit(ctx.variableDef()))[0] + ((Object[]) visit(ctx.add_variableDef()))[0];
            object[1] = 0;
        }
        return object;
    }

    @Override public Object[] visitFunctionContent(StructFileGrammarParser.FunctionContentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.content() != null) {
            object[0] = ind() + ((Object[]) visit(ctx.content()))[0] + "\n" + ((Object[]) visit(ctx.add_functionContent()))[0];
            object[1] = 0;
        } else {
            object[0] = ind() + "pass\n";
            object[1] = 0;
        }
        return object;
    }

    @Override public Object[] visitAdd_functionContent(StructFileGrammarParser.Add_functionContentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.content() != null) {
            object[0] = ind() + ((Object[]) visit(ctx.content()))[0] + "\n" + ((Object[]) visit(ctx.add_functionContent()))[0];
            object[1] = 0;
        } else {
            object[0] = "";
            object[1] = 0;
        }
        return object;
    }

    @Override public Object[] visitStructures1(StructFileGrammarParser.Structures1Context ctx) {
        return (Object[]) visit(ctx.if_());
    }

    @Override public Object[] visitStructures2(StructFileGrammarParser.Structures2Context ctx) {
        return (Object[]) visit(ctx.switch_());
    }

    @Override public Object[] visitStructures3(StructFileGrammarParser.Structures3Context ctx) {
        return (Object[]) visit(ctx.while_());
    }

    @Override public Object[] visitStructures4(StructFileGrammarParser.Structures4Context ctx) {
        return (Object[]) visit(ctx.do_while());
    }

    @Override public Object[] visitStructures5(StructFileGrammarParser.Structures5Context ctx) {
        return (Object[]) visit(ctx.for_());
    }

    @Override public Object[] visitIf_(StructFileGrammarParser.If_Context ctx) {
        Object[] object = new Object[2];
        object[0] = "if " + ((Object[]) visit(ctx.expression()))[0] + ":\n";
        addLevel();
        object[0] += "" + ((Object[]) visit(ctx.ifContent()))[0];
        object[0] = object[0].toString().substring(0, object[0].toString().length() - 1);
        removeLevel();
        if (ctx.else_() != null) {
            object[0] += "" + ((Object[]) visit(ctx.else_()))[0];
        }
        object[1] = 0;
        return object;
    }

    @Override public Object[] visitIfContent(StructFileGrammarParser.IfContentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.content() != null) {
            object[0] = ind() + ((Object[]) visit(ctx.content()))[0] + "\n" + ((Object[]) visit(ctx.add_ifContent()))[0];
            object[1] = 0;
        } else {
            object[0] = ind() + "pass\n";
            object[1] = 0;
        }
        return object;
    }

    @Override public Object[] visitAdd_ifContent(StructFileGrammarParser.Add_ifContentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.content() != null) {
            object[0] = ind() + ((Object[]) visit(ctx.content()))[0] + "\n" + ((Object[]) visit(ctx.add_ifContent()))[0];
            object[1] = 0;
        } else {
            object[0] = "";
            object[1] = 0;
        }
        return object;
    }

    @Override public Object[] visitElse_1(StructFileGrammarParser.Else_1Context ctx) {
        Object[] object = new Object[2];
        object[0] = "\n" + ind() + "el" + ((Object[]) visit(ctx.if_()))[0];
        object[1] = 0;
        return object;
    }

    @Override public Object[] visitElse_2(StructFileGrammarParser.Else_2Context ctx) {
        Object[] object = new Object[2];
        object[0] = "\n" + ind() + "else:\n";
        addLevel();
        object[0] += "" + ((Object[]) visit(ctx.else_ifContent()))[0];
        object[0] = object[0].toString().substring(0, object[0].toString().length() - 1);
        removeLevel();
        object[1] = 0;
        return object;
    }

    @Override public Object[] visitElse_ifContent(StructFileGrammarParser.Else_ifContentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.content() != null) {
            object[0] = ind() + ((Object[]) visit(ctx.content()))[0] + "\n" + ((Object[]) visit(ctx.add_else_ifContent()))[0];
            object[1] = 0;
        } else {
            object[0] = ind() + "pass\n";
            object[1] = 0;
        }
        return object;
    }

    @Override public Object[] visitAdd_else_ifContent(StructFileGrammarParser.Add_else_ifContentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.content() != null) {
            object[0] = ind() + ((Object[]) visit(ctx.content()))[0] + "\n" + ((Object[]) visit(ctx.add_else_ifContent()))[0];
            object[1] = 0;
        } else {
            object[0] = "";
            object[1] = 0;
        }
        return object;
    }

    @Override public Object[] visitSwitch_(StructFileGrammarParser.Switch_Context ctx) {
        Object[] object = new Object[2];
        object[0] = ((Object[]) visit(ctx.caseContent()))[0] + "\n" + ind() + ((Object[]) visit(ctx.default_()))[0];
        object[1] = 0;
        return object;
    }

    @Override public Object[] visitCaseContent(StructFileGrammarParser.CaseContentContext ctx) {
        Object[] object = new Object[2];
        object[0] = "if " + ((Object[]) visit(ctx.expr))[0] + " == " + ((Object[]) visit(ctx.case_().expression()))[0] + ":\n";
        addLevel();
        object[0] += "" + ((Object[]) visit(ctx.case_().switchContent()))[0];
        object[0] = object[0].toString().substring(0, object[0].toString().length() - 1);
        removeLevel();
        if (ctx.add_caseContent() != null) {
            object[0] += "\n" + ind() + ((Object[]) visit(ctx.add_caseContent()))[0];
        }
        object[1] = 0;
        return object;
    }

    @Override public Object[] visitAdd_caseContent(StructFileGrammarParser.Add_caseContentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.add_caseContent() != null) {
            object[0] = "elif " + ((Object[]) visit(ctx.expr))[0] + " == " + ((Object[]) visit(ctx.case_().expression()))[0] + ":\n";
            addLevel();
            object[0] += "" + ((Object[]) visit(ctx.case_().switchContent()))[0];
            object[0] = object[0].toString().substring(0, object[0].toString().length() - 1);
            removeLevel();
        } else {
            object[0] = "";
        }
        object[1] = 0;
        return object;
    }

    @Override public Object[] visitDefault_(StructFileGrammarParser.Default_Context ctx) {
        Object[] object = new Object[2];
        object[0] = "else:\n";
        addLevel();
        object[0] += "" + ((Object[]) visit(ctx.switchContent()))[0];
        object[0] = object[0].toString().substring(0, object[0].toString().length() - 1);
        removeLevel();
        object[1] = 0;
        return object;
    }

    @Override public Object[] visitSwitchContent(StructFileGrammarParser.SwitchContentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.content() != null) {
            object[0] = ind() + ((Object[]) visit(ctx.content()))[0] + "\n" + ((Object[]) visit(ctx.add_switchContent()))[0];
            object[1] = 0;
        } else {
            object[0] = ind() + "pass\n";
            object[1] = 0;
        }
        return object;
    }

    @Override public Object[] visitAdd_switchContent(StructFileGrammarParser.Add_switchContentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.content() != null) {
            object[0] = ind() + ((Object[]) visit(ctx.content()))[0] + "\n" + ((Object[]) visit(ctx.add_switchContent()))[0];
            object[1] = 0;
        } else {
            object[0] = "";
            object[1] = 0;
        }
        return object;
    }

    @Override public Object[] visitWhile_(StructFileGrammarParser.While_Context ctx) {
        Object[] object = new Object[2];
        object[0] = "while " + ((Object[]) visit(ctx.expression()))[0] + ":\n";
        addLevel();
        object[0] += "" + ((Object[]) visit(ctx.whileContent()))[0];
        object[0] = object[0].toString().substring(0, object[0].toString().length() - 1);
        removeLevel();
        object[1] = 0;
        return object;
    }

    @Override public Object[] visitWhileContent(StructFileGrammarParser.WhileContentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.content() != null) {
            object[0] = ind() + ((Object[]) visit(ctx.content()))[0] + "\n" + ((Object[]) visit(ctx.add_whileContent()))[0];
            object[1] = 0;
        } else {
            object[0] = ind() + "pass\n";
            object[1] = 0;
        }
        return object;
    }

    @Override public Object[] visitAdd_whileContent(StructFileGrammarParser.Add_whileContentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.content() != null) {
            object[0] = ind() + ((Object[]) visit(ctx.content()))[0] + "\n" + ((Object[]) visit(ctx.add_whileContent()))[0];
            object[1] = 0;
        } else {
            object[0] = "";
            object[1] = 0;
        }
        return object;
    }

    @Override public Object[] visitDo_while(StructFileGrammarParser.Do_whileContext ctx) {
        Object[] object = new Object[2];
        object[0] = "while True:\n";
        addLevel();
        object[0] += "" + ((Object[]) visit(ctx.do_whileContent()))[0];
        object[0] += ind() + "if " + ((Object[]) visit(ctx.expression()))[0] + ": break";
        removeLevel();
        object[1] = 0;
        return object;
    }

    @Override public Object[] visitDo_whileContent(StructFileGrammarParser.Do_whileContentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.content() != null) {
            object[0] = ind() + ((Object[]) visit(ctx.content()))[0] + "\n" + ((Object[]) visit(ctx.add_do_whileContent()))[0];
            object[1] = 0;
        } else {
            object[0] = ind() + "pass\n";
            object[1] = 0;
        }
        return object;
    }

    @Override public Object[] visitAdd_do_whileContent(StructFileGrammarParser.Add_do_whileContentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.content() != null) {
            object[0] = ind() + ((Object[]) visit(ctx.content()))[0] + "\n" + ((Object[]) visit(ctx.add_do_whileContent()))[0];
            object[1] = 0;
        } else {
            object[0] = "";
            object[1] = 0;
        }
        return object;
    }

    @Override public Object[] visitFor_(StructFileGrammarParser.For_Context ctx) {
        Object[] object = new Object[2];
        object[0] = ((Object[]) visit(ctx.for_rules().variableDef()))[0] + "\n";
        object[0] += ind() + "while " + ((Object[]) visit(ctx.for_rules().expression()))[0] + ":\n";
        addLevel();
        object[0] += "" + ((Object[]) visit(ctx.forContent()))[0];
        object[0] += ind() + ((Object[]) visit(ctx.for_rules().variableAsign()))[0];
        removeLevel();
        object[1] = 0;
        return object;
    }

    @Override public Object[] visitForContent(StructFileGrammarParser.ForContentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.content() != null) {
            object[0] = ind() + ((Object[]) visit(ctx.content()))[0] + "\n" + ((Object[]) visit(ctx.add_forContent()))[0];
            object[1] = 0;
        } else {
            object[0] = ind() + "pass\n";
            object[1] = 0;
        }
        return object;
    }

    @Override public Object[] visitAdd_forContent(StructFileGrammarParser.Add_forContentContext ctx) {
        Object[] object = new Object[2];
        if (ctx.content() != null) {
            object[0] = ind() + ((Object[]) visit(ctx.content()))[0] + "\n" + ((Object[]) visit(ctx.add_forContent()))[0];
            object[1] = 0;
        } else {
            object[0] = "";
            object[1] = 0;
        }
        return object;
    }

}
