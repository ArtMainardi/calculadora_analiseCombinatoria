import java.util.Scanner;

public class Arranjo {
    boolean checkN = false, checkP = false;
    int n, p, arranjo = 1;

    public void arranjo(){
        Scanner sc = new Scanner(System.in);

        // Entrada de dados:
        printarFormula();
        System.out.println("Digite o 'n' (número total de elementos do conjunto): ");
        n = sc.nextInt();
        checkN = true;
        printarFormula();
        System.out.println("Digite o 'p' (número de elementos escolhidos para cada arranjo): ");
        checkP = true;
        p = sc.nextInt();

        // Calcular arranjo:
        arranjo = fatorial(n)/fatorial(n - p);

        // Exibir dados:
        System.out.println(); // Espaçamento
        printarFormula();
        System.out.println("O valor do arranjo é de: " + arranjo);

        System.out.println("Pressione ENTER para continuar: ");
        sc.nextLine();
        String enter = sc.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n"); // Espaçamento
    }

    // Função para mostrar a fórmula:
    public void printarFormula(){
        System.out.println("\n\n[->    A(" + (checkN ? n : "n") + ", " + (checkP ? p : "p") + ") = " + (checkN ? n : "n")
                + "!/(" + (checkN ? n : "n") + " - " + (checkP ? p : "p") + ")!    <-]");
    }

    // Função para calcular o fatorial de um número:
    public int fatorial(int valor){
        int fatoriacao = 1;
        for(int cont = 1; cont <= valor; cont++){
            fatoriacao *= cont;
        }
        return fatoriacao;
    }
}
