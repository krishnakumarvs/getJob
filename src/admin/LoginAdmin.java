package admin;

import db.Dbcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;

public class LoginAdmin extends javax.swing.JFrame {

    final String PREF_REMEMBER_PASSWORD = "remember_password";
    final String PREF_USER_NAME = "p_user_name";
    final String PREF_PASSWORD = "p_password";
    //String newValue;
    String name;
    String pass;
    Preferences prefs = Preferences.userNodeForPackage(LoginAdmin.class);

    public LoginAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        getPreviousRememberdPassword();
        //prefs.get(PREF_NAME, newValue);
    }

    private void getPreviousRememberdPassword() {
        String previosValues = prefs.get(PREF_REMEMBER_PASSWORD, "false");
        if (previosValues.equals("true")) {
            rememberPasswordCheckBox.setSelected(true);
            String storedUserName = prefs.get(PREF_USER_NAME, "");
            System.out.println(storedUserName);
            userNameTextField.setText(storedUserName);
            String storedPassword = prefs.get(PREF_PASSWORD, "");
            passwordField.setText(storedPassword);
            System.out.println(storedPassword);
            
        } else {
            rememberPasswordCheckBox.setSelected(false);
        }
        System.out.println(previosValues);
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rememberPasswordCheckBox = new javax.swing.JCheckBox();
        userNameTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("LOGIN  PAGE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 180, 34));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setText("USER  NAME              :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 180, 26));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setText("PASSWORD                :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 180, 26));

        rememberPasswordCheckBox.setText("Rememer  Passwod");
        rememberPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberPasswordCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(rememberPasswordCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 170, -1));

        userNameTextField.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(userNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 219, 26));
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 219, 26));

        loginButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        clearButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel1.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logincompany.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextFieldActionPerformed

private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
    try {
        String sql = "select*from tbl_loginadmin where username='" + userNameTextField.getText() + "' and password='" + passwordField.getText() + "'";
        ResultSet rs;
        Dbcon db = new Dbcon();
        rs = db.select(sql);
        if (rs.next()) {
            prefs.put(PREF_USER_NAME, userNameTextField.getText());
            prefs.put(PREF_PASSWORD, passwordField.getText());
            new HomePageAdmin().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "username or password");
            userNameTextField.setText("");
            passwordField.setText("");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}//GEN-LAST:event_loginButtonActionPerformed

private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
    userNameTextField.setText("");
    passwordField.setText("");
}//GEN-LAST:event_clearButtonActionPerformed

    private void rememberPasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberPasswordCheckBoxActionPerformed

        boolean rememberPasssword = rememberPasswordCheckBox.isSelected();
        prefs.put(PREF_REMEMBER_PASSWORD, rememberPasssword + "");
       // name=userNameTextField.getText();
    }//GEN-LAST:event_rememberPasswordCheckBoxActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox rememberPasswordCheckBox;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
