package exercicio02;

import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu1 = 0, menu2 = 0;
        double saque, deposito;

        ContaCorrente cc1 = new ContaCorrente(12345, 200);
        ContaPoupanca cp1 = new ContaPoupanca(54312, 200, 10);
        ContaEspecial ce1 = new ContaEspecial(67890, 200, 200);

        while (menu1 == 0) {
            System.out.printf("Por favor, selecione o tipo de conta que gostaria de operar:%n1 - Conta Corrente%n2 - Conta Poupança%n3 - Conta Especial%n");
            menu1 = entrada.nextInt();
            if (menu1 < 1 || menu1 > 3) {
                System.out.println("Opção inválida, tente novamente.");
                menu1 = 0;
            }
        }

        while (menu2!=4){
            System.out.printf("Qual tipo de operação deseja realizar?%n1 - Saque%n2 - Depósito%n3 - Consultar Extrato%n4 - Sair%n");
            menu2=entrada.nextInt();
            if(menu2<1 || menu2>4){
                System.out.println("Opção inválida, tente novamente.");
            }else{
                switch(menu2){
                    case 1:
                    System.out.printf("Informe o valor do saque: R$");
                    saque=entrada.nextDouble();
                        switch(menu1){
                            case 1: cc1.saque(saque);
                            break;
                            case 2: cp1.saque(saque);
                            break;
                            case 3: ce1.saque(saque);
                            break;
                        }
                    break;
                    case 2:
                    System.out.printf("Informe o valor do depósito: R$");
                    deposito=entrada.nextDouble();
                        switch(menu1){
                            case 1: cc1.deposito(deposito);
                            break;
                            case 2: cp1.deposito(deposito);
                            break;
                            case 3: ce1.deposito(deposito);
                            break;
                        }
                    break;
                    case 3:
                    switch(menu1){
                        case 1: cc1.resumo();
                        break;
                        case 2: cp1.resumo();
                        break;
                        case 3: ce1.resumo();
                        break;
                    }
                    break;
                    default:
                        System.out.println("Agradecemos a preferência. Até a próxima.");
                }
            }
        }
        entrada.close();
    }
}