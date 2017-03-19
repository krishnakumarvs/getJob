package company;

import admin.LoginAdmin;
import getjob.start_frame;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HomePageCompany extends javax.swing.JFrame {

    int id;
    public static int flag = 0;

    public HomePageCompany() {
        initComponents();
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        
    }

    public HomePageCompany(int id1) {
        initComponents();
        id = id1;
        this.setLayout(new FlowLayout());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poor Richard", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("    GETJOB");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 280, 90));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Welcome to GetJob application.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 300, 34));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 260, 250));

        jMenu1.setText("Profile");

        jMenuItem4.setText("Profile Update");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("View Company Profile");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Job Announcement");

        jMenuItem7.setText("Add");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Update");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Request");

        jMenuItem9.setText("View");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Feedback");

        jMenuItem10.setText("Create");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("View");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Settings");

        jMenuItem1.setText("Change Password");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuItem2.setText("Change User Name");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuBar1.add(jMenu6);

        jMenu5.setText("Logout");

        jMenuItem12.setText("Logout");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.getContentPane().removeAll();
        ProfileViewCompany profileViewCompany;
        profileViewCompany = new ProfileViewCompany(id);
        this.add(profileViewCompany);
        profileViewCompany.setVisible(true);
        this.revalidate();
        this.repaint();            // TODO add your handling code here:
        profileViewCompany.loadProfileCompany();
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        this.getContentPane().removeAll();
        ProfileUpdate profileUpdate = new ProfileUpdate(id, this);
        this.add(profileUpdate);
        profileUpdate.setVisible(true);
        this.revalidate();
        this.repaint();            
        profileUpdate.loadProfileCompany();

// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.getContentPane().removeAll();
        AnnouncementAdd announcementAdd = new AnnouncementAdd(id, this);
        this.add(announcementAdd);
        announcementAdd.setVisible(true);
        this.revalidate();
        this.repaint();         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed
    
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        this.getContentPane().removeAll();
        AnnouncementUpdate1 announcementUpdate1 = new AnnouncementUpdate1(id,this);
        this.add(announcementUpdate1);
        announcementUpdate1.setVisible(true);
        this.revalidate();
        this.repaint();         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed
    
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        this.getContentPane().removeAll();
        RequestView requestView = new RequestView(id,this);
        this.add(requestView);
        requestView.setVisible(true);
        this.revalidate();
        this.repaint();         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed
    
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        this.getContentPane().removeAll();
        FeedbackCreate feedbackCreate = new FeedbackCreate(id, this);
        this.add(feedbackCreate);
        feedbackCreate.setVisible(true);
        this.revalidate();
        this.repaint();         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed
    
    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        this.getContentPane().removeAll();
        FeedbackViewCompany feedbackViewCompany = new FeedbackViewCompany(id);
        this.add(feedbackViewCompany);
        feedbackViewCompany.setVisible(true);
        this.revalidate();
        this.repaint();        
    }//GEN-LAST:event_jMenuItem11ActionPerformed
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.getContentPane().removeAll();
        ChangePasswordCompany changePasswordCompany = new ChangePasswordCompany(id, this);
        this.add(changePasswordCompany);
        changePasswordCompany.setVisible(true);
        this.revalidate();
        this.repaint();        
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.getContentPane().removeAll();
        ChangeUserNameCompany changeUserNameCompany = new ChangeUserNameCompany(id, this);
        this.add(changeUserNameCompany);
        changeUserNameCompany.setVisible(true);
        this.revalidate();
        this.repaint();        
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    
    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        JOptionPane oppane = new JOptionPane();
        int option = oppane.showConfirmDialog(oppane, "Are You Sure To Logout?");
        if (option == JOptionPane.YES_OPTION) {
            new start_frame().setVisible(true);
            this.dispose();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        System.out.println("hello" + flag);
        
        if (flag == 1) {
            //this.setEnabled(true);
            this.getContentPane().removeAll();
            AnnouncementUpdate1 announcementUpdate1 = new AnnouncementUpdate1(id,this);
            this.add(announcementUpdate1);
            announcementUpdate1.setVisible(true);
            this.revalidate();
            this.repaint();            
        } else if (flag == 2) {
            this.getContentPane().removeAll();
            RequestView requestView = new RequestView(id,this);
            this.add(requestView);
            requestView.setVisible(true);
            this.revalidate();
            this.repaint();            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(HomePageCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageCompany().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
