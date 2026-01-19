import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaUsuario = null;

        System.out.println("----------BANCO----------");
        System.out.println("INFORME SEU NOME: ");
        String nome = scanner.nextLine();

        System.out.println("----------TIPO DE CONTA----------");
        System.out.println("1. CONTA CORRENTE");
        System.out.println("2. CONTA POUPANÇA");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                contaUsuario = new ContaCorrente(nome, 0, TiposDeConta.CORRENTE);
                break;

            case 2:
                contaUsuario = new ContaPoupanca(nome, 0, TiposDeConta.POUPANCA);
                break;

            default:
                System.out.println("OPÇÃO INVÁLIDA");
                System.exit(0);
        }

        System.out.println("CONTA CRIADO COM SUCESSO");
        System.out.println("DETALHES DA CONTA");
        System.out.println("NOME: " + contaUsuario.nome);
        System.out.println("TIPO DE CONTA: " + contaUsuario.tipoDeConta);

        boolean continuar = true;
        while (continuar){
            System.out.println("\n----------MENU----------");
            System.out.println("1. DEPOSITAR");
            System.out.println("2. CONSULTAR SALDO");
            System.out.println("3. SACAR");
            System.out.println("4. EXIT");
            int opcaoFuncionalidades = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoFuncionalidades){
                case 1:
                    System.out.println("INFORME O VALOR A SER DEPOSITADO: R$");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();
                    contaUsuario.depositar(valor);
                    break;

                case 2:
                    contaUsuario.consultarSaldo();
                    break;

                case 3:
                    System.out.println("INFORME O VALOR DO SAQUE: R$");
                    double saque = scanner.nextDouble();
                    scanner.nextLine();
                    contaUsuario.sacar(saque);
                    break;

                case 4:
                    continuar = false;
                    break;
            }
        }
        scanner.close();
    }

}
