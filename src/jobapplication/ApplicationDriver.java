/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

import com.sun.xml.internal.stream.Entity;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sai Kumar Uppala
 */
public class ApplicationDriver {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here

        ArrayList<Application> applicationsList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("Welcome to the Career Builder System");
        System.out.println("************************************");
        boolean again = true;
        while (again) {
            System.out.println("Fill your details to know the jobs that suits your profile\n");
            Application application = new Application();
            application.fillJobApplicationDetails();
            if (application.haveAGoodBackGround()) {
                if (application.checkQualification()) {
                    if (application.checkAge()) {
                        application.produceTheJobDescriptionForApplicant();

                        System.out.println("\nYou are eligible to apply for this job");

                        System.out.println(application.job.printJobDetails());
                        // System.out.println("");
                        System.out.println(application.checkAvailabilityOfJob());
                        System.out.println("Would you like to apply for this job");
                        if (sc.nextLine().trim().toLowerCase().equals("yes")) {
                            applicationsList.add(application);
                        }
                        System.out.println("Would you like to apply for another applicant");
                        if (sc.nextLine().trim().toLowerCase().equals("no")) {
                            again = false;
                        }

                    } else {
                        System.out.println("You need a higher need to apply the job posistions we have currently");
                        again = false;
                    }
                } else {
                    System.out.println("You need a higher need to apply the job posistions we have currently");
                    again = false;
                }
            } else {
                System.out.println("You shouldn't have any criminal or illicit background");
                again = false;
            }

        }
        System.out.println("*********************************************");
        System.out.println("Here is the list of applications you created \n");
        //System.out.println("*********************************************\n");
        for (Application i : applicationsList) {
            System.out.println("");
            System.out.println(i.toString());
            System.out.println("*********************************************");

        }
    }

}
