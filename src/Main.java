
package menu;
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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuYamilePrincipal menuPrincipal = new MenuYamilePrincipal(Scanner);
        menuPrincipal.mostrarMenu();
    }
}




















