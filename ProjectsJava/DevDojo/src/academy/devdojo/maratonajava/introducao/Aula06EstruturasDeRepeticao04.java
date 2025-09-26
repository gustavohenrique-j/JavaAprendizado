package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorCarro = (double)30000.0F;

        for(int parcela = 1; (double)parcela <= valorCarro; ++parcela) {
            double valorParcela = valorCarro / (double)parcela;
            if (valorParcela < (double)1000.0F) {
                break;
            }

            System.out.println("Parcela " + parcela + " RS " + valorParcela);
        }

    }
}
