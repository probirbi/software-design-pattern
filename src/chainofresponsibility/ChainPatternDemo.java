/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author Probir
 */
public class ChainPatternDemo {

    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        ProjectLeader projectLeader = new ProjectLeader();
        HR hr = new HR();
        teamLeader.setNextSupervisor(projectLeader);
        projectLeader.setNextSupervisor(hr);
        teamLeader.applyLeave("Probir", 10);
        System.out.println();
        teamLeader.applyLeave("Biswas", 18);
    }
}
