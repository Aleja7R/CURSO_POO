
/**
* Esta clase denominada VentanaPrincipal define una interfaz gráfica
* que permitirá crear un array de notas. Luego, se puede calcular el
* promedio de notas, la desviación, la nota mayor y la nota menor del
* array.
*/
package notas;

import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {


    public VentanaPrincipal() {
        
        initComponents();
        setTitle("Notas"); // Establece el título de la ventana
        setSize(380,500); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); /* La ventana se posiciona en el
        centro de la pantalla */
        // Establece que el botón de cerrar permitirá salir de la aplicación
        setDefaultCloseOperation(VentanaPrincipal.EXIT_ON_CLOSE);
        setResizable(false);
        
        // Establece la etiqueta y el campo de texto de la nota 1
        
        nota1.setText("Nota 1:");
        nota2.setText("Nota 2:");
        nota3.setText("Nota 3:");
        nota4.setText("Nota 4:");
        nota5.setText("Nota 5:");
        
        promedio.setText("");
        desviacion.setText("");
        mayor.setText("");
        menor.setText("");
        // Botones
        
        btnCalcular.setText("Calcular: ");
        btnLimpiar.setText("Limpiar: ");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        nota1 = new javax.swing.JLabel();
        nota2 = new javax.swing.JLabel();
        nota3 = new javax.swing.JLabel();
        nota4 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        txtNota3 = new javax.swing.JTextField();
        txtNota4 = new javax.swing.JTextField();
        nota5 = new javax.swing.JLabel();
        txtNota5 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        promedio = new javax.swing.JLabel();
        desviacion = new javax.swing.JLabel();
        mayor = new javax.swing.JLabel();
        menor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nota1.setText("jLabel1");

        nota2.setText("jLabel2");

        nota3.setText("jLabel3");

        nota4.setText("jLabel4");

        nota5.setText("jLabel5");

        btnCalcular.setText("jButton1");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setText("jButton2");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        promedio.setText("jLabel1");

        desviacion.setText("jLabel2");

        mayor.setText("jLabel3");

        menor.setText("jLabel1");

        jLabel1.setText("Promedio: ");

        jLabel2.setText("Desviación: ");

        jLabel3.setText("Nota mayor: ");

        jLabel4.setText("Nota menor: ");

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(67, 67, 67))
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nota5)
                            .addComponent(nota4)
                            .addComponent(nota3)
                            .addComponent(nota2)
                            .addComponent(nota1))
                        .addGap(58, 58, 58)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNota1)
                            .addComponent(txtNota2)
                            .addComponent(txtNota4)
                            .addComponent(txtNota3)
                            .addComponent(txtNota5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(68, 68, 68)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desviacion)
                            .addComponent(promedio)
                            .addComponent(mayor)
                            .addComponent(menor))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota1)
                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota2)
                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota3)
                    .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota4)
                    .addComponent(txtNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota5)
                    .addComponent(txtNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(promedio)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desviacion)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mayor)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menor)
                    .addComponent(jLabel4))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        Notas notas = new Notas(); // Se crea un objeto Notas
        boolean error = false;/* Se inicializa variable para determinar si ocurre un error */
        try{
            notas.listaNotas[0] = Double.parseDouble(txtNota1.getText());

            notas.listaNotas[1] = Double.parseDouble(txtNota2.getText());

            notas.listaNotas[2] = Double.parseDouble(txtNota3.getText());

            notas.listaNotas[3] = Double.parseDouble(txtNota4.getText());

            notas.listaNotas[4] = Double.parseDouble(txtNota5.getText());
            notas.calcularPromedio(); // Se calcula el promedio
            notas.calcularDesviacion(); // Se calcula la desviación
            // Se muestra el promedio formateado
            promedio.setText(String.valueOf(String.format("%.2f", notas.calcularPromedio())));
            double desv = notas.calcularDesviacion();
            // Se muestra la desviación formateada
            desviacion.setText(String.format("%.2f", desv));
            // Se muestra el valor mayor formateado
            mayor.setText(String.valueOf(notas.calcularMayor()));
            // Se muestra el valor menor formateado
            menor.setText(String.valueOf(notas.calcularMenor()));
        }catch (Exception e){
            error = true; // Si ocurre una excepción

        } finally {
            if(error) { /* Si ocurre una excepción, se muestra un mensaje de error */
            
                JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de número","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
            
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtNota1.setText("");
        txtNota2.setText("");
        txtNota3.setText("");
        txtNota4.setText("");
        txtNota5.setText("");
        
        promedio.setText("");
        desviacion.setText("");
        mayor.setText("");
        menor.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel desviacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel mayor;
    private javax.swing.JLabel menor;
    private javax.swing.JLabel nota1;
    private javax.swing.JLabel nota2;
    private javax.swing.JLabel nota3;
    private javax.swing.JLabel nota4;
    private javax.swing.JLabel nota5;
    private javax.swing.JLabel promedio;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    private javax.swing.JTextField txtNota4;
    private javax.swing.JTextField txtNota5;
    // End of variables declaration//GEN-END:variables
}
