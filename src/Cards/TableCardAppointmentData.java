package Cards;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import raven.toast.Notifications;

public class TableCardAppointmentData extends javax.swing.JPanel {

    Main.Index index;
String id,patient_id,name,phone,date ,IP_ADDRESS;
    Connection conn = null;
    public TableCardAppointmentData(String id, String patient_id, String name, String phone,String IP_ADDRESS, String date,Main.Index index) {
        initComponents();
        this.index = index;
        this.id = id;
        this.patient_id = patient_id;
        this.name = name;
        this.phone = phone;
        this.date = date;
        this.IP_ADDRESS= IP_ADDRESS;
        patient_id_label.setText(patient_id);
        name_label.setText(name);
        phone_label.setText(phone);
        date_label.setText(date);
        conn = Database.JavaConnection.getConnection();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        patient_id_label = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        phone_label = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setForeground(new java.awt.Color(0, 0, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(995, 50));

        patient_id_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        patient_id_label.setForeground(new java.awt.Color(204, 204, 204));
        patient_id_label.setText("Patient ID");
        patient_id_label.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel7.add(patient_id_label);

        name_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        name_label.setForeground(new java.awt.Color(204, 204, 204));
        name_label.setText("Name");
        name_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel7.add(name_label);

        phone_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        phone_label.setForeground(new java.awt.Color(204, 204, 204));
        phone_label.setText("Phone number");
        phone_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel7.add(phone_label);

        date_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        date_label.setForeground(new java.awt.Color(204, 204, 204));
        date_label.setText("Date");
        date_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel7.add(date_label);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Notify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);

        jButton3.setBackground(new java.awt.Color(0, 204, 0));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Mark as done");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3);

        add(jPanel7, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String MESSAGE = "Hello "+name+",I remind your appointment checkup this "+date+". God bless";
        Tools.IP.Notify(IP_ADDRESS,phone, MESSAGE, true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        index.onGlass();
        index.setEnabled(false);
        new Forms.Appointment.Edit(id,patient_id,name,date,index).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try (PreparedStatement pst = conn.prepareStatement("Update appointments set is_done=? where id =?")) {
            pst.setBoolean(1, true);
            pst.setString(2, id);
            pst.executeUpdate();
            index.getAppointments();
            index.getAppointmentHistories();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully mark as done!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel patient_id_label;
    private javax.swing.JLabel phone_label;
    // End of variables declaration//GEN-END:variables
}
