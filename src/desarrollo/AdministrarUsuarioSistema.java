/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import logica.DB;
import logica.PlaceHolder;
import logica.Utilidades;
import logica.msj;
import net.sf.jcarrierpigeon.WindowPosition;
import net.sf.jtelegraph.Telegraph;
import net.sf.jtelegraph.TelegraphQueue;
import net.sf.jtelegraph.TelegraphType;

/**
 *
 * @author GID
 */
public class AdministrarUsuarioSistema extends javax.swing.JInternalFrame {

    DefaultTableModel dtmEjemplo = new DefaultTableModel();
    private DB db = new DB();
    private msj mensaje = new msj();
    private Utilidades utilidades = new Utilidades();

    /**
     * Creates new form internalEjemplo
     */
    public AdministrarUsuarioSistema() {
        initComponents();
        jtUsuarioSistema.removeAll();
        txtBuscar.requestFocus();
        obtenerUsuariosSistema(true);
        new PlaceHolder("Filtrar Usuarios ...", txtBuscar);
        

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
        jtUsuarioSistema = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cbUsuariosInactivos = new javax.swing.JCheckBox();
        txtBuscar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtUsuarioSistema.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Apellidos", "Nombre Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtUsuarioSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtUsuarioSistemaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtUsuarioSistema);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Administrar Empleados");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Group-32.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Permite administrar las personas que utilizan el programa.");

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/caneco.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        cbUsuariosInactivos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbUsuariosInactivos.setText("Ver usuarios Inactivos");
        cbUsuariosInactivos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbUsuariosInactivosItemStateChanged(evt);
            }
        });
        cbUsuariosInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUsuariosInactivosActionPerformed(evt);
            }
        });
        cbUsuariosInactivos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbUsuariosInactivosFocusLost(evt);
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
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbUsuariosInactivos)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(cbUsuariosInactivos)))
                .addGap(50, 50, 50))
        );

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (jtUsuarioSistema.getSelectedRow() >= 0 && jtUsuarioSistema.getSelectedColumn() >= 0) {
            String seleccion = obtenerIdEmpleado();
            if (!"1".equals(seleccion)) {
                String querySQL = String.format("UPDATE usuario_sistema SET estado=false WHERE id = '%s'", seleccion);
                boolean correcto = db.sqlEjec(querySQL);
                obtenerUsuariosSistema(true);
                if (correcto) {
                    Telegraph tele = new Telegraph("Usuario Eliminada", "Se ha eliminado Correctamente el Usuario", TelegraphType.NOTIFICATION_REMOVE, WindowPosition.TOPRIGHT, 5000);
                    TelegraphQueue q = new TelegraphQueue();
                    q.add(tele);
                }
            } else {
                msj.show("Advertencia", "No se puede eliminar el usuario Administrador", TelegraphType.NOTIFICATION_WARNING, 5000);
            }

        } else {
            utilidades.llamarMensaje();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        CrearUsuarioSistema crearUsuarioSistema = new CrearUsuarioSistema(this);
        Frame.escritorio.add(crearUsuarioSistema);
        crearUsuarioSistema.toFront();
        crearUsuarioSistema.setVisible(true);
        crearUsuarioSistema.setLocation(100, 32);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cbUsuariosInactivosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbUsuariosInactivosItemStateChanged
        obtenerUsuariosSistema(cbUsuariosInactivos.isSelected());
    }//GEN-LAST:event_cbUsuariosInactivosItemStateChanged

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String id = obtenerIdEmpleado();
        if (!id.isEmpty()) {
            CrearUsuarioSistema cus = new CrearUsuarioSistema(id, this);
            Frame.escritorio.add(cus);
            cus.toFront();
            cus.setVisible(true);
           cus.setLocation(100, 32);
            
            cus.setVisible(true);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cbUsuariosInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUsuariosInactivosActionPerformed
        if (cbUsuariosInactivos.isSelected()) {
            btnEliminar.setEnabled(false);
            obtenerUsuariosSistema(false);
        }else{
            btnEliminar.setEnabled(true);
            obtenerUsuariosSistema(true);
        }
    }//GEN-LAST:event_cbUsuariosInactivosActionPerformed

    private void cbUsuariosInactivosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbUsuariosInactivosFocusLost
        
    }//GEN-LAST:event_cbUsuariosInactivosFocusLost

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        TableRowSorter sorter = new TableRowSorter(dtmEjemplo);
        sorter.setRowFilter(RowFilter.regexFilter(".*" + txtBuscar.getText().trim() + ".*"));
        jtUsuarioSistema.setRowSorter(sorter);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void jtUsuarioSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuarioSistemaMouseClicked

    }//GEN-LAST:event_jtUsuarioSistemaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JCheckBox cbUsuariosInactivos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtUsuarioSistema;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    public void obtenerUsuariosSistema(Boolean estado) {
        CachedRowSet data;
        String querySql;
        String orderBy = " ORDER BY us.id ASC ";
        try {
            dtmEjemplo = new DefaultTableModel(null, new String[]{"Nombres", "Apellidos", "nombreUsuario", "estado"});
            querySql = String.format("SELECT CONCAT(us.primer_nombre,' ',us.segundo_nombre),"
                    + "CONCAT(us.primer_apellido,' ',us.segundo_apellido),us.identificacion, "
                    + "CASE WHEN us.estado IS TRUE THEN 'Activo' WHEN us.estado IS FALSE THEN 'Inactivo'::text END\n "
                    + "FROM usuario_sistema us\n"
                    + "WHERE us.estado = %s", estado);

            querySql = querySql + orderBy;
            data = db.sqlDatos(querySql);
            jtUsuarioSistema = logica.Utilidades.llenarTabla(data.createCopy(), dtmEjemplo, jtUsuarioSistema);
        } catch (Exception ex) {
            Logger.getLogger(RegistrarPagoMembresia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String obtenerIdEmpleado() {
        int fila = jtUsuarioSistema.getSelectedRow();
        String clave_id = "";
        if (fila >= 0) {
            clave_id = String.valueOf(dtmEjemplo.getValueAt(fila, 0));
        } else {
            utilidades.llamarMensaje();
        }
        return clave_id;
    }

}
