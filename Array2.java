import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] valores = {1,2,3,4,5};
        for(int j=0; j < valores.length; j++){
            System.out.print("|"+valores[j]);
           
        }
        System.out.print("\n"+Arrays.toString(valores));
    }
    
}
