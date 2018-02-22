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
public abstract class Person {

    String emailID;
    String firstName;
    String lastName;
    String phoneNumber;

    /**
     *
     */
    public Person() {
        this.emailID = "";
        this.firstName = "";
        this.lastName = "";
        this.phoneNumber = "";
    }

    /**
     *
     * @param emailID
     * @param firstName
     * @param lastName
     * @param phoneNumber
     */
    public Person(String emailID, String firstName, String lastName, String phoneNumber) {
        this.emailID = emailID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @return
     */
    public String getEmailID() {
        return emailID;
    }

    /**
     *
     * @param emailID
     */
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @param phoneNumber
     * @return
     */
    public String getFormattedPhoneNumber(String phoneNumber) {
        return "+1(" + phoneNumber.substring(0, 3) + ")" + phoneNumber.substring(3, 6)
                + "-" + phoneNumber.substring(6);
    }

    /**
     *
     * @return
     */
    public abstract String getFullName();

    @Override
    public String toString() {
        return "Contact Details: " + emailID + ", " + getFormattedPhoneNumber(phoneNumber);
    }

}
