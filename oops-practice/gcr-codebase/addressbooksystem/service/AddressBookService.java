package addressbooksystem.service;

import addressbooksystem.model.Contact;
import java.util.HashMap;
import java.util.Map;

public class AddressBookService {

    private final Map<String, ContactService> addressBooks = new HashMap<>();

    public boolean createAddressBook(String name) {
        if (addressBooks.containsKey(name)) {
            return false;
        }
        addressBooks.put(name, new ContactService());
        return true;
    }

    public ContactService getAddressBook(String name) {
        return addressBooks.get(name);
    }

    public boolean addressBookExists(String name) {
        return addressBooks.containsKey(name);
    }

    public void showAllAddressBooks() {
        if (addressBooks.isEmpty()) {
            System.out.println("No Address Books available.");
        } else {
            System.out.println("Available Address Books:");
            for (String name : addressBooks.keySet()) {
                System.out.println("- " + name);
            }
        }
    }
    
    //UC: 8 Search person by city or state
    public void searchPersonByCityOrState(String value) {

        boolean found = false;

        for (String bookName : addressBooks.keySet()) {

            ContactService service = addressBooks.get(bookName);

            for (Contact contact : service.getAllContacts()) {

                if (contact.getCity().equalsIgnoreCase(value)
                        || contact.getState().equalsIgnoreCase(value)) {

                    System.out.println("[" + bookName + "] " + contact);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No contacts found for: " + value);
        }
    }
    
   

}
