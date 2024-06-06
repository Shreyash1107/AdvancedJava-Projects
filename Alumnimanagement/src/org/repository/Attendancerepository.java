package org.repository;

import java.util.Vector;

import org.config.DBHelper;
import org.model.AlumniMasterModel;
import org.model.AttendanceModel;
import org.model.EventMasterModel;

public class Attendancerepository extends DBHelper
{
    Vector<AttendanceModel>vect = null;
    public boolean isAttendancemarked(int Bid,int Eid,String date,String status)
    {
        try
        {
            pstmt = conn.prepareStatement("insert into Attendance values(?,?,?,?)");
            pstmt.setInt(1, Bid);
            pstmt.setInt(2, Eid);
            pstmt.setString(3, date);
            pstmt.setString(4, status);
            int val = pstmt.executeUpdate();
            return val>0?true:false;
        }
        catch(Exception ex)
        {
            System.out.println("Error is " + ex);
        }
        return false;
    }
    public Vector<AttendanceModel> getpresentAlumni(AttendanceModel atm)
    {
        vect = new Vector<AttendanceModel>();
        try
        {
            // AttendanceModel atm = new AttendanceModel();
            pstmt = conn.prepareStatement("select am.Name as Alumni_Name,em.name as Event_name,em.date as Date,a.status as Status from Attendance a inner join EventMaster em on a.Eid=em.Eid inner join AlumniMaster am on am.Bid = a.Bid where a.status =?");
            pstmt.setString(1,atm.getstatus());
            rs = pstmt.executeQuery();
            while(rs.next())
            {
                AttendanceModel atmodel = new AttendanceModel();
                AlumniMasterModel am = new AlumniMasterModel();
                am.setname(rs.getString(1));
                atmodel.setAluniMasterModel(am);
                EventMasterModel em = new EventMasterModel();
                em.setname(rs.getString(2));
                atmodel.setEventmAsterModel(em);
                em.setDate(rs.getString(3));
                atmodel.setEventmAsterModel(em);
                atmodel.setstatus(rs.getString(4));
                vect.add(atmodel);
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
            return null;
        }
    }
}
