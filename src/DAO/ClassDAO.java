
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Code.CSVReader;
import Model.Classes;
import Model.Student;
import Model.Subject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author coluc
 */
class SortBySbj implements Comparator<Classes> {

    // Used for sorting in ascending order of 
    // roll number 
    @Override
    public int compare(Classes a, Classes b) {
        return a.getSubjectId().compareTo(b.getSubjectId());
    }
}

public class ClassDAO extends AbstractDAO<Classes>{

     public List<Classes> getAll() {
        return super.getAll("Classes");
    }
    @Override
    public Boolean add(Classes item) {
        return super.add(item); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Boolean importFromFile(String filename) {
          
        
        
        SubjectDAO dao = new SubjectDAO();
            List <Subject> temp = dao.getAll();
        StudentDAO dao2 = new StudentDAO();
          List <Student> temp2 =dao2.getAll(); 
            
          for (int i=0; i<temp.size(); i++)
              for (int j=0; j<temp2.size(); j++)
              {
                 String str1=temp.get(i).getClassId();
                 String str2=temp2.get(j).getClasses();
                 
                 if (str1.equals(str2))
                 {
                     String ClassFromSubject =  temp2.get(j).getClasses()+"-"+temp.get(i).getSubjectId();
                     System.out.println(ClassFromSubject);
                     
                     // Classes(String studentId, String fullname, String gender, String cardId, String subjectId)
                      
                      String studentId=temp2.get(j).getStudentId();
                      String fullname = temp2.get(j).getFullname();
                      String gender =temp2.get(j).getGender();
                      String cardId = temp2.get(j).getIdcard();
                      String subjectId = ClassFromSubject;
                      Classes item = new Classes(studentId,fullname,gender,cardId,subjectId );
                     
                      super.add(item);
                 }
                 
                              
               }
                  
        return true;
    }
    
    
    public void CreatClassFromStudentSubject()
    {
       
          
               
                  
     }
    
    @Override
    public List<Classes> filter(String filter) {
   
       List<Classes> list = super.getAll("Classes");
        List<Classes> result = new ArrayList();
        Stream<Classes> stream = list.stream().filter((Classes item) -> {
            if (item == null) {
                return false;
            } else if (item.getSubjectId() != null) {
                return item.getSubjectId().equals(filter);
            } else {
                return false;
            }
        });
        result = stream.collect(Collectors.toList());
        return result;
   }
    
    
    public List<String> getClasses() {
        List<Classes> list = super.getAll("Classes");
        Collections.sort(list, new SortBySbj());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i).getSubjectId());
        }
        return new ArrayList<>(set);
    }

    public List<Classes> removeFromIdx(int[] removeArray, String className) {
        List<Classes> list = filter(className);
        for (int i = 0; i < removeArray.length; i++) {
            Classes item = list.get(removeArray[i]);
            list.remove(removeArray[i]);
            super.remove(item);
        }

        return list;
    }
    
    
}
