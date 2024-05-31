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
    // public void viewalumni()
    // {
    //     try
    //     {
    //         Vector<AlumniMasterModel> v = amrepo.getalumni();
    //         if(v!=null)
    //         {
    //             System.out.println("Alumni are present in Database.....");
    //             System.out.println(" ");
    //             for(AlumniMasterModel am : v)
    //             {
    //                 System.out.println(am.getid() + " " + am.getname() + " " + am.getEmail() + " " + am.getContact() + " " + am.getAge() + " " + am.getCompany() + " " +am.getBid());
    //             }
    //         }
    //         else
    //         {
    //             System.out.println("Data is not present in database.....");
    //         }
    //     }
    //     catch(Exception ex)
    //     {
    //         System.out.println("Error is " + ex);
    //     }
    // }
}
