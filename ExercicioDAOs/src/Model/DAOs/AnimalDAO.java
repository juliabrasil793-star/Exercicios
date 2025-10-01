package Model.DAOs;

import Model.Animal;

public class AnimalDAO {
    public void cadastrarAnimal(Animal animal){
        String sql = "inser into animal(nome, classe, som, porte) values ("
        + animal.getNome() + "," 
        + animal.getClasse() + ","
        + animal.getSom() + ","
        + animal.getPorte() + ")";
    }
}
