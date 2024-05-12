package com.metaphorse.vista;

import java.util.List;

import com.metaphorse.modelo.GestorPelicula;
import com.metaphorse.modelo.Pelicula;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        // Crear instancias de peliculas
        Pelicula pelicula1 = new Pelicula(1, "Planeta de los Simios", true);
        Pelicula pelicula2 = new Pelicula(2, "Los Simpson La Película", false);
        Pelicula pelicula3 = new Pelicula(3, "La Ballena", true);
        Pelicula pelicula4 = new Pelicula(4, "Poor Things", false);
        Pelicula pelicula5 = new Pelicula(5, "Avengers Infinity War", true);
        Pelicula pelicula6 = new Pelicula(6, "Joker", false);

        // Crear gestor de peliculas
        GestorPelicula gestorPelicula = new GestorPelicula();

        // Agregar películas al gestor de películas
        gestorPelicula.agregarPelicula(pelicula1);
        gestorPelicula.agregarPelicula(pelicula2);
        gestorPelicula.agregarPelicula(pelicula3);
        gestorPelicula.agregarPelicula(pelicula4);
        gestorPelicula.agregarPelicula(pelicula5);
        gestorPelicula.agregarPelicula(pelicula6);

        // Elimina una película
        gestorPelicula.eliminarPelicula(3);

        // Marca una película como activa
        gestorPelicula.marcarPeliculaComoDisponible(6);

        // mostrar lista de peliculas no disponibles
        for (Pelicula pelicula : gestorPelicula.obtenerPeliculasNoDisponibles()) {
            System.err.println(pelicula.getNombre());
        }

    }
}
