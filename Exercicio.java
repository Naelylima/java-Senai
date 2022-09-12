import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio {
    public static void main(String[] args) {
        

    String num = JOptionPane.showInputDialog("Digite um numero");
    double k= Double.parseDouble(num);
    String num_2 = JOptionPane.showInputDialog("Digite outro numero");
    double j= Double.parseDouble(num_2);
    JOptionPane.showMessageDialog(null,"SEM DECIMAL: "+Math.round(k/j));
    JOptionPane.showMessageDialog(null,"PARA CIMA: "+Math.ceil(k/j));
    JOptionPane.showMessageDialog(null,"PARA BAIXO: "+Math.floor(k/j));
    DecimalFormat valor = new DecimalFormat("#.00");
    JOptionPane.showMessageDialog(null,"COM VIRGULA: "+valor.format(k/j));


   
    // System.out.println(Math.round(k/j));
    // System.out.println(Math.ceil(k/j));
    // System.out.println(Math.floor(k/j));
    // DecimalFormat valor = new DecimalFormat("#.00");
    // System.out.print(valor.format(k/j));
    
    





    }
}   
