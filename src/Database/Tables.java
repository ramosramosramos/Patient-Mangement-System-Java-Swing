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
                + "guardian varchar(255)"
                + ")"
                + "")) {

            pst.execute();

//            System.out.println("Patients tabel has been created");
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
                + "foreign key (patient_id) references patients(id)"
                + ")"
                + "")) {

            pst.execute();

//            System.out.println("appointments tabel has been created");
            pst.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
      
}
