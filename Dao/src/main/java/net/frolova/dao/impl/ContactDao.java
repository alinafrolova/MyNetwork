package net.frolova.dao.impl;

import net.frolova.api.model.*;

import java.util.List;

/**
 * Created by Frolova.A on 9/23/15.
 */
public interface  ContactDao {
    public void addContact(Contact contact);
    public void deleteContact(Contact contact);
    public void addFriendShip(Contact contact);
    public void removeFriendShip(Contact contact);

    public List<Contact> getAllContacts();
    public void clearAll();


}
