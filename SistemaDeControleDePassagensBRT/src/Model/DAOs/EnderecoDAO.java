package Model.DAOs;

import Model.Endereco;

public class EnderecoDAO {
    public void cadastrarEndereco(Endereco local){
    String sql = "insert into endereco (cep, cidade, numero, rua) values ("
    + local.getCep() + ","
    + local.getCidade() + ","
    +local.getNumero() + ","
    + local.getRua() + ")";
    }

}
