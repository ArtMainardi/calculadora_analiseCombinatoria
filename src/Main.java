import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Variáveis Globais:
    private static Scanner sc = new Scanner(System.in);

    // Menu inicial:
    public static void main(String[] args) {
        int option;

        do{
            System.out.println("-------------------------------------------------");
            System.out.println("===== CALCULADORA DE ANÁLISES COMBINATÓRIAS =====");
            System.out.println("-------------------------------------------------");
            System.out.println("Escolha uma opção: \n\r"
                    + "1- Anagramas \n\r"
                    + "0- Sair"
            );
            option = sc.nextInt();

            switch(option){
                case 1:
                    anagrama();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ERRO: opção digitada inválida!!");
                    System.out.println(); // Espaçamento
            }
        } while(option != 0);
    }

    // Procedimento do Anagrama:
    public static void anagrama(){
        // Entrada de dados:
        System.out.println("Digite uma palavra: ");
        sc.nextLine();
        String palavra = sc.nextLine();

        // Calculando Permutação
        int tamanho = palavra.length(), permutacao = tamanho;
        while((tamanho-1) != 0){
            tamanho--;
            permutacao *= tamanho;
        }

        // Saída de dados:
        System.out.println("Quantidade de anagramas: " + permutacao);
        System.out.println("\n"); // Espaçamento
    }
}