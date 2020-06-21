/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import DAO.AccountDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author coluc
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabel_Password = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jlabel_Username1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        jlabel_Username = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cmbPermit = new javax.swing.JComboBox<>();
        X = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlabel_Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Password.setText("Mật khẩu");
        jlabel_Password.setToolTipText("");

        txtPassword.setToolTipText("");

        jlabel_Username1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Username1.setText("Phân quyền ");
        jlabel_Username1.setToolTipText("");

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.setName("Login"); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jlabel_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Username.setText("Tài khoản");
        jlabel_Username.setToolTipText("");

        cmbPermit.setEditable(true);
        cmbPermit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbPermit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinh viên", "Giáo vụ" }));
        cmbPermit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPermitItemStateChanged(evt);
            }
        });
        cmbPermit.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                cmbPermitComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                cmbPermitComponentShown(evt);
            }
        });
        cmbPermit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPermitActionPerformed(evt);
            }
        });
        jScrollPane1.setViewportView(cmbPermit);

        X.setActionCommand("X");
        X.setLabel("Thoát chương trình");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlabel_Username1)
                    .addComponent(jlabel_Username, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jlabel_Password)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlabel_Username1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel_Username)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel_Password)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        X.getAccessibleContext().setAccessibleName("X");
        X.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPermitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPermitActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cmbPermitActionPerformed

      
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        UsernameLogin = username;
        String password = String.valueOf(txtPassword.getPassword());
        PasswordLogin = password;
        PermitionIndex = cmbPermit.getSelectedIndex();
        Boolean hasPermit = checkLogin(username, password);

        if (hasPermit) {
            this.setVisible(false);
            if (PermitionIndex == 0) {
                java.awt.EventQueue.invokeLater(() -> {
                    new StudentPermittion().setVisible(true);
                });
            } else {
                java.awt.EventQueue.invokeLater(() -> {
                    new AdminPermittion().setVisible(true);
                });
            }
        } else {
            JOptionPane.showMessageDialog(null, "Đăng nhập sai", "Please review the password \n\" The account or password is incorrect \"", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void cmbPermitComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cmbPermitComponentHidden
       
    }//GEN-LAST:event_cmbPermitComponentHidden

    private void cmbPermitItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPermitItemStateChanged
    
    }//GEN-LAST:event_cmbPermitItemStateChanged

    private void cmbPermitComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cmbPermitComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPermitComponentShown

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_XActionPerformed
    
    public static String UsernameLogin = "";
    public static String PasswordLogin = "";
    public static Integer PermitionIndex = 0;
    
                                  

    /**
     * @param args the command line arguments
     * 
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button X;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbPermit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel_Password;
    private javax.swing.JLabel jlabel_Username;
    private javax.swing.JLabel jlabel_Username1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private Boolean checkLogin(String username, String password) {
        AccountDAO dao = new AccountDAO() {};
        String permit = String.valueOf(cmbPermit.getSelectedIndex() + 1);

       return dao.hasRole(username, password, permit);

    }
}
