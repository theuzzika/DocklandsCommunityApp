/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandscommunityapp.model;

/**
 *
 * @author matheus
 */
public class SafetyIssue extends Issue {

    public SafetyIssue(String description, int severity, String dateIssue, String address) {
        super(description, severity, dateIssue, address);
    }

    @Override
    public String toString() {
        return "Issue type: Safety"
                + super.toString();
    }
}
