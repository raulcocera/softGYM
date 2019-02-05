/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import logica.DB;
import logica.PlaceHolder;
import logica.Utilidades;
import net.sf.jcarrierpigeon.WindowPosition;
import net.sf.jtelegraph.Telegraph;
import net.sf.jtelegraph.TelegraphQueue;
import net.sf.jtelegraph.TelegraphType;

/**
 *
 * @author GID
 */
public class AdministrarMembresia extends javax.swing.JInternalFrame {

    private DB db = new DB();
    DefaultTableModel dtmEjemplo;
    Utilidades utilidades = new Utilidades();
    String viejoValor;
    boolean estado = true;

    /**
     * Creates new form internalEjemplo
     */
    public AdministrarMembresia() {
        initComponents();
        jtMembresia.removeAll();
        obtenerMembresias(false);
        new PlaceHolder("Filtrar Membresias ...", txtBuscar);

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
        jtMembresia = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jcInactivas = new javax.swing.JCheckBox();
        txtBuscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtMembresia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Membresia", "Valor", "Duracion", "Disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMembresia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMembresiaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtMembresiaMousePressed(evt);
            }
        });
        jtMembresia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtMembresiaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtMembresia);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Administrar Membresías");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/hoja.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Permite crear planes o membresías para los socios.");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/caneco.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jcInactivas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcInactivas.setText("Ver Membresias Inactivas");
        jcInactivas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcInactivasItemStateChanged(evt);
            }
        });
        jcInactivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcInactivasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcInactivas)))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcInactivas)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Filtrar búsqueda: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (jtMembresia.getSelectedRow() >= 0 && jtMembresia.getSelectedColumn() >= 0) {
            String seleccion = obtenerIdMembresia(jtMembresia);
            boolean eliminarCorrecto = saberMembresiaUsuario(seleccion);
            if (eliminarCorrecto) {
                String querySQL = String.format("UPDATE membresia SET estado=false WHERE id = %s", seleccion);
                boolean correcto = db.sqlEjec(querySQL);
                obtenerMembresias(false);
                if (correcto) {
                    Telegraph tele = new Telegraph("Membresia Eliminada", "Se ha eliminado Correctamente la Membresia", TelegraphType.NOTIFICATION_REMOVE, WindowPosition.TOPRIGHT, 5000);
                    TelegraphQueue q = new TelegraphQueue();
                    q.add(tele);
                }
            }
        } else {
            utilidades.llamarMensaje();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String id = obtenerIdMembresia(jtMembresia);
        if (!id.isEmpty()) {
            CrearMembresia mem = new CrearMembresia(id, this);
            Frame.escritorio.add(mem);
            mem.toFront();
            mem.setVisible(true);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        CrearMembresia mem = new CrearMembresia(this);
        Frame.escritorio.add(mem);
        mem.toFront();
        mem.setVisible(true);
        mem.setVisible(true);
        mem.setLocation(10, 32);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jtMembresiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMembresiaKeyReleased
    }//GEN-LAST:event_jtMembresiaKeyReleased

    private void jtMembresiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMembresiaMousePressed

    }//GEN-LAST:event_jtMembresiaMousePressed

    private void jcInactivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcInactivasActionPerformed
        if (jcInactivas.isSelected()) {
            btnEliminar.setEnabled(false);
        } else {
            btnEliminar.setEnabled(true);
        }
    }//GEN-LAST:event_jcInactivasActionPerformed

    private void jcInactivasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcInactivasItemStateChanged
        obtenerMembresias(jcInactivas.isSelected());
    }//GEN-LAST:event_jcInactivasItemStateChanged

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        TableRowSorter sorter = new TableRowSorter(dtmEjemplo);
        sorter.setRowFilter(RowFilter.regexFilter(".*" +txtBuscar.getText().trim()+ ".*"));
        jtMembresia.setRowSorter(sorter);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void jtMembresiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMembresiaMouseClicked
        if (evt.getClickCount() == 1) {
            int row = jtMembresia.rowAtPoint(evt.getPoint());
            utilidades.construirFormulario(jtMembresia, row, "Detalle Membresia");
        }
    }//GEN-LAST:event_jtMembresiaMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcInactivas;
    private javax.swing.JTable jtMembresia;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    public void obtenerMembresias(Boolean estado) {
        CachedRowSet data;
        String querySql;
        String whereSQL = "";
        String orderBy = " ORDER BY mem.id ASC ";
        try {
            dtmEjemplo = new DefaultTableModel(null, new String[]{"Id membresia","Nombre Membresia", "Valor Membresia", "Duracion", "Fecha Expiracion", "Estado"});
            querySql = String.format("SELECT mem.id, mem.nombre,mem.valor,CONCAT(dura.duracion,'',dura.unidad),\n"
                    + "CASE WHEN promo.fecha_expiracion IS NULL THEN 'SIEMPRE DISPONIBLE' WHEN promo.fecha_expiracion IS NOT NULL THEN promo.fecha_expiracion::text END\n,"
                    + "CASE WHEN mem.estado IS True THEN 'Activa' WHEN mem.estado IS False THEN 'Inactiva'::text END\n"
                    + "FROM membresia mem\n"
                    + "LEFT OUTER JOIN membresia_promocional promo ON mem.id = promo.membresia_id\n"
                    + "LEFT OUTER JOIN membresia_duracion dura ON mem.id = dura.membresia_id");

            if (!estado) {
                String filtro = "estado = true";
                whereSQL += " WHERE " + filtro;
            }
            querySql = querySql + whereSQL + orderBy;

            data = db.sqlDatos(querySql);
            jtMembresia = logica.Utilidades.llenarTabla(data.createCopy(), dtmEjemplo, jtMembresia);
            jtMembresia.getColumnModel().getColumn(0).setMinWidth(0);
            jtMembresia.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        } catch (Exception ex) {
            Logger.getLogger(RegistrarPagoMembresia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    



    
    public String obtenerEstadoPagoMembresia( JTable tabla) {
        int fila = tabla.getSelectedRow();
        String estado = "";
        if (fila >= 0) {
            estado = String.valueOf(tabla.getModel().getValueAt(fila, 4));

        } else {
            utilidades.llamarMensaje();
        }
        return estado;
    }

    public String obtenerIdMembresia( JTable tabla) {
        int fila = tabla.getSelectedRow();
        String clave_id = "";
        if (fila >= 0) {
            clave_id = String.valueOf(tabla.getModel().getValueAt(fila, 0));

        } else {
            utilidades.llamarMensaje();
        }
        return clave_id;
    }

    public boolean saberMembresiaUsuario(String idMembresia) {
        CachedRowSet data;
        int contador = 0;
        String querySQL = String.format("SELECT COUNT(mu.membresia_id) AS numero_socios_membresia FROM membresia mem,membresia_usuario mu WHERE mem.id=%s AND mem.id=mu.membresia_id AND mu.activa=TRUE;", idMembresia);
        data = db.sqlDatos(querySQL);
        try {
            while (data.next()) {
                contador = data.getInt("numero_socios_membresia");
                System.out.println(contador);
                if (contador > 0) {
                    Telegraph tele = new Telegraph("Advertencia", "No se puede eliminar esta membresia por que hay usuarios asociados a ella", TelegraphType.NOTIFICATION_WARNING, WindowPosition.TOPRIGHT, 9000);
                    TelegraphQueue q = new TelegraphQueue();
                    q.add(tele);
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarPagoMembresia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
