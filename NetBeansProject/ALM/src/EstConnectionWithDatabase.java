import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

public class EstConnectionWithDatabase {
    Connection conn_ection = null;
   
        public static Connection ConnectDB(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn_ection = DriverManager.getConnection("jdbc:mysql://localhost:3306/alm_database","root","Sanjana23@");
           return conn_ection;
        }
        catch(ClassNotFoundException | SQLException exp){
            JOptionPane.showMessageDialog(null, exp);
            return null;
        }      
    }
}
