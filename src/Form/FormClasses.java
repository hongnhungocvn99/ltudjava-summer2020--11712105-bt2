/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import DAO.ClassDAO;
import Model.Classes;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author coluc
 */
public class FormClasses extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmStudent
     */
    public FormClasses() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmbClass = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 500));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableData);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Môn học");

        cmbClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbClass.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbClassItemStateChanged(evt);
            }
        });
        cmbClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setText("Xóa sinh viên");
        btnDelete.setToolTipText("");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(cmbClass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbClass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LoadDataToTable() {
        // TODO add your handling code here:
        Integer classID = cmbClass.getSelectedIndex();
        if (classID < 0) {
            return;
        }
        ClassDAO dao = new ClassDAO();
        String className = cmbClass.getSelectedItem().toString();
        List<Classes> data = dao.filter(className);
        String[][] dataTable = new String[data.size()][5];
        for (int i = 0; i < data.size(); i++) {
            Classes item = data.get(i);
            dataTable[i][0] = String.valueOf(i);
            dataTable[i][1] = item.getStudentId();
            dataTable[i][2] = item.getFullname();
            dataTable[i][3] = item.getGender();
            dataTable[i][4] = item.getCardId();
        }
        TableModel table;
        String[] columnNames = {"STT", "MSSV", "Họ tên", "Giới tính", "CMND"};
        table = new DefaultTableModel(dataTable, columnNames);
        tableData.removeAll();
        tableData.setModel(table);
    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cmbClass.removeAllItems();
        updateCmb();
        Integer classID = cmbClass.getSelectedIndex();
        if (classID == 0) {
            LoadDataToTable();
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void cmbClassItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClassItemStateChanged
        // TODO add your handling code here:
        Integer classID = cmbClass.getSelectedIndex();
        if (classID >= 0) {
            LoadDataToTable();
        }

    }//GEN-LAST:event_cmbClassItemStateChanged

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int[] idx = tableData.getSelectedRows();
        if (idx.length <= 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên cần xóa", "Không đúng", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Integer classID = cmbClass.getSelectedIndex();
        if (classID < 0) {
            return;
        }
        ClassDAO dao = new ClassDAO();
        String className = cmbClass.getSelectedItem().toString();
        List<Classes> data = dao.removeFromIdx(idx, className);
        
        Boolean isUpdate = data != null;
        if (isUpdate) {
            JOptionPane.showMessageDialog(null, "Cập nhật thành công", "Đã cập nhật điểm số vào sơ sở dữ liệu", JOptionPane.INFORMATION_MESSAGE);
            String[][] dataTable = new String[data.size()][5];
            for (int i = 0; i < data.size(); i++) {
                Classes item = data.get(i);
                dataTable[i][0] = String.valueOf(i);
                dataTable[i][1] = item.getStudentId();
                dataTable[i][2] = item.getFullname();
                dataTable[i][3] = item.getGender();
                dataTable[i][4] = item.getCardId();
            }
            TableModel table;
            String[] columnNames = {"STT", "MSSV", "Họ tên", "Giới tính", "CMND"};
            table = new DefaultTableModel(dataTable, columnNames);
            tableData.removeAll();
            tableData.setModel(table);
        } else {
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại", "Lỗi khi cập nhật sơ sở dữ liệu", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClassActionPerformed

    public void updateCmb() {
        ClassDAO dao = new ClassDAO();
        List<String> classes = dao.getClasses();
        this.cmbClass.removeAllItems();
        for (int i = 0; i < classes.size(); i++) {
            this.cmbClass.addItem(classes.get(i));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<String> cmbClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables
}
