/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri_tabani_depo;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author numan
 */
public class Taksit_Ekrani extends javax.swing.JFrame {
   
java.util.ArrayList<String>Satis_Islemlerinden_GelenDizi,Bos_Dizi  = new java.util.ArrayList<>();
java.util.ArrayList<String>Dizi  = new java.util.ArrayList<>();
java.util.ArrayList<String>bos  = new java.util.ArrayList<>();
    /**
     * Creates new form Taksit_Ekrani
     */
    double hesapla ;
    public Taksit_Ekrani() {
        initComponents();
        this.setBounds(935, 355, 410, 350);
        this.setTitle("Taksitlendirme Ekrani");
        jButton1.setVisible(false);
         jButton2.setVisible(false);
    }
public void Satis_Ekranindan_Gelen_Dizi(ArrayList<String>Dizi1,ArrayList<String>Dizi2){
    Satis_Islemlerinden_GelenDizi=Dizi1;
    Dizi=Dizi2;
 
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel_Borc_Miktari = new javax.swing.JLabel();
        jTextField_Pesinat = new javax.swing.JTextField();
        TaksitSayisi_Text = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 51, 0));
        jLabel2.setText("Borç Tutari");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 50, 100, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 0));
        jLabel3.setText("Peşinat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 100, 30);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 51, 0));
        jLabel4.setText("Taksit Sayisi");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 150, 100, 30);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Aylık Ödeme Tutari");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 200, 180, 20);

        jButton1.setBackground(new java.awt.Color(153, 51, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Hesapla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 270, 230, 29);

        jButton2.setBackground(new java.awt.Color(153, 51, 0));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Taksitlendir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 270, 130, 25);

        jLabel_Borc_Miktari.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel_Borc_Miktari.setForeground(new java.awt.Color(153, 51, 0));
        getContentPane().add(jLabel_Borc_Miktari);
        jLabel_Borc_Miktari.setBounds(170, 50, 90, 30);

        jTextField_Pesinat.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jTextField_Pesinat.setForeground(new java.awt.Color(153, 51, 0));
        getContentPane().add(jTextField_Pesinat);
        jTextField_Pesinat.setBounds(170, 100, 140, 31);

        TaksitSayisi_Text.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        TaksitSayisi_Text.setForeground(new java.awt.Color(153, 51, 0));
        TaksitSayisi_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TaksitSayisi_TextKeyReleased(evt);
            }
        });
        getContentPane().add(TaksitSayisi_Text);
        TaksitSayisi_Text.setBounds(170, 150, 140, 26);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 51, 0));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 190, 150, 30);

        jButton3.setBackground(new java.awt.Color(153, 51, 0));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Bilgileri Getir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 10, 230, 29);

        jButton4.setBackground(new java.awt.Color(153, 51, 0));
        jButton4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cıkış");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(270, 10, 130, 29);

        Background.setBackground(new java.awt.Color(204, 204, 255));
        Background.setIcon(new javax.swing.ImageIcon("C:\\Users\\numan.DESKTOP-BO05F21\\Documents\\NetBeansProjects\\Veri_Tabani_Depo\\İmage\\Beyaz.jpg")); // NOI18N
        Background.setOpaque(true);
        getContentPane().add(Background);
        Background.setBounds(0, 0, 410, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  jLabel_Borc_Miktari.setText(Satis_Islemlerinden_GelenDizi.get(0));
 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 String VeriTabaninaAciklama=String.valueOf(Satis_Islemlerinden_GelenDizi.get(1))+"  Kilo   " +""+Satis_Islemlerinden_GelenDizi.get(3)+"  Alınmıştır";
  Veri_Ekleme veri_Ekleme = new Veri_Ekleme();
 Veri_Cekme veri_Cekme =new Veri_Cekme();
 
 
          Veri_Silme vs = new Veri_Silme();
        try {
         ArrayList<String>kasa=new ArrayList<>();
    
      kasa.add(VeriTabaninaAciklama);
      kasa.add(String.valueOf(Satis_Islemlerinden_GelenDizi.get(0)));
      kasa.add(String.valueOf(Satis_Islemlerinden_GelenDizi.get(2)));
      
       
  veri_Ekleme.kaydet(kasa, "INSERT kasa ( `Gelir-Giden`, Acıklama, Toplam_Para, musterino, Turu) VALUES ( 1, ?,? ,?, '1')");
 veri_Cekme.Veri_Cekme("SELECT LAST_INSERT_ID(Kasa_id) ss FROM otomasyon.kasa");
 int esv=Integer.valueOf( veri_Cekme.getRow().get(veri_Cekme.getRow().size()-1));
  ArrayList<String>satistaksit=new ArrayList<>();
   
  
  veri_Ekleme.kaydet(bos, "INSERT INTO satıs_taksit ( Taksit_Tutari, Kasa_id, Toplam_Taksit, Kacinci_Taksit, Pesinat) VALUES (85,"+esv+","+TaksitSayisi_Text.getText()+", 0,"+jTextField_Pesinat.getText()+")");
 veri_Cekme.Veri_Cekme("SELECT LAST_INSERT_ID(ml.Aldigi_Urun_Miktari) ss FROM musteri_listesi ml WHERE ml.musterino="+Satis_Islemlerinden_GelenDizi.get(2)+"");
 int a1=Integer.valueOf( veri_Cekme.getRow().get(veri_Cekme.getRow().size()-1));
  veri_Ekleme.kaydet(bos, "UPDATE musteri_listesi set Aldigi_Urun_Miktari = "+(Satis_Islemlerinden_GelenDizi.get(2)+a1)+" WHERE musterino ="+Satis_Islemlerinden_GelenDizi.get(2)+" ");

  vs.islemler("DELETE FROM urunler1 WHERE Barkod_No=?", Dizi);
  // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(satisislemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
hesapla=Double.valueOf( jLabel_Borc_Miktari.getText())/Double.valueOf( TaksitSayisi_Text.getText());
   jButton2.setVisible(true);
   jLabel7.setText(""+hesapla);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TaksitSayisi_TextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TaksitSayisi_TextKeyReleased
jButton1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_TaksitSayisi_TextKeyReleased

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
            java.util.logging.Logger.getLogger(Taksit_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Taksit_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Taksit_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Taksit_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Taksit_Ekrani().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField TaksitSayisi_Text;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Borc_Miktari;
    private javax.swing.JTextField jTextField_Pesinat;
    // End of variables declaration//GEN-END:variables
}
