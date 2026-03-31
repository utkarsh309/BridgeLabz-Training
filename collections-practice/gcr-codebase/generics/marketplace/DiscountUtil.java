package generics.marketplace;

public class DiscountUtil {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

        double price = product.getPrice();
        double discounted = price - (price * percentage / 100);

        product.setPrice(discounted);
        System.out.println("Discount applied: " + percentage + "%");
    }
}
