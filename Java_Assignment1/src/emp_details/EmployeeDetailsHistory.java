/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emp_details;

import java.util.*;

/**
 *
 * @author Deepak Sawalka
 */
public class EmployeeDetailsHistory {
    
    private ArrayList<Employee> history;
    
    public EmployeeDetailsHistory()
    {
        this.history =new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
}
