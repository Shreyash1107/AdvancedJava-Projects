package org.service;

import org.model.AlumniMasterModel;
import org.repository.AlumniMasterrepository;

public class AlumniMasterService 
{
    AlumniMasterrepository amrepo = new AlumniMasterrepository();
    public boolean isAddAlumni(AlumniMasterModel am)
    {
        boolean b = amrepo.isAddAlumni(am);
        return b;
    }
}
