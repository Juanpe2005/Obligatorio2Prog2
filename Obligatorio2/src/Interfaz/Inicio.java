
package Interfaz;

import Dominio.*;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class Inicio {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Sistema sistema=new Sistema();
        menuPrincipal vent=new menuPrincipal(sistema);
        vent.setVisible(true);
    }
    
}
