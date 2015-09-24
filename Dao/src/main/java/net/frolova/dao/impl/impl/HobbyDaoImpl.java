package net.frolova.dao.impl.impl;

import net.frolova.api.model.*;
import net.frolova.dao.impl.HobbyDao;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by Frolova.A on 9/23/15.
 */
@Repository
public class HobbyDaoImpl implements HobbyDao {
    @Override
    public void addHobby(Hobby hobby) {

    }

    @Override
    public Set<Contact> getAllContactsWithHobby(Hobby hobby) {
        return null;
    }
}
