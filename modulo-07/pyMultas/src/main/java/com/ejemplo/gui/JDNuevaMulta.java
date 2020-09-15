/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.gui;

import com.ejemplo.dominio.Caminera;
import com.ejemplo.dominio.Multa;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class JDNuevaMulta extends javax.swing.JDialog {
    private Caminera oCaminera;

    /**
     * Creates new form JDNuevaMulta
     */
    public JDNuevaMulta(java.awt.Frame parent, boolean modal, Caminera oCaminera) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.oCaminera = oCaminera;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtActa = new javax.swing.JTextField();
        jtMonto = new javax.swing.JTextField();
        jbAceptar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jcCodigo = new javax.swing.JComboBox<>();

        jLabel3.setText("Acta");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Acta N:");

        jLabel2.setText("Codigo de Infraccion:");

        jLabel4.setText("Monto:");

        jtActa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtActaKeyTyped(evt);
            }
        });

        jtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMontoKeyTyped(evt);
            }
        });

        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jcCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciones", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jcCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCancelar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcCodigo, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                            .addComponent(jtActa)
                            .addComponent(jtMonto))
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtActa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAceptar)
                    .addComponent(jbCancelar))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        int acta, codigo;
        float monto;
        
        if(jtActa.getText().equals("") || jtMonto.getText().equals("") || jcCodigo.getSelectedIndex()<=0 ){
            JOptionPane.showMessageDialog(this, "Olvido ingresar un valor", "Validacion", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        acta = Integer.parseInt(jtActa.getText());
        
        codigo = Integer.parseInt(jcCodigo.getSelectedItem().toString());

        monto = Float.parseFloat(jtMonto.getText());
        
        Multa oMulta = new Multa(acta, codigo, monto);
        boolean exito =  oCaminera.registrarMulta(oMulta);
        
       if(exito == true){
           JOptionPane.showMessageDialog(this, "Multa regsitrada");
           this.dispose();
       } else{
           JOptionPane.showMessageDialog(this, "No se pudo registrar la multa");
       }
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jtActaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtActaKeyTyped
        validarNumero(evt);
    }//GEN-LAST:event_jtActaKeyTyped

    private void jtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMontoKeyTyped
        validarNumero(evt);
    }//GEN-LAST:event_jtMontoKeyTyped

    private void jcCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCodigoActionPerformed

    private void validarNumero(java.awt.event.KeyEvent evt){
        char tecla = evt.getKeyChar();
        if(Character.isDigit(tecla) == false){
            evt.consume();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JComboBox<String> jcCodigo;
    private javax.swing.JTextField jtActa;
    private javax.swing.JTextField jtMonto;
    // End of variables declaration//GEN-END:variables
}
