package Vista;

import Entitat.Client;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Manuel Espinosa Torres
 */
public class JInternalFrame1 extends JInternalFrame {

    public JInternalFrame1() {
        initComponents();

        super.setVisible(true);
        super.setClosable(true);
        super.setTitle("Actualització per formulari");
        super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel7 = new javax.swing.JPanel();
        saveDataButton = new javax.swing.JButton();
        deleteClientButton = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        miModelo = new Vista.ClientTableModel(false);
        modeloOrdenado = new TableSorter(miModelo);
        renderer = new DefaultTableCellRenderer();
        clientJTableForm = new javax.swing.JTable();
        JTableHeader header = clientJTableForm.getTableHeader();
        modeloOrdenado.setTableHeader(header);
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codiJTextField = new javax.swing.JTextField();
        nomJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dniJTextField = new javax.swing.JTextField();
        carrerJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codiPostalJTextField = new javax.swing.JTextField();
        nPortalJTextField = new javax.swing.JTextField();
        buscaJTextField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        saveDataButton.setText("Guardar Dades");
        saveDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDataButtonActionPerformed(evt);
            }
        });

        deleteClientButton.setText("Elimina Client");
        deleteClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClientButtonActionPerformed(evt);
            }
        });

        clientJTableForm.setModel(modeloOrdenado);
        tableColumnModel = clientJTableForm.getColumnModel();
        clientJTableForm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clientJTableForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientJTableFormMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(clientJTableForm);

        jLabel1.setText("Busca:");

        jLabel2.setText("Codi:");

        jLabel3.setText("Nom:");

        codiJTextField.setEnabled(false);

        jLabel4.setText("DNI:");

        jLabel5.setText("Carrer:");

        jLabel6.setText("Codi Postal:");

        jLabel7.setText("Nº Portal:");

        buscaJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscaJTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscaJTextField))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(codiJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(nomJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(carrerJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(dniJTextField))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nPortalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codiPostalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(codiJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(dniJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(codiPostalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(carrerJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(nPortalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(saveDataButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteClientButton)
                        .addGap(18, 18, 18)
                        .addComponent(resetButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteClientButton)
                    .addComponent(resetButton)
                    .addComponent(saveDataButton))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDataButtonActionPerformed
        Client c = new Client();

        if (!codiJTextField.getText().equals("")) {
            c.setCodi_id(codiJTextField.getText());
        }

        c.setNom(nomJTextField.getText());
        c.setDni(dniJTextField.getText());
        c.setCarrer(carrerJTextField.getText());
        c.setCodi_postal(codiPostalJTextField.getText());
        c.setN_de_portal(nPortalJTextField.getText());

        miModelo.addClient(c, lastSelectedRow);
        deleteForm();
    }//GEN-LAST:event_saveDataButtonActionPerformed

    private void deleteClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClientButtonActionPerformed
        if (lastSelectedRow != -1) {
            Client c = (Client) miModelo.clientData.get(lastSelectedRow);

            int selection = JOptionPane.showConfirmDialog(this,
                    "Estas segur d'eliminar el següent client?\n\n" + c.toString(), "Eliminar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);

            if (selection == JOptionPane.YES_OPTION) {
                miModelo.removeRow(lastSelectedRow);
                deleteForm();
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Selecciona un client per a la seua eliminació.", "Informació",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_deleteClientButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        deleteForm();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void buscaJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaJTextFieldKeyReleased
        // Alternative 1:
        //miModelo.updateData(buscaJTextField.getText());

        // Alternative 2:
        lastSelectedRow = -1;
        miModelo.performSearch(lastSelectedColumn, buscaJTextField.getText());
    }//GEN-LAST:event_buscaJTextFieldKeyReleased

    private void clientJTableFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientJTableFormMouseClicked
        int selectedRow = clientJTableForm.getSelectedRow();
        int selectedColumn = clientJTableForm.getSelectedColumn();

        // Si polsem sobre una fila diferent a la última fila polsada...:
        if (selectedRow != lastSelectedRow) {
            // ... la última fila polsada serà la fila que acabem de polsar.
            lastSelectedRow = selectedRow;

            // Omplim el formulari amb la informació del registre que hem polsat:
            fillForm((Client) miModelo.clientData.get(lastSelectedRow));
        }

        // Si polsem cobre una columna diferent a la última columna polsada...:
        if (selectedColumn != lastSelectedColumn) {
            // ... la última columna polsada serà la columna que acabem de polsar.
            lastSelectedColumn = selectedColumn;

            // Açò ens permetrà desplaçar-nos a la nova columna polsada i
            // carregar de nou totes les dades des de cero per poder iniciar
            // una nova búsqueda:
            miModelo.performSearch(lastSelectedColumn, "");
            buscaJTextField.setText("");

            // Modifiquem el color del fons de les columnes segons quina estigui
            // seleccionada:
            paintColumns(selectedColumn);
        }

        // Mantenim el focus sobre el registre seleccionat:
        clientJTableForm.requestFocus();
        clientJTableForm.changeSelection(selectedRow, selectedColumn, false, false);
    }//GEN-LAST:event_clientJTableFormMouseClicked

    public void fillForm(Client c) {
        codiJTextField.setText(c.getCodi_id());
        dniJTextField.setText(c.getDni());
        codiPostalJTextField.setText(c.getCodi_postal());
        nomJTextField.setText(c.getNom());
        carrerJTextField.setText(c.getCarrer());
        nPortalJTextField.setText(c.getN_de_portal());
    }

    public void deleteForm() {
        buscaJTextField.setText("");
        codiJTextField.setText("");
        dniJTextField.setText("");
        codiPostalJTextField.setText("");
        nomJTextField.setText("");
        carrerJTextField.setText("");
        nPortalJTextField.setText("");

        if (lastSelectedColumn != -1) {
            miModelo.performSearch(lastSelectedColumn, "");
        }

        // Borrem la selecció de l'últim registre:
        lastSelectedRow = -1;
    }

    public void paintColumns(int selectedColumn) {
        for (int i = 0; i < tableColumnModel.getColumnCount(); i++) {
            renderer = new DefaultTableCellRenderer();

            if (i == selectedColumn) {
                renderer.setBackground(Color.LIGHT_GRAY);
            } else {
                renderer.setBackground(Color.WHITE);
            }

            tableColumnModel.getColumn(i).setCellRenderer(renderer);
        }
    }

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
            java.util.logging.Logger.getLogger(JInternalFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JInternalFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscaJTextField;
    private javax.swing.JTextField carrerJTextField;
    private javax.swing.JTable clientJTableForm;
    private javax.swing.JTextField codiJTextField;
    private javax.swing.JTextField codiPostalJTextField;
    private javax.swing.JButton deleteClientButton;
    private javax.swing.JTextField dniJTextField;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField nPortalJTextField;
    private javax.swing.JTextField nomJTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveDataButton;
    // End of variables declaration//GEN-END:variables
    private ClientTableModel miModelo;
    private TableColumnModel tableColumnModel;
    private DefaultTableCellRenderer renderer;
    private TableSorter modeloOrdenado;
    private int lastSelectedRow = -1;
    private int lastSelectedColumn = 2;
}
