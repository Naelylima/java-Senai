
import javax.swing.JOptionPane;

public class exercicio2 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Digite sua idade");

        int num_1 = Integer.parseInt(num);
        String resultado = num_1 >=18 ? "verdadeiro" : "falso";
        JOptionPane.showMessageDialog( null,""+resultado);
        

        // System.out.println("Digite sua idade: ");
        // String nome = num.nextLine();
        // String resultado = num>=18 ? "maior" : "menor";
    }
    
}
