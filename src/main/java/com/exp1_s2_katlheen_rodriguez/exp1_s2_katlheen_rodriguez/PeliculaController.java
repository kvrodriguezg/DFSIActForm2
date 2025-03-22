package com.exp1_s2_katlheen_rodriguez.exp1_s2_katlheen_rodriguez;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class PeliculaController {

    private List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaController() {
        peliculas.add(new Pelicula(1, "El Padrino", 1972, "Francis Ford Coppola", "Crimen, Drama", "La historia de la familia mafiosa Corleone."));
        peliculas.add(new Pelicula(2, "Titanic", 1997, "James Cameron", "Romance, Drama", "Un romance trágico a bordo del Titanic."));
        peliculas.add(new Pelicula(3, "Inception", 2010, "Christopher Nolan", "Ciencia ficción, Acción", "Un ladrón que roba secretos a través de los sueños."));
        peliculas.add(new Pelicula(4, "Forrest Gump", 1994, "Robert Zemeckis", "Drama, Comedia", "La vida de un hombre con un coeficiente bajo que logra grandes cosas."));
        peliculas.add(new Pelicula(5, "El Señor de los Anillos: El Retorno del Rey", 2003, "Peter Jackson", "Fantasía, Aventura", "La batalla final por la Tierra Media."));
    }
    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    @GetMapping("/peliculas/{id}")
    public Pelicula getPeliculaById(@PathVariable int id) {
        for (Pelicula pelicula : peliculas){
            if (pelicula.getId() == id){
                return pelicula;
            }
        }
        return null;
    }
    
}