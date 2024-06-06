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
    public boolean isAddBulkAlumni(AlumniMasterModel am)
    {
        boolean b = amrepo.isAddBulkAlumni(am);
        return b;
    }
    public Vector<AlumniMasterModel> getalumni()
    {
        Vector<AlumniMasterModel> v = amrepo.getalumni();
        return v;
    }
    public boolean isAlumniUpdated(AlumniMasterModel am)
    {
        boolean b = amrepo.isAlumniUpdated(am);
        return b;
    }
    public int deleid(AlumniMasterModel am)
    {
        int b = amrepo.deleid(am);
        return b;
    }
    // public Vector<AlumniMasterModel> getsenioralumni()
    // {
    //     Vector<AlumniMasterModel> v = amrepo.getsenioralumni();
    //     return v;
    // }
    public Vector<AlumniMasterModel> sortyearwisealumni()
    {
        Vector<AlumniMasterModel> v = amrepo.sortyearwisealumni();
        return v;
    }
}
