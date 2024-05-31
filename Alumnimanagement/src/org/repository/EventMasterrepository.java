package org.repository;

import org.config.DBHelper;
import org.model.EventMasterModel;

public class EventMasterrepository extends DBHelper
{
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
            pstmt.setInt(6, em.getAid());
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
}
