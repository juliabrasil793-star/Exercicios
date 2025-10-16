package Model;

public class AdministradorBRT {
    private int idAdministrador;
    private Usuario dadosAdm;
    private String especializacao;
    public AdministradorBRT() {
    }
    public int getIdAdministrador() {
        return idAdministrador;
    }
    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }
    public Usuario getDadosAdm() {
        return dadosAdm;
    }
    public void setDadosAdm(Usuario dadosAdm) {
        this.dadosAdm = dadosAdm;
    }
    public String getEspecializacao() {
        return especializacao;
    }
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    
}
