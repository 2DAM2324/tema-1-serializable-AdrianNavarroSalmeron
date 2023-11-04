/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.*;
import Controlador.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.xml.sax.SAXException;

/**
 *
 * @author Patricia Burgos
 */
public class Ventana1 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana1
     */
    public Ventana1() throws IOException, FileNotFoundException, ClassNotFoundException, NotSerializableException, SAXException {
       
        initComponents();
        jLabel_hermandad_nombre_personaje.setVisible(false);
        jLabel_hermandad_servidor_personaje.setVisible(false);
        jTextField_hermandad_nombre_personaje.setVisible(false);
        jTextField_hermandad_servidor_personaje.setVisible(false);
        jButton_hermandad_guardar_personaje.setVisible(false);
        ocultarSeccionInferiorObjeto();
        ocultarSeccionInferiorInventario();
        ocultarSeccionPersonajeAñadir();
        ocultarSeccionPersonajeModificar();
        ocultarSeccionInferiorHermandad();
        ocultarSeccionInferiorHermandadPersonaje();
        jButton_hermandad_añadir_personaje.setVisible(false);
        jButton_borrar_personaje_hermandad.setVisible(false);
    }
    
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel_hermandad = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_hermandad = new javax.swing.JTable();
        jButton_aniadir_hermandad = new javax.swing.JButton();
        jButton_modificar_hermandad = new javax.swing.JButton();
        jButton_borrar_hermandad = new javax.swing.JButton();
        jLabel_nombre_hermandad = new javax.swing.JLabel();
        jLabel_servidor_hermandad = new javax.swing.JLabel();
        jLabel_num_miembros = new javax.swing.JLabel();
        jTextField_nombre_hermandad = new javax.swing.JTextField();
        jTextField_servidor_hermandad = new javax.swing.JTextField();
        jTextField_num_miembros = new javax.swing.JTextField();
        jButton_hermandad_añadir_personaje = new javax.swing.JButton();
        jLabel_hermandad_nombre_personaje = new javax.swing.JLabel();
        jLabel_hermandad_servidor_personaje = new javax.swing.JLabel();
        jTextField_hermandad_servidor_personaje = new javax.swing.JTextField();
        jTextField_hermandad_nombre_personaje = new javax.swing.JTextField();
        jButton_hermandad_guardar_personaje = new javax.swing.JButton();
        jButton_guardar_hermandad = new javax.swing.JButton();
        jButton_cancelar_hermandad = new javax.swing.JButton();
        jButton_confirmar_modificacion_hermandad = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_personajes_hermandad = new javax.swing.JTable();
        jButton_cancelar_añadir_personaje_hermandad = new javax.swing.JButton();
        jButton_borrar_personaje_hermandad = new javax.swing.JButton();
        jPanel_personaje = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_personaje = new javax.swing.JTable();
        jLabel_nombre_persona = new javax.swing.JLabel();
        jLabel_personaje_servidor = new javax.swing.JLabel();
        jLabel_edad_persona = new javax.swing.JLabel();
        jLabel_personaje_faccion = new javax.swing.JLabel();
        jComboBox_personaje_faccion = new javax.swing.JComboBox<>();
        jTextField_personaje_nivel = new javax.swing.JTextField();
        jTextField_nombre_personaje = new javax.swing.JTextField();
        jTextField_personaje_servidor = new javax.swing.JTextField();
        jButton_guardar_personaje = new javax.swing.JButton();
        jButton_cancelar_personaje = new javax.swing.JButton();
        jButton_borrar_personaje = new javax.swing.JButton();
        jButton_modificar_personaje = new javax.swing.JButton();
        jButton_aniadir_personaje = new javax.swing.JButton();
        jLabel_personaje_raza = new javax.swing.JLabel();
        jTextField_personaje_raza = new javax.swing.JTextField();
        jLabel_personaje_nivel = new javax.swing.JLabel();
        jButton_modificar_inventario_personaje = new javax.swing.JButton();
        jLabel_personaje_id = new javax.swing.JLabel();
        jTextField_personaje_id = new javax.swing.JTextField();
        jButton_confirmar_modificacion_personaje = new javax.swing.JButton();
        jPanel_inventario = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_inventario_objetos = new javax.swing.JTable();
        jLabel_inventario_id = new javax.swing.JLabel();
        jLabel_inventario_servidor = new javax.swing.JLabel();
        jTextField_id_inventario = new javax.swing.JTextField();
        jTextField_inventario_servidor = new javax.swing.JTextField();
        jButton_vaciar_inventario = new javax.swing.JButton();
        jLabel_anio_publicacion = new javax.swing.JLabel();
        jLabel_inventario_nombre_personaje = new javax.swing.JLabel();
        jTextField_inventario_nombre_personaje = new javax.swing.JTextField();
        jButton_añadir_objeto_a_inventario = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_inventario_personaje = new javax.swing.JTable();
        jButton_borrar_objeto_inventario = new javax.swing.JButton();
        jButton_modificar_inventario_personaje_bien = new javax.swing.JButton();
        jPanel_objeto = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_objeto_objeto = new javax.swing.JTable();
        jLabel_objeto_nombre = new javax.swing.JLabel();
        jLabel_rareza_objeto = new javax.swing.JLabel();
        jLabel_precio_objeto = new javax.swing.JLabel();
        jTextField_nombre_objeto = new javax.swing.JTextField();
        jTextField_rareza_objeto = new javax.swing.JTextField();
        jTextField_precio_objeto = new javax.swing.JTextField();
        jButton_guardar_objeto = new javax.swing.JButton();
        jButton_cancelar_objeto = new javax.swing.JButton();
        jButton_aniadir_objeto = new javax.swing.JButton();
        jButton_modificar_objeto = new javax.swing.JButton();
        jButton_borrar_objeto = new javax.swing.JButton();
        jLabel_descripcion_objeto = new javax.swing.JLabel();
        jTextField_descripcion_objeto = new javax.swing.JTextField();
        jLabel_id_objeto = new javax.swing.JLabel();
        jTextField_id_objeto = new javax.swing.JTextField();
        jButton_objeto_modificar_confirmar = new javax.swing.JButton();
        jButton_confirmar_añadir_objeto_a_inventario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable_hermandad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Servidor", "Nº miembros"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jTable_hermandad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_hermandadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_hermandad);
        if (jTable_hermandad.getColumnModel().getColumnCount() > 0) {
            jTable_hermandad.getColumnModel().getColumn(0).setResizable(false);
            jTable_hermandad.getColumnModel().getColumn(1).setResizable(false);
            jTable_hermandad.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton_aniadir_hermandad.setText("Añadir");
        jButton_aniadir_hermandad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_aniadir_hermandadMouseClicked(evt);
            }
        });

        jButton_modificar_hermandad.setText("Modificar");
        jButton_modificar_hermandad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificar_hermandadActionPerformed(evt);
            }
        });

        jButton_borrar_hermandad.setText("Borrar");
        jButton_borrar_hermandad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar_hermandadActionPerformed(evt);
            }
        });

        jLabel_nombre_hermandad.setText("Nombre:");

        jLabel_servidor_hermandad.setText("Servidor:");

        jLabel_num_miembros.setText("Nº Miembros:");

        jTextField_nombre_hermandad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombre_hermandadActionPerformed(evt);
            }
        });

        jButton_hermandad_añadir_personaje.setText("Añadir Personaje");
        jButton_hermandad_añadir_personaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_hermandad_añadir_personajeMouseClicked(evt);
            }
        });

        jLabel_hermandad_nombre_personaje.setText("Nombre Personaje: ");

        jLabel_hermandad_servidor_personaje.setText("Servidor Personaje:");

        jTextField_hermandad_servidor_personaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_hermandad_servidor_personajeActionPerformed(evt);
            }
        });

        jTextField_hermandad_nombre_personaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_hermandad_nombre_personajeActionPerformed(evt);
            }
        });

        jButton_hermandad_guardar_personaje.setText("Confirmar");
        jButton_hermandad_guardar_personaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_hermandad_guardar_personajeMouseClicked(evt);
            }
        });

        jButton_guardar_hermandad.setText("Guardar");
        jButton_guardar_hermandad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_guardar_hermandadMouseClicked(evt);
            }
        });

        jButton_cancelar_hermandad.setText("Cancelar");
        jButton_cancelar_hermandad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_cancelar_hermandadMouseClicked(evt);
            }
        });

        jButton_confirmar_modificacion_hermandad.setText("Confirmar modificacion");
        jButton_confirmar_modificacion_hermandad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_confirmar_modificacion_hermandadMouseClicked(evt);
            }
        });

        jTable_personajes_hermandad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Servidor", "Raza", "Nivel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable_personajes_hermandad);
        if (jTable_personajes_hermandad.getColumnModel().getColumnCount() > 0) {
            jTable_personajes_hermandad.getColumnModel().getColumn(0).setResizable(false);
            jTable_personajes_hermandad.getColumnModel().getColumn(1).setResizable(false);
            jTable_personajes_hermandad.getColumnModel().getColumn(2).setResizable(false);
            jTable_personajes_hermandad.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton_cancelar_añadir_personaje_hermandad.setText("Cancelar");
        jButton_cancelar_añadir_personaje_hermandad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_cancelar_añadir_personaje_hermandadMouseClicked(evt);
            }
        });

        jButton_borrar_personaje_hermandad.setText("Borrar Personaje");
        jButton_borrar_personaje_hermandad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_borrar_personaje_hermandadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_hermandadLayout = new javax.swing.GroupLayout(jPanel_hermandad);
        jPanel_hermandad.setLayout(jPanel_hermandadLayout);
        jPanel_hermandadLayout.setHorizontalGroup(
            jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                                .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_nombre_hermandad)
                                    .addComponent(jLabel_servidor_hermandad)
                                    .addComponent(jLabel_num_miembros))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                                .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_nombre_hermandad, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(jTextField_servidor_hermandad)
                                    .addComponent(jTextField_num_miembros))
                                .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jButton_confirmar_modificacion_hermandad))
                                    .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton_cancelar_hermandad)
                                            .addComponent(jButton_guardar_hermandad)))))
                            .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                                .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_hermandad_nombre_personaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_hermandad_servidor_personaje, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                                        .addComponent(jTextField_hermandad_nombre_personaje)
                                        .addGap(150, 150, 150))
                                    .addComponent(jTextField_hermandad_servidor_personaje, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_modificar_hermandad, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jButton_aniadir_hermandad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_borrar_hermandad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                        .addComponent(jButton_hermandad_añadir_personaje)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_borrar_personaje_hermandad))
                    .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                        .addComponent(jButton_hermandad_guardar_personaje, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_cancelar_añadir_personaje_hermandad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_hermandadLayout.setVerticalGroup(
            jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                        .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton_aniadir_hermandad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_modificar_hermandad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_borrar_hermandad)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_nombre_hermandad)
                            .addComponent(jTextField_nombre_hermandad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_servidor_hermandad)
                            .addComponent(jTextField_servidor_hermandad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_guardar_hermandad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_hermandadLayout.createSequentialGroup()
                        .addComponent(jButton_confirmar_modificacion_hermandad)
                        .addGap(56, 56, 56)))
                .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_num_miembros)
                        .addComponent(jTextField_num_miembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_cancelar_hermandad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_hermandad_nombre_personaje)
                    .addComponent(jTextField_hermandad_nombre_personaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_hermandad_servidor_personaje)
                    .addComponent(jTextField_hermandad_servidor_personaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_hermandadLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_hermandad_añadir_personaje)
                            .addComponent(jButton_borrar_personaje_hermandad))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_hermandadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_hermandad_guardar_personaje)
                            .addComponent(jButton_cancelar_añadir_personaje_hermandad))))
                .addGap(47, 47, 47))
        );

        jTabbedPane.addTab("Hermandad", jPanel_hermandad);

        jPanel_personaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_personajeMouseClicked(evt);
            }
        });

        jTable_personaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Servidor", "Raza", "Nivel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_personaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_personajeMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_personaje);

        jLabel_nombre_persona.setText("Nombre:");

        jLabel_personaje_servidor.setText("Servidor:");

        jLabel_personaje_faccion.setText("Faccion:");

        jComboBox_personaje_faccion.setEditable(true);
        jComboBox_personaje_faccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alianza", "Horda" }));
        jComboBox_personaje_faccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_personaje_faccionActionPerformed(evt);
            }
        });

        jTextField_personaje_nivel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_personaje_nivelFocusLost(evt);
            }
        });

        jTextField_nombre_personaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_nombre_personajeFocusLost(evt);
            }
        });

        jTextField_personaje_servidor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_personaje_servidorFocusLost(evt);
            }
        });

        jButton_guardar_personaje.setText("Guardar");
        jButton_guardar_personaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardar_personajeActionPerformed(evt);
            }
        });

        jButton_cancelar_personaje.setText("Cancelar");
        jButton_cancelar_personaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelar_personajeActionPerformed(evt);
            }
        });

        jButton_borrar_personaje.setText("Borrar");
        jButton_borrar_personaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar_personajeActionPerformed(evt);
            }
        });

        jButton_modificar_personaje.setText("Modificar");
        jButton_modificar_personaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificar_personajeActionPerformed(evt);
            }
        });

        jButton_aniadir_personaje.setText("Añadir");
        jButton_aniadir_personaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_aniadir_personajeActionPerformed(evt);
            }
        });

        jLabel_personaje_raza.setText("Raza:");

        jTextField_personaje_raza.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_personaje_razaFocusLost(evt);
            }
        });

        jLabel_personaje_nivel.setText("Nivel:");

        jButton_modificar_inventario_personaje.setText("Modificar inventario");
        jButton_modificar_inventario_personaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificar_inventario_personajeActionPerformed(evt);
            }
        });

        jLabel_personaje_id.setText("Id personaje:");

        jTextField_personaje_id.setEnabled(false);

        jButton_confirmar_modificacion_personaje.setText("Confirmar modificación");
        jButton_confirmar_modificacion_personaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_confirmar_modificacion_personajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_personajeLayout = new javax.swing.GroupLayout(jPanel_personaje);
        jPanel_personaje.setLayout(jPanel_personajeLayout);
        jPanel_personajeLayout.setHorizontalGroup(
            jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_personajeLayout.createSequentialGroup()
                .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_personajeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_modificar_personaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_aniadir_personaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_borrar_personaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel_personajeLayout.createSequentialGroup()
                        .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_personajeLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_nombre_persona, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(jLabel_personaje_servidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_edad_persona)
                                    .addComponent(jLabel_personaje_faccion)
                                    .addComponent(jLabel_personaje_raza)
                                    .addComponent(jLabel_personaje_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_personajeLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_personaje_id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_personaje_faccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_personajeLayout.createSequentialGroup()
                                .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField_nombre_personaje, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                        .addComponent(jTextField_personaje_servidor)
                                        .addComponent(jTextField_personaje_nivel)
                                        .addComponent(jTextField_personaje_raza, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jTextField_personaje_id, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton_guardar_personaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_cancelar_personaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_modificar_inventario_personaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_confirmar_modificacion_personaje, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))))))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel_personajeLayout.setVerticalGroup(
            jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_personajeLayout.createSequentialGroup()
                .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_personajeLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton_aniadir_personaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_modificar_personaje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_borrar_personaje))
                    .addGroup(jPanel_personajeLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_personaje_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_personaje_id)
                    .addComponent(jButton_confirmar_modificacion_personaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_personajeLayout.createSequentialGroup()
                        .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_guardar_personaje)
                            .addComponent(jTextField_nombre_personaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_edad_persona)
                            .addComponent(jButton_cancelar_personaje)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_personajeLayout.createSequentialGroup()
                        .addComponent(jLabel_nombre_persona)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_personaje_servidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_personaje_servidor))))
                .addGap(18, 18, 18)
                .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_modificar_inventario_personaje)
                        .addComponent(jTextField_personaje_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_personaje_nivel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_personaje_raza)
                    .addComponent(jTextField_personaje_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_personajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_personaje_faccion)
                    .addComponent(jComboBox_personaje_faccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(428, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Personaje", jPanel_personaje);

        jTable_inventario_objetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id inventario", "Id personaje", "Espacios ocupados"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jTable_inventario_objetos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_inventario_objetosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_inventario_objetos);
        if (jTable_inventario_objetos.getColumnModel().getColumnCount() > 0) {
            jTable_inventario_objetos.getColumnModel().getColumn(0).setResizable(false);
            jTable_inventario_objetos.getColumnModel().getColumn(1).setResizable(false);
            jTable_inventario_objetos.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel_inventario_id.setText("Id Inventario");

        jLabel_inventario_servidor.setText("Servidor:");

        jTextField_id_inventario.setEnabled(false);
        jTextField_id_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_id_inventarioActionPerformed(evt);
            }
        });

        jTextField_inventario_servidor.setEnabled(false);
        jTextField_inventario_servidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_inventario_servidorActionPerformed(evt);
            }
        });

        jButton_vaciar_inventario.setText("Vaciar Inventario");
        jButton_vaciar_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_vaciar_inventarioMouseClicked(evt);
            }
        });

        jLabel_inventario_nombre_personaje.setText("Nombre Personaje:");

        jTextField_inventario_nombre_personaje.setEnabled(false);
        jTextField_inventario_nombre_personaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_inventario_nombre_personajeActionPerformed(evt);
            }
        });

        jButton_añadir_objeto_a_inventario.setText("Añadir objeto");
        jButton_añadir_objeto_a_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_añadir_objeto_a_inventarioMouseClicked(evt);
            }
        });

        jTable_inventario_personaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Rareza", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable_inventario_personaje);
        if (jTable_inventario_personaje.getColumnModel().getColumnCount() > 0) {
            jTable_inventario_personaje.getColumnModel().getColumn(0).setResizable(false);
            jTable_inventario_personaje.getColumnModel().getColumn(1).setResizable(false);
            jTable_inventario_personaje.getColumnModel().getColumn(2).setResizable(false);
            jTable_inventario_personaje.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton_borrar_objeto_inventario.setText("Borrar Objeto");
        jButton_borrar_objeto_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_borrar_objeto_inventarioMouseClicked(evt);
            }
        });

        jButton_modificar_inventario_personaje_bien.setText("Modificar Inventario");
        jButton_modificar_inventario_personaje_bien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_modificar_inventario_personaje_bienMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_inventarioLayout = new javax.swing.GroupLayout(jPanel_inventario);
        jPanel_inventario.setLayout(jPanel_inventarioLayout);
        jPanel_inventarioLayout.setHorizontalGroup(
            jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_inventarioLayout.createSequentialGroup()
                .addGroup(jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_inventarioLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_inventarioLayout.createSequentialGroup()
                                    .addGroup(jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel_inventario_nombre_personaje, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                        .addComponent(jLabel_inventario_servidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField_inventario_nombre_personaje, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                        .addComponent(jTextField_inventario_servidor)))
                                .addComponent(jLabel_anio_publicacion))
                            .addGroup(jPanel_inventarioLayout.createSequentialGroup()
                                .addComponent(jLabel_inventario_id, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jTextField_id_inventario, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))))
                    .addGroup(jPanel_inventarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_inventarioLayout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton_borrar_objeto_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_añadir_objeto_a_inventario)))
                            .addGroup(jPanel_inventarioLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton_vaciar_inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_modificar_inventario_personaje_bien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel_inventarioLayout.setVerticalGroup(
            jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_inventarioLayout.createSequentialGroup()
                .addGroup(jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_inventarioLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_inventarioLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton_vaciar_inventario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_modificar_inventario_personaje_bien)))
                .addGap(68, 68, 68)
                .addGroup(jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_inventario_id)
                    .addComponent(jTextField_id_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_inventario_nombre_personaje)
                    .addComponent(jTextField_inventario_nombre_personaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_inventario_servidor)
                    .addComponent(jTextField_inventario_servidor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel_anio_publicacion)
                .addGroup(jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_inventarioLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(252, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_inventarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_añadir_objeto_a_inventario)
                        .addGap(29, 29, 29)
                        .addComponent(jButton_borrar_objeto_inventario)
                        .addGap(114, 114, 114))))
        );

        jTabbedPane.addTab("Inventario", jPanel_inventario);

        jPanel_objeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_objetoMouseClicked(evt);
            }
        });

        jTable_objeto_objeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Nombre", "Rareza", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_objeto_objeto);
        if (jTable_objeto_objeto.getColumnModel().getColumnCount() > 0) {
            jTable_objeto_objeto.getColumnModel().getColumn(0).setResizable(false);
            jTable_objeto_objeto.getColumnModel().getColumn(1).setResizable(false);
            jTable_objeto_objeto.getColumnModel().getColumn(2).setResizable(false);
            jTable_objeto_objeto.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel_objeto_nombre.setText("Nombre:");

        jLabel_rareza_objeto.setText("Rareza: ");

        jLabel_precio_objeto.setText("Precio: ");

        jTextField_nombre_objeto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_nombre_objetoFocusLost(evt);
            }
        });

        jTextField_rareza_objeto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_rareza_objetoFocusLost(evt);
            }
        });

        jTextField_precio_objeto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_precio_objetoFocusLost(evt);
            }
        });

        jButton_guardar_objeto.setText("Guardar");
        jButton_guardar_objeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardar_objetoActionPerformed(evt);
            }
        });

        jButton_cancelar_objeto.setText("Cancelar");
        jButton_cancelar_objeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelar_objetoActionPerformed(evt);
            }
        });

        jButton_aniadir_objeto.setText("Añadir");
        jButton_aniadir_objeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_aniadir_objetoActionPerformed(evt);
            }
        });

        jButton_modificar_objeto.setText("Modificar");
        jButton_modificar_objeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificar_objetoActionPerformed(evt);
            }
        });

        jButton_borrar_objeto.setText("Borrar");
        jButton_borrar_objeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar_objetoActionPerformed(evt);
            }
        });

        jLabel_descripcion_objeto.setText("Descripcion:");

        jTextField_descripcion_objeto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_descripcion_objetoFocusLost(evt);
            }
        });

        jLabel_id_objeto.setText("ID objeto:");

        jTextField_id_objeto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_id_objetoFocusLost(evt);
            }
        });

        jButton_objeto_modificar_confirmar.setText("Confirmar modificación");
        jButton_objeto_modificar_confirmar.setEnabled(false);
        jButton_objeto_modificar_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_objeto_modificar_confirmarActionPerformed(evt);
            }
        });

        jButton_confirmar_añadir_objeto_a_inventario.setText("Añadir objeto a inventario");
        jButton_confirmar_añadir_objeto_a_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_confirmar_añadir_objeto_a_inventarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_objetoLayout = new javax.swing.GroupLayout(jPanel_objeto);
        jPanel_objeto.setLayout(jPanel_objetoLayout);
        jPanel_objetoLayout.setHorizontalGroup(
            jPanel_objetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_objetoLayout.createSequentialGroup()
                .addGroup(jPanel_objetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_objetoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_objetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_modificar_objeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_aniadir_objeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_borrar_objeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel_objetoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_objetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_objeto_nombre)
                            .addComponent(jLabel_rareza_objeto)
                            .addComponent(jLabel_precio_objeto)
                            .addComponent(jLabel_descripcion_objeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_id_objeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel_objetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_nombre_objeto, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jTextField_rareza_objeto)
                            .addComponent(jTextField_precio_objeto)
                            .addComponent(jTextField_descripcion_objeto)
                            .addComponent(jTextField_id_objeto))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel_objetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_guardar_objeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_cancelar_objeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_objeto_modificar_confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_confirmar_añadir_objeto_a_inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel_objetoLayout.setVerticalGroup(
            jPanel_objetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_objetoLayout.createSequentialGroup()
                .addGroup(jPanel_objetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_objetoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton_aniadir_objeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_modificar_objeto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_borrar_objeto))
                    .addGroup(jPanel_objetoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_objetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_id_objeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_id_objeto))
                .addGap(8, 8, 8)
                .addGroup(jPanel_objetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_objeto_nombre)
                    .addComponent(jTextField_nombre_objeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_objeto_modificar_confirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_objetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_rareza_objeto)
                    .addComponent(jTextField_rareza_objeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_guardar_objeto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_objetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_precio_objeto)
                    .addComponent(jTextField_precio_objeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_cancelar_objeto))
                .addGap(18, 18, 18)
                .addGroup(jPanel_objetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_descripcion_objeto)
                    .addComponent(jTextField_descripcion_objeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_confirmar_añadir_objeto_a_inventario))
                .addContainerGap(496, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Objeto", jPanel_objeto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane)
                .addContainerGap())
        );

        jTabbedPane.getAccessibleContext().setAccessibleName("Ciudad");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Cerrar ventana
    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        int resultado = javax.swing.JOptionPane.showConfirmDialog(this, "¿Desea guardar antes de salir?", "Confirmación", javax.swing.JOptionPane.YES_NO_OPTION);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.dispose();
    }
    
    private void jButton_aniadir_hermandadActionPerformed(java.awt.event.ActionEvent evt){
        
       
        
    }
    
    private void jButton_modificar_hermandadActionPerformed(java.awt.event.ActionEvent evt){
      
        int selectedRow = jTable_hermandad.getSelectedRow();
        if (selectedRow != -1) {
            mostrarSeccionInferiorHermandad();
            jButton_hermandad_añadir_personaje.setVisible(true);
            jButton_borrar_personaje_hermandad.setVisible(true);
            jButton_guardar_hermandad.setVisible(false);
            jButton_confirmar_modificacion_hermandad.setVisible(true);
            // Obtén información de la fila seleccionada (puedes usar DefaultTableModel)
            DefaultTableModel model = (DefaultTableModel) jTable_hermandad.getModel();
            String nombreOriginal = (String) model.getValueAt(selectedRow, 0); // Suponiendo que la columna 0 contiene el ID del objeto
            String servidorOriginal = (String) model.getValueAt(selectedRow, 1); // Suponiendo que la columna 1 contiene el nombre del objeto
            int numeroMiembros = (int) model.getValueAt(selectedRow, 2);
            
            jTextField_nombre_hermandad.setText(nombreOriginal);
            jTextField_servidor_hermandad.setText(servidorOriginal);
            jTextField_num_miembros.setText(Integer.toString(numeroMiembros));
            int posicionHermandad = controlador.buscarHermandadPorNombre(nombreOriginal, servidorOriginal);
            controlador.cargarPersonajesHermandadEnTabla(controlador.getArrayDeHermandadesSistema().get(posicionHermandad).getIdHermandad());

            jButton_confirmar_modificacion_hermandad.setEnabled(true);
            jTextField_nombre_hermandad.setEnabled(true);
            jTextField_servidor_hermandad.setEnabled(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Debes de seleccionar una hermandad", "Error", JOptionPane.ERROR_MESSAGE);
        }
       
    }
    
    private void jButton_borrar_hermandadActionPerformed(java.awt.event.ActionEvent evt){
        int selectedRow = jTable_hermandad.getSelectedRow();
        if (selectedRow != -1) {
            // Obtén información de la fila seleccionada (puedes usar DefaultTableModel)
            DefaultTableModel model = (DefaultTableModel) jTable_hermandad.getModel();
            String nombreOriginal = (String) model.getValueAt(selectedRow, 0); // Suponiendo que la columna 0 contiene el ID del objeto
            String servidorOriginal = (String) model.getValueAt(selectedRow, 1); // Suponiendo que la columna 1 contiene el nombre del objeto
           
            controlador.borrarHermandad(nombreOriginal, servidorOriginal);
        }
        else{
            JOptionPane.showMessageDialog(this, "Debes de seleccionar una hermandad", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }
    
    private void  jTextField_nombre_hermandadActionPerformed(java.awt.event.ActionEvent evt){
        //Poner nombre a hermandad
    }
    
    private void  jButton_guardar_hermandadActionPerformed(java.awt.event.ActionEvent evt){
        String nombreHermandad = jTextField_nombre_hermandad.getText();
        String servidorHermandad = jTextField_servidor_hermandad.getText();

        if (!nombreHermandad.isEmpty() && !servidorHermandad.isEmpty()) {
            controlador.añadirHermandad(nombreHermandad, servidorHermandad);
        } else {
            JOptionPane.showMessageDialog(this, "No puede haber campos vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void  jButton_cancelar_hermandadActionPerformed(java.awt.event.ActionEvent evt){
         //Cancelar rellenar datos de hermnadad
     }
    
     private void jTable_objeto_objetoMouseClicked(java.awt.event.ActionEvent evt){
         //Accion realizada cuando clicas la tabla de objeto
     }
     
     private void  jButton_cancelar_objetoActionPerformed(java.awt.event.ActionEvent evt){
         idObjetoProcesado = null;
         nombreObjetoProcesado = null;
         rarezaObjetoProcesado = null;
         precioObjetoProcesado = null;
         descripcionObjetoProcesado = null;
         jTextField_id_objeto.setText("");
         jTextField_nombre_objeto.setText("");
         jTextField_rareza_objeto.setText("");
         jTextField_descripcion_objeto.setText("");
         jTextField_precio_objeto.setText("");
         jButton_cancelar_objeto.setEnabled(false);
         jButton_objeto_modificar_confirmar.setEnabled(false);
         ocultarSeccionInferiorObjeto();
     }
     
     private void jButton_guardar_objetoActionPerformed(java.awt.event.ActionEvent evt){      
         controlador.añadirObjeto(nombreObjetoProcesado, rarezaObjetoProcesado, precioObjetoProcesado, descripcionObjetoProcesado, idObjetoProcesado);
         ocultarSeccionInferiorObjeto();
     }
     
     private void jButton_aniadir_objetoActionPerformed(java.awt.event.ActionEvent evt){
         jTextField_nombre_objeto.setVisible(true);
         jTextField_descripcion_objeto.setVisible(true);
         jTextField_rareza_objeto.setVisible(true);
         jTextField_precio_objeto.setVisible(true);
         jButton_guardar_objeto.setVisible(true);
         jButton_cancelar_objeto.setVisible(true);
         jLabel_objeto_nombre.setVisible(true);
         jLabel_rareza_objeto.setVisible(true);
         jLabel_precio_objeto.setVisible(true);
         jLabel_descripcion_objeto.setVisible(true);         
     }
     
     private void jButton_modificar_objetoActionPerformed(java.awt.event.ActionEvent evt){
        

         
        int selectedRow = jTable_objeto_objeto.getSelectedRow();
        if (selectedRow != -1) {
            jTextField_nombre_objeto.setVisible(true);
            jTextField_rareza_objeto.setVisible(true);
            jTextField_precio_objeto.setVisible(true);
            jTextField_descripcion_objeto.setVisible(true);
            jButton_objeto_modificar_confirmar.setEnabled(true);
            jButton_objeto_modificar_confirmar.setVisible(true);
            jButton_cancelar_objeto.setVisible(true);
            // Obtén información de la fila seleccionada (puedes usar DefaultTableModel)
            DefaultTableModel model = (DefaultTableModel) jTable_objeto_objeto.getModel();
            String idObjeto = (String) model.getValueAt(selectedRow, 0); // Suponiendo que la columna 0 contiene el ID del objeto
            String nombre = (String) model.getValueAt(selectedRow, 1); // Suponiendo que la columna 1 contiene el nombre del objeto
            String rareza = (String) model.getValueAt(selectedRow, 2);
            Double precio = (Double) model.getValueAt(selectedRow, 3);
            //String descripcion = (String) model.getValueAt(selectedRow, 4);
            
            String precioStr = Double.toString(precio);
            Objeto objeto = controlador.getObjetoById(idObjeto);

            jTextField_id_objeto.setText(idObjeto);
            jTextField_nombre_objeto.setText(nombre);
            jTextField_rareza_objeto.setText(rareza);
            jTextField_precio_objeto.setText(precioStr);
            jTextField_descripcion_objeto.setText(objeto.getDescripcion());
 
        } else {
            // Mostrar un mensaje de error o advertencia si no se selecciona ninguna fila
            JOptionPane.showMessageDialog(this, "Selecciona un objeto a mofificar", "Error", JOptionPane.ERROR_MESSAGE);
         }
     }
     
     private void jButton_borrar_objetoActionPerformed(java.awt.event.ActionEvent evt){
        int selectedRow = jTable_objeto_objeto.getSelectedRow();
        if (selectedRow != -1) {
            // Obtén información de la fila seleccionada 
            DefaultTableModel model = (DefaultTableModel) jTable_objeto_objeto.getModel();
            String idObjeto = (String) model.getValueAt(selectedRow, 0); 
            controlador.borrarObjeto(idObjeto);
        } else {
            // Mostrar un mensaje de error o advertencia si no se selecciona ninguna fila
            JOptionPane.showMessageDialog(this, "Selecciona un objeto a borrar", "Error", JOptionPane.ERROR_MESSAGE);
         }
     }
       
     
     private void jTable_personajeMouseClicked(java.awt.event.MouseEvent evt){
         //Cuando se hace click en la tabla 
     }
     
     private void jComboBox_personaje_faccionActionPerformed(java.awt.event.ActionEvent evt){
         faccionProcesado = (String) jComboBox_personaje_faccion.getSelectedItem();
     }
     
     private void jButton_guardar_personajeActionPerformed(java.awt.event.ActionEvent evt){
         String nombrePersonaje = jTextField_nombre_personaje.getText();
         String servidorPersonaje = jTextField_personaje_servidor.getText();
         String razaPersonaje = jTextField_personaje_raza.getText();
         String nivelPersonaje = jTextField_personaje_nivel.getText();
         String faccion = jComboBox_personaje_faccion.getSelectedItem().toString();
         int posicionPersonaje = controlador.buscarPersonajeEnSistema(nombrePersonaje, servidorPersonaje);
         if(posicionPersonaje == -1){
              controlador.añadirPersonaje(nombrePersonaje, servidorPersonaje, razaPersonaje, nivelPersonaje, faccion);
              ocultarSeccionPersonajeAñadir();
         }
         else{
             JOptionPane.showMessageDialog(this, "Ese nombre ya esta elegido", "Error", JOptionPane.ERROR_MESSAGE);
         }
     }
     
     private void jButton_cancelar_personajeActionPerformed(java.awt.event.ActionEvent evt){
            ocultarSeccionPersonajeAñadir();
            jTextField_nombre_personaje.setText("");
            jTextField_personaje_servidor.setText("");
            jTextField_personaje_raza.setText("");
            jTextField_personaje_nivel.setText("");
            jTextField_personaje_id.setText("");
            jComboBox_personaje_faccion.setSelectedIndex(0);
            jButton_confirmar_modificacion_personaje.setVisible(false);
     }
     
     private void jButton_borrar_personajeActionPerformed(java.awt.event.ActionEvent evt){
         int selectedRow = jTable_personaje.getSelectedRow();
         if (selectedRow != -1) {
             // Obtén información de la fila seleccionada 
             DefaultTableModel model = (DefaultTableModel) jTable_personaje.getModel();
             String nombre = (String) model.getValueAt(selectedRow, 0);
             String servidor = (String) model.getValueAt(selectedRow, 1);
             controlador.borrarPersonaje(nombre, servidor);
         } else {
             // Mostrar un mensaje de error o advertencia si no se selecciona ninguna fila
             JOptionPane.showMessageDialog(this, "Selecciona un personaje a borrar", "Error", JOptionPane.ERROR_MESSAGE);
         }
     }
     
     private void jButton_modificar_personajeActionPerformed(java.awt.event.ActionEvent evt){
       
         
        int selectedRow = jTable_personaje.getSelectedRow();
        if (selectedRow != -1) {
            // Obtén información de la fila seleccionada (puedes usar DefaultTableModel)
            mostrarSeccionPersonajeModificar();
            DefaultTableModel model = (DefaultTableModel) jTable_personaje.getModel();
            String nombre = (String) model.getValueAt(selectedRow, 0); // Suponiendo que la columna 1 contiene el nombre del objeto
            String servidor = (String) model.getValueAt(selectedRow, 1);
            String raza = (String) model.getValueAt(selectedRow, 2);
            int nivel = (int) model.getValueAt(selectedRow, 3);
            
            nombreModificar = nombre;
            servidorModificar = servidor;
            
            String nivelStr = Integer.toString(nivel);
            int posicionPersonaje = 0;
            posicionPersonaje = controlador.buscarPersonajeEnSistema(nombre, servidor);
            Personaje personaje = new Personaje();
            if(posicionPersonaje != -1){
                personaje = controlador.getArrayDePersonajesDeSistema().get(posicionPersonaje);
            }
            jTextField_nombre_personaje.setText(nombre);
            jTextField_personaje_servidor.setText(servidor);
            jTextField_personaje_raza.setText(raza);
            jTextField_personaje_nivel.setText(nivelStr);
            jTextField_personaje_id.setText(personaje.getIdPersonaje());
            jComboBox_personaje_faccion.setSelectedItem(personaje.getFaccion());
        } else {
            // Mostrar un mensaje de error o advertencia si no se selecciona ninguna fila
            JOptionPane.showMessageDialog(this, "Selecciona un objeto a mofificar", "Error", JOptionPane.ERROR_MESSAGE);
         }
     }
         
     
     
     private void jButton_aniadir_personajeActionPerformed(java.awt.event.ActionEvent evt){
        mostrarSeccionInferiorPersonajeAñadir();  
     }
     
     public void jTable_inventario_objetosMouseClicked(java.awt.event.MouseEvent evt){
         //Hacer click en la tabla de inventario
     }
     
     private void jTextField_id_inventarioActionPerformed(java.awt.event.ActionEvent evt){
         //Nombre id inventario
     }
     
     private void jButton_guardar_inventarioActionPerformed(java.awt.event.ActionEvent evt){
         
      
     }
     
     private void jButton_cancelar_inventarioActionPerformed(java.awt.event.ActionEvent evt){
         //Cancelar inventario
     }
     
     private void jButton_borrar_inventarioActionPerformed(java.awt.event.ActionEvent evt){
         //Borrar inventario
     }
     
     private void jButton_modificar_inventarioActionPerformed(java.awt.event.ActionEvent evt){
      
        jTextField_inventario_nombre_personaje.setEnabled(true);
        jTextField_inventario_servidor.setEnabled(true);
        mostrarSeccionInferiorInventario();
     }
     
    private void  jButton_aniadir_inventarioActionPerformed(java.awt.event.ActionEvent evt){

        jTextField_inventario_nombre_personaje.setEnabled(true);
        jTextField_inventario_servidor.setEnabled(true);
    }

    
    private void jTextField_inventario_nombre_personajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_inventario_nombre_personajeActionPerformed
       
    }//GEN-LAST:event_jTextField_inventario_nombre_personajeActionPerformed

    private void jTable_hermandadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_hermandadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_hermandadMouseClicked

    private void jTextField_precio_objetoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_precio_objetoFocusLost
        precioObjetoProcesado = jTextField_precio_objeto.getText();
    }//GEN-LAST:event_jTextField_precio_objetoFocusLost

    private void jTextField_nombre_personajeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_nombre_personajeFocusLost
        nombreProcesado = jTextField_nombre_personaje.getText();
    }//GEN-LAST:event_jTextField_nombre_personajeFocusLost

    private void jTextField_personaje_servidorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_personaje_servidorFocusLost
        servidorProcesado = jTextField_personaje_servidor.getText();
    }//GEN-LAST:event_jTextField_personaje_servidorFocusLost

    private void jTextField_personaje_nivelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_personaje_nivelFocusLost
        nivelProcesado = jTextField_personaje_nivel.getText();
    }//GEN-LAST:event_jTextField_personaje_nivelFocusLost

    private void jTextField_personaje_razaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_personaje_razaFocusLost
        razaProcesado = jTextField_personaje_raza.getText();
    }//GEN-LAST:event_jTextField_personaje_razaFocusLost

    private void jTextField_nombre_objetoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_nombre_objetoFocusLost
        nombreObjetoProcesado = jTextField_nombre_objeto.getText();
    }//GEN-LAST:event_jTextField_nombre_objetoFocusLost

    private void jTextField_rareza_objetoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_rareza_objetoFocusLost
        rarezaObjetoProcesado = jTextField_rareza_objeto.getText();
    }//GEN-LAST:event_jTextField_rareza_objetoFocusLost

    private void jTextField_descripcion_objetoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_descripcion_objetoFocusLost
        descripcionObjetoProcesado = jTextField_descripcion_objeto.getText();
    }//GEN-LAST:event_jTextField_descripcion_objetoFocusLost

    private void jTextField_id_objetoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_id_objetoFocusLost
        idObjetoProcesado = jTextField_id_objeto.getText();
    }//GEN-LAST:event_jTextField_id_objetoFocusLost

    private void jButton_objeto_modificar_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_objeto_modificar_confirmarActionPerformed
        
        String idObjetoConfirmar = jTextField_id_objeto.getText();
        String nombreObjetoConfirmar = jTextField_nombre_objeto.getText();
        String rarezaObjetoConfirmar = jTextField_rareza_objeto.getText();
        String precioObjetoConfirmar = jTextField_precio_objeto.getText();
        String descripcionObjetoConfirmar = jTextField_descripcion_objeto.getText();
        //Filtros un poco a lo bruto
        if(!idObjetoConfirmar.isEmpty() && !nombreObjetoConfirmar.isEmpty() && !rarezaObjetoConfirmar.isEmpty() 
        && !precioObjetoConfirmar.isEmpty() && !descripcionObjetoConfirmar.isEmpty() && !nombreObjetoConfirmar.isBlank()
         && !rarezaObjetoConfirmar.isBlank() && !precioObjetoConfirmar.isBlank() && !descripcionObjetoConfirmar.isBlank()){
            controlador.modificarObjeto(idObjetoConfirmar, nombreObjetoConfirmar, rarezaObjetoConfirmar, precioObjetoConfirmar, descripcionObjetoConfirmar);
            ocultarSeccionInferiorObjeto();
        }
        else{
            JOptionPane.showMessageDialog(this, "No puede haber campos vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        }
       
        
    }//GEN-LAST:event_jButton_objeto_modificar_confirmarActionPerformed

    private void jButton_modificar_inventario_personajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modificar_inventario_personajeActionPerformed
        int selectedRow = jTable_personaje.getSelectedRow();
        if (selectedRow != -1) {
            // Obtén información de la fila seleccionada (puedes usar DefaultTableModel)
            DefaultTableModel model = (DefaultTableModel) jTable_personaje.getModel();
            NombrePersonajeInventario = (String) model.getValueAt(selectedRow, 0); // Suponiendo que la columna 0 contiene el ID del objeto
            ServidorInventario = (String) model.getValueAt(selectedRow, 1); // Suponiendo que la columna 1 contiene el nombre del objeto
            jTextField_inventario_nombre_personaje.setText(NombrePersonajeInventario);
            jTextField_inventario_servidor.setText(ServidorInventario);
            
            int posicion = controlador.buscarPersonajeEnSistema(NombrePersonajeInventario, ServidorInventario);
            
          if(posicion != -1){
                if(controlador.getArrayDePersonajesDeSistema().get(posicion).getInventario() != null){
                    jTextField_id_inventario.setText(controlador.getArrayDePersonajesDeSistema().get(posicion).getInventario().getIdInventario());
                }
                else{
                     jTextField_id_inventario.setText("Este personaje no tiene inventario");
                }
          }
        }
        
        String idPersonaje = controlador.getArrayDePersonajesDeSistema().get(controlador.buscarPersonajeEnSistema(NombrePersonajeInventario, ServidorInventario)).getIdPersonaje();
        System.out.println(idPersonaje);

        String idDeseada = "PJ2"; // Reemplaza esto con la ID que deseas buscar

        DefaultTableModel model = (DefaultTableModel) jTable_inventario_objetos.getModel();
        int rowCount = model.getRowCount();
        int filaSeleccionada = -1;

        for (int fila = 0; fila < rowCount; fila++) {
            String idEnFila = (String) model.getValueAt(fila, 1); // Reemplaza 'columnaID' con el índice de la columna que contiene la ID

            if (idPersonaje.equals(idEnFila)) {
                filaSeleccionada = fila;
                break;  // Rompe el bucle una vez que se encuentra la fila
            }
        }

        if (filaSeleccionada != -1) {
            jTable_inventario_objetos.setRowSelectionInterval(filaSeleccionada, filaSeleccionada);
        }
         jTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_jButton_modificar_inventario_personajeActionPerformed

  
    private void jButton_confirmar_modificacion_personajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_confirmar_modificacion_personajeActionPerformed
        
        if(nombreModificar != null && servidorModificar != null){
            int posicionPersonaje = controlador.buscarPersonajeEnSistema(nombreModificar, servidorModificar);
            Personaje personaje = controlador.getArrayDePersonajesDeSistema().get(posicionPersonaje);

            String idPersonaje = personaje.getIdPersonaje();
            String nombrePersonajeConfirmar = jTextField_nombre_personaje.getText();
            String servidorPersonajeModificar = jTextField_personaje_servidor.getText();
            String razaPersonajeModificar = jTextField_personaje_raza.getText();
            int nivelPersonajeModificar = Integer.parseInt(jTextField_personaje_nivel.getText());
            String faccionPersonajeModificar = (String) jComboBox_personaje_faccion.getSelectedItem();

            controlador.modificarPersonaje(idPersonaje, nombrePersonajeConfirmar, servidorPersonajeModificar, razaPersonajeModificar, nivelPersonajeModificar, faccionPersonajeModificar);
            ocultarSeccionPersonajeModificar();
        }
    }//GEN-LAST:event_jButton_confirmar_modificacion_personajeActionPerformed

    private void jPanel_personajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_personajeMouseClicked
        jTable_personaje.clearSelection();
    }//GEN-LAST:event_jPanel_personajeMouseClicked

    private void jPanel_objetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_objetoMouseClicked
        jTable_objeto_objeto.clearSelection();
    }//GEN-LAST:event_jPanel_objetoMouseClicked

    private void jButton_añadir_objeto_a_inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_añadir_objeto_a_inventarioMouseClicked
        int selectedRow = jTable_inventario_objetos.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) jTable_inventario_objetos.getModel();
            idInventarioInventario = (String) model.getValueAt(selectedRow, 0); // Suponiendo que la columna 0 contiene el ID del inventario
            jTabbedPane.setSelectedIndex(3);
            jButton_confirmar_añadir_objeto_a_inventario.setVisible(true);
            jButton_confirmar_añadir_objeto_a_inventario.setEnabled(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Debes seleccionar un inventario", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_añadir_objeto_a_inventarioMouseClicked

    private void jButton_confirmar_añadir_objeto_a_inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_confirmar_añadir_objeto_a_inventarioMouseClicked
        int selectedRow = jTable_objeto_objeto.getSelectedRow();
        if (selectedRow != -1) {
            // Obtén información de la fila seleccionada (puedes usar DefaultTableModel)
            DefaultTableModel model = (DefaultTableModel) jTable_objeto_objeto.getModel();
            String idObjeto = (String) model.getValueAt(selectedRow, 0); // Suponiendo que la columna 0 contiene el ID del objeto
            System.out.println(idInventarioInventario);
            if(idInventarioInventario != null){
                controlador.añadirObjetoaInventario(idObjeto, idInventarioInventario);
                jButton_confirmar_añadir_objeto_a_inventario.setVisible(false);
                jButton_confirmar_añadir_objeto_a_inventario.setEnabled(false);
            }
            else{
                JOptionPane.showMessageDialog(this, "No se ha encontrado el inventario!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton_confirmar_añadir_objeto_a_inventarioMouseClicked

    private void jButton_vaciar_inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_vaciar_inventarioMouseClicked
        int selectedRow = jTable_inventario_objetos.getSelectedRow();
        if (selectedRow != -1) {
            // Obtén información de la fila seleccionada (puedes usar DefaultTableModel)
            DefaultTableModel model = (DefaultTableModel) jTable_inventario_objetos.getModel();
            String idInventario = (String) model.getValueAt(selectedRow, 0); // Suponiendo que la columna 0 contiene el ID del objeto

            controlador.vaciarInventario(idInventario);
        }
    }//GEN-LAST:event_jButton_vaciar_inventarioMouseClicked

    private void jTextField_hermandad_nombre_personajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_hermandad_nombre_personajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_hermandad_nombre_personajeActionPerformed

    private void jTextField_hermandad_servidor_personajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_hermandad_servidor_personajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_hermandad_servidor_personajeActionPerformed

    private void jButton_hermandad_añadir_personajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_hermandad_añadir_personajeMouseClicked
        int selectedRow = jTable_hermandad.getSelectedRow();
        if (selectedRow != -1) {
            mostrarSeccionInferiorHermandadPersonaje();
            // Obtén información de la fila seleccionada (puedes usar DefaultTableModel)
            DefaultTableModel model = (DefaultTableModel) jTable_hermandad.getModel();
            nombreHermandad = (String) model.getValueAt(selectedRow, 0);
            servidorHermandad = (String) model.getValueAt(selectedRow, 1); 
        }
        else{
             JOptionPane.showMessageDialog(this, "Debes de seleccionar una hermandad", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_hermandad_añadir_personajeMouseClicked

    private void jButton_hermandad_guardar_personajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_hermandad_guardar_personajeMouseClicked
        String nombrePersonaje, servidorPersonaje;
        nombrePersonaje = jTextField_hermandad_nombre_personaje.getText();
        servidorPersonaje = jTextField_hermandad_servidor_personaje.getText();
        
        if(!nombrePersonaje.isEmpty()  && !servidorPersonaje.isEmpty() && nombreHermandad != null && servidorHermandad != null && !nombreHermandad.isEmpty() && !servidorHermandad.isEmpty()){
            if(controlador.buscarPersonajeEnSistema(nombrePersonaje, servidorPersonaje) != -1){
                controlador.añadirPersonajeaHermandad(nombrePersonaje, servidorPersonaje, nombreHermandad, servidorHermandad);
                ocultarSeccionInferiorHermandadPersonaje();
                ocultarSeccionInferiorHermandad();
                jButton_hermandad_añadir_personaje.setVisible(false);
                jButton_borrar_personaje_hermandad.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(this, "El personaje no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
             JOptionPane.showMessageDialog(this, "No puede haber campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_hermandad_guardar_personajeMouseClicked

    private void jButton_aniadir_hermandadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_aniadir_hermandadMouseClicked
        mostrarSeccionInferiorHermandad();
    }//GEN-LAST:event_jButton_aniadir_hermandadMouseClicked

    private void jButton_guardar_hermandadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_guardar_hermandadMouseClicked
        
        String nombreHermandad = jTextField_nombre_hermandad.getText();
        String servidorHermandad = jTextField_servidor_hermandad.getText();
        
        if(!nombreHermandad.isEmpty() && !servidorHermandad.isEmpty()){
            controlador.añadirHermandad(nombreHermandad, servidorHermandad);
            ocultarSeccionInferiorHermandad();
        }
        else{
            JOptionPane.showMessageDialog(this, "No puede haber campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_guardar_hermandadMouseClicked

    private void jButton_cancelar_hermandadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_cancelar_hermandadMouseClicked
        jTextField_nombre_hermandad.setText("");
        jTextField_servidor_hermandad.setText("");
        nombreHermandad = "";
        servidorHermandad = "";
        ocultarSeccionInferiorHermandad();
        jButton_hermandad_añadir_personaje.setVisible(false);
        jButton_borrar_personaje_hermandad.setVisible(false);
    }//GEN-LAST:event_jButton_cancelar_hermandadMouseClicked

    private void jButton_confirmar_modificacion_hermandadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_confirmar_modificacion_hermandadMouseClicked
        
        int selectedRow = jTable_hermandad.getSelectedRow();
        if (selectedRow != -1) {
            // Obtén información de la fila seleccionada (puedes usar DefaultTableModel)
            DefaultTableModel model = (DefaultTableModel) jTable_hermandad.getModel();
            String nombreOriginal = (String) model.getValueAt(selectedRow, 0); // Suponiendo que la columna 0 contiene el ID del objeto
            String servidorOriginal = (String) model.getValueAt(selectedRow, 1); // Suponiendo que la columna 1 contiene el nombre del objeto
         
            if (controlador.buscarHermandadPorNombre(nombreOriginal, servidorOriginal)  != -1){
                String nombreModificar = jTextField_nombre_hermandad.getText();
                String servidorModificar = jTextField_servidor_hermandad.getText();
                if(!nombreModificar.isEmpty() && !servidorModificar.isEmpty()){
                    ocultarSeccionInferiorHermandad();
                    jButton_confirmar_modificacion_hermandad.setVisible(false);
                    jButton_borrar_personaje_hermandad.setVisible(false);
                    jButton_hermandad_añadir_personaje.setVisible(false);
                    ocultarSeccionInferiorHermandadPersonaje();
                    controlador.modificarHermandad(nombreOriginal, servidorOriginal, nombreModificar, servidorModificar);
                }
                else{
                    JOptionPane.showMessageDialog(this, "No puede haber campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Selecciona una hermandad", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_confirmar_modificacion_hermandadMouseClicked

    private void jTextField_inventario_servidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_inventario_servidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_inventario_servidorActionPerformed

    private void jButton_modificar_inventario_personaje_bienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_modificar_inventario_personaje_bienMouseClicked
        int selectedRow = jTable_inventario_objetos.getSelectedRow();
        if (selectedRow != -1) {
            mostrarSeccionInferiorInventario();
            // Obtén información de la fila seleccionada (puedes usar DefaultTableModel)
            DefaultTableModel model = (DefaultTableModel) jTable_inventario_objetos.getModel();
            String idInventario = (String) model.getValueAt(selectedRow, 0); // Suponiendo que la columna 1 contiene el nombre del objeto
            String idPersonaje = (String) model.getValueAt(selectedRow, 1);
            int numeroEspaciosOcupadosString = (int) model.getValueAt(selectedRow, 2);

            int posicionPersonaje = controlador.buscarPersonajeEnSistemaPorId(idPersonaje);
            jTextField_id_inventario.setText(idInventario);
            jTextField_inventario_nombre_personaje.setText(controlador.getArrayDePersonajesDeSistema().get(posicionPersonaje).getNombre());
            jTextField_inventario_servidor.setText(controlador.getArrayDePersonajesDeSistema().get(posicionPersonaje).getServidor());
            controlador.cargarInventarioPersonajeEnTabla(idPersonaje);
            
            
        } 
        else{
            JOptionPane.showMessageDialog(this, "Selecciona un personaje", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_modificar_inventario_personaje_bienMouseClicked

    private void jButton_borrar_objeto_inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_borrar_objeto_inventarioMouseClicked
        int selectedRow = jTable_inventario_personaje.getSelectedRow();
        if (selectedRow != -1) {
            // Obtén información de la fila seleccionada (puedes usar DefaultTableModel)
            DefaultTableModel model = (DefaultTableModel) jTable_inventario_personaje.getModel();
            String idObjeto = (String) model.getValueAt(selectedRow, 0); // Suponiendo que la columna 0 contiene el ID del objeto
            String idInventario = jTextField_id_inventario.getText();
            controlador.borrarObjetoInventario(idObjeto, idInventario);
        }
        else{
            JOptionPane.showMessageDialog(this, "Selecciona un objeto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_borrar_objeto_inventarioMouseClicked

    private void jButton_cancelar_añadir_personaje_hermandadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_cancelar_añadir_personaje_hermandadMouseClicked
        jTextField_hermandad_nombre_personaje.setText("");
        jTextField_hermandad_servidor_personaje.setText("");
        jButton_hermandad_añadir_personaje.setVisible(false);
        jButton_borrar_personaje_hermandad.setVisible(false);
        ocultarSeccionInferiorHermandadPersonaje();
    }//GEN-LAST:event_jButton_cancelar_añadir_personaje_hermandadMouseClicked

    private void jButton_borrar_personaje_hermandadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_borrar_personaje_hermandadMouseClicked
        //Es lo mismo que añadir personaje a hermandad
        int selectedRow = jTable_personajes_hermandad.getSelectedRow();
        if (selectedRow != -1) {
            // Obtén información de la fila seleccionada (puedes usar DefaultTableModel)
            DefaultTableModel model = (DefaultTableModel) jTable_personajes_hermandad.getModel();
            String nombrePersonaje = (String) model.getValueAt(selectedRow, 0); // Suponiendo que la columna 0 contiene el ID del objeto
            String servidorPersonaje = (String) model.getValueAt(selectedRow, 1); // Suponiendo que la columna 1 contiene el nombre del objeto
            String nombreHermandad = jTextField_nombre_hermandad.getText();
            String servidorHermandad = jTextField_servidor_hermandad.getText();
            controlador.borrarPersonajeDeHermandad(nombrePersonaje, servidorPersonaje, nombreHermandad, servidorHermandad);
        }
        else{
            JOptionPane.showMessageDialog(this, "Selecciona un personaje", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_borrar_personaje_hermandadMouseClicked
    
    public void setControlador(Controller controladorSet){
        this.controlador = controladorSet;
    }
  
    public Controller getControlador(){
        return controlador;
    }

    public void ocultarSeccionInferiorObjeto(){
        jLabel_id_objeto.setVisible(false);
        jLabel_objeto_nombre.setVisible(false);
        jLabel_rareza_objeto.setVisible(false);
        jLabel_precio_objeto.setVisible(false);
        jLabel_descripcion_objeto.setVisible(false);
        jTextField_id_objeto.setVisible(false);
        jTextField_nombre_objeto.setVisible(false);
        jTextField_rareza_objeto.setVisible(false);
        jTextField_precio_objeto.setVisible(false);
        jTextField_descripcion_objeto.setVisible(false);
        jButton_objeto_modificar_confirmar.setVisible(false);
        jButton_confirmar_añadir_objeto_a_inventario.setVisible(false);
        jButton_guardar_objeto.setVisible(false);
        jButton_cancelar_objeto.setVisible(false);
    }

    public void mostrarSeccionInferiorObjeto(){
        jLabel_id_objeto.setVisible(true);
        jLabel_objeto_nombre.setVisible(true);
        jLabel_rareza_objeto.setVisible(true);
        jLabel_precio_objeto.setVisible(true);
        jLabel_descripcion_objeto.setVisible(true);
        jTextField_id_objeto.setVisible(true);
        jTextField_nombre_objeto.setVisible(true);
        jTextField_rareza_objeto.setVisible(true);
        jTextField_precio_objeto.setVisible(true);
        jTextField_descripcion_objeto.setVisible(true);
        jButton_objeto_modificar_confirmar.setVisible(true);
        jButton_confirmar_añadir_objeto_a_inventario.setVisible(true);
        jButton_guardar_objeto.setVisible(true);
        jButton_cancelar_objeto.setVisible(true);
        jButton_cancelar_objeto.setEnabled(true);
    }

    public void ocultarSeccionInferiorInventario(){
        jLabel_inventario_id.setVisible(false);
        jLabel_inventario_nombre_personaje.setVisible(false);
        jLabel_inventario_servidor.setVisible(false);
        jTextField_id_inventario.setVisible(false);
        jTextField_inventario_nombre_personaje.setVisible(false);
        jTextField_inventario_servidor.setVisible(false);
        jButton_añadir_objeto_a_inventario.setVisible(false);
        jButton_borrar_objeto_inventario.setVisible(false);
        jTable_inventario_personaje.setVisible(false);

    }

    public void mostrarSeccionInferiorInventario(){
        jLabel_inventario_id.setVisible(true);
        jLabel_inventario_nombre_personaje.setVisible(true);
        jLabel_inventario_servidor.setVisible(true);
        jTextField_id_inventario.setVisible(true);
        jTextField_inventario_nombre_personaje.setVisible(true);
        jTextField_inventario_servidor.setVisible(true);
        jButton_añadir_objeto_a_inventario.setVisible(true);
        jButton_borrar_objeto_inventario.setVisible(true);
        jTable_inventario_personaje.setVisible(true);
    }

    public void mostrarSeccionInferiorPersonajeAñadir(){
        jLabel_personaje_id.setVisible(true);
        jTextField_personaje_id.setVisible(true);
        jLabel_nombre_persona.setVisible(true);
        jLabel_personaje_servidor.setVisible(true);
        jLabel_personaje_raza.setVisible(true);
        jLabel_personaje_nivel.setVisible(true);
        jLabel_personaje_faccion.setVisible(true);
        jTextField_nombre_personaje.setVisible(true);
        jTextField_personaje_servidor.setVisible(true);
        jTextField_personaje_raza.setVisible(true);
        jTextField_personaje_nivel.setVisible(true);
        jComboBox_personaje_faccion.setVisible(true);
        jButton_guardar_personaje.setVisible(true);
        jButton_cancelar_personaje.setVisible(true);
    }

    public void ocultarSeccionPersonajeAñadir(){
        jLabel_personaje_id.setVisible(false);
        jTextField_personaje_id.setVisible(false);
        jLabel_nombre_persona.setVisible(false);
        jLabel_personaje_servidor.setVisible(false);
        jLabel_personaje_raza.setVisible(false);
        jLabel_personaje_nivel.setVisible(false);
        jLabel_personaje_faccion.setVisible(false);
        jTextField_nombre_personaje.setVisible(false);
        jTextField_personaje_servidor.setVisible(false);
        jTextField_personaje_raza.setVisible(false);
        jTextField_personaje_nivel.setVisible(false);
        jComboBox_personaje_faccion.setVisible(false);
        jButton_guardar_personaje.setVisible(false);
        jButton_cancelar_personaje.setVisible(false);
    }

    public void mostrarSeccionPersonajeModificar(){
        jLabel_nombre_persona.setVisible(true);
        jLabel_personaje_servidor.setVisible(true);
        jLabel_personaje_raza.setVisible(true);
        jLabel_personaje_nivel.setVisible(true);
        jLabel_personaje_faccion.setVisible(true);
        jTextField_nombre_personaje.setVisible(true);
        jTextField_personaje_servidor.setVisible(true);
        jTextField_personaje_raza.setVisible(true);
        jTextField_personaje_nivel.setVisible(true);
        jComboBox_personaje_faccion.setVisible(true);
        jButton_confirmar_modificacion_personaje.setVisible(true);
        jButton_cancelar_personaje.setVisible(true);
        //jButton_modificar_inventario_personaje.setVisible(false);
    }

    public void ocultarSeccionPersonajeModificar(){
        jLabel_nombre_persona.setVisible(false);
        jLabel_personaje_servidor.setVisible(false);
        jLabel_personaje_raza.setVisible(false);
        jLabel_personaje_nivel.setVisible(false);
        jLabel_personaje_faccion.setVisible(false);
        jTextField_nombre_personaje.setVisible(false);
        jTextField_personaje_servidor.setVisible(false);
        jTextField_personaje_raza.setVisible(false);
        jTextField_personaje_nivel.setVisible(false);
        jComboBox_personaje_faccion.setVisible(false);
        jButton_confirmar_modificacion_personaje.setVisible(false);
        jButton_cancelar_personaje.setVisible(false);
        jButton_modificar_inventario_personaje.setVisible(false);
    }

    public void mostrarSeccionInferiorHermandad(){
        jLabel_nombre_hermandad.setVisible(true);
        jLabel_servidor_hermandad.setVisible(true);
        jLabel_num_miembros.setVisible(true);
        jTextField_num_miembros.setVisible(true);
        jTextField_nombre_hermandad.setVisible(true);
        jTextField_servidor_hermandad.setVisible(true);
        jButton_guardar_hermandad.setVisible(true);
        jButton_cancelar_hermandad.setVisible(true);
        jButton_confirmar_modificacion_hermandad.setVisible(false);
    }

    public void ocultarSeccionInferiorHermandad(){
        jLabel_nombre_hermandad.setVisible(false);
        jLabel_servidor_hermandad.setVisible(false);
        jLabel_num_miembros.setVisible(false);
        jTextField_num_miembros.setVisible(false);
        jTextField_nombre_hermandad.setVisible(false);
        jTextField_servidor_hermandad.setVisible(false);
        jButton_guardar_hermandad.setVisible(false);
        jButton_cancelar_hermandad.setVisible(false);
        jButton_confirmar_modificacion_hermandad.setVisible(false);
    }

    public void ocultarSeccionInferiorHermandadPersonaje(){
        jLabel_hermandad_nombre_personaje.setVisible(false);
        jLabel_hermandad_servidor_personaje.setVisible(false);
        jTextField_hermandad_nombre_personaje.setVisible(false);
        jTextField_hermandad_servidor_personaje.setVisible(false);
        jButton_hermandad_guardar_personaje.setVisible(false);
        jButton_cancelar_añadir_personaje_hermandad.setVisible(false);
    }

    public void mostrarSeccionInferiorHermandadPersonaje(){
        jLabel_hermandad_nombre_personaje.setVisible(true);
        jLabel_hermandad_servidor_personaje.setVisible(true);
        jTextField_hermandad_nombre_personaje.setVisible(true);
        jTextField_hermandad_servidor_personaje.setVisible(true);
        jButton_hermandad_guardar_personaje.setVisible(true);
        jButton_hermandad_añadir_personaje.setVisible(true);
        jButton_cancelar_añadir_personaje_hermandad.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_aniadir_hermandad;
    private javax.swing.JButton jButton_aniadir_objeto;
    public javax.swing.JButton jButton_aniadir_personaje;
    private javax.swing.JButton jButton_añadir_objeto_a_inventario;
    private javax.swing.JButton jButton_borrar_hermandad;
    private javax.swing.JButton jButton_borrar_objeto;
    private javax.swing.JButton jButton_borrar_objeto_inventario;
    public javax.swing.JButton jButton_borrar_personaje;
    private javax.swing.JButton jButton_borrar_personaje_hermandad;
    private javax.swing.JButton jButton_cancelar_añadir_personaje_hermandad;
    private javax.swing.JButton jButton_cancelar_hermandad;
    private javax.swing.JButton jButton_cancelar_objeto;
    private javax.swing.JButton jButton_cancelar_personaje;
    private javax.swing.JButton jButton_confirmar_añadir_objeto_a_inventario;
    private javax.swing.JButton jButton_confirmar_modificacion_hermandad;
    private javax.swing.JButton jButton_confirmar_modificacion_personaje;
    private javax.swing.JButton jButton_guardar_hermandad;
    private javax.swing.JButton jButton_guardar_objeto;
    private javax.swing.JButton jButton_guardar_personaje;
    private javax.swing.JButton jButton_hermandad_añadir_personaje;
    private javax.swing.JButton jButton_hermandad_guardar_personaje;
    private javax.swing.JButton jButton_modificar_hermandad;
    private javax.swing.JButton jButton_modificar_inventario_personaje;
    private javax.swing.JButton jButton_modificar_inventario_personaje_bien;
    private javax.swing.JButton jButton_modificar_objeto;
    public javax.swing.JButton jButton_modificar_personaje;
    private javax.swing.JButton jButton_objeto_modificar_confirmar;
    private javax.swing.JButton jButton_vaciar_inventario;
    private javax.swing.JComboBox<String> jComboBox_personaje_faccion;
    private javax.swing.JLabel jLabel_anio_publicacion;
    private javax.swing.JLabel jLabel_descripcion_objeto;
    private javax.swing.JLabel jLabel_edad_persona;
    private javax.swing.JLabel jLabel_hermandad_nombre_personaje;
    private javax.swing.JLabel jLabel_hermandad_servidor_personaje;
    private javax.swing.JLabel jLabel_id_objeto;
    private javax.swing.JLabel jLabel_inventario_id;
    private javax.swing.JLabel jLabel_inventario_nombre_personaje;
    private javax.swing.JLabel jLabel_inventario_servidor;
    private javax.swing.JLabel jLabel_nombre_hermandad;
    private javax.swing.JLabel jLabel_nombre_persona;
    private javax.swing.JLabel jLabel_num_miembros;
    private javax.swing.JLabel jLabel_objeto_nombre;
    private javax.swing.JLabel jLabel_personaje_faccion;
    private javax.swing.JLabel jLabel_personaje_id;
    private javax.swing.JLabel jLabel_personaje_nivel;
    private javax.swing.JLabel jLabel_personaje_raza;
    private javax.swing.JLabel jLabel_personaje_servidor;
    private javax.swing.JLabel jLabel_precio_objeto;
    private javax.swing.JLabel jLabel_rareza_objeto;
    private javax.swing.JLabel jLabel_servidor_hermandad;
    private javax.swing.JPanel jPanel_hermandad;
    private javax.swing.JPanel jPanel_inventario;
    private javax.swing.JPanel jPanel_objeto;
    private javax.swing.JPanel jPanel_personaje;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane;
    public javax.swing.JTable jTable_hermandad;
    public javax.swing.JTable jTable_inventario_objetos;
    public javax.swing.JTable jTable_inventario_personaje;
    public javax.swing.JTable jTable_objeto_objeto;
    public javax.swing.JTable jTable_personaje;
    public javax.swing.JTable jTable_personajes_hermandad;
    private javax.swing.JTextField jTextField_descripcion_objeto;
    private javax.swing.JTextField jTextField_hermandad_nombre_personaje;
    private javax.swing.JTextField jTextField_hermandad_servidor_personaje;
    private javax.swing.JTextField jTextField_id_inventario;
    private javax.swing.JTextField jTextField_id_objeto;
    private javax.swing.JTextField jTextField_inventario_nombre_personaje;
    private javax.swing.JTextField jTextField_inventario_servidor;
    public javax.swing.JTextField jTextField_nombre_hermandad;
    public javax.swing.JTextField jTextField_nombre_objeto;
    private javax.swing.JTextField jTextField_nombre_personaje;
    public javax.swing.JTextField jTextField_num_miembros;
    private javax.swing.JTextField jTextField_personaje_id;
    private javax.swing.JTextField jTextField_personaje_nivel;
    private javax.swing.JTextField jTextField_personaje_raza;
    private javax.swing.JTextField jTextField_personaje_servidor;
    public javax.swing.JTextField jTextField_precio_objeto;
    public javax.swing.JTextField jTextField_rareza_objeto;
    public javax.swing.JTextField jTextField_servidor_hermandad;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Hermandad> hermandades;
    private Hermandad hermandad_modificar;
    private DefaultTableModel table_model_hermandad;    
    private Boolean modif_hermandad;
    private int id_hermandad;
    
    private ArrayList<Inventario> inventario;
    private Inventario inventario_modificar;
    private DefaultTableModel table_model_inventario;    
    private Boolean modif_inventario;
    private int id_inventario;
    
    private ArrayList<Objeto> objeto;
    private Objeto objeto_modificar;
    private DefaultTableModel table_model_objeto;    
    private Boolean modif_objeto;
    private int id_objeto;
    
    private ArrayList<Personaje> personaje;
    private Personaje personaje_modificar;
    private DefaultTableModel table_model_personaje;    
    private Boolean modif_personaje;
    private int id_personaje;
   
    
    
    //Variables de los TextField de Personaje
    public String nombreProcesado;
    public String servidorProcesado;
    public String nivelProcesado;
    public String razaProcesado;
    public String faccionProcesado;
    
    public String nombreModificar;
    public String servidorModificar;
    public String idPersonajeModificar;
    
    //Variables de los Texfield de Objeto
    
    String nombreObjetoProcesado;
    String rarezaObjetoProcesado;
    String precioObjetoProcesado;
    String descripcionObjetoProcesado;
    String idObjetoProcesado;
    
    //Variables necesarias para los TextField de inventario
    
    String idInventarioInventario;
    String NombrePersonajeInventario;
    String ServidorInventario;
    String espaciosOcupadosInventario;
    
    //Variables de hermandad
    
    String nombreHermandad;
    String servidorHermandad;
    
    
    //Atributo para conectar la vista con el controlador
    private Controller controlador;
    
   
}
