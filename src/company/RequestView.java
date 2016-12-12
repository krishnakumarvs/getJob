/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

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
public class RequestView extends javax.swing.JPanel {

    DefaultTableModel model;
    int companyId;
    String requestId;

    /**
     * Creates new form RequestView
     */
    public RequestView() {
        initComponents();
    }

    public RequestView(int id1) {
        initComponents();
        companyId = id1;
        loadData();
    }

    void loadData() {
        try {
            rejectButton.setEnabled(false);
            deleteButton.setEnabled(false);
            approveButton.setEnabled(false);
            profileButton.setEnabled(false);
            Dbcon db = new Dbcon();
            model = (DefaultTableModel) requestTable.getModel();
            String sql = "select * from tbl_request where companyId='" + companyId + "'";
            ResultSet rs = db.select(sql);
            String arr[] = new String[6];
            while (rs.next()) {
                arr[0] = rs.getString("id");
                arr[1] = rs.getString("name");
                arr[2] = rs.getString("qualification");
                arr[3] = rs.getString("location");
                arr[4] = rs.getString("post");
                arr[5] = rs.getString("status");
                model.addRow(arr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RequestView.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        rejectButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        approveButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("      REQUESTS");

        requestTable.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Qualification", "Location", "Post", "status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(requestTable);
        requestTable.getColumnModel().getColumn(0).setMinWidth(50);
        requestTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        requestTable.getColumnModel().getColumn(0).setMaxWidth(50);
        requestTable.getColumnModel().getColumn(3).setMinWidth(100);
        requestTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        requestTable.getColumnModel().getColumn(3).setMaxWidth(100);
        requestTable.getColumnModel().getColumn(4).setMinWidth(100);
        requestTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        requestTable.getColumnModel().getColumn(4).setMaxWidth(100);

        rejectButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        rejectButton.setText("Reject");
        rejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButtonActionPerformed(evt);
            }
        });

        profileButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        profileButton.setText("Profile");
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        approveButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        approveButton.setText("Approve");
        approveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(rejectButton)
                        .addGap(63, 63, 63)
                        .addComponent(deleteButton)
                        .addGap(75, 75, 75)
                        .addComponent(profileButton)
                        .addGap(78, 78, 78)
                        .addComponent(approveButton)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rejectButton)
                    .addComponent(deleteButton)
                    .addComponent(approveButton)
                    .addComponent(profileButton))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed
        String s = "Approved";
        String sql = "update tbl_request set status='" + s + "' where id='" + requestId + "'";
        Dbcon db = new Dbcon();
        int n = db.insert(sql);
        RequestView requestView = new RequestView(companyId);
        this.getParent().add(requestView);
        this.setVisible(false);
        requestView.setVisible(true);
        this.revalidate();
        this.repaint();
// TODO add your handling code here:
    }//GEN-LAST:event_approveButtonActionPerformed

    private void requestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTableMouseClicked
        model = (DefaultTableModel) requestTable.getModel();
        if (model.getValueAt(requestTable.getSelectedRow(), 0).toString().equals("")) {
            JOptionPane.showMessageDialog(this, "No data to select");
        } else {
            requestId = model.getValueAt(requestTable.getSelectedRow(), 0).toString();
            rejectButton.setEnabled(true);
            deleteButton.setEnabled(true);
            profileButton.setEnabled(true);
            approveButton.setEnabled(true);
        }
    }//GEN-LAST:event_requestTableMouseClicked

    private void rejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButtonActionPerformed
        String r = "rejected";
        String sql = "update tbl_request set status='" + r + "' where id='" + requestId + "'";
        Dbcon db = new Dbcon();
        int n = db.insert(sql);
        RequestView requestView = new RequestView(companyId);
        this.getParent().add(requestView);
        this.setVisible(false);
        requestView.setVisible(true);
        this.revalidate();
        this.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_rejectButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String sql = "delete from tbl_request where id= '" + requestId + "' ";
        Dbcon db = new Dbcon();
        int n = db.insert(sql);
        RequestView requestView = new RequestView(companyId);
        this.getParent().add(requestView);
        this.setVisible(false);
        requestView.setVisible(true);
        this.revalidate();
        this.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        HomePageCompany.flag=2;
        ProfileViewUser profileViewUser = new ProfileViewUser(requestId);
        profileViewUser.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_profileButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton rejectButton;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables
}
