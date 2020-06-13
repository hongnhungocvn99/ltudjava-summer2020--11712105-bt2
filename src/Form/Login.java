
package Form;

import DAO.AccountDAO;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

 
    public Login() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        jlabel_Username = new javax.swing.JLabel();
        jlabel_Password = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jlabel_Username1 = new javax.swing.JLabel();
        cmbPermit = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form");
        setLocation(new java.awt.Point(300, 300));
        setName("frmLogin"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.setName("Login"); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jlabel_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Username.setText("Tên đăng nhập");
        jlabel_Username.setToolTipText("");

        jlabel_Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Password.setText("Mật khẩu");
        jlabel_Password.setToolTipText("");

        txtPassword.setToolTipText("");

        jlabel_Username1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Username1.setText("Quyền hạn");
        jlabel_Username1.setToolTipText("");

        cmbPermit.setEditable(true);
        cmbPermit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbPermit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlabel_Username)
                            .addComponent(jlabel_Password)
                            .addComponent(jlabel_Username1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(txtPassword)
                            .addComponent(cmbPermit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jlabel_Username1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(cmbPermit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_Username))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel_Password)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>                        
    public static String UsernameLogin = "";
    public static String PasswordLogin = "";
    public static Integer PermitionIndex = 0;
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
            JOptionPane.showMessageDialog(null, "Login fail", "Vui lòng xem lại mật khẩu\n\"Tài khoản hoặc mật khẩu không đúng\"", JOptionPane.INFORMATION_MESSAGE);
        }

    }                                        

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handling code here:
        cmbPermit.removeAllItems();
        cmbPermit.addItem("Student");
        cmbPermit.addItem("Teacher");
        if (PermitionIndex > 0){
            cmbPermit.setSelectedIndex(PermitionIndex);
        }
    }                                 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    private Boolean checkLogin(String username, String password) {
        AccountDAO dao = new AccountDAO() {};
        String permit = String.valueOf(cmbPermit.getSelectedIndex() + 1);

        return dao.hasRole(username, password, permit);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbPermit;
    private javax.swing.JLabel jlabel_Password;
    private javax.swing.JLabel jlabel_Username;
    private javax.swing.JLabel jlabel_Username1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration                   

}
