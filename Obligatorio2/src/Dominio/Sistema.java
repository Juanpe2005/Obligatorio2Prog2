package Dominio;

import java.io.Serializable;
import java.util.*;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class Sistema extends Observable implements Serializable {

    private ArrayList<Editorial> listaEditoriales = new ArrayList<Editorial>();
    private ArrayList<Libro> listaLibros = new ArrayList<Libro>();
    private ArrayList<Autor> listaAutores = new ArrayList<Autor>();
    private ArrayList<Venta> listaVentas = new ArrayList<Venta>();
    private ArrayList<Genero> listaGeneros = new ArrayList<Genero>();
    private int factura = 1;

    public Sistema() {
        //====================================================================
        //====================================================================
        // datos preCargados para prueba
        //====================================================================
        //====================================================================
        listaGeneros.add(new Genero("Ciencia", "dec ciencia"));
        listaGeneros.add(new Genero("Fisica", "dec fisica"));
        listaGeneros.add(new Genero("Mat", "dec Math"));
        listaGeneros.add(new Genero("Ficcion", "dec ficcion"));

        Autor autor1 = new Autor("Juan", "Uruguay");
        ArrayList<Genero> listaGenerosAutor = new ArrayList<Genero>();
        listaGenerosAutor.add(listaGeneros.get(1));
        listaGenerosAutor.add(listaGeneros.get(2));
        autor1.setGenerosPorAutor(listaGenerosAutor);
        listaAutores.add(autor1);

        listaEditoriales.add(new Editorial("Santillana", "uru"));

        Editorial ed = new Editorial("Com", "Bra");
        Autor au = new Autor("Lewis", "Chi");
        Genero ge = new Genero("lalala", "fantasia");
        listaLibros.add(new Libro("alicia", ed, "ALI", au, ge, 20, 20, 20, false));

        //====================================================================
        //====================================================================
        //====================================================================
        //====================================================================
    }

    public int getFactura() {
        return factura;
    }

    //la factura siempre se modificará de a uno
    public void setFactura() {
        this.factura = this.getFactura() + 1;
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
    public boolean chequearNombre(ArrayList list, Object obj) {
        boolean existe = false;
        for (int i = 0; i < list.size() && !existe; i++) {
            if (obj.equals(list.get(i))) {
                existe = true;
            }
        }
        return existe;
    }

    //se registra editorial, autor y genero para ver si se repite algun nombre
    public boolean regEditorial(String nom, String pais) {
        Editorial editorial = new Editorial(nom, pais);

        boolean existe = chequearNombre(this.getListaEditoriales(), editorial);

        if (!existe) {
            this.getListaEditoriales().add(editorial);
            setChanged();
            notifyObservers();
        }
        //si no existia antes, la agrega
        return !existe;

    }

    public void regLibro(Libro lib) {
        this.getListaLibros().add(lib);
        setChanged();
        notifyObservers();

    }

    public boolean regGenero(String nom, String desc) {
        Genero genero = new Genero(nom, desc);
        boolean existe = chequearNombre(this.getListaGeneros(), genero);

        if (!existe) {
            this.getListaGeneros().add(genero);
            setChanged();
            notifyObservers();
        }
        //si no existia antes, la agrega
        return !existe;
    }

    public boolean regAutor(String nom, String pais, ArrayList<Genero> generosPorAutor) {
        Autor autor = new Autor(nom, pais);
        autor.setGenerosPorAutor(generosPorAutor);
        boolean existe = chequearNombre(this.getListaAutores(), autor);;

        if (!existe) {
            this.getListaAutores().add(autor);
            setChanged();
            notifyObservers();
        }
        //si no existia antes, la agrega
        return !existe;
    }

    public void regVenta(String fecha, String cliente, int nroFactura, ArrayList<InfoVenta> contenido) {
        Venta venta = new Venta(fecha, cliente, nroFactura, contenido);
        this.getListaVentas().add(venta);
        setChanged();
        notifyObservers();
    }

    //codigo que verifica si hay algun libro con ese numero de factura
    public boolean existeVenta(int nro) {
        boolean esta = false;
        for (int i = 0; i < this.getListaVentas().size() && !esta; i++) {
            if (this.getListaVentas().get(i).getNroFactura() == nro) {
                esta = true;
            }
        }
        return esta;
    }

    public Venta ubicarVenta(int nro) {
        Venta buscado = new Venta();
        boolean esta = false;
        for (int i = 0; i < this.getListaVentas().size() && !esta; i++) {
            if (this.getListaVentas().get(i).getNroFactura() == nro) {
                buscado = this.getListaVentas().get(i);
                esta = true;
            }
        }
        return buscado;
    }

    public void anularVenta(ArrayList<InfoVenta> lista, int fact) {
        for (int i = 0; i < lista.size(); i++) {
            int nro = lista.get(i).getCantidad();
            lista.get(i).getLibro().agregarStock(nro);
        }

        boolean encontro = false;
        for (int i = 0; i < this.getListaVentas().size() && !encontro; i++) {
            if (this.getListaVentas().get(i).getNroFactura() == fact) {
                encontro = true;
                this.getListaVentas().remove(i);
            }
        }
    }

    public ArrayList<Autor> getAutoresPorGénero(Genero genBuscado) {
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

    public boolean chequearISBN(String isbn) {
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

    public boolean chequearNum(int num) {
        boolean valido = true;
        if (num < 0) {
            valido = false;
        }
        return valido;
    }

    public ArrayList<Libro> ordenarXTitulo() {
        //clonar la lista original para poder ordenarla y que la maquina quede siempre en la pos 0 en la original
        ArrayList<Libro> retorno = new ArrayList<Libro>(this.getListaLibros());
        retorno.sort((Libro l1, Libro l2) -> {
            int dif = l1.getTitulo().compareTo(l2.getTitulo());
            return dif;
        });
        return retorno;
    }
    
    public ArrayList<Venta> ordenarXFactura(ArrayList<Venta> retorno) {
        retorno.sort((Venta v1, Venta v2) -> {
            int dif = v1.getNroFactura()- v2.getNroFactura();
            return dif;
        });
        return retorno;
    }
    
    public ArrayList<Venta> ventasDeUnLibro(Libro l){
        ArrayList<Venta> retorno = new ArrayList<Venta>();
        for(int i = 0; i < this.getListaVentas().size(); i++){
            Venta v = this.getListaVentas().get(i);
            for(int j = 0; j < v.getListaDeVenta().size(); j++){
                if(v.getListaDeVenta().get(j).getLibro().equals(l)){
                    retorno.add(v);
                } 
            }
        }
        return ordenarXFactura(retorno);
    }
    

    public ArrayList<Libro> chequiarLibro(String tit, String aut, String gen) {
        ArrayList<Libro> list = new ArrayList<>();
        for (int i = 0; i < this.getListaLibros().size(); i++) {
            if (this.getListaLibros().get(i).getTitulo().contains(tit.toLowerCase()) &&
                    this.getListaLibros().get(i).getGenero().getDescripcion().contains(gen.toLowerCase()) &&
                    this.getListaLibros().get(i).getAutor().getNombre().contains(aut.toLowerCase())) {
                list.add(this.getListaLibros().get(i));
            } 
        }
        return list;
    }
    
    //se toma el libro para poder usar sus datos en la imagen
    public Libro tomarLibro(String isbn) {
        Libro l=null;
        boolean encontro=false;
        for (int i = 0; i < this.getListaLibros().size() && !encontro; i++) {
            if (this.getListaLibros().get(i).getIsbn().equals(isbn)) {
                l=(this.getListaLibros().get(i));
                encontro=true;
            }
        }
        return l;
    }

}
