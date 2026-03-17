/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package docklandscommunityapp;

import docklandscommunityapp.model.Issue;
import docklandscommunityapp.model.SafetyIssue;
import docklandscommunityapp.model.TrafficIssue;

/**
 *
 * @author matheus
 */
public class DocklandsCommunityApp {
    public static void main(String[] args) {

        Issue myTest = new SafetyIssue ("teste", 5, "seila", "naosei");

        System.out.println(myTest.toString());
        // System.out.println(myTest.getId());




    }
}
