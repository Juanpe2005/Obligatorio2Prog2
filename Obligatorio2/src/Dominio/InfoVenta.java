/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;

/**
 *
 * @author Usuario
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
