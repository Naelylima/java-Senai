import java.text.DecimalFormat;

import javax.swing.*;

public class ImcJanela {
    public static void main(String[] args) {
        // IMC COM JANELAS JOPTION
        
        String num = JOptionPane.showInputDialog("Digite seu peso:");
        double peso = Double.parseDouble(num);
        String num2 = JOptionPane.showInputDialog("Digite sua altura:");
        double altura = Double.parseDouble(num2);

        double imc= peso/(altura*altura);
        DecimalFormat format = new DecimalFormat("#.00");

        if (imc <18.5)
        {
            JOptionPane.showMessageDialog( null, "Seu imc é: "+ format.format(imc) + "\nMagreza");
        }
        if (imc > 18.5 && imc < 24.9)
        {
            JOptionPane.showMessageDialog( null, "Seu imc é: "+ format.format(imc) + "\nSaudavel");
        }
        if (imc > 25.0 && imc < 29.9)
        {
            JOptionPane.showMessageDialog( null, "Seu imc é: "+ format.format(imc) + "\nSobrepeso");
        }
        if (imc > 30.0 && imc < 34.9)
        {
            JOptionPane.showMessageDialog( null, "Seu imc é: "+ format.format(imc) + "\nObeso");
       }
       
        
        

    }
    
}
