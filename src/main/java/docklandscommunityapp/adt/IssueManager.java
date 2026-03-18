/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandscommunityapp.adt;

import docklandscommunityapp.model.AccessibilityIssue;
import docklandscommunityapp.model.Issue;
import docklandscommunityapp.model.SafetyIssue;
import docklandscommunityapp.model.TrafficIssue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author matheus
 */
public class IssueManager {

    private ArrayList<Issue> currentIssues;
    private HashMap<Integer, Issue> crudMap;
    private Stack<Issue> resolvedIssues;
    private Issue issue = null;

    public IssueManager() {
        this.currentIssues = new ArrayList<>();
        this.crudMap = new HashMap<>();
        this.resolvedIssues = new Stack<>();
    }

    public void addIssue(String description, String severity, String date, String address, String type) {

        switch (type) {
            case "Traffic":
                issue = new TrafficIssue(description, severity, date, address, type);
                break;
            case "Accessibility":
                issue = new AccessibilityIssue(description, severity, date, address, type);
                break;
            case "Safety":
                issue = new SafetyIssue(description, severity, date, address, type);
                break;
            default:
                System.out.println("invalid type.");
                return;
        }

        currentIssues.add(issue);
        crudMap.put(issue.getId(), issue);

    }

    public void deleteIssue(int id) {
        Issue auxIssue = crudMap.get(id);
        if (auxIssue != null) {

            currentIssues.remove(auxIssue);   // remove from array
            crudMap.remove(id);           // remove from map
        } else {
            System.out.println("Invalid Id");
        }
    }

    public Issue updateIssue(int id, String description, String address, String dateIssue, String severity, String type) {

        Issue auxIssue = crudMap.get(id);
        if (auxIssue != null) {

            auxIssue.setDescription(description);
            auxIssue.setAddress(address);
            auxIssue.setDateIssue(dateIssue);
            auxIssue.setSeverity(severity);
            auxIssue.setType(type);

            return auxIssue;
        } else {
            System.out.println("Invalid id");
            return null;
        }
    }

    public Issue resolvedIssue(int id) {
        Issue auxIssue = crudMap.get(id);
        if (auxIssue != null) {
            auxIssue.setResolved(true);

            crudMap.remove(id);
            currentIssues.remove(auxIssue);
            resolvedIssues.push(auxIssue);

            return auxIssue;

        } else {
            System.out.println("Invalid id");
            return null;
        }
    }

    public Issue undoLastResolvedIssue() {
        Issue auxIssue = resolvedIssues.pop();
        auxIssue.setResolved(false);

        currentIssues.add(auxIssue);
        crudMap.put(auxIssue.getId(), auxIssue);

        return auxIssue;
    }

    public String displayCurrentIssues() {
        StringBuilder sb = new StringBuilder();
        for (Issue auxIssue : currentIssues) {
            sb.append(auxIssue.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String displayRecentToOldestResolvedIssues() {
        StringBuilder sb = new StringBuilder();
        Issue auxIssue;

        // from the oldest to the most recent
        for (int i = resolvedIssues.size() - 1; i >= 0; i--) {
            auxIssue = resolvedIssues.get(i);
            sb.append(auxIssue.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public ArrayList<Issue> getArray() {
        return currentIssues;
    }

    public HashMap<Integer, Issue> getMap() {
        return crudMap;
    }

    public Stack<Issue> getStack() {
        return resolvedIssues;
    }

}
