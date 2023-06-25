
package Interfaz;

import java.sql.Connection;
import javax.swing.table.DefaultTableModel;

import MySQL.ClienteSQL;
import MySQL.ConexionSQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFCliente extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();

    ClienteSQL cliente;

    public JFCliente() {
        initComponents();
        mostrarTabla();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cliente = new ClienteSQL();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFCedula = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jTFEdad = new javax.swing.JTextField();
        JCBSexo = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jBagregar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaclientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFCedula2 = new javax.swing.JTextField();
        jTFNombre2 = new javax.swing.JTextField();
        jTFEdad2 = new javax.swing.JTextField();
        JCBSexo1 = new javax.swing.JComboBox<>();
        JCBCedula = new javax.swing.JCheckBox();
        JCBNombre = new javax.swing.JCheckBox();
        JCBEdad = new javax.swing.JCheckBox();
        JCBSexoCheck = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jBActualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JTFCedulaId = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaClientes2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablaClientes3 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTFBusqueda = new javax.swing.JTextField();
        jBorrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Cedula:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Sexo:");

        jLabel4.setText("Edad:");

        JCBSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTFCedula))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(jTFEdad)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(JCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        jBagregar.setText("Agregar");
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jBagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jBagregar)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de clientes"));

        jTablaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Sexo", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jTablaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaclientes);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 41, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Agregar", jPanel1);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel6.setText("Cedula:");

        jLabel7.setText("Nombre:");

        jLabel8.setText("Sexo:");

        jLabel9.setText("Edad:");

        JCBSexo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        JCBCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBCedulaActionPerformed(evt);
            }
        });

        JCBNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBNombreActionPerformed(evt);
            }
        });

        JCBEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBEdadActionPerformed(evt);
            }
        });

        JCBSexoCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBSexoCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JCBSexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNombre2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jTFCedula2)
                    .addComponent(jTFEdad2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCBCedula)
                            .addComponent(JCBNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(JCBEdad, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(JCBSexoCheck, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFCedula2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTFNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JCBNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFEdad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(JCBEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(JCBSexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JCBSexoCheck))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        jBActualizar.setText("Actualizar");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jLabel5.setText("Cedula:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTFCedulaId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jBActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTFCedulaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBActualizar)
                .addGap(11, 11, 11))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de clientes"));

        jTablaClientes2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Sexo", "Boletos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaClientes2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaClientes2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablaClientes2);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Actualizar", jPanel2);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de clientes"));

        jTablaClientes3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Sexo", "Boletos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaClientes3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaClientes3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablaClientes3);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        jLabel11.setText("Busqueda por cedula");

        jBorrar.setText("Borrar");
        jBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel11))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Borrar", jPanel3);

        jMenu3.setText("File");

        jMenuItem1.setText("Regresar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // private void jTablaClientes3MouseClicked(java.awt.event.MouseEvent evt)
    // {//GEN-FIRST:event_jTablaClientes3MouseClicked
    // // TODO add your handling code here:
    // }//GEN-LAST:event_jTablaClientes3MouseClicked

    private void JCBCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBCedulaActionPerformed

    private void JCBNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBNombreActionPerformed

    private void JCBEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBEdadActionPerformed

    private void JCBSexoCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBSexoCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBSexoCheckActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFEscritorio desktop = new JFEscritorio();
        desktop.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // mostrar datos
    public void mostrarTabla() {
        Connection con;
        Statement stmt;
        ConexionSQL conectar = new ConexionSQL();
        con = conectar.getconetion();

        String sql = "SELECT * FROM cliente";

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cedula");
        model.addColumn("Nombre");
        model.addColumn("Sexo");
        model.addColumn("Edad");

        jTablaclientes.setModel(model);
        jTablaClientes2.setModel(model);
        jTablaClientes3.setModel(model);

        String[] datos = new String[6];
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                model.addRow(datos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // try {
        //     jTablaclientes.setModel(modelo);
        //     jTablaClientes2.setModel(modelo);
        //     jTablaClientes3.setModel(modelo);
        //     PreparedStatement ps = null;
        //     ResultSet rs = null;
        //     ConexionSQL conn = new ConexionSQL();
        //     Connection con = conn.getconetion();

        //     String sql = "SELECT * FROM cliente";
        //     ps = con.prepareStatement(sql);
        //     rs = ps.executeQuery();

        //     ResultSetMetaData rsMd = rs.getMetaData();
        //     int cantColumans = rsMd.getColumnCount();

        //     modelo.addColumn("Cedula");
        //     modelo.addColumn("Nombre");
        //     modelo.addColumn("Sexo");
        //     modelo.addColumn("Edad");
        //     modelo.addColumn("Boletos");

        //     while (rs.next()) {
        //         Object[] filas = new Object[cantColumans];
        //         for (int i = 0; i < cantColumans; i++) {
        //             filas[i] = rs.getObject(i + 1);
        //         }
        //         modelo.addRow(filas);
        //     }
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

    }

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBagregarActionPerformed
        try {
            String cedula = this.jTFCedula.getText();
            String nombre = this.jTFNombre.getText();
            int edad = Integer.parseInt(this.jTFEdad.getText());

            if (cedula.matches("[0-9]+")) {
                if (edad > 0) {
                    String sexo = (String) JCBSexo.getSelectedItem();
                    cliente.insertarCliente(cedula, nombre, sexo, edad);
                    mostrarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "La edad debe ser un numero positivo");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Formato ID ingresado erroneo, debe ser un numero positivo");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato ID ingresado erroneo, debe ser un numero");
        }
        // PreparedStatement ps = null;
        // try {
        // ConexionSQL objCon = new ConexionSQL();
        // Connection conn = objCon.getconetion();
        // ps = conn.prepareStatement("INSERT INTO cliente (Cedula, Nombre, Sexo, Edad,
        // Boletos) VALUES (?,?,?,?,?)");
        // ps.setString(1, jTFCedula.getName());
        // ps.setString(2, jTFNombre.getName());
        // ps.setString(3, jTFSexo.getName());
        // ps.setString(4, jTFEdad.getName());
        // ps.setString(5, jTFBoletos.getName());

        // ps.execute();

        // JOptionPane.showMessageDialog(null, "Cliente agregado");
        // Object[] fila = new Object[5];
        // fila[0] = jTFCedula.getText();
        // fila[1] = jTFNombre.getText();
        // fila[2] = jTFSexo.getText();
        // fila[3] = jTFEdad.getText();
        // fila[4] = jTFBoletos.getText();
        // modelo.addRow(fila);
        // } catch (Exception ex) {
        // JOptionPane.showMessageDialog(null, "Error al agregar Cliente");
        // System.out.println(ex);
        // }
    }// GEN-LAST:event_jBagregarActionPerformed

    private void jBorrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBorrarActionPerformed
        try {
            String cedula = this.jTFBusqueda.getText();
            if (cedula.matches("[0-9]+")) {
                int option = JOptionPane.showConfirmDialog(null, "estas seguro de eliminar este dato de la lista?","Borrar",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
                if (option==0) {
                    cliente.borrarCliente(cedula);
                    JOptionPane.showMessageDialog(null, "Dato eliminado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Formato ingresado erroneo, debe ser un numero");
            }
            mostrarTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato ID ingresado erroneo");
        }
        // PreparedStatement ps = null;
        // try {

        //     ConexionSQL objCon = new ConexionSQL();
        //     Connection conn = objCon.getconetion();

        //     int Fila = jTablaClientes3.getSelectedRow();
        //     String codigo = jTablaClientes3.getValueAt(Fila, 0).toString();

        //     ps = conn.prepareStatement("DELETE FROM cliente WHERE Cedula=?");
        //     ps.setString(1, codigo);
        //     ps.execute();

        //     modelo.removeRow(Fila);
        //     JOptionPane.showMessageDialog(null, "Cliente Eliminado");
        //     limpiar();

        // } catch (SQLException ex) {
        //     JOptionPane.showMessageDialog(null, "Error al eliminar al cliente");
        //     System.out.println(ex.toString());
        // }
    }// GEN-LAST:event_jBorrarActionPerformed

    // private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBuscarActionPerformed
    //     String campo = jTFBusqueda.getText();
    //     String where = "";
    //     if (!"".equals(campo)) {
    //         where = "WHERE Cedula = '" + campo + "'";
    //     }
    //     try {
    //         DefaultTableModel modelo = new DefaultTableModel();
    //         jTablaClientes3.setModel(modelo);
    //         PreparedStatement ps = null;
    //         ResultSet rs = null;
    //         ConexionSQL conn = new ConexionSQL();
    //         Connection con = conn.getconetion();

    //         String sql = "SELECT Cedula, Nombre, Sexo, Edad, Boletos FROM cliente" + where;
    //         ps = con.prepareStatement(sql);
    //         rs = ps.executeQuery();

    //         ResultSetMetaData rsMd = rs.getMetaData();
    //         int cantColumans = rsMd.getColumnCount();

    //         modelo.addColumn("Cedula");
    //         modelo.addColumn("Nombre");
    //         modelo.addColumn("Sexo");
    //         modelo.addColumn("Edad");
    //         modelo.addColumn("Boletos");

    //         while (rs.next()) {
    //             Object[] filas = new Object[cantColumans];
    //             for (int i = 0; i < cantColumans; i++) {
    //                 filas[i] = rs.getObject(i + 1);
    //             }
    //             modelo.addRow(filas);
    //         }
    //     } catch (SQLException ex) {
    //         System.err.println(ex.toString());
    //     }
    // }// GEN-LAST:event_jBuscarActionPerformed

    private void jTablaclientesMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTablaclientesMouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_jTablaclientesMouseClicked

    private void jTablaClientes2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTablaClientes2MouseClicked
        // PreparedStatement ps = null;
        // ResultSet rs = null;
        // try {
        //     ConexionSQL objCon = new ConexionSQL();
        //     Connection conn = objCon.getconetion();

        //     int Fila = jTablaClientes2.getSelectedRow();
        //     String codigo = jTablaClientes2.getValueAt(Fila, 0).toString();

        //     ps = conn.prepareStatement("SELECT Nombre, Sexo, Edad, Boletos FROM cliente WHERE Cedula=?");
        //     ps.setString(1, codigo);
        //     rs = ps.executeQuery();

        //     while (rs.next()) {
        //         jTFCedula2.setText(rs.getString("Cedula"));
        //         jTFNombre2.setText(rs.getString("Nombre"));
        //         jTFEdad2.setText(rs.getString("Edad"));
        //     }
        // } catch (SQLException ex) {
        //     System.out.println(ex.toString());
        // }
    }// GEN-LAST:event_jTablaClientes2MouseClicked

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBActualizarActionPerformed
        try {
            String cedula = this.JTFCedulaId.getText();
            if (cedula.matches("[0-9]+")) {
                if (this.JCBCedula.isSelected()) {
                    String update = this.jTFCedula2.getText();
                    if (update.matches("[0-9]+")) {
                        cliente.UpdateCliente(cedula, 1, update);
                    } else {
                        JOptionPane.showMessageDialog(null, "La cedula debe ser un numero positivo");
                    }
                }
                if (this.JCBNombre.isSelected()) {
                    String nombre = this.jTFNombre2.getText();
                    cliente.UpdateCliente(cedula, 2, nombre);
                }
                if (this.JCBEdad.isSelected()) {
                    int edad = Integer.parseInt(this.jTFEdad2.getText());
                    if (edad>0) {
                        cliente.UpdateCliente(cedula, 3, ""+edad);
                    } else {
                        JOptionPane.showMessageDialog(null, "la edad debe ser un numero positivo");
                    }
                }
                if (this.JCBSexoCheck.isSelected()) {
                    String sexo = (String) JCBSexo1.getSelectedItem();
                    cliente.UpdateCliente(cedula, 4, sexo);
                }
            } else {
                JOptionPane.showMessageDialog(null, "la edad debe ser un numero");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ingreso de datos erroneo");
        }
        mostrarTabla();
        // int Fila = jTablaClientes2.getSelectedRow();

        // PreparedStatement ps = null;
        // try {
        //     ConexionSQL objCon = new ConexionSQL();
        //     Connection conn = objCon.getconetion();
        //     ps = conn.prepareStatement("UPDATE cliente SET Nombre=?, Sexo=?, Edad=?, Boletos=? WHERE Cedula=?");

        //     ps.setString(1, jTFCedula2.getText());
        //     ps.setString(2, jTFNombre2.getText());
        //     ps.setString(4, jTFEdad2.getText());

        //     ps.execute();

        //     JOptionPane.showMessageDialog(null, "Cliente actualizado");
        //     jTablaClientes2.setValueAt(jTFCedula2.getText(), Fila, 0);
        //     jTablaClientes2.setValueAt(jTFNombre2.getText(), Fila, 1);
        //     jTablaClientes2.setValueAt(jTFEdad2.getText(), Fila, 3);
        //     limpiar();

        // } catch (SQLException ex) {
        //     JOptionPane.showMessageDialog(null, "Error al actualizar el cliente");
        //     System.out.println(ex);
        // }
    }// GEN-LAST:event_jBActualizarActionPerformed

    private void jTablaClientes3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTablaClientes3MouseClicked
        // PreparedStatement ps = null;
        // ResultSet rs = null;
        // try {
        //     ConexionSQL objCon = new ConexionSQL();
        //     Connection conn = objCon.getconetion();

        //     int Fila = jTablaClientes3.getSelectedRow();
        //     String codigo = jTablaClientes3.getValueAt(Fila, 0).toString();

        //     ps = conn.prepareStatement("SELECT Nombre, Sexo, Edad, Boletos FROM cliente WHERE Cedula=?");
        //     ps.setString(1, codigo);
        //     rs = ps.executeQuery();

        //     jTFBusqueda.setText(rs.getString("Cedula"));
        // } catch (SQLException ex) {
        //     System.out.println(ex.toString());
        // }
    }// GEN-LAST:event_jTablaClientes3MouseClicked


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox JCBCedula;
    private javax.swing.JCheckBox JCBEdad;
    private javax.swing.JCheckBox JCBNombre;
    private javax.swing.JComboBox<String> JCBSexo;
    private javax.swing.JComboBox<String> JCBSexo1;
    private javax.swing.JCheckBox JCBSexoCheck;
    private javax.swing.JTextField JTFCedulaId;
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBorrar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTFBusqueda;
    private javax.swing.JTextField jTFCedula;
    private javax.swing.JTextField jTFCedula2;
    private javax.swing.JTextField jTFEdad;
    private javax.swing.JTextField jTFEdad2;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNombre2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTablaClientes2;
    private javax.swing.JTable jTablaClientes3;
    private javax.swing.JTable jTablaclientes;
    // End of variables declaration//GEN-END:variables

}
