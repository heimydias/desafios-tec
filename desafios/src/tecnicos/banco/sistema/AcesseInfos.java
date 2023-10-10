package tecnicos.banco.sistema;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class AcesseInfos {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        String dataInicial = scanner.nextLine();
        String dataFinal = scanner.nextLine();

       Acionistas acionistas = new Acionistas();
        List<String> analises = acionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

        for (String analise : analises) {
            System.out.println(analise);
        }
    }
}
