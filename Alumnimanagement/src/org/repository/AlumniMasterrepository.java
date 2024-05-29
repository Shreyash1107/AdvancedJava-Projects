package org.repository;

import org.config.DBHelper;
import org.model.AlumniMasterModel;

public class AlumniMasterrepository extends DBHelper
{
    public boolean isAddAlumni(AlumniMasterModel am)
    {
        try
        {
            pstmt = conn.prepareStatement("insert into AlumniMaster values(0,?,?,?,?,?,?)");
            pstmt.setString(1, am.getname());
            pstmt.setString(2, am.getEmail());
            pstmt.setString(3, am.getContact());
            pstmt.setInt(4,am.getAge());
            pstmt.setString(5, am.getCompany());
            pstmt.setInt(6, am.getBid());
            int value;
            value = pstmt.executeUpdate();
            return value>0?true:false;
        }
        catch(Exception ex)
        {
            System.out.println("Error is " + ex);
        }
        return false;
    }
}
