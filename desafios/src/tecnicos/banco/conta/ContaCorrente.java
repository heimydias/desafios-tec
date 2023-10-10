package tecnicos.banco.conta;

public class ContaCorrente {
    int numero;
    String titular;
    double saldo;

    public ContaCorrente(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes(){
        System.out.println("Conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f", saldo);
    }
}
