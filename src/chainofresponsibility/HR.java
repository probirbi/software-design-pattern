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
public class HR extends Employee {

    private final int Max_Leaves_Can_Approve = 30;

    @Override
    public void applyLeave(String employeeName, int numberOfDaysLeave) {
        if (numberOfDaysLeave >= Max_Leaves_Can_Approve) {
            approveLeave(employeeName, numberOfDaysLeave);
        } else {
            System.out.println("Leave application suspend, please contact HR");
        }
    }

    private void approveLeave(String employeeName, int numberOfDaysLeave) {
        System.out.println("HR approved: " + numberOfDaysLeave + "days " + "Leave for the employee: " + employeeName);
    }
}
