package org.service;

import java.util.List;
import java.util.Vector;

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
    public List<AlumniMasterModel> getalumni()
    {
        List<AlumniMasterModel> v = amrepo.getalumni();
        return v;
    }
    public boolean isAlumniUpdated(AlumniMasterModel am)
    {
        boolean b = amrepo.isAlumniUpdated(am);
        return b;
    }
}
