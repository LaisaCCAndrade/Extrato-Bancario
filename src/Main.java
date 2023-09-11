import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        Cliente venilton = new Cliente(nomeCliente);

        ContaCorrente cc = new ContaCorrente(venilton, 500);

        System.out.print("Digite o valor a ser depositado na conta corrente: ");
        double valorDepositoCorrente = scanner.nextDouble();
        cc.depositar(valorDepositoCorrente);

        System.out.print("Digite o valor a ser retirado da conta corrente: ");
        double valorRetiradaCorrente = scanner.nextDouble();
        cc.sacar(valorRetiradaCorrente);

        ContaPoupanca poupanca = new ContaPoupanca(venilton);

        System.out.print("Digite o valor a ser depositado na conta poupança: ");
        double valorDepositoPoupanca = scanner.nextDouble();
        poupanca.depositar(valorDepositoPoupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        scanner.close(); 
    }
}
