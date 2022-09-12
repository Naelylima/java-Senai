import java.util.Scanner;


public class aula01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Qual seu nome? ");
        String nome = s.nextLine();
        System.out.println(nome);
        s.close();
    }
    
}
