package Main;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

public final class Index extends javax.swing.JFrame {
    
    Connection conn = null;
    
    public Index() {
        initComponents();
        otherComponent();
        getPatients();
        getMedicalRecords();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        medicalRecordPop = new javax.swing.JPopupMenu();
        editItem = new javax.swing.JMenuItem();
        viewItem = new javax.swing.JMenuItem();
        topPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        bottomPanel = new javax.swing.JPanel();
        add_patient_button = new javax.swing.JButton();
        add_appointment_button = new javax.swing.JButton();
        add_appointment_button1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        search_patient_field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientBodypanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        search_appointment_field = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        appointmentBodypanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        search_medical_record_field = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        medical_records_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        medicalRecordPop.setBackground(new java.awt.Color(0, 0, 51));

        editItem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        editItem.setForeground(new java.awt.Color(204, 204, 204));
        editItem.setText("Edit");
        editItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editItemActionPerformed(evt);
            }
        });
        medicalRecordPop.add(editItem);

        viewItem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        viewItem.setForeground(new java.awt.Color(204, 204, 204));
        viewItem.setText("View medical record");
        medicalRecordPop.add(viewItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topPanel.setBackground(new java.awt.Color(0, 0, 51));
        topPanel.setPreferredSize(new java.awt.Dimension(1200, 60));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Management System");
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 60));
        topPanel.add(jLabel1);

        getContentPane().add(topPanel, java.awt.BorderLayout.PAGE_START);

        leftPanel.setPreferredSize(new java.awt.Dimension(50, 489));

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );

        getContentPane().add(leftPanel, java.awt.BorderLayout.LINE_START);

        rightPanel.setPreferredSize(new java.awt.Dimension(50, 489));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );

        getContentPane().add(rightPanel, java.awt.BorderLayout.LINE_END);

        add_patient_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        add_patient_button.setForeground(new java.awt.Color(0, 0, 51));
        add_patient_button.setText("ADD PATIENT");
        add_patient_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_patient_buttonActionPerformed(evt);
            }
        });

        add_appointment_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        add_appointment_button.setForeground(new java.awt.Color(0, 0, 51));
        add_appointment_button.setText("ADD APPOINTMENT");
        add_appointment_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_appointment_buttonActionPerformed(evt);
            }
        });

        add_appointment_button1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        add_appointment_button1.setForeground(new java.awt.Color(0, 0, 51));
        add_appointment_button1.setText("ADD MEDICAL RECORD");
        add_appointment_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_appointment_button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(add_patient_button, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(add_appointment_button, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(add_appointment_button1)
                .addContainerGap(543, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_patient_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_appointment_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_appointment_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(bottomPanel, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.BorderLayout());

        tabbedPane.setForeground(new java.awt.Color(51, 51, 51));

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(0, 0, 51));
        jPanel9.setPreferredSize(new java.awt.Dimension(1095, 60));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_patient_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        search_patient_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_patient_fieldKeyTyped(evt);
            }
        });
        jPanel9.add(search_patient_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, 30));

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Use this to search patient name,phone number or guardian.");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 520, 40));

        jPanel3.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(993, 100));

        patientBodypanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2, 2));

        jPanel7.setBackground(new java.awt.Color(0, 0, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 5, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.setForeground(new java.awt.Color(0, 0, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(1100, 60));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Name");
        jLabel2.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel7.add(jLabel2);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Phone number");
        jLabel5.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel7.add(jLabel5);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Address");
        jLabel3.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel7.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Guardian");
        jLabel4.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel7.add(jLabel4);

        jLabel6.setPreferredSize(new java.awt.Dimension(140, 14));
        jPanel7.add(jLabel6);

        patientBodypanel.add(jPanel7);

        jScrollPane1.setViewportView(patientBodypanel);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Patients", jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(0, 0, 51));
        jPanel10.setPreferredSize(new java.awt.Dimension(1095, 60));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_appointment_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        search_appointment_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_appointment_fieldKeyTyped(evt);
            }
        });
        jPanel10.add(search_appointment_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, 30));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Use this to search appointment's patient ID, name,phone number or date.");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 520, 40));

        jPanel4.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(993, 100));

        appointmentBodypanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2, 2));

        jPanel8.setBackground(new java.awt.Color(0, 0, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 5, 0, new java.awt.Color(255, 255, 255)));
        jPanel8.setForeground(new java.awt.Color(0, 0, 51));
        jPanel8.setPreferredSize(new java.awt.Dimension(1100, 60));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Name");
        jLabel7.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel8.add(jLabel7);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Phone number");
        jLabel8.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel8.add(jLabel8);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Date");
        jLabel10.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel8.add(jLabel10);

        jLabel11.setPreferredSize(new java.awt.Dimension(140, 14));
        jPanel8.add(jLabel11);

        appointmentBodypanel.add(jPanel8);

        jScrollPane2.setViewportView(appointmentBodypanel);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Appointments", jPanel4);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(1095, 60));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_medical_record_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        search_medical_record_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_medical_record_fieldKeyTyped(evt);
            }
        });
        jPanel5.add(search_medical_record_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, 30));

        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Use this to search medical record 's  patient name,diagnosis,description,prescription,treatment plan or created at");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 570, 40));

        jPanel6.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        medical_records_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        medical_records_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                medical_records_tableMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(medical_records_table);

        jPanel6.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Medical records", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1095, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Notifications", jPanel2);

        jPanel1.add(tabbedPane, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1216, 688));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void add_patient_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_patient_buttonActionPerformed
        onGlass();
        new Forms.Patient.Create(this).setVisible(true);
    }//GEN-LAST:event_add_patient_buttonActionPerformed

    private void add_appointment_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_appointment_buttonActionPerformed
        onGlass();
        new Forms.Appointment.Create(this).setVisible(true);
    }//GEN-LAST:event_add_appointment_buttonActionPerformed

    private void search_patient_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_patient_fieldKeyTyped
        getPatients();
    }//GEN-LAST:event_search_patient_fieldKeyTyped

    private void search_appointment_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_appointment_fieldKeyTyped
        getAppointments();
    }//GEN-LAST:event_search_appointment_fieldKeyTyped

    private void add_appointment_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_appointment_button1ActionPerformed
        onGlass();
        new Forms.MedicalRecord.Create(this).setVisible(true);
    }//GEN-LAST:event_add_appointment_button1ActionPerformed

    private void search_medical_record_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_medical_record_fieldKeyTyped
        getMedicalRecords();
    }//GEN-LAST:event_search_medical_record_fieldKeyTyped

    private void medical_records_tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medical_records_tableMousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            medicalRecordPop.show(medical_records_table, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_medical_records_tableMousePressed

    private void editItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editItemActionPerformed
        String id  = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 0).toString();
        String patient_id = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 1).toString();
        String name = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 2).toString();
        String description  = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 3).toString();
        String diagnosis  = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 4).toString();
        String prescription  = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 5).toString();
        String treatment  = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 6).toString();
        onGlass();
    new Forms.MedicalRecord.Edit(id, patient_id, name, description, diagnosis, prescription, treatment, this).setVisible(true);
    }//GEN-LAST:event_editItemActionPerformed
    
    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Index().setVisible(true);
        });
    }
    
    public void otherComponent() {
        conn = Database.JavaConnection.getConnection();
        tabbedPane.setFont(new Font("Sanserif", Font.BOLD, 14));
        setTheGlassPane();
    }
    
    public void setTheGlassPane() {
        rootPane.setGlassPane(new JComponent() {
            
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(new Color(0, 0, 0, 180));
                g.fillRect(0, 0, getWidth(), getHeight());
                super.paintComponent(g);
            }
            
        });
    }
    
    public void onGlass() {
        rootPane.getGlassPane().setVisible(true);
    }
    
    public void offGlass() {
        rootPane.getGlassPane().setVisible(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_appointment_button;
    private javax.swing.JButton add_appointment_button1;
    private javax.swing.JButton add_patient_button;
    private javax.swing.JPanel appointmentBodypanel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JMenuItem editItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPopupMenu medicalRecordPop;
    private javax.swing.JTable medical_records_table;
    private javax.swing.JPanel patientBodypanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTextField search_appointment_field;
    private javax.swing.JTextField search_medical_record_field;
    private javax.swing.JTextField search_patient_field;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JPanel topPanel;
    private javax.swing.JMenuItem viewItem;
    // End of variables declaration//GEN-END:variables

    public void getPatients() {
        String search = search_patient_field.getText().trim();
        String sql = "";
        if (!search.isEmpty()) {
            sql = "Select * from patients where"
                    + " name like '%" + search + "%' or"
                    + " phone like '%" + search + "%' or"
                    + " guardian like '%" + search + "%' "
                    + " order by id desc";
        } else {
            sql = "Select * from patients order by id desc";
        }
        patientBodypanel.removeAll();
        patientBodypanel.add(new Cards.TableCardPatientHead());
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            int height = 65;
            while (rs.next()) {
                height += 65;
                String id = rs.getString("id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String guardian = rs.getString("guardian");
                String birthdate = rs.getString("birthdate");
                patientBodypanel.add(new Cards.TableCardPatientData(id, name, phone, address, guardian, birthdate, this));
                patientBodypanel.repaint();
                patientBodypanel.revalidate();
            }
            patientBodypanel.setPreferredSize(new Dimension(993, height));
            getAppointments();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void getAppointments() {
        String search = search_appointment_field.getText().trim();
        String sql = "";
        if (!search.isEmpty()) {
            sql = "Select  "
                    + "a.id,"
                    + "p.name,"
                    + "a.patient_id,"
                    + "p.phone,"
                    + "a.date "
                    + "from appointments a join patients p on p.id = a.patient_id  where "
                    + " p.name like '%" + search + "%' or "
                    + " p.phone like '%" + search + "%' or "
                    + " a.date like '%" + search + "%' "
                    + " order by id desc";
        } else {
            sql = "Select "
                    + "a.id as 'id' ,"
                    + "p.name,"
                    + "a.patient_id,"
                    + "p.phone,"
                    + "a.date"
                    + " from appointments a join patients p on p.id = a.patient_id order by id desc";
        }
        appointmentBodypanel.removeAll();
        appointmentBodypanel.add(new Cards.TableCardAppointmentHead());
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            int height = 65;
            while (rs.next()) {
                height += 65;
                String id = rs.getString("id");
                String patient_id = rs.getString("patient_id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String date = rs.getString("date");
                
                appointmentBodypanel.add(new Cards.TableCardAppointmentData(id, patient_id, name, phone, date, this));
                appointmentBodypanel.repaint();
                appointmentBodypanel.revalidate();
            }
            appointmentBodypanel.setPreferredSize(new Dimension(993, height));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void getMedicalRecords() {
        String search = search_medical_record_field.getText().trim();
        String sql = "";
        if (!search.isEmpty()) {
            sql = "Select "
                    + "m.id as 'ID',"
                    + "m.patient_id as 'Patient ID',"
                    + "p.name as 'Patient Name',"
                    + "m.description as 'Description',"
                    + "m.diagnosis as 'Diagnosis',"
                    + "m.prescription as 'Prescription',"
                    + "m.treatment_plan as 'Treatment Plan',"
                    + "m.created_at as 'Recorded at'"
                    + " from medical_records m join patients p on m.patient_id = p.id where"
                    + " m.diagnosis like '%" + search + "%' or"
                    + " m.description like '%" + search + "%' or"
                    + " m.treatment_plan like '%" + search + "%' or"
                    + " m.prescription like '%" + search + "%' or"
                    + " m.created_at like '%" + search + "%' "
                    + " order by id desc";
        } else {
            sql = "Select "
                    + "m.id as 'ID',"
                    + "m.patient_id as 'Patient ID',"
                    + "p.name as 'Patient Name',"
                    + "m.description as 'Description',"
                    + "m.diagnosis as 'Diagnosis',"
                    + "m.prescription as 'Prescription',"
                    + "m.treatment_plan as 'Treatment Plan',"
                    + "m.created_at as 'Recorded at'"
                    + "  from medical_records m join patients p on m.patient_id = p.id  order by id desc";
        }
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            medical_records_table.setModel(DbUtils.resultSetToTableModel(rs));
            
            TableColumnModel columnModel = medical_records_table.getColumnModel();
            for (int i = 0; i < columnModel.getColumnCount(); i++) {
                columnModel.getColumn(i).setCellRenderer(new Components.CenterAlignTableCellRenderer());
            }
            
            TableColumn descriptionColumn = medical_records_table.getColumnModel().getColumn(3);
            TableColumn diagnosisColumn = medical_records_table.getColumnModel().getColumn(4);
            TableColumn prescriptionColumn = medical_records_table.getColumnModel().getColumn(5);
            TableColumn treatment_planColumn = medical_records_table.getColumnModel().getColumn(6);
            descriptionColumn.setCellRenderer(new Components.WordWrapTableCellRenderer());
            diagnosisColumn.setCellRenderer(new Components.WordWrapTableCellRenderer());
            prescriptionColumn.setCellRenderer(new Components.WordWrapTableCellRenderer());
            treatment_planColumn.setCellRenderer(new Components.WordWrapTableCellRenderer());
            medical_records_table.getColumnModel().getColumn(0).setMaxWidth(50);
            medical_records_table.getColumnModel().getColumn(1).setMaxWidth(70);
            medical_records_table.getTableHeader().setFont(new Font("Sanserif", Font.BOLD, 13));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
