package addressbooksystem.controller;

import addressbooksystem.service.ContactService;
import java.util.Scanner;

public class AddressBookController {

	private final ContactService service=new ContactService();
	private final Scanner scanner=new Scanner(System.in);
	
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
