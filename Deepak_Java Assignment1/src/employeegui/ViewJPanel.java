/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package employeegui;

import employeemodel.EmployeeDetails;
import employeemodel.EmployeeHistoryDetails;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Deepak Sawalka
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    EmployeeHistoryDetails history;
    public ViewJPanel(EmployeeHistoryDetails history) {
        initComponents();
        this.history = history;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        txtCellNum = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmpId = new javax.swing.JTextField();
        txtImg = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTeamInfo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPosTitle = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("                                                                                       VIEW EMPLOYEE PROFILE");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Emp Id", "Age", "Gender", "Date", "Level", "Team Info", "Postion Title", "Contact No.", "Email-Id", "Image"
            }
        ));
        jScrollPane2.setViewportView(tblView);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Gender:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Image:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Level:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Postion Title:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Date:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Contact No. :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Age:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Team Info:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Email-Id:");

        txtPosTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosTitleActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Emp Id:");

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsearchKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Search:");

        btnupdate.setText("Update");
        btnupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupdateMouseClicked(evt);
            }
        });
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel2))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(274, 274, 274)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel6)))
                                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(55, 55, 55)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtImg, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCellNum, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(btnView)
                        .addGap(32, 32, 32)
                        .addComponent(btnupdate)
                        .addGap(42, 42, 42)
                        .addComponent(btnDelete)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel10)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCellNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel13))
                            .addComponent(txtImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnupdate)
                    .addComponent(btnDelete))
                .addGap(92, 92, 92))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex=tblView.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
             return;}
             
          DefaultTableModel model=(DefaultTableModel) tblView.getModel();
          EmployeeDetails selectedEmployees=(EmployeeDetails ) model.getValueAt(selectedRowIndex, 0);
          
          history.deleteEmployees(selectedEmployees);
          JOptionPane.showMessageDialog(this, "Employee Profile Deleted");
          populateTable();
         txtName.setText("");
        txtEmpId.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtDate.setText("");
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPosTitle.setText("");
        txtCellNum.setText("");
        txtEmailId.setText("");
        txtImg.setText("");
          
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtPosTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosTitleActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex=tblView.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Data not Found");
             return;}
             
          DefaultTableModel model=(DefaultTableModel) tblView.getModel();
          EmployeeDetails selectedEmployees=(EmployeeDetails ) model.getValueAt(selectedRowIndex, 0);
          
          txtName.setText(selectedEmployees.getName());
          txtEmpId.setText(String.valueOf(selectedEmployees.getEmpId()));
          txtAge.setText(String.valueOf(selectedEmployees.getAge()));
          txtGender.setText(selectedEmployees.getGender());
          txtDate.setText(selectedEmployees.getDate());
          txtLevel.setText(String.valueOf(selectedEmployees.getLevel()));
          txtTeamInfo.setText(selectedEmployees.getTeamInfo());
          txtPosTitle.setText(selectedEmployees.getPosTitle());
          txtCellNum.setText(String.valueOf(selectedEmployees.getCellNum()));
          txtEmailId.setText(selectedEmployees.getEmailId());
          txtImg.setText(selectedEmployees.getImg());
          
          
          
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) tblView.getModel();
        TableRowSorter<DefaultTableModel> tblr=new TableRowSorter<DefaultTableModel>(model);
        tblView.setRowSorter(tblr);
        tblr.setRowFilter(RowFilter.regexFilter(txtsearch.getText().trim()));
        
    }//GEN-LAST:event_txtsearchKeyPressed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        int i=tblView.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) tblView.getModel();
        if(i>=0)
        {
            model.setValueAt(txtName.getText(), i, 0);
            model.setValueAt(txtEmpId.getText(), i, 1);
            model.setValueAt(txtAge.getText(), i, 2);
            model.setValueAt(txtGender.getText(), i, 3);
            model.setValueAt(txtDate.getText(), i, 4);
            model.setValueAt(txtLevel.getText(), i, 5);
            model.setValueAt(txtTeamInfo.getText(), i, 6);
            model.setValueAt(txtPosTitle.getText(), i, 7);
            model.setValueAt(txtCellNum.getText(), i, 8);
            model.setValueAt(txtEmailId.getText(), i, 9);
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }//GEN-LAST:event_btnupdateActionPerformed
/*
    private void btnupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateMouseClicked

*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellNum;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtImg;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosTitle;
    private javax.swing.JTextField txtTeamInfo;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model=(DefaultTableModel) tblView.getModel();
        model.setRowCount(0);
        
        for (EmployeeDetails ed : history.getHistory())
        {
            Object[] row=new Object[11];
            row[0]= ed;
            row[1]= ed.getEmpId();
            row[2]= ed.getAge();
            row[3]= ed.getGender();
            row[4]= ed.getDate();
            row[5]= ed.getLevel();
            row[6]= ed.getTeamInfo();
            row[7]= ed.getPosTitle();
            row[8]= ed.getCellNum();
            row[9]= ed.getEmailId();
            row[10]= ed.getImg();
            
            model.addRow(row);
            
        }
        
        
        
    }
}
