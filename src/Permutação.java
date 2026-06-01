import java.util.Scanner;

public class Permutação {
    public int p(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número do qual deseja fazer a permutação:");
        int n = sc.nextInt();
        int res = 1;
        for(int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }
}
