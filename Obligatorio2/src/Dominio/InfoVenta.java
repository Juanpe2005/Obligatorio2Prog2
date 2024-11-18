
package Dominio;

import java.io.Serializable;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class InfoVenta implements Serializable {
    private Libro libro;
    private int cantidad;
    
    public InfoVenta( Libro l, int c){
        this.libro = l;
        this.cantidad = c;
    }
    
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void incrementar(){ 
        this.setCantidad(this.getCantidad()+1); 
    } 
    
    public void decrementar(){ 
        this.setCantidad(this.getCantidad()-1); 
    }   
    
    
    @Override
    public String toString(){
        return cantidad+" - "+libro.getTitulo()+ " - $"+libro.getPrecioVenta();
    }
}
