package com.bridgelabz.myproject;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactFunctions {
    public static Scanner sc = new Scanner(System.in);
    public ArrayList<Person> contactList = new ArrayList<>();

    public void addContactDetails() {
        System.out.println("Enter Person contact details\n");
        System.out.println("Enter First Name");
        String firstName = sc.next();
        System.out.println("Enter Last Name");
        String lastName = sc.next();
        System.out.println("Enter Address");
        String address = sc.next();
        System.out.println("Enter City");
        String city = sc.next();
        System.out.println("Enter State");
        String state = sc.next();
        System.out.println("Enter Zip code");
        String zipCode = sc.next();
        System.out.println("Enter Phone Number");
        String phoneNumber = sc.next();
        System.out.println("Enter Email");
        String email = sc.next();

        Person contactDetails = new Person(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
        contactList.add(contactDetails);
        System.out.println(contactDetails);
    }
    public boolean editContactDetails(String Name) {
        int flag = 0;
        for (Person contact : contactList) {
            if (contact.getFirstName().equals(Name)) {

                System.out.println("Select an option to edit\n"
                        + "1] First Name\n" + "2] Last Name\n" + "3] Address\n" + "4] City\n"
                        + "5] State\n" + "6] Zip code\n" + "7] Phone Number\n" + "8] Email\n" );

                int choice = sc.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("Enter First Name : ");
                        String firstName = sc.next();
                        contact.setFirstName(firstName);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter Last Name : ");
                        String lastName = sc.next();
                        contact.setLastName(lastName);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter Address : ");
                        String address = sc.next();
                        contact.setAddress(address);
                        break;
                    }
                    case 4: {
                        System.out.println("Enter City : ");
                        String city = sc.next();
                        contact.setAddress(city);
                        break;
                    }
                    case 5: {
                        System.out.println("Enter State : ");
                        String state = sc.next();
                        contact.setAddress(state);
                        break;
                    }
                    case 6: {
                        System.out.println("Enter Zip code : ");
                        String zipCode = sc.next();
                        contact.setZipCode(zipCode);
                        break;
                    }
                    case 7: {
                        System.out.println("Enter Phone Number : ");
                        String phoneNumber = sc.next();
                        contact.setAddress(phoneNumber);
                        break;
                    }
                    case 8: {
                        System.out.println("Enter Email : ");
                        String email = sc.next();
                        contact.setAddress(email);
                        break;
                    }
                    default:
                        System.out.println("Invalid option!");
                }
            } else return false;
        }
        if ( flag == 1)
            return true;
        else
            return false;
    }

    public boolean display(String Name) {
        int flag = 0;
        for (Person contact : contactList) {
            if (contact.getFirstName().equals(Name))
                System.out.println(contact);
            flag = 1;
            break;
        }
        if (flag == 1)
            return true;
        else
            return false;
    }
}