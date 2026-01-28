package assignment.visitor;
/**
 * ItemElement represents an element in the shopping cart
 * that can accept a Visitor.
 *
 * This interface is part of the Visitor Design Pattern.
 * All concrete item classes (Book, Electronics, Grocery)
 * must implement this interface.
 */
public interface ItemElement {
    /**
     * Accepts a visitor and allows it to perform
     * operations on the concrete item.
     *
     * @param visitor the visitor performing the operation
     */
    void accept(Visitor visitor);
}
