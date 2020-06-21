/*
   - Lớp này là lớp dùng chung hỗ trợ các lớp khác để sử dụng lệnh truy vấn hql lấy dữ liệu từ cơ sở dữ liệu 
*/
package DAO;
import Code.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author coluc
 * @param <T>
 */
abstract public class AbstractDAO<T> {

    public List<T> getAll(String objName) {
        List<T> ds = new ArrayList();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select obj from " + objName + " obj";
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
           
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }
    

    public Boolean add(T item) {
        if (item == null) {
            return false;
        }
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(item);
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

    
    public Boolean remove(T item) {
        if (item == null) {
            return false;
        }
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(item);
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
    
 
    public abstract Boolean importFromFile(String filename);
    public abstract List<T> filter(String filter);
}
