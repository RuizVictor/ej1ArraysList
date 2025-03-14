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
        usuarios.add(new Usuario("pepe", "926e27eecdbc7a18858b3798ba99bddd"));
        usuarios.add(new Usuario("admin", "202cb962ac59075b964b07152d234b70"));
        categorias.add(new Categoria("1", "Deportes"));
        categorias.add(new Categoria("2", "Politica"));
        categorias.add(new Categoria("3", "Economia"));
    }

    public int buscar(String login, String contra) {
        int pos = usuarios.indexOf(new Usuario(login, contra));
        if (pos != -1) {
            if (!(usuarios.get(pos).getContra().equals(contra))) {
                pos = -1;
            }
        }
        return pos;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }
    
}
