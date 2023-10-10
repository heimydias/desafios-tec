package tecnicos;

public class ImparesPares {
    public static void main(String[] args) {

        int[] vetor = {1, 4, 7, 10, 9, 11, 2, 6, 3, 5};
        int par = 0;

        for (int cont = 0; cont < vetor.length; cont++) {
            if (vetor[cont] % 2 != 0) {
                int impares = 0;
                impares = vetor[cont];
                System.out.println("Número impar" + impares);
            } else {
                par++;
            }
        }

        System.out.println("Existem: " + par + "numeros pares");


    }
}
