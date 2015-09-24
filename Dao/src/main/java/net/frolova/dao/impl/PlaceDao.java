package net.frolova.dao.impl;

import net.frolova.api.model.*;
import java.util.Set;

/**
 * Created by Frolova.A on 9/23/15.
 */
public interface PlaceDao {
    public void addPlace(Place place);
    public Set<Contact> getAllContactsWithHobby(Hobby hobby);
}
