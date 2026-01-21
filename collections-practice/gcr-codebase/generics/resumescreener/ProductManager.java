package generics.resumescreener;

public class ProductManager extends JobRole {

    public ProductManager(String name) {
        super(name);
    }

    @Override
    public String getRoleType() {
        return "Product Manager";
    }
}

