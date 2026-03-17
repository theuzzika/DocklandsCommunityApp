/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package docklandscommunityapp;

import docklandscommunityapp.adt.IssueManager;
import docklandscommunityapp.model.Issue;
import docklandscommunityapp.model.SafetyIssue;
import docklandscommunityapp.model.TrafficIssue;

/**
 *
 * @author matheus
 */
public class DocklandsCommunityApp {

    public static void main(String[] args) {

//        Issue myTest = new SafetyIssue("teste", 5, "seila", "naosei");
//        Issue myTest1 = new SafetyIssue("teste", 5, "seila", "naosei");
//        Issue myTest2 = new SafetyIssue("teste", 5, "seila", "naosei");
//        Issue myTest3 = new SafetyIssue("teste", 5, "seila", "naosei");
//        Issue myTest4 = new SafetyIssue("teste", 5, "seila", "naosei");
//        Issue myTest5 = new SafetyIssue("teste", 5, "seila", "naosei");
//        Issue myTest6 = new SafetyIssue("teste", 5, "seila", "naosei");
//        Issue myTest7 = new SafetyIssue("teste", 5, "seila", "naosei");
//        Issue myTest8 = new SafetyIssue("teste", 5, "seila", "naosei");
//        Issue myTest9 = new SafetyIssue("teste", 5, "seila", "naosei");
//        Issue myTest10 = new SafetyIssue("teste", 5, "seila", "naosei");
//        Issue myTest11 = new SafetyIssue("teste", 5, "seila", "naosei");

        IssueManager manager = new IssueManager();

        manager.addIssue("uahdsiuha", 1, "adsasdasd", "asdadadad", "Traffic");
        manager.addIssue("uahdsiuha", 2, "adsasdasd", "asdadadad", "Traffic");
        manager.addIssue("uahdsiuha", 3, "adsasdasd", "asdadadad", "Traffic");
        manager.addIssue("uahdsiuha", 4, "adsasdasd", "asdadadad", "Traffic");
        manager.addIssue("uahdsiuha", 5, "adsasdasd", "asdadadad", "Traffic");
        manager.addIssue("uahdsiuha", 6, "adsasdasd", "asdadadad", "Traffic");
        manager.addIssue("uahdsiuha", 7, "adsasdasd", "asdadadad", "Traffic");
        manager.addIssue("uahdsiuha", 8, "adsasdasd", "asdadadad", "Traffic");
        manager.addIssue("uahdsiuha", 9, "adsasdasd", "asdadadad", "Traffic");
        manager.addIssue("uahdsiuha", 10, "asdadsas", "asdadadad", "Traffic");
        manager.addIssue("uahdsiuha", 11, "asdadsas", "asdadadad", "Traffic");
        manager.addIssue("uahdsiuha", 12, "asdadsas", "asdadadad", "Traffic");
        
        
        manager.resolvedIssue(1);
        manager.resolvedIssue(2);
        manager.resolvedIssue(3);
        manager.resolvedIssue(4);
        manager.resolvedIssue(5);
        manager.resolvedIssue(6);
        manager.resolvedIssue(7);
        manager.resolvedIssue(8);
        manager.resolvedIssue(9);
        manager.resolvedIssue(10);
        manager.resolvedIssue(11);
        manager.resolvedIssue(12);
                
        System.out.println(manager.displayResolvedIssues());
    }
}
