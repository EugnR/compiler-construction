// Generated from C:/Users/Eugene/Java_projects/compiler_construction/g.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(gParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(gParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(gParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(gParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignment_op}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_op(gParser.Assignment_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignment_op}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_op(gParser.Assignment_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#compound_op}.
	 * @param ctx the parse tree
	 */
	void enterCompound_op(gParser.Compound_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#compound_op}.
	 * @param ctx the parse tree
	 */
	void exitCompound_op(gParser.Compound_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#if_op}.
	 * @param ctx the parse tree
	 */
	void enterIf_op(gParser.If_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#if_op}.
	 * @param ctx the parse tree
	 */
	void exitIf_op(gParser.If_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(gParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(gParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(gParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(gParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#readln_op}.
	 * @param ctx the parse tree
	 */
	void enterReadln_op(gParser.Readln_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#readln_op}.
	 * @param ctx the parse tree
	 */
	void exitReadln_op(gParser.Readln_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#writeln_op}.
	 * @param ctx the parse tree
	 */
	void enterWriteln_op(gParser.Writeln_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#writeln_op}.
	 * @param ctx the parse tree
	 */
	void exitWriteln_op(gParser.Writeln_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(gParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(gParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#summand}.
	 * @param ctx the parse tree
	 */
	void enterSummand(gParser.SummandContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#summand}.
	 * @param ctx the parse tree
	 */
	void exitSummand(gParser.SummandContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#multiplier}.
	 * @param ctx the parse tree
	 */
	void enterMultiplier(gParser.MultiplierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#multiplier}.
	 * @param ctx the parse tree
	 */
	void exitMultiplier(gParser.MultiplierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(gParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(gParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(gParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(gParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#numericString}.
	 * @param ctx the parse tree
	 */
	void enterNumericString(gParser.NumericStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#numericString}.
	 * @param ctx the parse tree
	 */
	void exitNumericString(gParser.NumericStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterExponent(gParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitExponent(gParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#relation_op}.
	 * @param ctx the parse tree
	 */
	void enterRelation_op(gParser.Relation_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#relation_op}.
	 * @param ctx the parse tree
	 */
	void exitRelation_op(gParser.Relation_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(gParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(gParser.Add_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#mul_op}.
	 * @param ctx the parse tree
	 */
	void enterMul_op(gParser.Mul_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#mul_op}.
	 * @param ctx the parse tree
	 */
	void exitMul_op(gParser.Mul_opContext ctx);
}