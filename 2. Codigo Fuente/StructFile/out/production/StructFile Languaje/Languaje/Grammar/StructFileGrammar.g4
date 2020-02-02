grammar StructFileGrammar;

// Omisiones
ONELINECOMMENT: ('#' | '//') ~[\n]* -> skip;             // Comentario de 1 linea
MULTILINECOMMENT: '/*' .*? '*/' -> skip;      // Comentario de varias lineas
SPACES : [ \t\r\n]+ -> skip ;                   // Espacios, saltos de linea, tabulación y retorno de carro

// Palabras reservadas de los tipos de datos
TK_NUMBER :    'num';      // Numerico (Entero o real)
TK_TEXT :      'tex';      // Caracteres o cadenas de caracteres
TK_BOOLEAN :   'bol';      // Valor booleano
TK_FILE :      'fil';      // Archivo de texto plano
TK_LIST :      'lis';      // Lista
TK_TREE :      'dir';      // Arbol de direcciones
TK_GROUP :     'gro';      // Grupos de arboles

// Palabras reservadas de las estructuras
TK_IF :         'if';           // Si
TK_ELSE :       'else';         // Si no entonces
TK_SWITCH :     'switch';       // Conmutador
TK_BREAK :      'break';        // Romper
TK_CONTINUE :   'continue';     // Continue
TK_WHILE :      'while';        // Mientras
TK_DO :         'do';           // Hacer mientras
TK_FOR :        'for';          // Para
TK_RETURN :     'return';       // Retorno

// Simbolos terminales
TK_DOUBLE_QUOTES :          '"';        // Comillas dobles
TK_SIMPLE_QUOTE :           '\'';       // Comillas simples
TK_DOT :                    '.';        // Punto
TK_COLON :                  ':';        // Dos puntos
TK_SEMICOLON :              ';';        // Punto y coma
TK_COMMA :                  ',';        // Coma
TK_OPEN_BRACKED :           '(';        // Apertura de parentesis
TK_CLOSE_BRACKED :          ')';        // Cierre de parentesis
TK_OPEN_BRACES :            '{';        // Apertura de corchetes
TK_CLOSE_BRACES :           '}';        // cierre de corchetes
TK_OPEN_SQUARE_BRACKED :    '[';        // Apertura de parentesis cuadrados
TK_CLOSE_SQUARE_BRACKED :   ']';        // Cierre de parentesis cuadrados

// Operadores logicos
TK_AND :    'and';      // Conjunción
TK_OR :     'or';       // Disjunción
TK_NOT :    'not';      // Negación

// Operadores de comparación
TK_GREAT_THAN :             '>';    // Mayor que
TK_GREAT_EQUAL_THAN :       '>=';   // Mayor o igual que
TK_LESS_THAN :              '<';    // Menor que
TK_LESS_EQUAL_THAN :        '<=';   // Menor o igual que
TK_EQUAL :                  '==';   // Igual a
TK_NOT_EQUAL :              '!=';   // Diferente a

// Operadores aritmeticos
TK_SUM :        '+';        // Suma
TK_HIPHEN :     '-';        // Resta (Guion)
TK_MULT:        '*';        // Multiplicación
TK_DIVR:        '/';        // División racional
TK_MOD:         '%';        // Modulo
TK_EXP:         '^';       // Expontente
TK_DIVI:        '/_';       // División entera

// Operadores de asignación
TK_ASIGN :      '=';        // Asignación

// Operadores de llamado a función
TK_DOLLAR:          '$';    // Llamado a función simple
TK_DOUBLE_DOLLAR:   '$$';   // Llamado a función de contendido en un grupo

// Valores basicos
TRUE_VAL:   'true';
FALSE_VAL:  'false';
NUMBER_VAL :    // Numerico (Entero o real)
    TK_HIPHEN? [0] | ([1-9][0-9]*) | ([0-9]+ ([.][0-9]+));
TEXT_VAL :      // Caracteres o cadenas de caracteres
    TK_DOUBLE_QUOTES ((~["]) | ('\\'('b'|'t'|'n'|'f'|'r'|'"')))* TK_DOUBLE_QUOTES | TK_SIMPLE_QUOTE ((~[']) | ('\\'('b'|'t'|'n'|'f'|'r'|'\'')))* TK_SIMPLE_QUOTE;
FILE_VAL :      // Archivo de texto plano
    TK_DOT ID_DIR (ID_DIR (TK_DOT TEXT_VAL)?)?;

// Identificadores
ID: [a-zA-Z_][a-zA-Z0-9_]*;                          // Identificador de nombres de variables y funciones
ID_DIR: TK_DOT [a-zA-Z0-9_]+ | TK_DOT TEXT_VAL;     // Identificador de nombres en carpetas y archivos

// Estructura general
init : (content add_content)? end;
    // Contenido
    content : variableDef tk_semicolon #content1 | variableAsign tk_semicolon #content2 | functionDef #content3 | functionCall tk_semicolon #content4 | structures #content5 | return_call tk_semicolon #content6 | expression tk_semicolon #content7;
        // Separador de sentencias
        tk_semicolon : TK_SEMICOLON;
        // Definición de variables
        variableDef : type id_variable #variableDef1| type variableAsign #variableDef2;
                type : number | boolean_ | text_ | file | list | tree_ | group number | group boolean_ | group text_ | group file | group list | group tree_ ;
                    number    : TK_NUMBER;
                    boolean_  : TK_BOOLEAN;
                    text_     : TK_TEXT;
                    file      : TK_FILE;
                    list      : TK_LIST;
                    tree_     : TK_TREE;
                    group     : TK_GROUP;
            id_variable : ID;
         // Asignación de variable
        variableAsign : id_variable tk_asign expression;
            tk_asign : TK_ASIGN;
        // Definición de funciones
        functionDef : return_ id_function tk_open_bracked parameters[$id_function.text] tk_close_bracked tk_open_braces functionContent tk_close_braces;
            return_ : type;
            id_function : ID;
            tk_open_bracked : TK_OPEN_BRACKED;
            parameters[String id_function_] : (variableDef add_variableDef[$id_function_, 1])?;
            add_variableDef[String id_function_, int cont] : TK_COMMA variableDef add_variableDef[$id_function_, $cont + 1] | ;
            tk_close_bracked : TK_CLOSE_BRACKED;
            tk_open_braces : TK_OPEN_BRACES;
            functionContent : (content add_functionContent)?;
            add_functionContent : content add_functionContent | ;
            tk_close_braces : TK_CLOSE_BRACES;
        // Llamada de funciones
        functionCall : id_function tk_open_bracked call_parameters[$id_function.text] tk_close_bracked;
            call_parameters[String id_function_] : (expression add_expression[$id_function_, 1])?;
            add_expression[String id_function_, int cont] : TK_COMMA expression add_expression[$id_function_, $cont + 1] | ;
        // Estructuras
        structures : if_ #structures1 | switch_ #structures2 | while_ #structures3 | do_while #structures4 | for_ #structures5;
            // Estructura if
            if_ : tk_if tk_open_bracked expression tk_close_bracked tk_open_braces ifContent tk_close_braces else_?;
                tk_if : TK_IF;
                ifContent : (content add_ifContent)?;
                add_ifContent : content add_ifContent | ;
                else_ : tk_else if_ #else_1 | tk_else tk_open_braces else_ifContent tk_close_braces #else_2;
                    tk_else : TK_ELSE;
                    else_ifContent : (content add_else_ifContent)?;
                    add_else_ifContent : content add_else_ifContent | ;
            // Estructura switch
            switch_ : tk_switch tk_open_bracked expression tk_close_bracked tk_open_braces caseContent[$expression.ctx] default_ tk_close_braces;
                tk_switch : TK_SWITCH;
                caseContent[ExpressionContext expr] : (case_ add_caseContent[$expr])?;
                add_caseContent[ExpressionContext expr] : case_ add_caseContent[$expr] | ;
                    case_ : expression tk_colon switchContent;
                        switchContent : (content add_switchContent)?;
                        add_switchContent : content add_switchContent | ;
                default_ : tk_else tk_colon switchContent;
            // Estructura while
            while_ : tk_while tk_open_bracked expression tk_close_bracked tk_open_braces whileContent tk_close_braces;
                tk_while : TK_WHILE;
                whileContent : (content add_whileContent)?;
                add_whileContent : content add_whileContent | ;
            // Estructura do while
            do_while : tk_do tk_open_braces do_whileContent tk_close_braces tk_open_bracked expression tk_close_bracked;
                tk_do : TK_DO;
                do_whileContent : (content add_do_whileContent)?;
                add_do_whileContent : content add_do_whileContent | ;
            // Estructura for
            for_ : tk_for tk_open_bracked for_rules tk_close_bracked tk_open_braces forContent tk_close_braces;
                tk_for : TK_FOR;
                for_rules : variableDef tk_semicolon expression tk_semicolon variableAsign;
                forContent : (content add_forContent)?;
                add_forContent : content add_forContent | ;
        // Llamada a retorno
        return_call :
            TK_RETURN expression;
    add_content : content add_content | ;
    // Fin de archivo
    end : EOF;

// Valores
value : number_val #value1| boolean_val #value2| text_val #value3| file_val #value4| tree_val #value5| group_val #value6| list_val #value7| id_variable #value8| functionCall #value9;
        number_val :    NUMBER_VAL;
        text_val :      TEXT_VAL;
        boolean_val :   TRUE_VAL | FALSE_VAL;

// Expresiones
expression : expression value_extras #expression8
           | tk_open_bracked expression tk_close_bracked #expression1
           | expression tk_and expression #expression2
           | expression tk_or expression #expression3
           | tk_not expression #expression4
           | expression tk_comparator expression #expression5
           | expression tk_operator expression #expression6
           | value #expression7;
    tk_and : TK_AND;
    tk_or : TK_OR;
    tk_not : TK_NOT;
    tk_comparator : tk_great_than #tk_comparator1 | tk_great_equal_than #tk_comparator2 | tk_less_than #tk_comparator3 | tk_less_equal_than #tk_comparator4 | tk_equal #tk_comparator5 | tk_not_equal #tk_comparator6;
         tk_great_than : TK_GREAT_THAN;
         tk_great_equal_than : TK_GREAT_EQUAL_THAN;
         tk_less_than : TK_LESS_THAN;
         tk_less_equal_than : TK_LESS_EQUAL_THAN;
         tk_equal : TK_EQUAL;
         tk_not_equal : TK_NOT_EQUAL;
    tk_operator : tk_sum #tk_operator1 | tk_minus #tk_operator2 | tk_mult #tk_operator3 | tk_divr #tk_operator4 | tk_divi #tk_operator5 | tk_mod #tk_operator6 | tk_exp #tk_operator7;
        tk_sum  : TK_SUM;
        tk_minus : TK_HIPHEN;
        tk_mult : TK_MULT;
        tk_divr : TK_DIVR;
        tk_divi : TK_DIVI;
        tk_mod : TK_MOD;
        tk_exp : TK_EXP;

// Valores complejos
tree_val :      // Arbol de direcciones
    id_dir tk_colon? direction;
        id_dir : ID_DIR;
        tk_colon : TK_COLON;
        direction : id_dir direction #direction1 | file_or_division? #direction2;
            file_or_division : file_val #file_or_division1 | division #file_or_division2;
                division : tk_open_square_bracked direction add_directions tk_close_square_bracked;
                    tk_open_square_bracked : TK_OPEN_SQUARE_BRACKED;
                    add_directions : tk_comma direction add_directions | ;
                        tk_comma : TK_COMMA;
                    tk_close_square_bracked : TK_CLOSE_SQUARE_BRACKED;
                file_val : FILE_VAL;

group_val :     // Grupo
    tk_open_braces set_group? tk_close_braces;
        set_group :  expression tk_dollar expression add_group_vals;
        add_group_vals : tk_comma expression tk_dollar expression add_group_vals | ;

list_val :      // Lista
    tk_open_square_bracked expression add_expressions tk_close_square_bracked;
        add_expressions : tk_comma expression add_expressions | ;

// Adiciones a los valores y expresiones entre parentesis
value_extras : method_reference;
    // Referencia a metodos por defecto desde valores y expresiones entre parentesis
    method_reference : separator default_call;
        separator : tk_dollar | tk_double_dollar;
            tk_dollar : TK_DOLLAR;
            tk_double_dollar : TK_DOUBLE_DOLLAR;
        default_call : id_function2 tk_open_bracked call_default_parameters tk_close_bracked;
               id_function2 : id_function | type;
               call_default_parameters : (expression add_default_expression)?;
               add_default_expression : TK_COMMA expression add_default_expression | ;

