
package gui;

import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import gui.Login;
import gui.MenuMotorista;
import gui.TabelaDePagamento;
import gui.CadastroVeiculo;
import javax.swing.table.DefaultTableModel;
import model.Usuario;

public class CadastroUsuario extends javax.swing.JFrame {

    private final UsuarioDAO controller;
    
    public CadastroUsuario() {
        setTitle("Cadastro de Usuário");
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        carregaTabela();
        
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
                  resultado.getString("id"),
                  resultado.getString("username"),
                  resultado.getString("senha"),
                  resultado.getString("status")
                  
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
        Button1 = new javax.swing.JPanel();
        Indicator1 = new javax.swing.JPanel();
        Button2 = new javax.swing.JPanel();
        Indicator2 = new javax.swing.JPanel();
        Button3 = new javax.swing.JPanel();
        Indicator3 = new javax.swing.JPanel();
        Button4 = new javax.swing.JPanel();
        Indicator4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabelClose1 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        btnPesquisarUsuario = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel16 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxEstado_civil = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jComboBoxPerfil = new javax.swing.JComboBox<>();
        txtTel = new javax.swing.JFormattedTextField();
        txtNasci = new javax.swing.JFormattedTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtOrgao_exp = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtPassaporte = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtDoc_Militar = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtCertidao = new javax.swing.JTextField();
        txtData_exp = new javax.swing.JFormattedTextField();
        txtRg = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtColegio = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtPai = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtMae = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtTel_alternativo = new javax.swing.JFormattedTextField();
        txtHorario_entrada = new javax.swing.JFormattedTextField();
        txtHorario_saida = new javax.swing.JFormattedTextField();
        jLabel44 = new javax.swing.JLabel();
        btnAtualizarUsuario = new javax.swing.JButton();
        btnInserirUsuario = new javax.swing.JButton();
        btnLimparUsuario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        btnApagarUsuario = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        btnNovoUsuario = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        btnVoltarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button1.setBackground(new java.awt.Color(255, 255, 255));
        Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button1MouseExited(evt);
            }
        });

        Indicator1.setBackground(new java.awt.Color(204, 0, 204));
        Indicator1.setOpaque(false);

        javax.swing.GroupLayout Indicator1Layout = new javax.swing.GroupLayout(Indicator1);
        Indicator1.setLayout(Indicator1Layout);
        Indicator1Layout.setHorizontalGroup(
            Indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator1Layout.setVerticalGroup(
            Indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button1Layout = new javax.swing.GroupLayout(Button1);
        Button1.setLayout(Button1Layout);
        Button1Layout.setHorizontalGroup(
            Button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button1Layout.createSequentialGroup()
                .addComponent(Indicator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
        );
        Button1Layout.setVerticalGroup(
            Button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 232, -1));

        Button2.setBackground(new java.awt.Color(255, 255, 255));
        Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button2MouseExited(evt);
            }
        });

        Indicator2.setBackground(new java.awt.Color(204, 0, 204));
        Indicator2.setOpaque(false);

        javax.swing.GroupLayout Indicator2Layout = new javax.swing.GroupLayout(Indicator2);
        Indicator2.setLayout(Indicator2Layout);
        Indicator2Layout.setHorizontalGroup(
            Indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator2Layout.setVerticalGroup(
            Indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button2Layout = new javax.swing.GroupLayout(Button2);
        Button2.setLayout(Button2Layout);
        Button2Layout.setHorizontalGroup(
            Button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button2Layout.createSequentialGroup()
                .addComponent(Indicator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
        );
        Button2Layout.setVerticalGroup(
            Button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 227, 232, -1));

        Button3.setBackground(new java.awt.Color(255, 255, 255));
        Button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button3MouseExited(evt);
            }
        });

        Indicator3.setBackground(new java.awt.Color(204, 0, 204));
        Indicator3.setOpaque(false);

        javax.swing.GroupLayout Indicator3Layout = new javax.swing.GroupLayout(Indicator3);
        Indicator3.setLayout(Indicator3Layout);
        Indicator3Layout.setHorizontalGroup(
            Indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator3Layout.setVerticalGroup(
            Indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button3Layout = new javax.swing.GroupLayout(Button3);
        Button3.setLayout(Button3Layout);
        Button3Layout.setHorizontalGroup(
            Button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button3Layout.createSequentialGroup()
                .addComponent(Indicator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
        );
        Button3Layout.setVerticalGroup(
            Button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 279, 232, -1));

        Button4.setBackground(new java.awt.Color(255, 255, 255));
        Button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button4MouseExited(evt);
            }
        });

        Indicator4.setBackground(new java.awt.Color(204, 0, 204));
        Indicator4.setOpaque(false);

        javax.swing.GroupLayout Indicator4Layout = new javax.swing.GroupLayout(Indicator4);
        Indicator4.setLayout(Indicator4Layout);
        Indicator4Layout.setHorizontalGroup(
            Indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator4Layout.setVerticalGroup(
            Indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button4Layout = new javax.swing.GroupLayout(Button4);
        Button4.setLayout(Button4Layout);
        Button4Layout.setHorizontalGroup(
            Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button4Layout.createSequentialGroup()
                .addComponent(Indicator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
        );
        Button4Layout.setVerticalGroup(
            Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 331, 232, -1));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 39, -1, -1));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 57, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/logo sem fundo diminuida.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 250, 150));

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-página-inicial-36.png"))); // NOI18N
        jLabel6.setText("Home");
        jLabel6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel6KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 204, 204));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-relatório-gráfico-36.png"))); // NOI18N
        jLabel30.setText("Tabela de Alunos");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 220, 40));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 204, 204));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-transporte-terrestre-36.png"))); // NOI18N
        jLabel31.setText("Cadastro de Veículos");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 200, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-document-writer-36.png"))); // NOI18N
        jLabel8.setText("Cadastro de clientes");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 1150));

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

        jPanel8.setBackground(new java.awt.Color(0, 204, 204));

        jLabelClose1.setBackground(new java.awt.Color(204, 204, 204));
        jLabelClose1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelClose1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose1.setText("X");
        jLabelClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose1MouseClicked(evt);
            }
        });

        jLabelMin.setBackground(new java.awt.Color(204, 204, 204));
        jLabelMin.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 135, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose1)
                    .addComponent(jLabelMin))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8);
        jPanel8.setBounds(920, 0, 180, 41);

        btnPesquisarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPesquisarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-pesquisar-32.png"))); // NOI18N
        btnPesquisarUsuario.setBorder(null);
        btnPesquisarUsuario.setBorderPainted(false);
        btnPesquisarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnPesquisarUsuario);
        btnPesquisarUsuario.setBounds(790, 0, 70, 40);

        jLabel11.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Pesquise o ID...");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        jLabel11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel11KeyTyped(evt);
            }
        });
        jPanel2.add(jLabel11);
        jLabel11.setBounds(0, 0, 420, 40);

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtId.setBorder(null);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel2.add(txtId);
        txtId.setBounds(0, -2, 790, 40);

        jSeparator1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 40, 790, 20);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel16.setForeground(new java.awt.Color(0, 204, 204));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 204, 204));
        jLabel16.setText("Dados Pessoais");

        txtEmail.setBackground(new java.awt.Color(238, 238, 238));
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmail.setEnabled(false);
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtSenha.setBackground(new java.awt.Color(238, 238, 238));
        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSenha.setEnabled(false);
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSenhaKeyTyped(evt);
            }
        });

        txtUsername.setBackground(new java.awt.Color(238, 238, 238));
        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsername.setEnabled(false);
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Senha:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nome:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("E-mail:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Telefone:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Data de Nascimento:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Estado Civil:");

        jComboBoxEstado_civil.setBackground(new java.awt.Color(238, 238, 238));
        jComboBoxEstado_civil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxEstado_civil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado" }));
        jComboBoxEstado_civil.setEnabled(false);
        jComboBoxEstado_civil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstado_civilActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel11.setForeground(new java.awt.Color(0, 204, 204));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 204));
        jLabel15.setText("Status");

        jComboBoxStatus.setBackground(new java.awt.Color(238, 238, 238));
        jComboBoxStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        jComboBoxStatus.setEnabled(false);
        jComboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel15)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel10.setForeground(new java.awt.Color(0, 204, 204));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 204));
        jLabel13.setText("Gênero");

        jComboBoxSexo.setBackground(new java.awt.Color(238, 238, 238));
        jComboBoxSexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jComboBoxSexo.setEnabled(false);
        jComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel13))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel15.setForeground(new java.awt.Color(0, 204, 204));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 204, 204));
        jLabel37.setText("Perfil");

        jComboBoxPerfil.setBackground(new java.awt.Color(238, 238, 238));
        jComboBoxPerfil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário" }));
        jComboBoxPerfil.setEnabled(false);
        jComboBoxPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jComboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(29, 29, 29))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTel.setBackground(new java.awt.Color(238, 238, 238));
        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        txtNasci.setBackground(new java.awt.Color(238, 238, 238));
        try {
            txtNasci.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNasci.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNasci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNasciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNasci))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxEstado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(283, 283, 283))
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(237, 237, 237))
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addComponent(jLabel16))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(txtTel)
                                        .addGap(47, 47, 47)))
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNasci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jComboBoxEstado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)))
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        jPanel2.add(jPanel16);
        jPanel16.setBounds(0, 60, 780, 360);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel17.setForeground(new java.awt.Color(0, 204, 204));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 204, 204));
        jLabel18.setText("Documentos");

        txtOrgao_exp.setBackground(new java.awt.Color(238, 238, 238));
        txtOrgao_exp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtOrgao_exp.setEnabled(false);
        txtOrgao_exp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrgao_expKeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Orgão Exp:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("RG:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Data Exp:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("CPF:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Passaporte:");

        txtPassaporte.setBackground(new java.awt.Color(238, 238, 238));
        txtPassaporte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassaporte.setEnabled(false);
        txtPassaporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassaporteKeyTyped(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("Doc. Militar:");

        txtDoc_Militar.setBackground(new java.awt.Color(238, 238, 238));
        txtDoc_Militar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDoc_Militar.setEnabled(false);
        txtDoc_Militar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDoc_MilitarKeyTyped(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("Certidão de Nascimento:");

        txtCertidao.setBackground(new java.awt.Color(238, 238, 238));
        txtCertidao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCertidao.setEnabled(false);
        txtCertidao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCertidaoKeyTyped(evt);
            }
        });

        txtData_exp.setBackground(new java.awt.Color(238, 238, 238));
        try {
            txtData_exp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData_exp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtData_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtData_expActionPerformed(evt);
            }
        });

        txtRg.setBackground(new java.awt.Color(238, 238, 238));
        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgActionPerformed(evt);
            }
        });

        txtCpf.setBackground(new java.awt.Color(238, 238, 238));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrgao_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtData_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtRg)
                    .addComponent(txtCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoc_Militar, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCertidao, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrgao_exp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoc_Militar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData_exp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(txtCertidao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(388, 388, 388))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(387, 387, 387))))
        );

        jPanel2.add(jPanel17);
        jPanel17.setBounds(0, 430, 780, 280);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel18.setForeground(new java.awt.Color(0, 204, 204));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 204, 204));
        jLabel19.setText("Informações adicionais");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("CEP:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Endereço:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Horario de Entrada:");

        txtBairro.setBackground(new java.awt.Color(238, 238, 238));
        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBairro.setEnabled(false);
        txtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBairroKeyTyped(evt);
            }
        });

        txtCep.setBackground(new java.awt.Color(238, 238, 238));
        txtCep.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCep.setEnabled(false);
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCepKeyTyped(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Horario de Saida:");

        txtColegio.setBackground(new java.awt.Color(238, 238, 238));
        txtColegio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtColegio.setEnabled(false);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Instituição:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Nome do Reponsável (Pai):");

        txtPai.setBackground(new java.awt.Color(238, 238, 238));
        txtPai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPai.setEnabled(false);
        txtPai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaiKeyTyped(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Número do Responsável:");

        txtMae.setBackground(new java.awt.Color(238, 238, 238));
        txtMae.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMae.setEnabled(false);
        txtMae.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaeKeyTyped(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("Nome do Reponsável (Mãe):");

        txtTel_alternativo.setBackground(new java.awt.Color(238, 238, 238));
        try {
            txtTel_alternativo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel_alternativo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTel_alternativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTel_alternativoActionPerformed(evt);
            }
        });

        txtHorario_entrada.setBackground(new java.awt.Color(238, 238, 238));
        try {
            txtHorario_entrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHorario_entrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHorario_entrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtHorario_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorario_entradaActionPerformed(evt);
            }
        });

        txtHorario_saida.setBackground(new java.awt.Color(238, 238, 238));
        try {
            txtHorario_saida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHorario_saida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHorario_saida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtHorario_saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorario_saidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel19))
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtHorario_saida, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHorario_entrada, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTel_alternativo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColegio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCep, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMae, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTel_alternativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtColegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHorario_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHorario_saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        jPanel2.add(jPanel18);
        jPanel18.setBounds(790, 60, 310, 650);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setText("Editar");
        jPanel2.add(jLabel44);
        jLabel44.setBounds(210, 860, 40, 30);

        btnAtualizarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnAtualizarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtualizarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-editar-32.png"))); // NOI18N
        btnAtualizarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtualizarUsuario.setEnabled(false);
        btnAtualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtualizarUsuario);
        btnAtualizarUsuario.setBounds(200, 820, 60, 41);

        btnInserirUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnInserirUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInserirUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnInserirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-inserir-32.png"))); // NOI18N
        btnInserirUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInserirUsuario.setEnabled(false);
        btnInserirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnInserirUsuario);
        btnInserirUsuario.setBounds(200, 740, 60, 41);

        btnLimparUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnLimparUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimparUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-cloth-32.png"))); // NOI18N
        btnLimparUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimparUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimparUsuario);
        btnLimparUsuario.setBounds(120, 740, 60, 41);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Limpar");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(130, 780, 50, 20);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("Inserir");
        jPanel2.add(jLabel45);
        jLabel45.setBounds(210, 780, 50, 20);

        btnApagarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnApagarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnApagarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnApagarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-lixo-32.png"))); // NOI18N
        btnApagarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnApagarUsuario.setEnabled(false);
        btnApagarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnApagarUsuario);
        btnApagarUsuario.setBounds(40, 740, 62, 41);

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setText("Apagar");
        jPanel2.add(jLabel46);
        jLabel46.setBounds(50, 780, 50, 20);

        btnNovoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnNovoUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNovoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-pasta-hospitalar-32.png"))); // NOI18N
        btnNovoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnNovoUsuario);
        btnNovoUsuario.setBounds(40, 820, 60, 41);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setText("Novo Usuário");
        jPanel2.add(jLabel47);
        jLabel47.setBounds(30, 860, 90, 30);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setText("Voltar");
        jPanel2.add(jLabel48);
        jLabel48.setBounds(130, 860, 40, 30);

        btnVoltarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVoltarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-retornar-32.png"))); // NOI18N
        btnVoltarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVoltarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnVoltarUsuario);
        btnVoltarUsuario.setBounds(120, 820, 60, 41);

        jUsuarios.setAutoCreateRowSorter(true);
        jUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "SENHA", "PERFIL"
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
        jScrollPane1.setBounds(400, 730, 700, 200);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1700, 940));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabelMinMouseClicked

    private void Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseClicked

    }//GEN-LAST:event_Button1MouseClicked

    private void Button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button1MouseEntered

    private void Button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button1MouseExited

    private void Button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseClicked

    }//GEN-LAST:event_Button2MouseClicked

    private void Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button2MouseEntered

    private void Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button2MouseExited

    private void Button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseClicked

    }//GEN-LAST:event_Button3MouseClicked

    private void Button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button3MouseEntered

    private void Button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button3MouseExited

    private void Button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseClicked

    }//GEN-LAST:event_Button4MouseClicked

    private void Button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseEntered
        // TODO add your handling code here:]
    }//GEN-LAST:event_Button4MouseEntered

    private void Button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button4MouseExited

    private void jLabelClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose1MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelClose1MouseClicked

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        txtId.setVisible(true);
        jLabel11.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11KeyTyped

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        jLabel11.setVisible(false);
        if(txtId.getText().isEmpty())
        jLabel11.setVisible(true);
    }//GEN-LAST:event_txtIdKeyTyped

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

    }//GEN-LAST:event_jPanel2MousePressed

    private void jLabel6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel6KeyPressed
        MenuMotorista menumotora = new MenuMotorista();
        menumotora.show();
    }//GEN-LAST:event_jLabel6KeyPressed

    private void txtBairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroKeyTyped

    private void txtCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaKeyTyped

    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void txtOrgao_expKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrgao_expKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgao_expKeyTyped

    private void txtPaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaiKeyTyped

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        CadastroUsuario cadastrouser = new CadastroUsuario();
        cadastrouser.show();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void txtMaeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaeKeyTyped

    private void jComboBoxEstado_civilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstado_civilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstado_civilActionPerformed

    private void txtPassaporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassaporteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassaporteKeyTyped

    private void txtDoc_MilitarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoc_MilitarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoc_MilitarKeyTyped

    private void txtCertidaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCertidaoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCertidaoKeyTyped

    private void jComboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxStatusActionPerformed

    private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSexoActionPerformed

    private void jComboBoxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPerfilActionPerformed

    private void btnAtualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarUsuarioActionPerformed

        if (txtId.getText().isEmpty()) { //jTextField6 se refere ao campo de texto do ID
            JOptionPane.showMessageDialog(null, "Digite o ID.");
        }
        else {
            try {
                //Registra JDBC driver
                Class.forName("com.mysql.jdbc.Driver");
                //Abrindo a conexão
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/transporte?useTimezone=true"+"&serverTimezone=UTC","root","12345");
                //Executa a query de atualização
                java.sql.Statement st = conn.createStatement();
                st.executeUpdate("UPDATE usuarios SET username='"
                    + this.txtUsername.getText()
                    + "',senha='" + this.txtSenha.getText()    
                    + "',cep='" + this.txtCep.getText()
                    + "',bairro='" + this.txtBairro.getText()
                    + "',cpf='" + this.txtCpf.getText()
                    + "',email='" + this.txtEmail.getText()
                    + "',data_nascimento='" + this.txtNasci.getText() 
                    + "',telefone='" + this.txtTel.getText()
                    + "',tel_alternativo='" + this.txtTel_alternativo.getText() 
                    + "',orgao_exp='" + this.txtOrgao_exp.getText()
                    + "',data_exp='" + this.txtData_exp.getText()
                    + "',perfil='" + this.jComboBoxPerfil.getSelectedItem()
                    + "',status='" + this.jComboBoxStatus.getSelectedItem()
                    + "',estado_civil='" + this.jComboBoxEstado_civil.getSelectedItem()
                    + "',sexo='" + this.jComboBoxSexo.getSelectedItem()
                    + "',Doc_Militar='" + this.txtDoc_Militar.getText()
                    + "',certidao='" + this.txtCertidao.getText()
                    + "',pai='" + this.txtPai.getText()
                    + "',mae='" + this.txtMae.getText()
                    + "',passaporte='" + this.txtPassaporte.getText()
                    + "',colegio='" + this.txtColegio.getText()              
                    + "',horario_entrada='" + this.txtHorario_entrada.getText()
                    + "',horario_saida='" + this.txtHorario_saida.getText()
                    + "' WHERE id='" + this.txtId.getText() + "'");
                JOptionPane.showMessageDialog(rootPane, "Usuário atualizado com sucesso!");
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }//Fim try
        txtUsername.setText("");
        txtSenha.setText("");
        txtTel.setText("");
        txtEmail.setText("");
        txtNasci.setText("");
        txtBairro.setText("");
        txtTel_alternativo.setText("");
        txtOrgao_exp.setText("");
        txtData_exp.setText("");
        txtRg.setText("");
        txtCpf.setText("");
        txtCep.setText("");
        txtDoc_Militar.setText("");
        txtCertidao.setText("");
        txtPai.setText("");
        txtMae.setText("");
        txtPassaporte.setText("");
        txtColegio.setText("");
        txtHorario_entrada.setText("");
        txtHorario_saida.setText("");
        jComboBoxPerfil.setSelectedItem("");
        jComboBoxEstado_civil.setSelectedItem("");
        jComboBoxStatus.setSelectedItem("");
        jComboBoxSexo.setSelectedItem("");

        }
        carregaTabela();
    }//GEN-LAST:event_btnAtualizarUsuarioActionPerformed

    private void btnInserirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirUsuarioActionPerformed

        Usuario usuario = new Usuario();
        usuario.setUsername(txtUsername.getText());
        usuario.setSenha(txtSenha.getText());
        usuario.setPerfil((String) jComboBoxPerfil.getSelectedItem());
        usuario.setStatus((String) jComboBoxStatus.getSelectedItem());
        usuario.setEstado_civil((String) jComboBoxEstado_civil.getSelectedItem());
        usuario.setSexo((String) jComboBoxSexo.getSelectedItem());
        usuario.setTelefone((String)  txtTel.getText());
        usuario.setTel_alternativo((String)  txtTel_alternativo.getText());
        usuario.setCep((String)  txtCep.getText());
        usuario.setEmail((String)  txtEmail.getText());
        usuario.setDoc_militar((String)  txtDoc_Militar.getText());
        usuario.setCertidao((String)  txtCertidao.getText());
        usuario.setPai((String)  txtPai.getText());
        usuario.setMae((String)  txtMae.getText());
        usuario.setPassaporte((String)  txtPassaporte.getText());
        usuario.setColegio((String)  txtColegio.getText());
        usuario.setHorario_entrada((String)  txtHorario_entrada.getText());
        usuario.setHorario_saida((String)  txtHorario_entrada.getText());
        usuario.setRg((String)  txtRg.getText());
        usuario.setOrgao_exp((String)  txtCep.getText());
        usuario.setData_exp((String)  txtData_exp.getText());
        usuario.setBairro((String) txtBairro.getText());
        usuario.setCpf((String) txtCpf.getText());
        usuario.setEmail((String) txtEmail.getText());
        usuario.setData_nascimento((String) txtNasci.getText());
        if (txtUsername.getText().isEmpty() ||
            txtCep.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");

        }
        else{

            UsuarioDAO dao = new UsuarioDAO();
            dao.inserir(usuario);

            JOptionPane.showMessageDialog(null, "Usuario "+ txtUsername.getText()
                +" foi inserido com sucesso");

        }

       txtUsername.setText("");
        txtSenha.setText("");
        txtTel.setText("");
        txtEmail.setText("");
        txtNasci.setText("");
        txtBairro.setText("");
        txtTel_alternativo.setText("");
        txtOrgao_exp.setText("");
        txtData_exp.setText("");
        txtRg.setText("");
        txtCpf.setText("");
        txtCep.setText("");
        txtDoc_Militar.setText("");
        txtCertidao.setText("");
        txtPai.setText("");
        txtMae.setText("");
        txtPassaporte.setText("");
        txtColegio.setText("");
        txtHorario_entrada.setText("");
        txtHorario_saida.setText("");
        jComboBoxPerfil.setSelectedItem("");
        jComboBoxEstado_civil.setSelectedItem("");
        jComboBoxStatus.setSelectedItem("");
        jComboBoxSexo.setSelectedItem("");
        carregaTabela();
    }//GEN-LAST:event_btnInserirUsuarioActionPerformed

    private void btnLimparUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparUsuarioActionPerformed
        txtId.setText("");
        txtUsername.setText("");
        txtSenha.setText("");
        txtTel.setText("");
        txtEmail.setText("");
        txtNasci.setText("");
        txtBairro.setText("");
        txtTel_alternativo.setText("");
        txtOrgao_exp.setText("");
        txtData_exp.setText("");
        txtRg.setText("");
        txtCpf.setText("");
        txtCep.setText("");
        txtDoc_Militar.setText("");
        txtCertidao.setText("");
        txtPassaporte.setText("");
        txtColegio.setText("");
        txtPai.setText("");
        txtMae.setText("");
        txtHorario_entrada.setText("");
        txtHorario_saida.setText("");
        jComboBoxPerfil.setSelectedItem("");
        jComboBoxEstado_civil.setSelectedItem("");
        jComboBoxStatus.setSelectedItem("");
        jComboBoxSexo.setSelectedItem("");
        carregaTabela();
    }//GEN-LAST:event_btnLimparUsuarioActionPerformed

    private void btnApagarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarUsuarioActionPerformed

        if (txtId.getText().isEmpty()) { //jTextField6 se refere ao campo de texto do ID
            JOptionPane.showMessageDialog(null, "Digite o ID.");
        }
        else {
            try {
                //Registra JDBC driver
                Class.forName("com.mysql.jdbc.Driver");
                //Abrindo a conexão
                Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost/transporte?useTimezone=true"+"&serverTimezone=UTC","root","12345");
                //Executa a query de exclusão
                java.sql.Statement st = conn.createStatement();
                st.executeUpdate("DELETE FROM usuarios WHERE id='" + this.txtId.getText() + "'");
                JOptionPane.showMessageDialog(rootPane, "Usuário excluído com sucesso!");
            }
            catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }//Fim try
        txtUsername.setText("");
        txtSenha.setText("");
        txtTel.setText("");
        txtEmail.setText("");
        txtNasci.setText("");
        txtBairro.setText("");
        txtTel_alternativo.setText("");
        txtOrgao_exp.setText("");
        txtData_exp.setText("");
        txtRg.setText("");
        txtCpf.setText("");
        txtPassaporte.setText("");
        txtColegio.setText("");
        txtCep.setText("");
        txtDoc_Militar.setText("");
        txtCertidao.setText("");
        txtPai.setText("");
        txtMae.setText("");
        txtHorario_entrada.setText("");
        txtHorario_saida.setText("");
        jComboBoxPerfil.setSelectedItem("");
        jComboBoxEstado_civil.setSelectedItem("");
        jComboBoxStatus.setSelectedItem("");
        jComboBoxSexo.setSelectedItem("");
            carregaTabela();

        }
    }//GEN-LAST:event_btnApagarUsuarioActionPerformed

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed

      txtId.setEnabled(false);
        btnPesquisarUsuario.setEnabled(false);
        btnNovoUsuario.setEnabled(false);
        btnInserirUsuario.setEnabled(true);
        btnAtualizarUsuario.setEnabled(true);
        btnApagarUsuario.setEnabled(true);
        txtUsername.setEnabled(true);
        txtSenha.setEnabled(true);
        jComboBoxPerfil.setEnabled(true);
        jComboBoxSexo.setEnabled(true);
        jComboBoxStatus.setEnabled(true);
        jComboBoxEstado_civil.setEnabled(true);
        txtTel.setEnabled(true);
        txtEmail.setEnabled(true);
        txtNasci.setEnabled(true);
        txtBairro.setEnabled(true);
        txtCep.setEnabled(true);
        txtCpf.setEnabled(true);
        txtRg.setEnabled(true);
        txtTel_alternativo.setEnabled(true);
        txtData_exp.setEnabled(true);
        txtOrgao_exp.setEnabled(true);
        txtDoc_Militar.setEnabled(true);
        txtCertidao.setEnabled(true);
        txtPai.setEnabled(true);
        txtMae.setEnabled(true);
        txtPassaporte.setEnabled(true);
        txtColegio.setEnabled(true);
        txtHorario_entrada.setEnabled(true);
        txtHorario_saida.setEnabled(true);

        carregaTabela();
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    private void btnVoltarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarUsuarioActionPerformed

        txtId.setEnabled(true);
        btnPesquisarUsuario.setEnabled(true);
        btnNovoUsuario.setEnabled(true);
        btnInserirUsuario.setEnabled(false);
        btnAtualizarUsuario.setEnabled(false);
        btnApagarUsuario.setEnabled(false);
        txtUsername.setEnabled(false);
        jComboBoxPerfil.setEnabled(false);
        txtId.setText("");
        txtUsername.setText("");
        txtSenha.setText("");
        txtTel.setEnabled(false);
        txtEmail.setEnabled(false);
        txtNasci.setEnabled(true);
        txtBairro.setEnabled(false);
        txtNasci.setEnabled(false);
        carregaTabela();
    }//GEN-LAST:event_btnVoltarUsuarioActionPerformed

    private void jUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUsuariosMouseClicked

        txtId.setEnabled(true);
        btnPesquisarUsuario.setEnabled(true);
        btnInserirUsuario.setEnabled(true);
        btnAtualizarUsuario.setEnabled(true);
        btnApagarUsuario.setEnabled(true);
        jComboBoxPerfil.setEnabled(true);

        int linha = jUsuarios.getSelectedRow(); // retorna a linha selecionada pelo usuario
        txtId.setText(jUsuarios.getValueAt(linha,0).toString()); // retorna o valor da celula linha X 0
        txtUsername.setText(jUsuarios.getValueAt(linha,1).toString()); // retorna o valor da celula linha X 1
        txtSenha.setText(jUsuarios.getValueAt(linha,2).toString());
        jComboBoxStatus.setSelectedItem(jUsuarios.getValueAt(linha,3).toString()); // retorna o valor da celula linha X 2
    }//GEN-LAST:event_jUsuariosMouseClicked

    private void txtData_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtData_expActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtData_expActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtTel_alternativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTel_alternativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTel_alternativoActionPerformed

    private void txtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRgActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtHorario_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorario_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorario_entradaActionPerformed

    private void txtHorario_saidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorario_saidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorario_saidaActionPerformed

    private void btnPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarUsuarioActionPerformed
        txtId.setEnabled(true);
        btnPesquisarUsuario.setEnabled(true);
        btnInserirUsuario.setEnabled(false);
        btnAtualizarUsuario.setEnabled(true);
        btnApagarUsuario.setEnabled(true);
        txtUsername.setEnabled(true);
        txtSenha.setEnabled(true);
        jComboBoxPerfil.setEnabled(true);
        jComboBoxSexo.setEnabled(true);
        jComboBoxStatus.setEnabled(true);
        jComboBoxEstado_civil.setEnabled(true);
        txtTel.setEnabled(true);
        txtEmail.setEnabled(true);
        txtNasci.setEnabled(true);
        txtBairro.setEnabled(true);
        txtCep.setEnabled(true);
        txtCpf.setEnabled(true);
        txtRg.setEnabled(true);
        txtTel_alternativo.setEnabled(true);
        txtData_exp.setEnabled(true);
        txtOrgao_exp.setEnabled(true);
        txtDoc_Militar.setEnabled(true);
        txtCertidao.setEnabled(true);
        txtPai.setEnabled(true);
        txtMae.setEnabled(true);
        txtPassaporte.setEnabled(true);
        txtColegio.setEnabled(true);
        txtHorario_entrada.setEnabled(true);
        txtHorario_saida.setEnabled(true);

        if (txtId.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "Digite o ID para busca!");

        }else{

            Usuario usuario = new Usuario();

            usuario.setId(Integer.parseInt(txtId.getText()));

            UsuarioDAO dao = new UsuarioDAO();

            usuario = dao.consultar(usuario);

            if(usuario!=null){

                txtData_exp.setText(usuario.getData_exp());
                jComboBoxPerfil.setSelectedItem(usuario.getPerfil());
                jComboBoxStatus.setSelectedItem(usuario.getStatus());
                jComboBoxSexo.setSelectedItem(usuario.getSexo());
                jComboBoxEstado_civil.setSelectedItem(usuario.getEstado_civil());
                txtCpf.setText(usuario.getCpf());
                txtEmail.setText(usuario.getEmail());
                txtNasci.setText(usuario.getData_nascimento());
                txtTel.setText(usuario.getTelefone());
                txtTel_alternativo.setText(usuario.getTel_alternativo());
                txtUsername.setText(usuario.getUsername());
                txtSenha.setText(usuario.getSenha());
                txtOrgao_exp.setText(usuario.getOrgao_exp());
                txtBairro.setText(usuario.getBairro());
                txtCertidao.setText(usuario.getCertidao());
                txtCep.setText(usuario.getCep());
                txtDoc_Militar.setText(usuario.getDoc_militar());
                txtRg.setText(usuario.getRg());
                txtPai.setText(usuario.getPai());
                txtMae.setText(usuario.getMae());
                txtPassaporte.setText(usuario.getPassaporte());
                txtColegio.setText(usuario.getColegio());
                txtHorario_entrada.setText(usuario.getHorario_entrada());
                txtHorario_saida.setText(usuario.getHorario_saida());

            }

            else{

                JOptionPane.showMessageDialog(null, "Id Inválido");

            }
            {

            }
            carregaTabela();
        }
    }//GEN-LAST:event_btnPesquisarUsuarioActionPerformed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        TabelaDePagamento tp = new TabelaDePagamento();
        tp.show();
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
      CadastroVeiculo cadastroveic = new CadastroVeiculo();
        cadastroveic.show();
    }//GEN-LAST:event_jLabel31MouseClicked

    private void txtNasciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNasciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNasciActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }
    
      private void carregaTabela(){
        
        DefaultTableModel modelo = (DefaultTableModel) jUsuarios.getModel();
        modelo.setNumRows(0);
        
        jUsuarios.getColumnModel().getColumn(0).setPreferredWidth(20);
        jUsuarios.getColumnModel().getColumn(1).setPreferredWidth(25);
        jUsuarios.getColumnModel().getColumn(2).setPreferredWidth(25);
        jUsuarios.getColumnModel().getColumn(3).setPreferredWidth(25);
        
        
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/transporte?useTimezone=true"+"&serverTimezone=UTC","root","12345");
            PreparedStatement pstm;
            ResultSet rs;
            pstm = conn.prepareStatement("select*from usuarios where perfil = 'Usuário'");
            rs  = pstm.executeQuery();
            
            while(rs.next()){
                modelo.addRow(new Object[]{
                    
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                   
                    
                    
                    
                
            });
            }
            pstm.close();
            conn.close();
            
            
        } catch (Exception ErroSql) {
            
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados da tabela" + ErroSql, "Erro", JOptionPane.ERROR_MESSAGE );
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Button1;
    private javax.swing.JPanel Button2;
    private javax.swing.JPanel Button3;
    private javax.swing.JPanel Button4;
    private javax.swing.JPanel Indicator1;
    private javax.swing.JPanel Indicator2;
    private javax.swing.JPanel Indicator3;
    private javax.swing.JPanel Indicator4;
    private javax.swing.JButton btnApagarUsuario;
    private javax.swing.JButton btnAtualizarUsuario;
    private javax.swing.JButton btnInserirUsuario;
    private javax.swing.JButton btnLimparUsuario;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JButton btnPesquisarUsuario;
    private javax.swing.JButton btnVoltarUsuario;
    private javax.swing.JComboBox<String> jComboBoxEstado_civil;
    private javax.swing.JComboBox<String> jComboBoxPerfil;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose1;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jUsuarios;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCertidao;
    private javax.swing.JTextField txtColegio;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtData_exp;
    private javax.swing.JTextField txtDoc_Militar;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtHorario_entrada;
    private javax.swing.JFormattedTextField txtHorario_saida;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMae;
    private javax.swing.JFormattedTextField txtNasci;
    private javax.swing.JTextField txtOrgao_exp;
    private javax.swing.JTextField txtPai;
    private javax.swing.JTextField txtPassaporte;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtTel;
    private javax.swing.JFormattedTextField txtTel_alternativo;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

      public JButton getBtnLogin() {
        return btnNovoUsuario;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnNovoUsuario = btnLogin;
    } 

    public JTextField getTxtUsername() {
        return txtId;
    }

    public void setTxtUsername(JTextField txtUsername) {
        this.txtId = txtUsername;
    }

    public JComboBox<String> getjComboBoxPerfil() {
        return jComboBoxSexo;
    }

    public void setjComboBoxPerfil(JComboBox<String> jComboBoxPerfil) {
        this.jComboBoxSexo = jComboBoxPerfil;
    }

}


