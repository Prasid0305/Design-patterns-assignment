package assignment.visitor;
/**
 * Book represents a book item in the shopping cart.
 * This class holds only data and delegates operations
 * to a Visitor.
 */
public class Book implements ItemElement {
    /**
     * Constructs a Book object.
     *
     * @param name  name of the book
     * @param price price of the book
     */
    private final String name;
    private final int price;
    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
    /**
     * Returns the price of the book.
     *
     * @return book price
     */
    public int getPrice() {
        return price;
    }
    /**
     * Returns the name of the book.
     *
     * @return book name
     */
    public String getName() {
        return name;
    }
    /**
     * Accepts a visitor and calls the appropriate
     * visit method.
     *
     * @param visitor the visitor instance
     */

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

