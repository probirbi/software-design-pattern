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
public abstract class Employee {

    protected Employee supervisor;

    public void setNextSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public abstract void applyLeave(String employeeName, int numberOfDaysLeave);
}
