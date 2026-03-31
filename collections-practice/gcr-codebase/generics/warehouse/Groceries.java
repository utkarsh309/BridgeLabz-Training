package generics.warehouse;

public class Groceries extends WarehouseItem {

    public Groceries(String name) {
        super(name);
    }

    public String getDetails() {
        return "Groceries: " + getName();
    }
}