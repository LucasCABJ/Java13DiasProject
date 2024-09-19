import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        var operacion = 0;
        while (operacion != 5) {
            mostrarMenu();
            try {
                operacion = Integer.parseInt(consola.nextLine());
                // Revisar opción elegida
                if (operacion >= 1 && operacion <= 4) {
                    // Solicitar datos
                    System.out.print("Proporciona valor operando1: ");
                    var operando1 = Integer.parseInt(consola.nextLine());
                    System.out.print("Proporciona valor operando2: ");
                    var operando2 = Integer.parseInt(consola.nextLine());
                    int resultado;
                    switch (operacion) {
                        case 1:
                            resultado = operando1 + operando2;
                            System.out.println("Resultado Suma: " + resultado);
                            break;
                        case 2:
                            resultado = operando1 - operando2;
                            System.out.println("Resultado Resta: " + resultado);
                            break;
                        case 3:
                            resultado = operando1 * operando2;
                            System.out.println("Resultado Multiplicación: " + resultado);
                            break;
                        case 4:
                            resultado = operando1 / operando2;
                            System.out.println("Resultado División: " + resultado);
                        default:
                            System.out.println("Opción Erronea: " + operacion);
                    }
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opción Erronea: " + operacion);
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("**** Aplicación Calculadora ****");
        System.out.println("1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Salir");
        System.out.print("Operación a realizar? ");
    }

    private static void ejecutarOperacion(Integer operacion) {

    }
}
