package com.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.entity.Staff;
import com.util.HibernateUtil;



public class StaffDao {

	 /**
     * Save Instructor
     * @param instructor
     */
    public void saveStaff(Staff staff) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(staff);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    /**
     * Update Staff
     * @param Staff
     */
    public void updateStaff(Staff staff) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(staff);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    /**
     * Delete Staff
     * @param id
     */
    public void deleteStaff(int id) {

 

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

 

            // Delete a instructor object
           Staff staff = session.get(Staff.class, id);
            if (staff != null) {
                session.delete(staff);
                System.out.println("staff is deleted");
            }

 

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    /**
     * Get Staff By ID
     * @param id
     * @return
     */
    public Staff getStaff(int id) {

 

        Transaction transaction = null;
        Staff staff = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an instructor object
            staff = session.get(Staff.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return staff;
    }
    
    /**
     * Get all Staff
     * @return
     */
    @SuppressWarnings("unchecked")
    public static List<Staff> getAllStaff() {

 

        Transaction transaction = null;
        List<Staff> listOfStaff = null;
        try (Session session = HibernateUtil.getSessionFactory().opensession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an instructor object
            
            listOfStaff = session.createQuery("from Staff").getResultList();
            
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfStaff;
    }
}
