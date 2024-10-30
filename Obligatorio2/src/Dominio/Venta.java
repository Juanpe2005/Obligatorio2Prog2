
package Dominio;

import java.util.ArrayList;
import java.util.HashMap;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class Venta {
    private String fecha;
    private String cliente;
    private int nroFactura;
    private HashMap<Libro, Integer> listaDeVenta=new HashMap<Libro, Integer>();

    public HashMap<Libro, Integer> getListaDeVenta() {
        return listaDeVenta;
    }

    public void setListaDeVenta(HashMap<Libro, Integer> listaDeVenta) {
        this.listaDeVenta = listaDeVenta;
    }
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }
}
    

   

   
    
    
