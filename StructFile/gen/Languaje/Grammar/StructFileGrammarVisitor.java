// Generated from C:/Users/acer/Google Drive/CESAR/6. PORTAFOLIO/StructFile/StructFile/src/Languaje/Grammar\StructFileGrammar.g4 by ANTLR 4.7.2
package Languaje.Grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StructFileGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StructFileGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(StructFileGrammarParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code content1}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent1(StructFileGrammarParser.Content1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code content2}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent2(StructFileGrammarParser.Content2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code content3}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent3(StructFileGrammarParser.Content3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code content4}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent4(StructFileGrammarParser.Content4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code content5}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent5(StructFileGrammarParser.Content5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code content6}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent6(StructFileGrammarParser.Content6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code content7}
	 * labeled alternative in {@link StructFileGrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent7(StructFileGrammarParser.Content7Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_semicolon(StructFileGrammarParser.Tk_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDef1}
	 * labeled alternative in {@link StructFileGrammarParser#variableDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDef1(StructFileGrammarParser.VariableDef1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDef2}
	 * labeled alternative in {@link StructFileGrammarParser#variableDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDef2(StructFileGrammarParser.VariableDef2Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(StructFileGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(StructFileGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#boolean_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_(StructFileGrammarParser.Boolean_Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#text_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_(StructFileGrammarParser.Text_Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(StructFileGrammarParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(StructFileGrammarParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tree_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTree_(StructFileGrammarParser.Tree_Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(StructFileGrammarParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#id_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_variable(StructFileGrammarParser.Id_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#variableAsign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAsign(StructFileGrammarParser.VariableAsignContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_asign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_asign(StructFileGrammarParser.Tk_asignContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(StructFileGrammarParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#return_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_(StructFileGrammarParser.Return_Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#id_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_function(StructFileGrammarParser.Id_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_open_bracked}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_open_bracked(StructFileGrammarParser.Tk_open_brackedContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(StructFileGrammarParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#add_variableDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_variableDef(StructFileGrammarParser.Add_variableDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_close_bracked}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_close_bracked(StructFileGrammarParser.Tk_close_brackedContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_open_braces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_open_braces(StructFileGrammarParser.Tk_open_bracesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#functionContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionContent(StructFileGrammarParser.FunctionContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#add_functionContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_functionContent(StructFileGrammarParser.Add_functionContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_close_braces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_close_braces(StructFileGrammarParser.Tk_close_bracesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(StructFileGrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#call_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_parameters(StructFileGrammarParser.Call_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#add_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expression(StructFileGrammarParser.Add_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structures1}
	 * labeled alternative in {@link StructFileGrammarParser#structures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructures1(StructFileGrammarParser.Structures1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code structures2}
	 * labeled alternative in {@link StructFileGrammarParser#structures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructures2(StructFileGrammarParser.Structures2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code structures3}
	 * labeled alternative in {@link StructFileGrammarParser#structures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructures3(StructFileGrammarParser.Structures3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code structures4}
	 * labeled alternative in {@link StructFileGrammarParser#structures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructures4(StructFileGrammarParser.Structures4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code structures5}
	 * labeled alternative in {@link StructFileGrammarParser#structures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructures5(StructFileGrammarParser.Structures5Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(StructFileGrammarParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_if(StructFileGrammarParser.Tk_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#ifContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfContent(StructFileGrammarParser.IfContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#add_ifContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_ifContent(StructFileGrammarParser.Add_ifContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code else_1}
	 * labeled alternative in {@link StructFileGrammarParser#else_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_1(StructFileGrammarParser.Else_1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code else_2}
	 * labeled alternative in {@link StructFileGrammarParser#else_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_2(StructFileGrammarParser.Else_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_else(StructFileGrammarParser.Tk_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#else_ifContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_ifContent(StructFileGrammarParser.Else_ifContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#add_else_ifContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_else_ifContent(StructFileGrammarParser.Add_else_ifContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#switch_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_(StructFileGrammarParser.Switch_Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_switch(StructFileGrammarParser.Tk_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#caseContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseContent(StructFileGrammarParser.CaseContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#add_caseContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_caseContent(StructFileGrammarParser.Add_caseContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#case_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_(StructFileGrammarParser.Case_Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#switchContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchContent(StructFileGrammarParser.SwitchContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#add_switchContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_switchContent(StructFileGrammarParser.Add_switchContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#default_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_(StructFileGrammarParser.Default_Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_(StructFileGrammarParser.While_Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_while(StructFileGrammarParser.Tk_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#whileContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileContent(StructFileGrammarParser.WhileContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#add_whileContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_whileContent(StructFileGrammarParser.Add_whileContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(StructFileGrammarParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_do(StructFileGrammarParser.Tk_doContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#do_whileContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_whileContent(StructFileGrammarParser.Do_whileContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#add_do_whileContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_do_whileContent(StructFileGrammarParser.Add_do_whileContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#for_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_(StructFileGrammarParser.For_Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_for(StructFileGrammarParser.Tk_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#for_rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_rules(StructFileGrammarParser.For_rulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#forContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForContent(StructFileGrammarParser.ForContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#add_forContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_forContent(StructFileGrammarParser.Add_forContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#return_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_call(StructFileGrammarParser.Return_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#add_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_content(StructFileGrammarParser.Add_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(StructFileGrammarParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value1}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue1(StructFileGrammarParser.Value1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code value2}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue2(StructFileGrammarParser.Value2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code value3}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue3(StructFileGrammarParser.Value3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code value4}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue4(StructFileGrammarParser.Value4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code value5}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue5(StructFileGrammarParser.Value5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code value6}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue6(StructFileGrammarParser.Value6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code value7}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue7(StructFileGrammarParser.Value7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code value8}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue8(StructFileGrammarParser.Value8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code value9}
	 * labeled alternative in {@link StructFileGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue9(StructFileGrammarParser.Value9Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#number_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_val(StructFileGrammarParser.Number_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#text_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_val(StructFileGrammarParser.Text_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#boolean_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_val(StructFileGrammarParser.Boolean_valContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression8}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression8(StructFileGrammarParser.Expression8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression6}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression6(StructFileGrammarParser.Expression6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression7}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression7(StructFileGrammarParser.Expression7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression4}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression4(StructFileGrammarParser.Expression4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression5}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression5(StructFileGrammarParser.Expression5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression2}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression2(StructFileGrammarParser.Expression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression3}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression3(StructFileGrammarParser.Expression3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression1}
	 * labeled alternative in {@link StructFileGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1(StructFileGrammarParser.Expression1Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_and(StructFileGrammarParser.Tk_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_or(StructFileGrammarParser.Tk_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_not(StructFileGrammarParser.Tk_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tk_comparator1}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_comparator1(StructFileGrammarParser.Tk_comparator1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tk_comparator2}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_comparator2(StructFileGrammarParser.Tk_comparator2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tk_comparator3}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_comparator3(StructFileGrammarParser.Tk_comparator3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tk_comparator4}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_comparator4(StructFileGrammarParser.Tk_comparator4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tk_comparator5}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_comparator5(StructFileGrammarParser.Tk_comparator5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tk_comparator6}
	 * labeled alternative in {@link StructFileGrammarParser#tk_comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_comparator6(StructFileGrammarParser.Tk_comparator6Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_great_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_great_than(StructFileGrammarParser.Tk_great_thanContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_great_equal_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_great_equal_than(StructFileGrammarParser.Tk_great_equal_thanContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_less_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_less_than(StructFileGrammarParser.Tk_less_thanContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_less_equal_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_less_equal_than(StructFileGrammarParser.Tk_less_equal_thanContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_equal(StructFileGrammarParser.Tk_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_not_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_not_equal(StructFileGrammarParser.Tk_not_equalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tk_operator1}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_operator1(StructFileGrammarParser.Tk_operator1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tk_operator2}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_operator2(StructFileGrammarParser.Tk_operator2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tk_operator3}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_operator3(StructFileGrammarParser.Tk_operator3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tk_operator4}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_operator4(StructFileGrammarParser.Tk_operator4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tk_operator5}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_operator5(StructFileGrammarParser.Tk_operator5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tk_operator6}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_operator6(StructFileGrammarParser.Tk_operator6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tk_operator7}
	 * labeled alternative in {@link StructFileGrammarParser#tk_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_operator7(StructFileGrammarParser.Tk_operator7Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_sum(StructFileGrammarParser.Tk_sumContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_minus(StructFileGrammarParser.Tk_minusContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_mult(StructFileGrammarParser.Tk_multContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_divr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_divr(StructFileGrammarParser.Tk_divrContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_divi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_divi(StructFileGrammarParser.Tk_diviContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_mod(StructFileGrammarParser.Tk_modContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_exp(StructFileGrammarParser.Tk_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tree_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTree_val(StructFileGrammarParser.Tree_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#id_dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_dir(StructFileGrammarParser.Id_dirContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_colon(StructFileGrammarParser.Tk_colonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code direction1}
	 * labeled alternative in {@link StructFileGrammarParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection1(StructFileGrammarParser.Direction1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code direction2}
	 * labeled alternative in {@link StructFileGrammarParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection2(StructFileGrammarParser.Direction2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code file_or_division1}
	 * labeled alternative in {@link StructFileGrammarParser#file_or_division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_or_division1(StructFileGrammarParser.File_or_division1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code file_or_division2}
	 * labeled alternative in {@link StructFileGrammarParser#file_or_division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_or_division2(StructFileGrammarParser.File_or_division2Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(StructFileGrammarParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_open_square_bracked}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_open_square_bracked(StructFileGrammarParser.Tk_open_square_brackedContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#add_directions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_directions(StructFileGrammarParser.Add_directionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_comma(StructFileGrammarParser.Tk_commaContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_close_square_bracked}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_close_square_bracked(StructFileGrammarParser.Tk_close_square_brackedContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#file_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_val(StructFileGrammarParser.File_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#group_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_val(StructFileGrammarParser.Group_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#set_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_group(StructFileGrammarParser.Set_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#add_group_vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_group_vals(StructFileGrammarParser.Add_group_valsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#list_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_val(StructFileGrammarParser.List_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#add_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expressions(StructFileGrammarParser.Add_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#value_extras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_extras(StructFileGrammarParser.Value_extrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#method_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_reference(StructFileGrammarParser.Method_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparator(StructFileGrammarParser.SeparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_dollar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_dollar(StructFileGrammarParser.Tk_dollarContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#tk_double_dollar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_double_dollar(StructFileGrammarParser.Tk_double_dollarContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#default_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_call(StructFileGrammarParser.Default_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#id_function2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_function2(StructFileGrammarParser.Id_function2Context ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#call_default_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_default_parameters(StructFileGrammarParser.Call_default_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructFileGrammarParser#add_default_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_default_expression(StructFileGrammarParser.Add_default_expressionContext ctx);
}