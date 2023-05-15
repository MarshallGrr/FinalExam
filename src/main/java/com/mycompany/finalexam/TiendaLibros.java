/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalexam;

import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class TiendaLibros {
    private ArrayList<Libro> libros;

    public TiendaLibros() {
        libros = new ArrayList<Libro>();
    }

    public void agregarLibro(String titulo, String autor, String categoria, boolean disponible) {
        Libro libro = new Libro(titulo, autor, categoria, disponible);
        libros.add(libro);
    }

    public ArrayList<Libro> buscarLibros(String titulo) {
        ArrayList<Libro> resultados = new ArrayList<Libro>();
        for (Libro libro : libros) {
            if (libro.getTitulo().contains(titulo)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public void reservarLibro(Libro libro) {
        libro.setDisponible(false);
    }

    public void comprarLibro(Libro libro) {
        libro.setDisponible(false);
    }

    public void devolverLibro(Libro libro) {
        libro.setDisponible(true);
    }
}

