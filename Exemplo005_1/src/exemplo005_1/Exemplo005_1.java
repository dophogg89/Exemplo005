package exemplo005_1;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exemplo005_1 {
    public static void main(String[] args) {
       Scanner s1 =new Scanner(System.in);
       System.out.println("Que dia é hoje? ");
       int d = s1.nextInt();
       System.out.println("Qual mês estamos? ");
       int m = s1.nextInt();
       System.out.println("O ano que estamos? ");
       int a = s1.nextInt();
       GregorianCalendar g1 = new GregorianCalendar(a,m-1,d);
       switch(g1.get(GregorianCalendar.DAY_OF_WEEK)){
           case 1 -> System.out.println("DOMINGO! é folga né? :)");
           case 2, 3, 4, 5, 6 -> System.out.println("Hoje é um dia útil! Dia de trabalhar. :(");
           case 7 -> System.out.println("SÁBADO! Começando o fim de semana! :)");
default ->  System.out.println("ALGO ESTÁ ERRADO, Você não digitou os números corretos de hoje.");
       }
    }
}