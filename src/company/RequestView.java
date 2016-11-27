/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author jj
 */
public class RequestView extends javax.swing.JPanel {

    /**
     * Creates new form RequestView
     */
    public RequestView() {
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
                "Name", "Qualification", "Location", "Post", "Status"
            }
        ));
        jScrollPane1.setViewportView(requestTable);

        rejectButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        rejectButton.setText("Reject");

        profileButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        profileButton.setText("Profile");

        deleteButton.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        deleteButton.setText("Delete");

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
        // TODO add your handling code here:
    }//GEN-LAST:event_approveButtonActionPerformed

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
