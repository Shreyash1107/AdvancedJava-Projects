package org.service;

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
}
