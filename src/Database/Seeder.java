
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class Seeder {
      public static void insertPatients(Connection conn) {
        try (PreparedStatement pst = conn.prepareStatement(""
                + "INSERT INTO patients (name, birthdate, phone, address, guardian) "
                + "VALUES (?, ?, ?, ?, ?)")) {

            // Insert 5 sample rows
            String[][] data = {
                {"John Doe", "1990,05,15", "1234567890", "123 Elm St, Springfield", "Jane Doe"},
                {"Alice Smith", "1985,03,22", "9876543210", "456 Oak St, Shelbyville", "Bob Smith"},
                {"Robert Brown", "2000,11,30", "1122334455", "789 Pine St, Ogdenville", "Mary Brown"},
                {"Emily Davis", "1995,07,10", "6677889900", "321 Maple St, Capital City", "Henry Davis"},
                {"Michael Johnson", "1988,01,25", "4455667788", "654 Birch St, North Haverbrook", "Sarah Johnson"}
            };

            for (String[] patient : data) {
                pst.setString(1, patient[0]); // Name
                pst.setString(2, patient[1]); // Birthdate
                pst.setString(3, patient[2]); // Phone
                pst.setString(4, patient[3]); // Address
                pst.setString(5, patient[4]); // Guardian

                pst.executeUpdate();
            }

            System.out.println("5 sample rows have been inserted into the patients table.");
        } catch (Exception e) {
            System.out.println("Error inserting data: " + e.getMessage());
        }
    }
}
