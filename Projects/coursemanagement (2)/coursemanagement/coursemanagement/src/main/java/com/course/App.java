package com.course;



import java.util.ArrayList;
import java.util.List;

import com.dao.CourseDao;
import com.dao.InstructorDao;
import com.entity.Course;
import com.entity.Instructor;
import com.entity.InstructorDetail;

public class App 
{
    public static void main( String[] args )
    {
        // Save two instructors
        Instructor instructor = new Instructor("Amit", "Varma", "amitv45@gmail.com");
        InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "Piano");
        instructorDetail.setInstructor(instructor);
        instructor.setInstructorDetail(instructorDetail);
       
        Instructor instructor1 = new Instructor("Shree", "Kumar", "shreekumar@gmail.com");
        InstructorDetail instructorDetail1 = new InstructorDetail("http://www.youtube.com", "Guitar");
        instructorDetail1.setInstructor(instructor1);
        instructor1.setInstructorDetail(instructorDetail1);
       
        List<Course> courses=new ArrayList<>();
        //Create some courses
        Course c=new Course("Java");
        c.setInstructor(instructor);
        courses.add(c);
        
        Course c1=new Course("C#");
        c1.setInstructor(instructor);
        courses.add(c1);
        
        CourseDao coursedao=new CourseDao();
        coursedao.saveCourse(c);
        coursedao.saveCourse(c1);
        
    }
}
