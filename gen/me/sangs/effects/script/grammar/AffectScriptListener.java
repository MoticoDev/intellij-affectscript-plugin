// Generated from /Users/dsa28s/Desktop/intellij-affectscript-plugin/src/me/sangs/effects/script/grammar/AffectScript.g4 by ANTLR 4.7
package me.sangs.effects.script.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AffectScriptParser}.
 */
public interface AffectScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#affectscript}.
	 * @param ctx the parse tree
	 */
	void enterAffectscript(AffectScriptParser.AffectscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#affectscript}.
	 * @param ctx the parse tree
	 */
	void exitAffectscript(AffectScriptParser.AffectscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportScript}
	 * labeled alternative in {@link AffectScriptParser#usescript}.
	 * @param ctx the parse tree
	 */
	void enterImportScript(AffectScriptParser.ImportScriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportScript}
	 * labeled alternative in {@link AffectScriptParser#usescript}.
	 * @param ctx the parse tree
	 */
	void exitImportScript(AffectScriptParser.ImportScriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Annotations}
	 * labeled alternative in {@link AffectScriptParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(AffectScriptParser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Annotations}
	 * labeled alternative in {@link AffectScriptParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(AffectScriptParser.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateLayer}
	 * labeled alternative in {@link AffectScriptParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreateLayer(AffectScriptParser.CreateLayerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateLayer}
	 * labeled alternative in {@link AffectScriptParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreateLayer(AffectScriptParser.CreateLayerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetProperty}
	 * labeled alternative in {@link AffectScriptParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSetProperty(AffectScriptParser.SetPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetProperty}
	 * labeled alternative in {@link AffectScriptParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSetProperty(AffectScriptParser.SetPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetParameters}
	 * labeled alternative in {@link AffectScriptParser#setprop}.
	 * @param ctx the parse tree
	 */
	void enterSetParameters(AffectScriptParser.SetParametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetParameters}
	 * labeled alternative in {@link AffectScriptParser#setprop}.
	 * @param ctx the parse tree
	 */
	void exitSetParameters(AffectScriptParser.SetParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddLayerToLayer}
	 * labeled alternative in {@link AffectScriptParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAddLayerToLayer(AffectScriptParser.AddLayerToLayerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddLayerToLayer}
	 * labeled alternative in {@link AffectScriptParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAddLayerToLayer(AffectScriptParser.AddLayerToLayerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetValue}
	 * labeled alternative in {@link AffectScriptParser#setvalues}.
	 * @param ctx the parse tree
	 */
	void enterSetValue(AffectScriptParser.SetValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetValue}
	 * labeled alternative in {@link AffectScriptParser#setvalues}.
	 * @param ctx the parse tree
	 */
	void exitSetValue(AffectScriptParser.SetValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpenLayer}
	 * labeled alternative in {@link AffectScriptParser#open}.
	 * @param ctx the parse tree
	 */
	void enterOpenLayer(AffectScriptParser.OpenLayerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpenLayer}
	 * labeled alternative in {@link AffectScriptParser#open}.
	 * @param ctx the parse tree
	 */
	void exitOpenLayer(AffectScriptParser.OpenLayerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShowMessageBox}
	 * labeled alternative in {@link AffectScriptParser#msgbox}.
	 * @param ctx the parse tree
	 */
	void enterShowMessageBox(AffectScriptParser.ShowMessageBoxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShowMessageBox}
	 * labeled alternative in {@link AffectScriptParser#msgbox}.
	 * @param ctx the parse tree
	 */
	void exitShowMessageBox(AffectScriptParser.ShowMessageBoxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShowMessageBoxYesOrNo}
	 * labeled alternative in {@link AffectScriptParser#msgbox}.
	 * @param ctx the parse tree
	 */
	void enterShowMessageBoxYesOrNo(AffectScriptParser.ShowMessageBoxYesOrNoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShowMessageBoxYesOrNo}
	 * labeled alternative in {@link AffectScriptParser#msgbox}.
	 * @param ctx the parse tree
	 */
	void exitShowMessageBoxYesOrNo(AffectScriptParser.ShowMessageBoxYesOrNoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoveReference}
	 * labeled alternative in {@link AffectScriptParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMoveReference(AffectScriptParser.MoveReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoveReference}
	 * labeled alternative in {@link AffectScriptParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMoveReference(AffectScriptParser.MoveReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewReference}
	 * labeled alternative in {@link AffectScriptParser#new_b}.
	 * @param ctx the parse tree
	 */
	void enterNewReference(AffectScriptParser.NewReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewReference}
	 * labeled alternative in {@link AffectScriptParser#new_b}.
	 * @param ctx the parse tree
	 */
	void exitNewReference(AffectScriptParser.NewReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ApplyEffect}
	 * labeled alternative in {@link AffectScriptParser#applyeffect}.
	 * @param ctx the parse tree
	 */
	void enterApplyEffect(AffectScriptParser.ApplyEffectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApplyEffect}
	 * labeled alternative in {@link AffectScriptParser#applyeffect}.
	 * @param ctx the parse tree
	 */
	void exitApplyEffect(AffectScriptParser.ApplyEffectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalFunction}
	 * labeled alternative in {@link AffectScriptParser#returnfunction}.
	 * @param ctx the parse tree
	 */
	void enterNormalFunction(AffectScriptParser.NormalFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalFunction}
	 * labeled alternative in {@link AffectScriptParser#returnfunction}.
	 * @param ctx the parse tree
	 */
	void exitNormalFunction(AffectScriptParser.NormalFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterizedFunction}
	 * labeled alternative in {@link AffectScriptParser#returnfunction}.
	 * @param ctx the parse tree
	 */
	void enterParameterizedFunction(AffectScriptParser.ParameterizedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterizedFunction}
	 * labeled alternative in {@link AffectScriptParser#returnfunction}.
	 * @param ctx the parse tree
	 */
	void exitParameterizedFunction(AffectScriptParser.ParameterizedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AffectScriptParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AffectScriptParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#formal_args}.
	 * @param ctx the parse tree
	 */
	void enterFormal_args(AffectScriptParser.Formal_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#formal_args}.
	 * @param ctx the parse tree
	 */
	void exitFormal_args(AffectScriptParser.Formal_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#param_args}.
	 * @param ctx the parse tree
	 */
	void enterParam_args(AffectScriptParser.Param_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#param_args}.
	 * @param ctx the parse tree
	 */
	void exitParam_args(AffectScriptParser.Param_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#annotation_args}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_args(AffectScriptParser.Annotation_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#annotation_args}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_args(AffectScriptParser.Annotation_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#formal_arg}.
	 * @param ctx the parse tree
	 */
	void enterFormal_arg(AffectScriptParser.Formal_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#formal_arg}.
	 * @param ctx the parse tree
	 */
	void exitFormal_arg(AffectScriptParser.Formal_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#param_arg}.
	 * @param ctx the parse tree
	 */
	void enterParam_arg(AffectScriptParser.Param_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#param_arg}.
	 * @param ctx the parse tree
	 */
	void exitParam_arg(AffectScriptParser.Param_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#annotation_arg}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_arg(AffectScriptParser.Annotation_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#annotation_arg}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_arg(AffectScriptParser.Annotation_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#createkeywords}.
	 * @param ctx the parse tree
	 */
	void enterCreatekeywords(AffectScriptParser.CreatekeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#createkeywords}.
	 * @param ctx the parse tree
	 */
	void exitCreatekeywords(AffectScriptParser.CreatekeywordsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntTypeSpec}
	 * labeled alternative in {@link AffectScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntTypeSpec(AffectScriptParser.IntTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntTypeSpec}
	 * labeled alternative in {@link AffectScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntTypeSpec(AffectScriptParser.IntTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatTypeSpec}
	 * labeled alternative in {@link AffectScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterFloatTypeSpec(AffectScriptParser.FloatTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatTypeSpec}
	 * labeled alternative in {@link AffectScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitFloatTypeSpec(AffectScriptParser.FloatTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringTypeSpec}
	 * labeled alternative in {@link AffectScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStringTypeSpec(AffectScriptParser.StringTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringTypeSpec}
	 * labeled alternative in {@link AffectScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStringTypeSpec(AffectScriptParser.StringTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanTypeSpec}
	 * labeled alternative in {@link AffectScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTypeSpec(AffectScriptParser.BooleanTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanTypeSpec}
	 * labeled alternative in {@link AffectScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTypeSpec(AffectScriptParser.BooleanTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VectorTypeSpec}
	 * labeled alternative in {@link AffectScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVectorTypeSpec(AffectScriptParser.VectorTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VectorTypeSpec}
	 * labeled alternative in {@link AffectScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVectorTypeSpec(AffectScriptParser.VectorTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AffectScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AffectScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#moduleblock}.
	 * @param ctx the parse tree
	 */
	void enterModuleblock(AffectScriptParser.ModuleblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#moduleblock}.
	 * @param ctx the parse tree
	 */
	void exitModuleblock(AffectScriptParser.ModuleblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#setvalblock}.
	 * @param ctx the parse tree
	 */
	void enterSetvalblock(AffectScriptParser.SetvalblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#setvalblock}.
	 * @param ctx the parse tree
	 */
	void exitSetvalblock(AffectScriptParser.SetvalblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#msgblock}.
	 * @param ctx the parse tree
	 */
	void enterMsgblock(AffectScriptParser.MsgblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#msgblock}.
	 * @param ctx the parse tree
	 */
	void exitMsgblock(AffectScriptParser.MsgblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#importfile}.
	 * @param ctx the parse tree
	 */
	void enterImportfile(AffectScriptParser.ImportfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#importfile}.
	 * @param ctx the parse tree
	 */
	void exitImportfile(AffectScriptParser.ImportfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#allstatement}.
	 * @param ctx the parse tree
	 */
	void enterAllstatement(AffectScriptParser.AllstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#allstatement}.
	 * @param ctx the parse tree
	 */
	void exitAllstatement(AffectScriptParser.AllstatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(AffectScriptParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(AffectScriptParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(AffectScriptParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(AffectScriptParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleAssign}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAssign(AffectScriptParser.SimpleAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleAssign}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAssign(AffectScriptParser.SimpleAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAssign}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTypeAssign(AffectScriptParser.TypeAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAssign}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTypeAssign(AffectScriptParser.TypeAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAssignFornewInstance}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTypeAssignFornewInstance(AffectScriptParser.TypeAssignFornewInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAssignFornewInstance}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTypeAssignFornewInstance(AffectScriptParser.TypeAssignFornewInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementAssign}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterElementAssign(AffectScriptParser.ElementAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementAssign}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitElementAssign(AffectScriptParser.ElementAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementAssignForParams}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterElementAssignForParams(AffectScriptParser.ElementAssignForParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementAssignForParams}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitElementAssignForParams(AffectScriptParser.ElementAssignForParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallStatement}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(AffectScriptParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallStatement}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(AffectScriptParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(AffectScriptParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(AffectScriptParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(AffectScriptParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(AffectScriptParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnInStatement}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnInStatement(AffectScriptParser.ReturnInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnInStatement}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnInStatement(AffectScriptParser.ReturnInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(AffectScriptParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link AffectScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(AffectScriptParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#setvalstatement}.
	 * @param ctx the parse tree
	 */
	void enterSetvalstatement(AffectScriptParser.SetvalstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#setvalstatement}.
	 * @param ctx the parse tree
	 */
	void exitSetvalstatement(AffectScriptParser.SetvalstatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetValueStatementByID}
	 * labeled alternative in {@link AffectScriptParser#setvalexpr}.
	 * @param ctx the parse tree
	 */
	void enterSetValueStatementByID(AffectScriptParser.SetValueStatementByIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetValueStatementByID}
	 * labeled alternative in {@link AffectScriptParser#setvalexpr}.
	 * @param ctx the parse tree
	 */
	void exitSetValueStatementByID(AffectScriptParser.SetValueStatementByIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetValueStatementByKey}
	 * labeled alternative in {@link AffectScriptParser#setvalexpr}.
	 * @param ctx the parse tree
	 */
	void enterSetValueStatementByKey(AffectScriptParser.SetValueStatementByKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetValueStatementByKey}
	 * labeled alternative in {@link AffectScriptParser#setvalexpr}.
	 * @param ctx the parse tree
	 */
	void exitSetValueStatementByKey(AffectScriptParser.SetValueStatementByKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#multivariable}.
	 * @param ctx the parse tree
	 */
	void enterMultivariable(AffectScriptParser.MultivariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#multivariable}.
	 * @param ctx the parse tree
	 */
	void exitMultivariable(AffectScriptParser.MultivariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#modulestatement}.
	 * @param ctx the parse tree
	 */
	void enterModulestatement(AffectScriptParser.ModulestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#modulestatement}.
	 * @param ctx the parse tree
	 */
	void exitModulestatement(AffectScriptParser.ModulestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(AffectScriptParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(AffectScriptParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(AffectScriptParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(AffectScriptParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Op}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOp(AffectScriptParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Op}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOp(AffectScriptParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(AffectScriptParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(AffectScriptParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(AffectScriptParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(AffectScriptParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Index}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndex(AffectScriptParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndex(AffectScriptParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegate(AffectScriptParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegate(AffectScriptParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom(AffectScriptParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link AffectScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom(AffectScriptParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetParameterINT}
	 * labeled alternative in {@link AffectScriptParser#setexpr}.
	 * @param ctx the parse tree
	 */
	void enterSetParameterINT(AffectScriptParser.SetParameterINTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetParameterINT}
	 * labeled alternative in {@link AffectScriptParser#setexpr}.
	 * @param ctx the parse tree
	 */
	void exitSetParameterINT(AffectScriptParser.SetParameterINTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetParameterMultipleNum}
	 * labeled alternative in {@link AffectScriptParser#setexpr}.
	 * @param ctx the parse tree
	 */
	void enterSetParameterMultipleNum(AffectScriptParser.SetParameterMultipleNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetParameterMultipleNum}
	 * labeled alternative in {@link AffectScriptParser#setexpr}.
	 * @param ctx the parse tree
	 */
	void exitSetParameterMultipleNum(AffectScriptParser.SetParameterMultipleNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetParameterRGB}
	 * labeled alternative in {@link AffectScriptParser#setexpr}.
	 * @param ctx the parse tree
	 */
	void enterSetParameterRGB(AffectScriptParser.SetParameterRGBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetParameterRGB}
	 * labeled alternative in {@link AffectScriptParser#setexpr}.
	 * @param ctx the parse tree
	 */
	void exitSetParameterRGB(AffectScriptParser.SetParameterRGBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetParameterString}
	 * labeled alternative in {@link AffectScriptParser#setexpr}.
	 * @param ctx the parse tree
	 */
	void enterSetParameterString(AffectScriptParser.SetParameterStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetParameterString}
	 * labeled alternative in {@link AffectScriptParser#setexpr}.
	 * @param ctx the parse tree
	 */
	void exitSetParameterString(AffectScriptParser.SetParameterStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetParameterInValue}
	 * labeled alternative in {@link AffectScriptParser#setexpr}.
	 * @param ctx the parse tree
	 */
	void enterSetParameterInValue(AffectScriptParser.SetParameterInValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetParameterInValue}
	 * labeled alternative in {@link AffectScriptParser#setexpr}.
	 * @param ctx the parse tree
	 */
	void exitSetParameterInValue(AffectScriptParser.SetParameterInValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(AffectScriptParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(AffectScriptParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(AffectScriptParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(AffectScriptParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffectScriptParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(AffectScriptParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffectScriptParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(AffectScriptParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReferenceDefinition}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDefinition(AffectScriptParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReferenceDefinition}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDefinition(AffectScriptParser.ReferenceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterInteger(AffectScriptParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitInteger(AffectScriptParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterFloat(AffectScriptParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitFloat(AffectScriptParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterString(AffectScriptParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitString(AffectScriptParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Vector}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterVector(AffectScriptParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Vector}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitVector(AffectScriptParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteral(AffectScriptParser.TrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteral(AffectScriptParser.TrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteral(AffectScriptParser.FalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link AffectScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteral(AffectScriptParser.FalseLiteralContext ctx);
}