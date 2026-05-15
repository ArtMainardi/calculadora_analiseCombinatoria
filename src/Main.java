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

        // Verificando letras repetidas:
        int tamanho = 0;
        ArrayList<Character> letras = new ArrayList<>();
        for(int cont = 0; cont < (palavra.length()-1); cont++){
            if(!letras.isEmpty()){
                boolean verify = true;

                for(int cont2 = 0; cont2 < letras.size(); cont2++){
                    if(palavra.toLowerCase().charAt(cont) == letras.get(cont2)){
                        verify = false;
                        System.out.println("Letra REPETIDA!!  " + cont);
                    }
                }

                if(verify){
                    tamanho++;
                    letras.add(palavra.toLowerCase().charAt(cont));
                }
            } else{
                tamanho++;
                letras.add(palavra.toLowerCase().charAt(cont));
            }
        }
        System.out.println("Quantidade de letras únicas: " + tamanho);

        // Calculando Permutação:
        int permutacao = tamanho;
        while((tamanho-1) != 0){
            tamanho--;
            permutacao *= tamanho;
        }

        // Saída de dados:
        System.out.println("Quantidade de anagramas: " + permutacao);
        System.out.println("\n"); // Espaçamento
    }
}