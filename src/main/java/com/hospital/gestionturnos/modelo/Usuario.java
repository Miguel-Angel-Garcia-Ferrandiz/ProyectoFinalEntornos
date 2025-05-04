package com.hospital.gestionturnos.modelo;

/**
 * Representa un usuario del sistema.
 * @author Miguel Ángel García Ferrándiz
 * @version 1.0
 */
public class Usuario {
    private String nombre;
    private String contraseña;

    /**
     * Constructor de Usuario.
     * @param nombre El nombre del usuario.
     * @param contraseña La contraseña del usuario.
     */
    public Usuario(String nombre, String contraseña) {
        // Prototipo
    }

    /**
     * Obtiene el nombre del usuario.
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return null; // Valor provisional
    }

    /**
     * Verifica si la contraseña es correcta.
     * @param contraseña La contraseña a verificar.
     * @return true si la contraseña es correcta, false si no.
     */
    public boolean verificarContraseña(String contraseña) {
        return false; // Valor provisional
    }
}