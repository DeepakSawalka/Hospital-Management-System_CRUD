/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemodel;

import java.util.*;

/**
 *
 * @author Deepak Sawalka
 */
public class EmployeeHistoryDetails {
    
    private ArrayList<EmployeeDetails>history;

    public EmployeeHistoryDetails() {
        this.history = new ArrayList<EmployeeDetails>();
        
       }

    public ArrayList<EmployeeDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeDetails> history) {
        this.history = history;
    }
    
    public EmployeeDetails addNewEmployees()
    {
        EmployeeDetails newEmployees= new EmployeeDetails();
        history.add(newEmployees);
        return newEmployees;
    }
    
    public void deleteEmployees(EmployeeDetails ed){
        history.remove(ed);
    }
    
}  
    
    
    
    
    
    
    

