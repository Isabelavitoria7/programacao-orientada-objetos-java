package ex1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            Equacao equacao = new Equacao();

            System.out.println("Digite o valor de a:");
            equacao.setA(scanner.nextDouble()); 

            System.out.println("Digite o valor de b:");
            equacao.setB(scanner.nextDouble()); 

            System.out.println("Digite o valor de c:");
            equacao.setC(scanner.nextDouble()); 

            double delta = equacao.delta();
            
            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else {
                System.out.println("X1: " + equacao.retornaX1());
                System.out.println("X2: " + equacao.retornaX2());
            }

            System.out.println("Deseja calcular outra equação? (s/n)");
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
