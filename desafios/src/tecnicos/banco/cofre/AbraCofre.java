package tecnicos.banco.cofre;

import java.util.Scanner;

public class AbraCofre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")) {
            CofreDigital cofreDigital = new CofreDigital(null);
            cofreDigital.imprimirInformacoes();
            int senhaInicial = scanner.nextInt();
            cofreDigital.atualizarSenha(senhaInicial);
            int confirmarSenha = scanner.nextInt();
            if (cofreDigital.validarSenha(confirmarSenha)) {
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        }
    }
}
