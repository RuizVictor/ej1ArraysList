/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import utilidades.Fecha;

/**
 *
 * @author dam
 */
public class Noticia {
    private int codigo;
    private String titulo;
    private String usuario;
    private String fecha;
    private String categoria;

    public Noticia(int codigo, String titulo, String usuario, String fecha, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.usuario = usuario;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    public Noticia(int codigo) {
        this.codigo = codigo;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Noticia other = (Noticia) obj;
        return this.codigo == other.codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCategoria() {
        return categoria;
    }
    
    
}
