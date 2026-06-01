import java.util.ArrayList;
import java.util.Scanner;

public class Anagrama {
    public void anagrama(){
        Scanner sc = new Scanner(System.in);
        // Entrada de dados:
        System.out.println("Digite uma palavra: ");
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
