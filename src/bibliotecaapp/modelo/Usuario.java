/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaapp.modelo;

import bibliotecaapp.interfaces.IAutenticable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yeisson.villamil
 */
public class Usuario extends Persona implements IAutenticable {

    private String username;
    private String password;
    private String rol; // "admin" o "cliente"
    // Sólo se usarán para clientes:
    private List<Libro> librosPrestados;
    private List<Libro> librosDevueltos;

    public Usuario(String nombre, String apellido, String username, String password, String rol) {
        super(nombre, apellido);
        this.username = username;
        this.password = password;
        this.rol = rol;
        // Inicializamos las listas solo si el usuario es cliente
        if (rol.equalsIgnoreCase("cliente")) {
            librosPrestados = new ArrayList<>();
            librosDevueltos = new ArrayList<>();
        }
    }

    // Getters y Setters de username, password y rol...
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // Getters para las listas (si es cliente)
    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public List<Libro> getLibrosDevueltos() {
        return librosDevueltos;
    }

    @Override
    public boolean iniciarSesion(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    @Override
    public void cerrarSesion() {
        System.out.println("El usuario " + this.username + " ha cerrado sesión.");
    }
}
