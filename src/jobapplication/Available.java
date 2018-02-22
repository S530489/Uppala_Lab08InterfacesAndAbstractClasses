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
public interface Available extends Applicable, Eligible {

    /**
     *
     * @return
     */
    String checkAvailabilityOfJob();

}
