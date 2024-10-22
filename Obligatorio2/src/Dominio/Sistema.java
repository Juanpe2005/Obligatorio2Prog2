
package Dominio;
import java.util.*;
/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class Sistema {
    private ArrayList<Editorial> listaEditoriales = new ArrayList<Editorial>();
    private ArrayList<Libro> listaLibros = new ArrayList<Libro>();
    private ArrayList<Autor> listaAutores = new ArrayList<Autor>();
    private ArrayList<Venta> listaVentas = new ArrayList<Venta>();
    private ArrayList<Genero> listaGeneros = new ArrayList<Genero>();

    public ArrayList<Editorial> getListaEditoriales() {
        return listaEditoriales;
    }

    public void setListaEditoriales(ArrayList<Editorial> listaEditoriales) {
        this.listaEditoriales = listaEditoriales;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Autor> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(ArrayList<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }

    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public ArrayList<Genero> getListaGeneros() {
        return listaGeneros;
    }

    public void setListaGeneros(ArrayList<Genero> listaGeneros) {
        this.listaGeneros = listaGeneros;
    }
    
    
}
