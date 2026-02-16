package addressbooksystem.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import addressbooksystem.model.Contact;
import addressbooksystem.repository.ContactRepository;


public class ContactService {

	private final ContactRepository repository=new ContactRepository();
	private final Map<String, List<Contact>> cityMap = new HashMap<>();
	private final Map<String, List<Contact>> stateMap = new HashMap<>();

	
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
		
		//update city map
		cityMap.computeIfAbsent(city.toLowerCase(),k ->new ArrayList<>()).add(newContact);
		
		 // Update State Map
	    stateMap.computeIfAbsent(state.toLowerCase(), k -> new ArrayList<>())
	            .add(newContact);

		System.out.println("Contact added successfully");
	}
	
	public boolean updateContact(String firstName, String newAddress,
	        String newCity, String newState,
	        String newZip, String newPhone, String newEmail) {

	    Contact existingContact = repository.findByfirstName(firstName);

	    if (existingContact == null) {
	        return false;
	    }

	    // Store old city and state
	    String oldCityKey = existingContact.getCity().toLowerCase();
	    String oldStateKey = existingContact.getState().toLowerCase();

	    // Remove from old City Map
	    List<Contact> oldCityList = cityMap.get(oldCityKey);
	    if (oldCityList != null) {
	        oldCityList.remove(existingContact);
	    }

	    // Remove from old State Map
	    List<Contact> oldStateList = stateMap.get(oldStateKey);
	    if (oldStateList != null) {
	        oldStateList.remove(existingContact);
	    }

	    // Now update fields
	    existingContact.setAddress(newAddress);
	    existingContact.setCity(newCity);
	    existingContact.setState(newState);
	    existingContact.setZip(newZip);
	    existingContact.setPhoneNumber(newPhone);
	    existingContact.setEmail(newEmail);

	    // Add to new City Map
	    String newCityKey = newCity.toLowerCase();
	    cityMap.computeIfAbsent(newCityKey, k -> new ArrayList<>())
	           .add(existingContact);

	    // Add to new State Map
	    String newStateKey = newState.toLowerCase();
	    stateMap.computeIfAbsent(newStateKey, k -> new ArrayList<>())
	            .add(existingContact);

	    return true;
	}

	
	public void displayContacts() {
		List<Contact> contacts=repository.getAllContacts();
		
		for(Contact contact:contacts) {
			
			System.out.println("\n"+contact.toString());
		}
		
	
	}
	
	public boolean deleteContact(String firstName) {

	    Contact contact = repository.findByfirstName(firstName);

	    if (contact == null) {
	        return false;
	    }

	    // Remove from City Map
	    String cityKey = contact.getCity().toLowerCase();
	    List<Contact> cityList = cityMap.get(cityKey);
	    if (cityList != null) {
	        cityList.remove(contact);
	    }

	    // Remove from State Map
	    String stateKey = contact.getState().toLowerCase();
	    List<Contact> stateList = stateMap.get(stateKey);
	    if (stateList != null) {
	        stateList.remove(contact);
	    }

	    // Remove from repository
	    repository.deleteByFirstName(firstName);

	    return true;
	}
	
	public void viewPersonsByCity(String city) {
		
		List<Contact> contacts=cityMap.get(city.toLowerCase());
		
		if (contacts == null || contacts.isEmpty()) {
	        System.out.println("No contacts found in city: " + city);
	        return;
	    }
		
		System.out.println("Contacts in "+ city+" :");
		for(Contact contact:contacts) {
			System.out.println(contact);
		}
	}
	
	public void viewPersonsByState(String state) {

	    List<Contact> contacts = stateMap.get(state.toLowerCase());

	    if (contacts == null || contacts.isEmpty()) {
	        System.out.println("No contacts found in state: " + state);
	        return;
	    }

	    System.out.println("Contacts in " + state + ":");
	    for (Contact contact : contacts) {
	        System.out.println(contact);
	    }
	}
	
	//Count contacts by city
	public int countByCity(String city) {
		String cityKey=city.toLowerCase();
		List<Contact> contacts=cityMap.get(cityKey);
		
		if(contacts==null) {
			return 0;
		}
		return contacts.size();
	}
	
	// Count contacts by State
	public int countByState(String state) {

	    String stateKey = state.toLowerCase();
	    List<Contact> contacts = stateMap.get(stateKey);

	    if (contacts == null) {
	        return 0;
	    }

	    return contacts.size();
	}

	public void sortingByName() {
		
		List<Contact> contacts=new ArrayList<>(repository.getAllContacts());
		
		contacts.sort(Comparator.comparing(Contact::getFirstName,String.CASE_INSENSITIVE_ORDER)
				.thenComparing(Contact::getLastName,String.CASE_INSENSITIVE_ORDER));
		
		for(Contact contact:contacts) {
			System.out.println(contact);
		}
	}
	
	public void sortingByCity() {
		
		List<Contact> contacts = new ArrayList<>(repository.getAllContacts());

	    if (contacts.isEmpty()) {
	        System.out.println("No contacts to sort.");
	        return;
	    }

	    contacts.sort(Comparator.comparing(
	            Contact::getCity,
	            String.CASE_INSENSITIVE_ORDER));

	    System.out.println("Contacts sorted by City:");

	    for (Contact contact : contacts) {
	        System.out.println(contact);
	    }
	}
	
	public void sortingByState() {
		
		List<Contact> contacts = new ArrayList<>(repository.getAllContacts());

	    if (contacts.isEmpty()) {
	        System.out.println("No contacts to sort.");
	        return;
	    }

	    contacts.sort(Comparator.comparing(
	            Contact::getState,
	            String.CASE_INSENSITIVE_ORDER));

	    System.out.println("Contacts sorted by State:");

	    for (Contact contact : contacts) {
	        System.out.println(contact);
	    }
	}
	
	public void sortingByZip() {
		
		List<Contact> contacts = new ArrayList<>(repository.getAllContacts());

	    if (contacts.isEmpty()) {
	        System.out.println("No contacts to sort.");
	        return;
	    }

	    contacts.sort(Comparator.comparing(Contact::getZip));

	    System.out.println("Contacts sorted by Zip:");

	    for (Contact contact : contacts) {
	        System.out.println(contact);
	    }
	}
	
	public List<Contact> getAllContacts() {
	    return repository.getAllContacts();
	}
	
	public void saveToFile(String fileName) {
		
		try(BufferedWriter writer =new BufferedWriter(new FileWriter(fileName))){
			
			for(Contact contact:repository.getAllContacts()) {
				
				String line = contact.getFirstName() + "|" +
                        contact.getLastName() + "|" +
                        contact.getAddress() + "|" +
                        contact.getCity() + "|" +
                        contact.getState() + "|" +
                        contact.getZip() + "|" +
                        contact.getPhoneNumber() + "|" +
                        contact.getEmail();
				
				writer.write(line);
				writer.newLine();
				
			}
			
			System.out.println("Contacts saved successfully to file.");
		}catch(IOException e ) {
			System.out.println(e.getMessage());
		}
	}
	
	public void loadFromFile(String fileName) {
		
		try(BufferedReader reader =new BufferedReader(new FileReader(fileName))){
			
			String line;
			
			while((line=reader.readLine())!=null) {
				
				String[] parts=line.split("\\|");
				
				if(parts.length==8) {
					addNewContact(
	                        parts[0], parts[1], parts[2],
	                        parts[3], parts[4], parts[5],
	                        parts[6], parts[7]
	                );
				}
			}
			
			System.out.println("Contacts loaded successfully from file.");

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void saveToCSV(String fileName) {

	    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

	        for (Contact contact : repository.getAllContacts()) {

	            String line = contact.getFirstName() + "," +
	                          contact.getLastName() + "," +
	                          contact.getAddress() + "," +
	                          contact.getCity() + "," +
	                          contact.getState() + "," +
	                          contact.getZip() + "," +
	                          contact.getPhoneNumber() + "," +
	                          contact.getEmail();

	            writer.write(line);
	            writer.newLine();
	        }

	        System.out.println("Contacts saved to CSV successfully.");

	    } catch (IOException e) {
	        System.out.println("Error writing CSV: " + e.getMessage());
	    }
	}

	
	public void loadFromCSV(String fileName) {

	    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

	        String line;

	        while ((line = reader.readLine()) != null) {

	            String[] parts = line.split(",");

	            if (parts.length == 8) {
	                addNewContact(
	                        parts[0], parts[1], parts[2],
	                        parts[3], parts[4], parts[5],
	                        parts[6], parts[7]
	                );
	            }
	        }

	        System.out.println("Contacts loaded from CSV successfully.");

	    } catch (IOException e) {
	        System.out.println("Error reading CSV: " + e.getMessage());
	    }
	}



	
}
