package com.example.android.quze;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void right(View view) {

        /*
        Right answer for All questions
         */
        String answerQ1 = "Decimal system ,Binary system";
        String answerQ2 = "Decimal";
        String answerQ3 = "set of symbols and these symbols may be numbers or letters " +
                "linked to each other by a set of relationships";
        String answerQ4 = "8";
        String answerQ5 = "Binary";

        /*
        find View by id and check if the user check the Right answer
        and not check the third answer for question one
         */
        CheckBox answer1Q1 = (CheckBox) findViewById(R.id.answer1_Q1);
        boolean rightQ1_1 = answer1Q1.isChecked();
        CheckBox answer2Q1 = (CheckBox) findViewById(R.id.answer2_Q1);
        boolean rightQ1_2 = answer2Q1.isChecked();
        CheckBox answer3Q1 = (CheckBox) findViewById(R.id.answer3_Q1);
        boolean rightQ1_3 = answer3Q1.isChecked();
 /*
        find View by id and check if the user check the Right answer
       for question two
         */
        RadioButton answer1Q2 = (RadioButton) findViewById(R.id.answer1_Q2);
        boolean rightQ2 = answer1Q2.isChecked();
/*
        find View by id and check if the user write the Right answer
       for question three
         */
        EditText answer1Q3 = (EditText) findViewById(R.id.answer_Q3);
        String rightQ3 = answer1Q3.getText().toString();
/*
        find View by id and check if the user check the Right answer
       for question four
         */
        RadioButton answer1Q4 = (RadioButton) findViewById(R.id.answer3_Q4);
        boolean rightQ4 = answer1Q4.isChecked();

        /*
        find View by id and check if the user write the Right answer
       for question five
         */
        EditText answer1Q5 = (EditText) findViewById(R.id.answer_Q5);
        String rightQ5 = answer1Q5.getText().toString();

  /*
      if else statement to check all cases of answer
  */
        /*
        check if user answer five question right
         */
        if (rightQ1_1 && rightQ1_2 && !rightQ1_3 && rightQ2  && rightQ3.equals(answerQ3) && rightQ4 && rightQ5.equals(answerQ5)) {
            Toast.makeText(this, "You got a score of 5 out of 5 ", Toast.LENGTH_LONG).show();
        }
          /*
        check if user answer four question right
         */
        else if (rightQ1_1 && rightQ1_2 && !rightQ1_3 && rightQ2 && rightQ3.equals(answerQ3) && rightQ4
                || rightQ1_1 && rightQ1_2 && !rightQ1_3 && rightQ3.equals(answerQ3) && rightQ4 && rightQ5.equals(answerQ5)
                || rightQ1_1 && rightQ1_2 && !rightQ1_3 && rightQ2 && rightQ4 && rightQ5.equals(answerQ5)
                || rightQ2 && rightQ3.equals(answerQ3) && rightQ4 && rightQ5.equals(answerQ5)
                || rightQ1_1 && rightQ1_2 && !rightQ1_3 && rightQ2 && rightQ3.equals(answerQ3) && rightQ5.equals(answerQ5)) {

            Toast.makeText(this, "You got a score of 4 out of 5 ", Toast.LENGTH_LONG).show();
        }
          /*
        check if user answer three question right
         */
        else if (rightQ1_1 && rightQ1_2 && !rightQ1_3 && rightQ2 && rightQ3.equals(answerQ3)
                || rightQ1_1 && rightQ1_2 && !rightQ1_3 && rightQ3.equals(answerQ3) && rightQ4
                || rightQ1_1 && rightQ1_2 && !rightQ1_3 && rightQ2 && rightQ4
                || rightQ1_1 && rightQ1_2 && !rightQ1_3 && rightQ4 && rightQ5.equals(answerQ5)
                || rightQ1_1 && rightQ1_2 && !rightQ1_3 && rightQ2 && rightQ5.equals(answerQ5)
                || rightQ1_1 && rightQ1_2 && !rightQ1_3 && rightQ3.equals(answerQ3) && rightQ5.equals(answerQ5)
                || rightQ2 && rightQ3.equals(answerQ3) && rightQ4 || rightQ2 && rightQ4 && rightQ5.equals(answerQ5)
                || rightQ2 && rightQ3.equals(answerQ3) && rightQ5.equals(answerQ5)
                || rightQ3.equals(answerQ3) && rightQ4 && rightQ5.equals(answerQ5)) {
            Toast.makeText(this, "You got a score of 3 out of 5 ", Toast.LENGTH_LONG).show();
        }
          /*
        check if user answer two question right
         */
        else if (rightQ1_1 && rightQ1_2 && !rightQ1_3 && rightQ2 || rightQ1_1 && rightQ1_2 && !rightQ1_3 && rightQ3.equals(answerQ3)
                || rightQ1_1 && rightQ1_2 && !rightQ1_3 && rightQ4 ||
                rightQ1_1 && rightQ1_2 && !rightQ1_3 && rightQ5.equals(answerQ5)
                || rightQ2 && rightQ3.equals(answerQ3) || rightQ2 && rightQ4 || rightQ2 && rightQ5.equals(answerQ5)
                || rightQ3.equals(answerQ3) && rightQ4 || rightQ3.equals(answerQ3) && rightQ5.equals(answerQ5)
                || rightQ4 && rightQ5.equals(answerQ5)) {
            Toast.makeText(this, "You got a score of 2 out of 5 ", Toast.LENGTH_LONG).show();
        }
          /*
        check if user answer one question right
         */
        else if (rightQ1_1 && rightQ1_2 && !rightQ1_3 || rightQ2 || rightQ3.equals(answerQ3) || rightQ4 || rightQ5.equals(answerQ5)) {
            Toast.makeText(this, "You got a score of 1 out of 5 ", Toast.LENGTH_LONG).show();
        }
          /*
        check if user not answer any thing right
         */
        else {
            Toast.makeText(this, "You got a score of 0 out of 5 ", Toast.LENGTH_LONG).show();
        }
    }
}