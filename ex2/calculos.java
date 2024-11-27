package ex2;

public class calculos {

    public static boolean primo(int num){
        if (num <= 1) {
            return false;
        }


        for(int i = 2; i < num/2; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true; 
    }

    public static boolean perfeito(int num){
        if (num <=1) {
            return false;
        }

        int count = 0;

        for(int i = 1; i <= num /2; i++){
            if (num % i == 0) { 
                count += i; 
            }
        }
        return count == num ?  true : false;
     
    }

    public static int fatorial(int num){
        int fatorial = 1;
        for(int i = num; i > 0; i--){
            fatorial *= i;
        }

        return fatorial;
    }

    public static int fibonacci(int num) {
        if (num <= 1) {
            return num; 
        }
    
        int a = 0, b = 1; 
        int resultado = 0;
    
        for (int i = 2; i <= num; i++) {
            resultado = a + b; 
            a = b; 
            b = resultado; 
        }
    
        return resultado; 
    }

    public static double delta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static double x1(double a, double b, double c) {
        double delta = delta(a, b, c);
        if (delta < 0) {
            throw new IllegalArgumentException("A equação não possui raízes reais.");
        }
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public static double x2(double a, double b, double c) {
        double delta = delta(a, b, c);
        if (delta < 0) {
            throw new IllegalArgumentException("A equação não possui raízes reais.");
        }
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}
