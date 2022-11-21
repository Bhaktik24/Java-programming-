package com.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.InstructorDetail;
import com.entity.StaffDetail;
import com.util.HibernateUtil;


public class StaffDetailDao
{
	  public void saveInstructorDetail(StaffDetail staffDetail) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(staffDetail);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	 

	    public void updateInstructorDetail(StaffDetail instructorDetail) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            Object staffDetail;
				// save the student object
	            session.update(staffDetail);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	 

	    public StaffDetail getInstructorDetail(int id) {

	 

	        Transaction transaction = null;
	        StaffDetail instructor = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an instructor object
	            instructor = session.get(StaffDetail.class, id);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	        return instructor;
	    }

}
