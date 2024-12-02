package Forms.MedicalRecord;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import raven.toast.Notifications;

public final class Create extends javax.swing.JFrame {

    Main.Index index;
    Connection conn = null;
    String id;
    String appointment_id;

    public Create( String appointment_id,String id, String name, Main.Index index) {
        initComponents();
        this.index = index;
        this.id = id;
        this.appointment_id = appointment_id;
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(getClass().getResource("/Images/jon.jpg")));

        
        System.out.println(appointment_id);
        label.setBounds(0, 0, 974, 560);
        mainPanel.add(label);

        conn = Database.JavaConnection.getConnection();
        Notifications.getInstance().setJFrame(this);
        index.setEnabled(false);
        name_field.setText(name);

        name_field.setOpaque(false);
        name_field.setBackground(new Color(0, 0, 0, 0));

//        JTextArea description_field = new JTextArea("Type something description here...");
//        JTextArea diagnosis_field = new JTextArea("Type something diagnosis here...");
//        JTextArea prescription_field = new JTextArea("Type something prescription here...");
//        JTextArea treatment_plan_field = new JTextArea("Type something treatment here...");
        designField(description_field,d1);
        designField(diagnosis_field,d2);
        designField(prescription_field,d3);
        designField(treatment_plan_field,d4);
        

    }

    public void designField(JTextArea textArea,JScrollPane pane) {
        textArea.setOpaque(false);
        textArea.setBackground(new Color(0, 0, 0, 0));
        textArea.setForeground(new Color(51, 51, 51)); 
        pane.getViewport().setOpaque(false);
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        name_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        s1 = new javax.swing.JPanel();
        d1 = new javax.swing.JScrollPane();
        description_field = new javax.swing.JTextArea();
        s3 = new javax.swing.JPanel();
        d3 = new javax.swing.JScrollPane();
        prescription_field = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        s2 = new javax.swing.JPanel();
        d2 = new javax.swing.JScrollPane();
        diagnosis_field = new javax.swing.JTextArea();
        s4 = new javax.swing.JPanel();
        d4 = new javax.swing.JScrollPane();
        treatment_plan_field = new javax.swing.JTextArea();
        name_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Exit");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 51));
        jButton2.setText("ADD");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        name_label.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        name_label.setForeground(new java.awt.Color(51, 51, 51));
        name_label.setText("Create medical record");
        name_label.setPreferredSize(new java.awt.Dimension(190, 50));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText(" Patient ID:");
        jLabel5.setPreferredSize(new java.awt.Dimension(190, 50));

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(4, 2, 10, 2));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Description");
        jPanel1.add(jLabel1);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Prescription");
        jPanel1.add(jLabel4);

        s1.setOpaque(false);
        s1.setLayout(new java.awt.BorderLayout());

        d1.setOpaque(false);

        description_field.setColumns(20);
        description_field.setRows(5);
        description_field.setOpaque(false);
        d1.setViewportView(description_field);

        s1.add(d1, java.awt.BorderLayout.CENTER);

        jPanel1.add(s1);

        s3.setOpaque(false);
        s3.setLayout(new java.awt.BorderLayout());

        d3.setOpaque(false);

        prescription_field.setColumns(20);
        prescription_field.setRows(5);
        prescription_field.setOpaque(false);
        d3.setViewportView(prescription_field);

        s3.add(d3, java.awt.BorderLayout.CENTER);

        jPanel1.add(s3);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Diagnosis");
        jPanel1.add(jLabel3);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Treatment plan");
        jPanel1.add(jLabel6);

        s2.setOpaque(false);
        s2.setLayout(new java.awt.BorderLayout());

        d2.setOpaque(false);

        diagnosis_field.setColumns(20);
        diagnosis_field.setRows(5);
        diagnosis_field.setOpaque(false);
        d2.setViewportView(diagnosis_field);

        s2.add(d2, java.awt.BorderLayout.CENTER);

        jPanel1.add(s2);

        s4.setOpaque(false);
        s4.setLayout(new java.awt.BorderLayout());

        d4.setOpaque(false);

        treatment_plan_field.setColumns(20);
        treatment_plan_field.setRows(5);
        treatment_plan_field.setOpaque(false);
        d4.setViewportView(treatment_plan_field);

        s4.add(d4, java.awt.BorderLayout.CENTER);

        jPanel1.add(s4);

        name_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        name_field.setForeground(new java.awt.Color(51, 51, 51));
        name_field.setBorder(null);
        name_field.setFocusable(false);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(570, 570, 570)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(974, 554));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        index.setEnabled(true);
        index.offGlass();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        handleCreate();

    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Create("","", "", new Main.Index()).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane d1;
    private javax.swing.JScrollPane d2;
    private javax.swing.JScrollPane d3;
    private javax.swing.JScrollPane d4;
    private javax.swing.JTextArea description_field;
    private javax.swing.JTextArea diagnosis_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField name_field;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextArea prescription_field;
    private javax.swing.JPanel s1;
    private javax.swing.JPanel s2;
    private javax.swing.JPanel s3;
    private javax.swing.JPanel s4;
    private javax.swing.JTextArea treatment_plan_field;
    // End of variables declaration//GEN-END:variables

    public void handleCreate() {

        String description = description_field.getText().trim();
        String diagnosis = diagnosis_field.getText().trim();
        String prescription = prescription_field.getText().trim();
        String treatment = treatment_plan_field.getText().trim();
        String created_at = Tools.Date.getDate("MMMM,dd,YYYY");

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

        try (PreparedStatement pst = conn.prepareStatement("Insert into medical_records"
                + "("
                + "patient_id,"
                + "description,"
                + "diagnosis,"
                + "prescription,"
                + "treatment_plan,"
                + "created_at"
                + ")"
                + "values(?,?,?,?,?,?)")) {
            pst.setString(1, id);
            pst.setString(2, description);
            pst.setString(3, diagnosis);
            pst.setString(4, prescription);
            pst.setString(5, treatment);
            pst.setString(6, created_at);

            pst.executeUpdate();
            
            
                    try (PreparedStatement pstUpdated = conn.prepareStatement("Update appointments set is_done=? where id =?")) {
            pstUpdated.setBoolean(1, true);
            pstUpdated.setString(2,  appointment_id);
            pstUpdated.executeUpdate();
            index.getAppointments();
            index.getAppointmentHistories();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully mark as done!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "New medical record is successfully added!");
            index.setEnabled(true);
            index.offGlass();
            index.getMedicalRecords();
            index.getAppointments();
            dispose();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void message(String message) {
        Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, message);
    }
}
