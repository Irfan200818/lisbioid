/*
 * NuevoRecibo.java
 *
 * Created on 28 de marzo de 2007, 9:54
 */

package vista;

import controlador.Cliente;
import controlador.DetalleFactura;
import controlador.DetalleRecibo;
import controlador.DeudaFactura;
import controlador.EjemplarLibro;
import controlador.Factura;
import controlador.Libro;
import controlador.Main;
import controlador.Recibo;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  mfrias
 */
public class NuevoRecibo extends javax.swing.JFrame {
    
    private Recibo recibo ;
    private VentanaRecibos padre;
    private Cliente cliente;

   
    /** Creates new form NuevoRemito */
    public NuevoRecibo(VentanaRecibos p, Cliente cli) {
        this.setCliente(cli);
        this.padre = p;
        initTabla();
        initComponents();
        this.setTitle("Registrar recibo para " + this.getCliente().getNombre());
        this.labelCliente.setText(cliente.getNombre());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        ano = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelCliente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelBruto = new javax.swing.JLabel();
        labelDescuento = new javax.swing.JLabel();
        labelNeto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jLabel1.setText("Numero:");

        jLabel2.setText("Fecha:");

        jLabel3.setText("/");

        jLabel4.setText("/");

        jLabel11.setText("Cliente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(numero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(labelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Detalles de recibo"));
        jTable1.setModel(getModel());
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Total bruto:");

        jLabel6.setText("Total descuento:");

        jLabel7.setText("Total NETO:");

        jLabel8.setText("$");

        jLabel9.setText("$");

        jLabel10.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(403, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBruto)
                            .addComponent(jButton3)
                            .addComponent(labelDescuento)
                            .addComponent(labelNeto))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(366, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(labelBruto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(labelDescuento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(labelNeto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(dtm.getRowCount() == 0)
            JOptionPane.showMessageDialog(this,"Debe ingresar un detalle de recibo como m�nimo", "Error", JOptionPane.ERROR_MESSAGE);
        else if (dia.getText().compareTo("") == 0 || mes.getText().compareTo("") == 0 || ano.getText().compareTo("") == 0)
            JOptionPane.showMessageDialog(this,"Debe ingresar una fecha", "Error", JOptionPane.ERROR_MESSAGE);
        else if(numero.getText().compareTo("") == 0){
            JOptionPane.showMessageDialog(this,"Debe ingresar un numero de Remito", "Error", JOptionPane.ERROR_MESSAGE);
            try{
                Integer.parseInt(numero.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this,"El n�mero de remito solo debe contener enteros.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try{
                int d = Integer.parseInt(dia.getText());
                int m = Integer.parseInt(mes.getText());
                int a = Integer.parseInt(ano.getText());
                if(d < 1 || d > 31 || m < 1 || m > 12 | a < 1980)
                    Integer.parseInt("a"); //throw NumberFormatException;
            }catch(NumberFormatException er){
                JOptionPane.showMessageDialog(this,"Error en el formato de la fecha.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        else if(Recibo.existeId(numero.getText())){
            JOptionPane.showMessageDialog(this,"El numero de recibo ingresado ya existe en la Base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
           //empieza el alta del recibo, pagando a ciertos detalles de factura
           this.recibo = new Recibo (0, numero.getText(), Main.getHora(Integer.parseInt(ano.getText()), Integer.parseInt(mes.getText()), Integer.parseInt(dia.getText())), this.cliente, Float.parseFloat(labelBruto.getText()));
                recibo.hacerAlta();
                Libro libro;
                EjemplarLibro ejemplar;
                int cantidad;
                for(int i = 0; i < dtm.getRowCount(); i++){
                    libro = new Libro((Integer)jTable1.getValueAt(i, 1));
                    ejemplar = new EjemplarLibro(libro, libro.getPrecio());
                    ejemplar.hacerAlta(); //si el ejemplar ya existe, no hace el alta
                    cantidad = (Integer)jTable1.getValueAt(i, 4);
                    
                    ////////////////
                    String elegido = (String) jTable1.getValueAt(i, 0);
                    String[] buf = elegido.split(" "); //aca recibo y separo el TIPO y NRO de la factura
                    DetalleFactura detalle= null;
                    LinkedList deudas = DeudaFactura.getDeudaXFactura(buf[1]);
                    for(int j = 0; j < deudas.size() ; j++){
                        //compara si cada titulo de libro del detalle es el elegido en el combo
                        DeudaFactura deuda = (DeudaFactura)deudas.get(j) ;
                        if (deuda.getDetalleFactura().getEjemplar().getLibro().getTitulo().compareTo((String)jTable1.getValueAt(i, 2)) == 0){
                            detalle = deuda.getDetalleFactura();
                        }
                    }
                    //////////////
                    DetalleRecibo dr= new DetalleRecibo(ejemplar, cantidad, this.recibo , detalle.getId());
                    dr.hacerAlta();
                    
                }
                //recibo.setTotal(Float.parseFloat(bruto.getText())); ya esta seteado en recibo, en el constructor
                this.padre.insertarFila(this.recibo);
                this.dispose();
                
            }
            
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int fila = jTable1.getSelectedRow();
        if (!borrarFila()){
            JOptionPane.showMessageDialog(this, "Seleccione un elemento a borrar.", "No hay ningun libro seleccionado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.setTotales();        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AltaDetalleRecibo adr = new AltaDetalleRecibo(this);
        adr.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
   public DefaultTableModel getModel(){
        return this.dtm;
    } 
    
    public void initTabla(){
        dtm = new DefaultTableModel();
        dtm.addColumn("Factura");
        dtm.addColumn("Cod");
        dtm.addColumn("Titulo");
        dtm.addColumn("Precio");
        dtm.addColumn("Cant.");
        dtm.addColumn("Bruto");
        dtm.addColumn("% Comision");
        dtm.addColumn("Descuento");
        dtm.addColumn("Subtotal");
    }
    
    public void setTotales(){
        float neto = 0;
        float bruto = 0;
        float descuento = 0;
            
        for(int i = 0; i < dtm.getRowCount(); i++){
            bruto += (Float)dtm.getValueAt(i, 5);
            descuento += (Float)dtm.getValueAt(i, 7);
            neto += (Float)dtm.getValueAt(i, 8);
        }
        labelBruto.setText(String.valueOf(bruto));
        labelDescuento.setText(String.valueOf(descuento));
        labelNeto.setText(String.valueOf(neto));
    }
    
    private Object[] getFila(DetalleRecibo dr){
        Factura factura = new DetalleFactura(dr.getIdDetalleFactura()).getFactura();
        float bruto = (dr.getEjemplar().getPrecioUnitario() * dr.getCantidad());
        float desc = bruto * (factura.getComision() / 100);
        float subtot = bruto - desc;
        
        Object[] datos = new Object[9];
        datos[0] = factura.getTipo() + " " + factura.getNumero();
        datos[1] = dr.getEjemplar().getLibro().getId();
        datos[2] = dr.getEjemplar().getLibro().getTitulo();
        datos[3] = dr.getEjemplar().getPrecioUnitario();
        datos[4] = dr.getCantidad(); 
        datos[5] = bruto;
        datos[6] = factura.getComision();
        datos[7] = desc;
        datos[8] = subtot;
        
        return datos;
    }
    public void insertarFila(DetalleRecibo dr){
        this.dtm.addRow(getFila(dr));
    }
    public boolean borrarFila(){
        if(jTable1.getSelectedRow() != -1){
            this.dtm.removeRow(jTable1.getSelectedRow());
            return true;
        }
        
        
        return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano;
    private javax.swing.JTextField dia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelBruto;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelDescuento;
    private javax.swing.JLabel labelNeto;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField numero;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel dtm;

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
