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

public final class Index extends javax.swing.JFrame {

    Connection conn = null;

    public Index() {
        initComponents();
        otherComponent();
        getPatients();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        bottomPanel = new javax.swing.JPanel();
        add_patient_button = new javax.swing.JButton();
        add_appointment_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientBodypanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        appointmentBodypanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

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

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );

        getContentPane().add(leftPanel, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
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

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(add_patient_button, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add_appointment_button, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(731, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_patient_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_appointment_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(bottomPanel, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.BorderLayout());

        tabbedPane.setForeground(new java.awt.Color(51, 51, 51));

        jPanel3.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(993, 100));

        patientBodypanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2, 2));

        jPanel7.setBackground(new java.awt.Color(0, 0, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 5, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.setForeground(new java.awt.Color(0, 0, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(993, 60));

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

        jScrollPane2.setPreferredSize(new java.awt.Dimension(993, 100));

        appointmentBodypanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2, 2));

        jPanel8.setBackground(new java.awt.Color(0, 0, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 5, 0, new java.awt.Color(255, 255, 255)));
        jPanel8.setForeground(new java.awt.Color(0, 0, 51));
        jPanel8.setPreferredSize(new java.awt.Dimension(993, 60));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Emergencies", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Medical records", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Notifications", jPanel2);

        jPanel1.add(tabbedPane, java.awt.BorderLayout.CENTER);

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
    private javax.swing.JButton add_patient_button;
    private javax.swing.JPanel appointmentBodypanel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel patientBodypanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables

    public void getPatients() {
        patientBodypanel.removeAll();
        patientBodypanel.add(new Cards.TableCardPatientHead());
        try (PreparedStatement pst = conn.prepareStatement("Select * from patients order by id desc")) {
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
        appointmentBodypanel.removeAll();
        appointmentBodypanel.add(new Cards.TableCardAppointmentHead());
        try (PreparedStatement pst = conn.prepareStatement(""
                + "Select "
                + "a.id as 'id' ,"
                + "p.name,"
                + "a.patient_id,"
                + "p.phone,"
                + "a.date"
                + " from appointments a join patients p on p.id = a.patient_id order by id desc")) {
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

}
