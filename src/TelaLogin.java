/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    //"Banco de dados" - PACIENTE
    public static ArrayList<String> CPFs;
    public static ArrayList<String> senhaPaciente;
    public static ArrayList<String> nomePaciente;

    //"Banco de dados" - ADMINISTRADOR
    public static ArrayList<String> usuarioAdm;
    public static ArrayList<String> nomeAdm;
    public static ArrayList<String> senhaAdm;

    //"Banco de dados" - MÉDICO
    public static ArrayList<String> loginMedico;
    public static ArrayList<String> nomeMedico;
    public static ArrayList<String> senhaMedico;
    public static ArrayList<String> especialidadeMedico;
    
    public static ArrayList<String> cpf;
    public static ArrayList<String> esp;
    public static ArrayList<String> tur;
    public static ArrayList<String> dia;

    public TelaLogin() {
        initComponents();
        campoUsuarioCPF.setVisible(false);
        textoCPF.setVisible(false);
        
        cpf = new ArrayList<>();
        esp = new ArrayList<>();
        tur = new ArrayList<>();
        dia = new ArrayList<>(); 
        
        CPFs = new ArrayList<>();
        senhaPaciente = new ArrayList<>();
        nomePaciente = new ArrayList<>();
        usuarioAdm = new ArrayList<>();
        nomeAdm = new ArrayList<>();
        senhaAdm = new ArrayList<>();
        loginMedico = new ArrayList<>();
        nomeMedico = new ArrayList<>();
        senhaMedico = new ArrayList<>();
        especialidadeMedico = new ArrayList<>();

        //CADASTRO PRÉVIO DO ADMINISTRADOR:
        usuarioAdm.add("admin");
        senhaAdm.add("admin");
        nomeAdm.add("Fulano da Silva");
        usuarioAdm.add("admin2");
        senhaAdm.add("admin2");
        nomeAdm.add("Cicrano de Souza");

    }

    public static void addCPF(String x) {
        CPFs.add(x);
    }

    public static void addSenhaPaciente(String y) {
        senhaPaciente.add(y);
    }

    public static void addNomePaciente(String z) {
        nomePaciente.add(z);
    }

    public static void addNomeMedico(String a){
        nomeMedico.add(a);
    }
    
    public static void addLoginMedico(String b){
        loginMedico.add(b);
    }
    
    public static void addSenhaMedico(String c){
        senhaMedico.add(c);
    }
    
    public static void addEspecialidade(String d){
        especialidadeMedico.add(d);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        entrarComo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        botaoEntrar = new javax.swing.JButton();
        checarSenha = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        campoUsuarioCPF = new javax.swing.JFormattedTextField();
        textoCPF = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jButton1.setText("print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrar");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        textoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoUsuario.setText("Usuário:");
        textoUsuario.setToolTipText("");

        campoSenha.setPreferredSize(new java.awt.Dimension(334, 20));
        campoSenha.setVerifyInputWhenFocusTarget(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Senha:");

        entrarComo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        entrarComo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Paciente", "Médico" }));
        entrarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarComoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Entrar como:");

        botaoEntrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoEntrar.setText("Entrar");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        checarSenha.setBackground(new java.awt.Color(255, 255, 255));
        checarSenha.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        checarSenha.setText("Visualizar senha");
        checarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checarSenhaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));

        jPanel6.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        try {
            campoUsuarioCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoUsuarioCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioCPFActionPerformed(evt);
            }
        });

        textoCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoCPF.setText("CPF:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textoCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoUsuarioCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(checarSenha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoEntrar))
                                    .addComponent(campoUsuario)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(entrarComo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(campoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(109, 109, 109))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrarComo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoUsuarioCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoEntrar)
                    .addComponent(checarSenha))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        
        if(entrarComo.getSelectedItem().toString().equals("Paciente") && CPFs.contains(campoUsuarioCPF.getText())==true){
            cpf.add(campoUsuarioCPF.getText());
        }
        
        int x = 0;
        String s = new String(campoSenha.getPassword());
        if (entrarComo.getSelectedItem().equals("Administrador")) {
            for (int i = 0; i < usuarioAdm.size(); i++) {
                if (campoUsuario.getText().equals(usuarioAdm.get(i)) && s.equals(senhaAdm.get(i))) {
                    admin a = new admin(this, false);
                    a.setVisible(true);
                    campoUsuario.setText("");
                    campoSenha.setText("");
                    x = -1;
                }
            }
        } else if (entrarComo.getSelectedItem().equals("Paciente")) {
            for (int i = 0; i < CPFs.size(); i++) {
                if (campoUsuarioCPF.getText().equals(CPFs.get(i)) && s.equals(senhaPaciente.get(i))) {
                    paciente p = new paciente(this, false);
                    p.setVisible(true);
                    campoUsuarioCPF.setText("");
                    campoSenha.setText("");
                    x = -1;
                }
            }
        } else if (entrarComo.getSelectedItem().equals("Médico")) {
            for (int i = 0; i < loginMedico.size(); i++) {
                if (campoUsuario.getText().equals(loginMedico.get(i)) && s.equals(senhaMedico.get(i))) {
                    interfaceMedico m = new interfaceMedico(this, false);
                    m.setVisible(true);
                    campoUsuario.setText("");
                    campoSenha.setText("");
                    x = -1;
                }
            }
        }
        if (x == 0) {
            campoUsuario.setText("");
            campoUsuarioCPF.setText("");
            campoSenha.setText("");
            JOptionPane.showMessageDialog(this, "Login ou senha incorretos!");
        }
        
        

    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void entrarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarComoActionPerformed
        if (entrarComo.getSelectedItem().toString() == ("Administrador")) {
            campoUsuario.setVisible(true);
            campoUsuarioCPF.setVisible(false);
            textoCPF.setVisible(false);
            textoUsuario.setVisible(true);
            textoUsuario.setText("Usuário:");
        } else if (entrarComo.getSelectedItem().toString() == ("Paciente")) {
            campoUsuario.setVisible(false);
            campoUsuarioCPF.setVisible(true);
            textoUsuario.setVisible(false);
            textoCPF.setVisible(true);
        } else {
            campoUsuario.setVisible(true);
            campoUsuarioCPF.setVisible(false);
            textoUsuario.setVisible(true);
            textoCPF.setVisible(false);
            textoUsuario.setText("Login:");
        }
    }//GEN-LAST:event_entrarComoActionPerformed

    private void checarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checarSenhaActionPerformed
        if (checarSenha.isSelected()) {
            campoSenha.setEchoChar((char) 0);
        } else {
            campoSenha.setEchoChar('•');
        }
    }//GEN-LAST:event_checarSenhaActionPerformed

    private void campoUsuarioCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioCPFActionPerformed

    }//GEN-LAST:event_campoUsuarioCPFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JFormattedTextField campoUsuarioCPF;
    private javax.swing.JCheckBox checarSenha;
    private javax.swing.JComboBox entrarComo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel textoCPF;
    private javax.swing.JLabel textoUsuario;
    // End of variables declaration//GEN-END:variables
}
