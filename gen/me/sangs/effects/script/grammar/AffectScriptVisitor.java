// Generated from /Users/dsa28s/Desktop/intellij-affectscript-plugin/src/me/sangs/effects/script/grammar/AffectScript.g4 by ANTLR 4.7
package me.sangs.effects.script.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AffectScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AffectScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#affectscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectscript(AffectScriptParser.AffectscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportScript}
	 * labeled alternative in {@link AffectScriptParser#usescript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportScript(AffectScriptParser.ImportScriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Annotations}
	 * labeled alternative in {@link AffectScriptParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotations(AffectScriptParser.AnnotationsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateLayer}
	 * labeled alternative in {@link AffectScriptParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLayer(AffectScriptParser.CreateLayerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetProperty}
	 * labeled alternative in {@link AffectScriptParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetProperty(AffectScriptParser.SetPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetParameters}
	 * labeled alternative in {@link AffectScriptParser#setprop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetParameters(AffectScriptParser.SetParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddLayerToLayer}
	 * labeled alternative in {@link AffectScriptParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddLayerToLayer(AffectScriptParser.AddLayerToLayerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetValue}
	 * labeled alternative in {@link AffectScriptParser#setvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetValue(AffectScriptParser.SetValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpenLayer}
	 * labeled alternative in {@link AffectScriptParser#open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenLayer(AffectScriptParser.OpenLayerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShowMessageBox}
	 * labeled alternative in {@link AffectScriptParser#msgbox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMessageBox(AffectScriptParser.ShowMessageBoxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShowMessageBoxYesOrNo}
	 * labeled alternative in {@link AffectScriptParser#msgbox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMessageBoxYesOrNo(AffectScriptParser.ShowMessageBoxYesOrNoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoveReference}
	 * labeled alternative in {@link AffectScriptParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveReference(AffectScriptParser.MoveReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewReference}
	 * labeled alternative in {@link AffectScriptParser#new_b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewReference(AffectScriptParser.NewReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ApplyEffect}
	 * labeled alternative in {@link AffectScriptParser#applyeffect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyEffect(AffectScriptParser.ApplyEffectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalFunction}
	 * labeled alternative in {@link AffectScriptParser#returnfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFunction(AffectScriptParser.NormalFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterizedFunction}
	 * labeled alternative in {@link AffectScriptParser#returnfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterizedFunction(AffectScriptParser.ParameterizedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(AffectScriptParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#formal_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_args(AffectScriptParser.Formal_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#param_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_args(AffectScriptParser.Param_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#annotation_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation_args(AffectScriptParser.Annotation_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#formal_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_arg(AffectScriptParser.Formal_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#param_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_arg(AffectScriptParser.Param_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#annotation_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation_arg(AffectScriptParser.Annotation_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#createkeywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatekeywords(AffectScriptParser.CreatekeywordsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntTypeSpec}
	 * labeled alternative in {@link AffectScriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntTypeSpec(AffectScriptParser.IntTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatTypeSpec}
	 * labeled alternative in {@link AffectScriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatTypeSpec(AffectScriptParser.FloatTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringTypeSpec}
	 * labeled alternative in {@link AffectScriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTypeSpec(AffectScriptParser.StringTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanTypeSpec}
	 * labeled alternative in {@link AffectScriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTypeSpec(AffectScriptParser.BooleanTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VectorTypeSpec}
	 * labeled alternative in {@link AffectScriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorTypeSpec(AffectScriptParser.VectorTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AffectScriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#moduleblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleblock(AffectScriptParser.ModuleblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#setvalblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetvalblock(AffectScriptParser.SetvalblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#msgblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsgblock(AffectScriptParser.MsgblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#importfile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportfile(AffectScriptParser.ImportfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#allstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllstatement(AffectScriptParser.AllstatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(AffectScriptParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(AffectScriptParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleAssign}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssign(AffectScriptParser.SimpleAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAssign}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAssign(AffectScriptParser.TypeAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAssignFornewInstance}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAssignFornewInstance(AffectScriptParser.TypeAssignFornewInstanceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementAssign}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAssign(AffectScriptParser.ElementAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementAssignForParams}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAssignForParams(AffectScriptParser.ElementAssignForParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallStatement}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(AffectScriptParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(AffectScriptParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(AffectScriptParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnInStatement}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnInStatement(AffectScriptParser.ReturnInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(AffectScriptParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#setvalstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetvalstatement(AffectScriptParser.SetvalstatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetValueStatementByID}
	 * labeled alternative in {@link AffectScriptParser#setvalexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetValueStatementByID(AffectScriptParser.SetValueStatementByIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetValueStatementByKey}
	 * labeled alternative in {@link AffectScriptParser#setvalexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetValueStatementByKey(AffectScriptParser.SetValueStatementByKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#multivariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultivariable(AffectScriptParser.MultivariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#modulestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulestatement(AffectScriptParser.ModulestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#vardef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardef(AffectScriptParser.VardefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(AffectScriptParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Op}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(AffectScriptParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(AffectScriptParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(AffectScriptParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(AffectScriptParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(AffectScriptParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(AffectScriptParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetParameterINT}
	 * labeled alternative in {@link AffectScriptParser#setexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetParameterINT(AffectScriptParser.SetParameterINTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetParameterMultipleNum}
	 * labeled alternative in {@link AffectScriptParser#setexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetParameterMultipleNum(AffectScriptParser.SetParameterMultipleNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetParameterRGB}
	 * labeled alternative in {@link AffectScriptParser#setexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetParameterRGB(AffectScriptParser.SetParameterRGBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetParameterString}
	 * labeled alternative in {@link AffectScriptParser#setexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetParameterString(AffectScriptParser.SetParameterStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetParameterInValue}
	 * labeled alternative in {@link AffectScriptParser#setexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetParameterInValue(AffectScriptParser.SetParameterInValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(AffectScriptParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#call_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_expr(AffectScriptParser.Call_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffectScriptParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(AffectScriptParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReferenceDefinition}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceDefinition(AffectScriptParser.ReferenceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(AffectScriptParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(AffectScriptParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(AffectScriptParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Vector}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(AffectScriptParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteral(AffectScriptParser.TrueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteral(AffectScriptParser.FalseLiteralContext ctx);
}