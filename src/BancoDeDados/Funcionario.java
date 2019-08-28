package BancoDeDados;

/**
 * @author Frank 2.0 Ultimate
 */
public class Funcionario {

    private String Nome;
    private String Cod_Funcionario;
    private String Telefone;
    private String Login;
    private String Senha;
    private String RG;
    private String CPF;
    private String Tipo;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCod_Funcionario() {
        return Cod_Funcionario;
    }

    public void setCod_Funcionario(String Cod_Funcionario) {
        this.Cod_Funcionario = Cod_Funcionario;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

}
