package Control;

import Model.Passageiro;
import Model.Passagem;

public class controlePassagensMBean {

    public void cadastrarPassagem(Passageiro passageiro, Passagem passagem) {
        String acao = "Cadastrar passagem para passageiro: "
        + passageiro.getDadosPassageiro()
        + ", tipo: " + passagem.getPasse()
        + ", valor: " + passagem.getValor();
        System.out.println(acao);
    }

}
