/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaapp.controlador;

import bibliotecaapp.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yeisson.villamil
 */
public class ControladorUsuario {
    private List<Usuario> listaUsuarios;

    public ControladorUsuario() {
        this.listaUsuarios = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        // Validaciones antes de agregar
        if (usuario == null) {
            System.out.println("Usuario invalido.");
            return;
        }
        listaUsuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario.getUsername());
    }

    public Usuario iniciarSesion(String username, String password) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.iniciarSesion(username, password)) {
                System.out.println("Inicio de sesion exitoso para: " + username);
                return usuario;
            }
        }
        System.out.println("Credenciales invalidas.");
        return null; // Retorna nulo si no se encontró usuario válido
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
}
