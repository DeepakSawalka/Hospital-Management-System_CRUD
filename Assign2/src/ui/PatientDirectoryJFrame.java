/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirDirectory;


import model.HospitalDirectory;

import model.HouseDirectory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSignsHistory;

/**
 *
 * @author Deepak Sawalka Sawalka
 */
public class PatientDirectoryJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PatientDirectoryJFrame
     */
    PersonDirectory personHistory;
    PatientDirectory patientHistory;
    HouseDirectory houseHistory;
    CommunityDirectory communityHistory;
    CityDirectory cityHistory;
    HospitalDirectory hospitalHistory;
    HospitalDirDirectory hospitalDirHistory;
    DoctorDirectory doctorHistory;
    EncounterHistory encounterHistory;
     VitalSignsHistory vitalSignsHistory;
    
   
    
    public PatientDirectoryJFrame(PersonDirectory personHistory,PatientDirectory patientHistory, HouseDirectory houseHistory,CommunityDirectory communityHistory,
    CityDirectory cityHistory,
    HospitalDirectory hospitalHistory,
    HospitalDirDirectory hospitalDirHistory,DoctorDirectory doctorHistory,EncounterHistory encounterHistory,VitalSignsHistory vitalSignsHistory) {
        initComponents();
        this.personHistory=personHistory;
        this.patientHistory=patientHistory;
        this.houseHistory=houseHistory;
        this.communityHistory=communityHistory;
        this.cityHistory=cityHistory;
        this.hospitalHistory=hospitalHistory;
        this.hospitalDirHistory=hospitalDirHistory;
        this.doctorHistory=doctorHistory;
        this.encounterHistory=encounterHistory;
        this.vitalSignsHistory=vitalSignsHistory;
        populateTablePat();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        patientdirectorytbl = new javax.swing.JTable();
        viewbtnpd = new javax.swing.JButton();
        updatebtnpd = new javax.swing.JButton();
        deletebtnpd = new javax.swing.JButton();
        namelblpd = new javax.swing.JLabel();
        agelblpd = new javax.swing.JLabel();
        genderlblpd = new javax.swing.JLabel();
        emailidlblpd = new javax.swing.JLabel();
        nametxtpd = new javax.swing.JTextField();
        agetxtpd = new javax.swing.JTextField();
        gendertxtpd = new javax.swing.JTextField();
        emailidtxtpd = new javax.swing.JTextField();
        contactnolblpd = new javax.swing.JLabel();
        maritallblpd = new javax.swing.JLabel();
        insurancelblpd = new javax.swing.JLabel();
        contactnotxtpd = new javax.swing.JTextField();
        maritaltxtpd = new javax.swing.JTextField();
        insurancetxtpd = new javax.swing.JTextField();
        allergieslblpd = new javax.swing.JLabel();
        emergencylblpd = new javax.swing.JLabel();
        medicallblpd = new javax.swing.JLabel();
        symptomslblpd = new javax.swing.JLabel();
        allergiestxtpd = new javax.swing.JTextField();
        emergencytxtpd = new javax.swing.JTextField();
        medicaltxtpd = new javax.swing.JTextField();
        symptomstxtpd = new javax.swing.JTextField();
        backbtnpd = new javax.swing.JButton();
        createbtnj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patientdirectorytbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "EmailID", "ContactNo", "Marital Status", "Insurance", "Allergies", "Emergency Contact", "Medical History", "Symptoms"
            }
        ));
        jScrollPane1.setViewportView(patientdirectorytbl);

        viewbtnpd.setText("View");
        viewbtnpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnpdActionPerformed(evt);
            }
        });

        updatebtnpd.setText("Update");
        updatebtnpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnpdActionPerformed(evt);
            }
        });

        deletebtnpd.setText("Delete");
        deletebtnpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnpdActionPerformed(evt);
            }
        });

        namelblpd.setText("Name");

        agelblpd.setText("Age");

        genderlblpd.setText("Gender");

        emailidlblpd.setText("Email-ID");

        contactnolblpd.setText("Contact No");

        maritallblpd.setText("Marital Status");

        insurancelblpd.setText("Insurance");

        insurancetxtpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insurancetxtpdActionPerformed(evt);
            }
        });

        allergieslblpd.setText("Allergies");

        emergencylblpd.setText("Emergency Contact");

        medicallblpd.setText("Medical History");

        symptomslblpd.setText("Symptoms");

        medicaltxtpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicaltxtpdActionPerformed(evt);
            }
        });

        backbtnpd.setText("Back");
        backbtnpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnpdActionPerformed(evt);
            }
        });

        createbtnj.setText("Create");
        createbtnj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namelblpd)
                            .addComponent(agelblpd)
                            .addComponent(genderlblpd)
                            .addComponent(emailidlblpd))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gendertxtpd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agetxtpd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nametxtpd)
                            .addComponent(emailidtxtpd, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maritallblpd)
                            .addComponent(insurancelblpd)
                            .addComponent(allergieslblpd)
                            .addComponent(contactnolblpd))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactnotxtpd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(insurancetxtpd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(maritaltxtpd, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(allergiestxtpd, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(146, 146, 146)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(symptomslblpd)
                                            .addComponent(medicallblpd)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(emergencylblpd)))))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(medicaltxtpd)
                                .addComponent(symptomstxtpd, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                            .addComponent(emergencytxtpd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(createbtnj)
                        .addGap(146, 146, 146)
                        .addComponent(viewbtnpd)
                        .addGap(151, 151, 151)
                        .addComponent(updatebtnpd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addComponent(deletebtnpd)
                        .addGap(227, 227, 227)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(backbtnpd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backbtnpd)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewbtnpd)
                            .addComponent(updatebtnpd)
                            .addComponent(deletebtnpd)
                            .addComponent(createbtnj))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(namelblpd)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nametxtpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(contactnolblpd)
                                        .addComponent(contactnotxtpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(43, 43, 43)
                                .addComponent(agelblpd))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(agetxtpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(maritaltxtpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(maritallblpd)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(genderlblpd)
                                    .addComponent(gendertxtpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(medicallblpd)
                                    .addComponent(medicaltxtpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(emailidlblpd))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(insurancelblpd)
                                    .addComponent(insurancetxtpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emergencytxtpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emergencylblpd))
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailidtxtpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(symptomslblpd)
                            .addComponent(symptomstxtpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allergieslblpd)
                            .addComponent(allergiestxtpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void medicaltxtpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicaltxtpdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicaltxtpdActionPerformed

    private void insurancetxtpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insurancetxtpdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insurancetxtpdActionPerformed

    private void viewbtnpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnpdActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex=patientdirectorytbl.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Data not Found");
             return;}
             
          DefaultTableModel model=(DefaultTableModel) patientdirectorytbl.getModel();
          Patient selectedPatient=(Patient) model.getValueAt(selectedRowIndex, 0);
          
          nametxtpd.setText(selectedPatient.getName());
          agetxtpd.setText(String.valueOf(selectedPatient.getAge()));
          gendertxtpd.setText(selectedPatient.getGender());
          emailidtxtpd.setText(selectedPatient.getEmailid());
          contactnotxtpd.setText(String.valueOf(selectedPatient.getContactno()));
          
          maritaltxtpd.setText(selectedPatient.getMaritalstatus());
          insurancetxtpd.setText(selectedPatient.getInsurance());
          allergiestxtpd.setText(selectedPatient.getAllergies());
          emergencytxtpd.setText(String.valueOf(selectedPatient.getEmergencycontact()));
          medicaltxtpd.setText(selectedPatient.getMedicalhistory());
          symptomstxtpd.setText(selectedPatient.getSymptoms());
          
          
    }//GEN-LAST:event_viewbtnpdActionPerformed

    private void backbtnpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnpdActionPerformed
        // TODO add your handling code here:
        dispose();
        SystemJFrame systemjframe=new SystemJFrame(personHistory, patientHistory,houseHistory,communityHistory,cityHistory,hospitalHistory,hospitalDirHistory,doctorHistory,encounterHistory,vitalSignsHistory);
        systemjframe.setVisible(true);
        
    }//GEN-LAST:event_backbtnpdActionPerformed

    private void deletebtnpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnpdActionPerformed
        // TODO add your handling code here:
        int i=patientdirectorytbl.getSelectedRow();
        if (i<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
             return;}
             
          DefaultTableModel model=(DefaultTableModel) patientdirectorytbl.getModel();
          Patient selectedPatient=(Patient) model.getValueAt(i, 0);
          int response=JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
          if(response==JOptionPane.YES_OPTION){
             
          patientHistory.deletePatient(selectedPatient);
          JOptionPane.showMessageDialog(this, "Patient Records Deleted Successfully!!");
          }
          else {
              JOptionPane.showMessageDialog(this, "OK!!");
          }
        
          
          populateTablePat();
         nametxtpd.setText("");
          agetxtpd.setText("");
           gendertxtpd.setText("");
            emailidtxtpd.setText("");
             contactnotxtpd.setText("");
             
             maritaltxtpd.setText("");
             insurancetxtpd.setText("");
             allergiestxtpd.setText("");
             emergencytxtpd.setText("");
             medicaltxtpd.setText("");
             symptomstxtpd.setText("");
              
    }//GEN-LAST:event_deletebtnpdActionPerformed

    private void updatebtnpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnpdActionPerformed
        // TODO add your handling code here:
         int i=patientdirectorytbl.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) patientdirectorytbl.getModel();
        
        Patient selectedPatient=(Patient) patientHistory.getPatientAt(i);
     
        selectedPatient.setName(nametxtpd.getText());
        selectedPatient.setAge(Integer.parseInt(agetxtpd.getText()));
        selectedPatient.setGender(gendertxtpd.getText());
        selectedPatient.setEmailid(emailidtxtpd.getText());
        selectedPatient.setContactno(Long.parseLong(contactnotxtpd.getText()));
        
        selectedPatient.setMaritalstatus(maritaltxtpd.getText());
        selectedPatient.setInsurance(insurancetxtpd.getText());
        selectedPatient.setAllergies(allergiestxtpd.getText());
        selectedPatient.setEmergencycontact(Long.parseLong(emergencytxtpd.getText()));
        selectedPatient.setMedicalhistory(medicaltxtpd.getText());
        selectedPatient.setSymptoms(symptomstxtpd.getText());
        
        
        
        
        if(i<0)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
          
            model.setValueAt(nametxtpd.getText(), i, 0);
            model.setValueAt(agetxtpd.getText(), i, 1);
            model.setValueAt(gendertxtpd.getText(), i, 2);
            model.setValueAt(emailidtxtpd.getText(), i, 3);
            model.setValueAt(contactnotxtpd.getText(), i, 4);
           
            model.setValueAt(maritaltxtpd.getText(), i, 5);
            model.setValueAt(insurancetxtpd.getText(), i, 6);
            model.setValueAt(allergiestxtpd.getText(), i, 7);
            model.setValueAt(emergencytxtpd.getText(), i, 8);
            model.setValueAt(medicaltxtpd.getText(), i, 9);
            model.setValueAt(symptomstxtpd.getText(), i, 10);
            JOptionPane.showMessageDialog(this, "Details Updated Successfully!!");
            
       
                              
    }//GEN-LAST:event_updatebtnpdActionPerformed

    private boolean validateData4() {
                if (nametxtpd.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Name is required!!");
            return false;
        }
                        if (agetxtpd.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Age is required!!");
            return false;
        }
                        if (gendertxtpd.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Please enter your gender");
            return false;
        }
                        if (emailidtxtpd.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "EmailId is required");
            return false;
        }
                                  if (contactnotxtpd.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter Contact Number");
            return false;
        }
                  
         if (maritaltxtpd.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter marital status");
            return false;
        }
                        if (insurancetxtpd.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "If no Health Insurance type NA");
            return false;
        }
                        if (allergiestxtpd.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Please Enter any allergies or Type NA");
            return false;
        }
                        if (emergencytxtpd.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Emrgency contact number required");
            return false;
        }
                                  if (medicaltxtpd.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Entemedical history or type NA");
            return false;
        }      
                                  if (symptomstxtpd.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter symptoms or type NA");
            return false;
        }      
                        
return true;    }
    private void createbtnjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnjActionPerformed
        // TODO add your handling code here:
        boolean valid=validateData4();
        if(valid){
        String name= nametxtpd.getName();
        int age= Integer.parseInt(agetxtpd.getText());
        String gender= gendertxtpd.getText();
        String emailid= emailidtxtpd.getText();
        long contactno= Long.parseLong(contactnotxtpd.getText());
        String maritalstatus= maritaltxtpd.getText();
        String insurance= insurancetxtpd.getText();
        
        
        
        
        
        
         String allergies= allergiestxtpd.getText();
        long emergencycontact= Long.parseLong(emergencytxtpd.getText());
        String medicalhistory= medicaltxtpd.getText();
        String symptoms= symptomstxtpd.getText();
        
        Patient pa =patientHistory.addNewPatient();
        pa.setName(name);
        pa.setAge(age);
        pa.setGender(gender);
        pa.setEmailid(emailid);
        pa.setContactno(contactno);
       
        pa.setMaritalstatus(maritalstatus);
        pa.setInsurance(insurance);
        pa.setAllergies(allergies);
        pa.setEmergencycontact(emergencycontact);
        pa.setMedicalhistory(medicalhistory);
        pa.setSymptoms(symptoms);
        JOptionPane.showMessageDialog(this, "Patient Registered Successfully!!");}
        
    }//GEN-LAST:event_createbtnjActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agelblpd;
    private javax.swing.JTextField agetxtpd;
    private javax.swing.JLabel allergieslblpd;
    private javax.swing.JTextField allergiestxtpd;
    private javax.swing.JButton backbtnpd;
    private javax.swing.JLabel contactnolblpd;
    private javax.swing.JTextField contactnotxtpd;
    private javax.swing.JButton createbtnj;
    private javax.swing.JButton deletebtnpd;
    private javax.swing.JLabel emailidlblpd;
    private javax.swing.JTextField emailidtxtpd;
    private javax.swing.JLabel emergencylblpd;
    private javax.swing.JTextField emergencytxtpd;
    private javax.swing.JLabel genderlblpd;
    private javax.swing.JTextField gendertxtpd;
    private javax.swing.JLabel insurancelblpd;
    private javax.swing.JTextField insurancetxtpd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maritallblpd;
    private javax.swing.JTextField maritaltxtpd;
    private javax.swing.JLabel medicallblpd;
    private javax.swing.JTextField medicaltxtpd;
    private javax.swing.JLabel namelblpd;
    private javax.swing.JTextField nametxtpd;
    private javax.swing.JTable patientdirectorytbl;
    private javax.swing.JLabel symptomslblpd;
    private javax.swing.JTextField symptomstxtpd;
    private javax.swing.JButton updatebtnpd;
    private javax.swing.JButton viewbtnpd;
    // End of variables declaration//GEN-END:variables

private void populateTablePat() {
        DefaultTableModel model=(DefaultTableModel) patientdirectorytbl.getModel();
        model.setRowCount(0);
        
        for (Patient pa : patientHistory.getPatientHistory())
        {
            Object[] col=new Object[11];
            col[0]= pa;
            col[1]= pa.getAge();
            col[2]= pa.getGender();
            col[3]= pa.getEmailid();
            col[4]= pa.getContactno();
            
            col[5]= pa.getMaritalstatus();
            col[6]= pa.getInsurance();
            col[7]= pa.getAllergies();
            col[8]= pa.getEmergencycontact();
            col[9]= pa.getMedicalhistory();
            col[10]= pa.getSymptoms();
           
                   
            model.addRow(col);
            
        }
}



}
