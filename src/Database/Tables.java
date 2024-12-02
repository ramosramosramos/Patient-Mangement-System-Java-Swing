package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Tables {

    public static void patients(Connection conn) {
        try (PreparedStatement pst = conn.prepareStatement(""
                + "Create table if not exists patients ("
                + "id int primary key auto_increment,"
                + "name varchar(255),"
                + "birthdate varchar(255),"
                + "phone varchar(255),"
                + "address text,"
                + "guardian varchar(255),"
                + "gender varchar(255),"
                + "status varchar(255)"
                + ")"
                + "")) {

            pst.execute();

            System.out.println("Patients tabel has been created");
            pst.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
      
    public static void appointments(Connection conn) {
        try (PreparedStatement pst = conn.prepareStatement(""
                + "Create table if not exists appointments ("
                + "id int primary key auto_increment,"
                + "patient_id int,"
                + "date varchar(100),"
                + "is_done boolean default false,"
                + "foreign key (patient_id) references patients(id) on delete cascade"
                + ")"
                + "")) {

            pst.execute();

//            System.out.println("appointments tabel has been created");
            pst.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
      public static void medicalRecords(Connection conn) {
    try (PreparedStatement pst = conn.prepareStatement(""
            + "CREATE TABLE IF NOT EXISTS medical_records ("
            + "id INT PRIMARY KEY AUTO_INCREMENT, "
            + "patient_id INT, "
            + "description TEXT, "
            + "diagnosis TEXT, "
            + "prescription TEXT, "
            + "treatment_plan TEXT, "
            + "created_at varchar(255),"
            + "FOREIGN KEY (patient_id) REFERENCES patients(id) ON DELETE CASCADE"
            + ")")) {

        pst.execute();
//        System.out.println("medical_records table has been created.");
        
    } catch (Exception e) {
        System.out.println("Error creating medical_records table: " + e.getMessage());
    }
}

}
