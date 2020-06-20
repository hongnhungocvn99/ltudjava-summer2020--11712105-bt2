/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Code.NewHibernateUtil;
import Model.Remarking;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author sieus
 */


public class RemarkDAO extends AbstractDAO<Remarking> {

    public List<Remarking> getAll() {
        return super.getAll("Remarking");
    }

    @Override
    public Boolean add(Remarking item) {
        return super.add(item); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public Boolean importFromFile(String filename) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Remarking> filter(String filter) {
        List<Remarking> list = super.getAll("Remarking");
        List<Remarking> result = new ArrayList();
        Stream<Remarking> stream = list.stream().filter((Remarking item) -> {
            if (item == null) {
                return false;
            } else if (item.getRemarkId()!= null) {
                return item.getRemarkId().equals(filter);
            } else {
                return false;
            }
        });
        result = stream.collect(Collectors.toList());
        return result;
    }
    
    public List<String> getRemark(){
        List<Remarking> list = super.getAll("Remarking");
        Set<String> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i).getRemarkId());
        }
        return new ArrayList<>(set);
    }
    
    public Boolean update(Remarking item){
        if (item == null) {
            return false;
        }
    
         Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(item);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
            session.close();
            return false;
        }
        session.close();
        return true;
    }
}
