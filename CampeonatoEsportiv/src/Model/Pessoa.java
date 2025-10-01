package Model;

public class Pessoa {
    private String nome;
    private Endereco endereço;
    private String telefone;
    private int idade;
    public Pessoa() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereço() {
        return endereço;
    }
    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    


}
