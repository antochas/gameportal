/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import database.model.Users;
import iDAO.ILoginDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utilities.HibernateUtil;


/**
 *
 * @author a
 */
public class LoginDAO implements ILoginDAO{


    @Override
    public Users fetchUserByUsername(String uname) {
        
        Users ur;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx;
        tx = session.beginTransaction();
        ur = (Users) session.createQuery("from Users as users where users.username = '"+uname+"'").uniqueResult();
        tx.commit();
        session.close();
        return ur;

    }

    @Override
    public Users fetchUserByEmail(String email) {
        
        Users ur;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx;
        tx = session.beginTransaction();
        ur = (Users) session.createQuery("from Users as users where users.email = '"+email+"'").uniqueResult();
        tx.commit();
        session.close();
        return ur;
    }
    
}
