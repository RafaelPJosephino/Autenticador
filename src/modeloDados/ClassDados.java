package modeloDados;

import java.util.LinkedList;

import modeloBeans.ClassUsuario;
import modeloBeans.ClassProduto;

import modeloBeans.ClassParametros;

abstract public class ClassDados {

    private static String Usuario;
    private static int NivelAcesso;
    private static String SenhaAutenticacao = "0000";
    private static ClassParametros parametro = new ClassParametros();
    private static LinkedList<ClassUsuario> ListaUsuario = new LinkedList<>();
    private static LinkedList<ClassProduto> ListaProduto = new LinkedList<>();

    public static ClassParametros getParametro() {
        return parametro;
    }

    public static void setParametro(ClassParametros aParametro) {
        parametro = aParametro;
    }

    public static LinkedList<ClassUsuario> getListaUsuario() {
        return ListaUsuario;
    }

    public static void setListaUsuario(LinkedList<ClassUsuario> aListaUsuario) {
        ListaUsuario = aListaUsuario;
    }

    public static LinkedList<ClassProduto> getListaProduto() {
        return ListaProduto;
    }

    public static void setListaProduto(LinkedList<ClassProduto> aListaProduto) {
        ListaProduto = aListaProduto;
    }

    public static int getNivelAcesso() {
        return NivelAcesso;
    }

    public static void setNivelAcesso(int aNivelAcesso) {
        NivelAcesso = aNivelAcesso;
    }

    public static String getUsuario() {
        return Usuario;
    }

    public static void setUsuario(String aUsuario) {
        Usuario = aUsuario;
    }

    public static void SetSenhaAutenticacao(String SenhaAutenticada) {
        SenhaAutenticacao = SenhaAutenticada;
    }

    public static String getSenhaAutenticacao() {
        return SenhaAutenticacao;
    }

}
