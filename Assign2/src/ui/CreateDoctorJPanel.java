/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Doctor;
import model.DoctorDirectory;
import model.Patient;

/**
 *
 * @author Deepak Sawalka
 */
public class CreateDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDoctorJPanel
     */
    DoctorDirectory doctorHistory;
    public CreateDoctorJPanel(DoctorDirectory doctorHistory) {
        initComponents();
        this.doctorHistory=doctorHistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namecdoclbl = new javax.swing.JLabel();
        degreecdoclbl = new javax.swing.JLabel();
        contactnocdoclbl = new javax.swing.JLabel();
        specialitycdoclbl = new javax.swing.JLabel();
        emailidcdoclbl = new javax.swing.JLabel();
        experiencecdoclbl = new javax.swing.JLabel();
        gendercdoclbl = new javax.swing.JLabel();
        namecdoctxt = new javax.swing.JTextField();
        gendercdoctxt = new javax.swing.JTextField();
        emailidcdoctxt = new javax.swing.JTextField();
        contactnocdoctxt = new javax.swing.JTextField();
        degreecdoctxt = new javax.swing.JTextField();
        specialitycdoctxt = new javax.swing.JTextField();
        experiencecdoctxt = new javax.swing.JTextField();
        submitcdocbtn = new javax.swing.JButton();

        namecdoclbl.setText("Name");

        degreecdoclbl.setText("Degree");

        contactnocdoclbl.setText("Contact No");

        specialitycdoclbl.setText("Speciality");

        emailidcdoclbl.setText("Email ID");

        experiencecdoclbl.setText("Experience");

        gendercdoclbl.setText("Gender");

        submitcdocbtn.setText("Submit");
        submitcdocbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitcdocbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactnocdoclbl)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(gendercdoctxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(namecdoctxt, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(contactnocdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(namecdoclbl)
                                                .addComponent(gendercdoclbl))
                                            .addGap(265, 265, 265))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(emailidcdoctxt)
                                            .addGap(167, 167, 167)))
                                    .addComponent(emailidcdoclbl))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(experiencecdoclbl)
                                    .addComponent(degreecdoclbl)
                                    .addComponent(degreecdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(specialitycdoclbl)
                                    .addComponent(specialitycdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(experiencecdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(submitcdocbtn)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namecdoclbl)
                    .addComponent(degreecdoclbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namecdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(degreecdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specialitycdoclbl)
                    .addComponent(gendercdoclbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gendercdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specialitycdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailidcdoclbl)
                    .addComponent(experiencecdoclbl))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailidcdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(experiencecdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(contactnocdoclbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactnocdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(submitcdocbtn)
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitcdocbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitcdocbtnActionPerformed
        // TODO add your handling code here:
        String name= namecdoctxt.getText();
        
        String gender= gendercdoctxt.getText();
        String emailid= emailidcdoctxt.getText();
        long contactno= Long.parseLong(contactnocdoctxt.getText());
        String degree= degreecdoctxt.getText();
        String speciality= specialitycdoctxt.getText();
        String experience = (experiencecdoctxt.getText());
        
        
        Doctor d =doctorHistory.addNewDoctor();
        d.setName(name);
        d.setGender(gender);
        d.setEmailid(emailid);
        d.setContactno(contactno);
        d.setDegree(degree);
        d.setSpeciality(speciality);
        d.setExperience(experience);
        JOptionPane.showMessageDialog(this, "Doctor Registered Successfully!!");
        
        
        
        namecdoctxt.setText("");
        gendercdoctxt.setText("");
        emailidcdoctxt.setText("");
        contactnocdoctxt.setText("");
        degreecdoctxt.setText("");
        specialitycdoctxt.setText("");
        experiencecdoctxt.setText("");
    }//GEN-LAST:event_submitcdocbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contactnocdoclbl;
    private javax.swing.JTextField contactnocdoctxt;
    private javax.swing.JLabel degreecdoclbl;
    private javax.swing.JTextField degreecdoctxt;
    private javax.swing.JLabel emailidcdoclbl;
    private javax.swing.JTextField emailidcdoctxt;
    private javax.swing.JLabel experiencecdoclbl;
    private javax.swing.JTextField experiencecdoctxt;
    private javax.swing.JLabel gendercdoclbl;
    private javax.swing.JTextField gendercdoctxt;
    private javax.swing.JLabel namecdoclbl;
    private javax.swing.JTextField namecdoctxt;
    private javax.swing.JLabel specialitycdoclbl;
    private javax.swing.JTextField specialitycdoctxt;
    private javax.swing.JButton submitcdocbtn;
    // End of variables declaration//GEN-END:variables
}