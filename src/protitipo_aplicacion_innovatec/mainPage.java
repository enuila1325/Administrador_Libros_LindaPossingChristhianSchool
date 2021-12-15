package protitipo_aplicacion_innovatec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class mainPage extends javax.swing.JFrame {

    public mainPage() {
        initComponents();
        setLocationRelativeTo(null);
        cb_maestroSolictante.setEnabled(false);
        cb_alumnoSolictante.setEnabled(true);
        rb_alumnoSolicitante.setSelected(true);
        ca.conectar();
        try {
            ca.query.execute("select Id, Nombre, Grado from Alumnos");
            ResultSet rs = ca.query.getResultSet();
            while (rs.next()) {
                Alumno a = new Alumno();
                a.setId(rs.getInt(1));
                a.setNombre(rs.getString(2));
                a.setGrado(rs.getInt(3));
                alumnos.add(a);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        try {
            ca.query.execute("select Id, Nombre, Servicio, Contacto1, Contacto2,Correo, Horario from Personal");
            ResultSet rs = ca.query.getResultSet();
            while (rs.next()) {
                Maestro m = new Maestro();
                m.setId(rs.getInt(1));
                m.setNombre(rs.getString(2));
                m.setCargo(rs.getString(3));
                m.setContacto1(rs.getString(4));
                m.setContacto2(rs.getString(5));
                m.setCorreo(rs.getString(6));
                m.setHorario(rs.getString(7));
                maestros.add(m);
            }
        } catch (SQLException ex) {
        }
        try {
            ca.query.execute("select IdEntrega, IdSolicitante, CodigoLibro, FechaDevolucion, FechaMaximaDevolucion, TipoSolicitante from Prestamos");
            ResultSet rs = ca.query.getResultSet();
            while (rs.next()) {
                Prestamo p = new Prestamo();
                p.setIdEntrega(rs.getInt(1));
                p.setIdSolictante(rs.getInt(2));
                p.setCodBarrasLibroPrestado(rs.getString(3));
                p.setFechaDevolucion(rs.getDate(4));
                p.setFechaDevolucionMaxima(rs.getDate(5));
                p.setTipoSolicitante(rs.getString(6));
                prestamos.add(p);
            }
        } catch (SQLException ex) {
        }
        try {
            ca.query.execute("select Codigo, Titulo, Materia, Descripcion, Grado from Libros");
            ResultSet rs = ca.query.getResultSet();
            while (rs.next()) {
                Libro l = new Libro();
                l.setBarCode(rs.getString(1));
                l.setNombre(rs.getString(2));
                l.setMateria(rs.getString(3));
                l.setDescripcion(rs.getString(4));
                l.setGrado(rs.getInt(5));
                libros.add(l);
            }
        } catch (SQLException ex) {
        }
        ca.desconectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla_CreacionLibro = new javax.swing.JFrame();
        cb_barCodeLibro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tf_nombreLibro = new javax.swing.JTextField();
        cb_Materia = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descrpcionLibro = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jb_añadirLibro_A_Inventario = new javax.swing.JButton();
        js_gradoCreacionLibro = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        pantalla_EliminarLibro = new javax.swing.JFrame();
        cb_barCodeLibroEliminar = new javax.swing.JComboBox<>();
        tf_nombreLibroDelete = new javax.swing.JTextField();
        jb_deleteLibro = new javax.swing.JButton();
        jd_listaLibros = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_listLibros = new javax.swing.JTable();
        cb_FiltroMateriaList = new javax.swing.JComboBox<>();
        cb_listLibroGrado = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        pantalla_prestamos = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rb_maestroSolicitante = new javax.swing.JRadioButton();
        rb_alumnoSolicitante = new javax.swing.JRadioButton();
        jd_fechaMaximaDevoluion = new com.toedter.calendar.JDateChooser();
        jb_crearPrestamo = new javax.swing.JButton();
        cb_alumnoSolictante = new javax.swing.JComboBox<>();
        cb_maestroSolictante = new javax.swing.JComboBox<>();
        tf_nombreSolicitante = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_nombreLibroPrestar = new javax.swing.JTextField();
        cb_idLibroPrestar = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        pantalla_devolucion = new javax.swing.JFrame();
        cb_idEntregaPrestamoLibro = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tf_codBarrasLibroEntregado = new javax.swing.JTextField();
        tf_entregadoPor = new javax.swing.JTextField();
        jb_entregarLibro = new javax.swing.JButton();
        jdc_entregaFinal = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        creacion_alumno = new javax.swing.JFrame();
        tf_nombreAlumno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        js_grado = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jb_newAlumno = new javax.swing.JButton();
        List_alumnos = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_listAlumnos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cb_selectorGradoLista = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        grupo_maestroAlumno = new javax.swing.ButtonGroup();
        listMaestros = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_listMaestros = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        creacionMaestro = new javax.swing.JFrame();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf_NombreNuevoMaestro = new javax.swing.JTextField();
        tf_cargoNuevoMaestro = new javax.swing.JTextField();
        tf_correoNuevoMaestro = new javax.swing.JTextField();
        tf_newNumero1 = new javax.swing.JTextField();
        tf_newNumero2 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        ta_horarioNewMaestro = new javax.swing.JTextArea();
        jb_crearMaestro = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        pantalla_ActualizarAlumno = new javax.swing.JFrame();
        cb_idModAlumno = new javax.swing.JComboBox<>();
        tf_nombreAlumnoEdit = new javax.swing.JTextField();
        js_modAlumno = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jb_modAlumno = new javax.swing.JButton();
        jb_eliminarAlumno = new javax.swing.JButton();
        pantalla_modMaestro = new javax.swing.JFrame();
        cb_idModMaestro = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        tf_nombreModMaestro = new javax.swing.JTextField();
        tf_cargoModMaestro = new javax.swing.JTextField();
        tf_correoModMaestro = new javax.swing.JTextField();
        tf_numero1mod = new javax.swing.JTextField();
        tf_numero2mod = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ta_modHorario = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        jb_eliminarMaestro = new javax.swing.JButton();
        jb_actualizarMaestro = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuLibro = new javax.swing.JMenu();
        menuItem_loadCSV = new javax.swing.JMenuItem();
        menuItem_agregarLibro = new javax.swing.JMenuItem();
        menuItem_edLibri = new javax.swing.JMenuItem();
        menu_readLibros = new javax.swing.JMenu();
        menuItem_readLibrosLectura = new javax.swing.JMenuItem();
        menuItem_readLibros = new javax.swing.JMenuItem();
        menuPrestamos = new javax.swing.JMenu();
        menuItem_newPrestamo = new javax.swing.JMenuItem();
        menuItem_devolverLibro = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        menuAlumno = new javax.swing.JMenu();
        menuItem_createAlumno = new javax.swing.JMenuItem();
        menuItem_modAlumno = new javax.swing.JMenuItem();
        menuItem_listAlumnos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuItem_createMaestro = new javax.swing.JMenuItem();
        menuItem_modMaestro = new javax.swing.JMenuItem();
        menuItem_listMaestros = new javax.swing.JMenuItem();

        pantalla_CreacionLibro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_barCodeLibro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_barCodeLibroItemStateChanged(evt);
            }
        });
        pantalla_CreacionLibro.getContentPane().add(cb_barCodeLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 36, 158, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo de Libro");
        pantalla_CreacionLibro.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 41, -1, -1));

        tf_nombreLibro.setEditable(false);
        pantalla_CreacionLibro.getContentPane().add(tf_nombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 91, 315, -1));

        cb_Materia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Math", "Literature", "Word Building", "Etimology", "Social Studies", "Arts", "Spanish", "History", "Computer", "Science", "Biology", "Cívica", "Otras..." }));
        pantalla_CreacionLibro.getContentPane().add(cb_Materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 156, 315, -1));

        ta_descrpcionLibro.setColumns(20);
        ta_descrpcionLibro.setRows(5);
        jScrollPane1.setViewportView(ta_descrpcionLibro);

        pantalla_CreacionLibro.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 288, 586, 128));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Descripcion del Libro");
        pantalla_CreacionLibro.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 254, -1, -1));

        jb_añadirLibro_A_Inventario.setBackground(new java.awt.Color(0, 255, 0));
        jb_añadirLibro_A_Inventario.setForeground(new java.awt.Color(0, 255, 0));
        jb_añadirLibro_A_Inventario.setText("Añadir");
        jb_añadirLibro_A_Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_añadirLibro_A_InventarioActionPerformed(evt);
            }
        });
        pantalla_CreacionLibro.getContentPane().add(jb_añadirLibro_A_Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 428, -1, -1));

        js_gradoCreacionLibro.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));
        pantalla_CreacionLibro.getContentPane().add(js_gradoCreacionLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 194, 83, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("GRADO");
        pantalla_CreacionLibro.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 199, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2186502.jpg"))); // NOI18N
        jLabel32.setToolTipText("");
        pantalla_CreacionLibro.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        cb_barCodeLibroEliminar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_barCodeLibroEliminarItemStateChanged(evt);
            }
        });

        tf_nombreLibroDelete.setEditable(false);

        jb_deleteLibro.setBackground(new java.awt.Color(255, 0, 0));
        jb_deleteLibro.setForeground(new java.awt.Color(255, 0, 0));
        jb_deleteLibro.setText("Eliminar");
        jb_deleteLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_deleteLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantalla_EliminarLibroLayout = new javax.swing.GroupLayout(pantalla_EliminarLibro.getContentPane());
        pantalla_EliminarLibro.getContentPane().setLayout(pantalla_EliminarLibroLayout);
        pantalla_EliminarLibroLayout.setHorizontalGroup(
            pantalla_EliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_EliminarLibroLayout.createSequentialGroup()
                .addGroup(pantalla_EliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantalla_EliminarLibroLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(pantalla_EliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_barCodeLibroEliminar, 0, 204, Short.MAX_VALUE)
                            .addComponent(tf_nombreLibroDelete)))
                    .addGroup(pantalla_EliminarLibroLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jb_deleteLibro)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        pantalla_EliminarLibroLayout.setVerticalGroup(
            pantalla_EliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_EliminarLibroLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(cb_barCodeLibroEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(tf_nombreLibroDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jb_deleteLibro)
                .addGap(35, 35, 35))
        );

        jd_listaLibros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_listLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de Barras", "Titulo", "Materia", "Descripcion", "Grado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(t_listLibros);

        jd_listaLibros.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 130, 671, 301));

        cb_FiltroMateriaList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------------------------------------------------------------------", "Todos las materias", "Math", "Reading", "Spelling", "Language", "Social Studies", "Arts", "Spanish", "History", "Computer", "Science", "Civics", "Otras..." }));
        cb_FiltroMateriaList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_FiltroMateriaListItemStateChanged(evt);
            }
        });
        jd_listaLibros.getContentPane().add(cb_FiltroMateriaList, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 40, 315, -1));

        cb_listLibroGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------------", "TODOS", "1ero", "2do", "3ero", "4to", "5to", "6to", "7mo", "8vo", "9no" }));
        cb_listLibroGrado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_listLibroGradoItemStateChanged(evt);
            }
        });
        jd_listaLibros.getContentPane().add(cb_listLibroGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 84, 100, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2186502.jpg"))); // NOI18N
        jd_listaLibros.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 490));

        pantalla_prestamos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Solicitante:");
        pantalla_prestamos.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 86, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Fecha de devolucion maxima:");
        pantalla_prestamos.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        grupo_maestroAlumno.add(rb_maestroSolicitante);
        rb_maestroSolicitante.setText("Personal");
        rb_maestroSolicitante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_maestroSolicitanteItemStateChanged(evt);
            }
        });
        pantalla_prestamos.getContentPane().add(rb_maestroSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        grupo_maestroAlumno.add(rb_alumnoSolicitante);
        rb_alumnoSolicitante.setText("Alumno");
        rb_alumnoSolicitante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_alumnoSolicitanteItemStateChanged(evt);
            }
        });
        pantalla_prestamos.getContentPane().add(rb_alumnoSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));
        pantalla_prestamos.getContentPane().add(jd_fechaMaximaDevoluion, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 210, -1));

        jb_crearPrestamo.setText("Ingresar Prestamo al Sistema");
        jb_crearPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearPrestamoActionPerformed(evt);
            }
        });
        pantalla_prestamos.getContentPane().add(jb_crearPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        cb_alumnoSolictante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_alumnoSolictanteItemStateChanged(evt);
            }
        });
        pantalla_prestamos.getContentPane().add(cb_alumnoSolictante, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 140, -1));

        cb_maestroSolictante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_maestroSolictanteItemStateChanged(evt);
            }
        });
        pantalla_prestamos.getContentPane().add(cb_maestroSolictante, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 140, -1));

        tf_nombreSolicitante.setEditable(false);
        pantalla_prestamos.getContentPane().add(tf_nombreSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 400, -1));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Libro Solicitado:");
        pantalla_prestamos.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        tf_nombreLibroPrestar.setEditable(false);
        pantalla_prestamos.getContentPane().add(tf_nombreLibroPrestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 210, -1));

        cb_idLibroPrestar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_idLibroPrestarItemStateChanged(evt);
            }
        });
        pantalla_prestamos.getContentPane().add(cb_idLibroPrestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 90, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2094188.jpg"))); // NOI18N
        pantalla_prestamos.getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 480));

        pantalla_devolucion.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_idEntregaPrestamoLibro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_idEntregaPrestamoLibroItemStateChanged(evt);
            }
        });
        pantalla_devolucion.getContentPane().add(cb_idEntregaPrestamoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 62, 209, -1));

        jLabel19.setText("Código de Barras Libro en Prestamo:");
        pantalla_devolucion.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 129, -1, -1));

        jLabel20.setText("Entregado por:");
        pantalla_devolucion.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 220, -1, -1));
        pantalla_devolucion.getContentPane().add(tf_codBarrasLibroEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 163, 209, -1));
        pantalla_devolucion.getContentPane().add(tf_entregadoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 259, 209, -1));

        jb_entregarLibro.setBackground(new java.awt.Color(0, 204, 0));
        jb_entregarLibro.setForeground(new java.awt.Color(0, 255, 0));
        jb_entregarLibro.setText("Confirmar Entrega");
        jb_entregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_entregarLibroActionPerformed(evt);
            }
        });
        pantalla_devolucion.getContentPane().add(jb_entregarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 364, -1, -1));
        pantalla_devolucion.getContentPane().add(jdc_entregaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 254, 209, -1));

        jLabel21.setText("Fecha Entrega:");
        pantalla_devolucion.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 220, -1, -1));

        jLabel22.setText("ID ENTREGA:");
        pantalla_devolucion.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 34, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2094188.jpg"))); // NOI18N
        pantalla_devolucion.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 420));

        jLabel3.setText("Nombre:");

        jLabel4.setText("Grado:");

        js_grado.setModel(new javax.swing.SpinnerNumberModel(1, 0, 9, 1));

        jLabel5.setText("INGRESAR NUEVO ALUMNO AL SISTEMA");

        jb_newAlumno.setBackground(new java.awt.Color(0, 204, 0));
        jb_newAlumno.setForeground(new java.awt.Color(0, 204, 0));
        jb_newAlumno.setText("CREAR");
        jb_newAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_newAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout creacion_alumnoLayout = new javax.swing.GroupLayout(creacion_alumno.getContentPane());
        creacion_alumno.getContentPane().setLayout(creacion_alumnoLayout);
        creacion_alumnoLayout.setHorizontalGroup(
            creacion_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creacion_alumnoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(creacion_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creacion_alumnoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(js_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(creacion_alumnoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(tf_nombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(creacion_alumnoLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jb_newAlumno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creacion_alumnoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(84, 84, 84))
        );
        creacion_alumnoLayout.setVerticalGroup(
            creacion_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creacion_alumnoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel5)
                .addGap(47, 47, 47)
                .addGroup(creacion_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(tf_nombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(creacion_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(js_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jb_newAlumno)
                .addGap(28, 28, 28))
        );

        List_alumnos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_listAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Grado", "ID Unico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tb_listAlumnos);

        List_alumnos.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 131, 614, 296));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ALUMNOS EN EL SISTEMA");
        List_alumnos.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 51, 210, -1));

        cb_selectorGradoLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "Preparatoria", "1ero", "2do", "3er", "4to", "5to", "6to", "7mo", "8vo", "9no" }));
        cb_selectorGradoLista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_selectorGradoListaItemStateChanged(evt);
            }
        });
        List_alumnos.getContentPane().add(cb_selectorGradoLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 75, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Grados:");
        List_alumnos.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0mRXQU.jpg"))); // NOI18N
        List_alumnos.getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        listMaestros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_listMaestros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Unico", "Nombre", "Cargo", "Correo", "Horario", "Celular", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tb_listMaestros);

        listMaestros.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 122, 969, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("MAESTROS EN SISTEMA:");
        listMaestros.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 63, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0mRXQU.jpg"))); // NOI18N
        listMaestros.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 610));

        creacionMaestro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Nombre:");
        creacionMaestro.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 65, -1, -1));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Cargo/Servicio:");
        creacionMaestro.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 114, -1, -1));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Correo:");
        creacionMaestro.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 160, -1, -1));

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Horario:");
        creacionMaestro.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 303, -1, -1));

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Numero de telefono 1:");
        creacionMaestro.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 202, -1, -1));

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Numero de Telefono 2:");
        creacionMaestro.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 247, -1, -1));
        creacionMaestro.getContentPane().add(tf_NombreNuevoMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 61, 232, -1));
        creacionMaestro.getContentPane().add(tf_cargoNuevoMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 110, 232, -1));
        creacionMaestro.getContentPane().add(tf_correoNuevoMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 156, 232, -1));
        creacionMaestro.getContentPane().add(tf_newNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 198, 232, -1));
        creacionMaestro.getContentPane().add(tf_newNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 243, 232, -1));

        ta_horarioNewMaestro.setColumns(20);
        ta_horarioNewMaestro.setRows(5);
        jScrollPane5.setViewportView(ta_horarioNewMaestro);

        creacionMaestro.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 303, 232, -1));

        jb_crearMaestro.setBackground(new java.awt.Color(0, 204, 0));
        jb_crearMaestro.setForeground(new java.awt.Color(0, 204, 0));
        jb_crearMaestro.setText("Ingresar al sistema");
        jb_crearMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearMaestroActionPerformed(evt);
            }
        });
        creacionMaestro.getContentPane().add(jb_crearMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 417, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2186502.jpg"))); // NOI18N
        creacionMaestro.getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        cb_idModAlumno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_idModAlumnoItemStateChanged(evt);
            }
        });

        jLabel23.setText("ID Alumno");

        jLabel24.setText("Nombre:");

        jLabel25.setText("Grado");

        jb_modAlumno.setBackground(new java.awt.Color(0, 204, 0));
        jb_modAlumno.setForeground(new java.awt.Color(0, 204, 0));
        jb_modAlumno.setText("Actualizar");
        jb_modAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modAlumnoActionPerformed(evt);
            }
        });

        jb_eliminarAlumno.setBackground(new java.awt.Color(255, 0, 0));
        jb_eliminarAlumno.setForeground(new java.awt.Color(255, 0, 0));
        jb_eliminarAlumno.setText("Eliminar");
        jb_eliminarAlumno.setBorderPainted(false);
        jb_eliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantalla_ActualizarAlumnoLayout = new javax.swing.GroupLayout(pantalla_ActualizarAlumno.getContentPane());
        pantalla_ActualizarAlumno.getContentPane().setLayout(pantalla_ActualizarAlumnoLayout);
        pantalla_ActualizarAlumnoLayout.setHorizontalGroup(
            pantalla_ActualizarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_ActualizarAlumnoLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(pantalla_ActualizarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(pantalla_ActualizarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_ActualizarAlumnoLayout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addGap(18, 18, 18)
                            .addComponent(cb_idModAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_ActualizarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_ActualizarAlumnoLayout.createSequentialGroup()
                                .addComponent(jb_eliminarAlumno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_modAlumno))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_ActualizarAlumnoLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(js_modAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_nombreAlumnoEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58))
        );
        pantalla_ActualizarAlumnoLayout.setVerticalGroup(
            pantalla_ActualizarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_ActualizarAlumnoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(pantalla_ActualizarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_idModAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(54, 54, 54)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_nombreAlumnoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(pantalla_ActualizarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(js_modAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(pantalla_ActualizarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_modAlumno)
                    .addComponent(jb_eliminarAlumno))
                .addGap(23, 23, 23))
        );

        pantalla_modMaestro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_idModMaestro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_idModMaestroItemStateChanged(evt);
            }
        });
        pantalla_modMaestro.getContentPane().add(cb_idModMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 26, 151, -1));

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Correo:");
        pantalla_modMaestro.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 174, -1, -1));

        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Horario:");
        pantalla_modMaestro.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 327, -1, -1));

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Numero de celular:");
        pantalla_modMaestro.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 230, -1, -1));

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Numero de telefono:");
        pantalla_modMaestro.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 275, -1, -1));
        pantalla_modMaestro.getContentPane().add(tf_nombreModMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 79, 432, -1));
        pantalla_modMaestro.getContentPane().add(tf_cargoModMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 128, 432, -1));
        pantalla_modMaestro.getContentPane().add(tf_correoModMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 174, 432, -1));
        pantalla_modMaestro.getContentPane().add(tf_numero1mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 230, 432, -1));
        pantalla_modMaestro.getContentPane().add(tf_numero2mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 275, 432, -1));

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Nombre:");
        pantalla_modMaestro.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 79, -1, -1));

        ta_modHorario.setColumns(20);
        ta_modHorario.setRows(5);
        jScrollPane6.setViewportView(ta_modHorario);

        pantalla_modMaestro.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 335, 432, -1));

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Cargo/Servicio:");
        pantalla_modMaestro.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 128, -1, -1));

        jb_eliminarMaestro.setBackground(new java.awt.Color(255, 0, 0));
        jb_eliminarMaestro.setForeground(new java.awt.Color(255, 0, 0));
        jb_eliminarMaestro.setText("Eliminar");
        jb_eliminarMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminarMaestroActionPerformed(evt);
            }
        });
        pantalla_modMaestro.getContentPane().add(jb_eliminarMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 436, -1, -1));

        jb_actualizarMaestro.setBackground(new java.awt.Color(0, 255, 0));
        jb_actualizarMaestro.setForeground(new java.awt.Color(0, 255, 0));
        jb_actualizarMaestro.setText("Actualizar");
        jb_actualizarMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizarMaestroActionPerformed(evt);
            }
        });
        pantalla_modMaestro.getContentPane().add(jb_actualizarMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 436, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0mRXQU.jpg"))); // NOI18N
        pantalla_modMaestro.getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2021-12-11 at 20.14.51.jpeg"))); // NOI18N
        jLabel34.setText("jLabel34");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 420, 400));

        jLabel35.setFont(new java.awt.Font("HP Simplified Jpan Light", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("SISTEMA DE CONTROL");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        jLabel36.setFont(new java.awt.Font("HP Simplified Light", 2, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("PACESCANNER");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 420, 110, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0mRXQU.jpg"))); // NOI18N
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 461));

        menuLibro.setText("Libros");

        menuItem_loadCSV.setText("Cargar CSV con codigos");
        menuItem_loadCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_loadCSVActionPerformed(evt);
            }
        });
        menuLibro.add(menuItem_loadCSV);

        menuItem_agregarLibro.setText("Agregar Libro al Inventario");
        menuItem_agregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_agregarLibroActionPerformed(evt);
            }
        });
        menuLibro.add(menuItem_agregarLibro);

        menuItem_edLibri.setText("Eliminar Libro del Inventario");
        menuItem_edLibri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_edLibriActionPerformed(evt);
            }
        });
        menuLibro.add(menuItem_edLibri);

        menu_readLibros.setText("Ver Libros en Inventario");

        menuItem_readLibrosLectura.setText("Libros de Lectura para alumnos");
        menu_readLibros.add(menuItem_readLibrosLectura);

        menuItem_readLibros.setText("Libros para enseñanza");
        menuItem_readLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_readLibrosActionPerformed(evt);
            }
        });
        menu_readLibros.add(menuItem_readLibros);

        menuLibro.add(menu_readLibros);

        jMenuBar1.add(menuLibro);

        menuPrestamos.setText("Prestamos");

        menuItem_newPrestamo.setText("Crear nueva entrada");
        menuItem_newPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_newPrestamoActionPerformed(evt);
            }
        });
        menuPrestamos.add(menuItem_newPrestamo);

        menuItem_devolverLibro.setText("Confirmar devolucion");
        menuItem_devolverLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_devolverLibroActionPerformed(evt);
            }
        });
        menuPrestamos.add(menuItem_devolverLibro);

        jMenuBar1.add(menuPrestamos);

        menuUsuarios.setText("Usuarios");

        menuAlumno.setText("Alumnos");

        menuItem_createAlumno.setText("Crear nuevo usuario");
        menuItem_createAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_createAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(menuItem_createAlumno);

        menuItem_modAlumno.setText("Actualizar Usuario");
        menuItem_modAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_modAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(menuItem_modAlumno);

        menuItem_listAlumnos.setText("Listar alumnos en sistema");
        menuItem_listAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_listAlumnosActionPerformed(evt);
            }
        });
        menuAlumno.add(menuItem_listAlumnos);

        menuUsuarios.add(menuAlumno);

        jMenu1.setText("Maestro");

        menuItem_createMaestro.setText("Crear nuevo usuario");
        menuItem_createMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_createMaestroActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_createMaestro);

        menuItem_modMaestro.setText("Actualizar Usuario");
        menuItem_modMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_modMaestroActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_modMaestro);

        menuItem_listMaestros.setText("Listar maestros en el sistema");
        menuItem_listMaestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_listMaestrosActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_listMaestros);

        menuUsuarios.add(jMenu1);

        jMenuBar1.add(menuUsuarios);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem_loadCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_loadCSVActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int seleccion = fc.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            FileReader fr = null;
            try {
                fichero = fc.getSelectedFile();
                if (!nombresLibros.isEmpty()) {
                    nombresLibros.clear();
                }
                if (!barCodes.isEmpty()) {
                    barCodes.clear();
                }
                JOptionPane.showMessageDialog(null, "El archivo ha sido cargado exitosamente", "REALIZADO", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se pudo cargar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_menuItem_loadCSVActionPerformed

    private void jb_añadirLibro_A_InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_añadirLibro_A_InventarioActionPerformed
        try {
            if (fichero == null) {
                JOptionPane.showMessageDialog(null, "No hay ningun documento .CSV en el sistema. Inicialice uno e intente nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                String nombre = "", materia = "", barCode = "", descripcion = "";
                nombre = nombresLibros.get(cb_barCodeLibro.getSelectedIndex());
                materia = cb_Materia.getSelectedItem().toString();
                barCode = barCodes.get(cb_barCodeLibro.getSelectedIndex());
                descripcion = ta_descrpcionLibro.getText();
                int grado = Integer.parseInt(js_gradoCreacionLibro.getValue().toString());
                Libro l = new Libro(barCode, nombre, materia, descripcion, grado);
                pantalla_CreacionLibro.setVisible(false);
                int eleccion = JOptionPane.showConfirmDialog(null, "Libro ingresado. ¿Desea actualizar el sistema?", "ACTUALIZAR", JOptionPane.YES_NO_CANCEL_OPTION);
                boolean flag = false;
                if (eleccion == JOptionPane.YES_OPTION) {
                    for (Libro libro : libros) {
                        if (libro.getBarCode().equals(barCode)) {
                            flag = true;
                        }
                    }
                    if (flag) {
                        JOptionPane.showMessageDialog(null, "El codigo de barras ingresado ya existe en el sistema. Valide el ingreso de sus datos", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        ca.conectar();
                        try {
                            ca.query.execute("INSERT INTO Libros"
                                    + " (Codigo, Titulo, Materia, Descripcion, Grado)"
                                    + " VALUES ('" + barCode + "', '" + nombre + "', '" + materia + "', '" + descripcion + "', '" + grado + "')");
                            ca.commit();
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(null, "Revise los datos ingresados. Es posible que haya ingresado algun dato erróneo.\nPuede que:\n-El codigo de barras ya exista en el sistema"
                                    + "\n-El grado no se haya ingresado como valor numérico\n-Haya ingresado una descrpcion inválida (vacía o nula).\n-no se haya ingresado un titulo correcto.");
                        }
                        libros.add(l);
                        ca.desconectar();
                    }
                }
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jb_añadirLibro_A_InventarioActionPerformed

    private void menuItem_edLibriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_edLibriActionPerformed
        try {
            DefaultComboBoxModel cbm = (DefaultComboBoxModel) cb_barCodeLibroEliminar.getModel();
            cbm.removeAllElements();
            for (int i = 0; i < libros.size(); i++) {
                cbm.addElement(libros.get(i).getBarCode());
            }
            cb_barCodeLibroEliminar.setModel(cbm);
            pantalla_EliminarLibro.pack();
            pantalla_EliminarLibro.setLocationRelativeTo(null);
            pantalla_EliminarLibro.setAlwaysOnTop(true);
            pantalla_EliminarLibro.setVisible(true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_menuItem_edLibriActionPerformed

    private void cb_barCodeLibroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_barCodeLibroItemStateChanged
        try {
            tf_nombreLibro.setText(nombresLibros.get(cb_barCodeLibro.getSelectedIndex()));
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_cb_barCodeLibroItemStateChanged

    private void cb_barCodeLibroEliminarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_barCodeLibroEliminarItemStateChanged
        try {
            for (Libro l : libros) {
                if (l.getBarCode().equals(cb_barCodeLibroEliminar.getSelectedItem().toString())) {
                    tf_nombreLibroDelete.setText(l.getNombre());
                    break;
                }
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_cb_barCodeLibroEliminarItemStateChanged

    private void menuItem_agregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_agregarLibroActionPerformed
        if (fichero.isFile()) {
            try {
                FileReader fr = null;
                fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
                String linea = "";
                DefaultComboBoxModel cbm = (DefaultComboBoxModel) cb_barCodeLibro.getModel();
                cbm.removeAllElements();
                while ((linea = br.readLine()) != null) {
                    try {
                        String datos[] = linea.split(",");
                        barCodes.add(datos[0]);
                        nombresLibros.add(datos[1]);
                        cbm.addElement(datos[0]);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "El archivo cargado no tiene el formato estipulado", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                cb_barCodeLibro.setModel(cbm);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        pantalla_CreacionLibro.pack();
        pantalla_CreacionLibro.setLocationRelativeTo(null);
        pantalla_CreacionLibro.setAlwaysOnTop(true);
        pantalla_CreacionLibro.setVisible(true);
    }//GEN-LAST:event_menuItem_agregarLibroActionPerformed

    private void jb_deleteLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_deleteLibroActionPerformed
        pantalla_EliminarLibro.setVisible(false);
        int opc = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar el libro seleccionado?", "AVISO", JOptionPane.YES_NO_CANCEL_OPTION);
        if (opc == JOptionPane.YES_OPTION) {
            libros.remove(cb_barCodeLibroEliminar.getSelectedIndex());
            ca.conectar();
            System.out.println(cb_barCodeLibroEliminar.getSelectedItem().toString());
            try {
                ca.query.execute("delete from Libros where Codigo='" + cb_barCodeLibroEliminar.getSelectedItem().toString() + "'");
                ca.commit();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            ca.desconectar();
            JOptionPane.showMessageDialog(null, "El libro ha sido eliminado del sistema");
        } else {
            JOptionPane.showMessageDialog(null, "El libro no ha sido eliminado del sistema");
        }
    }//GEN-LAST:event_jb_deleteLibroActionPerformed

    private void menuItem_readLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_readLibrosActionPerformed
        try {
            DefaultTableModel tm = (DefaultTableModel) t_listLibros.getModel();
            while (tm.getRowCount() > 0) {
                tm.removeRow(0);
            }
            for (Libro l : libros) {
                Object datos[] = new Object[5];
                datos[1] = l.getNombre();
                datos[0] = l.getBarCode();
                datos[2] = l.getMateria();
                datos[3] = l.getDescripcion();
                datos[4] = l.getGrado();
                tm.addRow(datos);
            }
            t_listLibros.setModel(tm);
            jd_listaLibros.pack();
            jd_listaLibros.setModal(true);
            jd_listaLibros.setLocationRelativeTo(null);
            jd_listaLibros.setVisible(true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_menuItem_readLibrosActionPerformed

    private void cb_FiltroMateriaListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_FiltroMateriaListItemStateChanged
        try {
            DefaultTableModel tm = (DefaultTableModel) t_listLibros.getModel();
            int aux = tm.getRowCount();
            while (tm.getRowCount() > 0) {
                tm.removeRow(0);
            }
            if (cb_FiltroMateriaList.getSelectedItem().equals("Todos las materias") && cb_listLibroGrado.getSelectedItem().equals("TODOS")) {
                for (Libro l : libros) {
                    Object datos[] = new Object[5];
                    datos[1] = l.getNombre();
                    datos[0] = l.getBarCode();
                    datos[2] = l.getMateria();
                    datos[3] = l.getDescripcion();
                    datos[4] = l.getGrado();
                    tm.addRow(datos);
                }
            } else if (cb_FiltroMateriaList.getSelectedItem().equals("Todos las materias")) {
                int filtroGrado = Character.getNumericValue(cb_listLibroGrado.getSelectedItem().toString().charAt(0));
                for (Libro l : libros) {
                    if (filtroGrado == l.getGrado()) {
                        Object datos[] = new Object[5];
                        datos[1] = l.getNombre();
                        datos[0] = l.getBarCode();
                        datos[2] = l.getMateria();
                        datos[3] = l.getDescripcion();
                        datos[4] = l.getGrado();
                        tm.addRow(datos);
                    }
                }
            } else if (cb_selectorGradoLista.getSelectedItem().equals("TODOS")) {
                for (Libro l : libros) {
                    if (l.getMateria().equals(cb_FiltroMateriaList.getSelectedItem().toString())) {
                        Object datos[] = new Object[5];
                        datos[1] = l.getNombre();
                        datos[0] = l.getBarCode();
                        datos[2] = l.getMateria();
                        datos[3] = l.getDescripcion();
                        datos[4] = l.getGrado();
                        tm.addRow(datos);
                    }
                }
            } else {
                int filtroGrado = Character.getNumericValue(cb_listLibroGrado.getSelectedItem().toString().charAt(0));
                for (Libro l : libros) {
                    if (l.getMateria().equals(cb_FiltroMateriaList.getSelectedItem().toString()) && filtroGrado == l.getGrado()) {
                        Object datos[] = new Object[5];
                        datos[1] = l.getNombre();
                        datos[0] = l.getBarCode();
                        datos[2] = l.getMateria();
                        datos[3] = l.getDescripcion();
                        datos[4] = l.getGrado();
                        tm.addRow(datos);
                    }
                }
            }
            t_listLibros.setModel(tm);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_cb_FiltroMateriaListItemStateChanged

    private void menuItem_newPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_newPrestamoActionPerformed
        try {
            DefaultComboBoxModel cbm = (DefaultComboBoxModel) cb_alumnoSolictante.getModel();
            DefaultComboBoxModel cbm2 = (DefaultComboBoxModel) cb_maestroSolictante.getModel();
            DefaultComboBoxModel cbm3 = (DefaultComboBoxModel) cb_idLibroPrestar.getModel();
            cbm.removeAllElements();
            cbm2.removeAllElements();
            cbm3.removeAllElements();
            for (Libro l : libros) {
                cbm3.addElement(l.getBarCode());
            }
            for (Alumno a : alumnos) {
                cbm.addElement(a.getId());
            }
            for (Maestro m : maestros) {
                cbm2.addElement(m.getId());
            }
            cb_alumnoSolictante.setModel(cbm);
            cb_maestroSolictante.setModel(cbm2);
            cb_idLibroPrestar.setModel(cbm3);
            pantalla_prestamos.pack();
            pantalla_prestamos.setLocationRelativeTo(null);
            pantalla_prestamos.setVisible(true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_menuItem_newPrestamoActionPerformed

    private void menuItem_devolverLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_devolverLibroActionPerformed
        try {
            DefaultComboBoxModel cbm = (DefaultComboBoxModel) cb_idEntregaPrestamoLibro.getModel();
            cbm.removeAllElements();
            for (Prestamo p : prestamos) {
                cbm.addElement(p.getIdEntrega());
            }
            cb_idEntregaPrestamoLibro.setModel(cbm);
            pantalla_devolucion.pack();
            pantalla_devolucion.setLocationRelativeTo(null);
            pantalla_devolucion.setVisible(true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_menuItem_devolverLibroActionPerformed

    private void menuItem_createAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_createAlumnoActionPerformed
        JOptionPane.showMessageDialog(null, "Para Preparatoria, ingrese 0 en el apartado de 'Grado'", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        creacion_alumno.pack();
        creacion_alumno.setLocationRelativeTo(null);
        creacion_alumno.setAlwaysOnTop(true);
        creacion_alumno.setVisible(true);
    }//GEN-LAST:event_menuItem_createAlumnoActionPerformed

    private void jb_newAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_newAlumnoActionPerformed
        creacion_alumno.setVisible(false);
        String nombre = tf_nombreAlumno.getText();
        int grado = Integer.parseInt(js_grado.getValue().toString());
        int id = alumnos.size() + 1;
        Alumno a = new Alumno(nombre, id, grado);
        int opc = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el sistema con el registro de: " + nombre + "?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
        if (opc == JOptionPane.YES_OPTION) {
            ca.conectar();
            try {
                ca.query.execute("INSERT INTO Alumnos"
                        + " (Id, Nombre, Grado)"
                        + " VALUES ('" + id + "', '" + nombre + "', '" + grado + "')");
                ca.commit();
                JOptionPane.showMessageDialog(null, "Registro ingresado al sistema", "HECHO", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "El miembro del personal no no ha sido ingresado al sistema. Revise sus datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            alumnos.add(a);
            ca.desconectar();
        }
    }//GEN-LAST:event_jb_newAlumnoActionPerformed

    private void menuItem_createMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_createMaestroActionPerformed
        creacionMaestro.pack();
        creacionMaestro.setLocationRelativeTo(null);
        creacionMaestro.setAlwaysOnTop(true);
        creacionMaestro.setVisible(true);
    }//GEN-LAST:event_menuItem_createMaestroActionPerformed

    private void menuItem_listAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_listAlumnosActionPerformed
        DefaultTableModel tm = (DefaultTableModel) tb_listAlumnos.getModel();
        while (tm.getRowCount() > 0) {
            tm.removeRow(0);
        }
        for (Alumno a : alumnos) {
            Object datos[] = new Object[3];
            datos[0] = a.getNombre();
            switch (a.getGrado()) {
                case 0:
                    datos[1] = "Preparatoria";
                    break;
                case 1:
                    datos[1] = "Primero";
                    break;
                case 2:
                    datos[1] = "Segundo";
                    break;
                case 3:
                    datos[1] = "Tercero";
                    break;
                case 4:
                    datos[1] = "Cuarto";
                    break;
                case 5:
                    datos[1] = "Quinto";
                    break;
                case 6:
                    datos[1] = "Sexto";
                    break;
                case 7:
                    datos[1] = "Septimo";
                    break;
                case 8:
                    datos[1] = "Octavo";
                    break;
                case 9:
                    datos[1] = "Noveno";
                    break;
                default:
                    break;
            }
            datos[2] = a.getId();
            tm.addRow(datos);
        }
        tb_listAlumnos.setModel(tm);
        List_alumnos.pack();
        List_alumnos.setLocationRelativeTo(null);
        List_alumnos.setVisible(true);
    }//GEN-LAST:event_menuItem_listAlumnosActionPerformed

    private void cb_selectorGradoListaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_selectorGradoListaItemStateChanged
        int grado = cb_selectorGradoLista.getSelectedIndex();
        DefaultTableModel tm = (DefaultTableModel) tb_listAlumnos.getModel();
        while (tm.getRowCount() > 0) {
            tm.removeRow(0);
        }
        if (grado == 0) {
            for (Alumno a : alumnos) {
                Object datos[] = new Object[3];
                datos[0] = a.getNombre();
                switch (a.getGrado()) {
                    case 0:
                        datos[1] = "Preparatoria";
                        break;
                    case 1:
                        datos[1] = "Primero";
                        break;
                    case 2:
                        datos[1] = "Segundo";
                        break;
                    case 3:
                        datos[1] = "Tercero";
                        break;
                    case 4:
                        datos[1] = "Cuarto";
                        break;
                    case 5:
                        datos[1] = "Quinto";
                        break;
                    case 6:
                        datos[1] = "Sexto";
                        break;
                    case 7:
                        datos[1] = "Septimo";
                        break;
                    case 8:
                        datos[1] = "Octavo";
                        break;
                    case 9:
                        datos[1] = "Noveno";
                        break;
                    default:
                        break;
                }
                datos[2] = a.getId();
                tm.addRow(datos);
            }
        } else if (cb_selectorGradoLista.getSelectedItem().toString().equals("Preparatoria")) {
            for (Alumno a : alumnos) {
                if (a.getGrado() == 0) {
                    Object datos[] = new Object[3];
                    datos[0] = a.getNombre();
                    switch (a.getGrado()) {
                        case 0:
                            datos[1] = "Preparatoria";
                            break;
                        case 1:
                            datos[1] = "Primero";
                            break;
                        case 2:
                            datos[1] = "Segundo";
                            break;
                        case 3:
                            datos[1] = "Tercero";
                            break;
                        case 4:
                            datos[1] = "Cuarto";
                            break;
                        case 5:
                            datos[1] = "Quinto";
                            break;
                        case 6:
                            datos[1] = "Sexto";
                            break;
                        case 7:
                            datos[1] = "Septimo";
                            break;
                        case 8:
                            datos[1] = "Octavo";
                            break;
                        case 9:
                            datos[1] = "Noveno";
                            break;
                        default:
                            break;
                    }
                    datos[2] = a.getId();
                    tm.addRow(datos);
                }
            }
        } else {
            for (Alumno a : alumnos) {
                if (a.getGrado() == grado) {
                    Object datos[] = new Object[3];
                    datos[0] = a.getNombre();
                    switch (a.getGrado()) {
                        case 0:
                            datos[1] = "Preparatoria";
                            break;
                        case 1:
                            datos[1] = "Primero";
                            break;
                        case 2:
                            datos[1] = "Segundo";
                            break;
                        case 3:
                            datos[1] = "Tercero";
                            break;
                        case 4:
                            datos[1] = "Cuarto";
                            break;
                        case 5:
                            datos[1] = "Quinto";
                            break;
                        case 6:
                            datos[1] = "Sexto";
                            break;
                        case 7:
                            datos[1] = "Septimo";
                            break;
                        case 8:
                            datos[1] = "Octavo";
                            break;
                        case 9:
                            datos[1] = "Noveno";
                            break;
                        default:
                            break;
                    }
                    datos[2] = a.getId();
                    tm.addRow(datos);
                }
            }
        }
    }//GEN-LAST:event_cb_selectorGradoListaItemStateChanged

    private void menuItem_listMaestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_listMaestrosActionPerformed
        DefaultTableModel tm = (DefaultTableModel) tb_listMaestros.getModel();
        while (tm.getRowCount() > 0) {
            tm.removeRow(0);
        }
        for (Maestro m : maestros) {
            Object datos[] = new Object[7];
            datos[0] = m.getId();
            datos[1] = m.getNombre();
            datos[2] = m.getCargo();
            datos[3] = m.getCorreo();
            datos[4] = m.getHorario();
            datos[5] = m.getContacto1();
            datos[6] = m.getContacto2();
            tm.addRow(datos);
        }
        tb_listMaestros.setModel(tm);
        listMaestros.pack();
        listMaestros.setLocationRelativeTo(null);
        listMaestros.setVisible(true);
    }//GEN-LAST:event_menuItem_listMaestrosActionPerformed

    private void cb_listLibroGradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_listLibroGradoItemStateChanged
        try {
            DefaultTableModel tm = (DefaultTableModel) t_listLibros.getModel();
            int aux = tm.getRowCount();
            while (tm.getRowCount() > 0) {
                tm.removeRow(0);
            }
            if (cb_FiltroMateriaList.getSelectedItem().equals("Todos las materias") && cb_listLibroGrado.getSelectedItem().equals("TODOS")) {
                for (Libro l : libros) {
                    Object datos[] = new Object[5];
                    datos[1] = l.getNombre();
                    datos[0] = l.getBarCode();
                    datos[2] = l.getMateria();
                    datos[3] = l.getDescripcion();
                    datos[4] = l.getGrado();
                    tm.addRow(datos);
                }
            } else if (cb_FiltroMateriaList.getSelectedItem().equals("Todos las materias")) {
                int filtroGrado = Character.getNumericValue(cb_listLibroGrado.getSelectedItem().toString().charAt(0));
                for (Libro l : libros) {
                    if (filtroGrado == l.getGrado()) {
                        Object datos[] = new Object[5];
                        datos[1] = l.getNombre();
                        datos[0] = l.getBarCode();
                        datos[2] = l.getMateria();
                        datos[3] = l.getDescripcion();
                        datos[4] = l.getGrado();
                        tm.addRow(datos);
                    }
                }
            } else if (cb_selectorGradoLista.getSelectedItem().equals("TODOS")) {
                for (Libro l : libros) {
                    if (l.getMateria().equals(cb_FiltroMateriaList.getSelectedItem().toString())) {
                        Object datos[] = new Object[5];
                        datos[1] = l.getNombre();
                        datos[0] = l.getBarCode();
                        datos[2] = l.getMateria();
                        datos[3] = l.getDescripcion();
                        datos[4] = l.getGrado();
                        tm.addRow(datos);
                    }
                }
            } else {
                int filtroGrado = Character.getNumericValue(cb_listLibroGrado.getSelectedItem().toString().charAt(0));
                for (Libro l : libros) {
                    if (l.getMateria().equals(cb_FiltroMateriaList.getSelectedItem().toString()) && filtroGrado == l.getGrado()) {
                        Object datos[] = new Object[5];
                        datos[1] = l.getNombre();
                        datos[0] = l.getBarCode();
                        datos[2] = l.getMateria();
                        datos[3] = l.getDescripcion();
                        datos[4] = l.getGrado();
                        tm.addRow(datos);
                    }
                }
            }
            t_listLibros.setModel(tm);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_cb_listLibroGradoItemStateChanged

    private void jb_crearPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearPrestamoActionPerformed
        Random r = new Random();
        int IdEntrega = 99999 + r.nextInt(90000);
        String tipoSolicitante = "";
        int id = 0;
        if (rb_alumnoSolicitante.isSelected()) {
            id = Integer.valueOf(cb_alumnoSolictante.getSelectedItem().toString());
            tipoSolicitante = "Alumno";
        } else {
            id = Integer.valueOf(cb_maestroSolictante.getSelectedItem().toString());
            tipoSolicitante = "Personal";
        }
        String codBarrasLibroPrestar = cb_idLibroPrestar.getSelectedItem().toString();
        Date fechaMaximaDevolucion = jd_fechaMaximaDevoluion.getDate();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        String fechaInsertar = format.format(fechaMaximaDevolucion);
        ca.conectar();
        try {
            ca.query.execute("INSERT INTO Prestamos"
                    + " (IdEntrega, IdSolicitante, CodigoLibro, FechaMaximaDevolucion, TipoSolicitante)"
                    + " VALUES ('" + IdEntrega + "', '" + id + "', '" + codBarrasLibroPrestar + "', #" + fechaInsertar + "#, '" + tipoSolicitante + "')");
            ca.commit();
            JOptionPane.showMessageDialog(null, "Se ha ingresado con exito el siguiente prestamo con ID de entrega: " + IdEntrega);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El libro no ha sido ingresado en el sistema. Revise sus datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        ca.desconectar();
    }//GEN-LAST:event_jb_crearPrestamoActionPerformed

    private void jb_crearMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearMaestroActionPerformed
        creacionMaestro.setVisible(false);
        String nombre = tf_NombreNuevoMaestro.getText();
        String cargo = tf_cargoNuevoMaestro.getText();
        String correo = tf_correoNuevoMaestro.getText();
        String contacto1 = tf_newNumero1.getText();
        String contacto2 = tf_newNumero2.getText();
        String horario = ta_horarioNewMaestro.getText();
        int id = maestros.size() + 1;
        Maestro m = new Maestro(nombre, id, cargo, correo, horario, contacto1, contacto2);
        maestros.add(m);
        int opc = JOptionPane.showConfirmDialog(null, "Personal ingresado al sistema. ¿Desea actualizar la base de datos con el nuevo registro de " + nombre + "?", "AVISO", JOptionPane.YES_NO_OPTION);
        if (opc == JOptionPane.YES_OPTION) {
            ca.conectar();
            try {
                ca.query.executeUpdate("INSERT INTO Personal"
                        + " (Id, Nombre, Servicio, Contacto1, Contacto2, Correo, Horario)"
                        + " VALUES ('" + id + "', '" + nombre + "', '" + cargo + "', '" + contacto1 + "', '" + contacto2 + "', '" + correo + "', '" + horario + "')");
                ca.commit();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado, revise los datos ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            ca.desconectar();
        }
    }//GEN-LAST:event_jb_crearMaestroActionPerformed

    private void rb_alumnoSolicitanteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_alumnoSolicitanteItemStateChanged
        if (rb_alumnoSolicitante.isSelected()) {
            cb_alumnoSolictante.setEnabled(true);
        } else {
            cb_alumnoSolictante.setEnabled(false);
        }
    }//GEN-LAST:event_rb_alumnoSolicitanteItemStateChanged

    private void rb_maestroSolicitanteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_maestroSolicitanteItemStateChanged
        if (rb_maestroSolicitante.isSelected()) {
            cb_maestroSolictante.setEnabled(true);
        } else {
            cb_maestroSolictante.setEnabled(false);
        }
    }//GEN-LAST:event_rb_maestroSolicitanteItemStateChanged

    private void cb_alumnoSolictanteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_alumnoSolictanteItemStateChanged
        try {
            int id = Integer.valueOf(cb_alumnoSolictante.getSelectedItem().toString());
            if (cb_alumnoSolictante.isEnabled()) {
                for (Alumno a : alumnos) {
                    if (a.getId() == id) {
                        tf_nombreSolicitante.setText(a.getNombre());
                        break;
                    }
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cb_alumnoSolictanteItemStateChanged

    private void cb_maestroSolictanteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_maestroSolictanteItemStateChanged
        try {
            int id = Integer.valueOf(cb_maestroSolictante.getSelectedItem().toString());
            if (cb_maestroSolictante.isEnabled()) {
                for (Maestro m : maestros) {
                    if (m.getId() == id) {
                        tf_nombreSolicitante.setText(m.getNombre());
                        break;
                    }
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cb_maestroSolictanteItemStateChanged

    private void cb_idLibroPrestarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_idLibroPrestarItemStateChanged
        for (Libro l : libros) {
            if (l.getBarCode().equals(cb_idLibroPrestar.getSelectedItem().toString())) {
                tf_nombreLibroPrestar.setText(l.getNombre());
                break;
            }
        }
    }//GEN-LAST:event_cb_idLibroPrestarItemStateChanged

    private void cb_idEntregaPrestamoLibroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_idEntregaPrestamoLibroItemStateChanged
        for (Prestamo p : prestamos) {
            if (Integer.parseInt(cb_idEntregaPrestamoLibro.getSelectedItem().toString()) == p.getIdEntrega()) {
                tf_codBarrasLibroEntregado.setText(p.getCodBarrasLibroPrestado());
                if (p.getTipoSolicitante().equals("Personal")) {
                    for (Maestro m : maestros) {
                        if (m.getId() == p.getIdSolictante()) {
                            tf_entregadoPor.setText(m.getNombre());
                        }
                    }
                } else if (p.getTipoSolicitante().equals("Alumno")) {
                    for (Alumno a : alumnos) {
                        if (a.getId() == p.getIdSolictante()) {
                            tf_entregadoPor.setText(a.getNombre());
                        }
                    }
                }
                break;
            }
        }
    }//GEN-LAST:event_cb_idEntregaPrestamoLibroItemStateChanged

    private void jb_entregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_entregarLibroActionPerformed
        ca.conectar();
        Date fechaEntragado = jdc_entregaFinal.getDate();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        int idEntrega = Integer.parseInt(cb_idEntregaPrestamoLibro.getSelectedItem().toString());
        String fechaEntrega = format.format(fechaEntragado);
        try {
            ca.query.execute("update Prestamos set FechaDevolucion=#" + fechaEntrega + "# where IdEntrega=" + idEntrega);
            ca.commit();
            JOptionPane.showMessageDialog(null, "Entrega actualizada con éxito", "REALIZADO", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La devolucion no ha sido actualizada del sistema. Revise sus datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        ca.desconectar();
    }//GEN-LAST:event_jb_entregarLibroActionPerformed

    private void menuItem_modAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_modAlumnoActionPerformed
        DefaultComboBoxModel cbm = (DefaultComboBoxModel) cb_idModAlumno.getModel();
        cbm.removeAllElements();
        for (Alumno a : alumnos) {
            cbm.addElement(a.getId());
        }
        pantalla_ActualizarAlumno.pack();
        pantalla_ActualizarAlumno.setLocationRelativeTo(null);
        pantalla_ActualizarAlumno.setAlwaysOnTop(true);
        pantalla_ActualizarAlumno.setVisible(true);
    }//GEN-LAST:event_menuItem_modAlumnoActionPerformed

    private void jb_modAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modAlumnoActionPerformed
        int gradoActualizar = Integer.parseInt(js_modAlumno.getValue().toString());
        int idAlumno = Integer.parseInt(cb_idModAlumno.getSelectedItem().toString());
        String name = tf_nombreAlumnoEdit.getText();
        pantalla_ActualizarAlumno.setVisible(false);
        ca.conectar();
        try {
            ca.query.execute("update Alumnos set Grado=" + gradoActualizar + " where Id = " + idAlumno);
            ca.query.execute("update Alumnos set Nombre='" + name + "' where Id = " + idAlumno);
            ca.commit();
            JOptionPane.showMessageDialog(null, "Alumno actualizado con éxito", "REALIZADO", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El alumno no ha sido actualizado en el sistema", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        ca.desconectar();
    }//GEN-LAST:event_jb_modAlumnoActionPerformed

    private void cb_idModAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_idModAlumnoItemStateChanged
        int id = Integer.parseInt(cb_idModAlumno.getSelectedItem().toString());
        for (Alumno a : alumnos) {
            if (a.getId() == id) {
                tf_nombreAlumnoEdit.setText(a.getNombre());
                js_modAlumno.setValue(a.getId());
            }
        }
    }//GEN-LAST:event_cb_idModAlumnoItemStateChanged

    private void jb_eliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarAlumnoActionPerformed
        pantalla_ActualizarAlumno.setVisible(false);
        int idAlumno = Integer.parseInt(cb_idModAlumno.getSelectedItem().toString());
        ca.conectar();
        try {
            ca.query.execute("delete from Alumnos where Id=" + idAlumno);
            ca.commit();
            JOptionPane.showMessageDialog(null, "El alumno ha sido eliminado del sistema", "REALIZADO", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "El alumno no ha sido eliminado del sistema", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        ca.desconectar();
    }//GEN-LAST:event_jb_eliminarAlumnoActionPerformed

    private void menuItem_modMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_modMaestroActionPerformed
        DefaultComboBoxModel cbm = (DefaultComboBoxModel) cb_idModMaestro.getModel();
        cbm.removeAllElements();
        for (Maestro m : maestros) {
            cbm.addElement(m.getId());
        }
        pantalla_modMaestro.pack();
        pantalla_modMaestro.setLocationRelativeTo(null);
        pantalla_modMaestro.setAlwaysOnTop(true);
        pantalla_modMaestro.setVisible(true);
    }//GEN-LAST:event_menuItem_modMaestroActionPerformed

    private void cb_idModMaestroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_idModMaestroItemStateChanged
        int id = Integer.parseInt(cb_idModMaestro.getSelectedItem().toString());
        for (Maestro m : maestros) {
            if (m.getId() == id) {
                tf_nombreModMaestro.setText(m.getNombre());
                tf_cargoModMaestro.setText(m.getCargo());
                tf_correoModMaestro.setText(m.getCorreo());
                tf_numero1mod.setText(m.getContacto1());
                tf_numero2mod.setText(m.getContacto2());
                ta_modHorario.setText(m.getHorario());
            }
        }
    }//GEN-LAST:event_cb_idModMaestroItemStateChanged

    private void jb_actualizarMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizarMaestroActionPerformed
        pantalla_modMaestro.setVisible(false);
        String nombreMod = tf_nombreModMaestro.getText();
        String cargoMod = tf_cargoModMaestro.getText();
        String correoMod = tf_correoModMaestro.getText();
        String numero1Mod = tf_numero1mod.getText();
        String numero2mod = tf_numero2mod.getText();
        String horarioMod = ta_modHorario.getText();
        int id = Integer.parseInt(cb_idModMaestro.getSelectedItem().toString());
        pantalla_ActualizarAlumno.setVisible(false);
        ca.conectar();
        try {
            ca.query.execute("update Personal set Nombre='" + nombreMod + "' where Id = " + id);
            ca.query.execute("update Personal set Servicio='" + cargoMod + "' where Id = " + id);
            ca.query.execute("update Personal set Correo='" + correoMod + "' where Id = " + id);
            ca.query.execute("update Personal set Contacto1='" + numero1Mod + "' where Id = " + id);
            ca.query.execute("update Personal set Contacto2='" + numero2mod + "' where Id = " + id);
            ca.query.execute("update Personal set Horario='" + horarioMod + "' where Id = " + id);
            ca.commit();
            JOptionPane.showMessageDialog(null, "Personal actualizado con éxito", "REALIZADO", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, revise sus operaciones", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        ca.desconectar();
    }//GEN-LAST:event_jb_actualizarMaestroActionPerformed

    private void jb_eliminarMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarMaestroActionPerformed
        int id = Integer.parseInt(cb_idModMaestro.getSelectedItem().toString());
        try {
            ca.query.execute("delete from Personal where Id=" + id);
            ca.commit();
            JOptionPane.showMessageDialog(null, "El miembro del personal ha sido eliminado del sistema", "REALIZADO", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El miembro del personal no ha sido eliminado del sistema", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        ca.desconectar();
    }//GEN-LAST:event_jb_eliminarMaestroActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame List_alumnos;
    private javax.swing.JComboBox<String> cb_FiltroMateriaList;
    private javax.swing.JComboBox<String> cb_Materia;
    private javax.swing.JComboBox<String> cb_alumnoSolictante;
    private javax.swing.JComboBox<String> cb_barCodeLibro;
    private javax.swing.JComboBox<String> cb_barCodeLibroEliminar;
    private javax.swing.JComboBox<String> cb_idEntregaPrestamoLibro;
    private javax.swing.JComboBox<String> cb_idLibroPrestar;
    private javax.swing.JComboBox<String> cb_idModAlumno;
    private javax.swing.JComboBox<String> cb_idModMaestro;
    private javax.swing.JComboBox<String> cb_listLibroGrado;
    private javax.swing.JComboBox<String> cb_maestroSolictante;
    private javax.swing.JComboBox<String> cb_selectorGradoLista;
    private javax.swing.JFrame creacionMaestro;
    private javax.swing.JFrame creacion_alumno;
    private javax.swing.ButtonGroup grupo_maestroAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jb_actualizarMaestro;
    private javax.swing.JButton jb_añadirLibro_A_Inventario;
    private javax.swing.JButton jb_crearMaestro;
    private javax.swing.JButton jb_crearPrestamo;
    private javax.swing.JButton jb_deleteLibro;
    private javax.swing.JButton jb_eliminarAlumno;
    private javax.swing.JButton jb_eliminarMaestro;
    private javax.swing.JButton jb_entregarLibro;
    private javax.swing.JButton jb_modAlumno;
    private javax.swing.JButton jb_newAlumno;
    private com.toedter.calendar.JDateChooser jd_fechaMaximaDevoluion;
    private javax.swing.JDialog jd_listaLibros;
    private com.toedter.calendar.JDateChooser jdc_entregaFinal;
    private javax.swing.JSpinner js_grado;
    private javax.swing.JSpinner js_gradoCreacionLibro;
    private javax.swing.JSpinner js_modAlumno;
    private javax.swing.JFrame listMaestros;
    private javax.swing.JMenu menuAlumno;
    private javax.swing.JMenuItem menuItem_agregarLibro;
    private javax.swing.JMenuItem menuItem_createAlumno;
    private javax.swing.JMenuItem menuItem_createMaestro;
    private javax.swing.JMenuItem menuItem_devolverLibro;
    private javax.swing.JMenuItem menuItem_edLibri;
    private javax.swing.JMenuItem menuItem_listAlumnos;
    private javax.swing.JMenuItem menuItem_listMaestros;
    private javax.swing.JMenuItem menuItem_loadCSV;
    private javax.swing.JMenuItem menuItem_modAlumno;
    private javax.swing.JMenuItem menuItem_modMaestro;
    private javax.swing.JMenuItem menuItem_newPrestamo;
    private javax.swing.JMenuItem menuItem_readLibros;
    private javax.swing.JMenuItem menuItem_readLibrosLectura;
    private javax.swing.JMenu menuLibro;
    private javax.swing.JMenu menuPrestamos;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JMenu menu_readLibros;
    private javax.swing.JFrame pantalla_ActualizarAlumno;
    private javax.swing.JFrame pantalla_CreacionLibro;
    private javax.swing.JFrame pantalla_EliminarLibro;
    private javax.swing.JFrame pantalla_devolucion;
    private javax.swing.JFrame pantalla_modMaestro;
    private javax.swing.JFrame pantalla_prestamos;
    private javax.swing.JRadioButton rb_alumnoSolicitante;
    private javax.swing.JRadioButton rb_maestroSolicitante;
    private javax.swing.JTable t_listLibros;
    private javax.swing.JTextArea ta_descrpcionLibro;
    private javax.swing.JTextArea ta_horarioNewMaestro;
    private javax.swing.JTextArea ta_modHorario;
    private javax.swing.JTable tb_listAlumnos;
    private javax.swing.JTable tb_listMaestros;
    private javax.swing.JTextField tf_NombreNuevoMaestro;
    private javax.swing.JTextField tf_cargoModMaestro;
    private javax.swing.JTextField tf_cargoNuevoMaestro;
    private javax.swing.JTextField tf_codBarrasLibroEntregado;
    private javax.swing.JTextField tf_correoModMaestro;
    private javax.swing.JTextField tf_correoNuevoMaestro;
    private javax.swing.JTextField tf_entregadoPor;
    private javax.swing.JTextField tf_newNumero1;
    private javax.swing.JTextField tf_newNumero2;
    private javax.swing.JTextField tf_nombreAlumno;
    private javax.swing.JTextField tf_nombreAlumnoEdit;
    private javax.swing.JTextField tf_nombreLibro;
    private javax.swing.JTextField tf_nombreLibroDelete;
    private javax.swing.JTextField tf_nombreLibroPrestar;
    private javax.swing.JTextField tf_nombreModMaestro;
    private javax.swing.JTextField tf_nombreSolicitante;
    private javax.swing.JTextField tf_numero1mod;
    private javax.swing.JTextField tf_numero2mod;
    // End of variables declaration//GEN-END:variables
    private File fichero = null;
    private ArrayList<String> barCodes = new ArrayList<>();
    private ArrayList<String> nombresLibros = new ArrayList<>();
    private ArrayList<Libro> libros = new ArrayList<>();
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private ArrayList<Maestro> maestros = new ArrayList<>();
    private ArrayList<Prestamo> prestamos = new ArrayList<>();
    private ConexionAccess ca = new ConexionAccess("C://Linda_Possing_Christhian_School.accdb");
}
