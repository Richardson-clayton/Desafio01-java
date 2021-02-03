import java.util.Scanner;
public class desafio01{
    public static void main( String args[]){
        int poi, num, contador = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um número: ");
        num = in.nextInt();
        poi = (num%2);
        if (poi == 0){
            while (contador < num){
                contador ++;
                if(contador%2==0)
                /*int [] a;
                a = new int[contador]; */
                System.out.println(contador);
            }
        }
    }
}