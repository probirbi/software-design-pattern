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
public class ProjectLeader extends Employee {

    private int Max_Leaves_Can_Approve = 20;

    @Override
    public void applyLeave(String employeeName, int numberOfDaysLeave) {
        if (numberOfDaysLeave <= Max_Leaves_Can_Approve) {
            approveLeave(employeeName, numberOfDaysLeave);
        } else {
            supervisor.applyLeave(employeeName, numberOfDaysLeave);
        }
    }

    private void approveLeave(String employeeName, int numberOfDaysLeave) {
        System.out.println("ProjectLeader approved" + numberOfDaysLeave + "days" + "Leave for the employee: " + employeeName);
    }
}
