package com.example.brianna.assignment_2;

/**
 * Created by Brianna on 2018-02-06.
 */

public class Validator {

    private String password;
    private int rulesPassed = 0;

    /* Function: validate
     * Description: validate string input (password)
     *              based on a set of rule.
     *              Return the number of rules passed.
     */
    public int validate(String p)
    {
        this.password = p;
        rulesPassed = 0;

        if (!password.equalsIgnoreCase("password"))
            rulesPassed++;
        if (password.length() >= 8)
            rulesPassed++;

        return rulesPassed;
    }
}