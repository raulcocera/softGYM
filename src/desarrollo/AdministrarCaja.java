/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import logica.DB;
import net.sf.jcarrierpigeon.WindowPosition;
import net.sf.jtelegraph.Telegraph;
import net.sf.jtelegraph.TelegraphQueue;
import net.sf.jtelegraph.TelegraphType;

/**
 *
 * @author GID
 */
public class AdministrarCaja extends javax.swing.JInternalFrame {

    /**
     * Creates new form internalEjemplo
     */
    private DB db = new DB();

    public AdministrarCaja() {
        initComponents();
        cargarCaja();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCaja = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCerrarCaja = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Administrar Caja");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaCaja);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Administrar Cierre de Caja");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/moneda.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Utilice esta forma para realizar una administración de cierre de caja");

        btnCerrarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/registradora.png"))); // NOI18N
        btnCerrarCaja.setText("Visualizar");
        btnCerrarCaja.setToolTipText("Cerrar Caja");
        btnCerrarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCerrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(157, 157, 157))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCajaActionPerformed
        // TODO add your handling code here:
        seleccionarCaja();
    }//GEN-LAST:event_btnCerrarCajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarCaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCaja;
    // End of variables declaration//GEN-END:variables

    private void cargarCaja() {
        CachedRowSet data;
        String nombre_usuario;
        int usuario;
        nombre_usuario = System.getProperty("usuario_sistema");
        usuario = Integer.parseInt(nombre_usuario);
        try {

            DefaultTableModel tableModel = new DefaultTableModel(null, new String[]{"ID", "USUARIO", "BASE", "MEMBRESÍAS", "VISITAS", "FECHA DE APERTURA", "SALDO A FAVOR", "EGRESOS", "ADEUDOS", "TOTAL VENTAS", "TOTAL RECIBIDO", "FECHA DE CIERRE"});
            data = db.sqlDatos("SELECT ca.id, us.primer_nombre, ca.base, ca.ventas_membresia, ventas_visitas, ca.fecha_apertura, ca.saldo_favor, ca.total_egresos, ca.adeudar_creditos, ca.total_venta, ca.total_recibido, ca.fecha_cierre \n"
                    + "FROM caja ca, usuario_sistema us\n"
                    + "WHERE ca.usuario_sistema_id= us.id\n"
                    + "AND ca.estado = false ORDER BY ca.id DESC");
            tablaCaja = logica.Utilidades.llenarTabla(data.createCopy(), tableModel, tablaCaja);
            TableColumn columna = tablaCaja.getColumn("ID");
            columna.setPreferredWidth(28);
            TableColumn columnaDos = tablaCaja.getColumn("USUARIO");
            columnaDos.setPreferredWidth(98);
            TableColumn columnaTres = tablaCaja.getColumn("BASE");
            columnaTres.setPreferredWidth(38);
             TableColumn columnaCuatro = tablaCaja.getColumn("MEMBRESÍAS");
            columnaCuatro.setPreferredWidth(72);
             TableColumn columnaCinco = tablaCaja.getColumn("VISITAS");
            columnaCinco.setPreferredWidth(52);
             TableColumn columnaSeis = tablaCaja.getColumn("FECHA DE APERTURA");
            columnaSeis.setPreferredWidth(130);
            TableColumn columnaSiete = tablaCaja.getColumn("SALDO A FAVOR");
            columnaSiete.setPreferredWidth(49);
            TableColumn columnaOcho = tablaCaja.getColumn("EGRESOS");
            columnaOcho.setPreferredWidth(49);
            TableColumn columnanNueve = tablaCaja.getColumn("ADEUDOS");
            columnanNueve.setPreferredWidth(49);
            
        } catch (Exception ex) {
            Logger.getLogger(RegistrarPagoMembresia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void seleccionarCaja() {
        int filaSeleccionada, resul;
        String consulta, consul, descripcion, id_caja, usuario, base, membresia, visita, total_ventas, ingresos, egresos, total_adeudos, total_venta, total_recibido, fecha_apertura, fecha_cierre;
        Double valor;

        try {
            filaSeleccionada = tablaCaja.getSelectedRow();
            if (filaSeleccionada < 0) {
                Telegraph tele = new Telegraph("Visualizar Cierre de Caja", "Debe de seleccionar una fila para poder visualizar el cierre de caja", TelegraphType.NOTIFICATION_INFO, WindowPosition.TOPRIGHT, 9000);
                TelegraphQueue q = new TelegraphQueue();
                q.add(tele);
            } else {
                DefaultTableModel tableModel = (DefaultTableModel) tablaCaja.getModel();
                id_caja = tablaCaja.getValueAt(filaSeleccionada, 0).toString();
                usuario = tablaCaja.getValueAt(filaSeleccionada, 1).toString();
                base = tablaCaja.getValueAt(filaSeleccionada, 2).toString();
                membresia = tablaCaja.getValueAt(filaSeleccionada, 3).toString();
                visita = tablaCaja.getValueAt(filaSeleccionada, 4).toString();
                fecha_apertura = tablaCaja.getValueAt(filaSeleccionada, 5).toString();
                ingresos = tablaCaja.getValueAt(filaSeleccionada, 6).toString();
                egresos = tablaCaja.getValueAt(filaSeleccionada, 7).toString();
                total_adeudos = tablaCaja.getValueAt(filaSeleccionada, 8).toString();
                total_venta = tablaCaja.getValueAt(filaSeleccionada, 9).toString();
                total_recibido = tablaCaja.getValueAt(filaSeleccionada, 10).toString();
                fecha_cierre = tablaCaja.getValueAt(filaSeleccionada, 11).toString();

                VisualizarCaja caja = new VisualizarCaja(id_caja, usuario, base, membresia, visita, fecha_apertura, ingresos, egresos, total_adeudos, total_venta, total_recibido, fecha_cierre);
                Frame.escritorio.add(caja);
                caja.toFront();
                caja.setVisible(true);
                caja.setLocation(150, 20);
            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }
}