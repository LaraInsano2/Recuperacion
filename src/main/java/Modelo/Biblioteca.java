/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Dilan Lara
 */
public class Biblioteca {
    
     ArrayList<Libro> librosRepresados;

    public Biblioteca() {
        librosRepresados = new ArrayList<>();
    }

    public void ordenarPorTitulo() {
        Collections.sort(librosRepresados, Comparator.comparing(l -> l.titulo.toLowerCase()));
    }

    public int numeroDeLibros() {
        return librosRepresados.size();
    }

    public void insertarLibro(Libro libro) {
        librosRepresados.add(libro);
        ordenarPorTitulo();
    }

    public void eliminarLibro(int posicion) {
        librosRepresados.remove(posicion);
    }

    public Libro obtenerLibro(int posicion) {
        return librosRepresados.get(posicion);
    }

    public int buscarLibro(String parteTitulo) {
        for (int i = 0; i < librosRepresados.size(); i++) {
            if (librosRepresados.get(i).titulo.toLowerCase().contains(parteTitulo.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
    
}
