package protitipo_aplicacion_innovatec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
        pantalla_EliminarLibro = new javax.swing.JFrame();
        cb_barCodeLibroEliminar = new javax.swing.JComboBox<>();
        tf_nombreLibroDelete = new javax.swing.JTextField();
        jb_deleteLibro = new javax.swing.JButton();
        jd_listaLibros = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_listLibros = new javax.swing.JTable();
        cb_FiltroMateriaList = new javax.swing.JComboBox<>();
        cb_listLibroGrado = new javax.swing.JComboBox<>();
        pantalla_prestamos = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rb_maestroSolicitante = new javax.swing.JRadioButton();
        rb_alumnoSolicitante = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jb_crearPrestamo = new javax.swing.JButton();
        jc_alumnoSolictante = new javax.swing.JComboBox<>();
        cb_maestroSolictante = new javax.swing.JComboBox<>();
        tf_nombreSolicitante = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        pantalla_devolucion = new javax.swing.JFrame();
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
        grupo_maestroAlumno = new javax.swing.ButtonGroup();
        listMaestros = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_listMaestros = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
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

        cb_barCodeLibro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_barCodeLibroItemStateChanged(evt);
            }
        });

        jLabel1.setText("Codigo de Libro");

        tf_nombreLibro.setEditable(false);

        cb_Materia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Math", "Reading", "Spelling", "Language", "Social Studies", "Arts", "Spanish", "History", "Computer", "Science", "Civics", "Otras..." }));

        ta_descrpcionLibro.setColumns(20);
        ta_descrpcionLibro.setRows(5);
        jScrollPane1.setViewportView(ta_descrpcionLibro);

        jLabel2.setText("Descripcion del Libro");

        jb_añadirLibro_A_Inventario.setText("Añadir");
        jb_añadirLibro_A_Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_añadirLibro_A_InventarioActionPerformed(evt);
            }
        });

        js_gradoCreacionLibro.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));

        jLabel11.setText("GRADO");

        javax.swing.GroupLayout pantalla_CreacionLibroLayout = new javax.swing.GroupLayout(pantalla_CreacionLibro.getContentPane());
        pantalla_CreacionLibro.getContentPane().setLayout(pantalla_CreacionLibroLayout);
        pantalla_CreacionLibroLayout.setHorizontalGroup(
            pantalla_CreacionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_CreacionLibroLayout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jb_añadirLibro_A_Inventario)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_CreacionLibroLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(pantalla_CreacionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_CreacionLibroLayout.createSequentialGroup()
                        .addGroup(pantalla_CreacionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_CreacionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pantalla_CreacionLibroLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(69, 69, 69)
                                    .addComponent(cb_barCodeLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(tf_nombreLibro)
                                .addComponent(cb_Materia, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_CreacionLibroLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(41, 41, 41)
                                .addComponent(js_gradoCreacionLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_CreacionLibroLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(299, 299, 299))))
        );
        pantalla_CreacionLibroLayout.setVerticalGroup(
            pantalla_CreacionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_CreacionLibroLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pantalla_CreacionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_barCodeLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addComponent(tf_nombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(cb_Materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pantalla_CreacionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(js_gradoCreacionLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_añadirLibro_A_Inventario)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        cb_barCodeLibroEliminar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_barCodeLibroEliminarItemStateChanged(evt);
            }
        });

        tf_nombreLibroDelete.setEditable(false);

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

        cb_FiltroMateriaList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------------------------------------------------------------------", "Todos las materias", "Math", "Reading", "Spelling", "Language", "Social Studies", "Arts", "Spanish", "History", "Computer", "Science", "Civics", "Otras..." }));
        cb_FiltroMateriaList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_FiltroMateriaListItemStateChanged(evt);
            }
        });

        cb_listLibroGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------------", "TODOS", "1ero", "2do", "3ero", "4to", "5to", "6to", "7mo", "8vo", "9no" }));
        cb_listLibroGrado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_listLibroGradoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jd_listaLibrosLayout = new javax.swing.GroupLayout(jd_listaLibros.getContentPane());
        jd_listaLibros.getContentPane().setLayout(jd_listaLibrosLayout);
        jd_listaLibrosLayout.setHorizontalGroup(
            jd_listaLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listaLibrosLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jd_listaLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_listaLibrosLayout.createSequentialGroup()
                        .addGroup(jd_listaLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_FiltroMateriaList, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_listLibroGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_listaLibrosLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jd_listaLibrosLayout.setVerticalGroup(
            jd_listaLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_listaLibrosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cb_FiltroMateriaList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cb_listLibroGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel8.setText("Solicitante:");

        jLabel10.setText("Fecha de devolucion maxima:");

        grupo_maestroAlumno.add(rb_maestroSolicitante);
        rb_maestroSolicitante.setText("Maestro");

        grupo_maestroAlumno.add(rb_alumnoSolicitante);
        rb_alumnoSolicitante.setText("Alumno");

        jb_crearPrestamo.setText("Ingresar Prestamo al Sistema");
        jb_crearPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearPrestamoActionPerformed(evt);
            }
        });

        tf_nombreSolicitante.setEditable(false);

        jLabel12.setText("Libro Solicitado:");

        jTextField1.setEditable(false);

        javax.swing.GroupLayout pantalla_prestamosLayout = new javax.swing.GroupLayout(pantalla_prestamos.getContentPane());
        pantalla_prestamos.getContentPane().setLayout(pantalla_prestamosLayout);
        pantalla_prestamosLayout.setHorizontalGroup(
            pantalla_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_prestamosLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jb_crearPrestamo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_prestamosLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(pantalla_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pantalla_prestamosLayout.createSequentialGroup()
                        .addGroup(pantalla_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pantalla_prestamosLayout.createSequentialGroup()
                                    .addGroup(pantalla_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_prestamosLayout.createSequentialGroup()
                                    .addComponent(rb_alumnoSolicitante)
                                    .addGap(13, 13, 13))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_prestamosLayout.createSequentialGroup()
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)))
                            .addGroup(pantalla_prestamosLayout.createSequentialGroup()
                                .addGroup(pantalla_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(pantalla_prestamosLayout.createSequentialGroup()
                                        .addGap(266, 266, 266)
                                        .addComponent(rb_maestroSolicitante)))
                                .addGap(9, 9, 9)))
                        .addGroup(pantalla_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(jTextField1)))
                    .addGroup(pantalla_prestamosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pantalla_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jc_alumnoSolictante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_maestroSolictante, 0, 182, Short.MAX_VALUE)))
                    .addComponent(tf_nombreSolicitante))
                .addGap(62, 62, 62))
        );
        pantalla_prestamosLayout.setVerticalGroup(
            pantalla_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_prestamosLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(pantalla_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantalla_prestamosLayout.createSequentialGroup()
                        .addGroup(pantalla_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_alumnoSolicitante)
                            .addComponent(jc_alumnoSolictante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pantalla_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_maestroSolicitante)
                            .addComponent(cb_maestroSolictante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_prestamosLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)))
                .addGap(27, 27, 27)
                .addComponent(tf_nombreSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pantalla_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantalla_prestamosLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(pantalla_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(jLabel10))
                    .addGroup(pantalla_prestamosLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jb_crearPrestamo)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout pantalla_devolucionLayout = new javax.swing.GroupLayout(pantalla_devolucion.getContentPane());
        pantalla_devolucion.getContentPane().setLayout(pantalla_devolucionLayout);
        pantalla_devolucionLayout.setHorizontalGroup(
            pantalla_devolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        pantalla_devolucionLayout.setVerticalGroup(
            pantalla_devolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        tf_nombreAlumno.setEditable(false);

        jLabel3.setText("Nombre:");

        jLabel4.setText("Grado:");

        js_grado.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));

        jLabel5.setText("INGRESAR NUEVO ALUMNO AL SISTEMA");

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

        tb_listAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Grado", "ID Unico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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

        jLabel6.setText("ALUMNOS EN EL SISTEMA");

        cb_selectorGradoLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "1ero", "2do", "3er", "4to", "5to", "6to", "7mo", "8vo", "9no" }));
        cb_selectorGradoLista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_selectorGradoListaItemStateChanged(evt);
            }
        });

        jLabel7.setText("Grados:");

        javax.swing.GroupLayout List_alumnosLayout = new javax.swing.GroupLayout(List_alumnos.getContentPane());
        List_alumnos.getContentPane().setLayout(List_alumnosLayout);
        List_alumnosLayout.setHorizontalGroup(
            List_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(List_alumnosLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(List_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(List_alumnosLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, List_alumnosLayout.createSequentialGroup()
                        .addGroup(List_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(List_alumnosLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(List_alumnosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cb_selectorGradoLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))))
        );
        List_alumnosLayout.setVerticalGroup(
            List_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(List_alumnosLayout.createSequentialGroup()
                .addGroup(List_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(List_alumnosLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, List_alumnosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)))
                .addComponent(cb_selectorGradoLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        tb_listMaestros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Unico", "Nombre", "Cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane4.setViewportView(tb_listMaestros);

        jLabel9.setText("MAESTROS EN SISTEMA");

        javax.swing.GroupLayout listMaestrosLayout = new javax.swing.GroupLayout(listMaestros.getContentPane());
        listMaestros.getContentPane().setLayout(listMaestrosLayout);
        listMaestrosLayout.setHorizontalGroup(
            listMaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listMaestrosLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(listMaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        listMaestrosLayout.setVerticalGroup(
            listMaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listMaestrosLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel9)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );

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
        String nombre = "", materia = "", barCode = "", descripcion = "";
        nombre = nombresLibros.get(cb_barCodeLibro.getSelectedIndex());
        materia = cb_Materia.getSelectedItem().toString();
        barCode = barCodes.get(cb_barCodeLibro.getSelectedIndex());
        descripcion = ta_descrpcionLibro.getText();
        int grado = Integer.parseInt(js_gradoCreacionLibro.getValue().toString());
        Libro l = new Libro(barCode, nombre, materia, descripcion, grado);
        pantalla_CreacionLibro.setVisible(false);
        int eleccion = JOptionPane.showConfirmDialog(null, "Libro ingresado. ¿Desea actualizar el sistema?", "ACTUALIZAR", JOptionPane.YES_NO_CANCEL_OPTION);
        if (eleccion == JOptionPane.YES_OPTION) {
            libros.add(l);
        }
    }//GEN-LAST:event_jb_añadirLibro_A_InventarioActionPerformed

    private void menuItem_edLibriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_edLibriActionPerformed
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
    }//GEN-LAST:event_menuItem_edLibriActionPerformed

    private void cb_barCodeLibroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_barCodeLibroItemStateChanged
        try {
            tf_nombreLibro.setText(nombresLibros.get(cb_barCodeLibro.getSelectedIndex()));
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_cb_barCodeLibroItemStateChanged

    private void cb_barCodeLibroEliminarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_barCodeLibroEliminarItemStateChanged
        try {
            tf_nombreLibroDelete.setText(nombresLibros.get(cb_barCodeLibroEliminar.getSelectedIndex()));
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
            JOptionPane.showMessageDialog(null, "El libro ha sido eliminado del sistema");
        } else {
            JOptionPane.showMessageDialog(null, "El libro no ha sido eliminado del sistema");
        }
    }//GEN-LAST:event_jb_deleteLibroActionPerformed

    private void menuItem_readLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_readLibrosActionPerformed
        DefaultTableModel tm = (DefaultTableModel) t_listLibros.getModel();
        for (Libro l : libros) {
            Object datos[] = new Object[5];
            datos[0] = l.getNombre();
            datos[1] = l.getBarCode();
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
        pantalla_prestamos.pack();
        pantalla_prestamos.setLocationRelativeTo(null);
        pantalla_prestamos.setVisible(true);
    }//GEN-LAST:event_menuItem_newPrestamoActionPerformed

    private void menuItem_devolverLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_devolverLibroActionPerformed
        pantalla_devolucion.pack();
        pantalla_devolucion.setLocationRelativeTo(null);
        pantalla_devolucion.setVisible(true);
    }//GEN-LAST:event_menuItem_devolverLibroActionPerformed

    private void menuItem_createAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_createAlumnoActionPerformed
        creacion_alumno.pack();
        creacion_alumno.setLocationRelativeTo(null);
        creacion_alumno.setVisible(true);
    }//GEN-LAST:event_menuItem_createAlumnoActionPerformed

    private void jb_newAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_newAlumnoActionPerformed
        String nombre = tf_nombreAlumno.getText();
        int grado = Integer.parseInt(js_grado.getValue().toString());
        int id = alumnos.size() + 1;
        Alumno a = new Alumno(nombre, String.valueOf(id), grado);
        alumnos.add(a);
    }//GEN-LAST:event_jb_newAlumnoActionPerformed

    private void menuItem_createMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_createMaestroActionPerformed
        String nombreMestro = JOptionPane.showInputDialog("Ingrese el nombre del maestro/personal administrativo a ingresar al sistema");
        int id = maestros.size();
        String cargo = JOptionPane.showInputDialog("Ingrese el cargo del maestro/personal administrativo a ingresar al sistema");
        Maestro m = new Maestro(nombreMestro, String.valueOf(id), cargo);
        maestros.add(m);
    }//GEN-LAST:event_menuItem_createMaestroActionPerformed

    private void menuItem_listAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_listAlumnosActionPerformed
        DefaultTableModel tm = (DefaultTableModel) tb_listAlumnos.getModel();
        while (tm.getRowCount() > 0) {
            tm.removeRow(0);
        }
        for (Alumno a : alumnos) {
            Object datos[] = new Object[3];
            datos[0] = a.getNombre();
            datos[1] = a.getGrado();
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
                datos[1] = a.getGrado();
                datos[2] = a.getId();
                tm.addRow(datos);
            }
        } else {
            for (Alumno a : alumnos) {
                if (a.getGrado() == grado) {
                    Object datos[] = new Object[3];
                    datos[0] = a.getNombre();
                    datos[1] = a.getGrado();
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
            Object datos[] = new Object[3];
            datos[0] = m.getId();
            datos[1] = m.getNombre();
            datos[2] = m.getCargo();
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
        int auxIdEntrega = 99999 + r.nextInt(90000);
        String idEntrega = String.valueOf(auxIdEntrega);
    }//GEN-LAST:event_jb_crearPrestamoActionPerformed

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
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox<String> cb_barCodeLibro;
    private javax.swing.JComboBox<String> cb_barCodeLibroEliminar;
    private javax.swing.JComboBox<String> cb_listLibroGrado;
    private javax.swing.JComboBox<String> cb_maestroSolictante;
    private javax.swing.JComboBox<String> cb_selectorGradoLista;
    private javax.swing.JFrame creacion_alumno;
    private javax.swing.ButtonGroup grupo_maestroAlumno;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jb_añadirLibro_A_Inventario;
    private javax.swing.JButton jb_crearPrestamo;
    private javax.swing.JButton jb_deleteLibro;
    private javax.swing.JButton jb_newAlumno;
    private javax.swing.JComboBox<String> jc_alumnoSolictante;
    private javax.swing.JDialog jd_listaLibros;
    private javax.swing.JSpinner js_grado;
    private javax.swing.JSpinner js_gradoCreacionLibro;
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
    private javax.swing.JFrame pantalla_CreacionLibro;
    private javax.swing.JFrame pantalla_EliminarLibro;
    private javax.swing.JFrame pantalla_devolucion;
    private javax.swing.JFrame pantalla_prestamos;
    private javax.swing.JRadioButton rb_alumnoSolicitante;
    private javax.swing.JRadioButton rb_maestroSolicitante;
    private javax.swing.JTable t_listLibros;
    private javax.swing.JTextArea ta_descrpcionLibro;
    private javax.swing.JTable tb_listAlumnos;
    private javax.swing.JTable tb_listMaestros;
    private javax.swing.JTextField tf_nombreAlumno;
    private javax.swing.JTextField tf_nombreLibro;
    private javax.swing.JTextField tf_nombreLibroDelete;
    private javax.swing.JTextField tf_nombreSolicitante;
    // End of variables declaration//GEN-END:variables
    private File fichero = null;
    private ArrayList<String> barCodes = new ArrayList<>();
    private ArrayList<String> nombresLibros = new ArrayList<>();
    private ArrayList<Libro> libros = new ArrayList<>();
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private ArrayList<Maestro> maestros = new ArrayList<>();
    private ArrayList<Prestamo> prestamos = new ArrayList<>();
}
