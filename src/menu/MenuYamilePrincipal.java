package menu;

import java.util.Scanner;
public class MenuYamilePrincipal {
    private Scanner scanner

    public MenuYamilePrincipal(Scanner scanner) {
        this.scanner = scanner;
    }

    public void

    int opcion = 0;

        do

    {

        System.out.println("***---------------------------------------------***");
        System.out.println("***---------------------------------------------***");
        System.out.println("***             MENU PRINCIPAL                  ***");
        System.out.println("***             Yamile Vega                     ***");
        System.out.println("***            Yibeth Ospina                    ***");
        System.out.println("***---------------------------------------------***");
        System.out.println("***---------------------------------------------***");

        System.out.println("***           1.Datos primitivos                ***");
        System.out.println("***               2.String                      ***");
        System.out.println("***              3.Constantes                   ***");
        System.out.println("***           4.Tipo de Operadores              ***");
        System.out.println("***       5.Condicional if else if else         ***");
        System.out.println("***           6.Condicional Switch              ***");
        System.out.println("***          7.Condicional Ternaria             ***");
        System.out.println("***            8.Bucle Do While                 ***");
        System.out.println("***              9.Bucle While                  ***");
        System.out.println("***              10.Bucle For                   ***");
        System.out.println("***               0.Salir                       ***");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("***            ingrese una opcion:              ***");
        opcion = scanner.nextInt();

        int menu = scanner.nextInt();

        switch (menu) {
                /*case 1:
                    System.out.println("1.Datos primitivos");
                    break;
                case 2:
                    System.out.println("2.String");
                    break;
                case 3:
                    System.out.println("3.Constantes");
                    break;
                case 4:
                    System.out.println("4.Tipo de Operadores");
                    break;
                case 5:
                    System.out.println("5.Condicional if else if else");
                    break;*/
            case 6:
                System.out.println("6.Condicional Switch");
                break;

            case 7:
                System.out.println("7.Condicional Ternaria");
                break;

            case 8:
                System.out.println("8. Bucle Do While");
                break;

            case 9:
                System.out.println("9. Bucle While");
                break;

            case 10:
                System.out.println("10. Bucle For");

            case 0:
                System.out.println("0. Salir");

                System.out.println("Seleccione una opcion");
                int nota = scanner.nextInt();

            default:
                System.out.println("Número no válido, por favor verifique");
        }
    } while(opcion !=0);
}



