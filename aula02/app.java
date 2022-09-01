import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        // IMC
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        double peso = entrada2.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = entrada2.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.printf("Seu imc é %.2f\nMagreza", imc);
        }
        if (imc > 18.5 && imc < 24.9) {
            System.out.printf("Seu imc é %.2f\nSaudavel", imc);
        }
        if (imc > 25.0 && imc < 29.9) {
            System.out.printf("Seu imc é %.2f\nSobrepeso", imc);
        }
        if (imc > 30.0 && imc < 34.9) {
            System.out.printf("Seu imc é %.2f\nObesidade Grau |", imc);
        }
        if (imc > 35.0 && imc < 39.9) {
            System.out.printf("Seu imc é %.2f\nObesidade Grau || (Severa)", imc);
        }
        if (imc >= 40.0) {
            System.out.printf("Seu imc é %.2f\nObesidade Grau ||| (Morbida)", imc);
        }
    }
}
