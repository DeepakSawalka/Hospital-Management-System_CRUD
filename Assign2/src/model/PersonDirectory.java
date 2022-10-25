/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;

import model.Person;

/**
 *
 * @author Deepak Sawalka
 */
public class PersonDirectory {

    
    private ArrayList<Person>personHistory;
    public PersonDirectory() {
        
        this.personHistory=new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonHistory() {
        return personHistory;
    }

    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personHistory = personHistory;
    }

    
    
    public Person addNewPerson(){
        Person newPerson= new Person();
        personHistory.add(newPerson);
        return newPerson;
    }
    public void deletePerson(Person p){
        personHistory.remove(p);
        
    }
   /* public Person getPersonAt(Person selectedPerson)
    {
        int i = 0;
        personHistory.set(i, selectedPerson);
        return selectedPerson;
    }*/
    
}
