package org.service;

import java.util.Vector;

import org.model.AlumniMasterModel;
import org.repository.Alumnieventrepository;

public class AlumniEventService
{
    Alumnieventrepository aerepo = new Alumnieventrepository();
     public Vector<AlumniMasterModel> getalumniwiseevents(String eventname)
     {
         Vector<AlumniMasterModel> v = aerepo.getalumniwiseevents(eventname);
         return v;
     }
}
