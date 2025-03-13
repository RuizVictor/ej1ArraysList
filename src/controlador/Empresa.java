/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Categoria;
import modelo.Usuario;

/**
 *
 * @author dam
 */
public class Empresa {

    ArrayList<Usuario> usuarios;
    ArrayList<Categoria> categorias;

    public Empresa() {
        usuarios = new ArrayList<>();
        categorias = new ArrayList<>();
    }

    public void anadir() {
        usuarios.add(new Usuario("pepe", "rty56y56"));
        usuarios.add(new Usuario("admin", "dhrrfy"));
        categorias.add(new Categoria("1", "Deportes"));
        categorias.add(new Categoria("2", "Politica"));
        categorias.add(new Categoria("3", "Economia"));
    }
    
}
