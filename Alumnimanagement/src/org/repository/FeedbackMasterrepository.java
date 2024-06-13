package org.repository;

import java.util.Vector;

import org.config.DBHelper;
import org.model.AlumniMasterModel;
import org.model.EventMasterModel;
import org.model.FeedbackMasterModel;

public class FeedbackMasterrepository extends DBHelper 
{
    Vector <FeedbackMasterModel> vect = null;
    public boolean isFeedbackadded(FeedbackMasterModel fm)
    {
        try
        {
            pstmt = conn.prepareStatement("insert into FeedbackMaster values(?,?,?,?)");
            pstmt.setInt(1, fm.getAid());
            pstmt.setInt(2, fm.getEid());
            pstmt.setString(3, fm.getdetails());
            pstmt.setInt(4, fm.getRating());
            // pstmt.executeUpdate();
            return pstmt.executeUpdate()>0?true:false;
        }
        catch(Exception ex)
        {
            System.out.println("Error is " + ex);
        }
        return false;
    }
    public Vector<FeedbackMasterModel> getfeedback()
    {
        vect = new Vector<FeedbackMasterModel>();
        try
        {
            pstmt = conn.prepareStatement("select am.Name as alumni_Name,em.Name as Event_Name,fm.details as feedback,fm.rating as Ratings from AlumniMaster am inner join FeedbackMaster fm on am.Aid = fm.Aid inner join EventMaster em on em.Eid = fm.Eid");
            rs = pstmt.executeQuery();
            while(rs.next())
            {
                FeedbackMasterModel fm = new FeedbackMasterModel();
                AlumniMasterModel am = new AlumniMasterModel();
                EventMasterModel em = new EventMasterModel();
                am.setname(rs.getString(1));
                fm.setAlumniMasterModel(am);
                em.setname(rs.getString(2));
                fm.setEventMasterModel(em);
                fm.setdetails(rs.getString(3));
                fm.setRating(rs.getInt(4));
                vect.add(fm);
            }
            if(vect.size()>0)
            {
                return vect;
            }
            else
            {
                return null;
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception is " + ex);
            return null;
        }
    }
}
