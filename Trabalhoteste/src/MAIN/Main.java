
package MAIN;

import DAO.ConexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        
        Connection conn;
        PreparedStatement pstm;
        ResultSet res;
        
        String sql = "SELECT d.id_doc, d.d_data, c.nome_categoria, d.dname, d.descricao, d.dstatus from documents d inner join categorias c on d.id_categoria = c.id_categoria;";
         
        conn = new ConexaoDAO().conectaBD();
        
        
        try {
            pstm = conn.prepareStatement(sql);
            res = pstm.executeQuery();
            
            while (res.next()) {
                System.out.println("ID: " + res.getInt("id_doc"));
                System.out.println("Data: " + res.getString("d_data"));
                System.out.println("Categoria: " + res.getString("nome_categoria"));
                System.out.println("Nome: " + res.getString("dname"));
                System.out.println("Descrição: " + res.getString("descricao"));
                System.out.println("Status: "+ res.getString("dstatus"));
                System.out.println("--------------------");
                
                
            }
            
            
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Listar"+error);
        }  
        
    }


    }
    


