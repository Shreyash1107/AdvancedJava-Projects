package org.repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.config.DBHelper;
import org.config.PathHelper;
import org.model.AlumniMasterModel;

public class AlumniMasterrepository extends DBHelper
{
    Vector<AlumniMasterModel> v = new Vector<AlumniMasterModel>();
    public boolean isAddAlumni(AlumniMasterModel am)
    {
        try
        {
            pstmt = conn.prepareStatement("insert into AlumniMaster values('0',?,?,?,?,?,?)");
            pstmt.setString(1, am.getname());
            pstmt.setString(2, am.getEmail());
            pstmt.setString(3, am.getContact());
            pstmt.setInt(4, am.getAge());
            pstmt.setString(5, am.getCompany());
            pstmt.setInt(6, am.getBid());
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
    public boolean isAddBulkAlumni(AlumniMasterModel am)
    {
        try
        {
            FileReader fr = new FileReader(PathHelper.path + "alumni.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            int val = 0;
            while((line = br.readLine()) != null)
            {
                String data[] = line.split(",");
                if (data.length != 7) 
                {
                    System.out.println("Skipping line due to incorrect format: " + line);
                    continue;
                }
                try {
                    pstmt = conn.prepareStatement("insert into alumnimaster values(0,?,?,?,?,?,?)");
                    pstmt.setString(1, data[1]);
                    pstmt.setString(2, data[2]);
                    pstmt.setString(3, data[3]);
                    pstmt.setInt(4, Integer.parseInt(data[4]));
                    pstmt.setString(5, data[5]);
                    pstmt.setInt(6, Integer.parseInt(data[6]));
                    val = pstmt.executeUpdate();
                } 
                catch (ArrayIndexOutOfBoundsException ex) 
                {
                    System.out.println("Array index out of bounds for line: " + line);
                } 
                catch (NumberFormatException ex) 
                {
                    System.out.println("Number format exception for line: " + line);
                }
            }
            br.close();
            fr.close();
            return val > 0?true:false;
        }
        catch (Exception ex)
        {
            System.out.println("Error is " + ex);
        }
        return false;
    }
    public Vector<AlumniMasterModel> getalumni()
    {
        try
        {
            
            pstmt = conn.prepareStatement("select *from alumnimaster");
            rs = pstmt.executeQuery();
            while(rs.next())
            {
                AlumniMasterModel am = new AlumniMasterModel(); 
                am.setAid(rs.getInt(1));
                am.setname(rs.getString(2));
                am.setEmail(rs.getString(3));
                am.setContact(rs.getString(4));
                am.setAge(rs.getInt(5));
                am.setCompany(rs.getString(6));
                am.setBid(rs.getInt(7));
                v.add(am);
            }
            if(v.size()>0)
            {
                return v;
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
    public boolean isAlumniUpdated(AlumniMasterModel am)  //Update Alumni details by id as it is Primary key and will be Unique
    {
        try
        {
            pstmt = conn.prepareStatement("update Alumnimaster set Name = ?,Email=?,Contact=?,Age=?,Company=?,Bid=? where Aid=?");
            pstmt.setString(1, am.getname());
            pstmt.setString(2, am.getEmail());
            pstmt.setString(3, am.getContact());
            pstmt.setInt(4, am.getAge());
            pstmt.setString(5, am.getCompany());
            pstmt.setInt(6, am.getBid());
            pstmt.setInt(7, am.getid());
            int val;
            val = pstmt.executeUpdate();
            return val>0?true:false;
        }
        catch(Exception ex)
        {
            System.out.println("Exception is " + ex);    
        }
        return false;
    }
    public int deleid(AlumniMasterModel am)
    {
        try
        {
            pstmt = conn.prepareStatement("delete from AlumniMaster where Aid=?");
            pstmt.setInt(1, am.getid());
            int val;
            val = pstmt.executeUpdate();
            return val>0?1:0;
        }
        catch(Exception ex)
        {
            System.out.println("Error is " + ex);
        }
        return 0;
    }
}
