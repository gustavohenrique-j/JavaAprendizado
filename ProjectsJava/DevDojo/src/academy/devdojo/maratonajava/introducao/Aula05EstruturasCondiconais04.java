package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondiconais04 {
    public static void main(String[] args) {
        double salarioAnual = (double)25000.0F;
        double primeiraFaixa = 0.3697;
        double segundaFaixa = 0.37479999999999997;
        double terceiraFaixa = 0.495;
        if (salarioAnual <= (double)38441.0F) {
            salarioAnual *= primeiraFaixa;
        } else if (salarioAnual >= (double)38441.0F && salarioAnual <= (double)76817.0F) {
            salarioAnual *= segundaFaixa;
        } else {
            salarioAnual *= terceiraFaixa;
        }

        System.out.println(salarioAnual);
    }
}