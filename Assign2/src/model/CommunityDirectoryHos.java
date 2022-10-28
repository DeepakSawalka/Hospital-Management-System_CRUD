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
public class CommunityDirectoryHos {
    
private ArrayList<CommunityHos>communityHistoryHos;

    public CommunityDirectoryHos() {
        this.communityHistoryHos = new ArrayList<CommunityHos>();
    }

    public ArrayList<CommunityHos> getCommunityHistoryHos() {
        return communityHistoryHos;
    }

    public void setCommunityHistoryHos(ArrayList<CommunityHos> communityHistoryHos) {
        this.communityHistoryHos = communityHistoryHos;
    }
    
     public CommunityHos addNewCommunityHos(){
        CommunityHos newCommunityHos= new CommunityHos();
        communityHistoryHos.add(newCommunityHos);
        return newCommunityHos;
    }
    public void deleteCommunityHos(CommunityHos cHos){
        communityHistoryHos.remove(cHos);
    }  
    
    
}
