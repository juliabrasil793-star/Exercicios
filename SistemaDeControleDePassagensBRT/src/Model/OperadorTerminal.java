package Model;

public class OperadorTerminal {
    private int idOperadorTerminal;
    private String terminal;
    private Usuario dadosOperador;
    private String turno;

    public OperadorTerminal() {
    }
    public int getIdOperadorTerminal() {
        return idOperadorTerminal;
    }
    public void setIdOperadorTerminal(int idOperadorTerminal) {
        this.idOperadorTerminal = idOperadorTerminal;
    }
    public String getTerminal() {
        return terminal;
    }
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public Usuario getDadosOperador() {
        return dadosOperador;
    }
    public void setDadosOperador(Usuario dadosOperador) {
        this.dadosOperador = dadosOperador;
    }

    

    

}
