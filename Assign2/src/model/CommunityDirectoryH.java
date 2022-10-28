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
public class CommunityDirectoryH {
    private ArrayList<CommunityH>communityHistoryH;

    public CommunityDirectoryH() {
        this.communityHistoryH = new ArrayList<CommunityH>();
    }

    public ArrayList<CommunityH> getCommunityHistoryH() {
        return communityHistoryH;
    }

    public void setCommunityHistoryH(ArrayList<CommunityH> communityHistoryH) {
        this.communityHistoryH = communityHistoryH;
    }

    
    
    public CommunityH addNewCommunityH(){
        CommunityH newCommunity= new CommunityH();
        communityHistoryH.add(newCommunity);
        return newCommunity;
    }
    public void deleteCommunityH(CommunityH ch){
        communityHistoryH.remove(ch);
    }  
    
    
}
