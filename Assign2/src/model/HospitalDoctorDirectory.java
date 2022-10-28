/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Deepak Sawalka
 */
public class HospitalDoctorDirectory {

    private ArrayList<HospitalDoctor>doctorHospitalHistory;
    public HospitalDoctorDirectory() {
        
        this.doctorHospitalHistory = new ArrayList<HospitalDoctor>();
        
        
    }

    public ArrayList<HospitalDoctor> getDoctorHospitalHistory() {
        return doctorHospitalHistory;
    }

    public void setDoctorHospitalHistory(ArrayList<HospitalDoctor> doctorHospitalHistory) {
        this.doctorHospitalHistory = doctorHospitalHistory;
    }

    
    
     public HospitalDoctor addNewHospitalDoctor(){
        HospitalDoctor newHospitalDoctor= new HospitalDoctor();
        doctorHospitalHistory.add(newHospitalDoctor);
        return newHospitalDoctor;
    }
    public void deleteHospitalDoctor(HospitalDoctor hd){
        doctorHospitalHistory.remove(hd);
    } 
    
    
    
}
