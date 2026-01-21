package generics.warehouse;

public class Electronics extends WarehouseItem {

    public Electronics(String name) {
        super(name);
    }

    public String getDetails() {
        return "Electronics: " + getName();
    }
}