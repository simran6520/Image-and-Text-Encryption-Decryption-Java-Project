/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageencrytion;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.JOptionPane;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Simran Bansal
 */
public class TextE extends javax.swing.JFrame {

    /**
     * Creates new form TestE
     */
    static Cipher cipher;
    KeyGenerator generator =null;
    SecretKey secKey;
    byte[] encVal;
    String encryptText;
    
    public TextE() {
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

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lb4 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        generate = new javax.swing.JButton();
        encryptbutton = new javax.swing.JButton();
        nextbutton = new javax.swing.JButton();
        homebutton = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        lb2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb2.setForeground(new java.awt.Color(0, 255, 255));
        lb2.setText("TEXT ENCRYPTION");
        jPanel1.add(lb2);
        lb2.setBounds(300, 20, 250, 28);

        lb3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 204, 0));
        lb3.setText("Enter Your Message:");
        jPanel1.add(lb3);
        lb3.setBounds(60, 110, 180, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(310, 80, 500, 90);

        lb4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 204, 0));
        lb4.setText("Enter Key:");
        jPanel1.add(lb4);
        lb4.setBounds(60, 220, 180, 40);
        jPanel1.add(tf1);
        tf1.setBounds(310, 220, 500, 40);

        lb5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 204, 0));
        lb5.setText("Encrypted Message:");
        jPanel1.add(lb5);
        lb5.setBounds(50, 310, 210, 60);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(310, 310, 500, 70);

        generate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        generate.setText("Generate Key");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        jPanel1.add(generate);
        generate.setBounds(40, 410, 210, 40);

        encryptbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        encryptbutton.setText("Encrypt");
        encryptbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(encryptbutton);
        encryptbutton.setBounds(320, 410, 140, 40);

        nextbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(nextbutton);
        nextbutton.setBounds(730, 400, 79, 50);

        homebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.PNG"))); // NOI18N
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(homebutton);
        homebutton.setBounds(760, 20, 60, 40);

        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/t2.jpg"))); // NOI18N
        lb1.setText("jLabel2");
        jPanel1.add(lb1);
        lb1.setBounds(0, 0, 900, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        Main1 m=new Main1();
        m.setVisible(true);
    }//GEN-LAST:event_homebuttonActionPerformed

    private void nextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttonActionPerformed
         TextD td=new TextD(encryptText,secKey);
         td.setVisible(true);
    }//GEN-LAST:event_nextbuttonActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
        try{
            generator=KeyGenerator.getInstance("AES");
            generator.init(128);          // AES key size in number of bits
            
            secKey = generator.generateKey();
            String secKey1=secKey.toString();
            String [] key=secKey1.split("@");
            String aeskey=key[1];
            JOptionPane.showMessageDialog(null,"Random Key Generated");
            tf1.setText(aeskey);
          
        }
        catch(Exception ex)
                {
                    ex.printStackTrace();
                }
        
        
    }//GEN-LAST:event_generateActionPerformed

    private void encryptbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptbuttonActionPerformed
        // TODO add your handling code here:
        try
        {
           String Data=jTextArea1.getText();
           cipher=Cipher.getInstance("AES");
           cipher.init(Cipher.ENCRYPT_MODE, secKey);
           encVal=cipher.doFinal(Data.getBytes());
           encryptText=new BASE64Encoder().encode(encVal);
            System.out.println("the encrypted Text  "+encryptText);
            jTextArea2.append(encryptText);
                   
        }
        catch(Exception e)
                {
                    e.printStackTrace();
                }
    }//GEN-LAST:event_encryptbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(TextE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton encryptbutton;
    private javax.swing.JButton generate;
    private javax.swing.JButton homebutton;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JButton nextbutton;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}