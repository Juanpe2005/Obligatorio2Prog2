
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
    private ArrayList<InfoVenta> listaDeVenta;

    public Venta(String fecha, String cliente, int nroFactura, ArrayList<InfoVenta> contenido){
        this.fecha = fecha;
        this.cliente = cliente;
        this.listaDeVenta = contenido;
        this.nroFactura = nroFactura;
    }

    public Venta(){
        this.fecha = "";
        this.cliente = "";
        this.listaDeVenta = new ArrayList<InfoVenta>();
        this.nroFactura = 0;
    }
    
    
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
    

   

   
    
    
