/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri_tabani_depo;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author numan
 */
public class Urun_Gruplari extends javax.swing.JFrame {
PreparedStatement psmt=null;
Statement statement;
 ResultSet       result;
Veri_Cekme cekme=new Veri_Cekme();
 DefaultTableModel table;
int Silinecek_id;
   Veri_Cekme cekme2=new Veri_Cekme();
     java.util.ArrayList<String> bos = new java.util.ArrayList<>();
    /**
     * Creates new form Urun_Gruplari
     */
    public Urun_Gruplari() {
        initComponents();
           this.setBounds(960, 100, 340, 580);
this.setResizable(false);
          setLocationRelativeTo(null);
        this.setTitle("Urun Gruplari ");
        /*        Urun_Gruplari_Ekleme_Panel ekleme_Panel=new Urun_Gruplari_Ekleme_Panel();
      getContentPane().setLayout(null);
    this.add(ekleme_Panel);
          ekleme_Panel.setBounds(220, 120, 220, 220);
        add(ekleme_Panel);
        
        ekleme_Panel.setVisible(true);*/
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        label1 = new java.awt.Label();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel1.setText("Secilen Ürun Grubu");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 71, 140, 20);

        jButton1.setBackground(new java.awt.Color(153, 51, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Secilen Grubu Sil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 109, 155, 29);

        jButton2.setBackground(new java.awt.Color(153, 51, 0));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Yeni Ürun Grubu Ekle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(162, 109, 167, 29);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 51, 0));
        jLabel2.setText(" <<Ürün Grubun Adi>>");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 160, 210, 25);

        jButton3.setBackground(new java.awt.Color(153, 51, 0));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Göster");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 0, 250, 29);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(13, 181, 290, 350);

        label1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        getContentPane().add(label1);
        label1.setBounds(140, 70, 175, 20);

        jButton4.setBackground(new java.awt.Color(153, 51, 0));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\numan.DESKTOP-BO05F21\\Documents\\NetBeansProjects\\Veri_Tabani_Depo\\exit.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(250, 0, 70, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\numan.DESKTOP-BO05F21\\Documents\\NetBeansProjects\\Veri_Tabani_Depo\\İmage\\Beyaz.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 320, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String asd=label1.getText();
        Veri_Silme veri_Silme=new Veri_Silme();
    try {
        veri_Silme.islemler("ALTER TABLE kumas_cinsleri DROP COLUMN "+label1.getText()+"",bos);
    } catch (Exception ex) {
        Logger.getLogger(Urun_Gruplari.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
table=new DefaultTableModel(){

        public boolean isCellEditable(int row, int col) {
                    return false;
                }
}; 
     try { 
    
   
       ArrayList<String>numan=cekme2.Veri_Cekme("SELECT column_name from information_schema.COLUMNS c WHERE c.TABLE_NAME='kumas_cinsleri'" );
    } catch (SQLException ex) {
        Logger.getLogger(Stoklar.class.getName()).log(Level.SEVERE, null, ex);
    }
int a=cekme2.getColumnCount(); 
Object[] aa=new Object[a];
      int j=1;    
try {
               for (int i = 1; i <= a; i++) {
                    table.addColumn(cekme2.dizi[i-1]);
               }
               int asd=cekme2.getRow().size();
               int i;
               for (i=1; i < cekme2.getRow().size()+1; i++) {
              if (i%a==0) {  table.addRow(aa); 
                         aa[j-1]=cekme2.row.get(i-1);
                j=1;   }
                   else{
                  aa[j-1]=cekme2.row.get(i-1);
                             j++; 
                   }
            //  aa[i+1]=cekme2.row.get(cekme2.getRow().size());
               } jTable2.setModel(table);
           }
    catch (Exception ex) {
      
    }  
 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
  
       ArrayList<String>numan = null;
    try {
        numan = cekme.Veri_Cekme("SELECT column_name from information_schema.COLUMNS c WHERE c.TABLE_NAME='kumas_cinsleri'" );
    } catch (SQLException ex) {
        Logger.getLogger(Urun_Gruplari.class.getName()).log(Level.SEVERE, null, ex);
    }
label1.setText("");

 JTable target = (JTable)evt.getSource();
        int row = target.getSelectedRow();
        int column =0;
        label1.setText(numan.get(row-1));









        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     Urun_Gruplari_Ekleme urun_Gruplari_Ekleme=new Urun_Gruplari_Ekleme();
     urun_Gruplari_Ekleme.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Urun_Gruplari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Urun_Gruplari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Urun_Gruplari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Urun_Gruplari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Urun_Gruplari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
