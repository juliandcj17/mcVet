/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcvet.Formularios.Cliente;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import mcvet.Formularios.Mascota.ListaMascota;

/**
 *
 * @author Julian
 */
public class UbicarNuevoCliente extends javax.swing.JFrame {

    /**
     * Creates new form UbicarNuevoCliente
     */
    public UbicarNuevoCliente() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        // llama al metodo que valida que solo sean numeros
        SoloNumeros(antesDelCliente);
        SoloNumeros(despuesDelCliente);
    }

    //Metodo que balida que la entrada solo sea de numeros
    public void SoloNumeros(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbAlComienzo = new javax.swing.JRadioButton();
        rbAlFinal = new javax.swing.JRadioButton();
        rbAntesDelCliente = new javax.swing.JRadioButton();
        rbDespuesDelCliente = new javax.swing.JRadioButton();
        antesDelCliente = new javax.swing.JTextField();
        despuesDelCliente = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("Opciones para agregar");
        jPanel1.setName("Opciones para agregar"); // NOI18N

        buttonGroup1.add(rbAlComienzo);
        rbAlComienzo.setText("Al comienzo de la lista");
        rbAlComienzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlComienzoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAlFinal);
        rbAlFinal.setText("Al final de la lista");
        rbAlFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlFinalActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAntesDelCliente);
        rbAntesDelCliente.setText("Antes del cliente con el codigo");
        rbAntesDelCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbAntesDelClienteMouseClicked(evt);
            }
        });
        rbAntesDelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAntesDelClienteActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbDespuesDelCliente);
        rbDespuesDelCliente.setText("Después del cliente con el codigo");

        antesDelCliente.setEnabled(false);
        antesDelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antesDelClienteActionPerformed(evt);
            }
        });

        despuesDelCliente.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbAntesDelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(antesDelCliente))
                    .addComponent(rbAlFinal)
                    .addComponent(rbAlComienzo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbDespuesDelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(despuesDelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbAlComienzo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAlFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbAntesDelCliente)
                    .addComponent(antesDelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(despuesDelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbDespuesDelCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Opciones para agregar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnFinalizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbAlComienzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlComienzoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rbAlComienzoActionPerformed

    private void rbAlFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAlFinalActionPerformed

    private void rbAntesDelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAntesDelClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAntesDelClienteActionPerformed

    private void antesDelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antesDelClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_antesDelClienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        AgregarCliente a = new AgregarCliente();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void rbAntesDelClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbAntesDelClienteMouseClicked
        // TODO add your handling code here:
        //AntesDe.setEnabled(true);
                if(rbAlComienzo.isSelected()){
            //JOptionPane.showMessageDialog(this, "al comienzo ");
            //invoca el metodo para añadir al comienzo
        }else if(rbAlFinal.isSelected()){
            JOptionPane.showMessageDialog(this, "al final ");
        }else if(rbAntesDelCliente.isSelected()){
            antesDelCliente.setEnabled(true);
            despuesDelCliente.setEnabled(false);
            //JOptionPane.showMessageDialog(this, "antes de un fulano  ");
        }else if(rbDespuesDelCliente.isSelected()){
            antesDelCliente.setEnabled(false);
            despuesDelCliente.setEnabled(true);
            
            //JOptionPane.showMessageDialog(this, "despues del fulano");
        }else{
            JOptionPane.showMessageDialog(this, "no selecciono ninguna");
        }
    }//GEN-LAST:event_rbAntesDelClienteMouseClicked

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
            java.util.logging.Logger.getLogger(UbicarNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UbicarNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UbicarNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UbicarNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UbicarNuevoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField antesDelCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JTextField despuesDelCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbAlComienzo;
    private javax.swing.JRadioButton rbAlFinal;
    private javax.swing.JRadioButton rbAntesDelCliente;
    private javax.swing.JRadioButton rbDespuesDelCliente;
    // End of variables declaration//GEN-END:variables
}
