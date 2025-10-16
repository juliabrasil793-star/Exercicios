package Model.DAOs;

import Model.AdministradorBRT;

public class AdministradorBRTDAO {
    public void cadastrarAdministrador(AdministradorBRT adm){
    String sql = "insert into administrador (nome, especializacao, endereco, email, senha) values ("
    + adm.getDadosAdm() + ","
    + adm.getEspecializacao() + ")";
    }

}
