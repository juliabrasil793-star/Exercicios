package Model;

public class EmpresaOnibus {
    private int idEmpresa;
    private String nomeEmpresa;
    private String socios;
    private String onibus;
    private Endereco endereco;
    public EmpresaOnibus() {
    }
    public int getIdEmpresa() {
        return idEmpresa;
    }
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    public String getSocios() {
        return socios;
    }
    public void setSocios(String socios) {
        this.socios = socios;
    }
    public String getOnibus() {
        return onibus;
    }
    public void setOnibus(String onibus) {
        this.onibus = onibus;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    

    

}
