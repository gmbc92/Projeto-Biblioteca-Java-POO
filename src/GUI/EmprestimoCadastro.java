/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BancoDeDados.Emprestimo;
import BancoDeDados.Emprestimo_Livro;
import Negocio.NegocioEmprestimo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Frank 2.0 Ultimate
 */
public class EmprestimoCadastro extends javax.swing.JFrame {
    
    ArrayList<Emprestimo_Livro> listadelivros = new ArrayList<>();

    /**
     * Creates new form AlunoCadastrar
     */
    public EmprestimoCadastro() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldmatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodFun = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDataEmp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDataDev = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaList = new javax.swing.JTable();
        jButtonCadastrarEmp = new javax.swing.JButton();
        jButtonListarEmp = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCodEmp = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableListadeLivros = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldLivro = new javax.swing.JTextField();
        jButtonInserirLivro = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Matricula");

        jLabel2.setText("Código Funcionário");

        jLabel5.setText("Data do Empréstimo");

        jLabel6.setText("Data da Devolução");

        jTableTabelaList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo Emprestimo", "Cod_Func", "Data_Emprestimo", "Data_Devolução", "Matricula"
            }
        ));
        jScrollPane1.setViewportView(jTableTabelaList);

        jButtonCadastrarEmp.setText("Cadastrar");
        jButtonCadastrarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarEmpActionPerformed(evt);
            }
        });

        jButtonListarEmp.setText("Listar");
        jButtonListarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarEmpActionPerformed(evt);
            }
        });

        jLabel7.setText("Codigo Emprestimo");

        jTableListadeLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Livro", "Quantidade"
            }
        ));
        jScrollPane3.setViewportView(jTableListadeLivros);

        jLabel3.setText("Quantidade");

        jLabel4.setText("Livro");

        jButtonInserirLivro.setText("Inserir Livro");
        jButtonInserirLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirLivroActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Livro", "Quantidade"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldCodEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(23, 23, 23)
                                    .addComponent(jTextFieldCodFun, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextFieldmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldQuantidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addComponent(jButtonInserirLivro)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jButtonCadastrarEmp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonListarEmp)
                                .addGap(460, 460, 460))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldDataDev)
                                            .addComponent(jTextFieldDataEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 12, Short.MAX_VALUE)))
                        .addContainerGap(15, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonInserirLivro)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextFieldLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldCodEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCodFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldDataEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTextFieldDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListarEmp)
                    .addComponent(jButtonCadastrarEmp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarEmpActionPerformed

        Emprestimo emprestimo = new Emprestimo();
        NegocioEmprestimo negocio = new NegocioEmprestimo();

        try {
            emprestimo.setcodigo_Emprestimo(jTextFieldCodEmp.getText());
            emprestimo.getFuncionario().setCod_Funcionario(jTextFieldCodFun.getText());
            emprestimo.setData_Do_Emprestimo(jTextFieldDataEmp.getText());
            emprestimo.setData_da_Devolucao(jTextFieldDataDev.getText());
            emprestimo.getAluno().setMatricula(jTextFieldmatricula.getText());
            emprestimo.setLivro(listadelivros);
            negocio.createEmprestimo(emprestimo);
            listadelivros.removeAll(listadelivros);
            jTableListadeLivros.removeAll();
            JOptionPane.showMessageDialog(null, "Emprestimo cadastrado com sucesso GUI");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Emprestimo, gui");
        }
        
    }//GEN-LAST:event_jButtonCadastrarEmpActionPerformed

    private void jButtonListarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarEmpActionPerformed

        Emprestimo emprestimo = new Emprestimo();
        NegocioEmprestimo negocio = new NegocioEmprestimo();

        try {

            ArrayList<Emprestimo> list = negocio.select();
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"Cod_Emprestimo", "Cod_funcionario", "Data_do_Emprestimo", "Data_da_Devolução", "Matricula"});
            for (Emprestimo x : list) {
                model.addRow(new Object[]{x.getcodigo_Emprestimo(), x.getFuncionario().getCod_Funcionario(), x.getData_Do_Emprestimo(), x.getData_da_Devolucao(), x.getAluno().getMatricula()});
            }
            jTableTabelaList.setModel(model);
            
            /*ArrayList<Emprestimo_Livro> lista = negocio.select();
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"Cod_Emprestimo", "Cod_funcionario", "Data_do_Emprestimo", "Data_da_Devolução", "Matricula"});
            for (Emprestimo x : list) {
                model.addRow(new Object[]{x.getcodigo_Emprestimo(), x.getFuncionario().getCod_Funcionario(), x.getData_Do_Emprestimo(), x.getData_da_Devolucao(), x.getAluno().getMatricula()});
            }
            jTableTabelaList.setModel(model);*/
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro no botao listar ao completar a Jtable");
        }
    }//GEN-LAST:event_jButtonListarEmpActionPerformed

    private void jButtonInserirLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirLivroActionPerformed
        try {
            Emprestimo_Livro livro = new Emprestimo_Livro();
            DefaultTableModel model = new DefaultTableModel();
            livro.getLivro().setCod_livro(jTextFieldLivro.getText());
            livro.setQuantidade(Integer.parseInt(jTextFieldQuantidade.getText()));
            listadelivros.add(livro);
            model.setColumnIdentifiers(new Object[]{"Livro", "Quantidade"});
            for (Emprestimo_Livro x : listadelivros) {
                model.addRow(new Object[]{x.getLivro().getCod_livro(), x.getQuantidade()});
            }

            jTableListadeLivros.setModel(model);
            JOptionPane.showMessageDialog(null, "Livro cadastrado na GUI");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema ao inserir o Livro na GUI");
        }

    }//GEN-LAST:event_jButtonInserirLivroActionPerformed

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
            java.util.logging.Logger.getLogger(EmprestimoCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmprestimoCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmprestimoCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmprestimoCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmprestimoCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarEmp;
    private javax.swing.JButton jButtonInserirLivro;
    private javax.swing.JButton jButtonListarEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableListadeLivros;
    private javax.swing.JTable jTableTabelaList;
    private javax.swing.JTextField jTextFieldCodEmp;
    private javax.swing.JTextField jTextFieldCodFun;
    private javax.swing.JTextField jTextFieldDataDev;
    private javax.swing.JTextField jTextFieldDataEmp;
    private javax.swing.JTextField jTextFieldLivro;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldmatricula;
    // End of variables declaration//GEN-END:variables
}
