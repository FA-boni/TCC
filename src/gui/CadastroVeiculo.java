
package gui;

import com.sun.org.apache.bcel.internal.generic.CPInstruction;
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
import gui.CadastroUsuario;
import gui.TabelaDePagamento;
import gui.MenuMotorista;
import javax.swing.table.DefaultTableModel;
import model.Usuario;

public class CadastroVeiculo extends javax.swing.JFrame {

    private final UsuarioDAO controller;
    
    public CadastroVeiculo() {
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
                  resultado.getString("perfil"),
                  
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
        jLabel8 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
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
        txtPlaca = new javax.swing.JTextField();
        txtChassi = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtCor_veiculo = new javax.swing.JTextField();
        txtVersao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jComboBoxTipo_veiculo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtResponsavel_veiculo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxCombustivel = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtPotencia = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtAno_fabricaçao = new javax.swing.JTextField();
        txtModelo_veiculo = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jUsuarios = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnAtualizarUsuario = new javax.swing.JButton();
        btnInserirUsuario = new javax.swing.JButton();
        btnLimparUsuario = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnApagarUsuario = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        btnNovoUsuario = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btnVoltarUsuario = new javax.swing.JButton();

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
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-document-writer-36.png"))); // NOI18N
        jLabel8.setText("Cadastro de clientes");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 204, 204));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-relatório-gráfico-36.png"))); // NOI18N
        jLabel30.setText("Tabela de Alunos");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 220, 40));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 204, 204));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-transporte-terrestre-36.png"))); // NOI18N
        jLabel31.setText("Cadastro de Veículos");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 220, -1));

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
        jPanel8.setBounds(1730, 0, 180, 41);

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
        jLabel11.setBounds(0, 0, 650, 40);

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
        txtId.setBounds(0, 0, 790, 40);

        jSeparator1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 40, 790, 20);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel16.setForeground(new java.awt.Color(0, 204, 204));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 204, 204));
        jLabel16.setText("Dados do Veículo");

        txtPlaca.setBackground(new java.awt.Color(238, 238, 238));
        txtPlaca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPlaca.setEnabled(false);
        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });

        txtChassi.setBackground(new java.awt.Color(238, 238, 238));
        txtChassi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtChassi.setEnabled(false);
        txtChassi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtChassiKeyTyped(evt);
            }
        });

        txtAno.setBackground(new java.awt.Color(238, 238, 238));
        txtAno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAno.setEnabled(false);
        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });
        txtAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnoKeyTyped(evt);
            }
        });

        txtCor_veiculo.setBackground(new java.awt.Color(238, 238, 238));
        txtCor_veiculo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCor_veiculo.setEnabled(false);
        txtCor_veiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCor_veiculoKeyTyped(evt);
            }
        });

        txtVersao.setBackground(new java.awt.Color(238, 238, 238));
        txtVersao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVersao.setEnabled(false);
        txtVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVersaoActionPerformed(evt);
            }
        });
        txtVersao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVersaoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Cor:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Modelo:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Número do Chassi:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Placa:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Ano:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Versão:");

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
                        .addGap(33, 33, 33)
                        .addComponent(jLabel15))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel12.setForeground(new java.awt.Color(0, 204, 204));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 204, 204));
        jLabel36.setText("Tipo do Veículo");

        jComboBoxTipo_veiculo.setBackground(new java.awt.Color(238, 238, 238));
        jComboBoxTipo_veiculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxTipo_veiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Van Ampliada(20 lugares)", "Van Simples(15 lugares)", "Carro de Passeio (4 lugares)", "Carro de Passeio (7 lugares)" }));
        jComboBoxTipo_veiculo.setEnabled(false);
        jComboBoxTipo_veiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipo_veiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBoxTipo_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel36)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxTipo_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Responsável:");

        txtResponsavel_veiculo.setBackground(new java.awt.Color(238, 238, 238));
        txtResponsavel_veiculo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtResponsavel_veiculo.setEnabled(false);
        txtResponsavel_veiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResponsavel_veiculoKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Combustível:");

        jComboBoxCombustivel.setBackground(new java.awt.Color(238, 238, 238));
        jComboBoxCombustivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Álcool", "Gás", "Diesel", "Total Flex" }));
        jComboBoxCombustivel.setEnabled(false);
        jComboBoxCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCombustivelActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Potência:");

        txtPotencia.setBackground(new java.awt.Color(238, 238, 238));
        txtPotencia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPotencia.setEnabled(false);
        txtPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPotenciaActionPerformed(evt);
            }
        });
        txtPotencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPotenciaKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Ano de Fabricação:");

        txtAno_fabricaçao.setBackground(new java.awt.Color(238, 238, 238));
        txtAno_fabricaçao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAno_fabricaçao.setEnabled(false);
        txtAno_fabricaçao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAno_fabricaçaoActionPerformed(evt);
            }
        });
        txtAno_fabricaçao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAno_fabricaçaoKeyTyped(evt);
            }
        });

        txtModelo_veiculo.setBackground(new java.awt.Color(238, 238, 238));
        txtModelo_veiculo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtModelo_veiculo.setEnabled(false);
        txtModelo_veiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModelo_veiculoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(143, 143, 143)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAno_fabricaçao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCor_veiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(283, 283, 283)))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResponsavel_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(57, 57, 57))))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtModelo_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtCor_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResponsavel_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAno_fabricaçao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel16);
        jPanel16.setBounds(20, 50, 900, 630);

        jPanel9.setBackground(new java.awt.Color(0, 204, 204));

        jLabelClose.setBackground(new java.awt.Color(204, 204, 204));
        jLabelClose.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(jLabelMin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose)
                    .addComponent(jLabelMin1))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel9);
        jPanel9.setBounds(920, 0, 180, 41);

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
        jScrollPane1.setBounds(310, 700, 610, 270);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Editar");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(190, 820, 40, 30);

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
        btnAtualizarUsuario.setBounds(180, 780, 60, 41);

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
        btnInserirUsuario.setBounds(180, 700, 60, 41);

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
        btnLimparUsuario.setBounds(100, 700, 60, 41);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Limpar");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(110, 740, 50, 20);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Inserir");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(190, 740, 50, 20);

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
        btnApagarUsuario.setBounds(20, 700, 62, 41);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Apagar");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(30, 740, 50, 20);

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
        btnNovoUsuario.setBounds(20, 780, 60, 41);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Novo Usuário");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(10, 820, 90, 30);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Voltar");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(110, 820, 40, 30);

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
        btnVoltarUsuario.setBounds(100, 780, 60, 41);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1700, 1150));

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

    private void btnPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarUsuarioActionPerformed
        txtId.setEnabled(true);
        btnPesquisarUsuario.setEnabled(true);
        btnNovoUsuario.setEnabled(true);
        btnInserirUsuario.setEnabled(false);
        btnAtualizarUsuario.setEnabled(true);
        btnApagarUsuario.setEnabled(true);

        if (txtId.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "Digite o ID para busca!");

        }else{

            Usuario usuario = new Usuario();

            usuario.setId(Integer.parseInt(txtId.getText()));

            UsuarioDAO dao = new UsuarioDAO();

            usuario = dao.consultar(usuario);

            if(usuario!=null){

                txtCor_veiculo.setText(usuario.getCor_veiculo());
                txtChassi.setText(usuario.getChassi());
                txtAno.setText(usuario.getAno());
                txtPlaca.setText(usuario.getPlaca());
                txtAno_fabricaçao.setText(usuario.getAno_fabricaçao());
                txtModelo_veiculo.setText(usuario.getModelo_veiculo());
                txtResponsavel_veiculo.setText(usuario.getResponsavel_veiculo());
                txtVersao.setText(usuario.getVersao());
                txtPotencia.setText(usuario.getPotencia());
                jComboBoxStatus.setSelectedItem(usuario.getStatus());
                jComboBoxTipo_veiculo.setSelectedItem(usuario.getTipo_veiculo());
                jComboBoxCombustivel.setSelectedItem(usuario.getCombustivel());
            }

            else{

                JOptionPane.showMessageDialog(null, "Id Inválido");

            }
            {

            }
            carregaTabela();
        }
    }//GEN-LAST:event_btnPesquisarUsuarioActionPerformed

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

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        CadastroUsuario cadastrouser = new CadastroUsuario();
        cadastrouser.show();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jComboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxStatusActionPerformed

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtChassiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChassiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChassiKeyTyped

    private void txtAnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoKeyTyped

    private void txtCor_veiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCor_veiculoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCor_veiculoKeyTyped

    private void txtVersaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVersaoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVersaoKeyTyped

    private void jComboBoxTipo_veiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipo_veiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipo_veiculoActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void txtVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVersaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVersaoActionPerformed

    private void txtResponsavel_veiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResponsavel_veiculoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResponsavel_veiculoKeyTyped

    private void jComboBoxCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCombustivelActionPerformed

    private void txtPotenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPotenciaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPotenciaKeyTyped

    private void txtAno_fabricaçaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAno_fabricaçaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAno_fabricaçaoActionPerformed

    private void txtAno_fabricaçaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAno_fabricaçaoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAno_fabricaçaoKeyTyped

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin1MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin1MouseClicked

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

        txtId.setEnabled(true);
        btnPesquisarUsuario.setEnabled(true);
        btnInserirUsuario.setEnabled(true);
        btnAtualizarUsuario.setEnabled(true);
        btnApagarUsuario.setEnabled(true);

        int linha = jUsuarios.getSelectedRow(); // retorna a linha selecionada pelo usuario
        txtId.setText(jUsuarios.getValueAt(linha,0).toString()); // retorna o valor da celula linha X 0
        txtCor_veiculo.setText(jUsuarios.getValueAt(linha,1).toString()); // retorna o valor da celula linha X 1
        txtModelo_veiculo.setText(jUsuarios.getValueAt(linha,2).toString());
        txtPlaca.setText(jUsuarios.getValueAt(linha,3).toString());
    }//GEN-LAST:event_jUsuariosMouseClicked

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
                    + "',modelo_veiculo='" + this.txtModelo_veiculo.getText()
                    + "',cor_veiculo='" + this.txtCor_veiculo.getText()
                    + "',placa='" + this.txtPlaca.getText()
                    + "',chassi='" + this.txtChassi.getText()
                    + "',ano='" + this.txtAno.getText()
                    + "',ano_fabricaçao='" + this.txtAno_fabricaçao.getText()
                    + "',versao='" + this.txtVersao.getText()
                    + "',responsavel_veiculo='" + this.txtResponsavel_veiculo.getText() 
                    + "',tipo_veiculo='" + this.jComboBoxTipo_veiculo.getSelectedItem()
                    + "',combustivel='" + this.jComboBoxCombustivel.getSelectedItem()
                    + "',status='" + this.jComboBoxStatus.getSelectedItem()
                    + "' WHERE id='" + this.txtId.getText() + "'");
                JOptionPane.showMessageDialog(rootPane, "Usuário atualizado com sucesso!");
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }//Fim try
            txtAno_fabricaçao.setText("");
            jComboBoxCombustivel.setSelectedItem("");

        }
        carregaTabela();
    }//GEN-LAST:event_btnAtualizarUsuarioActionPerformed

    private void btnInserirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirUsuarioActionPerformed

     Usuario usuario = new Usuario();
        usuario.setModelo_veiculo(txtModelo_veiculo.getText());
        usuario.setCor_veiculo(txtCor_veiculo.getText());
        usuario.setTipo_veiculo((String) jComboBoxTipo_veiculo.getSelectedItem());
        usuario.setPlaca((String)  txtPlaca.getText());
        usuario.setChassi((String)  txtChassi.getText());
        usuario.setAno((String) txtAno.getText());
        usuario.setAno_fabricaçao((String) txtAno_fabricaçao.getText());
        usuario.setVersao((String) txtVersao.getText());
        usuario.setPotencia((String) txtPotencia.getText());
        usuario.setResponsavel_veiculo((String) txtResponsavel_veiculo.getText());
        usuario.setCombustivel((String) jComboBoxCombustivel.getSelectedItem());
        usuario.setStatus((String) jComboBoxStatus.getSelectedItem());

        if (txtCor_veiculo.getText().isEmpty() ||
            txtPlaca.getText().isEmpty() ||
            txtModelo_veiculo.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");

        }
        else{

            UsuarioDAO dao = new UsuarioDAO();
            dao.inserir(usuario);

            JOptionPane.showMessageDialog(null, "Veículo "+ txtModelo_veiculo.getText()
                +" foi inserido com sucesso");

        }

        txtCor_veiculo.setText("");
        txtAno.setText("");
        txtPlaca.setText("");
        txtChassi.setText("");
        txtResponsavel_veiculo.setText("");
        txtVersao.setText("");
        txtModelo_veiculo.setText("");
        txtAno_fabricaçao.setText("");
        txtPotencia.setText("");
        
        carregaTabela();
    }//GEN-LAST:event_btnInserirUsuarioActionPerformed

    private void btnLimparUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparUsuarioActionPerformed

        txtId.setText("");
        txtCor_veiculo.setText("");
        txtAno.setText("");
        txtPlaca.setText("");
        txtChassi.setText("");
        txtResponsavel_veiculo.setText("");
        txtVersao.setText("");
        txtModelo_veiculo.setText("");
        txtAno_fabricaçao.setText("");
        txtPotencia.setText("");
  
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
        txtCor_veiculo.setText("");
        txtAno.setText("");
        txtPlaca.setText("");
        txtChassi.setText("");
        txtResponsavel_veiculo.setText("");
        txtVersao.setText("");
        txtModelo_veiculo.setText("");
        txtAno_fabricaçao.setText("");
        txtPotencia.setText("");
            carregaTabela();

        }
    }//GEN-LAST:event_btnApagarUsuarioActionPerformed

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed

      txtId.setEnabled(true);
        btnPesquisarUsuario.setEnabled(true);
        btnNovoUsuario.setEnabled(true);
        btnInserirUsuario.setEnabled(true);
        btnAtualizarUsuario.setEnabled(true);
        btnApagarUsuario.setEnabled(true);
        txtCor_veiculo.setEnabled(true);
        txtModelo_veiculo.setEnabled(true);
        jComboBoxTipo_veiculo.setEnabled(true);
        jComboBoxCombustivel.setEnabled(true);
        jComboBoxStatus.setEnabled(true);
        txtPlaca.setEnabled(true);
        txtChassi.setEnabled(true);
        txtResponsavel_veiculo.setEnabled(true);
        txtAno.setEnabled(true);
        txtAno_fabricaçao.setEnabled(true);
        txtPotencia.setEnabled(true);
        txtVersao.setEnabled(true);

        carregaTabela();
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    private void btnVoltarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarUsuarioActionPerformed

        txtId.setEnabled(true);
        btnPesquisarUsuario.setEnabled(true);
        btnNovoUsuario.setEnabled(true);
        btnInserirUsuario.setEnabled(false);
        btnAtualizarUsuario.setEnabled(false);
        btnApagarUsuario.setEnabled(false);
        txtCor_veiculo.setEnabled(false);
        jComboBoxTipo_veiculo.setEnabled(false);
        txtId.setText("");
        txtCor_veiculo.setEnabled(false);
        txtPlaca.setEnabled(false);
        txtChassi.setEnabled(false);
        txtAno.setEnabled(true);
        txtVersao.setEnabled(false);
        txtResponsavel_veiculo.setEnabled(false);
        
        carregaTabela();
    }//GEN-LAST:event_btnVoltarUsuarioActionPerformed

    private void txtModelo_veiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModelo_veiculoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelo_veiculoKeyTyped

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void txtPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPotenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPotenciaActionPerformed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
     TabelaDePagamento tp = new TabelaDePagamento();
        tp.show();
    }//GEN-LAST:event_jLabel30MouseClicked

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
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVeiculo().setVisible(true);
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
            pstm = conn.prepareStatement("select*from usuarios");
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
    private javax.swing.JComboBox<String> jComboBoxCombustivel;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JComboBox<String> jComboBoxTipo_veiculo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelClose1;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelMin1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jUsuarios;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAno_fabricaçao;
    private javax.swing.JTextField txtChassi;
    private javax.swing.JTextField txtCor_veiculo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtModelo_veiculo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPotencia;
    private javax.swing.JTextField txtResponsavel_veiculo;
    private javax.swing.JTextField txtVersao;
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

}


