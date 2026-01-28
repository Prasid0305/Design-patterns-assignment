package assignment.visitor;
/**
 * Grocery represents a grocery item in the shopping cart.
 */
public class Grocery implements ItemElement {

    private int price;
    private String name;
    /**
     * Constructs a Grocery object.
     *
     * @param name  name of the grocery item
     * @param price price of the item
     */
    public Grocery(String name, int price) {
        this.name = name;
        this.price = price;
    }
    /**
     * Returns the price of the grocery item.
     *
     * @return price
     */
    public int getPrice() {
        return price;
    }
    /**
     * Returns the name of the grocery item.
     *
     * @return item name
     */
    public String getName() {
        return name;
    }
    /**
     * Accepts a visitor to perform operations.
     *
     * @param visitor the visitor instance
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
