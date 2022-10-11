package pacote;
import java.util.Scanner;

public class Funcoes {
        double gastoPorKm;
        double tamanhoTanque;
        double saldoCarteira;
        double tanque ;
        int  velocidade;
        int acelerar;
        Scanner entrada;
        public Funcoes (){
            this.gastoPorKm =0;
            this.tamanhoTanque = 0;
            this.saldoCarteira = 100;
            this.tanque = 10;
            this.velocidade = 0;
            this.acelerar = 0;
            this.entrada = new Scanner(System.in);
        }
        void menu2(){
            System.out.println("----------Modelos Disponiveis-----------");
            System.out.print("[1] -Gol g5" +
                    "\n[2] -Corsa" +
                    "\n[3] -HB20");
            System.out.println("\n---------------------------");
            System.out.print("Digite o número do modelo do seu carro:");
            int opcao = entrada.nextInt();
            verificacarCarro(opcao);
        }
        void verificacarCarro(int opcao){
            if (opcao == 1){
            System.out.println("Você escolheu Gol g5");
                tamanhoTanque = 55;
                gastoPorKm = 10;
            }

    }
        void menu1 (){
            while (true) {
                System.out.println("\n----------------SITUAÇÃO----------------" +
                        "\n Saldo da carterira: R$"+ saldoCarteira + "\n Quantidade de litros no tanque: "+ tanque);
                System.out.println("--------------MENU-------------");
                System.out.println("[0]- Sair" +
                        "\n[1]- Acelerar" +
                        "\n[2]- Desacelerar" +
                        "\n[3]- Manutenção" +
                        "\n[4]- Abastecer" +
                        "\n[5]- Saldo Carteira");
                System.out.println("---------------------------");

                System.out.print("Digite a opção desejada: ");
                int valor = entrada.nextInt();
                if (valor == 0) {
                    break;
                }
                verificar(valor);
            }
        }
        void verificar(int opcao) {

            if (opcao>5){
                System.out.println("Digite uma das opções existentes\n");
            }
            if (opcao == 1) {
                acelerar();
            }
            if (opcao == 2) {
                desacelerar();
            }
            if (opcao == 3) {
                System.out.println("Você escolheu a opção 3\n");
            }
            if (opcao == 4) {
                abastecer();
            }
            if (opcao == 5) {
                menuSaldo();
            }
        }
        void acelerar (){
            if (velocidade <=190){
                velocidade +=  10;
                if (velocidade>= gastoPorKm){
                    tanque -= 1;
                }
                System.out.println("Sua velocidade aumentou 10Km/h");
                System.out.println("Sua velocidade atual é: " +velocidade +"Km/h");
            }
            else {
                System.out.println("Você já aingiu a velocidade maxima");
                System.out.println("Sua velocidade atual é: " +velocidade +"Km/h");
            }
        }
        void desacelerar(){
            if (velocidade >0){
                velocidade -=  10;
                System.out.println("Sua velocidade diminuiu 10Km/h");
                System.out.println("Sua velocidade atual é: " +velocidade+"km/h");
            }
            else {
                System.out.println("Sua velocidade está zerada.");
            }
        }
        void abastecer() {
            System.out.println("---------------------------");
            System.out.println("\n[1]- Alcool " +
                    "\n[2] - Gasolina" +
                    "\n Escolha a tipo de abastecimento: ");
            System.out.println("---------------------------");
            int tipo = entrada.nextInt();
            if (tipo == 2){
                while (true) {
                    String[] postos = {"Shell: ", "Ipiranga: ", "Br: ", "Esso: "};
                    Double[] precos = {5.0, 4.85, 4.9, 4.41};

                    System.out.println("[1] - " + postos[0] + precos[0] +
                            "\n[2] - " + postos[1] + precos[1] +
                            "\n[3] - " + postos[2] + precos[2] +
                            "\n[4] - " + postos[3] + precos[3]);

                    System.out.print("Digite a opção desejada: ");
                    int opcao = entrada.nextInt();
                    if (opcao >= 5) {
                        System.out.println("Digite uma opçao valida: \n");
                        continue;
                    }
                    verificar3(opcao);

                }

            }
            else if (tipo == 1){
                while (true) {
                    String[] postos = {"Shell: ", "Ipiranga: ", "Br: ", "Esso: "};
                    Double[] precos = {3.0, 2.85, 3.5, 2.99};

                    System.out.println("[1] - " + postos[0] + precos[0] +
                            "\n[2] - " + postos[1] + precos[1] +
                            "\n[3] - " + postos[2] + precos[2] +
                            "\n[4] - " + postos[3] + precos[3]);

                    System.out.print("Digite a opção desejada: ");
                    int opcao = entrada.nextInt();
                    if (opcao >= 5) {
                        System.out.println("Digite uma opçao valida: \n");
                        continue;
                    }
                    verificar3(opcao);

                }

            }
            else {
                System.out.println("Digite uma opção valida");
                abastecer();

            }

        }
        void verificar3 (double opcao){
            System.out.print("Digite o valor que deseja abastecer: ");
            double valor= entrada.nextInt();
            if (valor <= saldoCarteira){
                if (opcao == 1){
                    double litros = (valor/ 5.0);
                    saldoCarteira -= valor;
                    tanque += litros;
                    menu1();
                }
                else if (opcao == 2){
                    double litros = (valor/ 4.85);
                    saldoCarteira -= valor;
                    tanque += litros;
                    menu1();
                }
                else if (opcao == 3){
                    double litros =  (valor/ 4.9);
                    saldoCarteira -= valor;
                    tanque += litros;
                    menu1();
                }
                else if (opcao == 4){
                    double litros =  (valor/ 4.41);
                    saldoCarteira -= valor;
                    tanque += litros;
                    menu1();
                }
            }
            else {
                System.out.println("Esse valor ultrapassa seu saldo");
                menu1();
            }
        }
        void menuSaldo(){
            while (true){
                System.out.println("Seu saldo na carteira é de R$ "+ saldoCarteira);
                System.out.println("---------------------------");
                System.out.println("[0]-Sair" +
                        "\n[1]-Sacar" +
                        "\n[2]-Depositar" +
                        "\n[3]-Abastecer" +
                        "\n[4]-Voltar");
                System.out.println("---------------------------");

                System.out.print("Digite a opção desejada: ");
                int opcao = entrada.nextInt();
                verficar2(opcao);
                if (opcao == 0){
                    break;
                }
            }
        }
        void verficar2(int opcao){
            if (opcao >= 5){
                System.out.print("Digite uma das opções existentes\n");
            }
            if (opcao == 1) {
                System.out.print("Digite o valor que deseja sacar: ");
                int valor = entrada.nextInt();
                if (valor <= saldoCarteira){
                    saldoCarteira -= valor;
                }
                else {
                    System.out.println("Esse valor ultrapassa seu saldo" +
                            "\n Seu saldo é de: R$"+saldoCarteira);
                }
            }
            if (opcao == 2) {
                System.out.print("Digite o valor que deseja depositar: ");
                int valor = entrada.nextInt();
                saldoCarteira += valor;
            }
            if (opcao == 3) {
                System.out.print("Você escolheu a opção 3\n");
            }
            if (opcao == 4) {
                menu1();
            }
        }
}
