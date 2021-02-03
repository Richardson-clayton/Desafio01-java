import java.io.IOException;
import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) throws IOException {
        int idade, anos, mes, dias;
        Scanner mostrar = new Scanner(System.in);
        System.out.print("Digite sua idade em dias: ");
        idade = mostrar.nextInt();
        anos = idade/365;
        int resto1 = idade%365;
        mes = resto1/30;
        int resto2 = resto1%30;
        dias = resto2/1;
        System.out.println(anos + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");
            
    }  
}
