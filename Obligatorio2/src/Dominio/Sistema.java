
package Dominio;
import java.util.*;
/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class Sistema extends Observable {
    private ArrayList<Editorial> listaEditoriales = new ArrayList<Editorial>();
    private ArrayList<Libro> listaLibros = new ArrayList<Libro>();
    private ArrayList<Autor> listaAutores = new ArrayList<Autor>();
    private ArrayList<Venta> listaVentas = new ArrayList<Venta>();
    private ArrayList<Genero> listaGeneros = new ArrayList<Genero>();

    public Sistema() {
        //====================================================================
        //====================================================================
        // datos preCargados para prueba
        //====================================================================
        //====================================================================
        listaGeneros.add(new Genero("Ciencia","dec ciencia"));
        listaGeneros.add(new Genero("Fisica","dec fisica"));
        listaGeneros.add(new Genero("Mat","dec Math"));
        listaGeneros.add(new Genero("Ficcion","dec ficcion"));
           
        Autor autor1 = new Autor("Juan", "Uruguay");
        ArrayList<Genero> listaGenerosAutor = new ArrayList<Genero>();
        listaGenerosAutor.add(listaGeneros.get(1));
        listaGenerosAutor.add(listaGeneros.get(2));
        autor1.setGenerosPorAutor(listaGenerosAutor);
        listaAutores.add(autor1);
        
        listaEditoriales.add(new Editorial("Santillana","uru"));
        
        //====================================================================
        //====================================================================
        //====================================================================
        //====================================================================
 
    }

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
    
    //se utiliza este metodo para no tener que repetir el codigo de chequear el nombre en todos los registros
   public boolean chequearNombre(ArrayList list, Object obj){
        boolean existe=false;
        for (int i = 0; i < list.size() && !existe; i++) {
            if(obj.equals(list.get(i))){
                existe = true;
            }
        }
        return existe;
    }

   //se registra editorial, autor y genero para ver si se repite algun nombre
    public boolean regEditorial(String nom, String pais){
        Editorial editorial = new Editorial(nom,pais);
        
        boolean existe = chequearNombre(this.getListaEditoriales(), editorial);
        
        if(!existe){
            this.getListaEditoriales().add(editorial);
            setChanged();
            notifyObservers();
        }
        //si no existia antes, la agrega
        return !existe;
        
    }
     public void regLibro(Libro lib){
        this.getListaLibros().add(lib);
        setChanged();
        notifyObservers();
      
    }

    public boolean regGenero(String nom, String desc){
        Genero genero= new Genero(nom, desc);
        boolean existe =chequearNombre(this.getListaGeneros(), genero);;
        
        if(!existe){
            this.getListaGeneros().add(genero);
            setChanged();
            notifyObservers();
        }
        //si no existia antes, la agrega
        return !existe;
    }
    
    public boolean regAutor(String nom, String pais, ArrayList<Genero> generosPorAutor){
        Autor autor =new Autor(nom, pais);
        autor.setGenerosPorAutor(generosPorAutor);
        boolean existe =chequearNombre(this.getListaAutores(), autor);;
        
        if(!existe){
            this.getListaAutores().add(autor);
            setChanged();
            notifyObservers();
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
    
    public boolean chequearNum(int num){
        boolean valido = true;
        if(num < 0){
            valido = false;
        }
        return valido;
    }
    
    public ArrayList<Libro> ordenarXTitulo(){
        //clonar la lista original para poder ordenarla y que la maquina quede siempre en la pos 0 en la original
        ArrayList<Libro> retorno = new ArrayList<Libro> (this.getListaLibros());
        retorno.sort((Libro l1, Libro l2) -> {
            int dif = l1.getTitulo().compareTo(l2.getTitulo());
            return dif;
        });
        return retorno;
    }
    
    

}
