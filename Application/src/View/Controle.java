/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.pressao;
import model.dao.pressaoDAO;
import util.ArduinoSerial;

/**
 *
 * @author Letícia Gomes
 */
public class Controle extends javax.swing.JFrame {

    private final String porta = "COM3" ;
    
    ArduinoSerial arduino = new ArduinoSerial(porta);
    
    
    
    
    public Controle() {
        initComponents();
        arduino.initialize();
        Thread t = new Thread(){
            @Override
            public void run() {
                super.run(); //To change body of generated methods, choose Tools | Templates.
            
                while (true) {
                lbPressao.setText(arduino.read());
               
                   
                }
            }
            
        };
        
       t.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        lbPressao = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbPressao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPressao.setBorder(javax.swing.BorderFactory.createTitledBorder("Press Value"));

        jButton1.setText("Valvula 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "Válvula 1", "Válvula 2", "Válvula 3", "Válvula 4", "Válvula 5", "Válvula 6", "Válvula de Escape" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecionar Válvula:");

        jLabel4.setText("By @Letícia Gomes da Costa e Silva");

        jButton3.setText("Automatic");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbPressao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lbPressao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(13, 13, 13)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      pressao p =  new pressao();
      
      arduino.send("b");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);    
        }
        p.setValorpress(Float.parseFloat(arduino.read()));
        p.setAmostra("Amostra 2");
        lbPressao.setText(arduino.read());
        System.out.println(arduino.read());
        
        pressaoDAO dao = new pressaoDAO();
        
        if (dao.save(p)){      
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        }
       else{
        JOptionPane.showMessageDialog(null, "Erro ao salvar!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
         if (jComboBox1.getSelectedItem().equals("<Select>"))
        {
        JOptionPane.showMessageDialog(rootPane, "Selecione uma opção válida!");
        }
        
        if (jComboBox1.getSelectedItem().equals("Válvula 1") ){
    pressao p =  new pressao();
      
      arduino.send("a");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);    
        }
        p.setValorpress(Float.parseFloat(arduino.read()));
        p.setAmostra("Amostra 1");
        lbPressao.setText(arduino.read());
        System.out.println(arduino.read());
        
        pressaoDAO dao = new pressaoDAO();
        
        if (dao.save(p)){      
            
            System.out.println("Salvo com sucesso!");
            
        }
       else{
            System.out.println("Erro ao salvar!");
        }}
        
           if (jComboBox1.getSelectedItem().equals("Válvula 2") ){
    pressao p =  new pressao();
      
      arduino.send("b");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);    
        }
        p.setValorpress(Float.parseFloat(arduino.read()));
        p.setAmostra("Amostra 2");
        lbPressao.setText(arduino.read());
        System.out.println(arduino.read());
        
        pressaoDAO dao = new pressaoDAO();
        
        if (dao.save(p)){      
            
            System.out.println("Salvo com sucesso!");
            
        }
       else{
            System.out.println("Erro ao salvar!");
        }}
           
              if (jComboBox1.getSelectedItem().equals("Válvula 3") ){
    pressao p =  new pressao();
      
      arduino.send("c");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);    
        }
        p.setValorpress(Float.parseFloat(arduino.read()));
        p.setAmostra("Amostra 3");
        lbPressao.setText(arduino.read());
        System.out.println(arduino.read());
        
        pressaoDAO dao = new pressaoDAO();
        
        if (dao.save(p)){      
            
            System.out.println("Salvo com sucesso!");
            
        }
       else{
            System.out.println("Erro ao salvar!");
        }}
        
                 if (jComboBox1.getSelectedItem().equals("Válvula 4") ){
    pressao p =  new pressao();
      
      arduino.send("d");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);    
        }
        p.setValorpress(Float.parseFloat(arduino.read()));
        p.setAmostra("Amostra 4");
        lbPressao.setText(arduino.read());
        System.out.println(arduino.read());
        
        pressaoDAO dao = new pressaoDAO();
        
        if (dao.save(p)){      
            
            System.out.println("Salvo com sucesso!");
            
        }
       else{
            System.out.println("Erro ao salvar!");
        }}
                 
                    if (jComboBox1.getSelectedItem().equals("Válvula 5") ){
    pressao p =  new pressao();
      
      arduino.send("e");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);    
        }
        p.setValorpress(Float.parseFloat(arduino.read()));
        p.setAmostra("Amostra 5");
        lbPressao.setText(arduino.read());
        System.out.println(arduino.read());
        
        pressaoDAO dao = new pressaoDAO();
        
        if (dao.save(p)){      
            
            System.out.println("Salvo com sucesso!");
            
        }
       else{
            System.out.println("Erro ao salvar!");
        }}
                    
                       if (jComboBox1.getSelectedItem().equals("Válvula 6") ){
    pressao p =  new pressao();
      
      arduino.send("f");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);    
        }
        p.setValorpress(Float.parseFloat(arduino.read()));
        p.setAmostra("Amostra 6");
        lbPressao.setText(arduino.read());
        System.out.println(arduino.read());
        
        pressaoDAO dao = new pressaoDAO();
        
        if (dao.save(p)){      
            
            System.out.println("Salvo com sucesso!");
            
        }
       else{
            System.out.println("Erro ao salvar!");
        }}
            
     
     if (jComboBox1.getSelectedItem().equals("Válvula de Escape"))
        {
        arduino.send("z");
        JOptionPane.showMessageDialog(null, "Válvula de Escape de Pressão ACIONADA!");
        }
                       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      System.exit(0);    
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     Login log = new Login();
     log.setVisible(true); 
     dispose();     
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    
     About abt = new About();
     abt.setVisible(true); 
       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
    pressao p =  new pressao();

// Valvula 1      
      arduino.send("a");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);    
        }
        p.setValorpress(Float.parseFloat(arduino.read()));
        p.setAmostra("Amostra 1");
        lbPressao.setText(arduino.read());
        System.out.println(arduino.read());
        
        pressaoDAO dao = new pressaoDAO();
        
        if (dao.save(p)){      
            
            System.out.println("Salvo com sucesso!");
            
        }
       else{
            System.out.println("Erro ao salvar!");
        }
        
// Valvula 2
      arduino.send("b");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);    
        }
        p.setValorpress(Float.parseFloat(arduino.read()));
        p.setAmostra("Amostra 2");
        lbPressao.setText(arduino.read());
        System.out.println(arduino.read());
        
        if (dao.save(p)){      
            System.out.println("Salvo com sucesso!");  
        }
       else{
            System.out.println("Erro ao salvar!");
        }
           
      
      arduino.send("c");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);    
        }
        p.setValorpress(Float.parseFloat(arduino.read()));
        p.setAmostra("Amostra 3");
        lbPressao.setText(arduino.read());
        System.out.println(arduino.read());

        if (dao.save(p)){             
            System.out.println("Salvo com sucesso!");
        }
       else{
            System.out.println("Erro ao salvar!");
        }
        
// Valvula 4      
      arduino.send("d");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);    
        }
        p.setValorpress(Float.parseFloat(arduino.read()));
        p.setAmostra("Amostra 4");
        lbPressao.setText(arduino.read());
        System.out.println(arduino.read());
        
        
        
        if (dao.save(p)){      
            
            System.out.println("Salvo com sucesso!");
            
        }
       else{
            System.out.println("Erro ao salvar!");
        }
                 
          
// Valvula 5      
      arduino.send("e");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);    
        }
        p.setValorpress(Float.parseFloat(arduino.read()));
        p.setAmostra("Amostra 5");
        lbPressao.setText(arduino.read());
        System.out.println(arduino.read());

        if (dao.save(p)){      
            
            System.out.println("Salvo com sucesso!");    
        }
       else{
            System.out.println("Erro ao salvar!");
        }

 // Valvula 6       
      arduino.send("f");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);    
        }
        p.setValorpress(Float.parseFloat(arduino.read()));
        p.setAmostra("Amostra 6");
        lbPressao.setText(arduino.read());
        System.out.println(arduino.read());
  
        if (dao.save(p)){      
            
            System.out.println("Salvo com sucesso!"); 
        }
       else{
            System.out.println("Erro ao salvar!");
        }
            
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lbPressao;
    // End of variables declaration//GEN-END:variables
}
