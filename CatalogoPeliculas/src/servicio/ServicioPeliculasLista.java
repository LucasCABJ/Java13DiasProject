package servicio;

import dominio.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculasLista implements ServicioPeliculas {

    private final List<Pelicula> peliculas;

    public ServicioPeliculasLista() {
        this.peliculas = new ArrayList<>();
    }

    @Override
    public void listarPeliculas() {
        System.out.println("*** Listado de Peliculas...");
        peliculas.forEach(System.out::println);
    }

    @Override
    public void agregarPeliculas(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Se agregó la pelicula: " + pelicula);
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        int indice = peliculas.indexOf(pelicula);
        if (indice == -1) {
            System.out.println("No se encontró la película: " + pelicula.getNombre());
        } else {
            System.out.println("Pelicula encontrada en el indice: " + indice);
        }
    }
}
