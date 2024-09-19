package servicio;

import dominio.Pelicula;

public interface ServicioPeliculas {
    public void listarPeliculas();
    public void agregarPeliculas(Pelicula pelicula);
    public void buscarPelicula(Pelicula pelicula);

}
