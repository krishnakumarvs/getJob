/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import db.Dbcon;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jj
 */
public class AnnouncementAdd extends javax.swing.JPanel {
int id;
HomePageCompany parentFrame;
    /**
     * Creates new form AddJobAnnouncement
     */
    public AnnouncementAdd() {
        initComponents();
    }
     public AnnouncementAdd(int id1,HomePageCompany parentFrame) {
        initComponents();
        id=id1;
        this.parentFrame=parentFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        postTextField = new javax.swing.JTextField();
        contactTextField = new javax.swing.JTextField();
        qualificationTextField = new javax.swing.JTextField();
        placeTextField = new javax.swing.JTextField();
        vacancySpinner = new javax.swing.JSpinner();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        dateXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("JOB    ANNOUNCEMENT");

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setText("Post                                 :");

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setText("Vacancy                           :");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setText("Last Date                         :");

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel5.setText("Place                                :");

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel6.setText("Contact                            :");

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel7.setText("Qualification                    :");

        postTextField.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N

        contactTextField.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N

        qualificationTextField.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        qualificationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualificationTextFieldActionPerformed(evt);
            }
        });

        placeTextField.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        placeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeTextFieldActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(placeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(vacancySpinner))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(postTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dateXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(qualificationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vacancySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qualificationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void qualificationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualificationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qualificationTextFieldActionPerformed

    private void placeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if(postTextField.getText().equals("")||vacancySpinner.getValue().equals(0)||qualificationTextField.getText().equals("")||dateXDatePicker1.getDate().equals("")||placeTextField.getText().equals("")||contactTextField.getText().equals("")){
             JOptionPane.showMessageDialog(this, "please enter all fields");
        }
        
        else{
        
        
        
        Date date=dateXDatePicker1.getDate();
       // System.out.println(date);
        //Long datee=Long.parseLong(date);
         Calendar c = Calendar.getInstance();
        c.setTime(date);
        
        
        String datee;
        long datemilli=c.getTimeInMillis();
       datee = c.get(Calendar.YEAR)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.DAY_OF_MONTH);
        String sql="insert into tbl_announcement(post,vacancy,qualification,date_in_milli,place,contact,companyId,date) values('"+postTextField.getText()+"','"+vacancySpinner.getValue()+"','"+qualificationTextField.getText()+"','"+datemilli+"','"+placeTextField.getText()+"','"+contactTextField.getText()+"','"+id+"','"+datee+"')";
        int n;
        Dbcon db=new Dbcon();
        db.insert(sql);
        JOptionPane.showMessageDialog(this," successfully inserted" );
         parentFrame.getContentPane().removeAll();
        parentFrame.repaint();
        parentFrame.revalidate();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_submitButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
parentFrame.getContentPane().removeAll();
parentFrame.repaint();
parentFrame.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField contactTextField;
    private org.jdesktop.swingx.JXDatePicker dateXDatePicker1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField placeTextField;
    private javax.swing.JTextField postTextField;
    private javax.swing.JTextField qualificationTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JSpinner vacancySpinner;
    // End of variables declaration//GEN-END:variables
}
