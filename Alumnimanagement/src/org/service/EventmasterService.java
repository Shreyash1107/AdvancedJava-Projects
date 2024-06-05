package org.service;

import java.util.Vector;

import org.model.EventMasterModel;
import org.repository.EventMasterrepository;

public class EventmasterService 
{
    EventMasterrepository emrepo = new EventMasterrepository();
    public boolean isEventAdded(EventMasterModel em)
    {
        boolean b = emrepo.isEventAdded(em);
        return b;
    }
    public Vector<EventMasterModel> getallEvents()
    {
        Vector<EventMasterModel> vect = emrepo.getallEvents();
        return vect;
    }
}
