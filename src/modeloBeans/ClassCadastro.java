package modeloBeans;

import javax.swing.JOptionPane;
import modeloDados.ClassDados;

public class ClassCadastro {

    public boolean CadastroUsuario(ClassUsuario modelo) {
        boolean flag = false;
        if (ClassDados.getSenhaAutenticacao().equals(modelo.getSenhaAutenticao())) {
            if (ClassDados.getListaUsuario().isEmpty()) {
                ClassDados.getListaUsuario().add(modelo);
                JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
                flag = true;
            } else {
                for (ClassUsuario classUsuario : ClassDados.getListaUsuario()) {

                    if (modelo.getUsuario().equals(classUsuario.getUsuario())) {
                        JOptionPane.showMessageDialog(null, "Usuario ja Cadastrado");
                        flag = false;
                    } else {
                        ClassDados.getListaUsuario().add(modelo);
                        JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
                        flag = true;
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Senha de autenticacao nao corresponde!");
            flag = false;
        }
        return flag;

    }

    public boolean CadastroProduto(ClassProduto modelo) {
        boolean flag = false;
        try {
            if (ClassDados.getListaProduto().isEmpty()) {
                ClassDados.getListaProduto().add(modelo);
                JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
                flag = true;
            } else {

                for (ClassProduto classProduto : ClassDados.getListaProduto()) {
                    if (((modelo.getCodigoProduto()) == (classProduto.getCodigoProduto())) || (modelo.getDescricao().equalsIgnoreCase(classProduto.getDescricao()))) {
                        JOptionPane.showMessageDialog(null, "Produto ja Cadastrado:n");
                        flag = false;
                    } else {

                        ClassDados.getListaProduto().add(modelo);
                        JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
                        flag = true;

                    }
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Campos Invalidos! " + e.getMessage());
            flag= false;
        }
        return flag ;
    }

}
