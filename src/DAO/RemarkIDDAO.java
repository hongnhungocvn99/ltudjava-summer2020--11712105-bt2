/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Remarkid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author sieus
 */


public class RemarkIDDAO extends AbstractDAO<Remarkid> {

    public List<Remarkid> getAll() {
        return super.getAll("Remarkid");
    }

    @Override
    public Boolean add(Remarkid item) {
        return super.add(item); //To change body of generated methods, choose Tools | Templates.
    }

    public List<String> getClasses() {
        List<Remarkid> list = getAll();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i).getName());
        }
        return new ArrayList<>(set);
    }

    @Override
    public Boolean importFromFile(String filename) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Remarkid> filter(String filter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
