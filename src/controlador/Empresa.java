
package controlador;

import java.util.ArrayList;
import modelo.Categoria;
import modelo.Noticia;
import modelo.Usuario;

/**
 *
 * @author dam
 */
public class Empresa {

    ArrayList<Usuario> usuarios;
    ArrayList<Categoria> categorias;
    ArrayList<Noticia> noticias;

    public Empresa() {
        usuarios = new ArrayList<>();
        categorias = new ArrayList<>();
        noticias= new ArrayList<>();
    }

    public void anadir() {
        usuarios.add(new Usuario("pepe", "926e27eecdbc7a18858b3798ba99bddd"));
        usuarios.add(new Usuario("admin", "202cb962ac59075b964b07152d234b70"));
        categorias.add(new Categoria("a1", "Deportes"));
        categorias.add(new Categoria("26", "Politica"));
        categorias.add(new Categoria("a43", "Economia"));
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

    public String datosUsuario(int pos) {
        return usuarios.get(pos).getLogin();
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public ArrayList<Noticia> getNoticias() {
        return noticias;
    }

    public boolean grabarNoticia(int codigo, String deno, String fecha, String codCate, int posLogueado) {
        boolean resultado=false;
        resultado=noticias.contains(new Noticia(codigo));
        if(!resultado){
            Noticia n=new Noticia( codigo,  deno,  datosUsuario(posLogueado), fecha,  codCate);
            noticias.add(n);
        }
        return resultado;
    }

 
    
}
