package modeloBeans;

import javax.swing.JOptionPane;
import modeloDados.ClassDados;

public class ClassUsuario {

    private String Usuario;
    private String Senha;
    private int NivelAcesso;
    private String SenhaAutenticao;
    
    public String getSenhaAutenticao() {
        return SenhaAutenticao;
    }

    public void setSenhaautenticao(String SenhaAutenticao) {

        this.SenhaAutenticao = SenhaAutenticao.isEmpty() ? "Campo Autenticaçao Vazio" : SenhaAutenticao;

    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {

        this.Usuario = Usuario.toUpperCase().trim();

    }

    public String getSenha() {

        return Senha;

    }

    public void setSenha(String Senha) {

        this.Senha = Senha.isEmpty() ? "" : Senha;

    }

    public int getNivelAcesso() {
        return NivelAcesso;
    }

    public void setNivelAcesso(int NivelAcesso) {

        this.NivelAcesso = NivelAcesso;

    }

    public ClassUsuario() {
        setNivelAcesso(0);
        setSenha("");
        setUsuario("");
        setSenhaautenticao("");
    }

    public ClassUsuario(String Usuario, String Senha, int NivelAcesso, String SenhaAutentica) {
        setNivelAcesso(NivelAcesso);
        setSenha(Senha);
        setUsuario(Usuario);
        setSenhaautenticao(SenhaAutentica);
    }

    
}
