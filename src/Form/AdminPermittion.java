/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import DAO.SubjectDAO;
import DAO.ScoreDAO;
import DAO.StudentDAO;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author coluc
 */
public class AdminPermittion extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public AdminPermittion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmStudent = new javax.swing.JFrame();
        frmDesktop = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        menuItemOpen = new javax.swing.JMenuItem();
        menuItemPassword = new javax.swing.JMenuItem();
        menuStudent = new javax.swing.JMenu();
        menuItemListAll = new javax.swing.JMenuItem();
        menuAddStudent = new javax.swing.JMenuItem();
        menuChoseClass = new javax.swing.JMenuItem();
        menuScore = new javax.swing.JMenu();
        menuItemScore = new javax.swing.JMenuItem();
        menuImportScore = new javax.swing.JMenuItem();
        menuSubject = new javax.swing.JMenu();
        menuItemTimetable = new javax.swing.JMenuItem();
        menuAddSubjectStudent = new javax.swing.JMenuItem();
        menuTimetable = new javax.swing.JMenu();
        menuTime = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuReExam = new javax.swing.JMenu();
        menuItemCreateReexam = new javax.swing.JMenuItem();
        menuItemReexam = new javax.swing.JMenuItem();

        javax.swing.GroupLayout frmStudentLayout = new javax.swing.GroupLayout(frmStudent.getContentPane());
        frmStudent.getContentPane().setLayout(frmStudentLayout);
        frmStudentLayout.setHorizontalGroup(
            frmStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        frmStudentLayout.setVerticalGroup(
            frmStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmMainForm"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout frmDesktopLayout = new javax.swing.GroupLayout(frmDesktop);
        frmDesktop.setLayout(frmDesktopLayout);
        frmDesktopLayout.setHorizontalGroup(
            frmDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1095, Short.MAX_VALUE)
        );
        frmDesktopLayout.setVerticalGroup(
            frmDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );

        menuHome.setText("Trang chủ");
        menuHome.setActionCommand("Home");

        menuItemOpen.setText("Đăng xuất");
        menuItemOpen.setToolTipText("");
        menuItemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemOpenActionPerformed(evt);
            }
        });
        menuHome.add(menuItemOpen);

        menuItemPassword.setText("Đổi mật khẩu");
        menuItemPassword.setToolTipText("");
        menuItemPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPasswordActionPerformed(evt);
            }
        });
        menuHome.add(menuItemPassword);

        jMenuBar.add(menuHome);

        menuStudent.setText("Sinh viên");
        menuStudent.setToolTipText("");

        menuItemListAll.setText("Danh sách theo lớp");
        menuItemListAll.setToolTipText("");
        menuItemListAll.setActionCommand("Load ");
        menuItemListAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListAllActionPerformed(evt);
            }
        });
        menuStudent.add(menuItemListAll);

        menuAddStudent.setText("Thêm sinh viên");
        menuAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddStudentActionPerformed(evt);
            }
        });
        menuStudent.add(menuAddStudent);

        menuChoseClass.setText("Nhập danh sách");
        menuChoseClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuChoseClassActionPerformed(evt);
            }
        });
        menuStudent.add(menuChoseClass);

        jMenuBar.add(menuStudent);

        menuScore.setText("Điểm số");

        menuItemScore.setText("Điểm số");
        menuItemScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemScoreActionPerformed(evt);
            }
        });
        menuScore.add(menuItemScore);

        menuImportScore.setText("Nhập bảng điểm");
        menuImportScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuImportScoreActionPerformed(evt);
            }
        });
        menuScore.add(menuImportScore);

        jMenuBar.add(menuScore);

        menuSubject.setText("Môn học");

        menuItemTimetable.setText("Danh sách theo môn học");
        menuItemTimetable.setToolTipText("");
        menuItemTimetable.setActionCommand("Danh sách sinh viên");
        menuItemTimetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTimetableActionPerformed(evt);
            }
        });
        menuSubject.add(menuItemTimetable);

        menuAddSubjectStudent.setText("Thêm sinh viên vào môn học");
        menuAddSubjectStudent.setToolTipText("");
        menuAddSubjectStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddSubjectStudentActionPerformed(evt);
            }
        });
        menuSubject.add(menuAddSubjectStudent);

        jMenuBar.add(menuSubject);

        menuTimetable.setText("Thời khóa biểu");

        menuTime.setText("Danh sách thời khóa biểu");
        menuTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTimeActionPerformed(evt);
            }
        });
        menuTimetable.add(menuTime);

        jMenuItem1.setText("Nhập thời khóa biểu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuTimetable.add(jMenuItem1);

        jMenuBar.add(menuTimetable);

        menuReExam.setText("Phúc khảo");

        menuItemCreateReexam.setText("Tạo phúc khảo");
        menuItemCreateReexam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCreateReexamActionPerformed(evt);
            }
        });
        menuReExam.add(menuItemCreateReexam);

        menuItemReexam.setText("Danh sách phúc khảo");
        menuItemReexam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemReexamActionPerformed(evt);
            }
        });
        menuReExam.add(menuItemReexam);

        jMenuBar.add(menuReExam);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frmDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frmDesktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void menuItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemOpenActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }//GEN-LAST:event_menuItemOpenActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:        

    }//GEN-LAST:event_formWindowOpened

    private void menuItemListAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListAllActionPerformed
        // TODO add your handling code here:
        frmDesktop.removeAll();
        FormStudent frm = new FormStudent();
        int frmWidth = this.getWidth();
        int frmHeight = this.getHeight();
        frm.setSize(frmWidth, frmHeight);
        frmDesktop.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemListAllActionPerformed

    private void menuItemScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemScoreActionPerformed
        // TODO add your handling code here:
      
        frmDesktop.removeAll();
        FormScore frm = new FormScore();
        
        int frmWidth = this.getWidth();
        int frmHeight = this.getHeight();
        frm.setSize(frmWidth, frmHeight);
        frmDesktop.add(frm); 
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemScoreActionPerformed

    private void menuItemTimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTimetableActionPerformed
        // TODO add your handling code here:
        frmDesktop.removeAll();
        FormClasses frm = new FormClasses();
        int frmWidth = this.getWidth();
        int frmHeight = this.getHeight();
        frm.setSize(frmWidth, frmHeight);
        frmDesktop.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemTimetableActionPerformed

    private void menuItemPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPasswordActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(() -> {
            new ChangePassword().setVisible(true);
        });
    }//GEN-LAST:event_menuItemPasswordActionPerformed
    public static FormStudent _frmStudent = new FormStudent();
    public static FormScore _frmScore = new FormScore();
   // public static FormSubject _frmSubject = new FormSubject();

    private void menuChoseClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuChoseClassActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
        // int returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
          
            String filePath = selectedFile.getAbsolutePath();
            
            StudentDAO dao = new StudentDAO();
            Boolean isUpdate = dao.importFromFile(filePath);
            if (isUpdate) {
                JOptionPane.showMessageDialog(null, "Thành công", "Thêm sinh viên thành công !", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Thất bại", "Thêm sinh viên thất bại !", JOptionPane.INFORMATION_MESSAGE);
            }

            frmDesktop.removeAll();
            int frmWidth = this.getWidth();
            int frmHeight = this.getHeight();
            _frmStudent.setSize(frmWidth, frmHeight);
            _frmStudent.updateCmb();
            frmDesktop.add(_frmStudent);
            _frmStudent.setVisible(true);
        }
    }//GEN-LAST:event_menuChoseClassActionPerformed

    private void menuAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddStudentActionPerformed
        // TODO add your handling code here:
        frmDesktop.removeAll();
        FormAddStudent frm = new FormAddStudent();
        int frmWidth = this.getWidth();
        int frmHeight = this.getHeight();
        frm.setSize(frmWidth, frmHeight);
        frmDesktop.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuAddStudentActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            SubjectDAO dao = new SubjectDAO();
            Boolean isUpdate = dao.importFromFile(filePath);
            if (isUpdate) {
                JOptionPane.showMessageDialog(null, "Thành công", "Thêm thời khóa biểu thành công !", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Thất bại", "Thêm thời khóa biểu thất bại !", JOptionPane.INFORMATION_MESSAGE);
            }

            frmDesktop.removeAll();
            FormTimetable frm = new FormTimetable();
            int frmWidth = this.getWidth();
            int frmHeight = this.getHeight();
            frm.setSize(frmWidth, frmHeight);
            frmDesktop.add(frm);
            frm.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTimeActionPerformed
    
    }//GEN-LAST:event_menuTimeActionPerformed

    private void menuImportScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuImportScoreActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
  
        
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            
    
            
            ScoreDAO dao = new ScoreDAO();
     
            Boolean isUpdate = dao.importFromFile(filePath);
            
            
            
            if (isUpdate) {
                JOptionPane.showMessageDialog(null, "Thành công", "Thêm bảng điểm thành công !", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Thất bại", "Thêm bảng điểm thất bại !", JOptionPane.INFORMATION_MESSAGE);
            }

            frmDesktop.removeAll();
            int frmWidth = this.getWidth();
            int frmHeight = this.getHeight();
            _frmScore.setSize(frmWidth, frmHeight);
            frmDesktop.add(_frmScore);
            _frmScore.setVisible(true);
        }
    }//GEN-LAST:event_menuImportScoreActionPerformed

    private void menuAddSubjectStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddSubjectStudentActionPerformed
        // TODO add your handling code here:
       frmDesktop.removeAll();
        FormAddSubjectStudent frm = new FormAddSubjectStudent();
        int frmWidth = this.getWidth();
        int frmHeight = this.getHeight();
        frm.setSize(frmWidth, frmHeight);
        frmDesktop.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuAddSubjectStudentActionPerformed

    private void menuItemCreateReexamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCreateReexamActionPerformed
   // TODO add your handling code here:
        frmDesktop.removeAll();
        FormCreateRemarking frm = new FormCreateRemarking();
        int frmWidth = this.getWidth();
        int frmHeight = this.getHeight();
        frm.setSize(frmWidth, frmHeight);
        frmDesktop.add(frm);
        frm.setVisible(true);    
    }//GEN-LAST:event_menuItemCreateReexamActionPerformed

    private void menuItemReexamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemReexamActionPerformed
   // TODO add your handling code here:
        frmDesktop.removeAll();
        FormListRemarking frm = new FormListRemarking();
        int frmWidth = this.getWidth();
        int frmHeight = this.getHeight();
        frm.setSize(frmWidth, frmHeight);
        frmDesktop.add(frm);
        frm.setVisible(true);     
    }//GEN-LAST:event_menuItemReexamActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminPermittion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPermittion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPermittion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPermittion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminPermittion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane frmDesktop;
    private javax.swing.JFrame frmStudent;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuAddStudent;
    private javax.swing.JMenuItem menuAddSubjectStudent;
    private javax.swing.JMenuItem menuChoseClass;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenuItem menuImportScore;
    private javax.swing.JMenuItem menuItemCreateReexam;
    private javax.swing.JMenuItem menuItemListAll;
    private javax.swing.JMenuItem menuItemOpen;
    private javax.swing.JMenuItem menuItemPassword;
    private javax.swing.JMenuItem menuItemReexam;
    private javax.swing.JMenuItem menuItemScore;
    private javax.swing.JMenuItem menuItemTimetable;
    private javax.swing.JMenu menuReExam;
    private javax.swing.JMenu menuScore;
    private javax.swing.JMenu menuStudent;
    private javax.swing.JMenu menuSubject;
    private javax.swing.JMenuItem menuTime;
    private javax.swing.JMenu menuTimetable;
    // End of variables declaration//GEN-END:variables
}
