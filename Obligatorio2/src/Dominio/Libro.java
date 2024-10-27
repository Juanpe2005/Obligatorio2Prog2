
package Dominio;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class Libro {
    private String titulo;
    private Editorial editorial;
    private String isbn;
    private Autor autor;
    private Genero genero;
    private int stock;
    private int precioCosto;
    private int precioVenta;
    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(int precioCosto) {
        this.precioCosto = precioCosto;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    public int chequearStock(int cantSolicitada) {
        int cantDisponible = cantSolicitada;
        if (cantSolicitada <= stock) {
            stock -= cantSolicitada; //se resta lo solicitado al stock
        } else {
            cantDisponible = stock;
            stock = 0; // Se vende solo lo disponible, solo se puede vender la cantidad en stock
        }
        return cantDisponible;
        //Devuelve la cantidad que se puede vender, en caso de que dé el stock se devuelve el mismo numero que el solicitado y sino lo que queda de stock 
    }
}
