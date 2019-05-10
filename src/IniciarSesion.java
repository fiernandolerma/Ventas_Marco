
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando Alberto
 */
public class IniciarSesion extends javax.swing.JFrame {

    public IniciarSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon usuario= new ImageIcon(getClass().getResource("/imagenes/usuario.png")) ;
        ImageIcon iconoUsuario= new ImageIcon(usuario.getImage().getScaledInstance(lblUser.getWidth(), lblUser.getHeight(), Image.SCALE_DEFAULT));
        lblUser.setIcon(iconoUsuario);
        ImageIcon contraseña= new ImageIcon(getClass().getResource("/imagenes/contraseña.png")) ;
        ImageIcon iconoContraseña= new ImageIcon(contraseña.getImage().getScaledInstance(lblPass.getWidth(), lblPass.getHeight(), Image.SCALE_DEFAULT));
        lblPass.setIcon(iconoContraseña);
        ImageIcon tienda= new ImageIcon(getClass().getResource("/imagenes/tienda.png")) ;
        ImageIcon iconoTienda= new ImageIcon(tienda.getImage().getScaledInstance(lbltienda.getWidth(), lbltienda.getHeight(), Image.SCALE_DEFAULT));
        lbltienda.setIcon(iconoTienda);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbltienda = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpswPAS = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setForeground(new java.awt.Color(204, 153, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        lbltienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tienda.png"))); // NOI18N

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtUser.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        txtUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("-Usuario-");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblPass.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("-Contraseña-");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jpswPAS.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jpswPAS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jpswPASKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpswPASKeyTyped(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(2, 129, 149));
        btnIniciar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar Sesión");
        btnIniciar.setEnabled(false);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(lbltienda, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 268, Short.MAX_VALUE))
                            .addComponent(txtUser)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jpswPAS)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltienda, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpswPAS, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpswPASKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpswPASKeyReleased
        if(txtUser.getText().isEmpty() || jpswPAS.getPassword().length==0){
            btnIniciar.setEnabled(false);
        }
        else{
            btnIniciar.setEnabled(true);
        }
    }//GEN-LAST:event_jpswPASKeyReleased

    private void jpswPASKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpswPASKeyTyped
        char car = evt.getKeyChar();
        if(Character.isLetter(car) || Character.isDigit(car)){
        
        }else{
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jpswPASKeyTyped

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if((txtUser.getText().equals("administrador"))&&(String.valueOf(jpswPAS.getPassword()).equals("12345"))){
              Menu_Admin conector;
            try {
                conector = new Menu_Admin();
                conector.setVisible(true);
                    conector.setTitle("Menú Adinistrador");
                    dispose();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(IniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(IniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
        }else{
        if((txtUser.getText().equals("empleado"))&&(String.valueOf(jpswPAS.getPassword()).equals("12345"))){
           /* Menu_Admin conector= new Menu_Admin();
                    conector.setVisible(true);
                    conector.setTitle("Menú Adinistrador");
                    dispose();*/
        }else{
            JOptionPane.showMessageDialog(null, "No se encontró un Usuario con dichos datos");
        }
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        char car = evt.getKeyChar();
        if(Character.isLetter(car) || Character.isDigit(car)){

        }else{
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        if(txtUser.getText().isEmpty() || jpswPAS.getPassword().length==0){
            btnIniciar.setEnabled(false);
        }
        else{
            btnIniciar.setEnabled(true);
        }
    }//GEN-LAST:event_txtUserKeyReleased

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jpswPAS;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lbltienda;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
