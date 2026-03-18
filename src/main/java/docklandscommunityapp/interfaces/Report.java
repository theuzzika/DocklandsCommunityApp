/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package docklandscommunityapp.interfaces;

/**
 *
 * @author matheus
 */
public interface Report {
    
    // issue details
    String getDescription (); 
    
    // return address
    String getAddress ();
    
    // severity 1-2-3 (low-moderate-high)
    String getSeverity ();
    
}
