
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
import gui.Login;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import gui.MenuAdmin;
import gui.MenuMotorista;
import gui.RelatoriosDeVenda;
import gui.Login;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.Usuario;

public class CadastroMotorista extends javax.swing.JFrame {

    private final UsuarioDAO controller;
    
    public CadastroMotorista() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Button1 = new javax.swing.JPanel();
        Indicator1 = new javax.swing.JPanel();
        Button2 = new javax.swing.JPanel();
        Indicator2 = new javax.swing.JPanel();
        Button3 = new javax.swing.JPanel();
        Indicator3 = new javax.swing.JPanel();
        Button4 = new javax.swing.JPanel();
        Indicator4 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Button5 = new javax.swing.JPanel();
        Indicator5 = new javax.swing.JPanel();
        Button7 = new javax.swing.JPanel();
        Indicator7 = new javax.swing.JPanel();
        Button8 = new javax.swing.JPanel();
        Indicator8 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        Button9 = new javax.swing.JPanel();
        Indicator9 = new javax.swing.JPanel();
        Button10 = new javax.swing.JPanel();
        Indicator10 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jUsuarios = new javax.swing.JTable();
        btnPesquisarUsuario = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel16 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtTipo_sanguineo = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jComboBoxPerfil = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jComboBoxEstado_civil = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtNacionalidade = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtTel = new javax.swing.JFormattedTextField();
        txtNasci = new javax.swing.JFormattedTextField();
        txtTel_alternativo = new javax.swing.JFormattedTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtOrgao_exp = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtData_exp = new javax.swing.JFormattedTextField();
        txtRg = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtCnh = new javax.swing.JFormattedTextField();
        btnNovoUsuario = new javax.swing.JButton();
        btnAtualizarUsuario = new javax.swing.JButton();
        btnInserirUsuario = new javax.swing.JButton();
        btnVoltarUsuario = new javax.swing.JButton();
        btnApagarUsuario = new javax.swing.JButton();
        btnLimparUsuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
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

        Button8.setBackground(new java.awt.Color(255, 255, 255));
        Button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button8MouseExited(evt);
            }
        });

        Indicator8.setBackground(new java.awt.Color(204, 0, 204));
        Indicator8.setOpaque(false);

        javax.swing.GroupLayout Indicator8Layout = new javax.swing.GroupLayout(Indicator8);
        Indicator8.setLayout(Indicator8Layout);
        Indicator8Layout.setHorizontalGroup(
            Indicator8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator8Layout.setVerticalGroup(
            Indicator8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 204, 204));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-relatório-gráfico-36.png"))); // NOI18N
        jLabel38.setText("Tabela de Motoristas");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Button8Layout = new javax.swing.GroupLayout(Button8);
        Button8.setLayout(Button8Layout);
        Button8Layout.setHorizontalGroup(
            Button8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button8Layout.createSequentialGroup()
                .addComponent(Indicator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Button8Layout.setVerticalGroup(
            Button8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Button8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(Button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 331, 232, -1));
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 39, -1, -1));
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 57, -1, -1));

        jPanel18.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        jPanel19.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 40));

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

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 255, 255));
        jLabel36.setText("Backup");
        jLabel36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel36KeyPressed(evt);
            }
        });
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, 24));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 204));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-administrador-do-sistema-masculino-36.png"))); // NOI18N
        jLabel12.setText("Administrador");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 255, 255));
        jLabel40.setText("Acessar Administrador");
        jLabel40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel40KeyPressed(evt);
            }
        });
        jPanel3.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, 24));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/logo sem fundo diminuida.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 240, 150));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 204, 204));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-document-writer-36.png"))); // NOI18N
        jLabel26.setText("Cadastro de clientes");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 255, 255));
        jLabel42.setText("Acessar Motorista");
        jLabel42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel42KeyPressed(evt);
            }
        });
        jPanel3.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, 24));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 204, 204));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-página-inicial-36.png"))); // NOI18N
        jLabel25.setText("Home");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jLabel25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel25KeyPressed(evt);
            }
        });
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 1110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 1090));

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
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(0, 204, 204));

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
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose)
                    .addComponent(jLabelMin))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, -1));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 740, 320));

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
        jPanel2.add(btnPesquisarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 70, 40));

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
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 40));

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
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 760, 20));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel16.setForeground(new java.awt.Color(0, 204, 204));

        jLabel99.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 204, 204));
        jLabel99.setText("Dados Pessoais");

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Senha:");

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

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Telefone Alternativo:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Tipo Sanguíneo:");

        txtTipo_sanguineo.setBackground(new java.awt.Color(238, 238, 238));
        txtTipo_sanguineo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTipo_sanguineo.setEnabled(false);
        txtTipo_sanguineo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipo_sanguineoKeyTyped(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel15.setForeground(new java.awt.Color(0, 204, 204));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 204, 204));
        jLabel37.setText("Perfil");

        jComboBoxPerfil.setBackground(new java.awt.Color(238, 238, 238));
        jComboBoxPerfil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motorista", "Administrador", "Usuário" }));
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
                .addGap(29, 29, 29)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
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
                        .addContainerGap()
                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel15)))
                .addContainerGap(19, Short.MAX_VALUE))
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
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outros" }));
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

        jComboBoxEstado_civil.setBackground(new java.awt.Color(238, 238, 238));
        jComboBoxEstado_civil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxEstado_civil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado" }));
        jComboBoxEstado_civil.setEnabled(false);
        jComboBoxEstado_civil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstado_civilActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("CEP:");

        txtCep.setBackground(new java.awt.Color(238, 238, 238));
        txtCep.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCep.setEnabled(false);
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCepKeyTyped(evt);
            }
        });

        txtBairro.setBackground(new java.awt.Color(238, 238, 238));
        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBairro.setEnabled(false);
        txtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBairroKeyTyped(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Nacionalidade:");

        txtNacionalidade.setBackground(new java.awt.Color(238, 238, 238));
        txtNacionalidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNacionalidade.setEnabled(false);
        txtNacionalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadeActionPerformed(evt);
            }
        });
        txtNacionalidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNacionalidadeKeyTyped(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("Endereço:");

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

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(txtCep)
                            .addComponent(txtTel)
                            .addComponent(txtTel_alternativo)
                            .addComponent(txtUsername)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTipo_sanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNasci, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(26, 26, 26)
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBoxEstado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNacionalidade)))
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel99)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTel_alternativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxEstado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNasci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipo_sanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 680, -1));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel17.setForeground(new java.awt.Color(0, 204, 204));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 204, 204));
        jLabel18.setText("Documentos");

        txtOrgao_exp.setBackground(new java.awt.Color(238, 238, 238));
        txtOrgao_exp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtOrgao_exp.setEnabled(false);
        txtOrgao_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrgao_expActionPerformed(evt);
            }
        });
        txtOrgao_exp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrgao_expKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Orgão Exp:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("RG:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Data Exp:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("CPF:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("CNH:");

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

        txtCnh.setBackground(new java.awt.Color(238, 238, 238));
        try {
            txtCnh.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel18))
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(208, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCnh, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRg, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOrgao_exp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, Short.MAX_VALUE)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtData_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(119, 119, 119))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrgao_exp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );

        jPanel2.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 410, 470));

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
        jPanel2.add(btnNovoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 703, 60, -1));

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
        jPanel2.add(btnAtualizarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 703, 60, -1));

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
        jPanel2.add(btnInserirUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 623, 60, -1));

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
        jPanel2.add(btnVoltarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 703, 60, -1));

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
        jPanel2.add(btnApagarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 623, 62, -1));

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
        jPanel2.add(btnLimparUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 623, 60, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Inserir");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 663, 50, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Editar");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 743, 40, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Limpar");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 663, 50, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Apagar");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 663, 50, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Novo Usuário");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 743, 90, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Voltar");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 743, 40, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1740, 1100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUsuariosMouseClicked


        txtId.setEnabled(true);
        btnPesquisarUsuario.setEnabled(true);
        txtCnh.setEnabled(true);
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

    private void btnPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarUsuarioActionPerformed
        txtId.setEnabled(true);
        btnPesquisarUsuario.setEnabled(true);
        txtCnh.setEnabled(true);
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
        txtTel.setEnabled(true);
        txtBairro.setEnabled(true);
        txtCep.setEnabled(true);
        txtCpf.setEnabled(true);
        txtRg.setEnabled(true);
        txtTel_alternativo.setEnabled(true);
        txtData_exp.setEnabled(true);
        txtOrgao_exp.setEnabled(true);
        txtTipo_sanguineo.setEnabled(true);
        txtNacionalidade.setEnabled(true);
        
        
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
                txtTel.setText(usuario.getData_nascimento());
                txtTel.setText(usuario.getTelefone());
                txtTel_alternativo.setText(usuario.getTel_alternativo());
                txtUsername.setText(usuario.getUsername());
                txtSenha.setText(usuario.getSenha());
                txtOrgao_exp.setText(usuario.getOrgao_exp());
                txtBairro.setText(usuario.getBairro());
                txtTipo_sanguineo.setText(usuario.getTipo_sanguineo());
                txtCep.setText(usuario.getCep());
                txtNacionalidade.setText(usuario.getNacionalidade());
                txtCnh.setText(usuario.getCnh());
                txtRg.setText(usuario.getRg());
                
                
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

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

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
        txtTel.setEnabled(true);
        txtBairro.setEnabled(true);
        txtCnh.setEnabled(true);
        txtCep.setEnabled(true);
        txtCpf.setEnabled(true);
        txtRg.setEnabled(true);
        txtTel_alternativo.setEnabled(true);
        txtData_exp.setEnabled(true);
        txtOrgao_exp.setEnabled(true);
        txtTipo_sanguineo.setEnabled(true);
        txtNacionalidade.setEnabled(true);

        carregaTabela();
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

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
                    + "',data_nascimento='" + this.txtTel.getText() 
                    + "',telefone='" + this.txtTel.getText()
                    + "',tel_alternativo='" + this.txtTel_alternativo.getText() 
                    + "',orgao_exp='" + this.txtOrgao_exp.getText()
                    + "',data_exp='" + this.txtData_exp.getText()
                    + "',cnh='" + this.txtCnh.getText()
                    + "',perfil='" + this.jComboBoxPerfil.getSelectedItem()
                    + "',status='" + this.jComboBoxStatus.getSelectedItem()
                    + "',estado_civil='" + this.jComboBoxEstado_civil.getSelectedItem()
                    + "',sexo='" + this.jComboBoxSexo.getSelectedItem()
                    + "' WHERE id='" + this.txtId.getText() + "'");
                JOptionPane.showMessageDialog(rootPane, "Usuário atualizado com sucesso!");
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }//Fim try
        txtUsername.setText("");
        txtSenha.setText("");
        txtTel.setText("");
        txtEmail.setText("");
        txtTel.setText("");
        txtBairro.setText("");
        txtTel_alternativo.setText("");
        txtOrgao_exp.setText("");
        txtData_exp.setText("");
        txtRg.setText("");
        txtCpf.setText("");
        txtCnh.setText("");
        txtCep.setText("");
        txtNacionalidade.setText("");
        txtTipo_sanguineo.setText("");
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
        usuario.setTipo_sanguineo((String)  txtTipo_sanguineo.getText());
        usuario.setNacionalidade((String)  txtNacionalidade.getText());
        usuario.setRg((String)  txtRg.getText());
         usuario.setCnh((String)  txtCnh.getText());
        usuario.setOrgao_exp((String)  txtCep.getText());
        usuario.setData_exp((String)  txtData_exp.getText());
        usuario.setBairro((String) txtBairro.getText());
        usuario.setCpf((String) txtCpf.getText());
        usuario.setEmail((String) txtEmail.getText());
        usuario.setData_nascimento((String) txtTel.getText());

        if (txtUsername.getText().isEmpty() ||
            txtSenha.getText().isEmpty()){

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
        txtTel.setText("");
        txtBairro.setText("");
        txtTel_alternativo.setText("");
        txtOrgao_exp.setText("");
        txtData_exp.setText("");
        txtRg.setText("");
        txtCpf.setText("");
        txtCnh.setText("");
        txtCep.setText("");
        jComboBoxPerfil.setSelectedItem("");
        jComboBoxEstado_civil.setSelectedItem("");
        jComboBoxStatus.setSelectedItem("");
        jComboBoxSexo.setSelectedItem("");
        carregaTabela();
    }//GEN-LAST:event_btnInserirUsuarioActionPerformed

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
        txtTel_alternativo.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTel.setEnabled(false);
        txtBairro.setEnabled(false);
        txtTel.setEnabled(false);
        carregaTabela();
    }//GEN-LAST:event_btnVoltarUsuarioActionPerformed

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
        txtTel.setText("");
        txtBairro.setText("");
        txtTel_alternativo.setText("");
        txtOrgao_exp.setText("");
        txtData_exp.setText("");
        txtRg.setText("");
        txtCnh.setText("");
        txtCpf.setText("");
        txtCep.setText("");
        txtNacionalidade.setText("");
        txtTipo_sanguineo.setText("");
        jComboBoxPerfil.setSelectedItem("");
        jComboBoxEstado_civil.setSelectedItem("");
        jComboBoxStatus.setSelectedItem("");
        jComboBoxSexo.setSelectedItem("");
            carregaTabela();

        }
    }//GEN-LAST:event_btnApagarUsuarioActionPerformed

    private void btnLimparUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparUsuarioActionPerformed

        txtId.setText("");
        txtUsername.setText("");
        txtSenha.setText("");
        txtTel.setText("");
        txtEmail.setText("");
        txtTel.setText("");
        txtBairro.setText("");
        txtTel_alternativo.setText("");
        txtOrgao_exp.setText("");
        txtData_exp.setText("");
        txtRg.setText("");
        txtCnh.setText("");
        txtCpf.setText("");
        txtNasci.setText("");
        txtCep.setText("");
        txtNacionalidade.setText("");
        txtTipo_sanguineo.setText("");
        jComboBoxPerfil.setSelectedItem("");
        jComboBoxEstado_civil.setSelectedItem("");
        jComboBoxStatus.setSelectedItem("");
        jComboBoxSexo.setSelectedItem("");
        carregaTabela();
    }//GEN-LAST:event_btnLimparUsuarioActionPerformed

    private void txtNacionalidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNacionalidadeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadeKeyTyped

    private void txtBairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroKeyTyped

    private void txtCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepKeyTyped

    private void jComboBoxEstado_civilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstado_civilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstado_civilActionPerformed

    private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSexoActionPerformed

    private void jComboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxStatusActionPerformed

    private void jComboBoxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPerfilActionPerformed

    private void txtTipo_sanguineoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipo_sanguineoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipo_sanguineoKeyTyped

    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void txtSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtOrgao_expKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrgao_expKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgao_expKeyTyped

    private void Button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button4MouseExited

    private void Button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseEntered
        // TODO add your handling code here:]
    }//GEN-LAST:event_Button4MouseEntered

    private void Button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseClicked

    }//GEN-LAST:event_Button4MouseClicked

    private void Button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button3MouseExited

    private void Button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button3MouseEntered

    private void Button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseClicked

    }//GEN-LAST:event_Button3MouseClicked

    private void Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button2MouseExited

    private void Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button2MouseEntered

    private void Button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseClicked

    }//GEN-LAST:event_Button2MouseClicked

    private void Button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button1MouseExited

    private void Button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button1MouseEntered

    private void Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseClicked

    }//GEN-LAST:event_Button1MouseClicked

    private void jLabel40KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel40KeyPressed
        Login loginmalaco = new Login();
        loginmalaco.show();
    }//GEN-LAST:event_jLabel40KeyPressed

    private void jLabel36KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel36KeyPressed
        Login loginmalaco = new Login();
        loginmalaco.show();
    }//GEN-LAST:event_jLabel36KeyPressed

    private void Button10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button10MouseExited

    private void Button10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button10MouseEntered

    private void Button10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button10MouseClicked

    private void Button9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button9MouseExited

    private void Button9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button9MouseEntered

    private void Button9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button9MouseClicked

    private void Button8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button8MouseExited

    private void Button8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button8MouseEntered
        // TODO add your handling code here:]
    }//GEN-LAST:event_Button8MouseEntered

    private void Button8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button8MouseClicked

    }//GEN-LAST:event_Button8MouseClicked

    private void Button7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button7MouseExited

    private void Button7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button7MouseEntered

    private void Button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseClicked

    }//GEN-LAST:event_Button7MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        CadastroMotorista cadastromotora = new CadastroMotorista();
        cadastromotora.show();
    }//GEN-LAST:event_jLabel26MouseClicked

    private void Button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button5MouseExited

    private void Button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button5MouseEntered

    private void Button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseClicked

    }//GEN-LAST:event_Button5MouseClicked

    private void jLabel25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel25KeyPressed
        MenuAdmin menuadm = new MenuAdmin();
        menuadm.show();
    }//GEN-LAST:event_jLabel25KeyPressed

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        MenuAdmin menuadm = new MenuAdmin();
        menuadm.show();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel42KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel42KeyPressed
    Login loginmalaco = new Login();
        loginmalaco.show();
    }//GEN-LAST:event_jLabel42KeyPressed

    private void txtOrgao_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrgao_expActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgao_expActionPerformed

    private void txtNacionalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadeActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtData_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtData_expActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtData_expActionPerformed

    private void txtNasciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNasciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNasciActionPerformed

    private void txtTel_alternativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTel_alternativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTel_alternativoActionPerformed

    private void txtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRgActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
      RelatoriosDeVenda rl = new RelatoriosDeVenda();
        rl.show();
    }//GEN-LAST:event_jLabel38MouseClicked

    private void txtCnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnhActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
            new CadastroMotorista().setVisible(true);
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
            pstm = conn.prepareStatement("select*from usuarios where perfil = 'Motorista'");
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
    private javax.swing.JPanel Button10;
    private javax.swing.JPanel Button2;
    private javax.swing.JPanel Button3;
    private javax.swing.JPanel Button4;
    private javax.swing.JPanel Button5;
    private javax.swing.JPanel Button7;
    private javax.swing.JPanel Button8;
    private javax.swing.JPanel Button9;
    private javax.swing.JPanel Indicator1;
    private javax.swing.JPanel Indicator10;
    private javax.swing.JPanel Indicator2;
    private javax.swing.JPanel Indicator3;
    private javax.swing.JPanel Indicator4;
    private javax.swing.JPanel Indicator5;
    private javax.swing.JPanel Indicator7;
    private javax.swing.JPanel Indicator8;
    private javax.swing.JPanel Indicator9;
    private javax.swing.JButton btnApagarUsuario;
    private javax.swing.JButton btnAtualizarUsuario;
    private javax.swing.JButton btnInserirUsuario;
    private javax.swing.JButton btnLimparUsuario;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JButton btnPesquisarUsuario;
    private javax.swing.JButton btnVoltarUsuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> jComboBoxEstado_civil;
    private javax.swing.JComboBox<String> jComboBoxPerfil;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxStatus;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jUsuarios;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JFormattedTextField txtCnh;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtData_exp;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNacionalidade;
    private javax.swing.JFormattedTextField txtNasci;
    private javax.swing.JTextField txtOrgao_exp;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtTel;
    private javax.swing.JFormattedTextField txtTel_alternativo;
    private javax.swing.JTextField txtTipo_sanguineo;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    public JPasswordField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JPasswordField txtSenha) {
        this.txtSenha = txtSenha;
    }

    

    public JTextField getTxtUsername() {
        return txtId;
    }

    public void setTxtUsername(JTextField txtUsername) {
        this.txtId = txtUsername;
    }

    public JComboBox<String> getjComboBoxPerfil() {
        return jComboBoxPerfil;
    }

    public void setjComboBoxPerfil(JComboBox<String> jComboBoxPerfil) {
        this.jComboBoxPerfil = jComboBoxPerfil;
    }

}


