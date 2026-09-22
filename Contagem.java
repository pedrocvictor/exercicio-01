public class Contagem {

    public static int contarNoIntervalo(int[] valores) {
        int n = valores.length;
        int primeiro = valores[0];
        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (valores[i] >= primeiro && valores[i] <= n) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        int[] valores = {3, 1, 5, 2, 8, 4, 6};
        System.out.println("Quantidade de valores entre " + valores[0] + " e " + valores.length + ": " + contarNoIntervalo(valores));
    }
}
