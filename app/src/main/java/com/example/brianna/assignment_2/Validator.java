package com.example.brianna.assignment_2;

/**
 * Created by Brianna on 2018-02-06.
 */

public class Validator {

    private String password;
    private int rulesPassed = 0;
    private boolean containsDigit = false;
    private boolean containsUpper = false;
    private boolean containsLower = false;
    private char ch;

    /* Function: validate
     * Description: validate string input (password)
     *              based on a set of rule.
     *              Return the number of rules passed.
     */
    public int validate(String p)
    {
        this.password = p;
        rulesPassed = 0;
        containsDigit = false;
        containsUpper = false;
        containsLower = false;

        if (!password.equalsIgnoreCase("password"))
            rulesPassed++;
        if (password.length() >= 8)
            rulesPassed++;

        for(int i = 0; i < password.length(); i++)
        {
            ch = password.charAt(i);
            if (Character.isDigit(ch))
                containsDigit = true;
            if (Character.isUpperCase(ch))
                containsUpper = true;
            if (Character.isLowerCase(ch))
                containsLower = true;

            if (containsDigit && containsUpper && containsLower)
                break;
        }
        if (containsDigit)
            rulesPassed++;
        if (containsUpper)
            rulesPassed++;
        if(containsLower)
            rulesPassed++;

        return rulesPassed;
    }
}