
package Dominio;

import java.util.ArrayList;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class Editorial {
    private String nombre;
    private String pais;
    private ArrayList<Libro> listaLibros = new ArrayList<Libro>();
    
    //constructor de editorial que tiene un pais y nombre
    public Editorial(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    //para comparar con el resto de editoriales con el nombre
    public boolean equals(Editorial e) {
 
        // If the object is compared with itself then return true
        return e.nombre.equals(this.nombre);
    }  
    
}
