package scenerioBased2;

import java.util.ArrayList;
import java.util.List;

// Main class
public class PhoneContactOrganizer {

    public static void main(String[] args) {

        ContactManager manager = new ContactManager();

        try {
            manager.addContact("Utkarsh", "9876543210");
            manager.addContact("Aditya", "9123456789");

            // Duplicate phone number
            manager.addContact("Rahul", "9876543210");

        } catch (InvalidPhoneNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Search contact
        manager.searchContact("9876543210");

        // Delete contact
        manager.deleteContact("9123456789");

        // Display all contacts
        manager.displayContacts();
    }
}

//Contact Class
class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

//Contact Manager class
class ContactManager {

    private List<Contact> contacts = new ArrayList<>();

    // Add contact
    public void addContact(String name, String phoneNumber)
            throws InvalidPhoneNumberException {

        // Validate phone number
        if (phoneNumber.length() != 10) {
            throw new InvalidPhoneNumberException("Phone number must be exactly 10 digits.");
        }

        // Prevent duplicate phone number
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Duplicate contact not allowed.");
                return;
            }
        }

        contacts.add(new Contact(name, phoneNumber));
        System.out.println("Contact added: " + name);
    }

    // Search contact
    public void searchContact(String phoneNumber) {

        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Contact Found: " + contact.getName() + " - " + contact.getPhoneNumber());
                return;
            }
        }

        System.out.println("Contact not found.");
    }

    // Delete contact
    public void deleteContact(String phoneNumber) {

        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                contacts.remove(contact);
                System.out.println("Contact deleted successfully.");
                return;
            }
        }

        System.out.println("Contact not found for deletion.");
    }

    // Display all contacts
    public void displayContacts() {

        System.out.println("Contact List:");
        for (Contact contact : contacts) {
            System.out.println(contact.getName()+" - "+ contact.getPhoneNumber());
        }
    }
}

//Custom Exception
class InvalidPhoneNumberException extends Exception {

    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}
