
package Interfaz;

import Dominio.*;
import java.util.*;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class Inicio {

    
    public static void main(String[] args) {
        // TODO code application logic here
        msjInicio();
        //Sistema sistema=new Sistema();
        //menuPrincipal vent=new menuPrincipal(sistema);
        //vent.setVisible(true);  
    }
    
    public static void msjInicio(){
        Scanner in = new Scanner (System.in);
        System.out.println("Ingrese una opcion");
        System.out.println("1- Utilizar el sistema con uno nuevo");
        System.out.println("2- Utilizar el sistema de la ultima ejecucucion");
        int op;
        try {
            op = Integer.parseInt(in.next());
        } catch (Exception e) {
            op = 99;
        }
        switch (op) {
            case 1:
                //se utiliza un sistema nuevo
                Sistema sistema=new Sistema();
                menuPrincipal vent=new menuPrincipal(sistema);
                vent.setVisible(true);   
            break;
            case 2:
                    
            
            default:
                System.out.println("Opcion Incorrecta");
        }
    }
}
