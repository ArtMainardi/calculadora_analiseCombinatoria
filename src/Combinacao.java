import java.util.Scanner;

public class Combinacao {
    public Long c(){
        Permutacao per = new Permutacao();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número total de elementos disponíveis: (Máximo 20)");
        int n = sc.nextInt();
        System.out.println("Insira a quantidade de elementos desejados para a escolha: (Precisa ser menor ou igual ao número total de elementos disponíveis)");
        int p = sc.nextInt();
        if(p <= n){
            return per.p(n) / (per.p(p) * per.p(n - p));
        }
        System.out.println("ERRO! Retornando 0...");
        return 0L;
    }
}
