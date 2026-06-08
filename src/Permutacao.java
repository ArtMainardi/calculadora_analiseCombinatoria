public class Permutacao {
    public Long p(int n){
        Long res = 1L;
        for(int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }
}
