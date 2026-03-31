package linkedList;

// Node Class
class ItemNode {

    // Attributes
    int itemId;
    String itemName;
    int quantity;
    double price;

    // Next pointer
    ItemNode next;

    // Constructor
    ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

// Inventory Management Class
class Inventory {

    // Head pointer
    ItemNode head;

    // Insert at beginning
    public void insertAtBeginning(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at specific position (1-based)
    public void insertAtPosition(int id, String name, int qty, double price, int position) {

        if (position == 1) {
            insertAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode newNode = new ItemNode(id, name, qty, price);
        ItemNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete item by ID
    public void deleteByItemId(int id) {

        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item deleted");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item deleted");
        }
    }

    // Update quantity by Item ID
    public void updateQuantity(int id, int newQty) {

        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Item ID
    public void searchByItemId(int id) {

        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Item Name
    public void searchByItemName(String name) {

        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found");
        }
    }

    // Calculate total inventory value
    public void calculateTotalValue() {

        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: " + total);
    }

    // Sort by Item Name (Ascending)
    public void sortByName() {

        if (head == null) return;

        for (ItemNode i = head; i.next != null; i = i.next) {
            for (ItemNode j = i.next; j != null; j = j.next) {

                if (i.itemName.compareToIgnoreCase(j.itemName) > 0) {
                    swapData(i, j);
                }
            }
        }
    }

    // Sort by Price (Ascending)
    public void sortByPrice() {

        if (head == null) return;

        for (ItemNode i = head; i.next != null; i = i.next) {
            for (ItemNode j = i.next; j != null; j = j.next) {

                if (i.price > j.price) {
                    swapData(i, j);
                }
            }
        }
    }

    // Swap data between two nodes
    private void swapData(ItemNode a, ItemNode b) {

        int tempId = a.itemId;
        String tempName = a.itemName;
        int tempQty = a.quantity;
        double tempPrice = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = tempId;
        b.itemName = tempName;
        b.quantity = tempQty;
        b.price = tempPrice;
    }

    // Display single item
    public void displayItem(ItemNode node) {

        System.out.println("Item ID: " + node.itemId);
        System.out.println("Name: " + node.itemName);
        System.out.println("Quantity: " + node.quantity);
        System.out.println("Price: " + node.price);
        System.out.println();
    }

    // Display all items
    public void displayAllItems() {

        if (head == null) {
            System.out.println("Inventory empty");
            return;
        }

        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }
}

// Main Class
public class InventoryManagementSystem {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.insertAtEnd(101, "Keyboard", 10, 500);
        inventory.insertAtEnd(102, "Mouse", 20, 300);
        inventory.insertAtBeginning(103, "Monitor", 5, 7000);
        inventory.insertAtPosition(104, "Laptop", 3, 45000, 2);

        System.out.println("All Items:");
        inventory.displayAllItems();

        inventory.updateQuantity(102, 25);

        System.out.println("Search by ID:");
        inventory.searchByItemId(104);

        System.out.println("Search by Name:");
        inventory.searchByItemName("Mouse");

        inventory.calculateTotalValue();

        System.out.println("Sorted by Name:");
        inventory.sortByName();
        inventory.displayAllItems();

        System.out.println("Sorted by Price:");
        inventory.sortByPrice();
        inventory.displayAllItems();
    }
}
