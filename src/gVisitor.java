// Generated from C:/Users/Eugene/Java_projects/compiler_construction/g.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(gParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(gParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(gParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assignment_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_op(gParser.Assignment_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#compound_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_op(gParser.Compound_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#if_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_op(gParser.If_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(gParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(gParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#readln_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadln_op(gParser.Readln_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#writeln_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteln_op(gParser.Writeln_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(gParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#summand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummand(gParser.SummandContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#multiplier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplier(gParser.MultiplierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(gParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(gParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#numericString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericString(gParser.NumericStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(gParser.ExponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#relation_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_op(gParser.Relation_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#add_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_op(gParser.Add_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#mul_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_op(gParser.Mul_opContext ctx);
}