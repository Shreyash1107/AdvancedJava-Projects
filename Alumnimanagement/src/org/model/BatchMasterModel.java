package org.model;

public class BatchMasterModel 
{
    private int Bid;
    private String Batch_name;
    public void setBid(int Bid)
    {
        this.Bid = Bid;
    }
    public int getBid()
    {
        return Bid;
    }
    public void setname(String Batch_name)
    {
        this.Batch_name = Batch_name;
    }
    public String getBatch_name()
    {
        return Batch_name;
    }
}
