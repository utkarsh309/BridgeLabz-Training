package addressbooksystem.presentation;

import java.util.Scanner;

import addressbooksystem.service.AddressBookService;
import addressbooksystem.service.ContactService;

public class AddressBookUI {

    private final Scanner scanner = new Scanner(System.in);
    private final AddressBookService systemService = new AddressBookService();

    public void start() {

        boolean running = true;

        while (running) {
            System.out.println("\n Address Book System ");
            System.out.println("1. Create Address Book");
            System.out.println("2. Open Address Book");
            System.out.println("3. Show All Address Books");
            System.out.println("4. Search Person by City/State");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 :
                	createAddressBook();
                	break;
                case 2 :
                	openAddressBook();
                	break;
                case 3 :
                	systemService.showAllAddressBooks();
                	break;
                case 4:
                	searchPerson();
                	break;
                case 5 :
                	running = false;
                	break;
                default :
                	System.out.println("Invalid choice");
            }
        }
    }

    private void createAddressBook() {
        System.out.print("Enter new Address Book name: ");
        String name = scanner.nextLine();

        if (systemService.createAddressBook(name)) {
            System.out.println("Address Book created successfully!");
        } else {
            System.out.println("Address Book with this name already exists!");
        }
    }

    private void openAddressBook() {
        System.out.print("Enter Address Book name to open: ");
        String name = scanner.nextLine();

        if (!systemService.addressBookExists(name)) {
            System.out.println("Address Book not found!");
            return;
        }

        ContactService contactService = systemService.getAddressBook(name);
        addressBookMenu(contactService);
    }
    
    private void searchPerson() {

        System.out.print("Enter City or State to search: ");
        String value = scanner.nextLine();

        systemService.searchPersonByCityOrState(value);
    }


    private void addressBookMenu(ContactService service) {

        boolean active = true;

        while (active) {
        	System.out.println("-------------------------");
            System.out.println("\n Address Book Menu ");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. View Contact By City");
            System.out.println("5. View Contact By State");
            System.out.println("6. Count by City");
            System.out.println("7. Count by City");
            System.out.println("8. Sort By Name");
            System.out.println("15. Back");
            System.out.println("--------------------------");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 :
                	addContact(service);
                	break;
                case 2 :
                	editContact(service);
                	break;
                case 3 :
                	deleteContact(service);
                	break;
                	
                case 4:
                	viewContactByCity(service);//UC-9
                	break;
                	
                case 5:
                	viewContactByState(service);//UC-9
                	break;
                	
                case 6:
                	countByCity(service);//UC-10
                    break;
                case 7:
					countByState(service);//UC-10
					break;
                case 8:
                	sortByName(service); //UC-11
                	break;
                case 9:
                	service.sortingByCity(); //UC-12
                	break;
                case 10:
                	service.sortingByState(); //UC-12
                	break;
                case 11:
                	service.sortingByZip(); //UC-12
                	
                case 15:
                	active = false;
                	break;
                default :
                	System.out.println("Invalid choice");
            }
        }
    }

    private void addContact(ContactService service) {
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("State: ");
        String state = scanner.nextLine();

        System.out.print("Zip: ");
        String zip = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        service.addNewContact(firstName, lastName, address, city, state, zip, phone, email);
    }

    private void editContact(ContactService service) {
        System.out.print("Enter First Name to Edit: ");
        String firstName = scanner.nextLine();

        System.out.print("New Address: ");
        String address = scanner.nextLine();

        System.out.print("New City: ");
        String city = scanner.nextLine();

        System.out.print("New State: ");
        String state = scanner.nextLine();

        System.out.print("New Zip: ");
        String zip = scanner.nextLine();

        System.out.print("New Phone: ");
        String phone = scanner.nextLine();

        System.out.print("New Email: ");
        String email = scanner.nextLine();

        if (service.updateContact(firstName, address, city, state, zip, phone, email)) {
            System.out.println("Contact updated!");
        } else {
            System.out.println("Contact not found!");
        }
    }

    private void deleteContact(ContactService service) {
        System.out.print("Enter First Name to Delete: ");
        String firstName = scanner.nextLine();

        if (service.deleteContact(firstName)) {
            System.out.println("Contact deleted!");
        } else {
            System.out.println("Contact not found!");
        }
    }
    
    private void viewContactByCity(ContactService service) {
    	
    	System.out.println("Enter city to view contact");
    	String city=scanner.nextLine();
    	
    	service.viewPersonsByCity(city);
    }
    
    private void viewContactByState(ContactService service) {
    	
    	System.out.println("Enter state to view contact");
    	String city=scanner.nextLine();
    	
    	service.viewPersonsByCity(city);
    }
    
    private void countByCity(ContactService service) {
    	
    	System.out.print("Enter City: ");
        String city = scanner.nextLine();
        int cityCount = service.countByCity(city);
        System.out.println("Number of contacts in " + city + ": " + cityCount);
    }
    
    private void countByState(ContactService service) {
    	System.out.print("Enter State: ");
		String state = scanner.nextLine();
		int stateCount = service.countByState(state);
		System.out.println("Number of contacts in " + state + ": " + stateCount);
		
    }
    
    private void sortByName(ContactService service) {
    	service.sortingByName();
    }
}
