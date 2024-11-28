package Forms.MedicalRecord;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

public final class Edit extends javax.swing.JFrame {

    Main.Index index;
    Connection conn = null;
    String id;

    public Edit(String id, String patient_id, String name, String description, String diagnosis, String prescription, String treatment, Main.Index index) {
        initComponents();
        this.index = index;
        this.id = id;
        conn = Database.JavaConnection.getConnection();
        Notifications.getInstance().setJFrame(this);
        index.setEnabled(false);
        getPatients();

        comboBox.setSelectedItem(patient_id + ". " + name);
        description_field.setText(description);
        diagnosis_field.setText(diagnosis);
        prescription_field.setText(prescription);
        treatment_plan_field.setText(treatment);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        name_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        description_field = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        diagnosis_field = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        prescription_field = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        treatment_plan_field = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Exit");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 100, 30));

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 51));
        jButton2.setText("Save");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 100, 30));

        name_label.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        name_label.setForeground(new java.awt.Color(204, 204, 204));
        name_label.setText("Edit medical record");
        name_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 230, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Description");
        jLabel2.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Patient");
        jLabel5.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));

        comboBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 420, 40));

        description_field.setColumns(20);
        description_field.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        description_field.setRows(5);
        jScrollPane1.setViewportView(description_field);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 420, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Diagnosis");
        jLabel3.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 30));

        diagnosis_field.setColumns(20);
        diagnosis_field.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        diagnosis_field.setRows(5);
        jScrollPane2.setViewportView(diagnosis_field);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 420, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Prescription");
        jLabel4.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, 30));

        prescription_field.setColumns(20);
        prescription_field.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        prescription_field.setRows(5);
        jScrollPane3.setViewportView(prescription_field);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 420, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Treatment plan");
        jLabel6.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, 30));

        treatment_plan_field.setColumns(20);
        treatment_plan_field.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        treatment_plan_field.setRows(5);
        jScrollPane4.setViewportView(treatment_plan_field);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 420, -1));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("DELETE");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 517, -1, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(974, 554));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        index.setEnabled(true);
        index.offGlass();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        handleEdit();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int ask = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove this medical record?");
        if (ask == JOptionPane.YES_OPTION) {
            try (PreparedStatement pst = conn.prepareStatement("Delete from medical_records where id = ?")) {
                pst.setString(1, id);
                pst.execute();
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Succcessfull deleted!");
                index.setEnabled(true);
                index.offGlass();
                index.getMedicalRecords();
                dispose();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Edit("", "", "", "", "", "", "", new Main.Index()).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboBox;
    private javax.swing.JTextArea description_field;
    private javax.swing.JTextArea diagnosis_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextArea prescription_field;
    private javax.swing.JTextArea treatment_plan_field;
    // End of variables declaration//GEN-END:variables

    public void handleEdit() {
        String[] data = Tools.StringTools.splitter(comboBox.getSelectedItem().toString(), ". ");
        String description = description_field.getText().trim();
        String diagnosis = diagnosis_field.getText().trim();
        String prescription = prescription_field.getText().trim();
        String treatment = treatment_plan_field.getText().trim();

        if (comboBox.getSelectedItem().toString().trim().equals("Select patient")) {
            message("Patient field is needed!");
            return;
        }
        if (diagnosis.isEmpty()) {
            message("Diagnosis field is needed!");
            return;
        }
        if (description.isEmpty()) {
            message("Description field is needed!");
            return;
        }
        if (prescription.isEmpty()) {
            message("Prescription field is needed!");
            return;
        }
        if (treatment.isEmpty()) {
            message("Treatment field is needed!");
            return;
        }

        try (PreparedStatement pst = conn.prepareStatement("update medical_records"
                + " set "
                + "patient_id =?,"
                + "description=?,"
                + "diagnosis=?,"
                + "prescription=?,"
                + "treatment_plan =? "
                + " where id = ?"
        )) {
            pst.setString(1, data[0]);
            pst.setString(2, description);
            pst.setString(3, diagnosis);
            pst.setString(4, prescription);
            pst.setString(5, treatment);
            pst.setString(6, id);

            pst.executeUpdate();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully updated!");
            index.setEnabled(true);
            index.offGlass();
            index.getMedicalRecords();
            dispose();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void message(String message) {
        Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, message);
    }

    public void getPatients() {
        comboBox.removeAllItems();
        comboBox.addItem("Select patient");
        try (PreparedStatement pst = conn.prepareStatement("Select id ,name from patients")) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                comboBox.addItem(id + ". " + name);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
