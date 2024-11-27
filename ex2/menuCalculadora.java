package ex2;

import java.util.Scanner;

public class menuCalculadora{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Verificar se o número é primo");
            System.out.println("2. Verificar se o número é perfeito");
            System.out.println("3. Calcular fatorial");
            System.out.println("4. Calcular Fibonacci");
            System.out.println("5. Calcular equação do segundo grau");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite um número para verificar se é primo:");
                    int numPrimo = scanner.nextInt();
                    System.out.println(calculos.primo(numPrimo) ? "O número é primo." : "O número não é primo.");
                    break;

                case 2:
                    System.out.println("Digite um número para verificar se é perfeito:");
                    int numPerfeito = scanner.nextInt();
                    System.out.println(calculos.perfeito(numPerfeito) ? "O número é perfeito." : "O número não é perfeito.");
                    break;

                case 3:
                    System.out.println("Digite um número para calcular o fatorial:");
                    int numFatorial = scanner.nextInt();
                    System.out.println("Fatorial de " + numFatorial + " é: " + calculos.fatorial(numFatorial));
                    break;

                case 4:
                    System.out.println("Digite um número para calcular o Fibonacci:");
                    int numFibonacci = scanner.nextInt();
                    System.out.println("O " + numFibonacci + "º número de Fibonacci é: " + calculos.fibonacci(numFibonacci));
                    break;

                case 5:
                    System.out.println("Digite os valores de a, b e c para calcular a equação do segundo grau:");
                    System.out.print("a: ");
                    double a = scanner.nextDouble();
                    System.out.print("b: ");
                    double b = scanner.nextDouble();
                    System.out.print("c: ");
                    double c = scanner.nextDouble();

                    try {
                        double raiz1 = calculos.x1(a, b, c);
                        double raiz2 = calculos.x2(a, b, c);
                        System.out.println("Primeira raiz (x1): " + raiz1);
                        System.out.println("Segunda raiz (x2): " + raiz2);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 6:
                    System.out.println("Saindo do programa...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            if (continuar) {
                System.out.println("\nDeseja realizar outro cálculo? (s/n)");
                String resposta = scanner.next();
                if (resposta.equalsIgnoreCase("n")) {
                    continuar = false;
                    System.out.println("Saindo do programa...");
                }
            }
        }

        scanner.close();
    }
}
