package org.repository;

import org.config.DBHelper;
import org.model.AlumniMasterModel;
import java.util.Vector;
import org.model.EventMasterModel;
public class Alumnieventrepository extends DBHelper 
{
       Vector<AlumniMasterModel> v2 = new Vector<AlumniMasterModel>();
    //    public Vector<AlumniMasterModel> getalumniwiseevents()
    //    {
    //         try
    //         {
    //             pstmt = conn.prepareStatement("select am.Aid,am.Name as Alumni_Name,em.Name as Event_Name from AlumniMaster am inner join EventMaster em on am.Bid=em.Bid");
    //             rs = pstmt.executeQuery();
    //             while(rs.next())
    //             {
    //                 AlumniMasterModel amd = new AlumniMasterModel();
    //                 amd.setAid(rs.getInt(1));
    //                 amd.setname(rs.getString(2));
    //                 EventMasterModel em = new EventMasterModel();
    //                 em.setname(rs.getString(3));
    //                 amd.setEventmAsterModel(em);
    //                 v2.add(amd); 
    //             }
    //         }
    //         catch(Exception ex)
    //         {
    //             return null;
    //         }
    //         return null;
    //    }
}
