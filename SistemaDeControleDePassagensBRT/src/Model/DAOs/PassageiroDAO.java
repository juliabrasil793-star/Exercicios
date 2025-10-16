package Model.DAOs;

import Model.Passageiro;

public class PassageiroDAO {
    public void cadastrarPasssgeiro(Passageiro passageiro){
    String sql = "insert into passageiro (dadosPassageiro, tipoPasse) values ("
    + passageiro.getDadosPassageiro() + ","
    + passageiro.getTipoPasse() + ")";
    }

    }

