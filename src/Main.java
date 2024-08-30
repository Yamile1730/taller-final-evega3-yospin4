import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------------");

                   System.out.println("MENU PRINCIPAL" );

        System.out.println("-------------------------------------------");

            System.out.println("1.Primeros Datos");
            System.out.println("2.String");
            System.out.println("3.Constantes");
            System.out.println("4.Salir");
            System.out.println("5. Cambio");
            System.out.println("6.Salir");


        System.out.println("Seleccione una opcion");
        int nota = scanner.nextInt();



        int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("1.Datos Primitivos");
                    break;

                case 2:
                    System.out.println("2.String");
                    break;
                default:
                    System.out.println("Número no válido, por favor verifique");
            }
    }
}