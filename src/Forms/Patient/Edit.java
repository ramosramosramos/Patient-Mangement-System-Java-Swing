package Forms.Patient;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

public class Edit extends javax.swing.JFrame {

    Main.Index index;
    Connection conn = null;
    String id, name, phone, address, guardian, birthdate;
    String[] date;

    public Edit(String id, String name, String phone, String address, String guardian, String birthdate, Main.Index index) {
        initComponents();
        this.index = index;
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.guardian = guardian;
        this.birthdate = birthdate;
        date = Tools.StringTools.splitter(birthdate, ",");

        name_field.setText(name);
        phone_field.setText(phone);
        address_field.setText(address);
        guardian_field.setText(guardian);

        yearChooser.setYear(Integer.valueOf(date[0]));
        montChooser.setMonth(Integer.valueOf(date[1]));
        dayChooser.setDay(Integer.valueOf(date[2]));
        conn = Database.JavaConnection.getConnection();
        Notifications.getInstance().setJFrame(this);
//        dateChooser.setDate(new java.util.Date());
        index.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        name_label = new javax.swing.JLabel();
        guardian_field = new javax.swing.JTextField();
        name_field = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_field = new javax.swing.JTextArea();
        yearChooser = new com.toedter.calendar.JYearChooser();
        dayChooser = new com.toedter.calendar.JDayChooser();
        montChooser = new com.toedter.calendar.JMonthChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phone_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 100, 30));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("DELETE");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 190, 40));

        name_label.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        name_label.setForeground(new java.awt.Color(204, 204, 204));
        name_label.setText("Edit");
        name_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        guardian_field.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        guardian_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardian_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(guardian_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 420, 40));

        name_field.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 370, 40));

        address_field.setColumns(20);
        address_field.setRows(5);
        jScrollPane1.setViewportView(address_field);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 370, 90));

        yearChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                yearChooserPropertyChange(evt);
            }
        });
        jPanel1.add(yearChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 90, 30));
        jPanel1.add(dayChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

        montChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                montChooserPropertyChange(evt);
            }
        });
        jPanel1.add(montChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 100, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Birthdate");
        jLabel2.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Name");
        jLabel3.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Address");
        jLabel4.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Guardian");
        jLabel5.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, 30));

        phone_field.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        phone_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_fieldActionPerformed(evt);
            }
        });
        phone_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phone_fieldKeyTyped(evt);
            }
        });
        jPanel1.add(phone_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 370, 40));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Phone number");
        jLabel6.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 30));

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 51));
        jButton3.setText("UPDATE");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 190, 40));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(936, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        index.setEnabled(true);
        index.offGlass();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void montChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_montChooserPropertyChange
        dayChooser.setMonth(montChooser.getMonth());
    }//GEN-LAST:event_montChooserPropertyChange

    private void yearChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yearChooserPropertyChange
        montChooser.setYearChooser(yearChooser);
    }//GEN-LAST:event_yearChooserPropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int ask = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove this patient?");
        if (ask == JOptionPane.YES_OPTION) {
            try (PreparedStatement pst = conn.prepareStatement("Delete  from patients where id = ?")) {
                pst.setString(1, id);
                pst.execute();
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Succcessfull deleted!");
                index.setEnabled(true);
                index.offGlass();
                index.getPatients();
                dispose();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fieldActionPerformed
        handleCreate();        // TODO add your handling code here:
    }//GEN-LAST:event_name_fieldActionPerformed

    private void phone_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_fieldActionPerformed
        handleCreate();        // TODO add your handling code here:
    }//GEN-LAST:event_phone_fieldActionPerformed

    private void guardian_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardian_fieldActionPerformed
        handleCreate();
    }//GEN-LAST:event_guardian_fieldActionPerformed

    private void phone_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone_fieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();

        }
    }//GEN-LAST:event_phone_fieldKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        handleCreate();

    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Edit(null, null, null, null, null, null, new Main.Index()).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address_field;
    private com.toedter.calendar.JDayChooser dayChooser;
    private javax.swing.JTextField guardian_field;
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
    private com.toedter.calendar.JMonthChooser montChooser;
    private javax.swing.JTextField name_field;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField phone_field;
    private com.toedter.calendar.JYearChooser yearChooser;
    // End of variables declaration//GEN-END:variables

    public void handleCreate() {
        String newName = name_field.getText().trim();
        String newPhone = phone_field.getText().trim();
        String newAddress = address_field.getText().trim();
        String newGuardian = guardian_field.getText().trim();
        String day = String.valueOf(dayChooser.getDay());
        String month = String.valueOf(montChooser.getMonth());
        String year = String.valueOf(yearChooser.getYear());
        String newBirthdate = year + "," + month + "," + day;

        if (newName.isEmpty()) {
            message("Name field is needed!");
            return;
        }
        if (newPhone.isEmpty()) {
            message("Phone number field is needed!");
            return;
        }
        if (newAddress.isEmpty()) {
            message("Address field is needed!");
            return;
        }

        try (PreparedStatement pst = conn.prepareStatement("update patients"
                + " set name =?,"
                + "phone =?,"
                + "address =?,"
                + "birthdate =?,"
                + "guardian=? "
                + " where id = ?")) {
            pst.setString(1, newName);
            pst.setString(2, newPhone);
            pst.setString(3, newAddress);
            pst.setString(4, newBirthdate);
            pst.setString(5, newGuardian);
            pst.setString(6, id);
            pst.executeUpdate();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully saved!");
            index.setEnabled(true);
            index.offGlass();
            index.getPatients();
            dispose();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void message(String message) {
        Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, message);
    }
}
