//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.8
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from G:/Dev/Carbon/Carbon/Parser/Grammar\Carbon.g4 by ANTLR 4.8

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="ICarbonVisitor{Result}"/>,
/// which can be extended to create a visitor which only needs to handle a subset
/// of the available methods.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.8")]
[System.CLSCompliant(false)]
public partial class CarbonBaseVisitor<Result> : AbstractParseTreeVisitor<Result>, ICarbonVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.carbon"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitCarbon([NotNull] CarbonParser.CarbonContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.symbol_id"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitSymbol_id([NotNull] CarbonParser.Symbol_idContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.preproc"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPreproc([NotNull] CarbonParser.PreprocContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.pp_import"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPp_import([NotNull] CarbonParser.Pp_importContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.pp_define"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPp_define([NotNull] CarbonParser.Pp_defineContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.statement"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitStatement([NotNull] CarbonParser.StatementContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.expr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitExpr([NotNull] CarbonParser.ExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.classExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitClassExpr([NotNull] CarbonParser.ClassExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.interfaceExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitInterfaceExpr([NotNull] CarbonParser.InterfaceExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.inheritListExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitInheritListExpr([NotNull] CarbonParser.InheritListExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.procCallExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitProcCallExpr([NotNull] CarbonParser.ProcCallExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.bodyExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitBodyExpr([NotNull] CarbonParser.BodyExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.groupExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitGroupExpr([NotNull] CarbonParser.GroupExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.fncGroupExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitFncGroupExpr([NotNull] CarbonParser.FncGroupExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.forGroupExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitForGroupExpr([NotNull] CarbonParser.ForGroupExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.whileGroupExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitWhileGroupExpr([NotNull] CarbonParser.WhileGroupExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.indexExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitIndexExpr([NotNull] CarbonParser.IndexExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.gotoExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitGotoExpr([NotNull] CarbonParser.GotoExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.varDeclExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitVarDeclExpr([NotNull] CarbonParser.VarDeclExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.propDefExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPropDefExpr([NotNull] CarbonParser.PropDefExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.propGetExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPropGetExpr([NotNull] CarbonParser.PropGetExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.propSetExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPropSetExpr([NotNull] CarbonParser.PropSetExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.fncDeclExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitFncDeclExpr([NotNull] CarbonParser.FncDeclExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.ctrlCndExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitCtrlCndExpr([NotNull] CarbonParser.CtrlCndExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.ctrlWhileExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitCtrlWhileExpr([NotNull] CarbonParser.CtrlWhileExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.ctrlForExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitCtrlForExpr([NotNull] CarbonParser.CtrlForExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.setExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitSetExpr([NotNull] CarbonParser.SetExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.mathUnExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitMathUnExpr([NotNull] CarbonParser.MathUnExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.mathBinExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitMathBinExpr([NotNull] CarbonParser.MathBinExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.compValExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitCompValExpr([NotNull] CarbonParser.CompValExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.logicBinExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitLogicBinExpr([NotNull] CarbonParser.LogicBinExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.logicUnExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitLogicUnExpr([NotNull] CarbonParser.LogicUnExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.valueExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitValueExpr([NotNull] CarbonParser.ValueExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.mathUnLeftExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitMathUnLeftExpr([NotNull] CarbonParser.MathUnLeftExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.mathUnRightExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitMathUnRightExpr([NotNull] CarbonParser.MathUnRightExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.boolValsExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitBoolValsExpr([NotNull] CarbonParser.BoolValsExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CarbonParser.ctrlKwExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitCtrlKwExpr([NotNull] CarbonParser.CtrlKwExprContext context) { return VisitChildren(context); }
}