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
public class Cliente {
    private String nombre;
    private String correoElectronico;

    public Cliente(String nombre, String correoElectronico) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void buscarLibro(TiendaLibros tienda, String titulo) {
        ArrayList<Libro> resultados = tienda.buscarLibros(titulo);
        // mostrar resultados al usuario
    }

    public void reservarLibro(TiendaLibros tienda, Libro libro) {
        tienda.reservarLibro(libro);
        // enviar correo electrónico al usuario con la confirmación de la reserva
    }

    public void comprarLibro(TiendaLibros tienda, Libro libro) {
        tienda.comprarLibro(libro);
        // enviar correo electrónico al usuario con la confirmación de la compra
    }

    public void devolverLibro(TiendaLibros tienda, Libro libro) {
        tienda.devolverLibro(libro);
        // enviar correo electrónico al usuario con la confirmación de la devolución
    }
}
