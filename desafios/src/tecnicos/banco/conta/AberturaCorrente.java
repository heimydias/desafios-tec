package tecnicos.banco.conta;

import java.util.Scanner;

public class AberturaCorrente {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        ContaCorrente contaCorrente = new ContaCorrente(numeroConta, nomeTitular, saldo);

        System.out.println("Informacoes:");
       contaCorrente.exibirInformacoes();
    }
}
