package Bosch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TIPOS DE VARIAVEIS INTEIRAS
        byte meuByte=127;
       System.out.printf("Tamanho do byte: %d\n", meuByte);
       short meuShort=32767;
        System.out.println("Tamanho do short: "+meuShort);
        int meuInt = 2_147_483_647;
        System.out.printf("Tamanho do int: %d\n ", meuInt);
        long meuLong = 9_223_372_036_854_775_807L;
        System.out.printf("Tamanho do Long: %d\n ", meuLong);

        //VARIAVEIS TIPO REAL
            float meuFloat = 3.4e+38F;
        System.out.printf("Valor do Float: %f\n", meuFloat);
            double meuDouble = 1.7e+308;
        System.out.printf("O valor de Double é: %f\n", meuDouble);
        //

        //CARACTERE
            char meuCaractere = 'a';
        System.out.printf("Meu Char é: %c\n",meuCaractere);
            boolean meuBoolean= true;
        System.out.printf("Meu booleando é: %b\n",meuBoolean);

        //STRING

         String minhaString= "bosch";
        System.out.printf("Minha string é %s",minhaString);

//        var a=10;
//        System.out.println(a);
//        var b=3.14;
//        System.out.println(b);
//        var c= 'x';
//        System.out.println(c);
//        var d = false;
//        System.out.println(d);
//        var e = "Bosch";
//        System.out.println(e);

//        double num1=11;
//        double num2=4;
//        System.out.println(num1+num2); //soma
//        System.out.println(num1-num2); //subtração
//        System.out.println(num1*num2); //multiplicação
//        System.out.println(num1/num2); //divisão
//        System.out.println(num1%num2); // resto  da divisão

//        System.out.println(Math.sqrt(19));
//        double valor = Math.sqrt(16);
//        System.out.println(valor);

        Scanner entrada = new Scanner(System.in);
        String nome, sobrenome;
        int idade;
        nome=entrada.nextLine();
        System.out.println(nome);
        idade= entrada.nextInt();
        System.out.println(idade);
        sobrenome=entrada.next();
        System.out.println(sobrenome );
    }
}
