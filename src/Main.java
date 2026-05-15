import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        // Calculando Permutação
        int tamanho = palavra.length(), permutacao = tamanho;

        while((tamanho-1) > 0){
            tamanho--;
            permutacao *= tamanho;
        }

        System.out.println("Quantidade de anagramas: " + permutacao);
    }
}