package presentacion;

import dominio.Pelicula;
import servicio.ServicioPeliculas;
import servicio.ServicioPeliculasArchivo;

import java.util.Scanner;

public class CatalogoPeliculasApp {
    public static void main(String[] args) {
        boolean salir = false;
        Scanner consola = new Scanner(System.in);
        ServicioPeliculas servicioPeliculas = new ServicioPeliculasArchivo();
        while(!salir) {
            try {
                mostrarMenu();
                salir = ejecutarOpciones(consola, servicioPeliculas);
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
            System.out.println();
        }// end while
    }

    private static boolean ejecutarOpciones(Scanner consola, ServicioPeliculas servicioPeliculas) {
        int opcion = Integer.parseInt(consola.nextLine());
        boolean salir = false;
        switch(opcion) {
            case 1 -> {
                System.out.println("Introduce el nombre de la pelicula: ");
                String nombrePelicula = consola.nextLine();
                servicioPeliculas.agregarPeliculas(new Pelicula(nombrePelicula));
            }
            case 2 -> {
                servicioPeliculas.listarPeliculas();
            }
            case 3 -> {
                System.out.println("Introduce el nombre de la pelicula a buscar: ");
                String nombrePelicula = consola.nextLine();
                servicioPeliculas.buscarPelicula(new Pelicula(nombrePelicula));
            }
            case 4 -> {
                System.out.println("Hasta pronto!");
                salir = true;
            }
            default -> {
                System.out.println("Opción no reconocida: " + opcion);
            }
        }
        return salir;
    }

    private static void mostrarMenu() {
        System.out.print("""
                *** Catálogo de Peliculas ***
                1. Agregar pelicula
                2. Listar peliculas
                3. Buscar pelicula
                4. Salir
                Elige una opción:\s""");
    }
}
