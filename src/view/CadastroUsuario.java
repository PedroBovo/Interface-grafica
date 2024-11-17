/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Usuarios.Usuario;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 */
public class CadastroUsuario extends javax.swing.JInternalFrame {
       ArrayList<Usuario> usuarios = new ArrayList();
       Usuario usuario = new Usuario();
       private int editIndex = -1;
    /**
     * Creates new form CadastroUsuario
     */
    public CadastroUsuario() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btMostrarInfo = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        cbSexo = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();

        jLabel1.setText("CPF");

        jLabel2.setText("Usuario");

        jLabel3.setText("Senha");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel4.setText("Idade");

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        txtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Idade", "CPF", "Sexo", "Cargo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btMostrarInfo.setText("Mostrar todos");
        btMostrarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarInfoActionPerformed(evt);
            }
        });

        btAlterar.setText("Modificar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btDeletar.setText("Deletar");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));

        jLabel5.setText("Sexo");

        jLabel6.setText("Cargo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSenha)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btMostrarInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtUsuario)
                    .addComponent(txtIdade)
                    .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btMostrarInfo)
                            .addComponent(btAlterar)
                            .addComponent(btDeletar))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
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
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        txtUsuario.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        txtIdade.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        txtCpf.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        txtCargo.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        txtSenha.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        boolean hasError = false;

        if (txtUsuario.getText().trim().isEmpty()) {
            txtUsuario.setBorder(BorderFactory.createLineBorder(Color.RED));
            hasError = true;
        }
        if (txtIdade.getText().trim().isEmpty()) {
            txtIdade.setBorder(BorderFactory.createLineBorder(Color.RED));
            hasError = true;
        } else {
            try {

                Integer.parseInt(txtIdade.getText().trim());
            } catch (NumberFormatException e) {
                txtIdade.setBorder(BorderFactory.createLineBorder(Color.RED));
                hasError = true;
            }
        }
        if (txtCpf.getText().trim().isEmpty()) {
            txtCpf.setBorder(BorderFactory.createLineBorder(Color.RED));
            hasError = true;
        }
        if (txtCargo.getText().trim().isEmpty()) {
            txtCargo.setBorder(BorderFactory.createLineBorder(Color.RED));
            hasError = true;
        }
        if (new String(txtSenha.getPassword()).isEmpty()) {
            txtSenha.setBorder(BorderFactory.createLineBorder(Color.RED));
            hasError = true;
        }

        if (hasError) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos corretamente para cadastrar o usuário.");
            return;
        }

        try {

            int idade = Integer.parseInt(txtIdade.getText().trim());

            String usuarioNome = txtUsuario.getText().trim();
            String cpf = txtCpf.getText().trim();
            String senha = new String(txtSenha.getPassword());
            String cargo = txtCargo.getText().trim();
            String sexo = cbSexo.getSelectedItem().toString();

            if (editIndex == -1) {
                // Novo cadastro
                Usuario usuario = new Usuario(usuarioNome, idade, cpf, sexo,cargo, senha);
                usuarios.add(usuario);

                // Atualiza a tabela
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.addRow(new Object[]{usuarioNome, idade, cpf, sexo, cargo});
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            } else {
                // Alteração de cadastro
                Usuario usuario = usuarios.get(editIndex);
                usuario.setNome(usuarioNome);
                usuario.setIdade(idade);
                usuario.setCpf(cpf);
                usuario.setSexo(sexo);
                usuario.setCargo(cargo);
                usuario.setSenha(senha);

                // Atualiza a tabela
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setValueAt(usuarioNome, editIndex, 0);
                model.setValueAt(idade, editIndex, 1);
                model.setValueAt(cpf, editIndex, 2);
                model.setValueAt(sexo, editIndex, 3);
                model.setValueAt(cargo, editIndex, 4);

                JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!");
                editIndex = -1; // Reseta o índice após edição.
            }

            // Limpa os campos
            txtUsuario.setText("");
            txtIdade.setText("");
            txtCpf.setText("");
            txtCargo.setText("");
            txtSenha.setText("");

            txtUsuario.setText("");
            txtIdade.setText("");
            txtCpf.setText("");
            txtCargo.setText("");
            txtSenha.setText("");

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Por favor, insira uma idade válida.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeActionPerformed

    private void btMostrarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarInfoActionPerformed
        for (Usuario usuario:usuarios){
            JOptionPane.showMessageDialog(null, "nome: " + usuario.getNome()+"\nIdade: " + usuario.getIdade()+"\n Cpf: " + usuario.getCpf());

        }
    }//GEN-LAST:event_btMostrarInfoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            int index = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o índice que deseja alterar:"));

            if (index >= 0 && index < usuarios.size()) {
                Usuario usuario = usuarios.get(index);
                txtUsuario.setText(usuario.getNome());
                txtIdade.setText(String.valueOf(usuario.getIdade()));
                txtCpf.setText(usuario.getCpf());
                cbSexo.setSelectedItem(usuario.getSexo());
                txtCargo.setText(usuario.getCargo());
                txtSenha.setText(usuario.getSenha());

                editIndex = index; // Armazena o índice para edição.
            } else {
                JOptionPane.showMessageDialog(null, "Índice inválido! Tente novamente.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
        }

    }//GEN-LAST:event_btAlterarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        int index = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o index que quer deletar"));
        usuarios.remove(index);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.removeRow(index);

    }//GEN-LAST:event_btDeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btMostrarInfo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
