package org.model;

public class AttendanceModel 
{
    private int Bid;
    private int Eid;
    private String date;
    private String status;
    private AlumniMasterModel am;
    private EventMasterModel em;
    public void setBid(int Bid)
    {
        this.Bid = Bid;
    }
    public int getBid()
    {
        return Bid;
    }
    public void setEid(int Eid)
    {
        this.Eid = Eid;
    }
    public int getEid()
    {
        return Eid;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public String getdate()
    {
        return date;
    }
    public void setstatus(String status)
    {
        this.status = status;
    }
    public String getstatus()
    {
        return status;
    }
    public void setAluniMasterModel(AlumniMasterModel am)
    {
        this.am = am;
    }
    public AlumniMasterModel getAlumniMasterModel()
    {
        return am;
    }
    public void setEventmAsterModel(EventMasterModel em)
    {
        this.em = em;
    }
    public EventMasterModel getEventMasterModel()
    {
        return em;
    }
}
