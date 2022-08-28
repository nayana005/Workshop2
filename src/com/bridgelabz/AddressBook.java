package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

	ArrayList<Contact> contactsArrayList = new ArrayList<>();
	private HashMap<String, ArrayList<Contact>> addressBookSystem = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	// Method to add new contact
	public void addNewContacts() {

		AddressBook addressBook = new AddressBook();
		Contact contacts = new Contact();

		System.out.println("\nFor adding a new contact enter the following detail");

		// Set the value of contacts detail
		System.out.println("\nEnter Name ");
		contacts.setName(sc.next());
		System.out.println("Enter Age ");
		contacts.setAge(sc.next());
		System.out.println("Enter City ");
		contacts.setCity(sc.next());
		System.out.println("Enter State ");
		contacts.setState(sc.next());
		System.out.println("Enter Phone No. ");
		contacts.setPhoneNo(sc.nextLong());

		// Stored the information in contactsArrayList
		contactsArrayList.add(contacts);

		System.out.println("Enter book name");
		sc.nextLine();
		String addressBookName = sc.nextLine();

		// Checking the condition the book is existed or not
		if(addressBookSystem.containsKey(addressBookName)) {
			ArrayList<Contact> contactList = addressBookSystem.get(addressBookName);
			addressBookSystem.put(addressBookName,contactList);
			System.out.println("Contact added successfully exiting book");
		}

		else {
			ArrayList<Contact> contactsArrayList1 = addressBookSystem.get(addressBookName);
			addressBookSystem.put(addressBookName, contactsArrayList1);
			System.out.println(addressBookName + " Created successfully");
			System.out.println("New contact add to the " + addressBookName);
		}
	}

	// Method for Edit the information of Contact
	public void editContact() {

		if(contactsArrayList.size() > 0) {
			System.out.println("Enter the Name of the person");
			String checkName = sc.next();

			for (int i = 0; i < contactsArrayList.size(); i++) {

				if (contactsArrayList.get(i).getName().equals(checkName)) {

					System.out.println("\nWhat you want to update");
					System.out.println("\nEnter 1. Name \nEnter 2. Age \nEnter 3. City" +
							"\nEnter 4. state \nenter 5.Phone no. \nEnter 6. Exit");
					int num = sc.nextInt();

					switch (num) {

					case 1:
						System.out.println("Enter new Name");
						contactsArrayList.get(i).setName(sc.next());
						break;

					case 2:
						System.out.println("Enter new age");
						contactsArrayList.get(i).setAge(sc.next());
						break;

					case 3:
						System.out.println("Enter new City ");
						contactsArrayList.get(i).setCity(sc.next());
						break;

					case 4:
						System.out.println("Enter new State");
						contactsArrayList.get(i).setState(sc.next());
						break;

					case 8:
						System.out.println("Enter new Phone No");
						contactsArrayList.get(i).setPhoneNo(sc.nextInt());
						break;

					case 9:
						System.out.println("Exit !");
						break;

					default:
						System.out.println("Enter the correct choice !");
						break;
					}
					System.out.println("Contact update successfully !");
					break;
				}
				else
					System.out.println("Contact not founded on " +i +" Position");
			}
		}
		else System.out.println("No Contact Founded !");
	}


	// Method for display all contact
	public void showContacts() {

		if(contactsArrayList.size() > 0) {
			for (int i = 0; i < contactsArrayList.size(); i++) {
				System.out.println("\n"+contactsArrayList);
				break;
			}
		}
		else
			System.out.println("No more Contacts !");
	}
}