package Control;

import Control.Model.Enfermeiro;

public class GerenciarEnfermeirosMBean {
    private Enfermeiro enfermeiro;

    public GerenciarEnfermeirosMBean() {
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

//CRUD
    
    public boolean cadastrarEnfermeiro(){
    boolean result = false;
    String sql = "insert into enfermeriro set nome";
    result = true;
    return result;
}
public Enfermeiro enfermeiro (String coren){
    Enfermeiro  result = new Enfermeiro();
    String sql = "select * from medicos where coren = ?";
    return result;
}

public boolean atualizarDadosDodEnfermeiro(){
    boolean result = false;
    String sql = "update enfermeiro where nome = ?";
    result = true;
    return result;
} 

public boolean apagarRegistroDoEnfermeiro(Enfermeiro enfermeiro){
    boolean result = false;
    String sql = "update enfermeiro set ativo(false) where ???";

    result = true;
    return result;
}



}
