package ru.academits.exec;

import ru.academits.dao.ContactDao;
import ru.academits.model.Contact;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContactDao contactList = new ContactDao();
        Contact contact1 = new Contact();
        contact1.setFirstName("Вася");
        contact1.setLastName("Петров");
        contact1.setPhone("123456789");
        contactList.add(contact1);
        Contact contact2 = new Contact();
        contact2.setFirstName("Костя");
        contact2.setLastName("Кузнецов");
        contact2.setPhone("123876543");
        contactList.add(contact2);

        List<Contact> contactArrayList = contactList.getAllContacts();
        for (Contact contact : contactArrayList) {
            System.out.printf("%d. %s %s %s", contact.getId(), contact.getFirstName(), contact.getLastName(), contact.getPhone());
            System.out.println();
        }

        int idToDelete = 2;

        contactArrayList.removeIf(contact -> contact.getId() == idToDelete);

        for (Contact contact : contactArrayList) {
            System.out.printf("%d. %s %s %s", contact.getId(), contact.getFirstName(), contact.getLastName(), contact.getPhone());
            System.out.println();
        }
    }
}
