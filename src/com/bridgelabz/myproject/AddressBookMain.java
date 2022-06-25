package com.bridgelabz.myproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    public static Scanner sc = new Scanner(System.in);
    private static ContactFunctions contactFunctions = new ContactFunctions();
    public Map<String, ContactFunctions> addressBookListMap = new HashMap<>();
    private String addressBookName;

    public void addAddressBook(String BookName) {

        boolean flag = true;
        while (flag) {
            System.out.println("1] Add Contact\n" + "2] Display\n" + "3] Edit Contact\n"
                    + "4] Delete Contact\n" + "5] Exit\n" + "Enter your choice\n");

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("enter no of contacts to be added");
                    int noOfContacts = sc.nextInt();
                    for (int i = 0; i < noOfContacts; i++) {
                        contactFunctions.addContactDetails();
                    }
                    addressBookListMap.put(addressBookName, contactFunctions);
                    System.out.println("Address Book Added Successfully");
                    break;
                case 2:
                    System.out.println("Enter Person First Name to Display");
                    String firstName = sc.next();

                    boolean list = contactFunctions.display(firstName);
                    if (list) {
                        System.out.println("Display the Contact");
                    } else {
                        System.out.println("Cannot be Displayed");
                    }
                    break;
                case 3:
                    System.out.println("Enter Person First Name to Edit");
                    String personName = sc.next();

                    boolean listEdited = contactFunctions.editContactDetails(personName);
                    if (listEdited) {
                        System.out.println("List Edited Successfully");
                    } else {
                        System.out.println("List Cannot be Edited");
                    }
                    break;
                case 4:
                    System.out.println("Enter Person First Name to Delete");
                    String name = sc.next();

                    boolean listDeleted = contactFunctions.deleteContact(name);
                    if (listDeleted) {
                        System.out.println("Deleted Contact from the list");
                    } else {
                        System.out.println("List cannot be Deleted");
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {

        AddressBookMain addressBookMain = new AddressBookMain();
        boolean flag = true;
        while (flag) {
            System.out.println("Enter your choice");
            System.out.println("Select an option\n" + "1 Add new Address Book\n" + "2 Find Duplicate Entry in Address Book\n"
                    + "3 Search Contact from a City\n" + "4 Search Contact from a State\n" + "5 Exit\n" + "Enter your Choice\n");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Name of Address Book");
                    String addressBookName = sc.next();
                    if (addressBookMain.addressBookListMap.containsKey(addressBookName)) {
                        System.out.println("The Address Book Already Exists");
                    } else {
                        addressBookMain.addAddressBook(addressBookName);
                    }
                    break;
            }
        }
    }
}