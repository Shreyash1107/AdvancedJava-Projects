package org.client;
import java.util.*;

import org.model.AlumniMasterModel;
import org.model.BatchMasterModel;
import org.service.AlumniMasterService;
import org.service.BatchMasterService;
public class ClientApplication 
{
    public static void main(String args[])
    {
        int choice;
        String Batch_name;
        boolean b;
        int Bid,Age;
        String Name,Email,Contact,Company;
        BatchMasterModel bm = new BatchMasterModel();
        BatchMasterService bs = new BatchMasterService();
        AlumniMasterModel am = new AlumniMasterModel();
        AlumniMasterService ams = new AlumniMasterService();
        Scanner xyz = new Scanner(System.in);
        do
        {
            System.out.println("1.Add Alumni's Passout Batch Details....");
            System.out.println("2.Add new Alumni/View ALumni/Update Alumni/Delete Alumni......");
            System.out.println("3.Add New Alumni Event.....");
            System.out.println("4.Send SMS to Alumni for Event....");
            System.out.println("5.Take Attendance of Alumni.....");
            System.out.println("6.View all Alumni Details as Per Event....");
            System.out.println("7.View all Absent ALumni....");
            System.out.println("8.Take Feedback from Alumni....");
            System.out.println("9.Sort Alumni Year Wise....");
            System.out.println("10.Find the Most Senior Alumni in Meet....");
            System.out.println(" ");
            System.out.println("Enter the choice:");
            choice = xyz.nextInt();
            System.out.println(" ");
            switch(choice)
            {
                case 1:
                System.out.println("1.Add Alumni's Passout Batch Details....");
                System.out.println(" ");
                xyz.nextLine();  //Consuming newline Character
                System.out.println("Enter the Batch Year you want to add:");
                Batch_name = xyz.nextLine();
                bm.setname(Batch_name);
                b = bs.isAddbatch(bm);
                if(b)
                {
                    System.out.println("Batch Added Successfully....");
                }
                else
                {
                    System.out.println("There is some Problem.....");
                }
                break;
                    case 2:
                    System.out.println("2..Add new Alumni/View Alumni/Update Alumni/Delete Alumni.....");
                    System.out.println(" ");
                    do
                    {
                        System.out.println("1.Add the Alumni Details....");
                        System.out.println("2.View all the Alumni Data.....");
                        System.out.println("3.Update the Alumni details....");
                        System.out.println("4.Delete Specific Alunni Detail.....");
                        System.out.println(" ");
                        System.out.println("Enter the Choice:");
                        choice = xyz.nextInt();
                        System.out.println(" ");
                        switch(choice)
                        {
                            case 1:
                            System.out.println("1.Add the Alumni Details....");
                            System.out.println(" ");
                            b = ams.isAddAlumni(am);
                            if(b)
                            {
                                System.out.println("Alumni Successfully added....");
                            }
                            else
                            {
                                System.out.println("There is Some Issue.....");
                            }
                            break;
                                case 2:
                                System.out.println("2. View All the Alumni Details....");
                                System.out.println(" ");
                                List<AlumniMasterModel> v = ams.getalumni();
                                if(v!=null)
                                {
                                    System.out.println("Alumni are Present inside Database....");
                                    for(AlumniMasterModel amd:v )
                                    {
                                        System.out.println(amd.getid() + " " + amd.getname() + " " + amd.getEmail() + " " 
                                        + amd.getContact() + " " + amd.getAge() + " " + amd.getCompany() + amd.getBid());
                                        System.out.println(" ");
                                    }
                                }
                                else
                                {
                                    System.out.println("Data is not there is Database....");
                                }
                                break;
                                    case 3:
                                    System.out.println("3.Update Alumni Details......");
                                    System.out.println(" ");
                        }
                    }while(choice!=5);
            }
        }while(true);
    }
}
