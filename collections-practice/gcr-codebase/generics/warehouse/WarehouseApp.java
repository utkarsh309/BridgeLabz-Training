package generics.warehouse;

public class WarehouseApp {

	public static void main(String[] args) {
		
		//Electronics Storage
		Storage<Electronics> electronics=new Storage<>();
		electronics.addItem(new Electronics("Laptop"));
        electronics.addItem(new Electronics("Mobile"));

        // Grocery storage
        Storage<Groceries> groceries = new Storage<>();
        groceries.addItem(new Groceries("Rice"));
        groceries.addItem(new Groceries("Milk"));

        // Furniture storage
        Storage<Furniture> furniture = new Storage<>();
        furniture.addItem(new Furniture("Chair"));
        furniture.addItem(new Furniture("Table"));

        // Wildcard method displays everything
        Storage.displayItems(electronics.getItems());
        Storage.displayItems(groceries.getItems());
        Storage.displayItems(furniture.getItems());
	}

}
