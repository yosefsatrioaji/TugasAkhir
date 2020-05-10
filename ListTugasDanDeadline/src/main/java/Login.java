
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yosef
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        LoginBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        HintBtn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 390));
        setMinimumSize(new java.awt.Dimension(750, 390));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("List Tugas dan Deadlinenya");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 14, 670, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login dulu yaaa..!");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 90, 670, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 140, 80, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 190, 70, 17);
        getContentPane().add(User);
        User.setBounds(250, 130, 240, 30);
        getContentPane().add(Pass);
        Pass.setBounds(250, 180, 240, 30);

        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBtn);
        LoginBtn.setBounds(230, 240, 70, 23);

        ClearBtn.setText("Clear");
        getContentPane().add(ClearBtn);
        ClearBtn.setBounds(370, 240, 80, 23);

        HintBtn.setText("Hint");
        getContentPane().add(HintBtn);
        HintBtn.setBounds(300, 280, 70, 23);

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\yosef\\Downloads\\77837_pelajar-sma-mengerjakan-tugas-yang-banyak.jpg")); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 750, 500);

        setBounds(0, 0, 702, 431);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
        String pass = new String(Pass.getPassword());
        String user = new String(User.getText());
        userService satu = new userService( user, pass );
        boolean status = satu.checkCredential();
        if(status == true) //jika input sesuai dengan data constructor akan mengoutputkan ini
        {
            JOptionPane.showMessageDialog(null,"Login Sukses");
            ProgramUtama utama = new ProgramUtama();
            dispose();
            utama.setVisible(true);
        }
        else //jika salah ini
        {
            JOptionPane.showMessageDialog(null,"Login Gagal");
        }                                        
    }//GEN-LAST:event_LoginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton HintBtn;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField User;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
