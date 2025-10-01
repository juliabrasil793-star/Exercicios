package Model;

public class Times {
    private Jogador jogador;
    private Tecnico tecnico;
    private String nomeTime;
    private String qntJogadores;
    public Times() {
    }
    public Jogador getJogador() {
        return jogador;
    }
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    public Tecnico getTecnico() {
        return tecnico;
    }
    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    public String getNome() {
        return nomeTime;
    }
    public void setNome(String nomeTime) {
        this.nomeTime = nomeTime;
    }
    public String getQntJogadores() {
        return qntJogadores;
    }
    public void setQntJogadores(String qntJogadores) {
        this.qntJogadores = qntJogadores;
    }

    

}
