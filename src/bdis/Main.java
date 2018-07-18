package bdis;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;

public class Main {
    Connection conn=null;
    public static Connection dbConnector(){

        try {
          Class.forName("org.sqlite.JDBC");
           Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Dark\\Desktop\\Railway Reservation System\\BloodDonarDatabase\\JavaProject2\\Blood_Donor.sqlite");
          return conn;

        } catch ( Exception e ) {
             JOptionPane.showMessageDialog(null,e);

          System.exit(0);
        }
        return null;
    }

}



