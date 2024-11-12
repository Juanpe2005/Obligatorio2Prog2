package Interfaz;

import Dominio.*;
import java.io.File;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

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

   /* public static void msjInicio() throws IOException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
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
                Sistema sistema = new Sistema();
                menuPrincipal vent = new menuPrincipal(sistema);
                vent.setVisible(true);
                break;
            case 2:
                //se utiliza el sistema de la ultima ejecucion
                File file = new File("datos.ser");
                if (file.exists()) {
                    FileInputStream ff = new FileInputStream(file);
                    ObjectInputStream gg = new ObjectInputStream(ff);
                    Sistema sis = (Sistema) gg.readObject();
                    menuPrincipal ventana = new menuPrincipal(sis);
                    ventana.setVisible(true);
                    in.close();
                } else {
                    System.out.println("No hay guardado");
                }
                break;

            default:
                System.out.println("Opcion Incorrecta");

        }
    }
    */
}
