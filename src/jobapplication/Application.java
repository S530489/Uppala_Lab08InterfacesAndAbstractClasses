/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Sai Kumar Uppala
 */
public class Application implements Available {

    Applicant applicant;
    Supervisor supervisor;
    Job job;

    /**
     *
     */
    public Application() {
    }

    /**
     *
     */
    public void fillJobApplicationDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.nextLine().trim();
        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine().trim();
        System.out.println("Enter your phone number: ");
        String phoneNumber = scan.nextLine().trim();
        System.out.println("Enter your email id: ");
        String emailId = scan.nextLine().trim();
        System.out.println("Do you have any work experience: ");
        String exp = scan.nextLine().trim();
        boolean experience;
        if (exp.toLowerCase().equals("yes")) {
            experience = true;
        } else {
            experience = false;
        }
        System.out.println("Enter your educational qualification: ");
        String qualification = scan.nextLine().trim();
        System.out.println("Enter your level of communication skills: ");
        String level = scan.nextLine().trim();
        int levelOfCommunication = CommunicationSkill.valueOf(level.toUpperCase()).getLevelOfCommincationSkills();
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();

        applicant = new Applicant(age, qualification, levelOfCommunication, experience, emailId, firstName, lastName, phoneNumber);

    }

    private void assignLevelOfCommunicationSkills(String level) {

        applicant.setLevelOfCommunication(CommunicationSkill.valueOf(level.toUpperCase()).getLevelOfCommincationSkills());
    }

    /**
     *
     * @return
     */
    @Override
    public String checkAvailabilityOfJob() {

        Date date = new Date();
        if (date.compareTo(job.closingDate) < 0) {
            return "The job is still open, you can apply for this job";
        } else {
            return "The job dead line is closed you cannot apply for it";
        }
    }

    @Override
    public boolean haveAGoodBackGround() {
        if (verifyBackGround().equals("You are eligible to apply")) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String verifyBackGround() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Have you ever been convicted for felony:");
        int c = 0;
        if (sc1.nextLine().trim().toLowerCase().equals("no")) {
            c++;
        }
        System.out.println("Are you a social worker part of criminal justice system:");
        if (sc1.nextLine().trim().toLowerCase().equals("no")) {
            c++;
        }

        System.out.println("Have you ever charged for traffic violations:");
        if (sc1.nextLine().trim().toLowerCase().equals("no")) {
            c++;
        }
        if (c == 3) {
            return "You are eligible to apply";
        }
        return "You are not eligible to apply";
    }

    /**
     *
     * @return
     */
    @Override
    public boolean checkAge() {
        if (applicant.getAge() > 20) {
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean checkQualification() {
        if (applicant.getEducationQualification().equals("bachelors")
                || applicant.getEducationQualification().equals("masters")) {
            return true;
        }
        return false;
    }

    /**
     *
     * @throws ParseException
     */
    public void produceTheJobDescriptionForApplicant() throws ParseException {

        if (applicant.getEducationQualification().equals("masters") && applicant.getLevelOfCommunication() <= 2
                && applicant.getAge() >= 25 && applicant.isWorkExperience() == true) {
            Date openingDate = new SimpleDateFormat("MM/dd/yyyy").parse("9/16/2017");
            Date closingDate = new SimpleDateFormat("MM/dd/yyyy").parse("11/20/2017");
            supervisor = new Supervisor("John", "Ryan", "4125200909", "ryant@gmail.com");
            job = new Job(1100, "Senior Software Engineer", "Masters", openingDate,
                    closingDate, 50000, "You have develop software solutions and supervise the team under you", supervisor);
        } else if (applicant.getEducationQualification().equals("masters") && applicant.getLevelOfCommunication() <= 3
                && applicant.getAge() >= 23 && applicant.isWorkExperience() == false) {
            Date openingDate = new SimpleDateFormat("MM/dd/yyyy").parse("8/27/2107");
            Date closingDate = new SimpleDateFormat("MM/dd/yyyy").parse("11/14/2017");
            supervisor = new Supervisor("Feon", "Tim", "5125280229", "timf@gmail.com");
            job = new Job(1103, "Software Engineer", "Bachelors", openingDate, closingDate, 50000,
                    "You have to develop software solutions", supervisor);
        } else if ((applicant.getEducationQualification().equals("masters") || applicant.getEducationQualification().equals("bachelors"))
                && applicant.getLevelOfCommunication() <= 3
                && applicant.getAge() >= 22 && applicant.isWorkExperience()) {
            Date openingDate = new SimpleDateFormat("MM/dd/yyyy").parse("9/10/2107");
            Date closingDate = new SimpleDateFormat("MM/dd/yyyy").parse("11/13/2017");
            supervisor = new Supervisor("William", "Lee", "3206300980", "leew@gmail.com");
            job = new Job(1200, "Back end Developing", "Bachelors", openingDate, closingDate, 50000,
                    "Have to write the code for server operations and data bases", supervisor);
        } else if (applicant.getEducationQualification().equals("bachelors")
                && applicant.getLevelOfCommunication() <= 3
                && applicant.getAge() >= 22 && applicant.isWorkExperience() == false) {
            Date openingDate = new SimpleDateFormat("MM/dd/yyyy").parse("10/13/2107");
            Date closingDate = new SimpleDateFormat("MM/dd/yyyy").parse("10/29/2017");
            supervisor = new Supervisor("David", "Martin", "4126290129", "martindav@gmail.com");
            job = new Job(1300, "Front End Designer", "Bachelors", openingDate, closingDate,
                    50000, "Have to write the code for front end and work with design aspects", supervisor);
        } else if (applicant.getEducationQualification().equals("bachelors")
                && applicant.getLevelOfCommunication() == 5
                && applicant.getAge() >= 20 && applicant.isWorkExperience() == false) {
            Date openingDate = new SimpleDateFormat("MM/dd/yyyy").parse("9/16/2107");
            Date closingDate = new SimpleDateFormat("MM/dd/yyyy").parse("11/20/2017");
            supervisor = new Supervisor("Jose", "Ellizibeth", "3124482379", "s527890@gmail.com");
            job = new Job(1350, "Technical Support Associate", "Bachelors", openingDate, closingDate, 50000,
                    "Have to collect the required documents and answer the call of customers", supervisor);

        } else {
            System.out.println("Not Eligible to apply for the jobs that are currently available");
        }
    }

    @Override
    public String toString() {
        return "Applicant Details\n" + applicant.toString() + "\nThe details of job the applicant applied for \n" + job.toString()
                + "\nDetails of supervisor for this job: \n"
                + supervisor.toString();
    }

}
