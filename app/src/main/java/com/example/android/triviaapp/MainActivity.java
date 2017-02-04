package com.example.android.triviaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view) {

        checkQuestion1();
        checkQuestion2();
        checkQuestion3();
        checkQuestion4();
        checkQuestion5();
        checkQuestion6();

        Toast.makeText(this, "You got " + score + " out of 6 answers correct.", Toast.LENGTH_SHORT).show();
        score = 0;
    }

    private void checkQuestion1() {
        CheckBox question1A = (CheckBox) findViewById(R.id.question1A);
        boolean question1AChecked = question1A.isChecked();

        CheckBox question1B = (CheckBox) findViewById(R.id.question1B);
        boolean question1BChecked = question1B.isChecked();

        CheckBox question1C = (CheckBox) findViewById(R.id.question1C);
        boolean question1CChecked = question1C.isChecked();

        CheckBox question1D = (CheckBox) findViewById(R.id.question1D);
        boolean question1Dchecked = question1D.isChecked();

        if (question1AChecked && question1CChecked && question1Dchecked) {
            if (!question1BChecked) {
                score += 1;
            }
        }
    }

    private void checkQuestion2() {
        RadioButton question2answer = (RadioButton) findViewById(R.id.question2Answer);
        boolean question2Correct = question2answer.isChecked();

        if (question2Correct) {
                score += 1;
        }
    }

    private void checkQuestion3() {
        EditText question3response = (EditText) findViewById(R.id.question3text);
        String question3text = question3response.getText().toString();

        if (question3text.toLowerCase().equals("england")) {
            score += 1;
        }

        if (question3text.toLowerCase().equals("great britain")) {
            score += 1;
        }
    }

    private void checkQuestion4() {
        RadioButton question4answer = (RadioButton) findViewById(R.id.question4Answer);
        boolean question4Correct = question4answer.isChecked();

        if (question4Correct) {
            score += 1;
        }
    }

    private void checkQuestion5() {
        RadioButton question5answer = (RadioButton) findViewById(R.id.question5Answer);
        boolean question5Correct = question5answer.isChecked();

        if (question5Correct) {
            score += 1;
        }
    }

    private void checkQuestion6() {
        EditText question6response = (EditText) findViewById(R.id.question6text);
        String question6text = question6response.getText().toString();

        if (question6text.toLowerCase().equals("canada")) {
            score += 1;
        }
    }
}
