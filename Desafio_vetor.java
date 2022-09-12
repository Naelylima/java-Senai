import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio_vetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedindo o tamanho do vetor
        System.out.print("Digite o tamanho do seu vetor: ");
        int tamanho = entrada.nextInt();

        // Lista vazia
        int[] vetorPrinicipal = new int[tamanho];

        // Tamanho (tanto) de variaves dos impares e pares
        int par = 0;
        int impar = 0;

        // For para add na lista
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite um número: ");
            int num = entrada.nextInt();
            vetorPrinicipal[i] = num;

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        // listas vazia par e impar
        int[] listaPar = new int[par];
        int[] listaImpar = new int[impar];

        // AuxPar para guardar os valores pares ou impares que percorrer o
        // vetorPrincipal
        int auxPar = 0;
        int auxImpar = 0;

        // For para add na lista dos impares e pares
        for (int i = 0; i < tamanho; i++) {

            if (vetorPrinicipal[i] % 2 == 0) {
                listaPar[auxPar] = vetorPrinicipal[i];
                auxPar++;
            } else {
                listaImpar[auxImpar] = vetorPrinicipal[i];
                auxImpar++;
            }
        }
        // print listas
        System.out.println("\nA lista total é: " + Arrays.toString(vetorPrinicipal));
        System.out.println("Os números pares são: " + Arrays.toString(listaPar));
        System.out.println("Os números impares são: " + Arrays.toString(listaImpar));
    }
}
