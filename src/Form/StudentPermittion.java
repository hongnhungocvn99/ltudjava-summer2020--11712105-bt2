/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

/**
 *
 * @author coluc
 */
public class StudentPermittion extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public StudentPermittion() {
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
        menuScore = new javax.swing.JMenu();
        menuItemScore = new javax.swing.JMenuItem();
        menuRemarking = new javax.swing.JMenu();
        menuItemRemarking = new javax.swing.JMenuItem();

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
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        frmDesktopLayout.setVerticalGroup(
            frmDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
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

        menuScore.setText("Điểm số");

        menuItemScore.setText("Điểm số");
        menuItemScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemScoreActionPerformed(evt);
            }
        });
        menuScore.add(menuItemScore);

        jMenuBar.add(menuScore);

        menuRemarking.setText("Phúc khảo");

        menuItemRemarking.setText("Phúc khảo");
        menuItemRemarking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRemarkingActionPerformed(evt);
            }
        });
        menuRemarking.add(menuItemRemarking);

        jMenuBar.add(menuRemarking);

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

    private void menuItemScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemScoreActionPerformed
      
    }//GEN-LAST:event_menuItemScoreActionPerformed

    private void menuItemPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPasswordActionPerformed
    
    }//GEN-LAST:event_menuItemPasswordActionPerformed

    private void menuItemRemarkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRemarkingActionPerformed
     
    }//GEN-LAST:event_menuItemRemarkingActionPerformed
    public static FormStudent _frmStudent = new FormStudent();
    public static FormScore _frmScore = new FormScore();
   // public static FormSubject _frmSubject = new FormSubject();
    public static FormTimetable _frmTimetable = new FormTimetable();

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(StudentPermittion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentPermittion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentPermittion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentPermittion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            new StudentPermittion().setVisible(true);
        });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane frmDesktop;
    private javax.swing.JFrame frmStudent;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenuItem menuItemOpen;
    private javax.swing.JMenuItem menuItemPassword;
    private javax.swing.JMenuItem menuItemRemarking;
    private javax.swing.JMenuItem menuItemScore;
    private javax.swing.JMenu menuRemarking;
    private javax.swing.JMenu menuScore;
    // End of variables declaration//GEN-END:variables
}
