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
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;
import raven.toast.Notifications;

public final class Index extends javax.swing.JFrame {

    Connection conn = null;
    String IP_ADDRESS;

    public Index() {
        initComponents();
        otherComponent();
        IP_ADDRESS = Tools.IP.getIPAddress();
        ip_address_label.setText("IP:" + IP_ADDRESS);
        getPatients();
        getMedicalRecords();
        getAppointmentHistories();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        medicalRecordPop = new javax.swing.JPopupMenu();
        editItem = new javax.swing.JMenuItem();
        viewItem = new javax.swing.JMenuItem();
        historyPop = new javax.swing.JPopupMenu();
        deleteHistory = new javax.swing.JMenuItem();
        undoneHistory = new javax.swing.JMenuItem();
        topPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        bottomPanel = new javax.swing.JPanel();
        add_patient_button = new javax.swing.JButton();
        add_appointment_button = new javax.swing.JButton();
        add_appointment_button1 = new javax.swing.JButton();
        add_appointment_button2 = new javax.swing.JButton();
        ip_address_label = new javax.swing.JLabel();
        add_appointment_button3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        search_patient_field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
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
        jButton7 = new javax.swing.JButton();
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
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        medical_records_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        search_appointment_histories_field = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        appointment_histories_table = new javax.swing.JTable();

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
        viewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemActionPerformed(evt);
            }
        });
        medicalRecordPop.add(viewItem);

        historyPop.setBackground(new java.awt.Color(0, 0, 51));

        deleteHistory.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        deleteHistory.setForeground(new java.awt.Color(204, 204, 204));
        deleteHistory.setText("Delete");
        deleteHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteHistoryActionPerformed(evt);
            }
        });
        historyPop.add(deleteHistory);

        undoneHistory.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        undoneHistory.setForeground(new java.awt.Color(204, 204, 204));
        undoneHistory.setText("Mark as undone");
        undoneHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoneHistoryActionPerformed(evt);
            }
        });
        historyPop.add(undoneHistory);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topPanel.setBackground(new java.awt.Color(51, 51, 51));
        topPanel.setPreferredSize(new java.awt.Dimension(1200, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor's Management System");
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 60));
        topPanel.add(jLabel1);

        getContentPane().add(topPanel, java.awt.BorderLayout.PAGE_START);

        leftPanel.setBackground(new java.awt.Color(51, 51, 51));
        leftPanel.setPreferredSize(new java.awt.Dimension(50, 489));

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        getContentPane().add(leftPanel, java.awt.BorderLayout.LINE_START);

        rightPanel.setBackground(new java.awt.Color(51, 51, 51));
        rightPanel.setPreferredSize(new java.awt.Dimension(50, 489));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        getContentPane().add(rightPanel, java.awt.BorderLayout.LINE_END);

        bottomPanel.setBackground(new java.awt.Color(51, 51, 51));

        add_patient_button.setBackground(new java.awt.Color(51, 51, 51));
        add_patient_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        add_patient_button.setForeground(new java.awt.Color(204, 204, 204));
        add_patient_button.setText("ADD PATIENT");
        add_patient_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_patient_buttonActionPerformed(evt);
            }
        });

        add_appointment_button.setBackground(new java.awt.Color(51, 51, 51));
        add_appointment_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        add_appointment_button.setForeground(new java.awt.Color(204, 204, 204));
        add_appointment_button.setText("ADD APPOINTMENT");
        add_appointment_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_appointment_buttonActionPerformed(evt);
            }
        });

        add_appointment_button1.setBackground(new java.awt.Color(51, 51, 51));
        add_appointment_button1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        add_appointment_button1.setForeground(new java.awt.Color(204, 204, 204));
        add_appointment_button1.setText("ADD MEDICAL RECORD");
        add_appointment_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_appointment_button1ActionPerformed(evt);
            }
        });

        add_appointment_button2.setBackground(new java.awt.Color(51, 51, 51));
        add_appointment_button2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        add_appointment_button2.setForeground(new java.awt.Color(204, 204, 204));
        add_appointment_button2.setText("Get automatic IP ADDRESS");
        add_appointment_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_appointment_button2ActionPerformed(evt);
            }
        });

        ip_address_label.setForeground(new java.awt.Color(204, 204, 204));
        ip_address_label.setText("IP:address");

        add_appointment_button3.setBackground(new java.awt.Color(51, 51, 51));
        add_appointment_button3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        add_appointment_button3.setForeground(new java.awt.Color(204, 204, 204));
        add_appointment_button3.setText("ManulaADD IP ADDRESS");
        add_appointment_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_appointment_button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(add_patient_button, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(add_appointment_button, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(add_appointment_button1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_appointment_button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_appointment_button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ip_address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_patient_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_appointment_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_appointment_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_appointment_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_appointment_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ip_address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(bottomPanel, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new java.awt.BorderLayout());

        tabbedPane.setForeground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setPreferredSize(new java.awt.Dimension(1095, 60));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_patient_field.setBackground(new java.awt.Color(51, 51, 51));
        search_patient_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        search_patient_field.setForeground(new java.awt.Color(204, 204, 204));
        search_patient_field.setCaretColor(new java.awt.Color(153, 153, 153));
        search_patient_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_patient_fieldKeyTyped(evt);
            }
        });
        jPanel9.add(search_patient_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 290, 30));

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Use this to search patient name,phone number or guardian.");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 520, 40));

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setText("PRINT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, -1, -1));

        jPanel3.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(993, 100));

        patientBodypanel.setBackground(new java.awt.Color(51, 51, 51));
        patientBodypanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2, 2));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(102, 102, 102)));
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

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setPreferredSize(new java.awt.Dimension(1095, 60));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_appointment_field.setBackground(new java.awt.Color(51, 51, 51));
        search_appointment_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        search_appointment_field.setForeground(new java.awt.Color(204, 204, 204));
        search_appointment_field.setCaretColor(new java.awt.Color(153, 153, 153));
        search_appointment_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_appointment_fieldKeyTyped(evt);
            }
        });
        jPanel10.add(search_appointment_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 290, 30));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Use this to search appointment's patient ID, name,phone number or date.");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 520, 40));

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 204, 204));
        jButton7.setText("PRINT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, -1, -1));

        jPanel4.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(993, 100));

        appointmentBodypanel.setBackground(new java.awt.Color(51, 51, 51));
        appointmentBodypanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2, 2));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
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

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(1095, 60));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_medical_record_field.setBackground(new java.awt.Color(51, 51, 51));
        search_medical_record_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        search_medical_record_field.setForeground(new java.awt.Color(204, 204, 204));
        search_medical_record_field.setCaretColor(new java.awt.Color(153, 153, 153));
        search_medical_record_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_medical_record_fieldKeyTyped(evt);
            }
        });
        jPanel5.add(search_medical_record_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 290, 30));

        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Use this to search medical record 's  patient name,diagnosis,description,prescription,treatment plan or recorder at");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 690, 40));

        jButton8.setBackground(new java.awt.Color(0, 102, 102));
        jButton8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 204, 204));
        jButton8.setText("PRINT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, -1, -1));

        jPanel6.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jScrollPane3.setBackground(new java.awt.Color(51, 51, 51));

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

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setPreferredSize(new java.awt.Dimension(1095, 60));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_appointment_histories_field.setBackground(new java.awt.Color(51, 51, 51));
        search_appointment_histories_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        search_appointment_histories_field.setForeground(new java.awt.Color(204, 204, 204));
        search_appointment_histories_field.setCaretColor(new java.awt.Color(153, 153, 153));
        search_appointment_histories_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_appointment_histories_fieldKeyTyped(evt);
            }
        });
        jPanel11.add(search_appointment_histories_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 290, 30));

        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Use this to search appointment history's patient ID, name,phone number or date.");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 690, 40));

        jButton9.setBackground(new java.awt.Color(0, 102, 102));
        jButton9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(204, 204, 204));
        jButton9.setText("PRINT");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, -1, -1));

        jPanel2.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jScrollPane4.setBackground(new java.awt.Color(51, 51, 51));

        appointment_histories_table.setModel(new javax.swing.table.DefaultTableModel(
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
        appointment_histories_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                appointment_histories_tableMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(appointment_histories_table);

        jPanel2.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Appointment history", jPanel2);

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
        String id = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 0).toString();
        String patient_id = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 1).toString();
        String name = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 2).toString();
        String description = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 3).toString();
        String diagnosis = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 4).toString();
        String prescription = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 5).toString();
        String treatment = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 6).toString();
        onGlass();
        new Forms.MedicalRecord.Edit(id, patient_id, name, description, diagnosis, prescription, treatment, this).setVisible(true);
    }//GEN-LAST:event_editItemActionPerformed

    private void viewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItemActionPerformed
        String name = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 2).toString();
        String description = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 3).toString();
        String diagnosis = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 4).toString();
        String prescription = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 5).toString();
        String treatment = medical_records_table.getValueAt(medical_records_table.getSelectedRow(), 6).toString();
        onGlass();
        new Forms.MedicalRecord.Show(name, description, diagnosis, prescription, treatment, this).setVisible(true);
    }//GEN-LAST:event_viewItemActionPerformed

    private void search_appointment_histories_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_appointment_histories_fieldKeyTyped
        getAppointmentHistories();
    }//GEN-LAST:event_search_appointment_histories_fieldKeyTyped

    private void appointment_histories_tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointment_histories_tableMousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            historyPop.show(appointment_histories_table, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_appointment_histories_tableMousePressed

    private void undoneHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoneHistoryActionPerformed

        try (PreparedStatement pst = conn.prepareStatement("Update appointments set is_done=? where id =?")) {
            String id = appointment_histories_table.getValueAt(appointment_histories_table.getSelectedRow(), 0).toString();
            pst.setBoolean(1, false);
            pst.setString(2, id);
            pst.executeUpdate();
            getAppointments();
            getAppointmentHistories();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully mark as undone!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_undoneHistoryActionPerformed

    private void deleteHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteHistoryActionPerformed
        int ask = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove this appointment history?");
        if (ask == JOptionPane.YES_OPTION) {
            try (PreparedStatement pst = conn.prepareStatement("Delete  from appointments where id = ?")) {
                String id = appointment_histories_table.getValueAt(appointment_histories_table.getSelectedRow(), 0).toString();
                pst.setString(1, id);
                pst.execute();
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Succcessfull deleted!");
                getAppointmentHistories();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }//GEN-LAST:event_deleteHistoryActionPerformed

    private void add_appointment_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_appointment_button2ActionPerformed
        IP_ADDRESS = Tools.IP.getIPAddress();
        ip_address_label.setText("IP:" + IP_ADDRESS);
    }//GEN-LAST:event_add_appointment_button2ActionPerformed

    private void add_appointment_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_appointment_button3ActionPerformed
        String ip = JOptionPane.showInputDialog(null, "Enter IP address");
        if (!ip.trim().isEmpty()) {
            IP_ADDRESS = ip;
            ip_address_label.setText("IP:" + ip);
        }

    }//GEN-LAST:event_add_appointment_button3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Tools.PrintHelper.getPrintPanel(patientBodypanel);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      Tools.PrintHelper.getPrintPanel(appointmentBodypanel);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         Tools.PrintHelper.getPrintTable(medical_records_table);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       Tools.PrintHelper.getPrintTable(appointment_histories_table);
    }//GEN-LAST:event_jButton9ActionPerformed

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
    private javax.swing.JButton add_appointment_button2;
    private javax.swing.JButton add_appointment_button3;
    private javax.swing.JButton add_patient_button;
    private javax.swing.JPanel appointmentBodypanel;
    private javax.swing.JTable appointment_histories_table;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JMenuItem deleteHistory;
    private javax.swing.JMenuItem editItem;
    private javax.swing.JPopupMenu historyPop;
    private javax.swing.JLabel ip_address_label;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel11;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPopupMenu medicalRecordPop;
    private javax.swing.JTable medical_records_table;
    private javax.swing.JPanel patientBodypanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTextField search_appointment_field;
    private javax.swing.JTextField search_appointment_histories_field;
    private javax.swing.JTextField search_medical_record_field;
    private javax.swing.JTextField search_patient_field;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JPanel topPanel;
    private javax.swing.JMenuItem undoneHistory;
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
                    + "from appointments a join patients p on p.id = a.patient_id  where is_done =?  and "
                    + "(p.name like '%" + search + "%' or "
                    + " p.phone like '%" + search + "%' or "
                    + " a.date like '%" + search + "%') "
                    + "  order by id desc";
        } else {
            sql = "Select "
                    + "a.id as 'id' ,"
                    + "p.name,"
                    + "a.patient_id,"
                    + "p.phone,"
                    + "a.date"
                    + " from appointments a join patients p on p.id = a.patient_id where is_done =? order by id desc";
        }
        appointmentBodypanel.removeAll();
        appointmentBodypanel.add(new Cards.TableCardAppointmentHead());
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setBoolean(1, false);
            ResultSet rs = pst.executeQuery();
            int height = 65;
            while (rs.next()) {
                height += 65;
                String id = rs.getString("id");
                String patient_id = rs.getString("patient_id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String date = rs.getString("date");

                appointmentBodypanel.add(new Cards.TableCardAppointmentData(id, patient_id, name, phone, IP_ADDRESS, date, this));
                appointmentBodypanel.repaint();
                appointmentBodypanel.revalidate();
            }
            appointmentBodypanel.setPreferredSize(new Dimension(993, height));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getAppointmentHistories() {
        String search = search_appointment_histories_field.getText().trim();
        String sql = "";
        if (!search.isEmpty()) {
            sql = "Select  "
                    + "a.id as 'ID' ,"
                    + "a.patient_id as 'Patient ID',"
                    + "p.name as 'Name',"
                    + "p.phone as 'Phone number',"
                    + "a.date as 'Date' "
                    + "from appointments a join patients p on p.id = a.patient_id "
                    + "where is_done =? "
                    + " and "
                    + " (p.name like '%" + search + "%' or "
                    + " p.phone like '%" + search + "%' or "
                    + " a.date like '%" + search + "%') "
                    + " order by id desc";
        } else {
            sql = "Select "
                    + "a.id as 'ID' ,"
                    + "a.patient_id as 'Patient ID',"
                    + "p.name as 'Name',"
                    + "p.phone as 'Phone number',"
                    + "a.date as 'Date' "
                    + " from appointments a join patients p on p.id = a.patient_id where is_done =? order by id desc";
        }
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setBoolean(1, true);
            ResultSet rs = pst.executeQuery();
            appointment_histories_table.setModel(DbUtils.resultSetToTableModel(rs));
            TableColumnModel columnModel = appointment_histories_table.getColumnModel();
            for (int i = 0; i < columnModel.getColumnCount(); i++) {
                columnModel.getColumn(i).setCellRenderer(new Components.CenterAlignTableCellRenderer());
            }
            appointment_histories_table.getColumnModel().getColumn(0).setMaxWidth(50);
            appointment_histories_table.getColumnModel().getColumn(1).setMaxWidth(80);
            appointment_histories_table.getTableHeader().setFont(new Font("Sanserif", Font.BOLD, 13));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getMedicalRecords() {
        medical_records_table.removeAll();
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
