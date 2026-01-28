package assignment.visitor;
/**
 * Electronics represents an electronic item in the cart.
 * This class does not contain pricing logic.
 */
public class Electronics implements ItemElement {

    private int price;
    private String name;
    /**
     * Constructs an Electronics object.
     *
     * @param name  name of the electronic item
     * @param price price of the item
     */
    public Electronics(String name, int price) {
        this.name = name;
        this.price = price;
    }
    /**
     * Returns the price of the electronic item.
     *
     * @return price
     */

    public int getPrice() {
        return price;
    }
    /**
     * Returns the name of the electronic item.
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
