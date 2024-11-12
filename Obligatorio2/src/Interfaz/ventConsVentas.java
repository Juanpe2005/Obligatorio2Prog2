
package Interfaz;

import Dominio.InfoVenta;
import Dominio.Libro;
import Dominio.Sistema;
import Dominio.Venta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class ventConsVentas extends javax.swing.JFrame {

    Sistema sistema;
    
    /**
     * Creates new form ventConsVentas
     */
    public ventConsVentas(Sistema sis) {
        initComponents();
        sistema=sis;
        listaOpcionesLibros.setVisible(false);
        scrollListaOpciones.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollListaOpciones = new javax.swing.JScrollPane();
        listaOpcionesLibros = new javax.swing.JList();
        pnlTabla = new javax.swing.JPanel();
        lbisbnConsVenta = new javax.swing.JLabel();
        isbnConsVenta = new javax.swing.JTextField();
        btnConsVenta = new javax.swing.JButton();
        btnExpVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsVentas = new javax.swing.JTable();
        tituloConsVenta = new javax.swing.JLabel();
        btnLibrosIngConsVent = new javax.swing.JButton();
        lbTotRecConsVenta = new javax.swing.JLabel();
        nroTotalRecaudado = new javax.swing.JLabel();
        lbTotGanConsVenta = new javax.swing.JLabel();
        lbTotVenConsVenta = new javax.swing.JLabel();
        nroTotalGanancias = new javax.swing.JLabel();
        nroTotalEjemplares = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Ventas");
        getContentPane().setLayout(null);

        listaOpcionesLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaOpcionesLibrosMousePressed(evt);
            }
        });
        scrollListaOpciones.setViewportView(listaOpcionesLibros);

        getContentPane().add(scrollListaOpciones);
        scrollListaOpciones.setBounds(360, 60, 190, 250);
        getContentPane().add(pnlTabla);
        pnlTabla.setBounds(30, 100, 490, 210);

        lbisbnConsVenta.setText("ISBN");
        getContentPane().add(lbisbnConsVenta);
        lbisbnConsVenta.setBounds(20, 20, 30, 20);
        getContentPane().add(isbnConsVenta);
        isbnConsVenta.setBounds(50, 20, 200, 22);

        btnConsVenta.setText("Consultar");
        btnConsVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsVenta);
        btnConsVenta.setBounds(320, 20, 100, 23);

        btnExpVenta.setText("Exportar");
        btnExpVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnExpVenta);
        btnExpVenta.setBounds(460, 20, 90, 23);

        tablaConsVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Cliente", "Factura", "Cantidad", "Precio", "Ingreso"
            }
        ));
        jScrollPane1.setViewportView(tablaConsVentas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 100, 490, 210);

        tituloConsVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloConsVenta.setForeground(new java.awt.Color(0, 0, 255));
        tituloConsVenta.setText("Título del Libro");
        getContentPane().add(tituloConsVenta);
        tituloConsVenta.setBounds(40, 70, 220, 20);

        btnLibrosIngConsVent.setText("...");
        btnLibrosIngConsVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosIngConsVentActionPerformed(evt);
            }
        });
        getContentPane().add(btnLibrosIngConsVent);
        btnLibrosIngConsVent.setBounds(260, 20, 30, 23);

        lbTotRecConsVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTotRecConsVenta.setText("Total recaudado");
        getContentPane().add(lbTotRecConsVenta);
        lbTotRecConsVenta.setBounds(240, 330, 150, 20);

        nroTotalRecaudado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nroTotalRecaudado.setForeground(new java.awt.Color(0, 0, 255));
        nroTotalRecaudado.setText("0");
        getContentPane().add(nroTotalRecaudado);
        nroTotalRecaudado.setBounds(290, 350, 70, 20);

        lbTotGanConsVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTotGanConsVenta.setText("Total ganancias");
        getContentPane().add(lbTotGanConsVenta);
        lbTotGanConsVenta.setBounds(430, 330, 130, 20);

        lbTotVenConsVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTotVenConsVenta.setText("Ejemplares vendidos");
        getContentPane().add(lbTotVenConsVenta);
        lbTotVenConsVenta.setBounds(30, 330, 150, 20);

        nroTotalGanancias.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nroTotalGanancias.setForeground(new java.awt.Color(0, 0, 255));
        nroTotalGanancias.setText("0");
        getContentPane().add(nroTotalGanancias);
        nroTotalGanancias.setBounds(480, 350, 70, 20);

        nroTotalEjemplares.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nroTotalEjemplares.setForeground(new java.awt.Color(0, 0, 255));
        nroTotalEjemplares.setText("0");
        getContentPane().add(nroTotalEjemplares);
        nroTotalEjemplares.setBounds(80, 350, 80, 20);

        setSize(new java.awt.Dimension(608, 420));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsVentaActionPerformed
        // TODO add your handling code here:
        String isbnActual = isbnConsVenta.getText();
        if(isbnActual.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar un isbn", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(sistema.chequearISBN(isbnActual)){
                JOptionPane.showMessageDialog(null, "No hay libros ingresados con ese isbn", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                Libro libroPedido = sistema.tomarLibro(isbnActual);
                cargarTabla(sistema.ventasDeUnLibro(libroPedido), libroPedido);
            }
        }
    }//GEN-LAST:event_btnConsVentaActionPerformed

    private void btnLibrosIngConsVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosIngConsVentActionPerformed
        // TODO add your handling code here:
        if(sistema.getListaLibros().isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay libros ingresados", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            listaOpcionesLibros.setVisible(true);
            scrollListaOpciones.setVisible(true);
            listaOpcionesLibros.setListData(sistema.getListaLibros().toArray());
            
        }
        
    }//GEN-LAST:event_btnLibrosIngConsVentActionPerformed

    private void listaOpcionesLibrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaOpcionesLibrosMousePressed
        // TODO add your handling code here:
        Libro actual = (Libro) listaOpcionesLibros.getSelectedValue();
        isbnConsVenta.setText(actual.getIsbn());
        cargarTabla(sistema.ventasDeUnLibro(actual),actual);
        listaOpcionesLibros.setVisible(false);
        scrollListaOpciones.setVisible(false);
    }//GEN-LAST:event_listaOpcionesLibrosMousePressed

    private void btnExpVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpVentaActionPerformed
        // TODO add your handling code here:
        ArchivoGrabacion arch = new ArchivoGrabacion("VENTAS.CSV");
        Libro l = sistema.tomarLibro(isbnConsVenta.getText());
        String cols = "Fecha | Cliente | Factura | Cantidad | Precio | Importe";
        
        for(int i = 0; i < sistema.ventasDeUnLibro(l).size(); i++){
            
        }
    }//GEN-LAST:event_btnExpVentaActionPerformed

    public void cargarTabla(ArrayList<Venta> cargado, Libro l){
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaConsVentas.getModel();
        modeloTabla.setRowCount(0);
        int cantTotal = 0;
        // Recorre el ArrayList y agrega las filas con la información
        if(cargado.size()>0){
            pnlTabla.setVisible(false);
            tituloConsVenta.setText(l.getTitulo());
            for (int i = 0; i < cargado.size(); i++) {
                cantTotal += cargado.get(i).cantidadXLibro(l);
                String[] fila = new String[6];
                fila[0] = cargado.get(i).getFecha();
                fila[1] = cargado.get(i).getCliente();
                fila[2] = cargado.get(i).getNroFactura()+"";
                fila[3] = cargado.get(i).cantidadXLibro(l)+"";
                fila[4] = l.getPrecioVenta()+"";
                fila[5] = l.getPrecioVenta()*cargado.get(i).cantidadXLibro(l)+"";
                modeloTabla.addRow(fila);
            }
            tablaConsVentas.setModel(modeloTabla);
            modeloTabla.fireTableDataChanged();
            nroTotalEjemplares.setText(""+cantTotal);
            nroTotalRecaudado.setText(""+(cantTotal*l.getPrecioVenta()));
            nroTotalGanancias.setText(""+(cantTotal*(l.getPrecioVenta()-l.getPrecioCosto())));
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay ventas ingresadas para ese libro", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsVenta;
    private javax.swing.JButton btnExpVenta;
    private javax.swing.JButton btnLibrosIngConsVent;
    private javax.swing.JTextField isbnConsVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTotGanConsVenta;
    private javax.swing.JLabel lbTotRecConsVenta;
    private javax.swing.JLabel lbTotVenConsVenta;
    private javax.swing.JLabel lbisbnConsVenta;
    private javax.swing.JList listaOpcionesLibros;
    private javax.swing.JLabel nroTotalEjemplares;
    private javax.swing.JLabel nroTotalGanancias;
    private javax.swing.JLabel nroTotalRecaudado;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JScrollPane scrollListaOpciones;
    private javax.swing.JTable tablaConsVentas;
    private javax.swing.JLabel tituloConsVenta;
    // End of variables declaration//GEN-END:variables
}
