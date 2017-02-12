/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import db.Dbcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jj
 */
public class FeedbackView extends javax.swing.JPanel {

    String id;
    DefaultTableModel model = null;

    /**
     * Creates new form FeedbackView
     */
    public FeedbackView() {
        initComponents();
        load();
    }

    private void load() {
        deleteButton.setEnabled(false);
    }

    private void clearAllRowsFeedbackTable() {
        try {// DefaultTableModel model= (DefaultTableModel) getModel();
            int rowCount = model.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
        } catch (Exception e) {
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

        feedbackbuttonGroup = new javax.swing.ButtonGroup();
        companyRadioButton1 = new javax.swing.JRadioButton();
        userRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedbackListTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        discriptionTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();

        feedbackbuttonGroup.add(companyRadioButton1);
        companyRadioButton1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        companyRadioButton1.setText("Company");
        companyRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyRadioButton1ActionPerformed(evt);
            }
        });

        feedbackbuttonGroup.add(userRadioButton);
        userRadioButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        userRadioButton.setText("User");
        userRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRadioButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("   FEEDBACK");

        feedbackListTable.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        feedbackListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Subject", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        feedbackListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feedbackListTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                feedbackListTableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(feedbackListTable);
        feedbackListTable.getColumnModel().getColumn(2).setMinWidth(0);
        feedbackListTable.getColumnModel().getColumn(2).setPreferredWidth(0);
        feedbackListTable.getColumnModel().getColumn(2).setMaxWidth(0);

        discriptionTextArea.setEditable(false);
        discriptionTextArea.setColumns(20);
        discriptionTextArea.setRows(5);
        jScrollPane2.setViewportView(discriptionTextArea);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel2.setText("         DISCRIPTION");

        deleteButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(companyRadioButton1)
                            .addGap(103, 103, 103)
                            .addComponent(userRadioButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(deleteButton))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userRadioButton)
                            .addComponent(companyRadioButton1))
                        .addGap(67, 67, 67)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void companyRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyRadioButton1ActionPerformed
        try {
            discriptionTextArea.setText("");
            companyRadioButton1.setActionCommand("company");
            clearAllRowsFeedbackTable();
            model = (DefaultTableModel) feedbackListTable.getModel();
            String sql = "select * from tbl_feedback where audence='admin' and feedback='admin'";
            Dbcon db = new Dbcon();
            ResultSet rs = db.select(sql);
            String arr[] = new String[3];
            while (rs.next()) {
                arr[0] = rs.getString("currentdate");
                arr[1] = rs.getString("title");
                arr[2] = rs.getString("id");
                model.addRow(arr);
            }
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(FeedbackView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_companyRadioButton1ActionPerformed

    private void userRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRadioButtonActionPerformed
        try {
            userRadioButton.setActionCommand("user");
            clearAllRowsFeedbackTable();
            discriptionTextArea.setText("");
            model = (DefaultTableModel) feedbackListTable.getModel();
            String sql = "select * from tbl_feedback where audence='admin' and notification='user'";
            Dbcon db = new Dbcon();
            ResultSet rs = db.select(sql);
            String arr[] = new String[3];
            while (rs.next()) {
                arr[0] = rs.getString("currentdate");
                arr[1] = rs.getString("title");
                arr[2] = rs.getString("id");
                model.addRow(arr);
            }
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(FeedbackView.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_userRadioButtonActionPerformed

    private void feedbackListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackListTableMouseClicked

        model = (DefaultTableModel) feedbackListTable.getModel();
        if (model.getValueAt(feedbackListTable.getSelectedRow(), 0).toString().equals("")) {
            JOptionPane.showMessageDialog(this, "No data to select");
        } else {
            try {
                id = model.getValueAt(feedbackListTable.getSelectedRow(), 2).toString();
                String sql = "select * from tbl_feedback where id='" + id + "'";
                Dbcon db = new Dbcon();
                ResultSet rs = db.select(sql);
                if (rs.next()) {
                    discriptionTextArea.setText(rs.getString("discription"));
                }

                deleteButton.setEnabled(true);
            } // TODO add your handling code here:
            catch (SQLException ex) {
                Logger.getLogger(FeedbackView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_feedbackListTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String sql = "delete from tbl_feedback where id='" + id + "'";
        Dbcon db = new Dbcon();
        int n = db.insert(sql);
      
         FeedbackView feedbackView = new FeedbackView();
        this.getParent().add(feedbackView);
        this.setVisible(false);
        feedbackView.setVisible(true);
        this.revalidate();
        this.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void feedbackListTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackListTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_feedbackListTableMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton companyRadioButton1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextArea discriptionTextArea;
    private javax.swing.JTable feedbackListTable;
    private javax.swing.ButtonGroup feedbackbuttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton userRadioButton;
    // End of variables declaration//GEN-END:variables
}
