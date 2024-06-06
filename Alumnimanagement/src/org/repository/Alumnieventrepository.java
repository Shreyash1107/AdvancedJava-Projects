package org.repository;

import org.config.DBHelper;
import org.model.AlumniMasterModel;
import java.util.Vector;
import org.model.EventMasterModel;
public class Alumnieventrepository extends DBHelper 
{
       Vector<AlumniMasterModel> v2 = new Vector<AlumniMasterModel>();
       public Vector<AlumniMasterModel> getalumniwiseevents(String eventname)
       {
            try
            {
                v2 = new Vector<AlumniMasterModel>();
                pstmt = conn.prepareStatement(" select am.Aid as Aid,am.Name as Alumni_Name,am.Company as Company_Naame from AlumniMaster am inner join EventMaster em on am.Bid=em.Bid where em.Name =?");
                pstmt.setString(1, eventname);
                rs = pstmt.executeQuery();
                while(rs.next())
                {
                    AlumniMasterModel amd = new AlumniMasterModel();
                    amd.setAid(rs.getInt(1));
                    amd.setname(rs.getString(2));
                    amd.setCompany(rs.getString(3));
                    // EventMasterModel em = new EventMasterModel();
                    // amd.setEventmAsterModel(em);
                    v2.add(amd); 
                }
                if(v2.size()>0)
                {
                    return v2;
                }
                else
                {
                    return null;
                }
            }
            catch(Exception ex)
            {
                return null;
            }
       }
}
