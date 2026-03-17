/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandscommunityapp.model;

import docklandscommunityapp.interfaces.Report;

/**
 *
 * @author matheus
 */
public class Issue implements Report {

    private static int couter = 0;
    private int id;
    private String description;
    private int severity;
    private String dateIssue;
    private String address;
    private boolean resolved;

    // constructor
    public Issue(String description, int severity, String dateIssue, String address) {
        this.description = description;
        this.severity = severity;
        this.dateIssue = dateIssue;
        this.address = address;

        this.resolved = false;
        this.couter += 1;
        this.id = couter;
    }

    public int getId() {
        return id;
    }

    public String getDateIssue() {
        return dateIssue;
    }

    public void setDateIssue(String dateIssue) {
        this.dateIssue = dateIssue;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean bool) {
        this.resolved = bool;
    }

    @Override
    public String toString() {
        return    "\n     | ID : " + getId()
                + "\n     | Date reported : " + getDateIssue()
                + "\n     | Description: " + getDescription()
                + "\n     | Location: " + getAddress()
                + "\n     | Severity: " + getSeverity();
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public int getSeverity() {
        return severity;
    }

}
