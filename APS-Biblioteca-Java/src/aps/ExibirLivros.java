/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;
import biblioteca_eletronica.Livro;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yuri-
 */
public class ExibirLivros extends javax.swing.JFrame {

    /**
     * Creates new form ExibirLivros
     */
    public ExibirLivros() {
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

        jScrollPane18 = new javax.swing.JScrollPane();
        JTL = new javax.swing.JTable();
        btnexibir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtpesquisa = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnatualiza = new javax.swing.JButton();
        btnex = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txttitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtsub = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtisbn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcdd = new javax.swing.JTextField();
        txtedi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnomeautor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtserie = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtvol = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtestoque = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(870, 540));
        setPreferredSize(new java.awt.Dimension(870, 298));

        JTL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C??digo", "Titulo", "Subtitulo", "ISBN", "CDD", "Edi????o", "Autor", "Cod_Autor", "S??rie", "Volume", "Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTL.setOpaque(false);
        JTL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTLMouseClicked(evt);
            }
        });
        jScrollPane18.setViewportView(JTL);

        btnexibir.setText("Exibir");
        btnexibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexibirActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar:");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnatualiza.setText("Atualizar");
        btnatualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatualizaActionPerformed(evt);
            }
        });

        btnex.setText("Excluir");
        btnex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexActionPerformed(evt);
            }
        });

        jLabel2.setText("Titulo");

        jLabel3.setText("Subtitulo");

        jLabel4.setText("ISBN");

        jLabel5.setText("CDD");

        jLabel6.setText("Edi????o");

        jLabel7.setText("Autor");

        jLabel8.setText("Cod_Autor");

        jLabel9.setText("S??rie");

        jLabel10.setText("Volume");

        jLabel11.setText("Estoque");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Editar Cadastro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnexibir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnex, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttitle, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtisbn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(112, 112, 112)
                                                .addComponent(jLabel5))))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtnomeautor, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtserie, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtvol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(txtestoque, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtcdd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(txtedi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnatualiza)
                            .addComponent(jLabel12))
                        .addGap(0, 150, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnexibir)
                    .addComponent(btnex))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtisbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnomeautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtestoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnatualiza)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnexibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexibirActionPerformed
        DefaultTableModel dtmLivro = (DefaultTableModel) JTL.getModel();
        dtmLivro.getDataVector().clear();
        
        for (int i = 0; i < Livro.getLivros().size(); i ++){

        String cod_livro = Livro.getLivros().get(i).getStrCod_livro();
        String titulo = Livro.getLivros().get(i).getTitulo();
        String subtitulo = Livro.getLivros().get(i).getSubtitulo();
        String isbn = Livro.getLivros().get(i).getIsbn();
        String cdd = Livro.getLivros().get(i).getCdd();
        String edicao = Livro.getLivros().get(i).getEdicao();
        String nome_autor = Livro.getLivros().get(i).getNome_autor();
        String cod_autor = Livro.getLivros().get(i).getCod_autor();
        String serie = Livro.getLivros().get(i).getSerie();
        String volume = Livro.getLivros().get(i).getVolume();
        int estoque = Livro.getLivros().get(i).getEstoque();


        Object[] dados = {cod_livro, titulo, subtitulo, isbn, cdd, edicao,
        nome_autor, cod_autor, serie, volume, estoque};

        dtmLivro.addRow(dados);       
}
    }//GEN-LAST:event_btnexibirActionPerformed

    private void btnatualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizaActionPerformed
       
        if (JTL.getSelectedRow() != -1) {
        
            JTL.setValueAt(txttitle.getText(), JTL.getSelectedRow(), 1);
            JTL.setValueAt(txtsub.getText(), JTL.getSelectedRow(), 2);
            JTL.setValueAt(txtisbn.getText(), JTL.getSelectedRow(), 3);
            JTL.setValueAt(txtcdd.getText(), JTL.getSelectedRow(), 4);
            JTL.setValueAt(txtedi.getText(), JTL.getSelectedRow(), 5);
            JTL.setValueAt(txtnomeautor.getText(), JTL.getSelectedRow(), 6);
            JTL.setValueAt(txtcod.getText(), JTL.getSelectedRow(), 7);
            JTL.setValueAt(txtserie.getText(), JTL.getSelectedRow(), 8);
            JTL.setValueAt(txtvol.getText(), JTL.getSelectedRow(), 9);
            JTL.setValueAt(txtestoque.getText(), JTL.getSelectedRow(), 10);
        }
        
        Object obj = JTL.getValueAt(JTL.getSelectedRow(), 0);
        obj.toString();
        
        Livro.editar_livro(obj.toString(), txttitle.getText(), txtsub.getText(), txtisbn.getText(), txtcdd.getText(),
        txtedi.getText(), txtnomeautor.getText(), txtcod.getText(),
        txtserie.getText(), txtvol.getText(), Integer.parseInt(txtestoque.getText()));
            
    }//GEN-LAST:event_btnatualizaActionPerformed

    private void btnexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexActionPerformed
        
        txttitle.setText("");
        txtsub.setText("");
        txtisbn.setText("");
        txtcdd.setText("");
        txtedi.setText("");
        txtnomeautor.setText("");
        txtcod.setText("");
        txtserie.setText("");
        txtvol.setText("");
        txtestoque.setText("");
        
        Object obj = JTL.getValueAt(JTL.getSelectedRow(), 0);
        Livro.excluir_livro((String) obj);
        System.out.println(obj);
        if (JTL.getSelectedRow() != -1) {
        ((DefaultTableModel) JTL.getModel()).removeRow(JTL.getSelectedRow());
        JOptionPane.showMessageDialog(null, "Livro Excluido com sucesso!");
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Selecione um Livro para Excluir!");
        }
    }//GEN-LAST:event_btnexActionPerformed
        
    private void JTLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTLMouseClicked
   
        txttitle.setText(JTL.getValueAt(JTL.getSelectedRow(), 1).toString());
        txtsub.setText(JTL.getValueAt(JTL.getSelectedRow(), 2).toString());
        txtisbn.setText(JTL.getValueAt(JTL.getSelectedRow(), 3).toString());
        txtcdd.setText(JTL.getValueAt(JTL.getSelectedRow(), 4).toString());
        txtedi.setText(JTL.getValueAt(JTL.getSelectedRow(), 5).toString());
        txtnomeautor.setText(JTL.getValueAt(JTL.getSelectedRow(), 6).toString());
        txtcod.setText(JTL.getValueAt(JTL.getSelectedRow(), 7).toString());
        txtserie.setText(JTL.getValueAt(JTL.getSelectedRow(), 8).toString());
        txtvol.setText(JTL.getValueAt(JTL.getSelectedRow(), 9).toString());
        txtestoque.setText(JTL.getValueAt(JTL.getSelectedRow(), 10).toString());
        
    }//GEN-LAST:event_JTLMouseClicked

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
      
        DefaultTableModel dtmLivro = (DefaultTableModel) JTL.getModel();
        dtmLivro.getDataVector().clear();
        boolean existencia = true;
     
            for (int i = 0; i < Livro.getLivros().size(); i ++){
            if(txtpesquisa.getText().equals(Livro.getLivros().get(i).getStrCod_livro())) {               
            String cod_livro = Livro.getLivros().get(i).getStrCod_livro();
            String titulo = Livro.getLivros().get(i).getTitulo();
            String subtitulo = Livro.getLivros().get(i).getSubtitulo();
            String isbn = Livro.getLivros().get(i).getIsbn();
            String cdd = Livro.getLivros().get(i).getCdd();
            String cod_autor = Livro.getLivros().get(i).getCod_autor();
            String nome_autor = Livro.getLivros().get(i).getNome_autor();
            String edicao = Livro.getLivros().get(i).getEdicao();
            String serie = Livro.getLivros().get(i).getSerie();
            String volume = Livro.getLivros().get(i).getVolume();
            int estoque = Livro.getLivros().get(i).getEstoque();


            Object[] dados = {cod_livro, titulo, subtitulo, isbn, cdd, cod_autor, 
            nome_autor, edicao, serie, volume, estoque};
            dtmLivro.addRow(dados);
            existencia = true;
                
            break;
          }else{  
              existencia = false;
          }
            }
            if (existencia == false) {
            JOptionPane.showMessageDialog(null, "Cliente n??o encontrado!");  
        }              
    }//GEN-LAST:event_btnbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ExibirLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                new ExibirLivros().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTL;
    private javax.swing.JButton btnatualiza;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnex;
    private javax.swing.JButton btnexibir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtcdd;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtedi;
    private javax.swing.JTextField txtestoque;
    private javax.swing.JTextField txtisbn;
    private javax.swing.JTextField txtnomeautor;
    private javax.swing.JTextField txtpesquisa;
    private javax.swing.JTextField txtserie;
    private javax.swing.JTextField txtsub;
    private javax.swing.JTextField txttitle;
    private javax.swing.JTextField txtvol;
    // End of variables declaration//GEN-END:variables
}
