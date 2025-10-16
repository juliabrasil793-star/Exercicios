package Model.DAOs;

import Model.EmpresaOnibus;

public class EmpresaOnibusDAO {
    public void cadastrarEmpresa(EmpresaOnibus empresa){
        String sql = "insert into empresaOnibus(nome, socios, onibus, endereco) values ("
        + empresa.getNomeEmpresa() + ","
        + empresa.getSocios() + ","
        + empresa.getOnibus() + ","
        + empresa.getEndereco() + ")";
    }

}
