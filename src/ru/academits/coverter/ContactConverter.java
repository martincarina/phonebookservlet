package ru.academits.coverter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ru.academits.model.Contact;

import java.util.List;

public class ContactConverter {
    private Gson gson = new GsonBuilder().create();

    public String convertToJson(List<Contact> contactList) {
        return gson.toJson(contactList);
    }

    public Contact convertFormJson(String contactJson) {
        return gson.fromJson(contactJson, Contact.class);
    }

    public List<Contact> convertFromJsonList(String contactList){
//        return gson.fromJson(contactList, Contact.class);
        return gson.fromJson(contactList, new TypeToken<List<Contact>>(){}.getType());
    }
}
