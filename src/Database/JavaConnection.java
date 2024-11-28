
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JavaConnection {
    public static Connection getConnection(){
        
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
//            System.out.println("Connected");
            createDatabase(conn);
            useDatabase(conn);
            Database.Tables.patients(conn);
            Database.Tables.appointments(conn);
            Database.Tables.medicalRecords(conn);
//            Seeder.insertPatients(conn);
          
           return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
        
    }
    
    public static void createDatabase(Connection conn){
        try (PreparedStatement pst = conn.prepareStatement("Create database if not exists doctordb")) {
            pst.execute();
//            System.out.println("Database doctor cretaed");
            pst.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void useDatabase(Connection conn){
        try (PreparedStatement pst = conn.prepareStatement("use doctordb")) {
            pst.execute();
//            System.out.println("using doctordb ");
            pst.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
