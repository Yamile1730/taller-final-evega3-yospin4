package menu;

import java.util.Scanner;

public class MenuYamileExplicacion {
    private Scanner scanner;
    private MenuYamilePrincipal menuPrincipal

    public MenuYamileExplicacion(Scanner scanner, MenuYamilePrincipal menuPrincipal) {
        this.scanner = scanner;
        this.menuPrincipal = menuPrincipal;
    }
    public void mostrarMenuExplicacion1() {
        while (true){

            System.out.println("***---------------------------------------------***");
            System.out.println("***---------------------------------------------***");
            System.out.println("***           6.Condicional Switch              ***");
            System.out.println("***---------------------------------------------***");
            System.out.println("***---------------------------------------------***");
            System.out.println("***----------1.Explicacion de Switch-------------***");
            System.out.println("***-------2.Programa de Switch - Calificaicion---***");
            System.out.println("***                 Digite Opcion               ***");
            System.out.println("***---------------------------------------------***");
            System.out.println("***---------------------------------------------***");
            System.out.print("Ingrese "6"para volver al Menu Condicional Switch");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case  1:
                    System.out.println("1.Explicacion de Switch");
                    break;

                case  2:
                    System.out.println("2.Programa de Switch - Calificaicion - Digite Opcion");
                    break;
            }
        }
    }
}
