/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bibliotecaapp.interfaces;

/**
 *
 * @author yeisson.villamil
 */
public interface IAutenticable {

    boolean iniciarSesion(String username, String password);

    void cerrarSesion();
}
