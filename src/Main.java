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

            Anagrama an = new Anagrama();
            Permutacao per = new Permutacao();
            Combinacao comb = new Combinacao();
            switch(option){
                case 1:
                    Anagrama anag = new Anagrama();
                    anag.anagrama();
                    break;
                case 3:
                    Arranjo arra = new Arranjo();
                    arra.arranjo();
                    break;
                case 2:
                    System.out.println("Insira o número do qual deseja fazer a permutação:");
                    int n = sc.nextInt();
                    System.out.println(per.p(n));
                    break;
                case 4:
                    System.out.println(comb.c());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("ERRO: opção digitada inválida!!");
                    System.out.println(); // Espaçamento
            }
        } while(option != 0);
    }
}