package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;        

public class conexionSQL {
 String url = "jdbc:mysql://localhost:3306/?serverTimezone=UTC";
public String driver = "com.mysql.cj.jdbc.Driver";
public String database = "obligatorio";
public String username = "root";
public String password = "";


public Connection conn = null;
Statement st =null;

public Connection conec(){
    
try{
Class.forName(driver);
conn = DriverManager.getConnection(url,username,password);
conn.setCatalog(database);
System.out.print("conexion exitosa");
}catch(ClassNotFoundException | SQLException e){
e.printStackTrace();
System.out.print("error de conexion");
}
        return conn;
}



}


