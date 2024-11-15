package Interfaz;

import Dominio.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
@author Juan Pedro Longo (329112)
@author Jose Ignacio Arbilla (338084)
 */
public class ventRegEditorial extends javax.swing.JFrame implements Observer {

    Sistema sistema;

    /**
     * Creates new form ventRegEditorial
     */
    public ventRegEditorial(Sistema sis) {
        initComponents();
        sistema = sis;
        sis.addObserver(this);
        //se carga la tabla con los datos que ya se tienen
        cargaTabla();

    }

    public void update(Observable o, Object ob) {
        cargaTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNomRegEdi = new javax.swing.JLabel();
        pnlEdi = new javax.swing.JPanel();
        txtNombreEdi = new javax.swing.JTextField();
        lbPaisRegEdi = new javax.swing.JLabel();
        txtPaisEdi = new javax.swing.JTextField();
        lbRegEdi = new javax.swing.JLabel();
        btnRegEdi = new javax.swing.JButton();
        btnCancRegEdi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEdiReg = new javax.swing.JTable();
        lbEdiIngRegEdi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Editorial");
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        lbNomRegEdi.setText("Nombre de la editorial :");
        getContentPane().add(lbNomRegEdi);
        lbNomRegEdi.setBounds(20, 50, 180, 16);
        getContentPane().add(pnlEdi);
        pnlEdi.setBounds(220, 0, 220, 240);

        txtNombreEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEdiActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreEdi);
        txtNombreEdi.setBounds(20, 70, 140, 22);

        lbPaisRegEdi.setText("Pais de origen :");
        getContentPane().add(lbPaisRegEdi);
        lbPaisRegEdi.setBounds(20, 110, 100, 16);

        txtPaisEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisEdiActionPerformed(evt);
            }
        });
        getContentPane().add(txtPaisEdi);
        txtPaisEdi.setBounds(20, 130, 140, 22);

        lbRegEdi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbRegEdi.setForeground(new java.awt.Color(0, 171, 0));
        lbRegEdi.setText("Resgistro de Editorial");
        getContentPane().add(lbRegEdi);
        lbRegEdi.setBounds(20, 10, 190, 25);

        btnRegEdi.setText("Registrar");
        btnRegEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegEdiActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegEdi);
        btnRegEdi.setBounds(20, 180, 90, 23);

        btnCancRegEdi.setText("Cancelar");
        btnCancRegEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancRegEdiActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancRegEdi);
        btnCancRegEdi.setBounds(120, 180, 90, 23);

        tblEdiReg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre ", "Pais"
            }
        ));
        jScrollPane1.setViewportView(tblEdiReg);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 30, 180, 200);

        lbEdiIngRegEdi.setText("Tabla de Editoriales registradas");
        getContentPane().add(lbEdiIngRegEdi);
        lbEdiIngRegEdi.setBounds(240, 10, 190, 16);

        setSize(new java.awt.Dimension(457, 253));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreEdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEdiActionPerformed

    private void txtPaisEdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisEdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisEdiActionPerformed

    private void btnCancRegEdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancRegEdiActionPerformed
        // TODO add your handling code here:
        //con esta linea se cierra la ventana
        this.dispose();
    }//GEN-LAST:event_btnCancRegEdiActionPerformed

    private void btnRegEdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegEdiActionPerformed
        // TODO add your handling code here:
        //Se agrega una nueva editorial si el nobre no existe 
        if (sistema.regEditorial(txtNombreEdi.getText(), txtPaisEdi.getText())) {
            JOptionPane.showMessageDialog(null, "Se guardo la Editorial", "info", JOptionPane.INFORMATION_MESSAGE);
            //luego de agregar se ponen ambos campos de texto vacios
            txtNombreEdi.setText("");
            txtPaisEdi.setText("");
            //se carga la tabla
            //cargaTabla();

        } else {
            //si ya existe muestra mensaje de error
            JOptionPane.showMessageDialog(null, "Ya existe editrorial con ese nombre", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnRegEdiActionPerformed

    //sacado de una pagina de internet, para cargar la tabla con los datos
    public void cargaTabla() {
        DefaultTableModel tableModel = (DefaultTableModel) tblEdiReg.getModel();
        tableModel.setRowCount(0);

        ArrayList<Editorial> list = sistema.getListaEditoriales();
        if (list.size() > 0) {
            pnlEdi.setVisible(false);
        } else {
            pnlEdi.setVisible(true);

        }
        for (int i = 0; i < list.size(); i++) {
            String[] data = new String[2];
            data[0] = list.get(i).getNombre();
            data[1] = list.get(i).getPais();
            tableModel.addRow(data);
        }
        tblEdiReg.setModel(tableModel);
        tableModel.fireTableDataChanged();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancRegEdi;
    private javax.swing.JButton btnRegEdi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEdiIngRegEdi;
    private javax.swing.JLabel lbNomRegEdi;
    private javax.swing.JLabel lbPaisRegEdi;
    private javax.swing.JLabel lbRegEdi;
    private javax.swing.JPanel pnlEdi;
    private javax.swing.JTable tblEdiReg;
    private javax.swing.JTextField txtNombreEdi;
    private javax.swing.JTextField txtPaisEdi;
    // End of variables declaration//GEN-END:variables

}
