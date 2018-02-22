/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

import java.util.Date;

/**
 *
 * @author Sai Kumar Uppala
 */
public class Job {

    Date closingDate;
    int jobID;
    String jobTitle;
    String minimumRequiredDegree;
    Date openingDate;
    String responsibilities;
    double salary;
    Supervisor supervisor;

    /**
     *
     * @param jobID
     * @param jobTitle
     * @param minimumRequiredDegree
     * @param openingDate
     * @param closingDate
     * @param salary
     * @param responsibilities
     * @param s
     */
    public Job(int jobID, String jobTitle, String minimumRequiredDegree, Date openingDate, Date closingDate,
            double salary, String responsibilities, Supervisor s) {
        this.closingDate = closingDate;
        this.jobID = jobID;
        this.jobTitle = jobTitle;
        this.minimumRequiredDegree = minimumRequiredDegree;
        this.openingDate = openingDate;
        this.responsibilities = responsibilities;
        this.salary = salary;
        this.supervisor = s;
    }

    /**
     *
     * @return
     */
    public String printJobDetails() {
        return "The job details are as follows: \n" + toString();
    }

    /*
    JobID: 1100
JobTitle: Senior Software Engineer
MinimumRequiredDegree: Masters
OpeningDate: Fri Nov 16 00:00:00 CST 3917
ClosingDate: Tue Nov 20 00:00:00 CST 3917
Salary: 50000.0
Responsibilities of the job includes: You have to develop software solutions and supervise the team under you
Supervisor details: 
Name of the supervisor: John Ryan ( J.R )
Contact Details: ryant@gmail.com, +1((41)2)5-20-0909

     */
    @Override
    public String toString() {
        return "JobID: " + jobID
                + "\nJobTitle: " + jobTitle
                + "\nMinimumRequiredDegree: " + minimumRequiredDegree
                + "\nOpeningDate: " + openingDate
                + "\nClosingDate: " + closingDate
                + "\nSalary: " + salary
                + "\nResponsibilities of the job includes: " + responsibilities;
        //+"\nSupervisor details: \n"+supervisor.toString();

    }

}
