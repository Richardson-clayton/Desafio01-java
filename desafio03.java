import java.util.Scanner;
public class desafio03 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.print("Informe a nota do Aluno entre 0 e 100: ");
        int nota = dados.nextInt();
        if(nota == 0){
            System.out.println("E");
        }else if (nota >= 1 && nota <= 35){
            System.out.println("D");
        }else if (nota >= 36 && nota <= 60){
            System.out.println("C");
        }else if (nota >= 61 && nota <= 85){
            System.out.println("B");
        }else if (nota >= 86 && nota <= 100){
            System.out.println("A");
        }
        
    }
}
