/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

/**
 *
 * @author Juan
 */
public class ventRegAutor extends javax.swing.JFrame {

    /**
     * Creates new form ventRegAutor
     */
    public ventRegAutor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegAut = new javax.swing.JButton();
        btnCancAut = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        txtNomAut = new javax.swing.JTextField();
        txtNacAut = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAutIngresados = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Autor");
        getContentPane().setLayout(null);

        jLabel1.setText("Ingrese nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 50, 180, 16);

        jLabel2.setText("Registro de Autor");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 20, 200, 16);

        jLabel3.setText("Nacionalidad");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 100, 130, 16);

        btnRegAut.setText("Registrar");
        btnRegAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAutActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegAut);
        btnRegAut.setBounds(30, 230, 80, 23);

        btnCancAut.setText("Cancelar");
        btnCancAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancAutActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancAut);
        btnCancAut.setBounds(120, 230, 76, 23);

        jCheckBox1.setText("jCheckBox1");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(40, 170, 85, 20);

        txtNomAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomAutActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomAut);
        txtNomAut.setBounds(40, 70, 160, 22);

        txtNacAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacAutActionPerformed(evt);
            }
        });
        getContentPane().add(txtNacAut);
        txtNacAut.setBounds(40, 120, 160, 22);

        jLabel4.setText("Generos que escribe:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 150, 150, 16);

        listaAutIngresados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaAutIngresados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 50, 220, 200);

        jLabel5.setText("Autores ingresados:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 30, 130, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNacAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacAutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacAutActionPerformed

    private void btnRegAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegAutActionPerformed

    private void btnCancAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancAutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancAutActionPerformed

    private void txtNomAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomAutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomAutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventRegAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventRegAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventRegAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventRegAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventRegAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancAut;
    private javax.swing.JButton btnRegAut;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaAutIngresados;
    private javax.swing.JTextField txtNacAut;
    private javax.swing.JTextField txtNomAut;
    // End of variables declaration//GEN-END:variables
}
