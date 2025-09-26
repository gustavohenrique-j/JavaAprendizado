package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondiconais05 {
    public static void main(String[] args) {
        byte dia = 5;
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sabado");
            default -> System.out.println("Opção Invalida");
        }

        char sexo = 'M';
        switch (sexo) {
            case 'F' -> System.out.println("Mulher");
            case 'M' -> System.out.println("Homem");
            default -> System.out.println("Invalido");
        }

    }
}
