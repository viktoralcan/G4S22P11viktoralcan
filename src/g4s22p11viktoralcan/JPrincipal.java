package g4s22p11viktoralcan;

import com.google.gson.Gson;

public class JPrincipal extends javax.swing.JFrame {

    public JPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        B = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        A = new javax.swing.JTextField();
        BtnJson = new javax.swing.JButton();
        BtonEstru = new javax.swing.JButton();
        CJson = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel3.setText("Edad: ");

        B.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel2.setText("Formato Json");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel4.setText("Nombre: ");

        A.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N

        BtnJson.setText("Formato Json");
        BtnJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJsonActionPerformed(evt);
            }
        });

        BtonEstru.setText("Tipo estructura");
        BtonEstru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtonEstruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(BtnJson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(BtonEstru)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CJson, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnJson)
                    .addComponent(BtonEstru))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CJson, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJsonActionPerformed
        
        Datos datos = new Datos();
        Gson gson = new Gson();
        String cadena = "";
        datos.setNombre(A.getText().toString());
        datos.setEdad(Integer.parseInt(B.getText().toString()));
        
        cadena = gson.toJson(datos);
        CJson.setText(cadena);
        
        limpiar();
        
    }//GEN-LAST:event_BtnJsonActionPerformed

    private void BtonEstruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonEstruActionPerformed
        
        String cadena = "";
        Datos datos = new Datos();
        Gson gson = new Gson();
        
        cadena = CJson.getText().toString();
        
        datos = gson.fromJson(cadena, Datos.class);
        
        A.setText(datos.getNombre());
        B.setText(String.valueOf(datos.getEdad()));
        
    }//GEN-LAST:event_BtonEstruActionPerformed

    private void limpiar(){
        A.setText("");  B.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField B;
    private javax.swing.JButton BtnJson;
    private javax.swing.JButton BtonEstru;
    private javax.swing.JTextField CJson;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
