package Model.DAOs;

import Model.Passagem;

public class PassagemDAO {
    public void cadastrarPassagem(Passagem passagem){
        String sql = "insert into passagem(valor, passe, passageiro, dataCompra)"
        + passagem.getValor() + ","
        + passagem.getPasse() + ","
        + passagem.getPassageiro() + ","
        + passagem.getDataCompra() + ")";
    }

}
