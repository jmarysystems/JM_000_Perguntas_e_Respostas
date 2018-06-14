/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jmary.home.menu_e_submenu;

import br.com.jmary.home.Home;
import br.com.jmary.utilidades.Exportando;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import leitura_e_aprendizagem.Leitura_e_Aprendizagem_Assunto_Consultar_EXE;
import leitura_e_aprendizagem.Tela_de_Dialogo_Leitura_e_Aprendizagem_Materia;

/**
 *
 * @author ana
 */
public class Submenu_1_JM_Perguntas_e_Respostas extends javax.swing.JPanel {

    Home Home;
        
    public Submenu_1_JM_Perguntas_e_Respostas( Home Home2 ) {
        Home = Home2;
        
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
        jToolBar2 = new javax.swing.JToolBar();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btExercicios8 = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        btExercicios9 = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        btExercicios5 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btExercicios6 = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btExercicios7 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        jToolBar2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);
        jToolBar2.setPreferredSize(new java.awt.Dimension(658, 71));

        jSeparator7.setSeparatorSize(new java.awt.Dimension(12, 0));
        jToolBar2.add(jSeparator7);

        btExercicios8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/Estrtutura_de_Dados.png"))); // NOI18N
        btExercicios8.setText("Leitura");
        btExercicios8.setFocusable(false);
        btExercicios8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExercicios8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExercicios8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btExercicios8MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btExercicios8MousePressed(evt);
            }
        });
        btExercicios8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExercicios8ActionPerformed(evt);
            }
        });
        jToolBar2.add(btExercicios8);

        jSeparator10.setSeparatorSize(new java.awt.Dimension(12, 0));
        jToolBar2.add(jSeparator10);

        btExercicios9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/video.png"))); // NOI18N
        btExercicios9.setText("Vídeos");
        btExercicios9.setEnabled(false);
        btExercicios9.setFocusable(false);
        btExercicios9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExercicios9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExercicios9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btExercicios9MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btExercicios9MousePressed(evt);
            }
        });
        jToolBar2.add(btExercicios9);

        jSeparator11.setSeparatorSize(new java.awt.Dimension(12, 0));
        jToolBar2.add(jSeparator11);

        btExercicios5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/exercicios.png"))); // NOI18N
        btExercicios5.setText("Exercícios");
        btExercicios5.setFocusable(false);
        btExercicios5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExercicios5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExercicios5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btExercicios5MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btExercicios5MousePressed(evt);
            }
        });
        jToolBar2.add(btExercicios5);

        jSeparator8.setSeparatorSize(new java.awt.Dimension(12, 0));
        jToolBar2.add(jSeparator8);

        btExercicios6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/desafios.png"))); // NOI18N
        btExercicios6.setText("Desafios");
        btExercicios6.setEnabled(false);
        btExercicios6.setFocusable(false);
        btExercicios6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExercicios6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExercicios6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btExercicios6MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btExercicios6MousePressed(evt);
            }
        });
        btExercicios6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExercicios6ActionPerformed(evt);
            }
        });
        jToolBar2.add(btExercicios6);

        jSeparator9.setSeparatorSize(new java.awt.Dimension(12, 0));
        jToolBar2.add(jSeparator9);

        btExercicios7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_controle_menus_norte/imagens/expert.png"))); // NOI18N
        btExercicios7.setText("Expert");
        btExercicios7.setEnabled(false);
        btExercicios7.setFocusable(false);
        btExercicios7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExercicios7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExercicios7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btExercicios7MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btExercicios7MousePressed(evt);
            }
        });
        jToolBar2.add(btExercicios7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btExercicios8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExercicios8MouseEntered
        Home.tocarSon.tocar( 51 );
    }//GEN-LAST:event_btExercicios8MouseEntered

    Exportando Exportando;
    private void btExercicios8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExercicios8MousePressed
        /*
        new Thread() {   @Override public void run() { try { 
            Exportando = new Exportando("ABRINDO...");
            Exportando.setVisible(true);Exportando.pbg.setMinimum(0);
            Exportando.pbg.setMaximum( 100 );
            Exportando.pbg.setValue( 50 );
            
            int id = 0;
            String materia = "";
                        
            List<Materia> Lista_Materia = null;
            try{
                Query q2 = JPAUtil.em().createNativeQuery("SELECT * FROM JM.MATERIA WHERE MATERIA = ?", Materia.class );
                q2.setParameter( 1, "MATEMÁTICA" ); 
                Lista_Materia = q2.getResultList();
            }catch( Exception e ){}      
                                    
            String rbusca = ""; try{ rbusca = Lista_Materia.get(0).getMateria(); }catch( Exception e ){}
                                
            if( !rbusca.equals("") ){
                id      = Lista_Materia.get(0).getId();
                materia = Lista_Materia.get(0).getMateria();
            }
            
            JPHtmlPrincipal JPHtmlPrincipal = new JPHtmlPrincipal(Home, materia, id );
            
            Home.ControleTabs.AddTabsAoHome("Leitura", "/imagens_internas/livroTp.gif", 
                    new JPHtmlPrincipal(Home, materia, id) ); 

            Exportando.fechar();
        } catch( Exception e ){ Exportando.fechar(); e.printStackTrace(); } } }.start();
        */
        /*
        new Thread() {   @Override public void run() { try { 
            Exportando = new Exportando("ABRINDO...");
            Exportando.setVisible(true);Exportando.pbg.setMinimum(0);
            Exportando.pbg.setMaximum( 100 );
            Exportando.pbg.setValue( 50 );
            
            JFrame frame = new JFrame( "JMARYSYSTEMS - Suporte: 85 9.9139.2441", null );
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
            frame.pack();
            frame.setLocationRelativeTo(null);            
            frame.setIconImage(null);
                                                            
            try{ 
                BufferedImage bufImg = ImageIO.read(Imagens_Internas.class.getResource("jmol.png") );                          
                frame.setIconImage( bufImg ); //bi
            }catch( IOException e ){} 
            
            try{ frame.setUndecorated(true);                                    } catch( Exception e ){}
            try{ frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME); } catch( Exception e ){}
            try{ frame.setExtendedState(JFrame.MAXIMIZED_BOTH);                 } catch( Exception e ){}
            
            Leitura_e_Aprendizagem_Materia_Consultar_EXE Leitura = new Leitura_e_Aprendizagem_Materia_Consultar_EXE(Home);
            frame.setContentPane( Leitura );
            frame.setVisible(true);
            
            Exportando.fechar();
        } catch( Exception e ){ Exportando.fechar(); e.printStackTrace(); } } }.start();
        */
                
        new Thread() {   @Override public void run() { try { 
            Exportando = new Exportando("ABRINDO...");
            Exportando.setVisible(true);Exportando.pbg.setMinimum(0);
            Exportando.pbg.setMaximum( 100 );
            Exportando.pbg.setValue( 50 );

/////////////////////////////////////////////////////////////////////////////////////////////////////////////             
            JDialog Dialog = null;
            Tela_de_Dialogo_Leitura_e_Aprendizagem_Materia Leitura = new Tela_de_Dialogo_Leitura_e_Aprendizagem_Materia(Home, Dialog);
                        
            Exportando.fechar();
            
/////////////////////////////////////////////////////////////////////////////////////////////////////////////             
            Object[] options = { "Cancelar" };            
            JOptionPane optionPane = new JOptionPane(Leitura,
                    JOptionPane.PLAIN_MESSAGE,
                    JOptionPane.DEFAULT_OPTION, 
                    null,
                    options,
                    options[0]);            
            Dialog = optionPane.createDialog("Selecionar Matéria");
            
            Leitura.Dialog = Dialog;
            Dialog.setVisible(true);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////            
            
        } catch( Exception e ){ Exportando.fechar(); e.printStackTrace(); } } }.start();
    }//GEN-LAST:event_btExercicios8MousePressed

    private void btExercicios8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExercicios8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExercicios8ActionPerformed

    private void btExercicios9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExercicios9MouseEntered
        Home.tocarSon.tocar( 51 );
    }//GEN-LAST:event_btExercicios9MouseEntered

    private void btExercicios9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExercicios9MousePressed
        /*new Thread() {   @Override public void run() { try { Thread.sleep( 1 );

            Home.ControleTabs.AddTabsAoHome("Português_Vídeos", "/imagens_internas/livroTp.gif", new Exercicios_00_Portugues_Videos(Home) );

        } catch( Exception e ){ } } }.start();*/
    }//GEN-LAST:event_btExercicios9MousePressed

    private void btExercicios5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExercicios5MouseEntered
        Home.tocarSon.tocar( 51 );
    }//GEN-LAST:event_btExercicios5MouseEntered

    private void btExercicios5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExercicios5MousePressed
        /*
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 );

            Home.ControleTabs.AddTabsAoHome("Exercícios - Adição", "/imagens_internas/livroTp.gif", new Indice_Exercicios_Matematica_Adicao(Home) ); 

        } catch( Exception e ){ } } }.start();
        */
        new Thread() {   @Override public void run() { try { 
            Exportando = new Exportando("ABRINDO...");
            Exportando.setVisible(true);Exportando.pbg.setMinimum(0);
            Exportando.pbg.setMaximum( 100 );
            Exportando.pbg.setValue( 50 );

            Home.adicionar_Tela_De_Trabalho("Exercícios", new Leitura_e_Aprendizagem_Assunto_Consultar_EXE(Home) ); 

            Exportando.fechar();
        } catch( Exception e ){ Exportando.fechar(); } } }.start();
    }//GEN-LAST:event_btExercicios5MousePressed

    private void btExercicios6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExercicios6MouseEntered
        Home.tocarSon.tocar( 51 );
    }//GEN-LAST:event_btExercicios6MouseEntered

    private void btExercicios6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExercicios6MousePressed
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 );

            //if( Administrador.mapaComandos.get("ACESSO_CEP") != null ) {

                //Sistema_Home.adicionarSubmenu(new Configuracoes( Sistema_Home ) );

                //                Sistema_Home.Home.ControleTabs.AddTabsAoHome("FORNECEDORES", "/sistema_imagens/livroTp.gif", new fornecedor.Fornecedor_Home( Sistema_Home.Home ) );
                /*}
            else{ JOPM JOptionPaneMod = new JOPM( 2, "USUÁRIO SEM AUTORIZAÇÂO, "
                + "\nO USUÁRIO LOGADO NÃO TEM PERMISSÃO PARA REALIZAR ESTA AÇÃO"
                + "\nUSUÁRIO LOGADO: " + Bean_Usuario_Logado.NOMECOMPLETO
                + "\nSOLICITE AUTORIZAÇÃO AO ADMINISTRADOR"
                + "\n", "USUÁRIO SEM AUTORIZAÇÂO" );
        }*/
        } catch( Exception e ){ } } }.start();
        /*new Thread() {   @Override public void run() { try { Thread.sleep( 1 );

            if( Administrador.mapaComandos.get("ACESSO_CONTROLE_ACESSO") != null ) {

                Sistema_Home.Home.ControleTabs.AddTabsAoHome("Controle Acesso", "/sistema_imagens/livroTp.gif", new Controle_Acesso_Home( Sistema_Home.Home ) );
            }
            else{ JOPM JOptionPaneMod = new JOPM( 2, "USUÁRIO SEM AUTORIZAÇÂO, "
                + "\nO USUÁRIO LOGADO NÃO TEM PERMISSÃO PARA REALIZAR ESTA AÇÃO"
                + "\nUSUÁRIO LOGADO: " + Bean_Usuario_Logado.NOMECOMPLETO
                + "\nSOLICITE AUTORIZAÇÃO AO ADMINISTRADOR"
                + "\n", "USUÁRIO SEM AUTORIZAÇÂO" );
        }
        } catch( Exception e ){ } } }.start();*/
    }//GEN-LAST:event_btExercicios6MousePressed

    private void btExercicios6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExercicios6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExercicios6ActionPerformed

    private void btExercicios7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExercicios7MouseEntered
        Home.tocarSon.tocar( 51 );
    }//GEN-LAST:event_btExercicios7MouseEntered

    private void btExercicios7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExercicios7MousePressed

    }//GEN-LAST:event_btExercicios7MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExercicios5;
    private javax.swing.JButton btExercicios6;
    private javax.swing.JButton btExercicios7;
    private javax.swing.JButton btExercicios8;
    private javax.swing.JButton btExercicios9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
