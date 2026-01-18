package addressbooksystem.controller;

import java.util.Scanner;
import addressbooksystem.service.ContactService;

public class AddressBookController {

    private final ContactService service = new ContactService();
    private final Scanner scanner = new Scanner(System.in);

    public void startApplication() {

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n Address Book Menu ");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addContactFromUser();
                    break;

                case 2:
                    editContactFromUser();
                    break;

                case 3:
                    deleteContactFromUser();
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("Thank you for using Address Book!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void addContactFromUser() {
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter State: ");
        String state = scanner.nextLine();

        System.out.print("Enter Zip: ");
        String zip = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        service.addNewContact(firstName, lastName, address,
                city, state, zip, phoneNumber, email);
    }

    public void editContactFromUser() {
        System.out.print("Enter First Name to Edit: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter New Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter New City: ");
        String city = scanner.nextLine();

        System.out.print("Enter New State: ");
        String state = scanner.nextLine();

        System.out.print("Enter New Zip: ");
        String zip = scanner.nextLine();

        System.out.print("Enter New Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter New Email: ");
        String email = scanner.nextLine();

        boolean isUpdated = service.updateContact(firstName, address, city, state, zip, phone, email);

        if (isUpdated) {
            System.out.println("Contact updated successfully!");
        } else {
            System.out.println("Contact not found!");
        }
    }

    public void deleteContactFromUser() {
        System.out.print("Enter First Name to Delete: ");
        String firstName = scanner.nextLine();

        boolean isDeleted = service.deleteContact(firstName);

        if (isDeleted) {
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact not found!");
        }
    }
}
