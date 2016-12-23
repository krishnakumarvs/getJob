/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import db.Dbcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jj
 */
public class FeedbackCreate extends javax.swing.JPanel {

    int id;
    HomePageCompany parentframe;

    /**
     * Creates new form FeedbackCreate
     */
    public FeedbackCreate() {
        initComponents();
        companyComboBox.setVisible(false);
        userComboBox.setVisible(false);
    }

    public FeedbackCreate(int id1, HomePageCompany parentframe) {
        initComponents();
        companyComboBox.setVisible(false);
        userComboBox.setVisible(false);
        this.parentframe = parentframe;
        id = id1;

    }

    private void loadPanal() {
        try {
            companyComboBox.setVisible(false);
            userComboBox.setVisible(false);
            adminRadioButton.setActionCommand("admin");
            companyRadioButton.setActionCommand("company");
            userRadioButton.setActionCommand("user");
            String sql = "select * from tbl_company";
            Dbcon db = new Dbcon();
            ResultSet rs = db.select(sql);
            while (rs.next()) {
                companyComboBox.addItem(rs.getString("name"));
            }
            String sql1 = "select * from tbl_userview";
            Dbcon db1 = new Dbcon();
            ResultSet rs1 = db1.select(sql);
            while (rs1.next()) {
                userComboBox.addItem(rs1.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedbackCreate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        audencebuttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        discriptionTextArea = new javax.swing.JTextArea();
        cancelButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        adminRadioButton = new javax.swing.JRadioButton();
        companyRadioButton = new javax.swing.JRadioButton();
        userRadioButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        companyComboBox = new javax.swing.JComboBox();
        userComboBox = new javax.swing.JComboBox();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("      FEEDBACK");

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setText("Title                          :");

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setText("Discription                :");

        titleTextField.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N

        discriptionTextArea.setColumns(20);
        discriptionTextArea.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        discriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(discriptionTextArea);

        cancelButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        audencebuttonGroup.add(adminRadioButton);
        adminRadioButton.setText("Admin");
        adminRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRadioButtonActionPerformed(evt);
            }
        });

        audencebuttonGroup.add(companyRadioButton);
        companyRadioButton.setText("Company");
        companyRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyRadioButtonActionPerformed(evt);
            }
        });

        audencebuttonGroup.add(userRadioButton);
        userRadioButton.setText("Users");
        userRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRadioButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setText("Audence                    :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(titleTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userRadioButton)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminRadioButton)
                        .addGap(42, 42, 42)
                        .addComponent(companyRadioButton)))
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(companyComboBox, 0, 253, Short.MAX_VALUE)
                    .addComponent(userComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminRadioButton)
                    .addComponent(userRadioButton)
                    .addComponent(companyRadioButton)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(companyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(submitButton))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        parentframe.getContentPane().removeAll();
        parentframe.repaint();
        parentframe.revalidate();
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String discription = discriptionTextArea.getText();
        String title = titleTextField.getText();
        String audence = audencebuttonGroup.getSelection().getActionCommand();
        String audence1 = "0";
        if ("company".equals(audence)) {
            audence1 = (String) companyComboBox.getSelectedItem();
        } else if ("user".equals(audence)) {
            audence1 = (String) userComboBox.getSelectedItem();
        } else if ("admin".equals(audence)) {
            audence1 = "admin";
        }
        long milli = System.currentTimeMillis();
        //  Date date = new Date();
        long date = System.currentTimeMillis();
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(milli);
        String temp;
        temp = c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DAY_OF_MONTH);
        if ((titleTextField.getText().equals("")) || (discriptionTextArea.getText().equals("")) || (audencebuttonGroup.getSelection().getActionCommand().equals(""))) {
            JOptionPane.showMessageDialog(this, "please enter all feilds");
        } else {
            String sql = "insert into tbl_feedback(owner,audence,title,discription,notification,feedbackdate,currentdate) values('" + id + "','" + audence1 + "','" + title + "','" + discription + "','" + audence + "','" + milli + "','" + temp + "')";
            Dbcon db = new Dbcon();
            int n = db.insert(sql);
            JOptionPane.showMessageDialog(this, "successfully inserted");
        }
        parentframe.getContentPane().removeAll();
        parentframe.repaint();
        parentframe.revalidate();
        // TODO add your handling code here:
    }//GEN-LAST:event_submitButtonActionPerformed

    private void adminRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRadioButtonActionPerformed
        adminRadioButton.setActionCommand("admin");
        companyComboBox.setVisible(false);
        userComboBox.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_adminRadioButtonActionPerformed

    private void companyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyRadioButtonActionPerformed
        try {
            companyRadioButton.setActionCommand("company");
            companyComboBox.setVisible(true);
            userComboBox.setVisible(false);
            String sql = "select * from tbl_company";
            Dbcon db = new Dbcon();
            ResultSet rs = db.select(sql);
            while (rs.next()) {
                companyComboBox.addItem(rs.getString("mail_id"));
            }
            // TODO add your handling code here:
    }//GEN-LAST:event_companyRadioButtonActionPerformed
        catch (SQLException ex) {
            Logger.getLogger(FeedbackCreate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void userRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRadioButtonActionPerformed
        try {
            userRadioButton.setActionCommand("user");
            companyComboBox.setVisible(false);
            userComboBox.setVisible(true);
            String sql = "select * from tbl_userview";
            Dbcon db1 = new Dbcon();
            ResultSet rs1 = db1.select(sql);

            while (rs1.next()) {
                userComboBox.addItem(rs1.getString("email_id"));
            }

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(FeedbackCreate.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_userRadioButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adminRadioButton;
    private javax.swing.ButtonGroup audencebuttonGroup;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox companyComboBox;
    private javax.swing.JRadioButton companyRadioButton;
    private javax.swing.JTextArea discriptionTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JComboBox userComboBox;
    private javax.swing.JRadioButton userRadioButton;
    // End of variables declaration//GEN-END:variables
}
