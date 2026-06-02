import java.util.Scanner;

public class Main {
    // Menu inicial:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        do{
            System.out.println("-------------------------------------------------");
            System.out.println("===== CALCULADORA DE ANÁLISES COMBINATÓRIAS =====");
            System.out.println("-------------------------------------------------");
            System.out.println("Escolha uma opção: \n\r"
                    + "1- Anagramas \n\r"
                    + "2- Permutação \n\r"
                    + "3- Arranjo \n\r"
                    + "4- Combinação \n\r"
                    + "0- Sair"
            );
            option = sc.nextInt();

            switch(option){
                case 1:
                    break;
                case 3:
                    Arranjo arranjo = new Arranjo();
                    arranjo.arranjo();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ERRO: opção digitada inválida!!");
                    System.out.println(); // Espaçamento
            }
        } while(option != 0);
    }
}