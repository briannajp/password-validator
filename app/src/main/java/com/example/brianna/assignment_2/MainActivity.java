/*
 *  Brianna Phillips - B00544633
 *  Assignment 2 - CSCI 3130
 *  February 10, 2018
 */
package com.example.brianna.assignment_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private Button btnSubmit;
    private EditText txtPassword;
    private TextView tvStrong;
    private TextView tvCriteria;
    private Validator validate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize UI components
        txtPassword = findViewById(R.id.txtPassword);
        btnSubmit = findViewById(R.id.buttonSubmit);
        tvStrong = findViewById((R.id.tvStrong));
        tvCriteria = findViewById(R.id.tvCriteria);

        //initialize instance of Validator class
        validate = new Validator();

        //set text box to the display password criteria
        tvCriteria.setText(R.string.criteria);
    }

    /**
     *  Simulates the click of the Submit button.
     *  When pressed, the password in the input
     *  text field is checked to determine if
     *  it passes all tests (Validator class).
     * @param view view where button was clicked
     */
    public void button_click(View view)
    {
        if (validate.validate(txtPassword.getText().toString()) != 5) {
            tvStrong.setText(R.string.notStrongPass);
            txtPassword.selectAll();
        }
        else
            tvStrong.setText(R.string.strongPass);
    }

}
