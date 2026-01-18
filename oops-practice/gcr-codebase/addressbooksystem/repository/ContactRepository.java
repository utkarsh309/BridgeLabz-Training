package addressbooksystem.repository;

import java.util.List;
import java.util.ArrayList;
import addressbooksystem.model.Contact;

//UC-2: Add new contact to contact list
public class ContactRepository {

	private final List<Contact>contactList=new ArrayList<>();
	
	//Stores Contact
	public void addContact(Contact contact) {
		contactList.add(contact);
	}
	
	//Returns all contacts
	public List<Contact> getAllContacts(){
		return contactList;
	}
	
	//Search contact by first name
	public Contact findByfirstName(String firstName) {
		for(Contact contact:contactList) {
			
			if(contact.getFirstName().equalsIgnoreCase(firstName)) {
				return contact;
			}
		}
		return null;
	}
	
	//Delete contact by first name
	public boolean deleteByFirstName(String firstName) {

		for(Contact contact:contactList) {
			
			if(contact.getFirstName().equalsIgnoreCase(firstName)) {
				contactList.remove(contact);
				return true;
			}
		}
	    return false;
	}
}
