/*
 * VentanaLibros.java
 *
 * Created on 13 de marzo de 2007, 20:41
 */

package vista;

import controlador.Libro;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  PC
 */
public class VentanaLibros extends javax.swing.JFrame {
    
    private Principal padre;
    /** Creates new form VentanaLibros */
    public VentanaLibros(Principal p) {
        initTabla();
        initComponents();
        this.padre = p;
        this.setTitle("Libros registrados");
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(getModel());
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Borrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.padre.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         if (jTable1.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Seleccione un libro primero.", "No hay ningun libro seleccionado", JOptionPane.ERROR_MESSAGE);
            return;
        }  
        Libro libro = new Libro((Integer)jTable1.getValueAt(jTable1.getSelectedRow(), 0)); //crea un libro con el campo del codigo como param
        ModificarLibro modificar = new ModificarLibro(libro, this);
        modificar.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AltaLibro ac = new AltaLibro(this);
        ac.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila = jTable1.getSelectedRow();
        if (fila == -1 ){
            JOptionPane.showMessageDialog(this, "Seleccione un libro primero.", "No hay ningun libro seleccionado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Libro libro = new Libro((Integer)dtm.getValueAt(fila , 0));
        libro.borrar();  
        borrarFila();
    }//GEN-LAST:event_jButton3ActionPerformed
    
 public DefaultTableModel getModel(){
        return this.dtm;
    }
    public void initTabla(){
        dtm = new DefaultTableModel();
        LinkedList listaLibros = Libro.getLibros();
        dtm.addColumn("Codigo");
        dtm.addColumn("Titulo");
        dtm.addColumn("Autor");
        dtm.addColumn("Precio");
        
                
        for(int i = 0; i < listaLibros.size(); i++){
            Libro libro = (Libro) listaLibros.get(i);
            dtm.addRow(getFila(libro));
        }
        listaLibros.clear();
    }
    private Object[] getFila(Libro libro){
        Object[] datos = new Object[4];
        datos[0] = libro.getId();
        datos[1] = libro.getTitulo();
        datos[2] = libro.getAutor();
        datos[3] = libro.getPrecio();
        
        return datos;
    }
    public void insertarFila(Libro libro){
        this.dtm.addRow(getFila(libro));
    }
    public boolean borrarFila(){
        if(jTable1.getSelectedRow() != -1){
            this.dtm.removeRow(jTable1.getSelectedRow());
            return true;
        }
        return false;
    }
    public void actualizarFila(Libro nuevo){
        this.dtm.setValueAt(nuevo.getId(), jTable1.getSelectedRow(), 0);
        this.dtm.setValueAt(nuevo.getTitulo(), jTable1.getSelectedRow(), 1);
        this.dtm.setValueAt(nuevo.getAutor(), jTable1.getSelectedRow(), 2);
        this.dtm.setValueAt(nuevo.getPrecio(), jTable1.getSelectedRow(), 3);
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel dtm;
}