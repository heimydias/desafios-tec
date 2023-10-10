package tecnicos.banco.conta;

import java.util.Scanner;

public class AberturaPoupanca {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, nomeTitular, saldo, taxaJuros);

        System.out.println("Conta Poupanca");
        contaPoupanca.exibirInformacoes();
    }
}
