package org.repository;
import java.util.Vector;
import org.config.DBHelper;
import org.model.EventMasterModel;

public class EventMasterrepository extends DBHelper
{
    Vector <EventMasterModel> v1 = new Vector<EventMasterModel>(); 
    public boolean isEventAdded(EventMasterModel em)
    {
        try
        {
            pstmt = conn.prepareStatement("insert into EventMaster values('0',?,?,?,?,?,?)");
            pstmt.setString(1, em.getname());
            pstmt.setString(2, em.getDate());
            pstmt.setString(3, em.gettime());
            pstmt.setString(4, em.getVenue());
            pstmt.setInt(5, em.getBid());
            pstmt.setString(6, em.getSubject());
            int val;
            val = pstmt.executeUpdate();
            return val>0?true:false;
        }
        catch(Exception ex)
        {
            System.out.println("Error is " + ex);
        }
        return false;
    }
    public Vector<EventMasterModel> getallEvents()
    {
        try
        {
            v1 = new Vector<EventMasterModel>();
            pstmt = conn.prepareStatement("select *from EventMaster");
            rs = pstmt.executeQuery();
            while(rs.next())
            {
                EventMasterModel em = new EventMasterModel();
                em.setEid(rs.getInt(1));
                em.setname(rs.getString(2));
                em.setDate(rs.getString(3));
                em.settie(rs.getString(4));
                em.setVenue(rs.getString(5));
                em.setBid(rs.getInt(6));
                em.setSubject(rs.getString(7));
                v1.add(em);
            }
            if(v1.size()>0)
            {
                return v1;
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
