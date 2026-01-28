package assignment.visitor;

/**
 * PriceCalculatorVisitor is a concrete Visitor
 * that calculates the total price of items
 * in the shopping cart.
 *
 * Pricing rules:
 * - Books: 10% discount
 * - Electronics: 18% tax
 * - Grocery: no discount or tax
 */
public class PriceCalculatorVisitor implements Visitor {

    private int totalPrice = 0;
    /**
     * Calculates discounted price for books.
     *
     * @param book the Book object
     */
    @Override
    public void visit(Book book) {
        int price = book.getPrice();
        int discount = price * 10 / 100;
        totalPrice += (price - discount);

        System.out.println("Book: " + book.getName() + ", Price after discount: " + (price - discount));
        System.out.println("total price of books:"+totalPrice);
    }
    /**
     * Calculates taxed price for electronics.
     *
     * @param electronics the Electronics object
     */
    @Override
    public void visit(Electronics electronics) {
        int price = electronics.getPrice();
        int tax = price * 18 / 100;
        totalPrice += (price + tax);

        System.out.println("Electronics: " + electronics.getName() + ",Price after tax: " + (price + tax));
    }
    /**
     * Calculates price for grocery items.
     *
     * @param grocery the Grocery object
     */
    @Override
    public void visit(Grocery grocery) {
        int price = grocery.getPrice();
        totalPrice += price;

        System.out.println("Grocery: " + grocery.getName() + ",Price: " + price);
    }
    /**
     * Returns the total calculated price of the cart.
     *
     * @return total price
     */
    public int getTotalPrice() {
        return totalPrice;
    }
}
