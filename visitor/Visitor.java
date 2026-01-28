package assignment.visitor;
/**
 * Visitor interface declares visit methods for each
 * concrete item type.
 *
 * This enables performing different operations on
 * item objects without modifying their classes.
 */
public interface Visitor {
    /**
     * Visit a Book item.
     *
     * @param book the Book object
     */
    void visit(Book book);
    /**
     * Visit an Electronics item.
     *
     * @param electronics the Electronics object
     */
    void visit(Electronics electronics);
    /**
     * Visit a Grocery item.
     *
     * @param grocery the Grocery object
     */
    void visit(Grocery grocery);
}
