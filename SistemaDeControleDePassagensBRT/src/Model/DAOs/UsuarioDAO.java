package Model.DAOs;

import Model.Usuario;

public class UsuarioDAO {
    public void cadastrarUsuario(Usuario usuario){
        String sql = "insert into usuario(telefone, nome, endereco, cpf, dataNasc, senha, email) vaalues (" 
        + usuario.getTelefone() + ","
        + usuario.getNome() + ","
        + usuario.getEndereco() + ","
        + usuario.getCpf() + ","
        + usuario.getDataNasc() + ","
        + usuario.getSenha() + ","
        + usuario.getEmail() + ")";

    }

}
