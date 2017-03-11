/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import db.Dbcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jj
 */
public class ShowRequest extends javax.swing.JPanel {

    DefaultTableModel model;
    HomePageAdmin parentframe;
    String idTable;

    /**
     * Creates new form ShowRequest
     */
    public ShowRequest(HomePageAdmin parentframe) {
        initComponents();
        load_request();
        this.parentframe = parentframe;
    }

    private void load_request() {
        try {
            deleteButton1.setEnabled(false);
            createButton.setEnabled(false);
            Dbcon db = new Dbcon();
            String sql = "select id,name,address,phone_no,mail_id,website from tbl_company where status=0";
            ResultSet rs = db.select(sql);
            model = (DefaultTableModel) companyTable.getModel();
            String arr[] = new String[6];
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String email = rs.getString("mail_id");
                String phone = rs.getString("phone_no");
                String address = rs.getString("address");
                String website = rs.getString("website");
                arr[0] = id;
                arr[1] = name;
                arr[2] = address;
                arr[3] = phone;
                arr[4] = email;
                arr[5] = website;
                model.addRow(arr);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        companyTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();

        companyTable.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        companyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Phone", "Email ID", "Website"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        companyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                companyTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(companyTable);
        if (companyTable.getColumnModel().getColumnCount() > 0) {
            companyTable.getColumnModel().getColumn(0).setMinWidth(0);
            companyTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            companyTable.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("          REQUEST");

        createButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        deleteButton1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        deleteButton1.setText("Delete");
        deleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton1)
                .addGap(214, 214, 214)
                .addComponent(createButton)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(deleteButton1))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void companyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companyTableMouseClicked
        model = (DefaultTableModel) companyTable.getModel();
        if (model.getValueAt(companyTable.getSelectedRow(), 0).toString().equals("")) {
            JOptionPane.showMessageDialog(this, "No data to select");
        } else {
            idTable = model.getValueAt(companyTable.getSelectedRow(), 0).toString();
            createButton.setEnabled(true);
            deleteButton1.setEnabled(true);
        }
    }//GEN-LAST:event_companyTableMouseClicked

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        String sql1 = "update tbl_company set status='" + 1 + "'where id='" + idTable + "'";
        int n;
        Dbcon db = new Dbcon();
        db.insert(sql1);
        JOptionPane.showMessageDialog(this, "successfully created");
        ShowRequest showRequest = new ShowRequest(parentframe);
        this.getParent().add(showRequest);
        this.setVisible(false);
        showRequest.setVisible(true);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_createButtonActionPerformed

    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton1ActionPerformed
        String sql1 = "delete from tbl_company where id='" + idTable + "'";
        int n;
        Dbcon db = new Dbcon();
        db.insert(sql1);
        JOptionPane.showMessageDialog(this, "successfully deleted");

        ShowRequest showRequest = new ShowRequest(parentframe);
        this.getParent().add(showRequest);
        this.setVisible(false);
        showRequest.setVisible(true);
        this.revalidate();
        this.repaint();// TODO add your handling code here:
    }//GEN-LAST:event_deleteButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable companyTable;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
