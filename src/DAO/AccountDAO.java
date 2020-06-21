/* Lớp này là lớp Tài khoản và phân quyền đăng nhập 
   
   Tài khoản giáo vụ mặc định trong cơ sở dữ liệu của mình là: 
  

*/

package DAO;

import Code.NewHibernateUtil;
import Model.Account;
import Model.Classes;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public abstract class AccountDAO extends AbstractDAO<Account> {
    public List<Account> getAll(){
        return super.getAll("Account");
    }
  
    @Override
    public Boolean importFromFile(String filename) {
      
        
        return false;
    }

    @Override
    public List<Account> filter(String filter) {
        List<Account> list = super.getAll("Account");
        
        List<Account> result = new ArrayList();
        Stream<Account> stream = list.stream().filter((Account item) -> {
            if (item == null){
                return false;
            }else{
                if (item.getPermit() != null){
                    return item.getPermit().toString().equals(filter);
                }
                else{
                    return false;
                }
            }
        });
        result = stream.collect(Collectors.toList());
        return result;
    }
	
    public Boolean hasRole(String username, String password, String permit) {
        List<Account> list = filter(permit);
        for (int i = 0; i < list.size(); i++) {
            Account acc = list.get(i);
            Boolean trueUsername = acc.getUsername().equals(username);
            Boolean truePassword = acc.getPassword().equals(password);
            if (trueUsername && truePassword) {
                return true;
            }
        }

        return false;
    }

    public Boolean update(Account item){
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
    public Boolean updatePassword(String username, String password, String permit, String newPwd) {
        List<Account> list = filter(permit);
        Account findAcc = null;
        for (int i = 0; i < list.size(); i++) {
            Account acc = list.get(i);
            Boolean trueUsername = acc.getUsername().equals(username);
            Boolean truePassword = acc.getPassword().equals(password);
            if (trueUsername && truePassword) {
                findAcc = acc;
                break;
            }
        }
        if (findAcc == null){
            return null;
        }else{
            findAcc.setPassword(newPwd);
            return update(findAcc);
        }
    }
}
