/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.finalexam;

import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class FinalExam {

    public static void main(String[] args) {
        // Crear una tienda de libros y agregar algunos libros
        TiendaLibros tienda = new TiendaLibros();
        tienda.agregarLibro("Cien años de soledad", "Gabriel García Márquez", "Ficción", true);
        tienda.agregarLibro("El código Da Vinci", "Dan Brown", "Misterio", true);
        tienda.agregarLibro("El nombre del viento", "Patrick Rothfuss", "Fantasía", false);
        tienda.agregarLibro("La sombra del viento", "Carlos Ruiz Zafón", "Misterio", true);
        
        System.out.println("Libros disponibles en la tienda:");
        for (Libro libro : tienda.buscarLibros("")) {
            System.out.println("- " + libro.getTitulo() + " de " + libro.getAutor() + " (" + libro.getCategoria() + ")");
        }

        // Crear un cliente y buscar un libro
        Cliente cliente1 = new Cliente("Juan Pérez", "juan@example.com");
        cliente1.buscarLibro(tienda, "soledad");

        // Crear otro cliente y reservar un libro
        Cliente cliente2 = new Cliente("María González", "maria@example.com");
        ArrayList<Libro> resultados = tienda.buscarLibros("código");
        Libro libroReservado = resultados.get(0);
        cliente2.reservarLibro(tienda, libroReservado);

        // Crear otro cliente y comprar un libro
        Cliente cliente3 = new Cliente("Pedro Rodríguez", "pedro@example.com");
        resultados = tienda.buscarLibros("viento");
        Libro libroComprado = resultados.get(0);
        cliente3.comprarLibro(tienda, libroComprado);

        // Crear otro cliente y devolver un libro
        Cliente cliente4 = new Cliente("Ana Gómez", "ana@example.com");
        resultados = tienda.buscarLibros("sombra");
        Libro libroDevuelto = resultados.get(0);
        cliente4.devolverLibro(tienda, libroDevuelto);

        // Mostrar la lista actualizada de libros en la tienda
        System.out.println("Libros disponibles en la tienda:");
        for (Libro libro : tienda.buscarLibros("")) {
            System.out.println("- " + libro.getTitulo() + " de " + libro.getAutor() + " (" + libro.getCategoria() + ")");
        }
    }
}
