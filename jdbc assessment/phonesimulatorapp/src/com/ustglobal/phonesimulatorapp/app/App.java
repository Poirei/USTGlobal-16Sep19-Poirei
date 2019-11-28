package com.ustglobal.phonesimulatorapp.app;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.phonesimulatorapp.dao.ContactDAOInf;
import com.ustglobal.phonesimulatorapp.dto.ContactBean;
import com.ustglobal.phonesimulatorapp.util.ContactManager;

public class App {

	public static void main(String[] args) {

		System.out.println("Press 1 to show all contacts");
		System.out.println("Press 2 to search for contact using name");
		System.out.println("Press 3 to operate on contact");

		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();

		switch (option) {
		case 1:
			System.out.println("-----Contact Names-----");

			ContactDAOInf dao = ContactManager.getContactDAO();
			List<ContactBean> list = dao.getAllContacts();
			int serial = 1;
			for (ContactBean l : list) {
				System.out.println(serial++ + ") " + l.getName());
			}
			break;
		case 2:
			System.out.println("----Contact Info----");

			ContactDAOInf dao1 = ContactManager.getContactDAO();
			System.out.println("Enter the name : ");
			String name = scanner.next();
			ContactBean bean = dao1.searchContact(name);

			System.out.println("Name : " + bean.getName());
			System.out.println("Number : " + bean.getNumber());
			System.out.println("Group_Name : " + bean.getGroup_name());

			System.out.println("\nPress 1 to call.");
			System.out.println("Press 2 to message.");
			System.out.println("Press 3 to go back to main menu.");

			int option1 = scanner.nextInt();

			switch (option1) {
			case 1:
				System.out.println("Calling " + bean.getName());
				System.out.println("Press * to end call.");
				String ch = scanner.next();
				System.out.println("Call ended.");
				break;
			case 2:
				System.out.println("Enter your message....\n");
				String message = scanner.next();
				message += scanner.nextLine();
				if (message != null)
					System.out.println("Sending your message ........\n" + message);
				break;
			case 3:
				//				System.out.println("Press 1 to show all contacts");
				//				System.out.println("Press 2 to search for contact using name");
				//				System.out.println("Press 3 to operate on contact");
				main(new String[0]);
				break;
			default:
				break;
			}

			break;
		case 3:
			System.out.println("----Update Contact----");
			System.out.println("Press 1 to add contact.");
			System.out.println("Press 2 to delete contact.");
			System.out.println("Press 3 to update contact.");

			int option2 = scanner.nextInt();

			switch (option2) {
			case 1:
				ContactBean bean1 = new ContactBean();
				System.out.println("Enter the name..\n");
				String name1 = scanner.next();
				System.out.println("Enter the contact no...\n");
				int number = scanner.nextInt();
				System.out.println("Enter the group name..\n");
				String group_name = scanner.next();
				bean1.setName(name1);
				bean1.setNumber(number);
				bean1.setGroup_name(group_name);
				ContactDAOInf dao11 = ContactManager.getContactDAO();
				int count = dao11.addContact(bean1);
				System.out.println(count + " Row(s) added.");
				break;
			case 2:
				System.out.println("Enter the name to be deleted..\n");
				String name2 = scanner.next();
				ContactDAOInf dao12 = ContactManager.getContactDAO();
				int count1 = dao12.deleteContact(name2);
				System.out.println(count1 + " Row(s) deleted.");
				break;
			case 3:
				ContactBean bean11 = new ContactBean();
				System.out.println("Enter the name...\n");
				bean11.setName(scanner.nextLine());
				System.out.println("Enter the new no...\n");
				bean11.setNumber(scanner.nextInt());
				System.out.println("Enter the new group name...\n");
				bean11.setGroup_name(scanner.nextLine());
				ContactDAOInf dao13 = ContactManager.getContactDAO();
				int count2 = dao13.editContact(bean11);
				System.out.println(count2 + " Row(s) updated.");
			default:
				break;
			}

		default:
			break;
		}
	}

}
