package Forms.Appointment;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

public final class Edit extends javax.swing.JFrame {

    Main.Index index;
    Connection conn = null;
    String[] data;
    String id ;
    public Edit(String id, String patient_id, String name, String date, Main.Index index) {
        initComponents();
        this.index = index;
        this.id =id;
        conn = Database.JavaConnection.getConnection();
        Notifications.getInstance().setJFrame(this);
        index.setEnabled(false);
        getPatients();
        comboBox.setSelectedItem(patient_id + ". " + name);

        data = Tools.StringTools.splitter(date, ",");
        yearChooser.setYear(Integer.valueOf(data[0]));
        montChooser.setMonth(Integer.valueOf(data[1]));
        dayChooser.setDay(Integer.valueOf(data[2]));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        name_label = new javax.swing.JLabel();
        yearChooser = new com.toedter.calendar.JYearChooser();
        dayChooser = new com.toedter.calendar.JDayChooser();
        montChooser = new com.toedter.calendar.JMonthChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox();
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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 100, 30));

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 51));
        jButton2.setText("Save");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 100, 30));

        name_label.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        name_label.setForeground(new java.awt.Color(204, 204, 204));
        name_label.setText("Edit appointment");
        name_label.setPreferredSize(new java.awt.Dimension(190, 50));
        jPanel1.add(name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        yearChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                yearChooserPropertyChange(evt);
            }
        });
        jPanel1.add(yearChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 90, 30));
        jPanel1.add(dayChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 190, -1));

        montChooser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        montChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                montChooserPropertyChange(evt);
            }
        });
        jPanel1.add(montChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 110, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Date");
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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 110, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(518, 479));
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
        handleCreate();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int ask = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove this appointment?");
        if (ask == JOptionPane.YES_OPTION) {
            try (PreparedStatement pst = conn.prepareStatement("Delete  from appointments where id = ?")) {
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
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Edit("", "", "","",new Main.Index()).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboBox;
    private com.toedter.calendar.JDayChooser dayChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JMonthChooser montChooser;
    private javax.swing.JLabel name_label;
    private com.toedter.calendar.JYearChooser yearChooser;
    // End of variables declaration//GEN-END:variables

    public void handleCreate() {
        String[] data = Tools.StringTools.splitter(comboBox.getSelectedItem().toString(), ". ");

        String day = String.valueOf(dayChooser.getDay());
        String month = String.valueOf(montChooser.getMonth());
        String year = String.valueOf(yearChooser.getYear());
        String date = year + "," + month + "," + day;

        if (comboBox.getSelectedItem().toString().trim().equals("Select patient")) {
            message("Patient field is needed!");
            return;
        }

        try (PreparedStatement pst = conn.prepareStatement("update appointments set patient_id=?,date =?"
                + " where id = ?")) {
            pst.setString(1, data[0]);
            pst.setString(2, date);
            pst.setString(3, id);

            pst.executeUpdate();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully updated");
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
