/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import DAO.ScoreDAO;
import Model.Score;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author coluc
 */
public class FormScore extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmStudent
     */
    public FormScore() {
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
        cmbClass = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbResult = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        soRot_2 = new javax.swing.JLabel();
        soRot_1 = new javax.swing.JLabel();
        soDau_1 = new javax.swing.JLabel();
        soDau_2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Lớp học");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Lọc kết quả");

        cmbResult.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbResult.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbResultItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Số rớt");

        soRot_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        soRot_2.setText("10");

        soRot_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        soRot_1.setText("10");

        soDau_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        soDau_1.setText("10");

        soDau_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        soDau_2.setText("10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(soDau_1)
                        .addGap(80, 80, 80)
                        .addComponent(soDau_2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49)
                        .addComponent(soRot_1)
                        .addGap(84, 84, 84)
                        .addComponent(soRot_2)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soDau_1)
                    .addComponent(soDau_2))
                .addGap(325, 325, 325)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(soRot_2)
                        .addComponent(soRot_1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Số lượng");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Số đậu");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Phần trăm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(cmbClass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7)))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbClass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        String className = cmbClass.getSelectedItem().toString();
        Integer filter = cmbResult.getSelectedIndex();
        ScoreDAO dao = new ScoreDAO();
        List<Score> data = dao.getAllByFilter(filter, className);
        List<String> statistic = dao.statistic(data);
        soDau_1.setText(statistic.get(0));
        soRot_1.setText(statistic.get(1));
        soDau_2.setText(statistic.get(2) + " %");
        soRot_2.setText(statistic.get(3) + " %");
        String[][] dataTable = new String[data.size()][8];
        for (int i = 0; i < data.size(); i++) {
            Score item = data.get(i);
            dataTable[i][0] = String.valueOf(item.getNo());
            dataTable[i][1] = item.getStudentId();
            dataTable[i][2] = item.getFullname();
            dataTable[i][3] = item.getMiddleExam().toString();
            dataTable[i][4] = item.getFinalExam().toString();
            dataTable[i][5] = item.getPlusExam().toString();
            dataTable[i][6] = item.getAvgScore().toString();
            dataTable[i][7] = item.getAvgScore() >= 5.0 ? "Đậu" : "Rớt";
        }
        TableModel table;
        String[] columnNames = {"STT", "MSSV", "Họ tên", "Điểm GK", "Điểm CK", "Điểm khác", "Điểm tổng", "Kết quả"};
        table = new DefaultTableModel(dataTable, columnNames);
        tableData.removeAll();
        tableData.setModel(table);
    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       updateCmb();
        cmbResult.removeAllItems();
        cmbResult.addItem("Tất cả");
        cmbResult.addItem("Đậu");
        cmbResult.addItem("Rớt");
        //LoadData();
    }//GEN-LAST:event_formInternalFrameOpened


    private void cmbClassItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClassItemStateChanged
        // TODO add your handling code here:
      Integer classID = cmbClass.getSelectedIndex();
        if (classID >= 0) {
            LoadData();
        }

    }//GEN-LAST:event_cmbClassItemStateChanged

    private void cmbResultItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbResultItemStateChanged
        // TODO add your handling code here:
     Integer classID = cmbClass.getSelectedIndex();
        if (classID >= 0) {
            LoadData();
        }
    }//GEN-LAST:event_cmbResultItemStateChanged

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       Integer classID = cmbClass.getSelectedIndex();
        if (classID >= 0) {
            List<Score> list = new ArrayList();
            for (int i = 0; i < tableData.getRowCount(); i++) {
                Integer no = Integer.valueOf((String)tableData.getValueAt(i, 0));
                String studentId = (String) tableData.getValueAt(i, 1);
                String fullname = (String) tableData.getValueAt(i, 2);
                Float middleExam = Float.valueOf((String) tableData.getValueAt(i, 3));
                Float finalExam = Float.valueOf((String) tableData.getValueAt(i, 4));
                Float plusExam = Float.valueOf((String) tableData.getValueAt(i, 5));
                Float avgScore = Float.valueOf((String) tableData.getValueAt(i, 6));
                String subjectID = cmbClass.getSelectedItem().toString();
                Score item = new Score(studentId, fullname, middleExam, finalExam, plusExam, avgScore, subjectID);
                item.setNo(no);
                list.add(item);
            }
            
            ScoreDAO dao = new ScoreDAO();
            Boolean isUpdate = dao.updateFromList(list);
            if (isUpdate) {
                JOptionPane.showMessageDialog(null, "Cập nhật thành công", "Đã cập nhật điểm số vào sơ sở dữ liệu", JOptionPane.INFORMATION_MESSAGE);
            }
            LoadData();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cmbClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbClassActionPerformed
    public void updateCmb() {
       ScoreDAO dao = new ScoreDAO();
        List<String> classes = dao.getClasses();
        this.cmbClass.removeAllItems();
        for (int i = 0; i < classes.size(); i++) {
            this.cmbClass.addItem(classes.get(i));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbClass;
    private javax.swing.JComboBox<String> cmbResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel soDau_1;
    private javax.swing.JLabel soDau_2;
    private javax.swing.JLabel soRot_1;
    private javax.swing.JLabel soRot_2;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables
}