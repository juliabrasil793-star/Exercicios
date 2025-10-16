package Model.DAOs;

import Model.OperadorTerminal;

public class OperadorTerminalDAO {
    public void cadastrarOperador(OperadorTerminal operador){
        String sql = "insert into opoperador (terminal, nome, turno, endereco) values ("
        + operador.getTerminal() +","
        + operador.getTurno() + "," 
        + operador.getDadosOperador() + ")" ;
        
    } 

}


