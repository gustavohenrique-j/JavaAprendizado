package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public class Aula04Operadores {
        public static void main(String[] args) {
            int numero01 = 10;
            double numero02 = (double)20.0F;
            double resultado = (double)numero01 / numero02;
            System.out.println(resultado);
            int resto = 0;
            System.out.println(resto);
            boolean isDezMaiorQueVinte = false;
            boolean isDezMenorQueVinte = true;
            boolean isDezIgualQueVinte = false;
            boolean isDezIgualDez = true;
            boolean isDezDiferenteQueDez = true;
            System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
            System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
            System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
            System.out.println("isDezIgualDez " + isDezIgualDez);
            System.out.println("isDezDiferenteQueDez " + isDezDiferenteQueDez);
            int idade = -22;
            float salario = 3500.0F;
            boolean isDentroLeiMaiorQueTrinta = idade > 22 && salario >= 4612.0F;
            boolean isDentroLeiMenorQueTrinta = idade < 22 && salario >= 3381.0F;
            System.out.println("isDentroLeiMaiorQueTrinta " + isDentroLeiMaiorQueTrinta);
            System.out.println("isDentroLeiMenorQueTrinta " + isDentroLeiMenorQueTrinta);
            double valorTotalContaCorrente = (double)200.0F;
            double valorTotalContaPoupanca = (double)10000.0F;
            float valorPlaystation = 5000.0F;
            boolean isPlaystationCincoCompravel = valorTotalContaCorrente > (double)valorPlaystation || valorTotalContaPoupanca > (double)valorPlaystation;
            System.out.println(isPlaystationCincoCompravel);
            double bonus = (double)1800.0F;
            double bonus1 = (double)1800.0F;
            double bonus2 = (double)1800.0F;
            double bonus3 = (double)1800.0F;
            double bonus4 = (double)1800.0F;
            double bonus5 = (double)1800.0F;
            bonus1 += (double)1000.0F;
            bonus2 -= (double)1000.0F;
            bonus3 *= (double)1000.0F;
            bonus4 /= (double)1000.0F;
            bonus5 %= (double)1000.0F;
            System.out.println(bonus1);
            System.out.println(bonus2);
            System.out.println(bonus3);
            System.out.println(bonus4);
            System.out.println(bonus5);
            int contador = 0;
            ++contador;
            ++contador;
            --contador;
            ++contador;
            --contador;
            System.out.println(contador);
        }
    }
}
