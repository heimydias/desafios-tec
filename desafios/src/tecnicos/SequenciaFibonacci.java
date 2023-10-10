package tecnicos;

public class SequenciaFibonacci {

    public static void main(String[] args) {

        int n = 5;
        int anterior = 0;
        int posterior = 1;

        for (int cont = 2; cont < n; cont++) {
            if (cont == 2) {
                System.out.println(anterior);
                System.out.println(posterior);
            }
            int resultado = anterior + posterior;
            anterior = posterior;
            posterior = resultado;
            System.out.println(resultado);
        }
    }
}
