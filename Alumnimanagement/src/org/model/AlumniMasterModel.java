package org.model;

public class AlumniMasterModel 
{
    private String Name;
    private String Email;
    private String Contact;
    private int Age;
    private String Company;
    private int Bid;
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
}
