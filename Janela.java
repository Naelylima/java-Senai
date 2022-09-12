
import javax.swing.JOptionPane;


public class Janela {
    public static void main(String[] args) {
        int ano= 2022;
        String nasc = JOptionPane.showInputDialog("Digite seu ano de nascimento:");
        int k= Integer.parseInt(nasc);
        System.out.println("Idade: "+(ano-k));
        
        
    }
}
