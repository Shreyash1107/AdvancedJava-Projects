package org.service;

import org.model.BatchMasterModel;
import org.repository.BatchMasterrepository;

public class BatchMasterService 
{
    BatchMasterrepository brepo = new BatchMasterrepository();
    public boolean isAddbatch(BatchMasterModel bm)
    {
        boolean b = brepo.isAddbatch(bm);
        return b; 
    }
}
