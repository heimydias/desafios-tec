package tecnicos.banco.resgistro;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String[] partes = entrada.split(",");

        new Transacao(partes[0], partes[1], partes[2], Double.parseDouble(partes[3])).imprimir();
    }
}
