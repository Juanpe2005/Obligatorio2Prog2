
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
    
    
    public boolean regEditorial(String nom, String pais){
        Editorial editorial = new Editorial(nom,pais);
        //se registra una editorial en el caso de que ninguna otra tenga el mismo nombre
        boolean existe =false;
        for (int i = 0; i < this.getListaEditoriales().size() && !existe; i++) {
            if(editorial.equals(this.getListaEditoriales().get(i))){
                existe = true;
            }
        }
        if(!existe){
            this.getListaEditoriales().add(editorial);
        }
        //si no existia antes, la agrega
        return !existe;
        
    }
    
    public ArrayList<Autor> getAutoresPorGénero(Genero genBuscado){
        ArrayList<Autor> autoresConGenero = new ArrayList<>();
        Iterator<Autor> iterator = getListaAutores().iterator();
        while (iterator.hasNext()) {
            Autor autor = iterator.next();
            if (autor.getGenerosPorAutor().contains(genBuscado)) {
                autoresConGenero.add(autor);
            }
        }
        return autoresConGenero;
    }
    
    public boolean chequearISBN(String isbn){
        boolean unico = true;
        Iterator<Libro> iterator = getListaLibros().iterator();
        while (iterator.hasNext() && unico) {
            Libro libro = iterator.next();
            if (libro.getIsbn().equals(isbn)) {
                unico = false;
            }
        }
        return unico;
    }
    
    public boolean chequearStock(int stock){
        boolean valido = true;
        if(stock < 0){
            valido = false;
        }
        return valido;
    }
    
    public ArrayList<Libro> ordenarXTitulo(){
        //clonar la lista original para poder ordenarla y que la maquina quede siempre en la pos 0 en la original
        ArrayList<Libro> retorno = new ArrayList<Libro>(this.getListaLibros());
        retorno.sort((Libro l2, Libro l1) -> {
            int dif = l1.getTitulo().compareTo(l2.getTitulo());
            return dif;
        });
        return retorno;
    }
    
    
}
