package JAVA;

public class Mdc {

    public static int mdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println("MDC de " + a + " e " + b + ": " + mdc(a, b));
    }
}
