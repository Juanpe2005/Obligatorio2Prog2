
package Dominio;

import java.io.Serializable;
import java.util.ArrayList;


/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class Venta implements Serializable {
    private String fecha;
    private String cliente;
    private int nroFactura;
    private ArrayList<InfoVenta> listaDeVenta=new ArrayList<InfoVenta>();

    public ArrayList<InfoVenta> getListaDeVenta() {
        return listaDeVenta;
    }

    public void setListaDeVenta(ArrayList<InfoVenta> listaDeVenta) {
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
    

   

   
    
    
