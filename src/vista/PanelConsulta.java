/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.Empresa;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.MiModelo;
import modelo.Noticia;

/**
 *
 * @author dam
 */
public class PanelConsulta extends javax.swing.JPanel {

    Empresa empresa;
    int posLogueado;
    MiModelo modelo;

    /**
     * Creates new form PanelConsulta
     */
    public PanelConsulta(Empresa empresa, int posLogueado) {
        initComponents();
        this.empresa = empresa;
        this.posLogueado = posLogueado;
        configurarCuadricula();
        mostrarNoticias();
    }

    private void configurarCuadricula() {
        modelo = new MiModelo();
        String[] titulos = {"Codgio", "Titulo", "Fecha", "Categoria"};
        modelo.setColumnIdentifiers(titulos);
        tblNoticias.setModel(modelo);
    }

    private void mostrarNoticias() {
        ArrayList<Noticia> noticias = empresa.getNoticias();
        for (Noticia n : noticias) {
            Vector v = new Vector();
            v.add(n.getCodigo());
            v.add(n.getTitulo());
            v.add(n.getFecha());
            v.add(n.getCategoria());
            modelo.addRow(v);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblNoticias = new javax.swing.JTable();

        tblNoticias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblNoticias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNoticiasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNoticias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 182, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblNoticiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNoticiasMouseClicked
        int fila = tblNoticias.rowAtPoint(evt.getPoint());
        int codigoNoticia = (int) tblNoticias.getValueAt(fila, 0);
        if (empresa.comprobarNoticiaUsuario(codigoNoticia, posLogueado)) {
            int opcion = JOptionPane.showConfirmDialog(this, "Desea borrar esta noticia",
                    "EliminarNoticia", JOptionPane.YES_NO_OPTION);
            //si es 0, no es 1
            if (opcion == 0) {
                modelo.removeRow(fila);
                empresa.eliminarUnaNoticia(codigoNoticia);
            }
        } else {
            JOptionPane.showMessageDialog(this, "no eres el autor de la noticia");
        }
    }//GEN-LAST:event_tblNoticiasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNoticias;
    // End of variables declaration//GEN-END:variables
}
