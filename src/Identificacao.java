
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jarci
 */
public class Identificacao extends javax.swing.JDialog {

    public static String cpfPaciente;
    public static String especialidadeEscolhida;
    
    public Identificacao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selecionarEspecialidade = new javax.swing.JComboBox();
        selecionarDia = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pross = new javax.swing.JButton();
        campoIdentificacao = new javax.swing.JFormattedTextField();
        selecionarEspeci = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        selecDia = new javax.swing.JComboBox();
        selecionarTur = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        selecionarEspecialidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione uma especialidade", "Cardiologia", "Clínica Médica", "Dermatologia", "Ginecologia", "Neurologia", "Oftalmologia", "Ortopedia", "Pediatria", "Psiquiatria", "Urologia" }));

        selecionarDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um dia", "Segunda-Feira - 02/12", "Terça-Feira - 03/12", "Quarta-Feira - 04/12", "Quinta-Feira - 05/12", "Sexta-Feira - 06/12" }));
        selecionarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarDiaActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MARCAÇÃO DE CONSULTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(137, 137, 137))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel2.setText("DIGITE O CPF DO PACIENTE:");

        pross.setBackground(new java.awt.Color(153, 255, 153));
        pross.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pross.setText("PROSSEGUIR");
        pross.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prossActionPerformed(evt);
            }
        });

        try {
            campoIdentificacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoIdentificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdentificacaoActionPerformed(evt);
            }
        });

        selecionarEspeci.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione uma especialidade", "Cardiologia", "Clínica Médica", "Dermatologia", "Ginecologia", "Neurologia", "Oftalmologia", "Ortopedia", "Pediatria", "Psiquiatria", "Urologia" }));

        jLabel3.setText("ESPECIALIDADE:");

        selecDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um dia", "Segunda-Feira - 02/12", "Terça-Feira - 03/12", "Quarta-Feira - 04/12", "Quinta-Feira - 05/12", "Sexta-Feira - 06/12" }));
        selecDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecDiaActionPerformed(evt);
            }
        });

        selecionarTur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um turno", "Matutino", "Vespertino" }));
        selecionarTur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarTurActionPerformed(evt);
            }
        });

        jLabel4.setText("INFORME O DIA:");

        jLabel5.setText("INFORME O TURNO:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pross))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(campoIdentificacao)
                            .addComponent(selecDia, 0, 170, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(74, 74, 74))
                                .addComponent(selecionarTur, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selecionarEspeci, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionarEspeci, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecionarTur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(pross)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void prossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prossActionPerformed
        cpfPaciente = campoIdentificacao.getText();
        especialidadeEscolhida = selecionarEspeci.getSelectedItem().toString();
        
        
        if (TelaLogin.CPFs.contains(cpfPaciente) == true && TelaLogin.especialidadeMedico.contains(selecionarEspeci.getSelectedItem()) == true) {
            selecionarMedico m = new selecionarMedico(null, false);
            m.setVisible(true);
        } else if (TelaLogin.CPFs.contains(cpfPaciente) == false){
            JOptionPane.showMessageDialog(rootPane, "O CPF digitado não está cadastrado!");
        } else if (TelaLogin.especialidadeMedico.contains(selecionarEspeci.getSelectedItem()) == false) {
            JOptionPane.showMessageDialog(rootPane, "Não existe médico cadastrado nesta especialidade!");
        }
        
        
    }//GEN-LAST:event_prossActionPerformed

    private void campoIdentificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdentificacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdentificacaoActionPerformed

    private void selecionarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecionarDiaActionPerformed

    private void selecDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecDiaActionPerformed

    private void selecionarTurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarTurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecionarTurActionPerformed

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
            java.util.logging.Logger.getLogger(Identificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Identificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Identificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Identificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Identificacao dialog = new Identificacao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField campoIdentificacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pross;
    private javax.swing.JComboBox selecDia;
    private javax.swing.JComboBox selecionarDia;
    private javax.swing.JComboBox selecionarEspeci;
    private javax.swing.JComboBox selecionarEspecialidade;
    private javax.swing.JComboBox selecionarTur;
    // End of variables declaration//GEN-END:variables
}
