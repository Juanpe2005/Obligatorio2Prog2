package Interfaz;

import Dominio.*;
import java.io.IOException;


/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class Inicio {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        //msjInicio();
        Sistema sistema=new Sistema();
        ventInicio vent=new ventInicio(sistema);
        vent.setVisible(true); 
        
    }
}
