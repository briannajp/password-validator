/*
 *  Brianna Phillips - B00544633
 *  Assignment 2 - CSCI 3130
 *  February 10, 2018
 */
package com.example.brianna.assignment_2;

import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 * Created by Brianna on 2018-02-06.
 */

public class ValidatorUnitTest {

    static String password1 = "password";
    static String password2 = "hello";
    static String password3 = "hello1there";
    static String password4 = "helloThere1";
    static String password5 = "12345THERE!";
    static Validator validator;

    @BeforeClass
    public static void init() {
        validator = new Validator();
    }

    @Test
    public void testPassword()
    {
        assertEquals(validator.validate(password1), 2); //expected this password to pass the length and lowercase test
    }

    @Test
    public void testLength()
    {
        assertEquals(validator.validate(password2), 2); //expected this password to pass the password and lowercase test
    }

    @Test
    public void testOneDigit()
    {
        assertEquals(validator.validate(password3), 4);  //expected to pass password, length, digit, and lowercase tests
    }

    @Test
    public void testOneCapital()
    {
        assertEquals(validator.validate(password4), 5); //expected to pass password, length, digit, lowercase and capital letter tests
    }

    @Test
    public void testOneLowerCase()
    {
        assertEquals(validator.validate(password5), 4); //expected to pass all tests except for lower case
    }
}
