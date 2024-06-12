package org.service;
import java.util.Vector;

import org.model.AttendanceModel;
import org.model.FeedbackMasterModel;
import org.repository.FeedbackMasterrepository;

public class FeedbackMasterService 
{
    FeedbackMasterrepository fmrepo = new FeedbackMasterrepository();
    public boolean isFeedbackadded(FeedbackMasterModel fm,AttendanceModel atm)
    {
        if(atm!=null && "P".equalsIgnoreCase(atm.getstatus()))
        {
            return fmrepo.isFeedbackadded(fm);
        }
        return false;
    }
    public Vector<FeedbackMasterModel> getfeedback()
    {
        Vector <FeedbackMasterModel> vect = fmrepo.getfeedback();
        return vect;
    }
}
