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
import model.Encounter;
import model.EncounterHistory;
import model.HospitalDirDirectory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.PatientDirectory;
import model.PersonDirectory;
import model.VitalSignsHistory;

/**
 *
 * @author Deepak Sawalka
 */
public class EncounterHistoryHospitalJFrame extends javax.swing.JFrame {

    /**
     * Creates new form EncounterHistoryHospitalJFrame
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
    public EncounterHistoryHospitalJFrame(PersonDirectory personHistory,PatientDirectory patientHistory,HouseDirectory houseHistory,CommunityDirectory communityHistory,CityDirectory cityHistory,HospitalDirectory hospitalHistory,HospitalDirDirectory hospitalDirHistory,DoctorDirectory doctorHistory,EncounterHistory encounterHistory,VitalSignsHistory vitalSignsHistory) {
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
        this.doctorHistory=doctorHistory;
        this.encounterHistory=encounterHistory;
        this.vitalSignsHistory=vitalSignsHistory;
        populateTableEnj();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderbtn = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        encounterhisttbl = new javax.swing.JTable();
        selectbtn = new javax.swing.JButton();
        patname = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        allergies = new javax.swing.JLabel();
        medhist = new javax.swing.JLabel();
        symptoms = new javax.swing.JLabel();
        temp = new javax.swing.JLabel();
        oxyrate = new javax.swing.JLabel();
        weight = new javax.swing.JLabel();
        bllodpressure = new javax.swing.JLabel();
        resprate = new javax.swing.JLabel();
        bloodgroup = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();
        diagnosislbl = new javax.swing.JLabel();
        medtestlbl = new javax.swing.JLabel();
        prescriptionlbl = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        createbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        encounterhisttbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Gender", "Allergies", "Medical History", "Symptoms", "Temperature", "Blood group", "Weight", "Oxygen level", "Blood Pressure", "Respiratory Rate", "Time", "Diagnosis", "Medical Test", "Prescription"
            }
        ));
        jScrollPane1.setViewportView(encounterhisttbl);

        selectbtn.setText("Select");
        selectbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtnActionPerformed(evt);
            }
        });

        patname.setText("Patient Name");

        age.setText("Age");

        gender.setText("Gender");

        allergies.setText("Allergies");

        medhist.setText("Medical History");

        symptoms.setText("Symptoms");

        temp.setText("Temperature");

        oxyrate.setText("Oxygen Level");

        weight.setText("Body Weight");

        bllodpressure.setText("Blood pressure");

        resprate.setText("Respiratory Rate");

        bloodgroup.setText("Blood Group");

        timelbl.setText("Time");

        diagnosislbl.setText("Diagnosis");

        medtestlbl.setText("Medical test");

        prescriptionlbl.setText("Prescription");

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        createbtn.setText("Create");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        backbtn.setText("<<");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createbtn)
                .addGap(82, 82, 82)
                .addComponent(selectbtn)
                .addGap(99, 99, 99)
                .addComponent(updatebtn)
                .addGap(380, 380, 380))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patname, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allergies, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medhist, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(symptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bloodgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(oxyrate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bllodpressure, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(resprate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(timelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diagnosislbl, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prescriptionlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(medtestlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(backbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(backbtn)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectbtn)
                    .addComponent(updatebtn)
                    .addComponent(createbtn))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloodgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(allergies, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(medhist, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(symptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oxyrate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bllodpressure, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(resprate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diagnosislbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medtestlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(prescriptionlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 62, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtnActionPerformed
        // TODO add your handling code here

        int selectedRowIndex=encounterhisttbl.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Data not Found");
            return;}

        DefaultTableModel model=(DefaultTableModel) encounterhisttbl.getModel();
        Encounter selectedEncounter=(Encounter ) model.getValueAt(selectedRowIndex, 0);

        jTextField1.setText(selectedEncounter.getName());
        jTextField2.setText(String.valueOf(selectedEncounter.getAge()));
        jTextField3.setText(selectedEncounter.getGender());
        jTextField4.setText(selectedEncounter.getAllergies());
        jTextField5.setText(selectedEncounter.getMedicalhistory());
        jTextField6.setText(selectedEncounter.getSymptoms());
        jTextField7.setText(selectedEncounter.getBodytemp());
        jTextField8.setText(selectedEncounter.getBloodgroup());
        jTextField9.setText(String.valueOf(selectedEncounter.getWeight()));
        jTextField10.setText(selectedEncounter.getOxygenlevel());
        jTextField11.setText(selectedEncounter.getBloodpressure());
        jTextField12.setText(selectedEncounter.getResprate());
        jTextField13.setText(selectedEncounter.getTimeslot());
        jTextField14.setText(selectedEncounter.getDiagnosis());
        jTextField15.setText(selectedEncounter.getMedtest());
        jTextField16.setText(selectedEncounter.getPrescription());

    }//GEN-LAST:event_selectbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:

        int i=encounterhisttbl.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) encounterhisttbl.getModel();

        Encounter selectedEncounter=(Encounter) encounterHistory.getEncounterAt(i);

        selectedEncounter.setName(jTextField1.getText());
        selectedEncounter.setAge(Integer.parseInt(jTextField2.getText()));
        selectedEncounter.setGender(jTextField3.getText());
        selectedEncounter.setAllergies(jTextField4.getText());
        selectedEncounter.setMedicalhistory(jTextField5.getText());
        selectedEncounter.setSymptoms(jTextField6.getText());
        selectedEncounter.setBodytemp(jTextField7.getText());
        selectedEncounter.setBloodgroup(jTextField8.getText());
        selectedEncounter.setWeight(Integer.parseInt(jTextField9.getText()));
        selectedEncounter.setOxygenlevel(jTextField10.getText());
        selectedEncounter.setBloodpressure(jTextField11.getText());
        selectedEncounter.setResprate(jTextField12.getText());
        selectedEncounter.setTimeslot(jTextField13.getText());
        selectedEncounter.setDiagnosis(jTextField14.getText());
        selectedEncounter.setMedtest(jTextField15.getText());
        selectedEncounter.setPrescription(jTextField16.getText());

        if(i<0)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }

        model.setValueAt(jTextField1.getText(), i, 0);
        model.setValueAt(jTextField2.getText(), i, 1);
        model.setValueAt(jTextField3.getText(), i, 2);
        model.setValueAt(jTextField4.getText(), i, 3);
        model.setValueAt(jTextField5.getText(), i, 4);

        model.setValueAt(jTextField6.getText(), i, 5);
        model.setValueAt(jTextField7.getText(), i, 6);
        model.setValueAt(jTextField8.getText(), i, 7);
        model.setValueAt(jTextField9.getText(), i, 8);
        model.setValueAt(jTextField10.getText(), i, 9);
        model.setValueAt(jTextField11.getText(), i, 10);
        model.setValueAt(jTextField12.getText(), i, 11);
        model.setValueAt(jTextField13.getText(), i, 12);
        model.setValueAt(jTextField14.getText(), i, 13);
        model.setValueAt(jTextField15.getText(), i, 14);
        model.setValueAt(jTextField16.getText(), i, 15);

        JOptionPane.showMessageDialog(this, "Details Updated Successfully!!");

    }//GEN-LAST:event_updatebtnActionPerformed

    
    private boolean validateData12() {
                if (jTextField1.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Name is required!!");
            return false;
        }
                        if (jTextField2.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Age is required!!");
            return false;
        }
                        if (jTextField3.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Please enter your gender");
            return false;
        }
                        if (jTextField4.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter any allergies or type NA");
            return false;
        }
                                  if (jTextField5.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter medical history or type NA");
            return false;
        }
                  
         if (jTextField6.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter symptoms or type NA");
            return false;
        }
                        if (jTextField7.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter Body temperature");
            return false;
        }
                        if (jTextField8.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter Blood group");
            return false;
        }
                        if (jTextField9.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Weight Required");
            return false;
        }
                                  if (jTextField10.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter Oxygen level");
            return false;
        }      
                                  if (jTextField11.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter Blood pressure");
            return false;
        }   
                                         if (jTextField12.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter Respiratpory rate");
            return false;
        }
                                  if (jTextField13.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Please Enter time");
            return false;
        }      
                                  if (jTextField14.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter diagnosis");
            return false;
        }  
                                                     if (jTextField15.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter medical test");
            return false;
        }  
                                                                        if (jTextField16.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter availibility");
            return false;
        }  
                        
return true;    }

    
    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        // TODO add your handling code here:
        
        
         boolean valid=validateData12();
        if(valid){
        
        String patn=jTextField1.getText();
        int patage=Integer.parseInt(jTextField2.getText());
        String patgender=jTextField3.getText();
        String allergies=jTextField4.getText();
        String medhist=jTextField5.getText();
        String sym=jTextField6.getText();
        String temp=jTextField7.getText();
        String Bloodg=jTextField8.getText();
        int w=Integer.parseInt(jTextField9.getText());
        String oxygenlevel=jTextField10.getText();
        String bloodpressure= jTextField11.getText();
        String respr=jTextField12.getText();
        
        
        
        String time= jTextField13.getText();
       
        String diagnosis= jTextField14.getText();
        String medicaltest= jTextField15.getText();
        String prescription= jTextField16.getText();
        
        Encounter en =encounterHistory.addNewEncounter();
        en.setName(patn);
        en.setAge(patage);
        en.setGender(patgender);
        en.setAllergies(allergies);
        en.setMedicalhistory(medhist);
        en.setSymptoms(sym);
        en.setBodytemp(temp);
        en.setBloodgroup(Bloodg);
        en.setWeight(w);
        en.setOxygenlevel(oxygenlevel);
        en.setBloodpressure(bloodpressure);
        en.setResprate(respr);
        en.setTimeslot(time);
        en.setDiagnosis(diagnosis);
        en.setMedtest(medicaltest);
        en.setPrescription(prescription);
        
       
        JOptionPane.showMessageDialog(this, "Encounter  Created!!");}
    }//GEN-LAST:event_createbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        dispose();
        ViewHospitalAdminJFrame v=new ViewHospitalAdminJFrame(personHistory, patientHistory,houseHistory,communityHistory,cityHistory,hospitalHistory,hospitalDirHistory,doctorHistory,encounterHistory,vitalSignsHistory);
        v.setVisible(true);
        
    }//GEN-LAST:event_backbtnActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel allergies;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel bllodpressure;
    private javax.swing.JLabel bloodgroup;
    private javax.swing.JButton createbtn;
    private javax.swing.JLabel diagnosislbl;
    private javax.swing.JTable encounterhisttbl;
    private javax.swing.JLabel gender;
    private javax.swing.ButtonGroup genderbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel medhist;
    private javax.swing.JLabel medtestlbl;
    private javax.swing.JLabel oxyrate;
    private javax.swing.JLabel patname;
    private javax.swing.JLabel prescriptionlbl;
    private javax.swing.JLabel resprate;
    private javax.swing.JButton selectbtn;
    private javax.swing.JLabel symptoms;
    private javax.swing.JLabel temp;
    private javax.swing.JLabel timelbl;
    private javax.swing.JButton updatebtn;
    private javax.swing.JLabel weight;
    // End of variables declaration//GEN-END:variables

private void populateTableEnj() {
        DefaultTableModel model=(DefaultTableModel) encounterhisttbl.getModel();
        model.setRowCount(0);
        
        for (Encounter en : encounterHistory.getEncounterHistory())
        {
            Object[] col=new Object[16];
            col[0]= en;
            col[1]= en.getAge();
            col[2]= en.getGender();
            col[3]= en.getAllergies();
            col[4]=en.getMedicalhistory();
            
            col[5]= en.getSymptoms();
            col[6]= en.getBodytemp();
            col[7]= en.getBloodgroup();
            col[8]= en.getWeight();
            col[9]= en.getOxygenlevel();
            col[10]= en.getBloodpressure();
           col[11]= en.getResprate();
            col[12]= en.getTimeslot();
            col[13]= en.getDiagnosis();
            col[14]= en.getMedtest();
            col[15]= en.getPrescription();
            
                   
            model.addRow(col);
            
        }
}






}
