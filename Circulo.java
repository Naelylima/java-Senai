import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
    //   CIRCULO, CONTAS, 
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite o raio do seu circulo: ");
    double raio = entrada.nextDouble();
    
    double area = Math.pow(raio, 2)* 3.14;
    System.out.printf("A área do seu circulo é: "+area);

    double perimetro = (3.14*2)*raio;
    System.out.printf("\nO perímetro do seu circulo é: "+perimetro);

    double diametro = 2* raio;
    System.out.printf("\nO diâmetro do seu circulo é: "+diametro);



    }
    
}
