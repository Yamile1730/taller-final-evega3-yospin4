package menu;

public class MenuYamileDesde6 {

        public void menuYamileDesde6() {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("------------------------------------------------");
            System.out.println("-        6. Condicional Switch                 -");
            System.out.println("-        7. Condicional Ternaria               -");
            System.out.println("-        8. Bucle DO WHILE                     -");
            System.out.println("-        9. Bucle WHILE                        -");
            System.out.println("-        10.Bucle FOR                         -");
            System.out.println("-        0. Salir                              -");
            System.out.println("------------------------------------------------");
            System.out.println("------------------------------------------------");
            System.out.print("Digite una opcion: ");
            int opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 6:
                    MenuYamileDesde6 menuYamileDesde6 = new MenuYamileDesde6(scanner, this);
                    menuYamileDesde6.Condicional Switch();
                    break;
                case 7:
                    Condicional Ternaria();
                    break;
                case 8:
                    Bucle DO WHILE();
                    break;

                case 9:
                    Bucle WHILE();
                    break;

                case 10:
                    Bucle FOR();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    return; // Salir del programa
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }


    private
    private void CondicionalSwitch() {
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-             CONDICIONAL SWITCH               -");
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-        1. Explicaicon Switch                  ");
        System.out.println("-        2. Programa de Switch                 -");
        System.out.println("-         Valide su Calificacion               -");
        System.out.println("-           Digite la opcion                   -");
        System.out.println("-                                              -");
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");

        private
        private void ExplicacionCondiconalSwitch() {
            System.out.println("------------------------------------------------");
            System.out.println("-       EXPLICACION CONDICIONAL SWITCH         -");
            System.out.println("------------------------------------------------");
            System.out.println("-     Ayuda a simplificar el codigo y evita     ");
            System.out.println("-confusiones, ya que organiza en varias ramas  -");
            System.out.println("-     el codigo que va a ser ejecutado         -");
            System.out.println("-                                              -");
            System.out.println("------------------------------------------------");
            System.out.println("-    ejemplo: Switch (variable)                -");
            System.out.println("-              {                               -");
            System.out.println("-                 case valor1                  -");
            System.out.println("-                      instruccion1            -");
            System.out.println("-                      break;                  -");
            System.out.println("-                 case valor2                  -");
            System.out.println("-                      instruccion2            -");
            System.out.println("-                      break;                  -");
            System.out.println("-                 [default;]                   -");
            System.out.println("-                 instruccion default          -");
            System.out.println("-              }                               -");
            System.out.println("------------------------------------------------");
            System.out.println("------------------------------------------------");

        }

        private
        private void ExplicacionCondiconalTernaria() {
            System.out.println("------------------------------------------------");
            System.out.println("-       EXPLICACION CONDICIONAL TERNARIA       -");
            System.out.println("------------------------------------------------");
            System.out.println("-  Construccion que permite tomar decisiones    ");
            System.out.println("- basadas en una condicion booleana de manera  -");
            System.out.println("-     concisa en una sola linea de codigo      -");
            System.out.println("-                                              -");
            System.out.println("------------------------------------------------");
            System.out.println("-    ejemplo:                                  -");
            System.out.println("-  "Eres mayor de edad":"Eres menor de edad"   -");
            System.out.println("-                                              -");
            System.out.println("------------------------------------------------");
            System.out.println("------------------------------------------------");

        }
    }

    private
    private void ExplicacionCondiconalTernaria() {
        System.out.println("------------------------------------------------");
        System.out.println("-             BUCLE DO WHILE                   -");
        System.out.println("------------------------------------------------");
        System.out.println("-    Estructura de repetición o iterativa       ");
        System.out.println("-Instruccion que se ejecuta una vez como minimo-");
        System.out.println("-                                              -");
        System.out.println("------------------------------------------------");
        System.out.println("-  ejemplo:                                    -");
        System.out.println("-         do                                   -");
        System.out.println("-         {                                    -");
        System.out.println("-           instrucciones                      -");
        System.out.println("-         } while (condicion);                 -");
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");

    }
}

private
private void ExplicacionCondiconalTernaria() {
    System.out.println("------------------------------------------------");
    System.out.println("-             BUCLE WHILE                   -");
    System.out.println("------------------------------------------------");
    System.out.println("-   Ciclo repetitivo basado en los resultados   ");
    System.out.println("-           de una expresion logica            -");
    System.out.println("-                                              -");
    System.out.println("------------------------------------------------");
    System.out.println("-  ejemplo:                                    -");
    System.out.println("-         while                                -");
    System.out.println("-         {                                    -");
    System.out.println("-           bloque de sentencias               -");
    System.out.println("-         }                                    -");
    System.out.println("------------------------------------------------");
    System.out.println("------------------------------------------------");

}
}
private
private void ExplicacionCondiconalTernaria() {
    System.out.println("------------------------------------------------");
    System.out.println("-             BUCLE FOR                        -");
    System.out.println("------------------------------------------------");
    System.out.println("-   Se usa para repetir un conjunto de          ");
    System.out.println("-  de instrucciones, un numero finito de veces -");
    System.out.println("-                                              -");
    System.out.println("------------------------------------------------");
    System.out.println("-  ejemplo:                                    -");
    System.out.println("-         for (i = 0; i <  TOTAL; i++)         -");
    System.out.println("-         {                                    -");
    System.out.println("-           instrucciones;                     -");
    System.out.println("-         }                                    -");
    System.out.println("------------------------------------------------");

}
