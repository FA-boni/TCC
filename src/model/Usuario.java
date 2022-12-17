
package model;


public class Usuario {
    
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
    private String doc_militar;
    private String certidao;
    private String numero_responsavel;
    private String ano;
    private String versao;
    private String ano_fabricaçao;
    private String combustivel;
    private String potencia;
    private String responsavel_veiculo;
    private String cnh;

    public Usuario(){
        
    }
    
    public Usuario(int id, String username, String senha, String perfil) {
        this.id = id;
        this.username = username;
        this.senha = senha;
        this.perfil = perfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo_veiculo() {
        return modelo_veiculo;
    }

    public void setModelo_veiculo(String modelo_veiculo) {
        this.modelo_veiculo = modelo_veiculo;
    }

    public String getCor_veiculo() {
        return cor_veiculo;
    }

    public void setCor_veiculo(String cor_veiculo) {
        this.cor_veiculo = cor_veiculo;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getHorario_entrada() {
        return horario_entrada;
    }

    public void setHorario_entrada(String horario_entrada) {
        this.horario_entrada = horario_entrada;
    }

    public String getHorario_saida() {
        return horario_saida;
    }

    public void setHorario_saida(String horario_saida) {
        this.horario_saida = horario_saida;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo_veiculo() {
        return tipo_veiculo;
    }

    public void setTipo_veiculo(String tipo_veiculo) {
        this.tipo_veiculo = tipo_veiculo;
    }

    public String getTel_alternativo() {
        return tel_alternativo;
    }

    public void setTel_alternativo(String tel_alternativo) {
        this.tel_alternativo = tel_alternativo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getTipo_sanguineo() {
        return tipo_sanguineo;
    }

    public void setTipo_sanguineo(String tipo_sanguineo) {
        this.tipo_sanguineo = tipo_sanguineo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getOrgao_exp() {
        return orgao_exp;
    }

    public void setOrgao_exp(String orgao_exp) {
        this.orgao_exp = orgao_exp;
    }

    public String getData_exp() {
        return data_exp;
    }

    public void setData_exp(String data_exp) {
        this.data_exp = data_exp;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public String getDoc_militar() {
        return doc_militar;
    }

    public void setDoc_militar(String doc_militar) {
        this.doc_militar = doc_militar;
    }

    public String getCertidao() {
        return certidao;
    }

    public void setCertidao(String certidao) {
        this.certidao = certidao;
    }

    public String getNumero_responsavel() {
        return numero_responsavel;
    }

    public void setNumero_responsavel(String numero_responsavel) {
        this.numero_responsavel = numero_responsavel;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getAno_fabricaçao() {
        return ano_fabricaçao;
    }

    public void setAno_fabricaçao(String ano_fabricaçao) {
        this.ano_fabricaçao = ano_fabricaçao;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getResponsavel_veiculo() {
        return responsavel_veiculo;
    }

    public void setResponsavel_veiculo(String responsavel_veiculo) {
        this.responsavel_veiculo = responsavel_veiculo;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

  

   
    
}