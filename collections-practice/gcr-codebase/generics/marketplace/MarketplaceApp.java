package generics.marketplace;

import java.util.ArrayList;
import java.util.List;

public class MarketplaceApp {

    public static void main(String[] args) {

        // Products
        Product<BookCategory> book =
                new Product<>("Java Book", 500, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 800, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Phone", 15000, new GadgetCategory());

        // One catalog holding all product types
        List<Product<? extends Category>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        System.out.println("Before Discount:");
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(catalog.get(i).getDetails());
        }

        // Generic discount method
        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(phone, 5);

        System.out.println("\nAfter Discount:");
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(catalog.get(i).getDetails());
        }
    }
}

