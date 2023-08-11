import java.util.Random;

public class Rg {
    public static void main(String[] args) {
        int quantidadeRgs = 100; // Altere para a quantidade desejada

        Random random = new Random();

        for (int i = 0; i < quantidadeRgs; i++) {
            int numerosRg = 8;

            long min = (long) Math.pow(10, numerosRg - 1);
            long max = (long) Math.pow(10, numerosRg) - 1;
            long rg = min + (long) (random.nextDouble() * (max - min + 1));

            String rgFormatted = String.format("%08d", rg); // Formatação para ter 8 dígitos

            int[] multiplicadores = {2, 3, 4, 5, 6, 7, 8, 9};

            int soma = 0;
            for (int j = 0; j < 8; j++) {
                int digito = Character.getNumericValue(rgFormatted.charAt(j));
                soma += digito * multiplicadores[j];
            }

            int resto = soma % 11;
            int digitoVerificador;

            if (resto == 0) {
                digitoVerificador = 0;
            } else {
                digitoVerificador = 11 - resto;
            }

            System.out.println("RG gerado: " + rgFormatted);
            System.out.println("Dígito verificador: " + digitoVerificador);
            System.out.println(); // Espaço entre os RGs gerados
        }
    }
}
