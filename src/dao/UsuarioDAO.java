package dao;

import factory.Conexao;
import gui.CadastroUsuario;
import gui.Login;
import gui.MenuMotorista;
import gui.MenuAdmin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;

public class UsuarioDAO {
    
    private Connection connection;
    private int id;
    private String username;
    private String senha;
    private String perfil;
    private String email;
    private String cep;
    private String bairro;
    private String pai;
    private String mae;
    private String cpf;
    private String telefone;
    private String data_nascimento;
    private String Rg;
    private String sexo;
    private String placa;
    private String modelo_veiculo;
    private String cor_veiculo;
    private String colegio;
    private String chassi;
    private String periodo;
    private String horario_entrada;
    private String horario_saida;
    private String status;
    private String tipo_veiculo;
    private String tel_alternativo;
    private String estado_civil;
    private String tipo_sanguineo;
    private String nacionalidade;
    private String orgao_exp;
    private String data_exp;
    private String passaporte;
    private String cnh;
    private String doc_militar;
    private String certidao;
    private String numero_responsavel;
    private String ano;
    private String versao;
    private String ano_fabricaçao;
    private String combustivel;
    private String potencia;
    private String responsavel_veiculo;
    private Login gui;
    private CadastroUsuario cu;
    
    
    public UsuarioDAO(){ 
        this.connection = new Conexao().getConnection();
        
    }
    
    
    public void inserir(Usuario usuario){
    
        String sql = "INSERT INTO usuarios(username, senha, perfil, email, cep, bairro, Pai, Mae, cpf, telefone, data_nascimento, Rg, sexo, placa, modelo_veiculo, cor_veiculo, colegio, chassi, periodo, horario_entrada, horario_saida, status, tipo_veiculo, tel_alternativo, estado_civil, tipo_sanguineo, nacionalidade, orgao_exp, data_exp, passaporte, doc_militar, certidao, numero_responsavel, ano, versao, ano_fabricaçao, combustivel, potencia, responsavel_veiculo, cnh)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
       try{
           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, usuario.getUsername());
           stmt.setString(2, usuario.getSenha());
           stmt.setString(3, usuario.getPerfil());
           stmt.setString(4, usuario.getEmail());
           stmt.setString(5, usuario.getCep());
           stmt.setString(6,usuario.getBairro());
           stmt.setString(7, usuario.getPai());
           stmt.setString(8, usuario.getMae());
           stmt.setString(9, usuario.getCpf());
           stmt.setString(10, usuario.getTelefone());
           stmt.setString(11, usuario.getData_nascimento());
           stmt.setString(12, usuario.getRg());
           stmt.setString(13, usuario.getSexo());
           stmt.setString(14, usuario.getPlaca());
           stmt.setString(15, usuario.getModelo_veiculo());
           stmt.setString(16, usuario.getCor_veiculo());
           stmt.setString(17, usuario.getColegio());
           stmt.setString(18, usuario.getChassi());
           stmt.setString(19, usuario.getPeriodo());
           stmt.setString(20, usuario.getHorario_entrada());
           stmt.setString(21, usuario.getHorario_saida());
           stmt.setString(22, usuario.getStatus());
           stmt.setString(23, usuario.getTipo_veiculo());
           stmt.setString(24, usuario.getTel_alternativo());
           stmt.setString(25, usuario.getEstado_civil());
           stmt.setString(26, usuario.getTipo_sanguineo());
           stmt.setString(27, usuario.getNacionalidade());
           stmt.setString(28, usuario.getOrgao_exp());
           stmt.setString(29, usuario.getData_exp());
           stmt.setString(30, usuario.getPassaporte());
           stmt.setString(31, usuario.getDoc_militar());
           stmt.setString(32, usuario.getCertidao());
           stmt.setString(33, usuario.getNumero_responsavel());
           stmt.setString(34, usuario.getAno());
           stmt.setString(35, usuario.getVersao());
           stmt.setString(36, usuario.getAno_fabricaçao());
           stmt.setString(37, usuario.getCombustivel());
           stmt.setString(38, usuario.getPotencia());
           stmt.setString(39, usuario.getResponsavel_veiculo());
           stmt.setString(40, usuario.getCnh());
       
           stmt.execute();
           stmt.close();
            
       }
       catch(SQLException u){
           throw  new RuntimeException(u);
       } 
          
    }
     
    public Usuario consultar(Usuario usuario){
        
        Usuario consulta = new Usuario();
        String sql = "select *"
                + "from usuarios where id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,String.valueOf(usuario.getId()));
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                consulta.setUsername(rs.getString(2));
                consulta.setSenha(rs.getString(3));
                consulta.setPerfil(rs.getString(4));
                consulta.setEmail(rs.getString(5));
                consulta.setCep(rs.getString(6));
                consulta.setBairro(rs.getString(7));
                consulta.setPai(rs.getString(8));
                consulta.setMae(rs.getString(9));
                consulta.setCpf(rs.getString(10));
                consulta.setTelefone(rs.getString(11));
                consulta.setData_nascimento(rs.getString(12));
                consulta.setRg(rs.getString(13));
                consulta.setSexo(rs.getString(14));
                consulta.setPlaca(rs.getString(15));
                consulta.setModelo_veiculo(rs.getString(16));
                consulta.setCor_veiculo(rs.getString(17));
                consulta.setColegio(rs.getString(18));
                consulta.setChassi(rs.getString(19));
                consulta.setPeriodo(rs.getString(20));
                consulta.setHorario_entrada(rs.getString(21));
                consulta.setHorario_saida(rs.getString(22));
                consulta.setStatus(rs.getString(23));
                consulta.setTipo_veiculo(rs.getString(24));
                consulta.setTel_alternativo(rs.getString(25));
                consulta.setEstado_civil(rs.getString(26));
                consulta.setTipo_sanguineo(rs.getString(27));
                consulta.setNacionalidade(rs.getString(28));
                consulta.setOrgao_exp(rs.getString(29));
                consulta.setData_exp(rs.getString(30));
                consulta.setPassaporte(rs.getString(31));
                consulta.setDoc_militar(rs.getString(32));
                consulta.setCertidao(rs.getString(33));
                consulta.setNumero_responsavel(rs.getString(34));
                consulta.setAno(rs.getString(35));
                consulta.setVersao(rs.getString(36));
                consulta.setAno_fabricaçao(rs.getString(37));
                consulta.setCombustivel(rs.getString(38));
                consulta.setPotencia(rs.getString(39));
                consulta.setResponsavel_veiculo(rs.getString(40));
                consulta.setCnh(rs.getString(41));

            
            }
            else{
                consulta = null;
            }
            rs.close();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return(consulta);
    }
    
    
}
