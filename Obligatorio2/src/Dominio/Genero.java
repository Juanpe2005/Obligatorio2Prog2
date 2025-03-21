
package Dominio;

import java.io.Serializable;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class Genero implements Comparable <Genero> {
    private String nombre;
    private String descripcion;

    public Genero(String nom, String desc){
        this.descripcion=desc;
        this.nombre=nom;
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean equals(Genero g) {
        return g.nombre.equalsIgnoreCase(this.nombre);
    }

    @Override
    public String toString() {
        return nombre + " (" + descripcion + ')';
    }

    @Override
    public int compareTo(Genero o) {
        return this.getDescripcion().compareTo(o.getDescripcion());
    }    
}
