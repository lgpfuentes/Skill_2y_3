package com.metaphorse.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestorPelicula {

    private List<Pelicula> peliculas;

    public GestorPelicula() {
        this.peliculas = new ArrayList<>();
    }

    // Metodo para agregar una pelicula a la colección
    public void agregarPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }

    // Método para eliminar una película de la colección por id
    public void eliminarPelicula(int id) {
        // Utilizamos un iterador para recorrer la lista de películas
        Iterator<Pelicula> iterator = peliculas.iterator();
        while (iterator.hasNext()) {
            Pelicula pelicula = iterator.next();
            // Si encontramos una película con el id especificado, la eliminamos
            if (pelicula.getId() == id) {
                iterator.remove();
                return; // Salimos del método después de eliminar la película
            }
        }
        // No se encontró ninguna película
        System.out.println("No se encontró ninguna película con el ID especificado.");
    }

    // Método para obtener todas las películas
    public List<Pelicula> obtenerPeliculas() {
        return this.peliculas;
    }

    // Método para obtener las películas disponibles
    public List<Pelicula> obtenerPeliculasDisponibles() {
        // Definimos una nueva lista para las peliculas disponibles
        List<Pelicula> disponibles = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            // Agregamos las peliculas que esten disponible
            if (pelicula.isDisponible()) {
                disponibles.add(pelicula);
            }
        }
        return disponibles;
    }

    // Método para obtener las películas no disponibles
    public List<Pelicula> obtenerPeliculasNoDisponibles() {
        // Definimos una nueva lista para las peliculas no disponibles
        List<Pelicula> NoDisponibles = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            // Agregamos las peliculas que no esten disponible
            if (!pelicula.isDisponible()) {
                NoDisponibles.add(pelicula);
            }
        }
        return NoDisponibles;
    }

    // Método para marcar una película como disponible según el ID especificado
    public void marcarPeliculaComoDisponible(int id) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id) {
                pelicula.setDisponible(true);
                return; // Salir del método una vez que se marca la película como disponible
            }
        }
        // No se encontró ninguna película
        System.out.println("No se encontró ninguna película con el ID especificado.");
    }
}
