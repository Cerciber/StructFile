// Generated from C:/Users/acer/Google Drive/CESAR/3. UNAL/2. MATERIAS/28. LENGUAJES DE PROGRAMACIÓN/StructFile Languaje/src/Languaje/Grammar\StructFileGrammar.g4 by ANTLR 4.7.2
package Languaje.Grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StructFileGrammarParser}.
 */
public interface StructFileGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(StructFileGrammarParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(StructFileGrammarParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code content1}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent1(StructFileGrammarParser.Content1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code content1}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent1(StructFileGrammarParser.Content1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code content2}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent2(StructFileGrammarParser.Content2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code content2}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent2(StructFileGrammarParser.Content2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code content3}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent3(StructFileGrammarParser.Content3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code content3}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent3(StructFileGrammarParser.Content3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code content4}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent4(StructFileGrammarParser.Content4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code content4}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent4(StructFileGrammarParser.Content4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code content5}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent5(StructFileGrammarParser.Content5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code content5}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent5(StructFileGrammarParser.Content5Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterTk_semicolon(StructFileGrammarParser.Tk_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitTk_semicolon(StructFileGrammarParser.Tk_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDef1}
	 * labeled alternative in {@link StructFileGrammarParser#variableDef}.
	 * @param ctx the parse tree
	 */
	void enterVariableDef1(StructFileGrammarParser.VariableDef1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDef1}
	 * labeled alternative in {@link StructFileGrammarParser#variableDef}.
	 * @param ctx the parse tree
	 */
	void exitVariableDef1(StructFileGrammarParser.VariableDef1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDef2}
	 * labeled alternative in {@link StructFileGrammarParser#variableDef}.
	 * @param ctx the parse tree
	 */
	void enterVariableDef2(StructFileGrammarParser.VariableDef2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDef2}
	 * labeled alternative in {@link StructFileGrammarParser#variableDef}.
	 * @param ctx the parse tree
	 */
	void exitVariableDef2(StructFileGrammarParser.VariableDef2Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(StructFileGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(StructFileGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(StructFileGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(StructFileGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#boolean_}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_(StructFileGrammarParser.Boolean_Context ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#boolean_}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_(StructFileGrammarParser.Boolean_Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#text_}.
	 * @param ctx the parse tree
	 */
	void enterText_(StructFileGrammarParser.Text_Context ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#text_}.
	 * @param ctx the parse tree
	 */
	void exitText_(StructFileGrammarParser.Text_Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(StructFileGrammarParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(StructFileGrammarParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(StructFileGrammarParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(StructFileGrammarParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tree_}.
	 * @param ctx the parse tree
	 */
	void enterTree_(StructFileGrammarParser.Tree_Context ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tree_}.
	 * @param ctx the parse tree
	 */
	void exitTree_(StructFileGrammarParser.Tree_Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(StructFileGrammarParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(StructFileGrammarParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#id_variable}.
	 * @param ctx the parse tree
	 */
	void enterId_variable(StructFileGrammarParser.Id_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#id_variable}.
	 * @param ctx the parse tree
	 */
	void exitId_variable(StructFileGrammarParser.Id_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#variableAsign}.
	 * @param ctx the parse tree
	 */
	void enterVariableAsign(StructFileGrammarParser.VariableAsignContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#variableAsign}.
	 * @param ctx the parse tree
	 */
	void exitVariableAsign(StructFileGrammarParser.VariableAsignContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_asign}.
	 * @param ctx the parse tree
	 */
	void enterTk_asign(StructFileGrammarParser.Tk_asignContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_asign}.
	 * @param ctx the parse tree
	 */
	void exitTk_asign(StructFileGrammarParser.Tk_asignContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(StructFileGrammarParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(StructFileGrammarParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#return_}.
	 * @param ctx the parse tree
	 */
	void enterReturn_(StructFileGrammarParser.Return_Context ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#return_}.
	 * @param ctx the parse tree
	 */
	void exitReturn_(StructFileGrammarParser.Return_Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#id_function}.
	 * @param ctx the parse tree
	 */
	void enterId_function(StructFileGrammarParser.Id_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#id_function}.
	 * @param ctx the parse tree
	 */
	void exitId_function(StructFileGrammarParser.Id_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_open_bracked}.
	 * @param ctx the parse tree
	 */
	void enterTk_open_bracked(StructFileGrammarParser.Tk_open_brackedContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_open_bracked}.
	 * @param ctx the parse tree
	 */
	void exitTk_open_bracked(StructFileGrammarParser.Tk_open_brackedContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(StructFileGrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(StructFileGrammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#add_variableDef}.
	 * @param ctx the parse tree
	 */
	void enterAdd_variableDef(StructFileGrammarParser.Add_variableDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#add_variableDef}.
	 * @param ctx the parse tree
	 */
	void exitAdd_variableDef(StructFileGrammarParser.Add_variableDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_close_bracked}.
	 * @param ctx the parse tree
	 */
	void enterTk_close_bracked(StructFileGrammarParser.Tk_close_brackedContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_close_bracked}.
	 * @param ctx the parse tree
	 */
	void exitTk_close_bracked(StructFileGrammarParser.Tk_close_brackedContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_open_braces}.
	 * @param ctx the parse tree
	 */
	void enterTk_open_braces(StructFileGrammarParser.Tk_open_bracesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_open_braces}.
	 * @param ctx the parse tree
	 */
	void exitTk_open_braces(StructFileGrammarParser.Tk_open_bracesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#functionContent}.
	 * @param ctx the parse tree
	 */
	void enterFunctionContent(StructFileGrammarParser.FunctionContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#functionContent}.
	 * @param ctx the parse tree
	 */
	void exitFunctionContent(StructFileGrammarParser.FunctionContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#add_functionContent}.
	 * @param ctx the parse tree
	 */
	void enterAdd_functionContent(StructFileGrammarParser.Add_functionContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#add_functionContent}.
	 * @param ctx the parse tree
	 */
	void exitAdd_functionContent(StructFileGrammarParser.Add_functionContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_close_braces}.
	 * @param ctx the parse tree
	 */
	void enterTk_close_braces(StructFileGrammarParser.Tk_close_bracesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_close_braces}.
	 * @param ctx the parse tree
	 */
	void exitTk_close_braces(StructFileGrammarParser.Tk_close_bracesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(StructFileGrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(StructFileGrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#call_parameters}.
	 * @param ctx the parse tree
	 */
	void enterCall_parameters(StructFileGrammarParser.Call_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#call_parameters}.
	 * @param ctx the parse tree
	 */
	void exitCall_parameters(StructFileGrammarParser.Call_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expression(StructFileGrammarParser.Add_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expression(StructFileGrammarParser.Add_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structures1}
	 * labeled alternative in {@link StructFileGrammarParser#structures}.
	 * @param ctx the parse tree
	 */
	void enterStructures1(StructFileGrammarParser.Structures1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code structures1}
	 * labeled alternative in {@link StructFileGrammarParser#structures}.
	 * @param ctx the parse tree
	 */
	void exitStructures1(StructFileGrammarParser.Structures1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code structures2}
	 * labeled alternative in {@link StructFileGrammarParser#structures}.
	 * @param ctx the parse tree
	 */
	void enterStructures2(StructFileGrammarParser.Structures2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code structures2}
	 * labeled alternative in {@link StructFileGrammarParser#structures}.
	 * @param ctx the parse tree
	 */
	void exitStructures2(StructFileGrammarParser.Structures2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code structures3}
	 * labeled alternative in {@link StructFileGrammarParser#structures}.
	 * @param ctx the parse tree
	 */
	void enterStructures3(StructFileGrammarParser.Structures3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code structures3}
	 * labeled alternative in {@link StructFileGrammarParser#structures}.
	 * @param ctx the parse tree
	 */
	void exitStructures3(StructFileGrammarParser.Structures3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code structures4}
	 * labeled alternative in {@link StructFileGrammarParser#structures}.
	 * @param ctx the parse tree
	 */
	void enterStructures4(StructFileGrammarParser.Structures4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code structures4}
	 * labeled alternative in {@link StructFileGrammarParser#structures}.
	 * @param ctx the parse tree
	 */
	void exitStructures4(StructFileGrammarParser.Structures4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code structures5}
	 * labeled alternative in {@link StructFileGrammarParser#structures}.
	 * @param ctx the parse tree
	 */
	void enterStructures5(StructFileGrammarParser.Structures5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code structures5}
	 * labeled alternative in {@link StructFileGrammarParser#structures}.
	 * @param ctx the parse tree
	 */
	void exitStructures5(StructFileGrammarParser.Structures5Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(StructFileGrammarParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(StructFileGrammarParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_if}.
	 * @param ctx the parse tree
	 */
	void enterTk_if(StructFileGrammarParser.Tk_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_if}.
	 * @param ctx the parse tree
	 */
	void exitTk_if(StructFileGrammarParser.Tk_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void enterIfContent(StructFileGrammarParser.IfContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void exitIfContent(StructFileGrammarParser.IfContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#add_ifContent}.
	 * @param ctx the parse tree
	 */
	void enterAdd_ifContent(StructFileGrammarParser.Add_ifContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#add_ifContent}.
	 * @param ctx the parse tree
	 */
	void exitAdd_ifContent(StructFileGrammarParser.Add_ifContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code else_1}
	 * labeled alternative in {@link StructFileGrammarParser#else_}.
	 * @param ctx the parse tree
	 */
	void enterElse_1(StructFileGrammarParser.Else_1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code else_1}
	 * labeled alternative in {@link StructFileGrammarParser#else_}.
	 * @param ctx the parse tree
	 */
	void exitElse_1(StructFileGrammarParser.Else_1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code else_2}
	 * labeled alternative in {@link StructFileGrammarParser#else_}.
	 * @param ctx the parse tree
	 */
	void enterElse_2(StructFileGrammarParser.Else_2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code else_2}
	 * labeled alternative in {@link StructFileGrammarParser#else_}.
	 * @param ctx the parse tree
	 */
	void exitElse_2(StructFileGrammarParser.Else_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_else}.
	 * @param ctx the parse tree
	 */
	void enterTk_else(StructFileGrammarParser.Tk_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_else}.
	 * @param ctx the parse tree
	 */
	void exitTk_else(StructFileGrammarParser.Tk_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#else_ifContent}.
	 * @param ctx the parse tree
	 */
	void enterElse_ifContent(StructFileGrammarParser.Else_ifContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#else_ifContent}.
	 * @param ctx the parse tree
	 */
	void exitElse_ifContent(StructFileGrammarParser.Else_ifContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#add_else_ifContent}.
	 * @param ctx the parse tree
	 */
	void enterAdd_else_ifContent(StructFileGrammarParser.Add_else_ifContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#add_else_ifContent}.
	 * @param ctx the parse tree
	 */
	void exitAdd_else_ifContent(StructFileGrammarParser.Add_else_ifContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#switch_}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_(StructFileGrammarParser.Switch_Context ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#switch_}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_(StructFileGrammarParser.Switch_Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_switch}.
	 * @param ctx the parse tree
	 */
	void enterTk_switch(StructFileGrammarParser.Tk_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_switch}.
	 * @param ctx the parse tree
	 */
	void exitTk_switch(StructFileGrammarParser.Tk_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#caseContent}.
	 * @param ctx the parse tree
	 */
	void enterCaseContent(StructFileGrammarParser.CaseContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#caseContent}.
	 * @param ctx the parse tree
	 */
	void exitCaseContent(StructFileGrammarParser.CaseContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#add_caseContent}.
	 * @param ctx the parse tree
	 */
	void enterAdd_caseContent(StructFileGrammarParser.Add_caseContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#add_caseContent}.
	 * @param ctx the parse tree
	 */
	void exitAdd_caseContent(StructFileGrammarParser.Add_caseContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#case_}.
	 * @param ctx the parse tree
	 */
	void enterCase_(StructFileGrammarParser.Case_Context ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#case_}.
	 * @param ctx the parse tree
	 */
	void exitCase_(StructFileGrammarParser.Case_Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#switchContent}.
	 * @param ctx the parse tree
	 */
	void enterSwitchContent(StructFileGrammarParser.SwitchContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#switchContent}.
	 * @param ctx the parse tree
	 */
	void exitSwitchContent(StructFileGrammarParser.SwitchContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#add_switchContent}.
	 * @param ctx the parse tree
	 */
	void enterAdd_switchContent(StructFileGrammarParser.Add_switchContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#add_switchContent}.
	 * @param ctx the parse tree
	 */
	void exitAdd_switchContent(StructFileGrammarParser.Add_switchContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#default_}.
	 * @param ctx the parse tree
	 */
	void enterDefault_(StructFileGrammarParser.Default_Context ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#default_}.
	 * @param ctx the parse tree
	 */
	void exitDefault_(StructFileGrammarParser.Default_Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(StructFileGrammarParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(StructFileGrammarParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_while}.
	 * @param ctx the parse tree
	 */
	void enterTk_while(StructFileGrammarParser.Tk_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_while}.
	 * @param ctx the parse tree
	 */
	void exitTk_while(StructFileGrammarParser.Tk_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#whileContent}.
	 * @param ctx the parse tree
	 */
	void enterWhileContent(StructFileGrammarParser.WhileContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#whileContent}.
	 * @param ctx the parse tree
	 */
	void exitWhileContent(StructFileGrammarParser.WhileContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#add_whileContent}.
	 * @param ctx the parse tree
	 */
	void enterAdd_whileContent(StructFileGrammarParser.Add_whileContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#add_whileContent}.
	 * @param ctx the parse tree
	 */
	void exitAdd_whileContent(StructFileGrammarParser.Add_whileContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(StructFileGrammarParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(StructFileGrammarParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_do}.
	 * @param ctx the parse tree
	 */
	void enterTk_do(StructFileGrammarParser.Tk_doContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_do}.
	 * @param ctx the parse tree
	 */
	void exitTk_do(StructFileGrammarParser.Tk_doContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#do_whileContent}.
	 * @param ctx the parse tree
	 */
	void enterDo_whileContent(StructFileGrammarParser.Do_whileContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#do_whileContent}.
	 * @param ctx the parse tree
	 */
	void exitDo_whileContent(StructFileGrammarParser.Do_whileContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#add_do_whileContent}.
	 * @param ctx the parse tree
	 */
	void enterAdd_do_whileContent(StructFileGrammarParser.Add_do_whileContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#add_do_whileContent}.
	 * @param ctx the parse tree
	 */
	void exitAdd_do_whileContent(StructFileGrammarParser.Add_do_whileContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#for_}.
	 * @param ctx the parse tree
	 */
	void enterFor_(StructFileGrammarParser.For_Context ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#for_}.
	 * @param ctx the parse tree
	 */
	void exitFor_(StructFileGrammarParser.For_Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_for}.
	 * @param ctx the parse tree
	 */
	void enterTk_for(StructFileGrammarParser.Tk_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_for}.
	 * @param ctx the parse tree
	 */
	void exitTk_for(StructFileGrammarParser.Tk_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#for_rules}.
	 * @param ctx the parse tree
	 */
	void enterFor_rules(StructFileGrammarParser.For_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#for_rules}.
	 * @param ctx the parse tree
	 */
	void exitFor_rules(StructFileGrammarParser.For_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#forContent}.
	 * @param ctx the parse tree
	 */
	void enterForContent(StructFileGrammarParser.ForContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#forContent}.
	 * @param ctx the parse tree
	 */
	void exitForContent(StructFileGrammarParser.ForContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#add_forContent}.
	 * @param ctx the parse tree
	 */
	void enterAdd_forContent(StructFileGrammarParser.Add_forContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#add_forContent}.
	 * @param ctx the parse tree
	 */
	void exitAdd_forContent(StructFileGrammarParser.Add_forContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#add_content}.
	 * @param ctx the parse tree
	 */
	void enterAdd_content(StructFileGrammarParser.Add_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#add_content}.
	 * @param ctx the parse tree
	 */
	void exitAdd_content(StructFileGrammarParser.Add_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(StructFileGrammarParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(StructFileGrammarParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value1}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue1(StructFileGrammarParser.Value1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code value1}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue1(StructFileGrammarParser.Value1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code value2}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue2(StructFileGrammarParser.Value2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code value2}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue2(StructFileGrammarParser.Value2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code value3}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue3(StructFileGrammarParser.Value3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code value3}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue3(StructFileGrammarParser.Value3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code value4}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue4(StructFileGrammarParser.Value4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code value4}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue4(StructFileGrammarParser.Value4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code value5}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue5(StructFileGrammarParser.Value5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code value5}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue5(StructFileGrammarParser.Value5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code value6}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue6(StructFileGrammarParser.Value6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code value6}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue6(StructFileGrammarParser.Value6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code value7}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue7(StructFileGrammarParser.Value7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code value7}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue7(StructFileGrammarParser.Value7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code value8}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue8(StructFileGrammarParser.Value8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code value8}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue8(StructFileGrammarParser.Value8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code value9}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue9(StructFileGrammarParser.Value9Context ctx);
	/**
	 * Exit a parse tree produced by the {@code value9}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue9(StructFileGrammarParser.Value9Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#number_val}.
	 * @param ctx the parse tree
	 */
	void enterNumber_val(StructFileGrammarParser.Number_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#number_val}.
	 * @param ctx the parse tree
	 */
	void exitNumber_val(StructFileGrammarParser.Number_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#text_val}.
	 * @param ctx the parse tree
	 */
	void enterText_val(StructFileGrammarParser.Text_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#text_val}.
	 * @param ctx the parse tree
	 */
	void exitText_val(StructFileGrammarParser.Text_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#boolean_val}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_val(StructFileGrammarParser.Boolean_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#boolean_val}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_val(StructFileGrammarParser.Boolean_valContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression8}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression8(StructFileGrammarParser.Expression8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression8}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression8(StructFileGrammarParser.Expression8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression6}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression6(StructFileGrammarParser.Expression6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression6}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression6(StructFileGrammarParser.Expression6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression7}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression7(StructFileGrammarParser.Expression7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression7}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression7(StructFileGrammarParser.Expression7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression4}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression4(StructFileGrammarParser.Expression4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression4}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression4(StructFileGrammarParser.Expression4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression5}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression5(StructFileGrammarParser.Expression5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression5}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression5(StructFileGrammarParser.Expression5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression2}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression2(StructFileGrammarParser.Expression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression2}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression2(StructFileGrammarParser.Expression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression3}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression3(StructFileGrammarParser.Expression3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression3}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression3(StructFileGrammarParser.Expression3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression1}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression1(StructFileGrammarParser.Expression1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression1}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression1(StructFileGrammarParser.Expression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_and}.
	 * @param ctx the parse tree
	 */
	void enterTk_and(StructFileGrammarParser.Tk_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_and}.
	 * @param ctx the parse tree
	 */
	void exitTk_and(StructFileGrammarParser.Tk_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_or}.
	 * @param ctx the parse tree
	 */
	void enterTk_or(StructFileGrammarParser.Tk_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_or}.
	 * @param ctx the parse tree
	 */
	void exitTk_or(StructFileGrammarParser.Tk_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_not}.
	 * @param ctx the parse tree
	 */
	void enterTk_not(StructFileGrammarParser.Tk_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_not}.
	 * @param ctx the parse tree
	 */
	void exitTk_not(StructFileGrammarParser.Tk_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tk_comparator1}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 */
	void enterTk_comparator1(StructFileGrammarParser.Tk_comparator1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tk_comparator1}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 */
	void exitTk_comparator1(StructFileGrammarParser.Tk_comparator1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tk_comparator2}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 */
	void enterTk_comparator2(StructFileGrammarParser.Tk_comparator2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tk_comparator2}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 */
	void exitTk_comparator2(StructFileGrammarParser.Tk_comparator2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tk_comparator3}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 */
	void enterTk_comparator3(StructFileGrammarParser.Tk_comparator3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tk_comparator3}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 */
	void exitTk_comparator3(StructFileGrammarParser.Tk_comparator3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tk_comparator4}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 */
	void enterTk_comparator4(StructFileGrammarParser.Tk_comparator4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tk_comparator4}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 */
	void exitTk_comparator4(StructFileGrammarParser.Tk_comparator4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tk_comparator5}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 */
	void enterTk_comparator5(StructFileGrammarParser.Tk_comparator5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tk_comparator5}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 */
	void exitTk_comparator5(StructFileGrammarParser.Tk_comparator5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tk_comparator6}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 */
	void enterTk_comparator6(StructFileGrammarParser.Tk_comparator6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tk_comparator6}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 */
	void exitTk_comparator6(StructFileGrammarParser.Tk_comparator6Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_great_than}.
	 * @param ctx the parse tree
	 */
	void enterTk_great_than(StructFileGrammarParser.Tk_great_thanContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_great_than}.
	 * @param ctx the parse tree
	 */
	void exitTk_great_than(StructFileGrammarParser.Tk_great_thanContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_great_equal_than}.
	 * @param ctx the parse tree
	 */
	void enterTk_great_equal_than(StructFileGrammarParser.Tk_great_equal_thanContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_great_equal_than}.
	 * @param ctx the parse tree
	 */
	void exitTk_great_equal_than(StructFileGrammarParser.Tk_great_equal_thanContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_less_than}.
	 * @param ctx the parse tree
	 */
	void enterTk_less_than(StructFileGrammarParser.Tk_less_thanContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_less_than}.
	 * @param ctx the parse tree
	 */
	void exitTk_less_than(StructFileGrammarParser.Tk_less_thanContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_less_equal_than}.
	 * @param ctx the parse tree
	 */
	void enterTk_less_equal_than(StructFileGrammarParser.Tk_less_equal_thanContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_less_equal_than}.
	 * @param ctx the parse tree
	 */
	void exitTk_less_equal_than(StructFileGrammarParser.Tk_less_equal_thanContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_equal}.
	 * @param ctx the parse tree
	 */
	void enterTk_equal(StructFileGrammarParser.Tk_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_equal}.
	 * @param ctx the parse tree
	 */
	void exitTk_equal(StructFileGrammarParser.Tk_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_not_equal}.
	 * @param ctx the parse tree
	 */
	void enterTk_not_equal(StructFileGrammarParser.Tk_not_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_not_equal}.
	 * @param ctx the parse tree
	 */
	void exitTk_not_equal(StructFileGrammarParser.Tk_not_equalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tk_operator1}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 */
	void enterTk_operator1(StructFileGrammarParser.Tk_operator1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tk_operator1}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 */
	void exitTk_operator1(StructFileGrammarParser.Tk_operator1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tk_operator2}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 */
	void enterTk_operator2(StructFileGrammarParser.Tk_operator2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tk_operator2}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 */
	void exitTk_operator2(StructFileGrammarParser.Tk_operator2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tk_operator3}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 */
	void enterTk_operator3(StructFileGrammarParser.Tk_operator3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tk_operator3}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 */
	void exitTk_operator3(StructFileGrammarParser.Tk_operator3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tk_operator4}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 */
	void enterTk_operator4(StructFileGrammarParser.Tk_operator4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tk_operator4}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 */
	void exitTk_operator4(StructFileGrammarParser.Tk_operator4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tk_operator5}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 */
	void enterTk_operator5(StructFileGrammarParser.Tk_operator5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tk_operator5}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 */
	void exitTk_operator5(StructFileGrammarParser.Tk_operator5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tk_operator6}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 */
	void enterTk_operator6(StructFileGrammarParser.Tk_operator6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tk_operator6}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 */
	void exitTk_operator6(StructFileGrammarParser.Tk_operator6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tk_operator7}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 */
	void enterTk_operator7(StructFileGrammarParser.Tk_operator7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tk_operator7}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 */
	void exitTk_operator7(StructFileGrammarParser.Tk_operator7Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_sum}.
	 * @param ctx the parse tree
	 */
	void enterTk_sum(StructFileGrammarParser.Tk_sumContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_sum}.
	 * @param ctx the parse tree
	 */
	void exitTk_sum(StructFileGrammarParser.Tk_sumContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_minus}.
	 * @param ctx the parse tree
	 */
	void enterTk_minus(StructFileGrammarParser.Tk_minusContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_minus}.
	 * @param ctx the parse tree
	 */
	void exitTk_minus(StructFileGrammarParser.Tk_minusContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_mult}.
	 * @param ctx the parse tree
	 */
	void enterTk_mult(StructFileGrammarParser.Tk_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_mult}.
	 * @param ctx the parse tree
	 */
	void exitTk_mult(StructFileGrammarParser.Tk_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_divr}.
	 * @param ctx the parse tree
	 */
	void enterTk_divr(StructFileGrammarParser.Tk_divrContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_divr}.
	 * @param ctx the parse tree
	 */
	void exitTk_divr(StructFileGrammarParser.Tk_divrContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_divi}.
	 * @param ctx the parse tree
	 */
	void enterTk_divi(StructFileGrammarParser.Tk_diviContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_divi}.
	 * @param ctx the parse tree
	 */
	void exitTk_divi(StructFileGrammarParser.Tk_diviContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_mod}.
	 * @param ctx the parse tree
	 */
	void enterTk_mod(StructFileGrammarParser.Tk_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_mod}.
	 * @param ctx the parse tree
	 */
	void exitTk_mod(StructFileGrammarParser.Tk_modContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_exp}.
	 * @param ctx the parse tree
	 */
	void enterTk_exp(StructFileGrammarParser.Tk_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_exp}.
	 * @param ctx the parse tree
	 */
	void exitTk_exp(StructFileGrammarParser.Tk_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tree_val}.
	 * @param ctx the parse tree
	 */
	void enterTree_val(StructFileGrammarParser.Tree_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tree_val}.
	 * @param ctx the parse tree
	 */
	void exitTree_val(StructFileGrammarParser.Tree_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#id_dir}.
	 * @param ctx the parse tree
	 */
	void enterId_dir(StructFileGrammarParser.Id_dirContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#id_dir}.
	 * @param ctx the parse tree
	 */
	void exitId_dir(StructFileGrammarParser.Id_dirContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_colon}.
	 * @param ctx the parse tree
	 */
	void enterTk_colon(StructFileGrammarParser.Tk_colonContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_colon}.
	 * @param ctx the parse tree
	 */
	void exitTk_colon(StructFileGrammarParser.Tk_colonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code direction1}
	 * labeled alternative in {@link StructFileGrammarParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection1(StructFileGrammarParser.Direction1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code direction1}
	 * labeled alternative in {@link StructFileGrammarParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection1(StructFileGrammarParser.Direction1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code direction2}
	 * labeled alternative in {@link StructFileGrammarParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection2(StructFileGrammarParser.Direction2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code direction2}
	 * labeled alternative in {@link StructFileGrammarParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection2(StructFileGrammarParser.Direction2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code file_or_division1}
	 * labeled alternative in {@link StructFileGrammarParser#file_or_division}.
	 * @param ctx the parse tree
	 */
	void enterFile_or_division1(StructFileGrammarParser.File_or_division1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code file_or_division1}
	 * labeled alternative in {@link StructFileGrammarParser#file_or_division}.
	 * @param ctx the parse tree
	 */
	void exitFile_or_division1(StructFileGrammarParser.File_or_division1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code file_or_division2}
	 * labeled alternative in {@link StructFileGrammarParser#file_or_division}.
	 * @param ctx the parse tree
	 */
	void enterFile_or_division2(StructFileGrammarParser.File_or_division2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code file_or_division2}
	 * labeled alternative in {@link StructFileGrammarParser#file_or_division}.
	 * @param ctx the parse tree
	 */
	void exitFile_or_division2(StructFileGrammarParser.File_or_division2Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(StructFileGrammarParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(StructFileGrammarParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_open_square_bracked}.
	 * @param ctx the parse tree
	 */
	void enterTk_open_square_bracked(StructFileGrammarParser.Tk_open_square_brackedContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_open_square_bracked}.
	 * @param ctx the parse tree
	 */
	void exitTk_open_square_bracked(StructFileGrammarParser.Tk_open_square_brackedContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#add_directions}.
	 * @param ctx the parse tree
	 */
	void enterAdd_directions(StructFileGrammarParser.Add_directionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#add_directions}.
	 * @param ctx the parse tree
	 */
	void exitAdd_directions(StructFileGrammarParser.Add_directionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_comma}.
	 * @param ctx the parse tree
	 */
	void enterTk_comma(StructFileGrammarParser.Tk_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_comma}.
	 * @param ctx the parse tree
	 */
	void exitTk_comma(StructFileGrammarParser.Tk_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_close_square_bracked}.
	 * @param ctx the parse tree
	 */
	void enterTk_close_square_bracked(StructFileGrammarParser.Tk_close_square_brackedContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_close_square_bracked}.
	 * @param ctx the parse tree
	 */
	void exitTk_close_square_bracked(StructFileGrammarParser.Tk_close_square_brackedContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#file_val}.
	 * @param ctx the parse tree
	 */
	void enterFile_val(StructFileGrammarParser.File_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#file_val}.
	 * @param ctx the parse tree
	 */
	void exitFile_val(StructFileGrammarParser.File_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#group_val}.
	 * @param ctx the parse tree
	 */
	void enterGroup_val(StructFileGrammarParser.Group_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#group_val}.
	 * @param ctx the parse tree
	 */
	void exitGroup_val(StructFileGrammarParser.Group_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#set_group}.
	 * @param ctx the parse tree
	 */
	void enterSet_group(StructFileGrammarParser.Set_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#set_group}.
	 * @param ctx the parse tree
	 */
	void exitSet_group(StructFileGrammarParser.Set_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#add_group_vals}.
	 * @param ctx the parse tree
	 */
	void enterAdd_group_vals(StructFileGrammarParser.Add_group_valsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#add_group_vals}.
	 * @param ctx the parse tree
	 */
	void exitAdd_group_vals(StructFileGrammarParser.Add_group_valsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#list_val}.
	 * @param ctx the parse tree
	 */
	void enterList_val(StructFileGrammarParser.List_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#list_val}.
	 * @param ctx the parse tree
	 */
	void exitList_val(StructFileGrammarParser.List_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#add_expressions}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expressions(StructFileGrammarParser.Add_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#add_expressions}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expressions(StructFileGrammarParser.Add_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#value_extras}.
	 * @param ctx the parse tree
	 */
	void enterValue_extras(StructFileGrammarParser.Value_extrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#value_extras}.
	 * @param ctx the parse tree
	 */
	void exitValue_extras(StructFileGrammarParser.Value_extrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#method_reference}.
	 * @param ctx the parse tree
	 */
	void enterMethod_reference(StructFileGrammarParser.Method_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#method_reference}.
	 * @param ctx the parse tree
	 */
	void exitMethod_reference(StructFileGrammarParser.Method_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#separator}.
	 * @param ctx the parse tree
	 */
	void enterSeparator(StructFileGrammarParser.SeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#separator}.
	 * @param ctx the parse tree
	 */
	void exitSeparator(StructFileGrammarParser.SeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_dollar}.
	 * @param ctx the parse tree
	 */
	void enterTk_dollar(StructFileGrammarParser.Tk_dollarContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_dollar}.
	 * @param ctx the parse tree
	 */
	void exitTk_dollar(StructFileGrammarParser.Tk_dollarContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#tk_double_dollar}.
	 * @param ctx the parse tree
	 */
	void enterTk_double_dollar(StructFileGrammarParser.Tk_double_dollarContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#tk_double_dollar}.
	 * @param ctx the parse tree
	 */
	void exitTk_double_dollar(StructFileGrammarParser.Tk_double_dollarContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#default_call}.
	 * @param ctx the parse tree
	 */
	void enterDefault_call(StructFileGrammarParser.Default_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#default_call}.
	 * @param ctx the parse tree
	 */
	void exitDefault_call(StructFileGrammarParser.Default_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#id_function2}.
	 * @param ctx the parse tree
	 */
	void enterId_function2(StructFileGrammarParser.Id_function2Context ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#id_function2}.
	 * @param ctx the parse tree
	 */
	void exitId_function2(StructFileGrammarParser.Id_function2Context ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#call_default_parameters}.
	 * @param ctx the parse tree
	 */
	void enterCall_default_parameters(StructFileGrammarParser.Call_default_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#call_default_parameters}.
	 * @param ctx the parse tree
	 */
	void exitCall_default_parameters(StructFileGrammarParser.Call_default_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructFileGrammarParser#add_default_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_default_expression(StructFileGrammarParser.Add_default_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructFileGrammarParser#add_default_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_default_expression(StructFileGrammarParser.Add_default_expressionContext ctx);
}