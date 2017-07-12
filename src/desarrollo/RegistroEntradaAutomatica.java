package desarrollo;

import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.swing.ImageIcon;
import logica.DB;
import logica.Utilidades;
import net.sf.jcarrierpigeon.WindowPosition;
import net.sf.jtelegraph.Telegraph;
import net.sf.jtelegraph.TelegraphQueue;
import net.sf.jtelegraph.TelegraphType;

/**
 *
 * @author GermanV
 */
public class RegistroEntradaAutomatica extends javax.swing.JFrame {
    Utilidades sonidos;
    CumpleaniosSocio miCumpleañosSocio;
    RegistrarEntrada miEntrada;
    DB midb;
    int socio;
    int clave = 0;
    String claveGuardar;
    Frame frame;
    VerSocio versocio;
    puerta.Puerta arduino;
    private final DB db = new DB();

    /**
     * Creates new form FrameBloqueo
     */
    public RegistroEntradaAutomatica() {
        sonidos= new Utilidades();
        miCumpleañosSocio = new CumpleaniosSocio();
        midb = new DB(); //objeto de base de datos
        this.setUndecorated(true);//quita bordes a jframe
        initComponents();
        lblImagen.setVisible(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//evita cerra jframe con ALT+C
        this.setExtendedState(MAXIMIZED_BOTH);//maximizado
        this.setAlwaysOnTop(true);//siempre al frente

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        imagen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        lblNombreSocio = new javax.swing.JLabel();
        lblMembresiaVence = new javax.swing.JLabel();
        lblCumpleanios = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });

        imagen.setBackground(new java.awt.Color(102, 102, 102));
        imagen.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        imagen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imagenKeyPressed(evt);
            }
        });
        imagen.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO A BioFisic GYM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 275, 0, 0);
        imagen.add(jLabel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Código de acceso:");

        pass.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblNombreSocio.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNombreSocio.setForeground(new java.awt.Color(102, 102, 102));

        lblMembresiaVence.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMembresiaVence.setForeground(new java.awt.Color(255, 51, 51));

        lblCumpleanios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cumpleaños.png"))); // NOI18N

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/sin_foto_hombre.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNombreSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(10, 10, 10)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jButton1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMembresiaVence, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                            .addComponent(lblCumpleanios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImagen)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNombreSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMembresiaVence, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCumpleanios, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(lblImagen))))
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 60, 0, 0);
        imagen.add(jPanel2, gridBagConstraints);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("WWW.GIDSOFT.ORG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 115, 1, 14);
        imagen.add(jLabel3, gridBagConstraints);

        getContentPane().add(imagen, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imagenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imagenKeyPressed

    }//GEN-LAST:event_imagenKeyPressed

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        pass.requestFocus();
    }//GEN-LAST:event_formFocusLost

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        pass.requestFocus();
    }//GEN-LAST:event_formFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pass.setText("");
        pass.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {
                if (pass.getText().trim().length() == 4) {
                    if (!pass.getText().trim().isEmpty()) {
                        clave = getIdMembresia(pass.getText().trim());
                        claveGuardar = pass.getText().trim();
                        socio = idSocio(claveGuardar);
                    }
                    miEntrada = new RegistrarEntrada(clave, null);
                    pass.setText("");

                    Thread hiloEntrada = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                if (usuarioExiste(clave)) {
                                    getImagen();
                                    
                                    //comprobar si el usuario esta cumpliendo años hoy o maniana
                                    if (miCumpleañosSocio.tieneFechaNacimiento(socio)) {
                                        if (miCumpleañosSocio.cumpleañosManiana(socio)) {
                                            lblCumpleanios.setText("Mañana es tu cumpleaños...Felicidades! :)");
                                            lblImagen.setVisible(true);
                                            sonidos.sonar("cumpleaños");
                                        } else if (miCumpleañosSocio.cumpleañosHoy(socio)) {
                                            lblCumpleanios.setText("Te Deseamos Muchas Felicidades En Tu Cumpleaños! :)");
                                            lblImagen.setVisible(true);
                                            sonidos.sonar("cumpleaños");
                                        }
                                    }
                                    //fin comprobacion
                                    lblNombreSocio.setVisible(true);
                                    lblNombreSocio.setText("Bienvenido: " + miEntrada.traerNombreSocio(clave));
                                    lblMembresiaVence.setText(venceMembresia());

                                    delay(4500);
                                    lblNombreSocio.setText("");
                                    lblMembresiaVence.setText("");
                                    lblCumpleanios.setText("");
                                    lblImagen.setVisible(false);

                                }

                            } catch (SQLException ex) {
                                Logger.getLogger(RegistroEntradaAutomatica.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ParseException ex) {
                                Logger.getLogger(RegistroEntradaAutomatica.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    });
                    hiloEntrada.start();

                } else {
                    if (usuarioSistema(pass.getText().trim()) > 0) {
                        //PuertaController.OpenDoor();
                        arduino= new puerta.Puerta();
                        arduino.openDoor();
                        Telegraph tele = new Telegraph("Bienvenido", "Usuario del sistema", TelegraphType.NOTIFICATION_DONE, WindowPosition.TOPRIGHT, 4000);
                        TelegraphQueue q = new TelegraphQueue();
                        q.add(tele);
                        pass.setText("");
                    }

                }
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(RegistroEntradaAutomatica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_passKeyPressed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEntradaAutomatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistroEntradaAutomatica().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCumpleanios;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMembresiaVence;
    private javax.swing.JLabel lblNombreSocio;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables

    private int getIdMembresia(String clave) {
        int idMembresia = 0;
        try {
            CachedRowSet data;
            String sql = String.format("SELECT s.id as id\n"
                    + "FROM socio s\n"
                    + "WHERE clave='%s';", clave);
            data = midb.sqlDatos(sql);

            while (data.next()) {
                idMembresia = data.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VerSocio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idMembresia;
    }

    private int usuarioSistema(String clave) {
        int idMembresia = 0;
        try {
            CachedRowSet data;
            String sql = String.format("SELECT us.id as id\n"
                    + "FROM usuario_sistema us\n"
                    + "WHERE clave='%s';", clave);
            data = midb.sqlDatos(sql);

            while (data.next()) {
                idMembresia = data.getInt("id");
                System.out.println("id membresia= " + idMembresia);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VerSocio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idMembresia;
    }

    private int idSocio(String clave) throws SQLException {
        String query = String.format("SELECT id FROM socio WHERE clave='%s';", clave);
        ResultSet rs = new logica.DB().sqlDatos(query);
        while (rs.next()) {
            socio = rs.getInt(1);
        }
        return socio;
    }

    private boolean usuarioExiste(int socio) {
        boolean correcto = true;
        int id = 0;
        try {
            CachedRowSet data;
            DB db = new DB();
            String sql = String.format("SELECT count(mu.membresia_id) as cantidad FROM socio s ,membresia_datos md, membresia_usuario mu where now() between md.fecha_inicio_membresia and md.fecha_fin_membresia and md.membresia_socio_id= mu.id and s.id=%s;", socio);
            data = db.sqlDatos(sql);
            while (data.next()) {
                id = data.getInt("cantidad");
            }
            if (id >= 1) {
                System.out.println("----------LOG DE VALIDACIONES/ENTRADA SOCIO------");
                System.out.println("Su membresía no ha caducado o no es promocional.");
                return true;
            } else {
                System.out.println("No tiene membresías activas para entrar hoy,\nSi tenía una membresía promocional, ésta ya venció.");
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarEntrada.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    private String venceMembresia() throws SQLException, ParseException {
        String vence = "";
        Date fecha = null;
        String cadena = null;

        int membresia = traerIdMembresiaAdquirida();

        CachedRowSet data;
        DB db = new DB();
        String sql = String.format("SELECT fecha_fin_membresia as fecha from membresia_datos where membresia_datos.membresia_socio_id=%s", membresia);
        data = db.sqlDatos(sql);
        while (data.next()) {
            fecha = data.getDate("fecha");
        }
        String mesLetras = null;

        if (fecha != null) {
            vence = fecha.toString();
            String mes = vence.substring(5, 7);
            String año = vence.substring(0, 4);
            String dia = vence.substring(8, 10);

            switch (mes) {
                case "01":
                    mesLetras = "Enero";
                    break;
                case "02":
                    mesLetras = "Febrero";
                    break;
                case "03":
                    mesLetras = "Marzo";
                    break;
                case "04":
                    mesLetras = "Abril";
                    break;
                case "05":
                    mesLetras = "Mayo";
                    break;
                case "06":
                    mesLetras = "Junio";
                    break;
                case "07":
                    mesLetras = "Julio";
                    break;
                case "08":
                    mesLetras = "Agosto";
                    break;
                case "09":
                    mesLetras = "Septiembre";
                    break;
                case "10":
                    mesLetras = "Octubre";
                    break;
                case "11":
                    mesLetras = "Noviembre";
                    break;
                case "12":
                    mesLetras = "Diciembre";
                    break;
            }
            cadena = "Su membresia vence el dia: " + dia + " de " + mesLetras + " de " + año;
        }

        return cadena;
    }

    public int membresia_id() throws SQLException {
        int membresia_id = 0;
        CachedRowSet data;
        DB db = new DB();
        String Sql = String.format("SELECT mu.membresia_id FROM membresia_usuario mu where mu.socio_id=%s", socio);
        data = db.sqlDatos(Sql);
        while (data.next()) {
            try {
                membresia_id = data.getInt("membresia_id");
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarEntrada.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return membresia_id;
    }

    public int traerIdMembresiaAdquirida() throws SQLException {
        CachedRowSet data;
        int id = 0;
        String consulta = String.format("SELECT id from membresia_usuario where socio_id=%s and activa=true;", socio, membresia_id());
        data = midb.sqlDatos(consulta);
        while (data.next()) {
            try {
                id = data.getInt("id");
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarEntrada.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return id;
    }

    private static void
            delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ix) {
        }
    }

    public void getImagen() {
        try {
            CachedRowSet data;
            int socioID=Integer.parseInt(pass.getText());
            System.out.println("pass "+pass.getText());
            data = db.sqlDatos("SELECT foto,REPLACE(concat(soc.primer_nombre,' ',soc.segundo_nombre,' ',soc.primer_apellido,' ',soc.segundo_apellido),'  ',' ') as Usuario, EXTRACT(year FROM AGE(NOW(),soc.fecha_nacimiento))::text || ' Años' edad , soc.sexo ,soc.clave FROM socio soc WHERE soc.id = " + socioID);
            

            while (data.next()) {
                if (data.getBytes("foto") != null) {
                    ImageIcon foto = new ImageIcon(data.getBytes("foto"));
                    lblFoto.setIcon(foto);
                    lblFoto.setBorder(null);

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroEntradaAutomatica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
