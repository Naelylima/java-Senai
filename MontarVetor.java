import java.util.Arrays;
import java.util.Scanner;

public class MontarVetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedindo o tamanho do vetor
        System.out.print("Digite o tamanho do seu vetor: ");
        int tamanho = entrada.nextInt();

        // Lista vazia
        int[] vetor = new int[tamanho];

        // For para add na lista
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite um valor: ");
            int v = entrada.nextInt();
            vetor[i] = v;
        }

        // Print lista
        System.out.println("\n A lista é: " + Arrays.toString(vetor));
        Arrays.sort(vetor);
        System.out.println("Essa é a lista em ordem crescente é: " + Arrays.toString(vetor));
    }
}
