package Model.DAOs;

import Model.Musica;

public class MusicaDAO {
    public void cadastrarMusica(Musica music){
        String sql = "insert into musica(nome, duração, cantor) values ("
        + music.getNome() + ","
        + music.getDuracao() + ","
        + music.getCantor() + ")";
    }

    

}
