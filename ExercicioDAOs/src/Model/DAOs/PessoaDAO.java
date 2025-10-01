package Model.DAOs;

import Model.Pessoa;

public class PessoaDAO {
    public void cadastrarPessoa(Pessoa serHumano){
        String sql = "insert into pessoa(nome, dataNascimento, cpf) values ("
        + serHumano.getNome() + "," 
        + serHumano.getDataNascimento() + "," 
        + serHumano.getCpf() + ")";

    }

}
