package com.college;

import java.util.List;

import com.dao.StaffDao;
import com.entity.Staff;
import com.entity.StaffDetail;

public class App 
{
    public static void main( String[] args )
    {
    	 // Save two instructors
        Staff staff = new Staff("Bhakti", "Khandekar", "Amb");
        StaffDetail staffDetail = new StaffDetail("Java", "Bsc");
        staffDetail.setStaff(staff);
        staff.setStaffDetail(staffDetail);
       
        Staff staff1 = new Staff("pooja", "Khandekar", "Kyn");
        StaffDetail staffDetail1 = new StaffDetail("Dotnet", "Mcom");
        staffDetail.setStaff(staff);
        staff.setStaffDetail(staffDetail);
        
        StaffDao staffDao = new StaffDao();
        staffDao.saveStaff(staff);
        staffDao.saveStaff(staff1);
       
        // Get all instructors
        List<Staff> staffs = StaffDao.getAllStaff();
        staffs.forEach(staffTemp -> System.out.println(staffTemp.getFirstName()));
        
    }
}
