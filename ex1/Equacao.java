package ex1;

public class Equacao {
    private double a, b, c;

    // Construtor padrão
    public Equacao() {
    }

    // Construtor para inicializar valores (opcional)
    public Equacao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Setters
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Método para calcular o delta
    public double delta() {
        return (getB() * getB()) - 4 * getA() * getC();
    }

    // Método para retornar X1
    public double retornaX1() {
        double delt = delta();
        return (-getB() + Math.sqrt(delt)) / (2 * getA());
    }

    // Método para retornar X2
    public double retornaX2() {
        double delt = delta();
        return (-getB() - Math.sqrt(delt)) / (2 * getA());
    }
}
