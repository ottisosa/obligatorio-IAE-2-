package clases;
import java.sql.ResultSet;
import conexion.conexionSQL;
import java.sql.PreparedStatement;

public class loginConAdm {
    
     public boolean loginADM(String usuario, String contra, int admin) {
    int i = 0;
    admin = 1;
    conexionSQL cx =new conexionSQL();
    cx.conec();
 String consul = "SELECT * FROM usuario where usuario= '"+usuario+"' and contra= '"+contra+"' and admin= '"+admin+"'";
      
 try {
     
    PreparedStatement st = null;
    st= cx.conn.prepareStatement(consul);
    
     System.out.println(consul);
     
    ResultSet rs = st.executeQuery();
    while (rs.next()){
    i++;
    }
       
 if(i>0){
 return true;
 }
 else {
 return false;
 } 
 }catch(Exception e){}
    return true;

    }
}

