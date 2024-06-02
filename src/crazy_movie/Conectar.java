
package crazy_movie;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
    Connection SQLConexion;

    public Conectar() {
        
        String host = "localhost";
        String puerto = "3307";
        String name = "crazy_movie";
        
        //Acceder URL
        String usuario = "root";
        String pass = "";
        
        //Driver
        String driver = "com.mysql.cj.jdbc.Driver";
        
        //Construir URL
        String databaseURL = "jdbc:mysql://"+host+":"+puerto+"/"+name+"?useSSL=false";
        
        try{
            Class.forName(driver);
            SQLConexion = DriverManager.getConnection(databaseURL,usuario,pass);
            System.out.println("Se conecto a la base de datos!!!");
        }catch(Exception ex){
    }

    
   }
    
   public Connection getConnectionDB(){
       return SQLConexion;
   }
}
