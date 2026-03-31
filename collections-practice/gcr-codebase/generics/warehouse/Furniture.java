package generics.warehouse;

public class Furniture extends WarehouseItem {

    public Furniture(String name) {
        super(name);
    }

    public String getDetails() {
        return "Furniture: " + getName();
    }
}
