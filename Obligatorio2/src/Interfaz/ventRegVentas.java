
package Interfaz;

import Dominio.InfoVenta;
import Dominio.Libro;
import Dominio.Sistema;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class ventRegVentas extends javax.swing.JFrame implements Observer {

    Sistema sistema;
    ArrayList<InfoVenta> librosEnVenta;
    int precio = 0;

    /**
     * Creates new form ventRegVentas
     */
    public ventRegVentas(Sistema sis) {
        initComponents();
        sistema = sis;
        librosEnVenta = new ArrayList<>();
        cargarListaLibros();
        lblNumFac.setText(sistema.getFactura()+"");
        sis.addObserver(this);

    }

    public void update(Observable o, Object ob) {
        cargarListaLibros();

        sistema.addObserver(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFacturaRegVenta = new javax.swing.JLabel();
        lblFechaRegVenta = new javax.swing.JLabel();
        txtFechaVenta = new javax.swing.JTextField();
        lblClienteRegVenta = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        lblLibroRegVenta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listLibros = new javax.swing.JList();
        btnEliminarLbr = new javax.swing.JButton();
        btnAgregarlbr1 = new javax.swing.JButton();
        lblVentaRegVenta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listVentas = new javax.swing.JList();
        lblTotalVenta = new javax.swing.JLabel();
        btnCancVenta = new javax.swing.JButton();
        btnRegVenta = new javax.swing.JButton();
        lblRegVenta = new javax.swing.JLabel();
        lblNumFac = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venta de Libros");
        setMinimumSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        lblFacturaRegVenta.setText("Factura : ");
        getContentPane().add(lblFacturaRegVenta);
        lblFacturaRegVenta.setBounds(20, 20, 60, 16);

        lblFechaRegVenta.setText("Fecha");
        getContentPane().add(lblFechaRegVenta);
        lblFechaRegVenta.setBounds(20, 50, 60, 16);

        txtFechaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaVentaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFechaVenta);
        txtFechaVenta.setBounds(90, 50, 150, 22);

        lblClienteRegVenta.setText("Cliente");
        getContentPane().add(lblClienteRegVenta);
        lblClienteRegVenta.setBounds(267, 50, 60, 16);

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreCliente);
        txtNombreCliente.setBounds(340, 50, 220, 22);

        lblLibroRegVenta.setText("Libros");
        getContentPane().add(lblLibroRegVenta);
        lblLibroRegVenta.setBounds(20, 100, 50, 16);

        jScrollPane1.setViewportView(listLibros);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 220, 120);

        btnEliminarLbr.setText("<-");
        btnEliminarLbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLbrActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarLbr);
        btnEliminarLbr.setBounds(260, 190, 50, 40);

        btnAgregarlbr1.setText("->");
        btnAgregarlbr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarlbr1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarlbr1);
        btnAgregarlbr1.setBounds(260, 140, 50, 40);

        lblVentaRegVenta.setText("Venta");
        getContentPane().add(lblVentaRegVenta);
        lblVentaRegVenta.setBounds(340, 100, 140, 16);

        jScrollPane2.setViewportView(listVentas);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(340, 120, 220, 120);

        lblTotalVenta.setText("Total: $");
        getContentPane().add(lblTotalVenta);
        lblTotalVenta.setBounds(330, 260, 70, 16);

        btnCancVenta.setText("Cancelar");
        btnCancVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancVenta);
        btnCancVenta.setBounds(390, 300, 100, 23);

        btnRegVenta.setText("Registrar");
        btnRegVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegVenta);
        btnRegVenta.setBounds(130, 300, 100, 23);

        lblRegVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRegVenta.setForeground(new java.awt.Color(0, 171, 0));
        lblRegVenta.setText("Registro de Ventas");
        getContentPane().add(lblRegVenta);
        lblRegVenta.setBounds(210, 0, 210, 25);
        getContentPane().add(lblNumFac);
        lblNumFac.setBounds(80, 20, 90, 20);

        lblCosto.setText("0");
        getContentPane().add(lblCosto);
        lblCosto.setBounds(410, 260, 160, 16);

        setSize(new java.awt.Dimension(602, 360));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaVentaActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void btnEliminarLbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLbrActionPerformed
        if (listVentas.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un libro", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            InfoVenta borrar = (InfoVenta) listVentas.getSelectedValue();
            if (borrar.getCantidad() == 1) {
                librosEnVenta.remove(borrar);
            } else {
                borrar.decrementar();
                        
            }
            cargarListaVentas();
            decrementarPrecio(borrar.getLibro().getPrecioVenta());
            listVentas.clearSelection();
        }
    }//GEN-LAST:event_btnEliminarLbrActionPerformed

    private void btnAgregarlbr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarlbr1ActionPerformed
        // TODO add your handling code here:
        if (listLibros.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un libro", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            guardarEnLista();
            cargarListaVentas();
            listLibros.clearSelection();
        }
    }//GEN-LAST:event_btnAgregarlbr1ActionPerformed

    private void btnCancVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancVentaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancVentaActionPerformed

    private void btnRegVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegVentaActionPerformed
        // TODO add your handling code here:
        if (txtFechaVenta.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una fecha", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean sePuede = false;        //se utiliza para verificar que se hayan vendido al menos un ejemplar
            String mensaje = "";        //se utiliza para desplegar el mensaje
            for(int i = 0; i < librosEnVenta.size(); i++){
                Libro l = librosEnVenta.get(i).getLibro();
                int cant = librosEnVenta.get(i).getCantidad();
                int aux = l.chequearStock(cant);
                if(aux > 0){
                    sePuede = true;    
                }
                if (cant > aux){            // Se verifica si la cantidad solicitada es mayor a la que hay en stock (aux)
                   mensaje = mensaje + "\n-"+ l.getTitulo()+" ("+aux+") ";
                   librosEnVenta.get(i).setCantidad(aux);
                   precio -= ((cant-aux)*librosEnVenta.get(i).getLibro().getPrecioVenta());
                   //Esto lo que hace es restarle al precio total lo que no se pudo vender por falta de stock
                }
            }
            if (!sePuede){
                JOptionPane.showMessageDialog(null, "No hay stock para los libros ingresados", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                ArrayList<InfoVenta> aux = new ArrayList<>(librosEnVenta);
                sistema.regVenta(txtFechaVenta.getText(), txtNombreCliente.getText(), sistema.getFactura(), aux);
                sistema.setFactura();
                lblNumFac.setText(sistema.getFactura()+"");
                if (mensaje.length() == 0){
                    JOptionPane.showMessageDialog(null, "Se realizó correctamente la venta", "Venta registrada", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Se realizó correctamente la venta. \nLas cantidades de ciertos libros fueron modificadas por falta de stock: "+mensaje+"\nEl nuevo precio es: "+precio, "Venta registrada", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            librosEnVenta.clear();
            cargarListaVentas();
            resetPrecio();
        }  
    }//GEN-LAST:event_btnRegVentaActionPerformed

    public void cargarListaLibros() {
        listLibros.setListData(sistema.ordenarXTitulo().toArray());
    }

    public void cargarListaVentas() {
        listVentas.setListData(librosEnVenta.toArray());
    }

    public void guardarEnLista() {
        Libro actual = (Libro) listLibros.getSelectedValue();
        boolean esta = false;

        for (int i = 0; i < librosEnVenta.size(); i++) {
            Libro aux = librosEnVenta.get(i).getLibro();
            if (aux.equals(actual)) {
                esta = true;
                librosEnVenta.get(i).incrementar();
            }
        }
        if (!esta) {
            InfoVenta nuevo = new InfoVenta(actual, 1);
            librosEnVenta.add(nuevo);
        }
        incrementarPrecio(actual.getPrecioVenta());
    }

    public void incrementarPrecio(int venta) {
        precio += venta;
        lblCosto.setText(precio + "");
    }

    public void decrementarPrecio(int venta) {
        precio -= venta;
        lblCosto.setText(precio + "");
   }
    
    public void resetPrecio() {
        precio = 0;
        lblCosto.setText(precio + "");
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarlbr1;
    private javax.swing.JButton btnCancVenta;
    private javax.swing.JButton btnEliminarLbr;
    private javax.swing.JButton btnRegVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClienteRegVenta;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblFacturaRegVenta;
    private javax.swing.JLabel lblFechaRegVenta;
    private javax.swing.JLabel lblLibroRegVenta;
    private javax.swing.JLabel lblNumFac;
    private javax.swing.JLabel lblRegVenta;
    private javax.swing.JLabel lblTotalVenta;
    private javax.swing.JLabel lblVentaRegVenta;
    private javax.swing.JList listLibros;
    private javax.swing.JList listVentas;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables

}
