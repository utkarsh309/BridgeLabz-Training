package addressbooksystem.service;

import java.util.List;

import addressbooksystem.model.Contact;
import addressbooksystem.repository.ContactRepository;

public class ContactService {

	private final ContactRepository repository=new ContactRepository();
	
	public void addNewContact(String firstName, String lastName, String address,
			String city, String state, String zip,
			String phoneNumber, String email) {
		
	
		Contact newContact =new Contact(firstName, lastName, address,
                city, state, zip, phoneNumber, email);
		//UC-7
		// Using Collection contains() which internally uses equals()
		if (repository.getAllContacts().contains(newContact)) {
		    System.out.println("Duplicate contact found. Cannot add!");
		    return;
		}

		repository.addContact(newContact);
		System.out.println("Contact added successfully");
	}
	
	public boolean updateContact(String firstName, String newAddress,
            String newCity, String newState,
            String newZip, String newPhone, String newEmail) {
		
		Contact existingContact=repository.findByfirstName(firstName);
		
		if(existingContact==null) {
			return false;
		}
		
		existingContact.setAddress(newAddress);
	    existingContact.setCity(newCity);
	    existingContact.setState(newState);
	    existingContact.setZip(newZip);
	    existingContact.setPhoneNumber(newPhone);
	    existingContact.setEmail(newEmail);

	    return true;
	}
	
	public void displayContacts() {
		List<Contact> contacts=repository.getAllContacts();
		
		for(Contact contact:contacts) {
			
			System.out.println("\n"+contact.toString());
		}
		
	
	}
	
	public boolean deleteContact(String firstName) {
	    return repository.deleteByFirstName(firstName);
	}
	
	public List<Contact> getAllContacts() {
	    return repository.getAllContacts();
	}


	
}
