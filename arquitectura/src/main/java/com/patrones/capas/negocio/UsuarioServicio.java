package com.patrones.capas.negocio;

import com.patrones.capas.datos.UsuarioDAO;

public class UsuarioServicio {

    UsuarioDAO dao = new UsuarioDAO();

    public String mostrarUsuario() {
        return dao.obtenerUsuario();
    }
}