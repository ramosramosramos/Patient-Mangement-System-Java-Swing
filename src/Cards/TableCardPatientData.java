package Cards;

import java.awt.Dimension;

public class TableCardPatientData extends javax.swing.JPanel {

    Main.Index index;
String id,name,phone,address,guardian,birthdate;
    public TableCardPatientData(String id, String name, String phone, String address, String guardian,String birthdate, Main.Index index) {
        initComponents();
        this.index = index;
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.guardian = guardian;
        this.birthdate = birthdate;
        name_label.setText(name);
        phone_label.setText(phone);
        address_label.setText(address);
        guardian_label.setText(guardian);
        this.setPreferredSize(new Dimension(995, 60));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        name_label = new javax.swing.JLabel();
        phone_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        guardian_label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setForeground(new java.awt.Color(0, 0, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(995, 50));

        name_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        name_label.setForeground(new java.awt.Color(51, 51, 51));
        name_label.setText("Name");
        name_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel7.add(name_label);

        phone_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        phone_label.setForeground(new java.awt.Color(51, 51, 51));
        phone_label.setText("Phone number");
        phone_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel7.add(phone_label);

        address_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        address_label.setForeground(new java.awt.Color(51, 51, 51));
        address_label.setText("Address");
        address_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel7.add(address_label);

        guardian_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        guardian_label.setForeground(new java.awt.Color(51, 51, 51));
        guardian_label.setText("Guardian");
        guardian_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel7.add(guardian_label);

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("VIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);

        add(jPanel7, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      index.onGlass();
        index.setEnabled(false);
        new Forms.Patient.Show(name,phone,address,guardian,birthdate,index).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        index.onGlass();
        index.setEnabled(false);
        new Forms.Patient.Edit(id,name,phone,address,guardian,birthdate,index).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_label;
    private javax.swing.JLabel guardian_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel phone_label;
    // End of variables declaration//GEN-END:variables
}
