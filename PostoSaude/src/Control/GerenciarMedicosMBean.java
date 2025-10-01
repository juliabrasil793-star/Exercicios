package Control;

import Control.Model.Medico;

public class GerenciarMedicosMBean {
    private Medico medico;

    public GerenciarMedicosMBean() {
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
// método CRUD
public boolean cadastrarMedicos(){
    boolean result = false;
    String sql = "insert into medicos set nome";
// o sql chama a instrução do banco de dados
// retorna true
    result = true;
    return result;
}
public Medico consultaMedica(String crm){
    Medico  result = new Medico();
    String sql = "select * from medicos where crm = ?";
// o sql chama a instrução do banco de dados
// retorna Medico
// result = dados retornados do banco 
    return result;
}

public boolean atualizarDadosMedicos(){
    boolean result = false;
    String sql = "update medicos where nome = ?";
    result = true;
    return result;
} 

public boolean apagarRegistroMedico(Medico medico){
    boolean result = false;
    String sql = "update medico set ativo(false) where ???";

    result = true;
    return result;
}

}
