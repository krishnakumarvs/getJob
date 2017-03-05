/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import company.AnnouncementUpdate1;
import company.AnnouncementUpdate2;
import db.Dbcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jj
 */
public class CompanyManage extends javax.swing.JPanel {
DefaultTableModel model;
HomePageAdmin parentframe;
String idTable;
    /**
     * Creates new form ManageCompany
     */
    public CompanyManage() {
        initComponents();
        load_updateprofile();
    }
    
 private void load_updateprofile(){
        try {
            deleteButton.setEnabled(false);
            detailsButton.setEnabled(false);
            Dbcon db=new Dbcon();
            String sql="select id,name,mail_id,phone_no,address from tbl_company where status=1";
            ResultSet rs=db.select(sql);
            model=(DefaultTableModel)companyTable.getModel();
            String arr[]=new String[5];
            while(rs.next()){
                String id=rs.getString("id");
                String name=rs.getString("name");
                String email=rs.getString("mail_id");
                String phone=rs.getString("phone_no");
                String address=rs.getString("address");
                arr[0]=id;
                arr[1]=name;
                arr[2]=email;
                arr[3]=phone;
                arr[4]=address;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        companyTable = new javax.swing.JTable();
        detailsButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("         COMPANYS     ");

        companyTable.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        companyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Phone", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        companyTable.getColumnModel().getColumn(0).setMinWidth(0);
        companyTable.getColumnModel().getColumn(0).setPreferredWidth(0);
        companyTable.getColumnModel().getColumn(0).setMaxWidth(0);
        companyTable.getColumnModel().getColumn(4).setMinWidth(150);
        companyTable.getColumnModel().getColumn(4).setPreferredWidth(150);
        companyTable.getColumnModel().getColumn(4).setMaxWidth(150);

        detailsButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        detailsButton.setText("Details");
        detailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsButtonActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(detailsButton)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(detailsButton))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
String sql="delete from tbl_company where id='"+idTable+"'";  
Dbcon db=new Dbcon();
int n=db.insert(sql);
 CompanyManage companyManage = new CompanyManage();
        this.getParent().add(companyManage);
        this.setVisible(false);
        companyManage.setVisible(true);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_deleteButtonActionPerformed

private void companyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companyTableMouseClicked
  model = (DefaultTableModel) companyTable.getModel();
        if (model.getValueAt(companyTable.getSelectedRow(), 0).toString().equals("")) {
            JOptionPane.showMessageDialog(this, "No data to select");
        } else {
            idTable = model.getValueAt(companyTable.getSelectedRow(), 0).toString();
            detailsButton.setEnabled(true);
            deleteButton.setEnabled(true);
        }
}//GEN-LAST:event_companyTableMouseClicked

    private void detailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsButtonActionPerformed
        Company_Detail company_Detail = new Company_Detail(idTable);
        
        company_Detail.setVisible(true);
        // this.revalidate(); // TODO add your handling code here:
    }//GEN-LAST:event_detailsButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable companyTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton detailsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
