package org.repository;

import org.config.DBHelper;
import org.model.BatchMasterModel;

public class BatchMasterrepository extends DBHelper
{
    public boolean isAddbatch(BatchMasterModel bm)
    {
        try
        {
            pstmt = conn.prepareStatement("insert into batchmaster values(0,?)");
            pstmt.setString(1, bm.getBatch_name());
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
