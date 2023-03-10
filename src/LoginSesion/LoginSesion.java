/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginSesion;

import Index.Index;
import Registros.RegistroPersonal;
import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author EdilsonJMT
 */
public class LoginSesion extends javax.swing.JFrame {
    
    ConexionBD cc=new ConexionBD();
    Connection con=cc.conectar();
    

    /**
     * Creates new form LoginSesion
     */
    public LoginSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        FondoWallpaper = new javax.swing.JPanel();
        FondoImagenWallpaper = new javax.swing.JLabel();
        BotonRegistrarse = new javax.swing.JButton();
        ContraseñaTexto = new javax.swing.JLabel();
        UsuarioTexto = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        BotonCancelar = new javax.swing.JButton();
        BotonIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackGround.setBackground(new java.awt.Color(255, 255, 255));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoWallpaper.setBackground(new java.awt.Color(0, 51, 153));

        FondoImagenWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCineplanet/FondoWallpaperV3.png"))); // NOI18N

        javax.swing.GroupLayout FondoWallpaperLayout = new javax.swing.GroupLayout(FondoWallpaper);
        FondoWallpaper.setLayout(FondoWallpaperLayout);
        FondoWallpaperLayout.setHorizontalGroup(
            FondoWallpaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoImagenWallpaper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FondoWallpaperLayout.setVerticalGroup(
            FondoWallpaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoImagenWallpaper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BackGround.add(FondoWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 900, 720));

        BotonRegistrarse.setBackground(new java.awt.Color(242, 242, 242));
        BotonRegistrarse.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        BotonRegistrarse.setForeground(new java.awt.Color(0, 51, 204));
        BotonRegistrarse.setText("Registrarse");
        BotonRegistrarse.setBorder(null);
        BotonRegistrarse.setBorderPainted(false);
        BotonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarseActionPerformed(evt);
            }
        });
        BackGround.add(BotonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 610, 140, 40));

        ContraseñaTexto.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        ContraseñaTexto.setText("Contraseña:");
        ContraseñaTexto.setToolTipText("");
        BackGround.add(ContraseñaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 370, 30));

        UsuarioTexto.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        UsuarioTexto.setText("Usuario:");
        UsuarioTexto.setToolTipText("");
        BackGround.add(UsuarioTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 370, 30));

        txtUsuario.setToolTipText("");
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        BackGround.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 350, 30));
        BackGround.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 350, 30));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        BackGround.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 350, 10));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        BackGround.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 350, 10));

        BotonCancelar.setBackground(new java.awt.Color(0, 51, 153));
        BotonCancelar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        BotonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BotonCancelar.setText("Cancelar");
        BotonCancelar.setBorder(null);
        BotonCancelar.setBorderPainted(false);
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        BackGround.add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 160, 50));

        BotonIngresar.setBackground(new java.awt.Color(0, 51, 153));
        BotonIngresar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        BotonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        BotonIngresar.setText("Ingresar");
        BotonIngresar.setBorder(null);
        BotonIngresar.setBorderPainted(false);
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });
        BackGround.add(BotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 160, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCineplanet/CineplanetLogoV1.png"))); // NOI18N
        BackGround.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 380, 250));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCineplanet/TexturaBlancoV1.png"))); // NOI18N
        BackGround.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        int resultado=0;
        String contraseña=String.valueOf(txtContraseña.getPassword());
        String usuario=txtUsuario.getText();
        String SQL="select * from personalCP where id_per='"+usuario+"' and contraseña='"+contraseña+"' ";
        
        try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            
            if(rs.next()){
                resultado=1;
                
                if (resultado==1){
                    Index form=new Index();
                    form.setVisible(true);
                    this.dispose();
                }
                
            }else{
                JOptionPane.showMessageDialog(null,"Error, el usuario no existe");
            }
        }  catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }//GEN-LAST:event_BotonIngresarActionPerformed

    private void BotonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarseActionPerformed
                    RegistroPersonal form=new RegistroPersonal();
                    form.setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_BotonRegistrarseActionPerformed

    
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
            java.util.logging.Logger.getLogger(LoginSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonRegistrarse;
    private javax.swing.JLabel ContraseñaTexto;
    private javax.swing.JLabel FondoImagenWallpaper;
    private javax.swing.JPanel FondoWallpaper;
    private javax.swing.JLabel UsuarioTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
