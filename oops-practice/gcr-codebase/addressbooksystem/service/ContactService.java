package addressbooksystem.service;

import addressbooksystem.repository.ContactRepository;
import addressbooksystem.model.Contact;

public class ContactService {

	private final ContactRepository repository=new ContactRepository();
	
	public void addNewContact(String firstName, String lastName, String address,
			String city, String state, String zip,
			String phoneNumber, String email) {

		Contact contact =new Contact(firstName, lastName, address,
                city, state, zip, phoneNumber, email);
		
		repository.addContact(contact);
		
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
	
	public boolean deleteContact(String firstName) {
	    return repository.deleteByFirstName(firstName);
	}

	
}
