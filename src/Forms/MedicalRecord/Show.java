package Forms.MedicalRecord;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;

public final class Show extends javax.swing.JFrame {

    Main.Index index;
    Connection conn = null;
    String id;

    public Show(String name, String description, String diagnosis, String prescription, String treatment, Main.Index index) {
        initComponents();
        this.index = index;
        index.setEnabled(false);
        patient_name_label.setText(name);
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
        title_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        patient_name_label = new javax.swing.JLabel();
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
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 100, 30));

        title_label.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        title_label.setForeground(new java.awt.Color(204, 204, 204));
        title_label.setText("View medical record");
        title_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(title_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 230, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Description");
        jLabel2.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));

        patient_name_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        patient_name_label.setForeground(new java.awt.Color(204, 204, 204));
        patient_name_label.setText("Patient name:");
        patient_name_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(patient_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 780, 30));

        description_field.setBackground(new java.awt.Color(0, 0, 51));
        description_field.setColumns(20);
        description_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        description_field.setForeground(new java.awt.Color(204, 204, 204));
        description_field.setRows(5);
        description_field.setFocusable(false);
        jScrollPane1.setViewportView(description_field);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 146, 420, 190));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Diagnosis");
        jLabel3.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 30));

        diagnosis_field.setBackground(new java.awt.Color(0, 0, 51));
        diagnosis_field.setColumns(20);
        diagnosis_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        diagnosis_field.setForeground(new java.awt.Color(204, 204, 204));
        diagnosis_field.setRows(5);
        diagnosis_field.setFocusable(false);
        jScrollPane2.setViewportView(diagnosis_field);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 420, 180));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Prescription");
        jLabel4.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, 30));

        prescription_field.setBackground(new java.awt.Color(0, 0, 51));
        prescription_field.setColumns(20);
        prescription_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        prescription_field.setForeground(new java.awt.Color(204, 204, 204));
        prescription_field.setRows(5);
        prescription_field.setFocusable(false);
        jScrollPane3.setViewportView(prescription_field);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 146, 420, 190));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Treatment plan");
        jLabel6.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, 30));

        treatment_plan_field.setBackground(new java.awt.Color(0, 0, 51));
        treatment_plan_field.setColumns(20);
        treatment_plan_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        treatment_plan_field.setForeground(new java.awt.Color(204, 204, 204));
        treatment_plan_field.setRows(5);
        treatment_plan_field.setFocusable(false);
        jScrollPane4.setViewportView(treatment_plan_field);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 420, 180));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Patient name:");
        jLabel7.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 110, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(981, 574));
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
            new Show("", "", "", "", "", new Main.Index()).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea description_field;
    private javax.swing.JTextArea diagnosis_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel patient_name_label;
    private javax.swing.JTextArea prescription_field;
    private javax.swing.JLabel title_label;
    private javax.swing.JTextArea treatment_plan_field;
    // End of variables declaration//GEN-END:variables

}
