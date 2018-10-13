package ru.academits.servlet;

import ru.academits.PhoneBook;
import ru.academits.coverter.ContactConverter;
import ru.academits.model.Contact;
import ru.academits.service.ContactService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveSelectedContactsServlet extends HttpServlet {
    private ContactService phoneBookService = PhoneBook.phoneBookService;
    private ContactConverter contactConverter = PhoneBook.contactConverter;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List<Contact> contactList = phoneBookService.getAllContacts();

/*            String contactJsonList = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
            List<Contact> contacts = contactConverter.convertFromJsonList(contactJsonList);

            for (Contact contactToDelete : contacts) {
                int idToDelete = contactToDelete.getId();
                contactList.removeIf(contact -> contact.getId() == idToDelete);
            }*/

            String[] ids = req.getParameterValues("ids[]");

            for (String id : ids) {
                int idToDelete = Integer.parseInt(id);
                contactList.removeIf(contact -> contact.getId() == idToDelete);
            }
        } catch (Exception e) {
            System.out.println("error in GetAllContactsServlet GET: ");
            e.printStackTrace();
        }
    }
}

