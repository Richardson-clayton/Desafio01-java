import java.io.IOException;
import java.util.Scanner;
import java.util.Calendar;

public class testdesafio02 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual o ano de seu nascimento? ");
        int anoN = leitor.nextInt();
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int CalAnos = year - anoN;
        int idadeDias = CalAnos * 365;
        int anos = idadeDias/365;
        int resto1 = idadeDias%365;
        int mes = resto1/30;
        int resto2 = resto1%30;
        int dias = resto2/1;
        /*idadeDias -=  * 365;
        int mes = idadeDias / 30;
        idadeDias -=  * 30;
        int  = idadeDias;*/
        System.out.println(anos + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");
        /*System.out.println(mes);
        System.out.println(dias);*/
    }
	
}

