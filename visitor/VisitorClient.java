package assignment.visitor;

import java.util.ArrayList;
import java.util.List;
/**
 * VisitorClient demonstrates the use of
 * the Visitor Design Pattern.
 *
 * It creates shopping cart items, applies
 * a PriceCalculatorVisitor, and displays
 * the total cart price.
 */
public class VisitorClient {

    public static void main(String[] args) {

        List<ItemElement> cart = new ArrayList<>();

        cart.add(new Book("Java Basics", 500));
        cart.add(new Book("fire and blood", 1000));
        cart.add(new Electronics("Headphones", 2000));
        cart.add(new Grocery("Rice", 800));

        PriceCalculatorVisitor priceVisitor = new PriceCalculatorVisitor();

        for (ItemElement item : cart) {
            item.accept(priceVisitor);
        }

        System.out.println("Total Cart Price: " + priceVisitor.getTotalPrice());
    }
}
