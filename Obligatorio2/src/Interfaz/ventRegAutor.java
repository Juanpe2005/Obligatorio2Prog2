/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import javax.swing.JOptionPane;
import Dominio.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;

/**
 *
 * @author Juan
 */
public class ventRegAutor extends javax.swing.JFrame implements Observer{

    Sistema sistema;
    /**
     * Creates new form ventRegAutor
     */
    public ventRegAutor(Sistema sis) {
        initComponents();
        sistema= sis;
        cargarLista();
        cargarListaGenero();
        sis.addObserver(this);
    }

    public void update(Observable o, Object ob){
        cargarLista();
        cargarListaGenero();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNomRegAut = new javax.swing.JLabel();
        pnlListGen = new javax.swing.JPanel();
        lbRegAutor = new javax.swing.JLabel();
        pnlListAut = new javax.swing.JPanel();
        lbNacRegAut = new javax.swing.JLabel();
        btnRegAut = new javax.swing.JButton();
        btnCancAut = new javax.swing.JButton();
        txtNomAut = new javax.swing.JTextField();
        txtNacAut = new javax.swing.JTextField();
        lbGenQEscRegAut = new javax.swing.JLabel();
        lbAutIngRegAut = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listGenAut = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAutIngresados = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Autor");
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        lbNomRegAut.setText("Ingrese nombre");
        getContentPane().add(lbNomRegAut);
        lbNomRegAut.setBounds(40, 50, 180, 16);
        getContentPane().add(pnlListGen);
        pnlListGen.setBounds(0, 150, 240, 70);

        lbRegAutor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbRegAutor.setForeground(new java.awt.Color(0, 171, 0));
        lbRegAutor.setText("Registro de Autor");
        getContentPane().add(lbRegAutor);
        lbRegAutor.setBounds(40, 10, 200, 30);
        getContentPane().add(pnlListAut);
        pnlListAut.setBounds(240, 10, 240, 250);

        lbNacRegAut.setText("Nacionalidad");
        getContentPane().add(lbNacRegAut);
        lbNacRegAut.setBounds(40, 100, 130, 16);

        btnRegAut.setText("Registrar");
        btnRegAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAutActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegAut);
        btnRegAut.setBounds(40, 230, 80, 23);

        btnCancAut.setText("Cancelar");
        btnCancAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancAutActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancAut);
        btnCancAut.setBounds(130, 230, 76, 23);

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

        lbGenQEscRegAut.setText("Generos que escribe:");
        getContentPane().add(lbGenQEscRegAut);
        lbGenQEscRegAut.setBounds(40, 150, 150, 16);

        lbAutIngRegAut.setText("Autores ingresados:");
        getContentPane().add(lbAutIngRegAut);
        lbAutIngRegAut.setBounds(300, 30, 130, 16);

        listGenAut.setMinimumSize(new java.awt.Dimension(500, 500));
        jScrollPane2.setViewportView(listGenAut);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 170, 150, 50);

        jScrollPane1.setViewportView(listaAutIngresados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 50, 220, 190);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNacAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacAutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacAutActionPerformed

    private void btnRegAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAutActionPerformed
        // TODO add your handling code here:
        
        ArrayList<Genero> generosPorAutor = (ArrayList<Genero>) listGenAut.getSelectedValuesList();
        
        if(sistema.regAutor(txtNomAut.getText(), txtNacAut.getText(), generosPorAutor)){
            JOptionPane.showMessageDialog(null,"Se guardo el Autor", "info", JOptionPane.INFORMATION_MESSAGE);
            
            txtNomAut.setText("");
            txtNacAut.setText("");
            listGenAut.clearSelection();
            cargarLista();
        }else{
            //si ya existe muestra mensaje de error
            JOptionPane.showMessageDialog(null,"no guardo", "info", JOptionPane.ERROR_MESSAGE);
            txtNomAut.setText("");
            txtNacAut.setText("");
        }
        
        
    }//GEN-LAST:event_btnRegAutActionPerformed

    private void btnCancAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancAutActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancAutActionPerformed

    private void txtNomAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomAutActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNomAutActionPerformed

    
    public void cargarListaGenero(){
        if(sistema.getListaGeneros().size() >0){
            listGenAut.setListData(sistema.getListaGeneros().toArray());
            pnlListGen.setVisible(false);
        }else{
            pnlListGen.setVisible(true);
        }
    }
    
    public void cargarLista(){
        if(sistema.getListaAutores().size() >0){
            listaAutIngresados.setListData(sistema.getListaAutores().toArray());
            pnlListAut.setVisible(false);
        }else{
            pnlListAut.setVisible(true);
        }
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancAut;
    private javax.swing.JButton btnRegAut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAutIngRegAut;
    private javax.swing.JLabel lbGenQEscRegAut;
    private javax.swing.JLabel lbNacRegAut;
    private javax.swing.JLabel lbNomRegAut;
    private javax.swing.JLabel lbRegAutor;
    private javax.swing.JList listGenAut;
    private javax.swing.JList listaAutIngresados;
    private javax.swing.JPanel pnlListAut;
    private javax.swing.JPanel pnlListGen;
    private javax.swing.JTextField txtNacAut;
    private javax.swing.JTextField txtNomAut;
    // End of variables declaration//GEN-END:variables
}
