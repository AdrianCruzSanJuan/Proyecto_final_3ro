import java.awt.event.KeyAdapter;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adriàn
 */
public class Consultas2 extends javax.swing.JFrame {

    /**
     * Creates new form Consultas2
     */
    DefaultTableModel model;
    public Consultas2() {
        initComponents();
    }
    public void caducidadMetodo(){
        String agno = jcb_agno_consul.getSelectedItem().toString();
        String mes = jcb_mes_consul.getSelectedItem().toString();
        String dia = jcb_dia_consul.getSelectedItem().toString();
        String caducidad = agno + mes + dia;
        this.jl_fecha_consul.setText(caducidad);        
    }
    public void f_ingresoMetodo(){
        String agno = jcb_agno_consul.getSelectedItem().toString();
        String mes = jcb_mes_consul.getSelectedItem().toString();
        String dia = jcb_dia_consul.getSelectedItem().toString();
        String caducidad = agno + mes + dia;
        this.jl_fecha2.setText(caducidad);        
    }
    public void guardar(){
        String guardar = ("INSERT INTO PRODUCTOS(NOMBRE_P, MARCA, CONTENIDO, F_INGRESO, TIPO_PROD, PRECIO_COM, PRECIO_VEN, CADUCIDAD, ID_PROV, DESCRIPCION) VALUES (?,?,?,?,?,?,?,?,?,?);");
        conexion mysql=new conexion();
        Connection con = mysql.getConnection();
        
        this.model.addRow(new Object[]{
            this.jtf_mostrar.getText(), 
            this.jtf_nombre_p.getText(), 
            this.jtf_marca.getText(), 
            this.jtf_contenido.getText(), 
            this.jcb_tipo_consul.getSelectedItem().toString(), 
            this.jl_fecha_consul.getText(), 
            this.jl_fecha2.getText(), 
            this.jtf_id_prov.getText(), 
            this.jtf_precio_com.getText(), 
            this.jtf_precio_ven.getText()
        });
        this.jtf_mostrar.setText(""); 
            this.jtf_nombre_p.setText(""); 
            this.jtf_marca.setText("");
            this.jtf_contenido.setText(""); 
            this.jcb_tipo_consul.setSelectedIndex(0); 
            this.jl_fecha_consul.setText("");
            this.jl_fecha2.setText("");
            this.jtf_id_prov.setText(""); 
            this.jtf_precio_com.setText(""); 
            this.jtf_precio_ven.setText("");
    }
    public void nuevo(){
        this.jtf_mostrar.setText(""); 
            this.jtf_nombre_p.setText(""); 
            this.jtf_marca.setText("");
            this.jtf_contenido.setText(""); 
            this.jcb_tipo_consul.setSelectedIndex(0); 
            this.jl_fecha_consul.setText("");
            this.jl_fecha2.setText("");
            this.jtf_id_prov.setText(""); 
            this.jtf_precio_com.setText(""); 
            this.jtf_precio_ven.setText("");
    } 
    int filas;
    public void actualizar(){
        String []datos=new String[9];
        datos[0]=jtf_nombre_p.getText();
            datos[1]=jtf_marca.getText(); 
            datos[2]=jtf_contenido.getText(); 
            datos[3]=jcb_tipo_consul.getSelectedItem().toString();
            datos[4]=jl_fecha_consul.getText();
            datos[5]=jl_fecha2.getText();
            datos[6]=jtf_id_prov.getText(); 
            datos[7]=jtf_precio_com.getText();
            datos[8]=jtf_precio_ven.getText();
            for (int i = 0; i < jt_consultas.getColumnCount(); i++){
                model.setValueAt(datos[i], filas, 1);
            }
    }
    public void clickEntabla(){
        int fila_seleccionada=jt_consultas.getSelectedRow();
        jtf_nombre_p.setText(jt_consultas.getValueAt(fila_seleccionada,0).toString());
        jtf_marca.setText(jt_consultas.getValueAt(fila_seleccionada,1).toString());
        jtf_contenido.setText(jt_consultas.getValueAt(fila_seleccionada,2).toString());
        jl_tipo.setText(jt_consultas.getValueAt(fila_seleccionada, 3).toString());
        jl_fecha_consul.setText(jt_consultas.getValueAt(fila_seleccionada,4).toString());
        jl_fecha2.setText(jt_consultas.getValueAt(fila_seleccionada,5).toString());
        jtf_id_prov.setText(jt_consultas.getValueAt(fila_seleccionada,6).toString());
        jtf_precio_com.setText(jt_consultas.getValueAt(fila_seleccionada,7).toString());
        jtf_precio_ven.setText(jt_consultas.getValueAt(fila_seleccionada,8).toString());
        filas=fila_seleccionada;
    }
    public void eliminar(){
        int fila_seleccionada=jt_consultas.getSelectedRow();
        if(fila_seleccionada>0){
            model.removeRow(fila_seleccionada);
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila por favor");
        }
    }
    public void tipo(){
        String tipo = jcb_tipo_consul.getSelectedItem().toString();
        this.jl_tipo.setText(tipo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_volver_consul = new javax.swing.JButton();
        jl_nombre_p_consul = new javax.swing.JLabel();
        jl_marca_consul = new javax.swing.JLabel();
        jl_contenido_consul = new javax.swing.JLabel();
        jcb_tipo_consul = new javax.swing.JComboBox<>();
        jl_precio_com_consul = new javax.swing.JLabel();
        jl_precio_ven_consul = new javax.swing.JLabel();
        jl_id_prov_consul = new javax.swing.JLabel();
        jcb_agno_consul = new javax.swing.JComboBox<>();
        jcb_mes_consul = new javax.swing.JComboBox<>();
        jcb_dia_consul = new javax.swing.JComboBox<>();
        jl_f_ingreso_consul = new javax.swing.JLabel();
        jcb_agno_consul1 = new javax.swing.JComboBox<>();
        jcb_mes_consul1 = new javax.swing.JComboBox<>();
        jcb_dia_consul1 = new javax.swing.JComboBox<>();
        jl_caducidad_consul1 = new javax.swing.JLabel();
        jtf_nombre_p = new javax.swing.JTextField();
        jtf_marca = new javax.swing.JTextField();
        jtf_contenido = new javax.swing.JTextField();
        jtf_precio_com = new javax.swing.JTextField();
        jtf_precio_ven = new javax.swing.JTextField();
        jtf_id_prov = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_consultas = new javax.swing.JTable();
        jb_modificar_consul = new javax.swing.JButton();
        jb_actualizar_consul = new javax.swing.JButton();
        jtf_mostrar = new javax.swing.JTextField();
        jcb_combo = new javax.swing.JComboBox<>();
        jb_filtrar = new javax.swing.JButton();
        jl_fecha_consul = new javax.swing.JLabel();
        jl_fecha2 = new javax.swing.JLabel();
        jl_tipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_volver_consul.setText("<----");
        jb_volver_consul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_volver_consulMouseClicked(evt);
            }
        });
        getContentPane().add(jb_volver_consul, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jl_nombre_p_consul.setText("Nombre");
        getContentPane().add(jl_nombre_p_consul, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 106, 57, -1));

        jl_marca_consul.setText("Marca");
        getContentPane().add(jl_marca_consul, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 146, 57, -1));

        jl_contenido_consul.setText("Contenido");
        getContentPane().add(jl_contenido_consul, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 186, -1, -1));

        jcb_tipo_consul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", " " }));
        getContentPane().add(jcb_tipo_consul, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 205, 196, -1));

        jl_precio_com_consul.setText("Precio de compra");
        getContentPane().add(jl_precio_com_consul, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 137, -1, -1));

        jl_precio_ven_consul.setText("Precio de venta");
        getContentPane().add(jl_precio_ven_consul, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 166, -1, -1));

        jl_id_prov_consul.setText("id del proveedor");
        getContentPane().add(jl_id_prov_consul, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 97, -1, -1));

        jcb_agno_consul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jcb_agno_consul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_agno_consulActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_agno_consul, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 240, -1, -1));

        jcb_mes_consul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(jcb_mes_consul, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 240, -1, -1));

        jcb_dia_consul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Día", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jcb_dia_consul, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 240, -1, -1));

        jl_f_ingreso_consul.setText("Fecha de ingreso");
        getContentPane().add(jl_f_ingreso_consul, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 243, -1, -1));

        jcb_agno_consul1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jcb_agno_consul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_agno_consul1ActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_agno_consul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, -1));

        jcb_mes_consul1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(jcb_mes_consul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 240, -1, -1));

        jcb_dia_consul1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Día", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jcb_dia_consul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, -1, -1));

        jl_caducidad_consul1.setText("Fecha de caducidad");
        getContentPane().add(jl_caducidad_consul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 243, -1, -1));
        getContentPane().add(jtf_nombre_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 103, 155, -1));
        getContentPane().add(jtf_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 143, 155, -1));
        getContentPane().add(jtf_contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 183, 155, -1));
        getContentPane().add(jtf_precio_com, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 134, 113, -1));
        getContentPane().add(jtf_precio_ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 163, 113, -1));
        getContentPane().add(jtf_id_prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 94, 112, -1));

        jt_consultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt_consultas.setToolTipText("");
        jScrollPane1.setViewportView(jt_consultas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 274, 1028, 369));

        jb_modificar_consul.setText("Modificar");
        getContentPane().add(jb_modificar_consul, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 32, -1, -1));

        jb_actualizar_consul.setText("Actualizar");
        getContentPane().add(jb_actualizar_consul, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 32, -1, -1));
        getContentPane().add(jtf_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 33, 211, -1));

        jcb_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Nombre", "Marca", "Contenido", "Tipo", "Precio de compra", "Precio de venta", "id del proveedor", "Fecha de ingreso", "Fecha de caducidad" }));
        jcb_combo.setToolTipText("Seleccionar");
        getContentPane().add(jcb_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 33, -1, -1));

        jb_filtrar.setText("Filtrar");
        jb_filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_filtrarActionPerformed(evt);
            }
        });
        jb_filtrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jb_filtrarKeyTyped(evt);
            }
        });
        getContentPane().add(jb_filtrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 32, -1, -1));
        getContentPane().add(jl_fecha_consul, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, -1, -1));
        getContentPane().add(jl_fecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 90, -1));
        getContentPane().add(jl_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 10, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_volver_consulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_volver_consulMouseClicked
        Jarc1 Jarc2=new Jarc1();
        Jarc2.setVisible(true);
    }//GEN-LAST:event_jb_volver_consulMouseClicked

    private void jcb_agno_consulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_agno_consulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_agno_consulActionPerformed

    private void jcb_agno_consul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_agno_consul1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_agno_consul1ActionPerformed

    private void jb_filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_filtrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_filtrarActionPerformed

    private void jb_filtrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jb_filtrarKeyTyped
        
    }//GEN-LAST:event_jb_filtrarKeyTyped

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consultas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_actualizar_consul;
    private javax.swing.JButton jb_filtrar;
    private javax.swing.JButton jb_modificar_consul;
    private javax.swing.JButton jb_volver_consul;
    private javax.swing.JComboBox<String> jcb_agno_consul;
    private javax.swing.JComboBox<String> jcb_agno_consul1;
    private javax.swing.JComboBox<String> jcb_combo;
    private javax.swing.JComboBox<String> jcb_dia_consul;
    private javax.swing.JComboBox<String> jcb_dia_consul1;
    private javax.swing.JComboBox<String> jcb_mes_consul;
    private javax.swing.JComboBox<String> jcb_mes_consul1;
    private javax.swing.JComboBox<String> jcb_tipo_consul;
    private javax.swing.JLabel jl_caducidad_consul1;
    private javax.swing.JLabel jl_contenido_consul;
    private javax.swing.JLabel jl_f_ingreso_consul;
    private javax.swing.JLabel jl_fecha2;
    private javax.swing.JLabel jl_fecha_consul;
    private javax.swing.JLabel jl_id_prov_consul;
    private javax.swing.JLabel jl_marca_consul;
    private javax.swing.JLabel jl_nombre_p_consul;
    private javax.swing.JLabel jl_precio_com_consul;
    private javax.swing.JLabel jl_precio_ven_consul;
    private javax.swing.JLabel jl_tipo;
    private javax.swing.JTable jt_consultas;
    private javax.swing.JTextField jtf_contenido;
    private javax.swing.JTextField jtf_id_prov;
    private javax.swing.JTextField jtf_marca;
    private javax.swing.JTextField jtf_mostrar;
    private javax.swing.JTextField jtf_nombre_p;
    private javax.swing.JTextField jtf_precio_com;
    private javax.swing.JTextField jtf_precio_ven;
    // End of variables declaration//GEN-END:variables
}
