package org.model;

public class AlumniMasterModel 
{
    private int Aid;
    private String Name;
    private String Email;
    private String Contact;
    private int Age;
    private String Company;
    private int Bid;
    private BatchMasterModel bm;
    public AlumniMasterModel()
    {
        
    }
    public AlumniMasterModel(String Name,String Email,String Contact,int Age,String Company,int Bid)
    {
        this.Name=Name;
        this.Email=Email;
        this.Contact=Contact;
        this.Age=Age;
        this.Company=Company;
        this.Bid=Bid;
    }
    public void setAid(int Aid)
    {
        this.Aid = Aid;
    }
    public int getid()
    {
        return Aid;
    }
    public void setname(String Name)
    {
        this.Name = Name;
    }
    public String getname()
    {
        return Name;
    }
    public void setEmail(String Email)
    {
        this.Email = Email;
    }
    public String getEmail()
    {
        return Email;
    }
    public void setContact(String Contact)
    {
        this.Contact = Contact;
    }
    public String getContact()
    {
        return Contact;
    }
    public void setAge(int Age)
    {
        this.Age = Age;
    }
    public int getAge()
    {
        return Age;
    }
    public void setCompany(String Company)
    {
        this.Company = Company;
    }
    public String getCompany()
    {
        return Company;
    }
    public void setBid(int Bid)
    {
        this.Bid = Bid;
    }
    public int getBid()
    {
        return Bid;
    }
    public void setBatchMasterModel(BatchMasterModel bm)
    {
        this.bm = bm;
    }
    public BatchMasterModel getBatchMasterModel()
    {
        return bm;
    }
}
