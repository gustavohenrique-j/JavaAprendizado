package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[]{"Gustavo", "Emilly", "Leandro", null};
        nomes[2] = "Poliana";

        for(int i = 0; i < nomes.length; ++i) {
            System.out.println(nomes[i]);
        }

    }
}
