package modeloBeans;

import modeloDados.ClassDados;

public class ClassParametros {

    private String SenhaAutenticao;
    
    public final boolean isMenuSistema(int nivel) {
        return switch (nivel) {
            case 0 ->
                true;
            case 1 ->
                true;
            case 2 ->
                true;
            case 3 ->
                true;
            default ->
                false;
        };
    }

    
    public final boolean isMenuParametros(int nivel) {
        return switch (nivel) {
            case 0 ->
                false;
            case 1 ->
                false;
            case 2 ->
                false;
            case 3 ->
                true;
            default ->
                false;
        };
    }

   
    public final boolean isMenuConsulta(int nivel) {

        return switch (nivel) {
            case 0 ->
                false;
            case 1 ->
                true;
            case 2 ->
                true;
            case 3 ->
                true;
            default ->
                false;
        };

    }

    
    public final boolean isMenuCadastro(int nivel) {

        return switch (nivel) {
            case 0 ->
                false;
            case 1 ->
                false;
            case 2 ->
                true;
            case 3 ->
                true;
            default ->
                false;
        };
    }

    public void setSenhaautenticao(String SenhaAutenticao) {
        ClassDados.SetSenhaAutenticacao(SenhaAutenticao);
    }

   

}
