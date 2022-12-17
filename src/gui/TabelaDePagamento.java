/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import gui.Login;
import gui.CadastroUsuario;
import gui.TabelaDePagamento;
import gui.CadastroVeiculo;
import gui.MenuMotorista;
import model.Usuario;
/**
 *
 * @author User
 */
public class TabelaDePagamento extends javax.swing.JFrame {
    
 private final UsuarioDAO controller;
    
    public TabelaDePagamento() {
        setTitle("Menu Do Administrador");
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        
        this.setLocationRelativeTo(null); 
        controller = new UsuarioDAO(); 
    }
    
    public void PopularJTable(String sql) {
          try
          {
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/transporte?useTimezone=true"+"&serverTimezone=UTC","root","12345");
           PreparedStatement banco = (PreparedStatement)conn.prepareStatement(sql);
           banco.execute();

           ResultSet resultado = banco.executeQuery(sql);

           DefaultTableModel model =(DefaultTableModel) jUsuarios.getModel();
           model.setNumRows(0);

           while(resultado.next())
           {
               model.addRow(new Object[] 
               { 
                  resultado.getString("username"),
                  resultado.getString("idade"),
                  resultado.getString("genero"),
                  resultado.getString("responsavel"),
                  resultado.getString("colegio"),
                  resultado.getString("endereço"),
                  resultado.getString("turno"),
                  resultado.getString("status"),
                  
               }); 
          } 
           banco.close();
           conn.close();
          }
         catch (SQLException ex)
         {
            System.out.println("o erro foi " +ex);
          }
           carregaTabela();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Button5 = new javax.swing.JPanel();
        Indicator5 = new javax.swing.JPanel();
        Button6 = new javax.swing.JPanel();
        Indicator6 = new javax.swing.JPanel();
        Button7 = new javax.swing.JPanel();
        Indicator7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        Button9 = new javax.swing.JPanel();
        Indicator9 = new javax.swing.JPanel();
        Button10 = new javax.swing.JPanel();
        Indicator10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn_close = new javax.swing.JLabel();
        jLabelMin1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jUsuarios = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 39, -1, -1));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 57, -1, -1));

        jPanel14.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        jPanel13.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 40));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-usuário-homem-com-círculo-96.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 100, 90));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button5.setBackground(new java.awt.Color(255, 255, 255));
        Button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button5MouseExited(evt);
            }
        });

        Indicator5.setBackground(new java.awt.Color(204, 0, 204));
        Indicator5.setOpaque(false);

        javax.swing.GroupLayout Indicator5Layout = new javax.swing.GroupLayout(Indicator5);
        Indicator5.setLayout(Indicator5Layout);
        Indicator5Layout.setHorizontalGroup(
            Indicator5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator5Layout.setVerticalGroup(
            Indicator5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button5Layout = new javax.swing.GroupLayout(Button5);
        Button5.setLayout(Button5Layout);
        Button5Layout.setHorizontalGroup(
            Button5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button5Layout.createSequentialGroup()
                .addComponent(Indicator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
        );
        Button5Layout.setVerticalGroup(
            Button5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(Button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 232, -1));

        Button6.setBackground(new java.awt.Color(255, 255, 255));
        Button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button6MouseExited(evt);
            }
        });

        Indicator6.setBackground(new java.awt.Color(204, 0, 204));
        Indicator6.setOpaque(false);

        javax.swing.GroupLayout Indicator6Layout = new javax.swing.GroupLayout(Indicator6);
        Indicator6.setLayout(Indicator6Layout);
        Indicator6Layout.setHorizontalGroup(
            Indicator6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator6Layout.setVerticalGroup(
            Indicator6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button6Layout = new javax.swing.GroupLayout(Button6);
        Button6.setLayout(Button6Layout);
        Button6Layout.setHorizontalGroup(
            Button6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button6Layout.createSequentialGroup()
                .addComponent(Indicator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
        );
        Button6Layout.setVerticalGroup(
            Button6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(Button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 227, 232, -1));

        Button7.setBackground(new java.awt.Color(255, 255, 255));
        Button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button7MouseExited(evt);
            }
        });

        Indicator7.setBackground(new java.awt.Color(204, 0, 204));
        Indicator7.setOpaque(false);

        javax.swing.GroupLayout Indicator7Layout = new javax.swing.GroupLayout(Indicator7);
        Indicator7.setLayout(Indicator7Layout);
        Indicator7Layout.setHorizontalGroup(
            Indicator7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator7Layout.setVerticalGroup(
            Indicator7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button7Layout = new javax.swing.GroupLayout(Button7);
        Button7.setLayout(Button7Layout);
        Button7Layout.setHorizontalGroup(
            Button7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button7Layout.createSequentialGroup()
                .addComponent(Indicator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
        );
        Button7Layout.setVerticalGroup(
            Button7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(Button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 232, -1));
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 39, -1, -1));
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 57, -1, -1));

        jPanel15.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        jPanel16.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 40));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-usuário-homem-com-círculo-96.png"))); // NOI18N
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 100, 90));

        Button9.setBackground(new java.awt.Color(255, 255, 255));
        Button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button9MouseExited(evt);
            }
        });

        Indicator9.setBackground(new java.awt.Color(204, 0, 204));
        Indicator9.setOpaque(false);

        javax.swing.GroupLayout Indicator9Layout = new javax.swing.GroupLayout(Indicator9);
        Indicator9.setLayout(Indicator9Layout);
        Indicator9Layout.setHorizontalGroup(
            Indicator9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator9Layout.setVerticalGroup(
            Indicator9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button9Layout = new javax.swing.GroupLayout(Button9);
        Button9.setLayout(Button9Layout);
        Button9Layout.setHorizontalGroup(
            Button9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button9Layout.createSequentialGroup()
                .addComponent(Indicator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
        );
        Button9Layout.setVerticalGroup(
            Button9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(Button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 232, -1));

        Button10.setBackground(new java.awt.Color(255, 255, 255));
        Button10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button10MouseExited(evt);
            }
        });

        Indicator10.setBackground(new java.awt.Color(204, 0, 204));
        Indicator10.setOpaque(false);

        javax.swing.GroupLayout Indicator10Layout = new javax.swing.GroupLayout(Indicator10);
        Indicator10.setLayout(Indicator10Layout);
        Indicator10Layout.setHorizontalGroup(
            Indicator10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator10Layout.setVerticalGroup(
            Indicator10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button10Layout = new javax.swing.GroupLayout(Button10);
        Button10.setLayout(Button10Layout);
        Button10Layout.setHorizontalGroup(
            Button10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button10Layout.createSequentialGroup()
                .addComponent(Indicator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        Button10Layout.setVerticalGroup(
            Button10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(Button10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 232, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 204));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-página-inicial-36.png"))); // NOI18N
        jLabel14.setText("Home");
        jLabel14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel14KeyPressed(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-mensagem-36.png"))); // NOI18N
        jLabel7.setText("Mensagens");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 204));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-relatório-gráfico-36.png"))); // NOI18N
        jLabel10.setText("Tabela de alunos");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 220, 50));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 204));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-página-inicial-36.png"))); // NOI18N
        jLabel15.setText("Home");
        jLabel15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel15KeyPressed(evt);
            }
        });
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 190, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 204, 204));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-transporte-terrestre-36.png"))); // NOI18N
        jLabel31.setText("Cadastro de Veículos");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 200, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-document-writer-36.png"))); // NOI18N
        jLabel8.setText("Cadastro de clientes");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 890));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 240, 890);

        jPanel2.setBackground(new java.awt.Color(247, 247, 247));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Tabela de Alunos");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 60, 680, 37);

        jPanel8.setBackground(new java.awt.Color(0, 204, 204));

        btn_close.setBackground(new java.awt.Color(96, 83, 150));
        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("X");
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });

        jLabelMin1.setBackground(new java.awt.Color(204, 204, 204));
        jLabelMin1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelMin1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin1.setText("-");
        jLabelMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(jLabelMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMin1))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8);
        jPanel8.setBounds(910, 0, 180, 41);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(96, 83, 150));
        jPanel2.add(jLabel13);
        jLabel13.setBounds(30, 66, 270, 30);

        jUsuarios.setAutoCreateRowSorter(true);
        jUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Gustavo Mesquita", "16", "Masculino", "Cristina", "Seice", "7:30", "12:40", "Rua Belém", "Ativo"},
                {"Rebeca Santos", "13", "Feminino", "Valéria Santos", "Flávio Casimiro", "13:00", "17:30", "Rua Guimarães", "Ativo"},
                {"Luiz Augusto", "17", "Masculino", "Cristiane", "Seice", "7:30", "12:40", "Rua Barão de Cotegipe", "Ativo"},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NOME", "IDADE", "GÊNERO", "RESPONSÁVEL", "INSTITUIÇÃO", "ENTRADA", "SAÍDA", "ENDEREÇO", "STATUS"
            }
        ));
        jUsuarios.setGridColor(new java.awt.Color(210, 215, 211));
        jUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jUsuarios);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 120, 1090, 920);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/logo sem fundo (aumentada, sem letra)_1.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(190, 170, 690, 530);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel9.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1088, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9);
        jPanel9.setBounds(0, 50, 1090, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(246, 0, 1347, 890);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

    }//GEN-LAST:event_jPanel2MousePressed

    private void Button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseClicked

    }//GEN-LAST:event_Button5MouseClicked

    private void Button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button5MouseEntered

    private void Button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button5MouseExited

    private void Button6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button6MouseClicked

    }//GEN-LAST:event_Button6MouseClicked

    private void Button6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button6MouseEntered

    private void Button6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button6MouseExited

    private void Button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseClicked

    }//GEN-LAST:event_Button7MouseClicked

    private void Button7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button7MouseEntered

    private void Button7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button7MouseExited

    private void Button9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button9MouseClicked

    private void Button9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button9MouseEntered

    private void Button9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button9MouseExited

    private void Button10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button10MouseClicked

    private void Button10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button10MouseEntered

    private void Button10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button10MouseExited

    private void jUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUsuariosMouseClicked

        /*
        txtIdMedicos.setEnabled(true);
        txtNomeMedicos.setEnabled(true);
        txtCrmMedicos.setEnabled(true);
        txtEspecialidadeMedicos.setEnabled(true);
        txtSalarioMedicos.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnLimpar.setEnabled(true);
        */

       
        // retorna o valor da celula linha X 2
    }//GEN-LAST:event_jUsuariosMouseClicked

    private void jLabel14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel14KeyPressed
        MenuMotorista menumotora = new MenuMotorista();
        menumotora.show();
    }//GEN-LAST:event_jLabel14KeyPressed

    private void jLabel15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel15KeyPressed
        MenuMotorista menumotora = new MenuMotorista();
        menumotora.show();
    }//GEN-LAST:event_jLabel15KeyPressed

    private void jLabelMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin1MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        CadastroUsuario cadastrouser = new CadastroUsuario();
        cadastrouser.show();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
     TabelaDePagamento tp = new TabelaDePagamento();
        tp.show();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
    CadastroVeiculo cadastroveic = new CadastroVeiculo();
        cadastroveic.show();
    }//GEN-LAST:event_jLabel31MouseClicked

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
            java.util.logging.Logger.getLogger(TabelaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaDePagamento().setVisible(true);
            }
        });
    }
    
      private void carregaTabela(){
        
        DefaultTableModel modelo = (DefaultTableModel) jUsuarios.getModel();
        modelo.setNumRows(0);
        
        jUsuarios.getColumnModel().getColumn(0).setPreferredWidth(25);
        jUsuarios.getColumnModel().getColumn(1).setPreferredWidth(25);
        jUsuarios.getColumnModel().getColumn(2).setPreferredWidth(25);
        jUsuarios.getColumnModel().getColumn(3).setPreferredWidth(25);
        jUsuarios.getColumnModel().getColumn(4).setPreferredWidth(25);
        jUsuarios.getColumnModel().getColumn(5).setPreferredWidth(25);
        jUsuarios.getColumnModel().getColumn(6).setPreferredWidth(25);
        jUsuarios.getColumnModel().getColumn(7).setPreferredWidth(25);
        
        
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/transporte?useTimezone=true"+"&serverTimezone=UTC","root","12345");
            PreparedStatement pstm;
            ResultSet rs;
            pstm = conn.prepareStatement("select*from usuarios where perfil = 'Usuario'");
            rs  = pstm.executeQuery();
            
            while(rs.next()){
                modelo.addRow(new Object[]{
                    
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                   
                    
                    
                    
                
            });
            }
            pstm.close();
            conn.close();
            
            
        } catch (Exception ErroSql) {
            
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados da tabela" + ErroSql, "Erro", JOptionPane.ERROR_MESSAGE );
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Button10;
    private javax.swing.JPanel Button5;
    private javax.swing.JPanel Button6;
    private javax.swing.JPanel Button7;
    private javax.swing.JPanel Button9;
    private javax.swing.JPanel Indicator10;
    private javax.swing.JPanel Indicator5;
    private javax.swing.JPanel Indicator6;
    private javax.swing.JPanel Indicator7;
    private javax.swing.JPanel Indicator9;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelMin1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jUsuarios;
    // End of variables declaration//GEN-END:variables
}
