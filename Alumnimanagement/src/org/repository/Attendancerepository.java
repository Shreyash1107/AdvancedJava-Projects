package org.repository;

import org.config.DBHelper;

public class Attendancerepository extends DBHelper
{
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
}
