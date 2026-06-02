import java.util.Scanner;

public class Combinacao {
    public Long c(){
        Permutacao per = new Permutacao();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número total de elementos disponíveis: (Máximo 20)");
        int n = sc.nextInt();
        System.out.println("Insira a quantidade de elementos desejados para a escolha: (Precisa ser menor ou igual ao número total de elementos disponíveis)");
        int p = sc.nextInt();
        if(p <= n) {
            Long res = 1L;
            for (int i = (n - p + 1); i <= n; i++) {
                res *= i;
            }
            return res / per.p(p);
        }
        System.out.println("ERRO! P não pode ser maior que N, retornando 0...");
        return 0L;
    }
}
