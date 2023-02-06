
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
  
    
      public Connection conectaBD(){
        
        Connection conn = null;
        
        try {
            String sql = "jdbc:mysql://localhost:3306/lanchonete?user=root&password=";
            conn = DriverManager.getConnection(sql);

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "CONEXAOBD"+error);
        }
        return conn;
    }
    
    
    
}
   

