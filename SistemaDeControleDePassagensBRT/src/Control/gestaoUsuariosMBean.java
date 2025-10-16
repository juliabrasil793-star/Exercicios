package Control;

import Model.AdministradorBRT;
import Model.EmpresaOnibus;
import Model.OperadorTerminal;
import Model.Passageiro;

public class gestaoUsuariosMBean {
    public void cadastrarAdministrador(AdministradorBRT admBRT){
        String acao = "Cadastrar AdministradorBRT: " + admBRT.getDadosAdm()
        + ", especializacao: " + admBRT.getEspecializacao();
        System.out.println(acao);
    }

    public void cadastrarPassageiro(Passageiro passageiro){
        String acao = "Cadastrar Passageiro: " + passageiro.getTipoPasse()
        + ", dados: " + passageiro.getDadosPassageiro();
        System.out.println(acao);
    }

public void cadastrarOperador(OperadorTerminal operadorT){
        String acao = "Cadastrar Operador do Terminal: " + operadorT.getDadosOperador()
        + ", terminal: " + operadorT.getTerminal()
        + ", turno: " + operadorT.getTurno();
        System.out.println(acao);
    }

        public void cadastrarEmpresa(EmpresaOnibus empresa){
        String acao = "Cadastrar Empresa de Ônibus: " + empresa.getNomeEmpresa()
        + ", socios: " + empresa.getSocios()
        + ", onibus: " + empresa.getOnibus()
        + ", endereco: " + empresa.getEndereco();
        System.out.println(acao);
    }
}

