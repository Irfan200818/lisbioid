/*
 * AltaDetalleRecibo.java
 *
 * Created on 28 de marzo de 2007, 12:50
 */

package vista;

import controlador.DetalleFactura;
import controlador.DetalleRecibo;
import controlador.DeudaFactura;
import controlador.EjemplarLibro;
import controlador.FacturaConRecibo;
import java.util.LinkedList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author  mfrias
 */
public class AltaDetalleRecibo extends javax.swing.JFrame {
    
    private NuevoRecibo padre;
    private FacturaConRecibo factura;
    /** Creates new form AltaDetalleFactura */
    public AltaDetalleRecibo(NuevoRecibo nr) {
        this.padre = nr;
        initComponents();
        this.factura = null;
        this.setTitle("Detalle de Recibo - " + this.padre.getCliente().getNombre());
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        comboFactura = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboItem = new javax.swing.JComboBox();
        precio = new javax.swing.JLabel();
        comboCantidad = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jLabel1.setText("Factura:");

        comboFactura.setModel(getModeloFactura());
        comboFactura.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFacturaItemStateChanged(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Detalle"));
        jLabel2.setText("Item:");

        jLabel3.setText("Precio:");

        jLabel4.setText("Cantidad:");

        comboItem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboItem.setEnabled(false);
        comboItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemItemStateChanged(evt);
            }
        });

        precio.setText("$ --.-");

        comboCantidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCantidad.setEnabled(false);
        comboCantidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCantidadItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precio)
                    .addComponent(comboItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(precio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboFactura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        switch(this.fase){
            case 0:
                JOptionPane.showMessageDialog(this,"Seleccione una factura .", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            case 1: 
                JOptionPane.showMessageDialog(this,"Seleccione un titulo.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(this,"Seleccione una cantidad .", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                DetalleRecibo der = new DetalleRecibo(this.ejemplar, this.cantidadElegida, null, detalleFacturaAsociada.getId() );
                padre.insertarFila(der);
                padre.setTotales();
                this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboCantidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCantidadItemStateChanged
        String cantElegida = (String) comboCantidad.getSelectedItem();
        if(cantElegida.compareTo(" ") != 0 ) {
            this.fase = 3;
            this.cantidadElegida = Integer.parseInt(cantElegida);
        }
        else{
            this.fase = 2;
            this.cantidadElegida = 0;
        }
         
        return;
    }//GEN-LAST:event_comboCantidadItemStateChanged

    private void comboItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemItemStateChanged
        if(((String)comboItem.getSelectedItem()).compareTo(" ") == 0){
                comboCantidad.setEnabled(false);
                precio.setText("$ -.--" );
                return;
            }
            this.comboCantidad.setEnabled(true);
            LinkedList deudas = DeudaFactura.getDeudaXFactura(this.factura.getNumero() );
            for(int i = 0; i < deudas.size() ; i++){
                //compara si cada titulo de libro del detalle es el elegido en el combo
                DeudaFactura deuda = (DeudaFactura)deudas.get(i) ;
                DetalleFactura detalle = deuda.getDetalleFactura();
                if (detalle.getEjemplar().getLibro().getTitulo().compareTo((String)comboItem.getSelectedItem()) == 0){
                    this.ejemplar = detalle.getEjemplar();
                    this.cantidad = deuda.getCantidad(); //la cantidad que queda en la deuda
                    this.precio.setText("$ " + detalle.getEjemplar().getPrecioUnitario());
                    this.detalleFacturaAsociada = detalle;
                }
            }
            this.comboCantidad.setModel(this.getModeloCant());
            this.fase = 2;
            return;           
    }//GEN-LAST:event_comboItemItemStateChanged

    private void comboFacturaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFacturaItemStateChanged
        if(((String)comboFactura.getSelectedItem()).compareTo(" ") == 0){
                comboItem.setEnabled(false);
                comboCantidad.setEnabled(false);
                precio.setText("$ -.--" );
                fase = 0;
                return;
        }
        String elegido = (String) comboFactura.getSelectedItem();
        String[] buf = elegido.split(" ");
        this.factura= new FacturaConRecibo(buf[0], buf[1]);
        comboItem.setModel(getModeloItem());
        comboItem.setEnabled(true);
        comboCantidad.setEnabled(false);    
        this.fase = 1;
        return;
    }//GEN-LAST:event_comboFacturaItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
  
    
    public ComboBoxModel getModeloFactura(){
        LinkedList lista = FacturaConRecibo.getFacturasPendientes(this.padre.getCliente().getId());
        String[] numeros = new String[lista.size()+1];
        numeros[0] = new String(" ");
        for(int i = 0; i < lista.size() ; i++){
            FacturaConRecibo fac = (FacturaConRecibo)lista.get(i);
            numeros[i+1] = new String(fac.getTipo() + " " + fac.getNumero());
        }
        cbmFactura= new DefaultComboBoxModel(numeros);
        
        return cbmFactura;
    }
   //crea el modelo si se selecciono un remito
   public ComboBoxModel getModeloItem(){
       LinkedList lista = DeudaFactura.getDeudaXFactura(this.factura.getNumero());
       String[] titulos = new String[lista.size()+1];
       titulos[0] = " ";
       for(int i = 0; i < lista.size() ; i++){
            titulos[i+1] = new String(((DeudaFactura)lista.get(i)).getDetalleFactura().getEjemplar().getLibro().getTitulo());
       }
       cbmItem = new DefaultComboBoxModel(titulos);
       return cbmItem;
   }
   
   public ComboBoxModel getModeloCant(){
       String[] vectorCantidad = new String[this.cantidad+1] ;
       int i;
       vectorCantidad[0] = " ";
       for (i = 0; i < cantidad ; i++){
           vectorCantidad[i+1] = String.valueOf(i+1);
       }
       cbmCant = new DefaultComboBoxModel(vectorCantidad);
       //cbmCant.setSelectedItem(String.valueOf(i+1));
       return cbmCant;
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboCantidad;
    private javax.swing.JComboBox comboFactura;
    private javax.swing.JComboBox comboItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel precio;
    // End of variables declaration//GEN-END:variables
    private DefaultComboBoxModel cbmFactura;
    private DefaultComboBoxModel cbmItem;
    private DefaultComboBoxModel cbmCant;
    private int cantidad;
    private int fase = 0;
    private EjemplarLibro ejemplar;
    private int cantidadElegida;
    private DetalleFactura detalleFacturaAsociada;
    
}