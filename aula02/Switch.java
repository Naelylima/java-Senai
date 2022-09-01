import javax.swing.JOptionPane;

public class Switch {
    public static void main(String[] args) {
        
        //  O SWITCH É TIPO IF ELIF E ELSE SÓ QUE PARA VARIAS CONDIÇÕES

        int x = 5;
         switch (x) {
            case 0:
                JOptionPane.showMessageDialog(null, "Zero");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Dez");
                break;

                default:
                System.out.println("nenhum");
                break;

    }
    
}
}