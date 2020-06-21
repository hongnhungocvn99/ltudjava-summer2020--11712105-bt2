/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Code.CSVReader;
import Code.NewHibernateUtil;
import Model.Score;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
 * @author coluc
 */

class SortBySubject implements Comparator<Score> {

    // Used for sorting in ascending order of 
    // roll number 
    @Override
    public int compare(Score a, Score b) {
        return a.getSubjectId().compareTo(b.getSubjectId());
    }
}
public class ScoreDAO extends AbstractDAO<Score>{

    @Override
    public Boolean importFromFile(String filename) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
     List<List<String>> records = new ArrayList<>();
        String className = "";
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(filename), "UTF8"));
            className = br.readLine().replace(",", "").replaceAll("[^\\x00-\\x7F]", "");
            String header = br.readLine();
            records = CSVReader.readToBuffer(br);
        } catch (IOException e) {
            return false;
        }
        
        for (int i = 0; i < records.size(); i++) {
            List<String> metaData = records.get(i);
            String studentID = metaData.get(1);
            String fullName = metaData.get(2);
            Float midExam = Float.valueOf(metaData.get(3));
            Float finalExam = Float.valueOf(metaData.get(4));
            Float plusExam = Float.valueOf(metaData.get(5));
            Float avgExam = Float.valueOf(metaData.get(6));
            Score item = new Score(studentID, fullName, midExam, finalExam, plusExam, avgExam, className);
            super.add(item);
        }

        return true;    
    
    }

    @Override
    public List<Score> filter(String filter) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          List<Score> list = super.getAll("Score");
        List<Score> result = new ArrayList();
        Stream<Score> stream = list.stream().filter((Score item) -> {
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
    
    public List<Score> filter(String filter, String studentID) {
        List<Score> list = filter(filter);
        List<Score> result = new ArrayList();
        Stream<Score> stream = list.stream().filter((Score item) -> {
            if (item == null) {
                return false;
            } else if (item.getStudentId() != null) {
                return item.getStudentId().equals(studentID);
            } else {
                return false;
            }
        });
        result = stream.collect(Collectors.toList());
        return result;
    }

    public List<Score> getAllByFilter(Integer filter, String className) {
        List<Score> list = super.getAll("Score");
        List<Score> result = new ArrayList();
        Stream<Score> stream = list.stream().filter((Score item) -> {
            if (item.getSubjectId() != null) {
                Boolean trueSub = item.getSubjectId().equals(className);
                if (trueSub) {
                    switch (filter) {
                        case 0:
                        default:
                            return true;
                        case 1:
                            return item.getAvgScore() >= (float) 5.0;
                        case 2:
                            return item.getAvgScore() < (float) 5.0;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        });
        result = stream.collect(Collectors.toList());
        return result;
    }

    public List<String> statistic(List<Score> list) {
        List<Score> good = list.stream().filter(item -> item.getAvgScore() >= (float) 5.0).collect(Collectors.toList());
        List<Score> bad = list.stream().filter(item -> item.getAvgScore() < (float) 5.0).collect(Collectors.toList());
        List<String> result = new ArrayList<>();
        DecimalFormat decFormat = new DecimalFormat();
        decFormat.setMaximumFractionDigits(2);
        Integer goodNum = good.size();
        Integer badNum = bad.size();
        Float propGood = (float) goodNum / list.size() * 100;
        Float propBad = (float) badNum / list.size() * 100;
        result.add(decFormat.format(goodNum));
        result.add(decFormat.format(badNum));
        result.add(decFormat.format(propGood));
        result.add(decFormat.format(propBad));

        return result;
    }

    public List<String> getClasses() {
        
        List<Score> list = super.getAll("Score");
        Collections.sort(list, new SortBySubject());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i).getSubjectId());
        }
        return new ArrayList<>(set);
    }

    public Boolean update(Score item) {
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

    public Boolean updateFromList(List<Score> list) {
        try {
            for (int i = 0; i < list.size(); i++) {
                update(list.get(i));
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }
    
}
