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
public enum CommunicationSkill {

    /**
     *
     */
    AVERAGE(4),

    /**
     *
     */
    EXCELLENT(1),

    /**
     *
     */
    FAMILIAR(5),

    /**
     *
     */
    KNOWLEDGEABLE(3),

    /**
     *
     */
    PROFICIENT(2);

    private final int levelOfCommincationSkills;

    private CommunicationSkill(int levelOfCommincationSkills) {
        this.levelOfCommincationSkills = levelOfCommincationSkills;
    }

    /**
     *
     * @return
     */
    public int getLevelOfCommincationSkills() {
        return levelOfCommincationSkills;
    }

}
