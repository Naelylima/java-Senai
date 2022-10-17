package veiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Veiculo {
    ArrayList<String> modeloCarro = new ArrayList<>();
    ArrayList<Double> ConsumoCarro = new ArrayList<>();
    ArrayList<Double> tanqueCarro = new ArrayList<>();
    ArrayList<Double> velocidadeCarro = new ArrayList<>();


    ArrayList<String> modeloMoto = new ArrayList<>();
    ArrayList<Double> ConsumoMoto = new ArrayList<>();
    ArrayList<Double> tanqueMoto = new ArrayList<>();
    ArrayList<Double> velocidadeMoto = new ArrayList<>();
    ArrayList<String> modeloOutro = new ArrayList<>();
    ArrayList<Double> ConsumoOutro = new ArrayList<>();
    ArrayList<Double> tanqueOutro = new ArrayList<>();
    ArrayList<Double> velocidadeOutro = new ArrayList<>();

    String veiculoNome;
    Scanner op1 = new Scanner(System.in);
    double consumo;
    double velocidade;
    double tanque;

    String modelo;


    public Veiculo() {
        this.veiculoNome = "";
        this.consumo = 0;
        this.velocidade= 0.0;
        this.tanque = 0;
        this.modelo = "";

    }

    void escolhaVeiculo() {
        while (true) {
            System.out.print("-------- Modelos ----------" +
                    "\n[0] -Sair" +
                    "\n[1] -Adicionar"
                    + "\n[2] -Listar"
                    + "\n[3] -Escolher\n"
            );
            System.out.print("Escolha uma opção: ");
            int opcaoMenu = op1.nextInt();

            if (opcaoMenu == 0) {
                break;
            } else if (opcaoMenu == 1) {
                adicionarVeiculo();
            } else if (opcaoMenu == 2){
                printaVeiculos();
            } else if (opcaoMenu == 3){
                menuModelos();
            }

        }
    }

    void detalheVeiculo(){
        System.out.print("Modelo do veiculo: ");
        modelo = op1.nextLine();

        System.out.print("Consumo por litro: ");
        consumo = op1.nextDouble();


        System.out.print("Tanque: ");
        tanque = op1.nextDouble();


        System.out.print("Velocidade maxima: ");
        velocidade = op1.nextDouble();


        System.out.println("-------------------------");
        System.out.println("*** Veiculo Adicionado com sucesso ***\n");

    }
    void veiculoAdicionado(){
        System.out.println("Modelo : "+ modelo);
        System.out.println("Consumo: "+ consumo);
        System.out.println("Tanque: "+ tanque);
        System.out.println("Velocidade Max: "+ velocidade);
    }

    void adicionarVeiculo() {
        while (true) {
            System.out.print("-------- Modelos ----------" +
                    "\n[0] -Sair" +
                    "\n[1] -Carro"
                    + "\n[2] -Moto"
                    + "\n[3] -Outro\n"
            );
            System.out.print("Escolha uma opção: ");
            int opcaoAdicionar = op1.nextInt();
            op1.nextLine();
            if (opcaoAdicionar ==0){
                break;

            }else if (opcaoAdicionar == 1){
                System.out.println("-------------------------");
                System.out.println("Por favor digite as especificações a seguir: ");
                detalheVeiculo();
                modeloCarro.add(modelo);
                ConsumoCarro.add(consumo);
                tanqueCarro.add(tanque);
                velocidadeCarro.add(velocidade);
                veiculoAdicionado();


            }
            else if (opcaoAdicionar == 2){
                System.out.println("-------------------------");
                System.out.println("Por favor digite as especificações a seguir: ");
                detalheVeiculo();
                modeloMoto.add(modelo);
                ConsumoMoto.add(consumo);
                tanqueMoto.add(tanque);
                velocidadeMoto.add(velocidade);
                veiculoAdicionado();

            }
            else if (opcaoAdicionar == 3){
                System.out.println("-------------------------");
                System.out.println("Por favor digite as especificações a seguir: ");

                detalheVeiculo();
                modeloOutro.add(modelo);
                ConsumoOutro.add(consumo);
                tanqueOutro.add(tanque);
                velocidadeOutro.add(velocidade);
                veiculoAdicionado();

            }

        }
    }
    void printaVeiculos(){
        System.out.println("\nModelos disponiveis de carro: "+ modeloCarro);
        System.out.println("Modelos disponiveis de moto: "+ modeloMoto);
        System.out.println("Modelos disponiveis de moto: "+ modeloOutro);

    }
    void menuModelos(){
        while (true){
            System.out.println("\n----------MODELOS------------");
            System.out.println("[1] - Carros" +
                    "\n[2] - Motos" +
                    "\n[3] - Outros" +
                    "\n[4] - Sair");
            System.out.print("Digite a opção que deseja visualizar: ");
            int modeloEscolhido = op1.nextInt();
            if (modeloEscolhido == 4){
                break;
            }
            verificarMenuModelos(modeloEscolhido);
        }


    }
    void verificarMenuModelos(int opcao){
            if (opcao == 1){
                if(modeloCarro.size()>0){
                    for(int i=0; i<modeloCarro.size(); i++){
                    System.out.println("\n-------------------------------");
                        System.out.println("Veículo carro nº: ["+i+"]");
                        System.out.print("\nVeiculo: "+modeloCarro.get(i));
                        System.out.print("\nConsumo: "+ ConsumoCarro.get(i));
                        System.out.print("\nTanque: "+ tanqueCarro.get(i));
                        System.out.print("\nVelocidade: "+ velocidadeCarro.get(i));
                    }
                }
                else {
                    System.out.println("\n******************************");
                    System.out.println("Não existem opções disponiveis");
                    System.out.println("******************************");
                }

            }
            else if (opcao == 2){
                if(modeloMoto.size()>0){
                    for(int i=0; i<modeloMoto.size(); i++){
                    System.out.println("----------------------------------");
                        System.out.println("\nVeículo moto nº: ["+i+"]");
                        System.out.print("\nVeiculo: "+modeloMoto.get(i));
                        System.out.print("\nConsumo: "+ ConsumoMoto.get(i));
                        System.out.print("\nTanque: "+ tanqueMoto.get(i));
                        System.out.print("\nVelocidade: "+ velocidadeMoto.get(i));
                    }
                }
                else {
                    System.out.println("\n******************************");
                    System.out.println("Não existem opções disponiveis");
                    System.out.println("******************************");
                }

            }
            else if (opcao == 3){
                if(modeloOutro.size()>0){
                    for(int i=0; i<modeloOutro.size(); i++){
                     System.out.println("--------------------------------");
                        System.out.println("\nVeículo Outro nº: ["+i+"]");
                        System.out.print("\nVeiculo: "+modeloOutro.get(i));
                        System.out.print("\nConsumo: "+ ConsumoOutro.get(i));
                        System.out.print("\nTanque: "+ tanqueOutro.get(i));
                        System.out.print("\nVelocidade: "+ velocidadeOutro.get(i));
                    }
                }
                else {
                    System.out.println("\n******************************");
                    System.out.println("Não existem opções disponiveis");
                    System.out.println("******************************");
                }

            }

    }
}





