/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PengelolaanKRS;

/**
 *
 * @author alief
 */
public class FormLoginMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form FormLoginMahasiswa
     */
    public FormLoginMahasiswa() {
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

        jPanel1 = new javax.swing.JPanel();
        PanelLoginMahasiswa = new javax.swing.JPanel();
        LabelUsernameMahasiswa = new javax.swing.JLabel();
        LabelPasswordMahasiswa = new javax.swing.JLabel();
        TextFieldUsernameMahasiswa = new javax.swing.JTextField();
        PasswordFieldPasswordMahasiswa = new javax.swing.JPasswordField();
        ButtonMasukMahasiswa = new javax.swing.JButton();
        ButtonKembaliMahasiswa = new javax.swing.JButton();
        PanelGambarLoginMahasiswa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Mahasiswa");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        PanelLoginMahasiswa.setBackground(new java.awt.Color(255, 255, 0));
        PanelLoginMahasiswa.setPreferredSize(new java.awt.Dimension(292, 348));
        PanelLoginMahasiswa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelUsernameMahasiswa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LabelUsernameMahasiswa.setText("Username");
        PanelLoginMahasiswa.add(LabelUsernameMahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 243, -1, -1));

        LabelPasswordMahasiswa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LabelPasswordMahasiswa.setText("Password");
        PanelLoginMahasiswa.add(LabelPasswordMahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 274, -1, -1));
        PanelLoginMahasiswa.add(TextFieldUsernameMahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 175, -1));
        PanelLoginMahasiswa.add(PasswordFieldPasswordMahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 271, 175, -1));

        ButtonMasukMahasiswa.setBackground(new java.awt.Color(51, 255, 51));
        ButtonMasukMahasiswa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonMasukMahasiswa.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMasukMahasiswa.setText("Masuk");
        ButtonMasukMahasiswa.setBorder(null);
        ButtonMasukMahasiswa.setMargin(new java.awt.Insets(2, 3, 2, 3));
        PanelLoginMahasiswa.add(ButtonMasukMahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 309, 60, 25));

        ButtonKembaliMahasiswa.setBackground(new java.awt.Color(51, 0, 255));
        ButtonKembaliMahasiswa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonKembaliMahasiswa.setForeground(new java.awt.Color(255, 255, 255));
        ButtonKembaliMahasiswa.setText("Kembali");
        ButtonKembaliMahasiswa.setBorder(null);
        ButtonKembaliMahasiswa.setMargin(new java.awt.Insets(2, 3, 2, 3));
        ButtonKembaliMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKembaliMahasiswaActionPerformed(evt);
            }
        });
        PanelLoginMahasiswa.add(ButtonKembaliMahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 309, 70, 25));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarDanIcon/mahasiswa.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout PanelGambarLoginMahasiswaLayout = new javax.swing.GroupLayout(PanelGambarLoginMahasiswa);
        PanelGambarLoginMahasiswa.setLayout(PanelGambarLoginMahasiswaLayout);
        PanelGambarLoginMahasiswaLayout.setHorizontalGroup(
            PanelGambarLoginMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        PanelGambarLoginMahasiswaLayout.setVerticalGroup(
            PanelGambarLoginMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, Short.MAX_VALUE)
        );

        PanelLoginMahasiswa.add(PanelGambarLoginMahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 292, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("LOGIN MAHASISWA");
        PanelLoginMahasiswa.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("Silahkan isi NPM / NIM sebagai username");
        PanelLoginMahasiswa.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(PanelLoginMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLoginMahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonKembaliMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKembaliMahasiswaActionPerformed
        FormMenu formMenu = new FormMenu();
        formMenu.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonKembaliMahasiswaActionPerformed

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
            java.util.logging.Logger.getLogger(FormLoginMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLoginMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLoginMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLoginMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLoginMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonKembaliMahasiswa;
    private javax.swing.JButton ButtonMasukMahasiswa;
    private javax.swing.JLabel LabelPasswordMahasiswa;
    private javax.swing.JLabel LabelUsernameMahasiswa;
    private javax.swing.JPanel PanelGambarLoginMahasiswa;
    private javax.swing.JPanel PanelLoginMahasiswa;
    private javax.swing.JPasswordField PasswordFieldPasswordMahasiswa;
    private javax.swing.JTextField TextFieldUsernameMahasiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
