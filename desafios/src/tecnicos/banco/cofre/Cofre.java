package tecnicos.banco.cofre;

public abstract class Cofre {

    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Metodo de abertura: " + metodoAbertura);
    }
}
