package org.model;

public class EventMasterModel 
{
    private int Eid;
    private String name;
    private String date;
    private String Time;
    private String Venue;
    private int Bid;
    private String Subject;
    public EventMasterModel()
    {

    }
    public EventMasterModel(String name,String date,String Time,String Venue,int Bid,String Subject)
    {
        this.name = name;
        this.date = date;
        this.Time = Time;   
        this.Venue = Venue;
        this.Bid = Bid;
        this.Subject = Subject;
    }
    public void setEid(int Eid)
    {
        this.Eid = Eid;
    }
    public int getEid()
    {
        return Eid;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public String getname()
    {
        return name;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public String getDate()
    {
        return date;
    }
    public void settie(String Time)
    {
        this.Time = Time;
    }
    public String gettime()
    {
        return Time;
    }
    public void setVenue(String Venue)
    {
        this.Venue = Venue;
    }
    public String getVenue()
    {
        return Venue;
    }
    public void setBid(int Bid)
    {
        this.Bid = Bid;
    }
    public int getBid()
    {
        return Bid;
    }
    public void setSubject(String Subject)
    {
        this.Subject = Subject;
    }
    public String getSubject()
    {
        return Subject;
    }
}
