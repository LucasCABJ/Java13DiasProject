package servicio;

import dominio.Pelicula;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ServicioPeliculasArchivo implements ServicioPeliculas {

    private final String NOMBRE_ARCHIVO;

    public ServicioPeliculasArchivo() {
        this.NOMBRE_ARCHIVO = "peliculas.txt";
        File archivo = new File(this.NOMBRE_ARCHIVO);
        try {
            if(archivo.exists()) {
                System.out.println("El archivo de almacenamiento ya existe.");
            } else {
                PrintWriter salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo de almacenamiento.");
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al abrir el archivo: " + this.NOMBRE_ARCHIVO);
        }
    }

    @Override
    public void listarPeliculas() {

    }

    @Override
    public void agregarPeliculas(Pelicula pelicula) {

    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {

    }
}
