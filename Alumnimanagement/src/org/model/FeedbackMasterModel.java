package org.model;
public class FeedbackMasterModel 
{
    private String details;
    private int Rating;
    int Aid;
    int Eid;
    AlumniMasterModel am;
    EventMasterModel em;
    public FeedbackMasterModel()
    {

    }
    public FeedbackMasterModel(int Fid,String details,int Rating,int Aid,int Eid,AlumniMasterModel am,EventMasterModel em)
    {
        this.details = details;
        this.Rating = Rating;
        this.Aid = Aid;
        this.Eid = Eid;
        this.am = am;
        this.em = em;
    }
    public void setdetails(String details)
    {
        this.details = details;
    }
    public String getdetails()
    {
        return details;
    }
    public void setRating(int Rating)
    {
        this.Rating = Rating;
    }
    public int getRating()
    {
        return Rating;
    }
    public void setAid(int Aid)
    {
        this.Aid = Aid;
    }
    public int getAid()
    {
        return Aid;
    }
    public void setEid(int Eid)
    {
        this.Eid = Eid;
    }
    public int getEid()
    {
        return Eid;
    }
    public void setAlumniMasterModel(AlumniMasterModel am) 
    {
        this.am = am;    
    }
    public AlumniMasterModel getAlumniMasterModel()
    {
        return am;
    }
    public void setEventMasterModel(EventMasterModel em)
    {
        this.em = em;
    }
    public EventMasterModel getEventMasterModel()
    {
        return em;
    }
}
