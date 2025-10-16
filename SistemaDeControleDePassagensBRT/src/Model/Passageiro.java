package Model;

public class Passageiro {
    private int idPassageiro;
    private String tipoPasse;
    private Usuario dadosPassageiro;
    public Passageiro() {
    }
    public int getIdPassageiro() {
        return idPassageiro;
    }
    public void setIdPassageiro(int idPassageiro) {
        this.idPassageiro = idPassageiro;
    }
    public String getTipoPasse() {
        return tipoPasse;
    }
    public void setTipoPasse(String tipoPasse) {
        this.tipoPasse = tipoPasse;
    }
    public Usuario getDadosPassageiro() {
        return dadosPassageiro;
    }
    public void setDadosPassageiro(Usuario dadosPassageiro) {
        this.dadosPassageiro = dadosPassageiro;
    }

    
}
