package Model;

public class Passagem {
    private int idPassagem;
    private String valor;
    private String passe;
    private Passageiro passageiro;
    private boolean utilizada;
    private String dataCompra;
    public Passagem() {
    }
    public int getIdPassagem() {
        return idPassagem;
    }
    public void setIdPassagem(int idPassagem) {
        this.idPassagem = idPassagem;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getPasse() {
        return passe;
    }
    public void setPasse(String passe) {
        this.passe = passe;
    }
    public Passageiro getPassageiro() {
        return passageiro;
    }
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
    public boolean isUtilizada() {
        return utilizada;
    }
    public void setUtilizada(boolean utilizada) {
        this.utilizada = utilizada;
    }
    public String getDataCompra() {
        return dataCompra;
    }
    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    

    

}
