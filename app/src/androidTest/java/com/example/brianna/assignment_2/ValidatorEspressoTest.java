/*
 *  Brianna Phillips - B00544633
 *  Assignment 2 - CSCI 3130
 *  February 10, 2018
 */

package com.example.brianna.assignment_2;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;

/**
 * Created by Brianna on 2018-02-07.
 */

public class ValidatorEspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    private String password1 = "PASSWORD";
    private String password2 = "Testing123";
    private String password3 = "password123";
    private String password4 = "test";

    @Test
    public void enterPassword1()
    {
        onView(withId(R.id.txtPassword)).perform(typeText(password1));
        closeSoftKeyboard();
        onView(withId(R.id.buttonSubmit)).perform(click());
        onView(withId(R.id.tvStrong)).check(matches(withText("Password is not strong.")));
    }

    @Test
    public void enterPassword2()
    {
        onView(withId(R.id.txtPassword)).perform(typeText(password2));
        closeSoftKeyboard();
        onView(withId(R.id.buttonSubmit)).perform(click());
        onView(withId(R.id.tvStrong)).check(matches(withText("Password is strong.")));
    }

    @Test
    public void enterPassword3()
    {
        onView(withId(R.id.txtPassword)).perform(typeText(password3));
        closeSoftKeyboard();
        onView(withId(R.id.buttonSubmit)).perform(click());
        onView(withId(R.id.tvStrong)).check(matches(withText("Password is not strong.")));
    }

    @Test
    public void enterPassword4()
    {
        onView(withId(R.id.txtPassword)).perform(typeText(password4));
        closeSoftKeyboard();
        onView(withId(R.id.buttonSubmit)).perform(click());
        onView(withId(R.id.tvStrong)).check(matches(withText("Password is not strong.")));
    }



}
