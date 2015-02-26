/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import database.model.Featured;
import database.model.Games;
import iDAO.IHomeDAO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utilities.HibernateUtil;

/**
 *
 * @author a
 */
public class HomeDAO implements IHomeDAO{

    @Override
    public List<Games> fetchGamesFromFeatured() {
        
        List<Games> gameList = new ArrayList();
        List<Featured> featuredList = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        tx = session.beginTransaction();
        Query q = session.createQuery ("from Featured as featured where featured.id > 0" );
        //itemList = (List<Storeitems>) q.list();
        featuredList = q.list();
        for (Featured featuredList1 : featuredList) {
            q = session.createQuery("from Games as games where games.id = '" + featuredList1.getGames().getId() + "'");
            gameList.add((Games) q.uniqueResult());
        }
        return gameList;
    }
    
}
