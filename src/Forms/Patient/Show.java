package Forms.Patient;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import raven.toast.Notifications;

public class Show extends javax.swing.JFrame {

    Main.Index index;
    Connection conn = null;
  String id, name, phone, address, guardian, birthdate;
    public Show(String name, String phone, String address, String guardian, String birthdate,  Main.Index index) {
        initComponents();
        this.index = index;
        index.setEnabled(false);
        nbame_label.setText(name);
        phone_label.setText(phone);
        address_label.setText(address);
        guardian_label.setText(guardian);
        birthdate_label.setText(birthdate);
        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        name_label = new javax.swing.JLabel();
        birthdate_label = new javax.swing.JLabel();
        nbame_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        guardian_label = new javax.swing.JLabel();
        phone_label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Exit");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 100, 30));

        name_label.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        name_label.setForeground(new java.awt.Color(204, 204, 204));
        name_label.setText("Patient's Details");
        name_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        birthdate_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        birthdate_label.setForeground(new java.awt.Color(204, 204, 204));
        birthdate_label.setText("Birthdate :");
        birthdate_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(birthdate_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 550, 30));

        nbame_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nbame_label.setForeground(new java.awt.Color(204, 204, 204));
        nbame_label.setText("Name :");
        nbame_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(nbame_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 590, 30));

        address_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        address_label.setForeground(new java.awt.Color(204, 204, 204));
        address_label.setText("Address :");
        address_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(address_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 570, 30));

        guardian_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        guardian_label.setForeground(new java.awt.Color(204, 204, 204));
        guardian_label.setText("Guardian:");
        guardian_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(guardian_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 580, 30));

        phone_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        phone_label.setForeground(new java.awt.Color(204, 204, 204));
        phone_label.setText("Phone number :");
        phone_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(phone_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 520, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Name :");
        jLabel7.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 50, 30));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Phone number :");
        jLabel8.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 120, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Address :");
        jLabel9.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 70, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Guardian:");
        jLabel10.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 70, 30));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Birthdate :");
        jLabel11.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 80, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(705, 323));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        index.setEnabled(true);
        index.offGlass();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Show(null,null,null,null,null,new Main.Index()).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_label;
    private javax.swing.JLabel birthdate_label;
    private javax.swing.JLabel guardian_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel nbame_label;
    private javax.swing.JLabel phone_label;
    // End of variables declaration//GEN-END:variables

    
}
