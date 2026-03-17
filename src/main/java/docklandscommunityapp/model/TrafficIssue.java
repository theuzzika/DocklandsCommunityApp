/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandscommunityapp.model;

/**
 *
 * @author matheus
 */
public class TrafficIssue extends Issue {
    
    public TrafficIssue(String description, int severity, String dateIssue, String address) {
        super(description, severity, dateIssue, address);
    }

    @Override
    public String toString() {
        return "Issue type: Traffic"
                + super.toString();
    }

}
