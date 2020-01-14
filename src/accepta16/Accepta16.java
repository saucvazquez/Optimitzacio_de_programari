package UF2.NF1;

//importar llibreries
import java.text.DecimalFormat;
import java.util.Scanner;

public class Optimitzacio_de_programari {

    // variables globals
    private static int cProva, entrada;
    private static double sum;
    private static Scanner sc = null;
    private static String str = null;

    // main
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        entrada = sc.nextInt();

        for (int i = 0; i < entrada; i++) {
            operacion();
        }
    }

    //metode per comprovar les dades
    public static void operacion() {
        try {
            sc = new Scanner(System.in);
            cProva = sc.nextInt();

            sum = Math.sqrt(cProva);

            str = String.valueOf(sum);

            int intNumber = Integer.parseInt(str.substring(0, str.indexOf('.')));

            if (sum % 2 == 0) {
                if (sum * sum == cProva) {
                    System.out.println(intNumber + " (Quadrat Perfecte)");
                }
            } else {
                System.out.println(intNumber + " (Quadrat Imperfecte)");
            }

        } catch (Exception ex) {
            System.out.println("Torna a introduir les dades.");
        }
    }
}

