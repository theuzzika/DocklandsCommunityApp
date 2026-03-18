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

    public SafetyIssue(String description, String severity, String dateIssue, String address, String type) {
        super(description, severity, dateIssue, address, type);
    }

    @Override
    public String toString() {
        return "Type: Safety"
                + "               "
                +super.toString();
    }
}
