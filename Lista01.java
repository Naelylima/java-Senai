import java.util.Arrays;
import java.util.Scanner;

public class Lista01 {
    public static void main(String[] args) {
        // String [] paises = {"Brasil", "Índia", "Afeganistão"};
        // for (int i = 0; i < paises.length; i++){
        // System.out.println(paises[i]);

        int[] valores = { 8, 6, 3, 9, 5, 2, 7, 4, 1 };
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número [1-9]: ");
        int x = entrada.nextInt();

        System.out.println(Arrays.toString(valores));

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == x) {
                System.out.println("A posição desse numero na lista é:" + i);

            }

        }

    }

}