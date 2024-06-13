package org.service;

import java.util.Vector;

import org.model.AttendanceModel;
import org.repository.Attendancerepository;

public class Attendanceservice 
{
    Attendancerepository atrepo = new Attendancerepository();
    public boolean isAttendancemarked(int Aid,int Eid,String date,String status)
    {
        boolean b = atrepo.isAttendancemarked(Aid, Eid, date, status);
        return b;
    }
    public String getattendancestatus(int Aid,int Eid)
    {
        String status = atrepo.getattendancestatus(Aid, Eid);
        return status;
    }
    public Vector<AttendanceModel> getpresentAlumni(AttendanceModel atm)
    {
        Vector<AttendanceModel> vect = atrepo.getpresentAlumni(atm);
        return vect;
    }
}
