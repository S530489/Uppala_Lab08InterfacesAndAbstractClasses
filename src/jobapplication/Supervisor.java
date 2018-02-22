/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

/**
 *
 * @author Sai Kumar Uppala
 */
public class Supervisor extends Person {

    /**
     *
     */
    public Supervisor() {
        super();
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @param emailID
     */
    public Supervisor(String firstName, String lastName, String phoneNumber, String emailID) {
        super(emailID, firstName, lastName, phoneNumber);
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName() + " ( " + getFirstName().substring(0, 1) + "."
                + getLastName().substring(0, 1) + " )";
    }

    @Override
    public String toString() {
        return "Name of the supervisor: " + getFullName() + "\n" + super.toString();
    }

}
