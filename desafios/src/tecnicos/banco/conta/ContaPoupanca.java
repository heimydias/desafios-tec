package tecnicos.banco.conta;

public class ContaPoupanca extends ContaCorrente {

    private double taxaJuros;
    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("\nTaxa de juros: " + taxaJuros + "%");
    }
}
