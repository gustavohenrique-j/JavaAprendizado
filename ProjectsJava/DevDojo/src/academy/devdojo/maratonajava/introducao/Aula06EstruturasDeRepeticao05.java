package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = (double)30000.0F;
        double valorParcela = (double)0.0F;

        int parcela;
        for(parcela = (int)valorTotal; parcela >= 1; --parcela) {
            valorParcela = valorTotal / (double)parcela;
            if (valorParcela < (double)1000.0F) {
            }
        }

        System.out.println("Parcela " + parcela + " RS " + valorParcela);
    }
}
