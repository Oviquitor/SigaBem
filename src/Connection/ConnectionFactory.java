/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Usuario
 */
public class ConnectionFactory {
    
    public Connection conexao(){
        
        String host = "localhost";
        String banco = "siga_bem_db";
        String porta = "3306";
        String user = "siga_bem_user";
        String senha = "nE5kMc7JCGNqwDQM";
        
        try {
            
            String url = "jdbc:mysql://" + host + ":" + porta + "/" + banco;
            return DriverManager.getConnection(url, user, senha);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        } 
    }
}
