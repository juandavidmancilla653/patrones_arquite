package com.patrones.capas.presentacion;

import com.patrones.capas.negocio.UsuarioServicio;

public class MainCapas {

    public static void main(String[] args) {

        UsuarioServicio servicio =
                new UsuarioServicio();

        System.out.println(
                servicio.mostrarUsuario()
        );
    }
}