/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaapp.controlador;

import bibliotecaapp.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yeisson.villamil
 */
public class ControladorLibro {
    private static List<Libro> listaLibros = new ArrayList<>();

    public ControladorLibro() {
        // El constructor puede quedar vacío, ya que usamos la lista estática.
    }

    public void agregarLibro(Libro libro) {
        if (libro != null) {
            listaLibros.add(libro);
        }
    }

    public Libro buscarLibroPorISBN(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro libroAEliminar = null;
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                libroAEliminar = libro;
                break;
            }
        }
        if (libroAEliminar != null) {
            listaLibros.remove(libroAEliminar);
        }
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }
}