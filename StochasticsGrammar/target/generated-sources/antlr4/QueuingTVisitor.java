// Generated from QueuingT.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QueuingTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QueuingTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo(QueuingTParser.CodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(QueuingTParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(QueuingTParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#network_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork_description(QueuingTParser.Network_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#node_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_description(QueuingTParser.Node_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#node_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_property(QueuingTParser.Node_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnection(QueuingTParser.ConnectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#id_con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_con(QueuingTParser.Id_conContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#footer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFooter(QueuingTParser.FooterContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#stime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStime(QueuingTParser.StimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#analitics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalitics(QueuingTParser.AnaliticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueuingTParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(QueuingTParser.PropertyContext ctx);
}