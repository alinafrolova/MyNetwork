package net.frolova.dao.impl;

import net.frolova.api.model.*;

import java.util.List;

/**
 * Created by Frolova.A on 9/23/15.
 */
public interface MessageDao {
    public void storeMessage(Message message);
    public List<Message> getConversation(Contact contactA, Contact contactB);

}
