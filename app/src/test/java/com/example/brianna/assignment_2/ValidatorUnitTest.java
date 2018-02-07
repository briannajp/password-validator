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
    static Validator validator;

    @BeforeClass
    public static void init() {
        validator = new Validator();
    }

    @Test
    public void testPassword1()
    {
        assertEquals(validator.validate(password1), 1); //expected this password to pass the length test
    }

    @Test
    public void testPassword2()
    {
        assertEquals(validator.validate(password2), 1); //expected this password to pass the password test
    }

}