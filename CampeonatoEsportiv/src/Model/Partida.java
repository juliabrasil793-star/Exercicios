package Model;

public class Partida {
    private Jogador jogador;
    private String tempo;
    private Torcedor torcedor;
    private String vencedor;
    public Partida() {
    }
    public Jogador getJogador() {
        return jogador;
    }
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    public String getTempo() {
        return tempo;
    }
    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
    public Torcedor getTorcedor() {
        return torcedor;
    }
    public void setTorcedor(Torcedor torcedor) {
        this.torcedor = torcedor;
    }
    public String getVencedor() {
        return vencedor;
    }
    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }
    



}
