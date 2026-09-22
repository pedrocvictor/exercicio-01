package JAVA;

import java.util.Arrays;

public class Quicksort {

    public static void quicksort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = particionar(array, inicio, fim);
            quicksort(array, inicio, posicaoPivo - 1);
            quicksort(array, posicaoPivo + 1, fim);
        }
    }

    private static int particionar(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) {
                i++;
                trocar(array, i, j);
            }
        }

        trocar(array, i + 1, fim);
        return i + 1;
    }

    private static void trocar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 1, 9, 2, 7};
        quicksort(numeros, 0, numeros.length - 1);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}
