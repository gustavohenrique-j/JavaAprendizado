package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondiconais01 {
        public static void main(String[] args) {
            int idade = 22;
            boolean isAutorizadoComprarBebida = idade >= 18;
            if (isAutorizadoComprarBebida) {
                System.out.println("Autorizado a comprar bebida alcoolica");
            } else {
                System.out.println("Não autorizado a comprar bebida alcoolica");
            }

        }
    }