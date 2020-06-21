/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import DAO.RemarkDAO;
import Model.Remarking;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author coluc
 */
public class FormListRemarking extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmStudent
     */
    public FormListRemarking() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        cmbRemark = new javax.swing.JComboBox<>();
        lblD = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

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
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableData);

        cmbRemark.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbRemark.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRemarkItemStateChanged(evt);
            }
        });

        lblD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblD.setText("Trạng thái");
        lblD.setToolTipText("");

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Phúc khảo điểm");

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblD)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbRemark, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(721, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(39, 39, 39)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(cmbRemark, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lblD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jLabel2)
                    .addContainerGap(452, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LoadData() {
        // TODO add your handling code here:
        String remark = cmbRemark.getSelectedItem().toString();
        RemarkDAO dao = new RemarkDAO();
        List<Remarking> data = dao.filter(remark);
        String[][] dataTable = new String[data.size()][8];
        for (int i = 0; i < data.size(); i++) {
            Remarking item = data.get(i);
            dataTable[i][0] = String.valueOf(item.getNo());
            dataTable[i][1] = item.getStudentId();
            dataTable[i][2] = item.getFullname();
            dataTable[i][3] = item.getSubject();
            dataTable[i][4] = item.getColExam();
            dataTable[i][5] = item.getMark().toString();
            dataTable[i][6] = item.getReason();
            dataTable[i][7] = item.getStatus();
        }
        TableModel table;
        String[] columnNames = {"STT", "MSSV", "Họ tên", "Mã môn", "Cột điểm cần phúc khảo", "Điểm mong muốn", "Lý do", "Trạng thái"};
        table = new DefaultTableModel(dataTable, columnNames);
        tableData.removeAll();
        tableData.setModel(table);
    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        updateCmb();
        Integer classID = cmbRemark.getSelectedIndex();
        if (classID >= 0) {
            LoadData();
        }
    }//GEN-LAST:event_formInternalFrameOpened


    private void cmbRemarkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRemarkItemStateChanged
        // TODO add your handling code here:
        Integer classID = cmbRemark.getSelectedIndex();
        if (classID >= 0) {
            LoadData();
        }

    }//GEN-LAST:event_cmbRemarkItemStateChanged

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        // TODO add your handling code here:
        String remark = cmbRemark.getSelectedItem().toString();
        RemarkDAO dao = new RemarkDAO();
        List<Remarking> data = dao.filter(remark);
        
        Integer idx = tableData.getSelectedRow();
        Remarking editing = data.get(idx);
        cmbStatus.setSelectedItem(editing.getStatus());
    }//GEN-LAST:event_tableDataMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String remark = cmbRemark.getSelectedItem().toString();
        RemarkDAO dao = new RemarkDAO();
        List<Remarking> data = dao.filter(remark);
        Integer idx = tableData.getSelectedRow();
        Remarking editing = data.get(idx);
        String status = cmbStatus.getSelectedItem().toString();
        editing.setStatus(status);
        Boolean isUpdate = dao.update(editing);
        if (isUpdate) {
            JOptionPane.showMessageDialog(null, "Thành công", "Thêm sinh viên thành công !", JOptionPane.INFORMATION_MESSAGE);
            LoadData();
        } else {
            JOptionPane.showMessageDialog(null, "Thất bại", "Thêm sinh viên thất bại !", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
	//GEN-LAST:event_btnUpdateActionPerformed
    public void updateCmb() {
        this.cmbRemark.removeAllItems();
        this.cmbStatus.removeAllItems();

        RemarkDAO dao = new RemarkDAO();
        List<String> classes = dao.getRemark();
        for (int i = 0; i < classes.size(); i++) {
            this.cmbRemark.addItem(classes.get(i));
        }
        String[] statusList = {"Đã cập nhật điểm", "Không cập nhật điểm", "Chưa xem"};
        for (String item : statusList) {
            cmbStatus.addItem(item);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbRemark;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblD;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables
}
