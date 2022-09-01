import javax.swing.JOptionPane;

public class CirculoJanela {
    public static void main(String[] args) {
    // // CIRCULO, AREA, DIAMETRO, ETC COM JANELAS JOPTION
    String num = JOptionPane.showInputDialog("Digite o raio do seu circulo:");
    double raio= Double.parseDouble(num);
    JOptionPane.showMessageDialog(null,"A área do seu circulo é: "+Math.pow(raio, 2)* 3.14);
    JOptionPane.showMessageDialog(null,"O perímrtro do seu circulo é: "+(3.14*2)*raio);
    JOptionPane.showMessageDialog(null,"O diâmetro do seu circulo é : "+2*raio);
    




    }
    
}
