package menu;

import java.lang.runtime.SwitchBootstraps;


import java.util.Scanner;
import java.util.Random;

public class MenuPrincipal {
    private Scanner scanner;
    private Random random;

    public MenuPrincipal(Scanner scanner) {
        this.scanner = scanner;
        this.random = new Random();
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("-        MENU CAPITULO DE PROGRAMACION         -");
            System.out.println("-         YIBETH OSPINA Y YAMILE VEGA          -");
            System.out.println("------------------------------------------------");
            System.out.println("-        1. Datos primitivos.                  -");
            System.out.println("-        2. String                             -");
            System.out.println("-        3. Constante                          -");
            System.out.println("-        4. Tipo de operadores                 -");
            System.out.println("-        5. Condicional IF, ELSE, IF ELSE      -");
            System.out.println("-        6. Condicional Switch                 -");
            System.out.println("-        7. Condicional Ternaria               -");
            System.out.println("-        8. Bucle DO WHILE                     -");
            System.out.println("-        9. Bucle WHILE                        -");
            System.out.println("-        10. Bucle FOR                         -");
            System.out.println("-        0. Salir                              -");
            System.out.println("------------------------------------------------");
            System.out.print("Digite una opcion: ");
            int opcionPrincipal = scanner.nextInt();
            switch (opcionPrincipal) {
                case 1:
                    datosPrimitivos();
                    break;
                case 2:
                    explicacionString();
                    break;
                case 3:
                    explicacionConst();
<<<<<<< HEAD
                    break;
                case 4:
                    tipoOperadores();
                    break;
                case 5:
                    condicionales();
                    break;
                case 6:
                    condicionalswitch();
                    break;
                case 7:
                    condicionalternaria();
                    break;
                case 8:
                    bucledowhile();
                    break;
                case 9:
                    buclewhile();
                    break;
                case 10:
                    buclefor();
                    break;
=======
                    break;
                case 4:
                    tipoOperadores();
                    break;
                case 5:
                    condicionales();
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
                case 0:
                    System.out.println("Saliendo del programa...");
                    return; // Salir del programa
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    private void datosPrimitivos() {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("-               DATOS PRIMITIVOS               -");
            System.out.println("------------------------------------------------");
            System.out.println("-        1. Explicacion byte                   -");
            System.out.println("-        2. Explicacion short                  -");
            System.out.println("-        3. Explicacion int                    -");
            System.out.println("-        4. Explicacion long                   -");
            System.out.println("-        5. Explicacion float                  -");
            System.out.println("-        6. Explicacion double                 -");
            System.out.println("-        7. Explicacion char                   -");
            System.out.println("-        8. Explicacion boolean                -");
            System.out.println("-        0. Salir                              -");
            System.out.println("------------------------------------------------");
            System.out.print("Digite una opcion: ");


            int opcion1 = scanner.nextInt();
            switch (opcion1) {
                case 1:
                    mostrarExplicacionByte();
                    break;
                case 2:
                    mostrarExplicacionShort();
                    break;
                case 3:
                    mostrarExplicacionInt();
                    break;
                case 4:
                    mostrarExplicacionLong();
                    break;
                case 5:
                    mostrarExplicacionFloat();
                    break;
                case 6:
                    mostrarExplicacionDouble();
                    break;
                case 7:
                    mostrarExplicacionChar();
                    break;
                case 8:
                    mostrarExplicacionBoolean();
                    break;
                case 0:
                    System.out.println("Regresando al menú principal...");
                    return; // Salir del bucle y regresar al menú principal
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    private void mostrarExplicacionByte() {
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION BYTE               -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Tipo de dato que representa un entero, sin  -");
        System.out.println("-  signo de numero 0 a 255                     -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-  char letra = 'A'; // 'A' ocupa 1 byte       -");
        System.out.println("------------------------------------------------");
    }

    private void mostrarExplicacionShort() {
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION SHORT              -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Tipo de dato entero que ocupa menos espacio -");
        System.out.println("-  en memoria en comparación con otros tipos   -");
        System.out.println("-  de datos enteros como 'int'                 -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-  short num1 = 10000                          -");
        System.out.println("------------------------------------------------");
    }

    private void mostrarExplicacionInt() {
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION INT                -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos crear numeros -");
        System.out.println("-  enteros, no superiores a tres cifras        -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-        int edad = 25;                        -");
        System.out.println("------------------------------------------------");
    }

<<<<<<< HEAD
    private void mostrarExplicacionLong() {
=======
    private void mostrarExplicacionLong(){
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION LONG               -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos crear numeros -");
        System.out.println("-  enteros muy grandes, mayores a los que      -");
        System.out.println("-  soporta el tipo int                         -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-        long distancia = 3680000L;            -");
        System.out.println("------------------------------------------------");
    }

<<<<<<< HEAD
    private void mostrarExplicacionFloat() {
=======
    private void mostrarExplicacionFloat(){
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION FLOAT              -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos crear numeros -");
        System.out.println("-  con punto decimal, pero con precision       -");
        System.out.println("-  simple (aproximadamente 7 dígitos)          -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-        float temperatura = 36.5 ;            -");
        System.out.println("------------------------------------------------");
    }

<<<<<<< HEAD
    private void mostrarExplicacionDouble() {
=======
    private void mostrarExplicacionDouble(){
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
        System.out.println("------------------------------------------------");
        System.out.println("-              EXPLICACION DOUBLE              -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos crear numeros -");
        System.out.println("-  con punto decimal y mayor precision         -");
        System.out.println("-  que el tipo float (aproximadamente 15       -");
        System.out.println("-  dígitos).                                   -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-        double pi = 3.14159265359;            -");
        System.out.println("------------------------------------------------");
    }

<<<<<<< HEAD
    private void mostrarExplicacionChar() {
=======
    private void mostrarExplicacionChar(){
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
        System.out.println("------------------------------------------------");
        System.out.println("-                EXPLICACION CHAR              -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos almacenar     -");
        System.out.println("-  un único carácter.                          -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-        char inicial = 'A';                   -");
        System.out.println("------------------------------------------------");
    }

<<<<<<< HEAD
    private void mostrarExplicacionBoolean() {
=======
    private void mostrarExplicacionBoolean(){
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
        System.out.println("------------------------------------------------");
        System.out.println("-              EXPLICACION BOOLEAN             -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Se utiliza cuando necesitamos almacenar     -");
        System.out.println("-  valores de verdad, es decir, verdadero o    -");
        System.out.println("-  falso (true o false).                       -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-        boolean esMayor = true;               -");
        System.out.println("------------------------------------------------");

    }

    private void explicacionString() {
        System.out.println("------------------------------------------------");
        System.out.println("-               EXPLICACION STRING             -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Tipo de dato que representa una cadena de   -");
        System.out.println("-  caracteres.                                 -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-  String saludo = 'Hola, mundo!';             -");
        System.out.println("------------------------------------------------");
    }

    private void explicacionConst() {
        System.out.println("------------------------------------------------");
        System.out.println("-          EXPLICACION DE CONSTANTE            -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Es un valor que no cambia durante la        -");
        System.out.println("-  ejecución de un programa. A diferencia de   -");
        System.out.println("-  las variables, cuyo valor puede modificarse,-");
        System.out.println("-  las constantes están diseñadas para mantener-");
        System.out.println("-  un valor fijo a lo largo de la ejecución del-");
        System.out.println("-  programa.                                   -");
        System.out.println("-  Ejemplo:                                    -");
        System.out.println("-  const int MAX_USERS = 100;                  -");
        System.out.println("------------------------------------------------");
    }

<<<<<<< HEAD
    private void tipoOperadores() {
=======
    private void tipoOperadores(){
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("-             TIPO DE OPERADORES               -");
            System.out.println("------------------------------------------------");
            System.out.println("-        1. Aritmeticos                        -");
            System.out.println("-        2. Relacionales                       -");
            System.out.println("-        3. Logicos                            -");
            System.out.println("-        4. Asignacion                         -");
            System.out.println("-        5. Incremento/Decremento              -");
            System.out.println("-        0. Salir                              -");
            System.out.println("------------------------------------------------");
            System.out.print("Digite una opcion: ");
            int opcion4 = scanner.nextInt();

<<<<<<< HEAD
            switch (opcion4) {
=======
            switch(opcion4) {
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
                case 1:
                    mostrarExplicacionAritmeticos();
                    break;
                case 2:
                    mostrarExplicacionRelacionales();
                    break;
                case 3:
                    mostrarExplicacionLogicos();
                    break;
                case 4:
                    mostrarExplicacionAsignacion();
                    break;
                case 5:
                    mostrarExplicacionIncreDecre();
                    break;
                case 0:
                    System.out.println("Regresando al menú principal...");
                    return; // Salir del bucle y regresar al menú principal
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
<<<<<<< HEAD

=======
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
    private void mostrarExplicacionAritmeticos() {
        System.out.println("---------------------------------------------------");
        System.out.println("-               OPERADORES ARITMÉTICOS            -");
        System.out.println("----------------------------------------------------");
        System.out.println("-  Tipo de operador que realiza operaciones        -");
        System.out.println("-  matemáticas básicas entre operandos.            -");
        System.out.println("----------------------------------------------------");
        System.out.println("-  Operador        | Descripción                   -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  +               | Suma                          -");
        System.out.println("-  Ejemplo:        | int resultado = 5 + 3;        -");
        System.out.println("-  resultado       | 8                             -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  -               | Resta                         -");
        System.out.println("-  Ejemplo:        | int resultado = 10 - 4;       -");
        System.out.println("-  resultado       | 6                             -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  *               | Multiplicación                -");
        System.out.println("-  Ejemplo:        | int resultado = 7 * 6;        -");
        System.out.println("-  resultado       | 42                            -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  /               | División                      -");
        System.out.println("-  Ejemplo:        | int resultado = 20 / 4;       -");
        System.out.println("-  resultado       | 5                             -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  %               | Módulo (resto de la división) -");
        System.out.println("-  Ejemplo:        | int resultado = 15 % 4;       -");
        System.out.println("-  resultado       | 3                             -");
        System.out.println("----------------------------------------------------");
    }

    private void mostrarExplicacionRelacionales() {
        System.out.println("-----------------------------------------------------");
        System.out.println("-               OPERADORES RELACIONALES             -");
        System.out.println("-----------------------------------------------------");
        System.out.println("-  Tipo de operador que compara dos valores y       -");
        System.out.println("-  devuelve un resultado booleano (true o false).   -");
        System.out.println("-----------------------------------------------------");
        System.out.println("-  Operador        | Descripción                    -");
        System.out.println("-  ----------------|---------------------------------");
        System.out.println("-  ==              | Igual a                        -");
        System.out.println("-  Ejemplo:        | boolean resultado = (5 == 5);  -");
        System.out.println("-  resultado       | true                           -");
        System.out.println("-  ----------------|---------------------------------");
        System.out.println("-  !=              | Diferente de                   -");
        System.out.println("-  Ejemplo:        | boolean resultado = (5 != 3);  -");
        System.out.println("-  resultado       | true                           -");
        System.out.println("-  ----------------|---------------------------------");
        System.out.println("-  >               | Mayor que                      -");
        System.out.println("-  Ejemplo:        | boolean resultado = (7 > 4);   -");
        System.out.println("-  resultado       | true                           -");
        System.out.println("-  ----------------|---------------------------------");
        System.out.println("-  <               | Menor que                      -");
        System.out.println("-  Ejemplo:        | boolean resultado = (3 < 6);   -");
        System.out.println("-  resultado       | true                           -");
        System.out.println("-  ----------------|---------------------------------");
        System.out.println("-  >=              | Mayor o igual que              -");
        System.out.println("-  Ejemplo:        | boolean resultado = (5 >= 5);  -");
        System.out.println("-  resultado       | true                           -");
        System.out.println("-  ----------------|---------------------------------");
        System.out.println("-  <=              | Menor o igual que              -");
        System.out.println("-  Ejemplo:        | boolean resultado = (4 <= 5);  -");
        System.out.println("-  resultado       | true                           -");
        System.out.println("-----------------------------------------------------");

    }

    private void mostrarExplicacionLogicos() {
        System.out.println("--------------------------------------------------");
        System.out.println("-               OPERADORES LÓGICOS               -");
        System.out.println("--------------------------------------------------");
        System.out.println("-  Tipo de operador que realiza operaciones      -");
        System.out.println("-  lógicas entre valores booleanos.              -");
        System.out.println("--------------------------------------------------");
        System.out.println("-  Operador        | Descripción                 -");
        System.out.println("-  ----------------|------------------------------");
        System.out.println("-  &&              | AND lógico                  -");
        System.out.println("-  Ejemplo:        | boolean resultado = (5 > 3) -");
        System.out.println("                   | && (8 < 10);                -");
        System.out.println("-  resultado       | true                        -");
        System.out.println("-  ----------------|---------------------------- -");
        System.out.println("-  ||              | OR lógico                   -");
        System.out.println("-  Ejemplo:        | boolean resultado = (5 > 3) -");
        System.out.println("                   | || (8 > 10);                -");
        System.out.println("-  resultado       | true                        -");
        System.out.println("-  ----------------|------------------------------");
        System.out.println("-  !               | NOT lógico                  -");
        System.out.println("-  Ejemplo:        | boolean resultado = !(5 > 3);-");
        System.out.println("-  resultado       | false                        -");
        System.out.println("--------------------------------------------------");

    }

<<<<<<< HEAD
    private void mostrarExplicacionAsignacion() {
=======
    private void mostrarExplicacionAsignacion(){
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
        System.out.println("----------------------------------------------------");
        System.out.println("-               OPERADORES DE ASIGNACIÓN           -");
        System.out.println("----------------------------------------------------");
        System.out.println("-  Tipo de operador que asigna un valor a una      -");
        System.out.println("-  variable y a menudo combina la asignación       -");
        System.out.println("-  con una operación.                              -");
        System.out.println("----------------------------------------------------");
        System.out.println("-  Operador        | Descripción                   -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  =               | Asignación simple             -");
        System.out.println("-  Ejemplo:        | int a = 10;                   -");
        System.out.println("-  resultado       | a será 10                     -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  +=              | Asignación con suma           -");
        System.out.println("-  Ejemplo:        | int a = 10; a += 5;           -");
        System.out.println("-  resultado       | a será 15                     -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  -=              | Asignación con resta          -");
        System.out.println("-  Ejemplo:        | int a = 10; a -= 3;           -");
        System.out.println("-  resultado       | a será 7                      -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  *=              | Asignación con multiplicación -");
        System.out.println("-  Ejemplo:        | int a = 10; a *= 4;           -");
        System.out.println("-  resultado       | a será 40                     -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  /=              | Asignación con división       -");
        System.out.println("-  Ejemplo:        | int a = 20; a /= 4;           -");
        System.out.println("-  resultado       | a será 5                      -");
        System.out.println("-  ----------------|--------------------------------");
        System.out.println("-  %=              | Asignación con módulo         -");
        System.out.println("-  Ejemplo:        | int a = 20; a %= 6;           -");
        System.out.println("-  resultado       | a será 2                      -");
        System.out.println("----------------------------------------------------");

    }

<<<<<<< HEAD
    private void mostrarExplicacionIncreDecre() {
=======
    private void mostrarExplicacionIncreDecre(){
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
        System.out.println("--------------------------------------------------");
        System.out.println("-       OPERADORES DE INCREMENTO/DECREMENTO      -");
        System.out.println("--------------------------------------------------");
        System.out.println("-  Tipo de operador que aumenta o disminuye el   -");
        System.out.println("-  valor de una variable en 1.                   -");
        System.out.println("--------------------------------------------------");
        System.out.println("-  Operador        | Descripción                 -");
        System.out.println("-  ----------------|------------------------------");
        System.out.println("-  ++              | Incrementa después de usar  -");
        System.out.println("-  Ejemplo:        | int a = 5;                  -");
        System.out.println("-  Ejemplo:        | int b = a++;                -");
        System.out.println("-  Resultado       | a será 6, b será 5          -");
        System.out.println("-  ----------------|------------------------------");
        System.out.println("-  --              | Decrementa después de usar  -");
        System.out.println("-  Ejemplo:        | int a = 5;                  -");
        System.out.println("-  Ejemplo:        | int b = a--;                -");
        System.out.println("-  Resultado       | a será 4, b será 5          -");
        System.out.println("--------------------------------------------------");
    }

<<<<<<< HEAD
    private void condicionales() {
=======
    private void condicionales(){
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("-                CONDICIONALES                 -");
            System.out.println("------------------------------------------------");
            System.out.println("-        1. If                                 -");
            System.out.println("-        2. Else                               -");
            System.out.println("-        3. Else if                            -");
            System.out.println("-        0. Salir                              -");
            System.out.println("------------------------------------------------");
            System.out.print("Digite una opcion: ");
            int opcion5 = scanner.nextInt();

            switch (opcion5) {
                case 1:
                    mostrarExplicacionIf();
                    break;
                case 2:
                    mostrarExplicacionElse();
                    break;
                case 3:
                    mostrarExplicacionElseIf();
                    break;
                case 0:
                    System.out.println("Regresando al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

<<<<<<< HEAD
    private void mostrarExplicacionIf() {
=======
    private void mostrarExplicacionIf(){
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
        System.out.println("----------------------------------------------------");
        System.out.println("-                  EXPLICACION IF                  -");
        System.out.println("----------------------------------------------------");
        System.out.println("-  Se utiliza para evaluar una condicion           -");
        System.out.println("-  y ejecutar un bloque de codigo si               -");
        System.out.println("-  la condicion es verdadera (true).               -");
        System.out.println("-  Ejemplo:                                        -");
        System.out.println("-        int edad = 25;                            -");
        System.out.println("-        if (edad >= 18) {                         -");
        System.out.println("-          System.out.println('Es mayor de edad'); -");
        System.out.println("-        }                                         -");
        System.out.println("----------------------------------------------------");
    }

<<<<<<< HEAD
    private void mostrarExplicacionElse() {
=======
    private void mostrarExplicacionElse(){
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
        System.out.println("---------------------------------------------------");
        System.out.println("-               EXPLICACION ELSE                  -");
        System.out.println("---------------------------------------------------");
        System.out.println("-  Se utiliza junto con 'if' para ejecutar        -");
        System.out.println("-  un bloque de codigo cuando la condicion        -");
        System.out.println("-  evaluada en el 'if' es falsa.                  -");
        System.out.println("-  Ejemplo:                                       -");
        System.out.println("-        int edad = 16;                           -");
        System.out.println("-        if (edad >= 18) {                        -");
        System.out.println("-         System.out.println('Es mayor de edad'); -");
        System.out.println("-        } else {                                 -");
        System.out.println("-         System.out.println('Es menor de edad'); -");
        System.out.println("---------------------------------------------------");
    }

<<<<<<< HEAD
    private void mostrarExplicacionElseIf() {
=======
    private void mostrarExplicacionElseIf(){
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
        System.out.println("----------------------------------------------------");
        System.out.println("-                EXPLICACION ELSE IF               -");
        System.out.println("----------------------------------------------------");
        System.out.println("-  Se utiliza para evaluar multiples               -");
        System.out.println("-  condiciones en una estructura condicional.      -");
        System.out.println("-  Si la primera condicion es falsa,               -");
        System.out.println("-  evalua la siguiente con 'else if'.              -");
        System.out.println("-  Ejemplo:                                        -");
        System.out.println("-        int edad = 25;                            -");
        System.out.println("-        if (edad < 18) {                          -");
        System.out.println("-          System.out.println('Menor de edad');    -");
        System.out.println("-        } else if (edad < 65) {                   -");
        System.out.println("-          System.out.println('Adulto');           -");
        System.out.println("-        } else {                                  -");
        System.out.println("-          System.out.println('Adulto mayor');     -");
        System.out.println("----------------------------------------------------");

    }

<<<<<<< HEAD
    private void condicionalswitch() {
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

        System.out.print("Ingrese un número: ");
        int opcion6 = scanner.nextInt();
        switch (opcion6){

            case 10:
            case 9:
                System.out.println("su calificacion es A");
                break;
            case 8:
            case 7:
                System.out.println("su calificacion es B");
                break;
            case 6:
            case 5:
                System.out.println("su calificacion es C");
                break;
            case 4:
            case 3:
                System.out.println("su calificacion es D");
                break;
            case 2:
            case 1:
                System.out.println("su calificacion es F");
                break;
        }
    }


    public void condicionalternaria() {
        System.out.println("------------------------------------------------");
        System.out.println("-       EXPLICACION CONDICIONAL TERNARIA       -");
        System.out.println("------------------------------------------------");
        System.out.println("-  Construccion que permite tomar decisiones    ");
        System.out.println("- basadas en una condicion booleana de manera  -");
        System.out.println("-     concisa en una sola linea de codigo      -");
        System.out.println("-                                              -");
        System.out.println("------------------------------------------------");
        System.out.println("-    ejemplo:                                  -");
        System.out.println("-  eres mayor de edad : eres menor de edad     -");
        System.out.println("-                                              -");
        System.out.println("------------------------------------------------");

        System.out.print("Digite (1 para continuar): ");
        int opcion7 = scanner.nextInt();
        switch (opcion7) {
            case 1:
                System.out.println("Has seleccionado condicional ternaria");
                System.out.print("Digite un número para el ejemplo: ");
                int numero = scanner.nextInt();
                String resultado = (numero % 2 == 0) ? "El número es par" : "El número es impar";
                System.out.println(resultado);
        }
    }

    private void bucledowhile() {
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


        int numeroSecreto = random.nextInt(10) + 1;
        int numeroIngresado = 0;
        System.out.println("Adivina el número entre 1 y 10.");

        do {
            System.out.print("Ingresa tu número: ");
            if (scanner.hasNextInt()) {
                numeroIngresado = scanner.nextInt();
                if (numeroIngresado < 1 || numeroIngresado > 10) {
                    System.out.println("Por favor, ingresa un número entre 1 y 10.");
                } else if (numeroIngresado < numeroSecreto) {
                    System.out.println("Muy bajo. Inténtalo de nuevo.");
                } else if (numeroIngresado > numeroSecreto) {
                    System.out.println("Muy alto. Inténtalo de nuevo.");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingresa un número entero.");
                scanner.next(); // Limpia el buffer del scanner
            }
        } while (numeroIngresado != numeroSecreto);
    }

    private void buclewhile() {
        System.out.println("------------------------------------------------");
        System.out.println("-                  WHILE                       -");
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


        int sumatoria = 0;
        int contador = 1;

        System.out.print("Ingrese un número: ");
        int numeroE = scanner.nextInt();

        while (contador <= numeroE) {
            sumatoria += contador;
            contador++;

        }

        System.out.println(" La sumatoria de los números del 1 al " + numeroE + " es: " + sumatoria);

    }

    private void buclefor() {
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

        int sumatoria = 0;
        int contador = 1;

        System.out.print("Ingrese un número: ");
        int numeroE = scanner.nextInt();

        while (contador <= numeroE) {
            sumatoria += contador;
            contador++;

        }

        System.out.println(" La sumatoria de los números del 1 al " + numeroE + " es: " + sumatoria);
    }


}












=======
}
>>>>>>> ba39fbbefb83bab6cad69aec7cc2f91d996faec3
