/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri_tabani_depo;

 
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

/**
 *
 * @author numan
 */
public class Personel_Sayfasi extends javax.swing.JFrame {

    /**
     * Creates new form Personel_Sayfasi
     */
    public Personel_Sayfasi() {
        initComponents();

         this.setBounds(960, 100, 450, 560);
this.setResizable(false);
          setLocationRelativeTo(null);
        this.setTitle("Personel Sayfasi");
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Tc = new javax.swing.JTextField();
        jTextField_Ad = new javax.swing.JTextField();
        jTextField_Soyad = new javax.swing.JTextField();
        jTextField_Departman = new javax.swing.JTextField();
        jTextField_CT = new javax.swing.JTextField();
        jTextField_E = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Adrs = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("E_Mail");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 350, 184, 55);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 51, 0));
        jLabel2.setText("Adres");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 410, 170, 55);

        jLabel3.setBackground(new java.awt.Color(153, 51, 0));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 0));
        jLabel3.setText("Tc Kimlik Numarasi");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 30, 184, 55);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 51, 0));
        jLabel4.setText("Adi");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 100, 184, 40);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 0));
        jLabel5.setText("Deparman");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 220, 184, 55);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 51, 0));
        jLabel6.setText("Cep Telefonu");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 290, 184, 55);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 51, 0));
        jLabel8.setText("Soyadi");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 160, 184, 55);

        jTextField_Tc.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jTextField_Tc.setForeground(new java.awt.Color(153, 51, 0));
        getContentPane().add(jTextField_Tc);
        jTextField_Tc.setBounds(230, 40, 180, 50);

        jTextField_Ad.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jTextField_Ad.setForeground(new java.awt.Color(153, 51, 0));
        getContentPane().add(jTextField_Ad);
        jTextField_Ad.setBounds(230, 100, 180, 50);

        jTextField_Soyad.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jTextField_Soyad.setForeground(new java.awt.Color(153, 51, 0));
        getContentPane().add(jTextField_Soyad);
        jTextField_Soyad.setBounds(230, 160, 180, 50);

        jTextField_Departman.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jTextField_Departman.setForeground(new java.awt.Color(153, 51, 0));
        getContentPane().add(jTextField_Departman);
        jTextField_Departman.setBounds(230, 220, 180, 50);

        jTextField_CT.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jTextField_CT.setForeground(new java.awt.Color(153, 51, 0));
        getContentPane().add(jTextField_CT);
        jTextField_CT.setBounds(230, 290, 180, 50);

        jTextField_E.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jTextField_E.setForeground(new java.awt.Color(153, 51, 0));
        getContentPane().add(jTextField_E);
        jTextField_E.setBounds(230, 360, 180, 40);

        jTextArea_Adrs.setColumns(20);
        jTextArea_Adrs.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jTextArea_Adrs.setForeground(new java.awt.Color(153, 51, 0));
        jTextArea_Adrs.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Adrs);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 410, 180, 50);

        jButton1.setBackground(new java.awt.Color(153, 51, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\numan.DESKTOP-BO05F21\\Documents\\NetBeansProjects\\Veri_Tabani_Depo\\exit-2.png")); // NOI18N
        jButton1.setText("Cıkis");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 0, 90, 40);

        jButton2.setBackground(new java.awt.Color(153, 51, 0));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\numan.DESKTOP-BO05F21\\Documents\\NetBeansProjects\\Veri_Tabani_Depo\\save.png")); // NOI18N
        jButton2.setText("Ekle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 470, 370, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\numan.DESKTOP-BO05F21\\Documents\\NetBeansProjects\\Veri_Tabani_Depo\\İmage\\Beyaz.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 510, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  ArrayList<String>Array1=new ArrayList<>();
   Array1.add(String.valueOf(jTextField_Tc.getText()));
    Array1.add(String.valueOf(jTextField_Ad.getText()));
     Array1.add(String.valueOf(jTextField_Soyad.getText()));
      Array1.add(String.valueOf(jTextField_Departman.getText()));
       Array1.add(String.valueOf(jTextField_CT.getText()));
        Array1.add(String.valueOf(jTextField_E.getText()));
        Array1.add(String.valueOf(jTextArea_Adrs.getText()));
        String passset=jTextField_Tc.getText().charAt(0)+""+jTextField_Tc.getText().charAt(1)+""+jTextField_Soyad.getText().charAt(1);
              Veri_Ekleme ekleme=new Veri_Ekleme();
        ArrayList<String> ButtonDizi;
   ekleme.kaydet(Array1,"INSERT INTO personeller ( tc, Adi, Soyadi, Departman, Tel_No, E_Mail, Sifre, Yetki, Adres) VALUES ( ?, ?, ?, ?, ?, ?,'"+passset+"', 0, ?); " );
email s=new email();
        try {
            s.Email(String.valueOf(jTextField_E.getText()),String.valueOf(jTextField_Ad.getText()), String.valueOf(jTextField_Soyad.getText()), passset);
           System.exit(0); // TODO add your handling code here:
        } catch (MessagingException ex) {
            Logger.getLogger(Personel_Sayfasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Personel_Sayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personel_Sayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personel_Sayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personel_Sayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personel_Sayfasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Adrs;
    private javax.swing.JTextField jTextField_Ad;
    private javax.swing.JTextField jTextField_CT;
    private javax.swing.JTextField jTextField_Departman;
    private javax.swing.JTextField jTextField_E;
    private javax.swing.JTextField jTextField_Soyad;
    private javax.swing.JTextField jTextField_Tc;
    // End of variables declaration//GEN-END:variables
}
