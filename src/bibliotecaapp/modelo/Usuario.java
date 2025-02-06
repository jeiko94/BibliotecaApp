/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaapp.modelo;

import bibliotecaapp.interfaces.IAutenticable;

/**
 *
 * @author yeisson.villamil
 */
public class Usuario extends Persona implements IAutenticable {
    private String username;
    private String password;
    private String rol; // "admin" o "cliente"

    public Usuario(String nombre, String apellido, String username, String password, String rol) {
        super(nombre, apellido);
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    // Getters y Setters
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

    @Override
    public boolean iniciarSesion(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    @Override
    public void cerrarSesion() {
        System.out.println("El usuario " + this.username + " ha cerrado sesión.");
    }
}