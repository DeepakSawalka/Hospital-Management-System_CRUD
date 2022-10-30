/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterHistory;


import model.HospitalDirDirectory;
import model.HospitalDirectory;

import model.HouseDirectory;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSignsHistory;

/**
 *
 * @author Deepak Sawalka
 */
public class PersonJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PersonJFrame
     */
    PatientDirectory patientHistory;
    PersonDirectory personHistory;
   HouseDirectory houseHistory;
   CommunityDirectory communityHistory;
    CityDirectory cityHistory;
    HospitalDirectory hospitalHistory;
    HospitalDirDirectory hospitalDirHistory;
    DoctorDirectory doctorHistory;
    EncounterHistory encounterHistory;
    VitalSignsHistory vitalSignsHistory;
    
    String gender;
    
    public PersonJFrame(PersonDirectory personHistory, PatientDirectory patientHistory,HouseDirectory houseHistory,CommunityDirectory communityHistory,
    CityDirectory cityHistory,
    HospitalDirectory hospitalHistory,
    HospitalDirDirectory hospitalDirHistory,DoctorDirectory doctorHistory,EncounterHistory encounterHistory,VitalSignsHistory vitalSignsHistory) {
        initComponents();
        this.personHistory=personHistory;
        this.patientHistory = patientHistory;
        this.houseHistory=houseHistory;
       this.communityHistory=communityHistory;
        this.cityHistory=cityHistory;
        this.hospitalHistory=hospitalHistory;
        this.hospitalDirHistory=hospitalDirHistory;
        this.doctorHistory=doctorHistory;
        this.encounterHistory=encounterHistory;
        this.vitalSignsHistory=vitalSignsHistory;
       
        
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
        namelbl = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        agelbl = new javax.swing.JLabel();
        genderlbl = new javax.swing.JLabel();
        emailidlbl = new javax.swing.JLabel();
        emailidtxt = new javax.swing.JTextField();
        contactnolbl = new javax.swing.JLabel();
        contactnotxt = new javax.swing.JTextField();
        passwordlbl = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JPasswordField();
        confirmpasswordlbl = new javax.swing.JLabel();
        confirmpasswordtxt = new javax.swing.JPasswordField();
        submitbtn = new javax.swing.JButton();
        maleradbtn = new javax.swing.JRadioButton();
        femaleradbtn = new javax.swing.JRadioButton();
        othersradbtn = new javax.swing.JRadioButton();
        agespinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namelbl.setText("Name");

        agelbl.setText("Age");

        genderlbl.setText("Gender");

        emailidlbl.setText("Email-ID");

        contactnolbl.setText("Contact No");

        passwordlbl.setText("Password");

        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });

        confirmpasswordlbl.setText("Confirm Password");

        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        genderbtn.add(maleradbtn);
        maleradbtn.setText("Male");

        genderbtn.add(femaleradbtn);
        femaleradbtn.setText("Female");

        genderbtn.add(othersradbtn);
        othersradbtn.setText("Others");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agelbl)
                    .addComponent(genderlbl)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(maleradbtn)
                        .addGap(18, 18, 18)
                        .addComponent(femaleradbtn)
                        .addGap(18, 18, 18)
                        .addComponent(othersradbtn))
                    .addComponent(agespinner, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailidlbl)
                    .addComponent(contactnolbl)
                    .addComponent(passwordlbl)
                    .addComponent(contactnotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(confirmpasswordlbl)
                    .addComponent(confirmpasswordtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(passwordtxt)
                    .addComponent(emailidtxt))
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(submitbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelbl)
                    .addComponent(emailidlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(contactnolbl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agelbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactnotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agespinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderlbl)
                    .addComponent(passwordlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maleradbtn)
                    .addComponent(femaleradbtn)
                    .addComponent(othersradbtn))
                .addGap(39, 39, 39)
                .addComponent(confirmpasswordlbl)
                .addGap(18, 18, 18)
                .addComponent(confirmpasswordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(submitbtn)
                .addContainerGap(95, Short.MAX_VALUE))
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

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtxtActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        // TODO add your handling code here:
        String name= nametxt.getText();
        int age= (int)agespinner.getValue();
         if(maleradbtn.isSelected()==true)
        {
             gender = "Male";
        }
        if(femaleradbtn.isSelected()==true)
        {
            gender = "Female";
        }
        if(othersradbtn.isSelected()==true)
        {
            gender = "Others";
        }
        String emailid= emailidtxt.getText();
        long contactno= Long.parseLong(contactnotxt.getText());
        String password= passwordtxt.getText();
        String confirmpassword= confirmpasswordtxt.getText();
        
        Person p =personHistory.addNewPerson();
        p.setName(name);
        p.setAge(age);
        p.setGender(gender);
        p.setEmailid(emailid);
        p.setContactno(contactno);
        p.setPassword(password);
        p.setConfirmpassword(confirmpassword);
        
        JOptionPane.showMessageDialog(this, "Person Registered Successfully!!");
        dispose();
        
        
        
        PatientJFrame pat=new PatientJFrame(personHistory, patientHistory,houseHistory,communityHistory,cityHistory,hospitalHistory,hospitalDirHistory,doctorHistory,encounterHistory,vitalSignsHistory);
        pat.namelblpat.setText(nametxt.getText());
        pat.agelblpat.setText(agespinner.getValue().toString());
        pat.genderlblpat.setText(gender);
        pat.emailidlblpat.setText(emailidtxt.getText());
        pat.contactnolblpat.setText(contactnotxt.getText());
      
        pat.setVisible(true);
        
        
        agespinner.setValue(18);
        genderbtn.clearSelection();
        emailidtxt.setText("");
        contactnotxt.setText("");
        passwordtxt.setText("");
        confirmpasswordtxt.setText("");
        
        
       
        
        
      
        
    }//GEN-LAST:event_submitbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agelbl;
    private javax.swing.JSpinner agespinner;
    private javax.swing.JLabel confirmpasswordlbl;
    private javax.swing.JPasswordField confirmpasswordtxt;
    private javax.swing.JLabel contactnolbl;
    private javax.swing.JTextField contactnotxt;
    private javax.swing.JLabel emailidlbl;
    private javax.swing.JTextField emailidtxt;
    private javax.swing.JRadioButton femaleradbtn;
    private javax.swing.ButtonGroup genderbtn;
    private javax.swing.JLabel genderlbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton maleradbtn;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField nametxt;
    private javax.swing.JRadioButton othersradbtn;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JButton submitbtn;
    // End of variables declaration//GEN-END:variables
}