import java.util.Scanner;

public class GeradorRg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite 8 números para gerar um RG:");
        String rg = sc.nextLine();

        int total = 0;
        int multiplica = 9;

        for (int i = 0; i < rg.length(); i++) {
            char digitChar = rg.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            int calc1 = digit * multiplica;
            total += calc1;
            multiplica--;
        }
        int calc2 = total%11;
        System.out.println("O RG gerado foi: "+rg+"-"+calc2);
        
        sc.close();
    }
}
