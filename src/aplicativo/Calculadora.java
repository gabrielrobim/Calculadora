package aplicativo;

import entidade.Programa;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Programa programa = new Programa();
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        int number;

        do {
            System.out.println("Escolha umas das operacões");
            System.out.println("1.soma");
            System.out.println("2.subtracao");
            System.out.println("3.divisao");
            System.out.println("4.multiplicacao");
            System.out.print("Escolha uma das opcoes a cima: ");
            number = sc.nextInt();

            if (number == 1) {
                System.out.println("Digite um numero: ");
                int soma1 = sc.nextInt();
                System.out.println("Digite outro numero: ");
                int soma2 = sc.nextInt();
                programa.soma(soma1, soma2);
                System.out.println(programa);
            } else if (number == 2) {
                System.out.println("Digite um numero: ");
                int subtracao1 = sc.nextInt();
                System.out.println("Digite outro numero: ");
                int subtracao2 = sc.nextInt();
                programa.sub(subtracao1, subtracao2);
                System.out.println(programa);
            } else if (number == 3) {
                System.out.println("Digite um numero: ");
                int divisao1 = sc.nextInt();
                System.out.println("Digite outro numero: ");
                int divisao2 = sc.nextInt();
                programa.divi(divisao1, divisao2);
                System.out.println(programa);
            } else if (number == 4) {
                System.out.println("Digite um numero: ");
                int multiplicacao1 = sc.nextInt();
                System.out.println("Digite outro numero: ");
                int multiplicacao2 = sc.nextInt();
                programa.mult(multiplicacao1, multiplicacao2);
                System.out.println(programa);
            }
            else {
                System.out.println("Numero invlaido.");
                break;
            }
        } while(number !=0);


        sc.close();
    }
}
