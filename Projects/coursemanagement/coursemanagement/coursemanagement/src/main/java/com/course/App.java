package com.course;



import java.util.List;

import com.dao.InstructorDao;
import com.entity.Instructor;
import com.entity.InstructorDetail;

public class App 
{
    public static void main( String[] args )
    {
        // Save two instructors
        Instructor instructor = new Instructor("sneha", "Khandekar", "b@gmail.com");
        InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "Dancing");
        instructorDetail.setInstructor(instructor);
        instructor.setInstructorDetail(instructorDetail);
       
        Instructor instructor1 = new Instructor("pooja", "Khandekar", "p@gmail.com");
        InstructorDetail instructorDetail1 = new InstructorDetail("http://www.youtube.com", "singing");
        instructorDetail1.setInstructor(instructor1);
        instructor1.setInstructorDetail(instructorDetail1);
       
        InstructorDao instructorDao = new InstructorDao();
        instructorDao.saveInstructor(instructor);
        instructorDao.saveInstructor(instructor1);
        
       
        
        
        InstructorDao instructorDao1 = new InstructorDao();
        instructorDao1.deleteInstructor(2);
        
        
       
        // Get all instructors
        List<Instructor> instructors = instructorDao.getAllInstructor();
        instructors.forEach(instructorTemp -> System.out.println(instructorTemp.getFirstName()));
    }
}
