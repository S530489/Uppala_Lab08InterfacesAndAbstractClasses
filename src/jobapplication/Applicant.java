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
public class Applicant extends Person {

    int age;
    String educationQualification;
    int levelOfCommunication;
    boolean workExperience;

    /**
     *
     */
    public Applicant() {
    }

    /**
     *
     * @param age
     * @param educationQualification
     * @param levelOfCommunication
     * @param workExperience
     * @param emailID
     * @param firstName
     * @param lastName
     * @param phoneNumber
     */
    public Applicant(int age, String educationQualification, int levelOfCommunication, boolean workExperience, String emailID, String firstName, String lastName, String phoneNumber) {
        super(emailID, firstName, lastName, phoneNumber);
        this.age = age;
        this.educationQualification = educationQualification;
        this.levelOfCommunication = levelOfCommunication;
        this.workExperience = workExperience;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return
     */
    public String getEducationQualification() {
        return educationQualification;
    }

    /**
     *
     * @param educationQualification
     */
    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }

    /**
     *
     * @return
     */
    public int getLevelOfCommunication() {
        return levelOfCommunication;
    }

    /**
     *
     * @param levelOfCommunication
     */
    public void setLevelOfCommunication(int levelOfCommunication) {
        this.levelOfCommunication = levelOfCommunication;
    }

    /**
     *
     * @return
     */
    public boolean isWorkExperience() {
        return workExperience;
    }

    /**
     *
     * @param workExperience
     */
    public void setWorkExperience(boolean workExperience) {
        this.workExperience = workExperience;
    }

    /**
     *
     * @return
     */
    public String getFullName() {
        return getLastName() + ", " + getFirstName();
    }

    @Override
    public String toString() {
        return "Name of the applicant: " + getFullName() + "\n" + super.toString() + "\nEducationQualification of the applicant: " + educationQualification;
    }

}
