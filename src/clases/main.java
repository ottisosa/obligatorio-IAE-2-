package clases;

import com.formdev.flatlaf.FlatDarkLaf;
import interfaz.login;

public class main {

    public static void main(String[] args) {
   FlatDarkLaf.setup();
   login ll = new login();
  ll.setVisible(true);

    }
    
}
