package com.example.android.techknow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    COMPONENTS

    RadioGroup qtn1RadioGroup;
    RadioGroup qtn2RadioGroup;
    RadioGroup qtn3RadioGroup;
    RadioGroup qtn4RadioGroup;
    RadioGroup qtn5RadioGroup;
    RadioGroup qtn6RadioGroup;
    RadioGroup qtn7RadioGroup;
    RadioGroup qtn8RadioGroup;
    RadioGroup qtn9RadioGroup;
    RadioGroup qtn10RadioGroup;
    RadioGroup qtn11RadioGroup;


    RadioButton radioButton;
    Button button;


//    QUIZ VARIABLES
    private int qtn_1 = 0;
    private int qtn_2 = 0;
    private int qtn_3 = 0;
    private int qtn_4 = 0;
    private int qtn_5 = 0;
    private int qtn_6 = 0;
    private int qtn_7 = 0;
    private int qtn_8 = 0;
    private int qtn_9 = 0;
    private int qtn_10 = 0;
    private int qtn_11 = 0;

//    TOTAL SCORE
    double tQuiz = 0;
    int tScore = 55;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        LIST OF RADIO GROUP FROM THE VIEW

        qtn1RadioGroup = (RadioGroup) findViewById(R.id.qtn1);
        qtn2RadioGroup = (RadioGroup) findViewById(R.id.qtn2);
        qtn3RadioGroup = (RadioGroup) findViewById(R.id.qtn3);
        qtn4RadioGroup = (RadioGroup) findViewById(R.id.qtn4);
        qtn5RadioGroup = (RadioGroup) findViewById(R.id.qtn5);
        qtn6RadioGroup = (RadioGroup) findViewById(R.id.qtn6);
        qtn7RadioGroup = (RadioGroup) findViewById(R.id.qtn7);
        qtn8RadioGroup = (RadioGroup) findViewById(R.id.qtn8);
        qtn9RadioGroup = (RadioGroup) findViewById(R.id.qtn9);
        qtn10RadioGroup = (RadioGroup) findViewById(R.id.qtn10);
        qtn11RadioGroup = (RadioGroup) findViewById(R.id.qtn11);



//        ONCLICK EVENT ON EACH RADIO BUTTON

//        ASSIGN 5 IF THE CORRECT ANSWER AND 0 IF WRONG ANSWER

       qtn1RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               if(checkedId == R.id.qtn1_optn1){
                   qtn_1 = 5;
                   Log.v("Your score", String.valueOf(qtn_1));
               }else{
                   qtn_1 = 0;
               }
           }
       });

        qtn2RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.qtn2_optn2){
                    qtn_2 = 5;
                    Log.v("Your score", String.valueOf(qtn_1));
                }else{
                    qtn_2 = 0;
                }
            }
        });

        qtn3RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.qtn3_optn1){
                    qtn_3 = 5;
                    Log.v("Your score", String.valueOf(qtn_1));
                }else{
                    qtn_3 = 0;
                }
            }
        });
        qtn4RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.qtn4_optn1){
                    qtn_4 = 5;
                    Log.v("Your score", String.valueOf(qtn_1));
                }else{
                    qtn_4 = 0;
                }
            }
        });
        qtn5RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.qtn5_optn1){
                    qtn_5 = 5;
                    Log.v("Your score", String.valueOf(qtn_1));
                }else{
                    qtn_5 = 0;
                }
            }
        });
        qtn6RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.qtn6_optn1){
                    qtn_6 = 5;
                    Log.v("Your score", String.valueOf(qtn_1));
                }else{
                    qtn_6 = 0;
                }
            }
        });
        qtn7RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.qtn7_optn3){
                    qtn_7 = 5;
                    Log.v("Your score", String.valueOf(qtn_1));
                }else{
                    qtn_7 = 0;
                }
            }
        });
        qtn8RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.qtn8_optn2){
                    qtn_8 = 5;
                    Log.v("Your score", String.valueOf(qtn_1));
                }else{
                    qtn_8 = 0;
                }
            }
        });
        qtn9RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.qtn9_optn2){
                    qtn_9 = 5;
                    Log.v("Your score", String.valueOf(qtn_1));
                }else{
                    qtn_9 = 0;
                }
            }
        });
        qtn10RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.qtn10_optn1){
                    qtn_10 = 5;
                    Log.v("Your score", String.valueOf(qtn_1));
                }else{
                    qtn_10 = 0;
                }
            }
        });
        qtn11RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.qtn11_optn3){
                    qtn_11 = 5;
                    Log.v("Your score", String.valueOf(qtn_1));
                }else{
                    qtn_11 = 0;
                }
            }
        });

    }


//    ONCLICK EVENT FROM THE BUTTON ON THE VIEW

    public void calculateQuiz(View view){

//        CHECKS IF THE RADIOGROUP ISNT EMPTY

        if(qtn1RadioGroup.getCheckedRadioButtonId() == -1 || qtn2RadioGroup.getCheckedRadioButtonId() == -1 || qtn3RadioGroup.getCheckedRadioButtonId() == -1 || qtn4RadioGroup.getCheckedRadioButtonId() == -1 || qtn5RadioGroup.getCheckedRadioButtonId() == -1 || qtn6RadioGroup.getCheckedRadioButtonId() == -1 || qtn7RadioGroup.getCheckedRadioButtonId() == -1 || qtn8RadioGroup.getCheckedRadioButtonId() == -1 || qtn9RadioGroup.getCheckedRadioButtonId() == -1 || qtn10RadioGroup.getCheckedRadioButtonId() == -1 || qtn11RadioGroup.getCheckedRadioButtonId() == -1){

//            ALERT USERS TO ANSWER ALL QUIZZES

            Toast.makeText(getApplicationContext(), "Kindly answer all the quiz", Toast.LENGTH_SHORT).show();
        }else{

//            SUM ALL OF THE QUESTIONS (I.E CORRECT ANSWER)

            tQuiz = qtn_1 + qtn_2 + qtn_3 + qtn_4 + qtn_5 + qtn_6 + qtn_7 + qtn_8 +qtn_9 + qtn_10 + qtn_11;

            /*
            DIVIDE THE TOTAL QUIZ SCORED BY THE TOTAL
            ATTAINABLE SCORE WHICH IS 55 THEN MULTIPLIED BY 100 TO GET THE % PERCENTAGE

            */

            double pScore = (tQuiz/tScore) * 100;

//            CLEAR RADIOGROUP AT THE CLICK OF THE BUTTON

            qtn1RadioGroup.clearCheck();
            qtn2RadioGroup.clearCheck();
            qtn3RadioGroup.clearCheck();
            qtn4RadioGroup.clearCheck();
            qtn5RadioGroup.clearCheck();
            qtn6RadioGroup.clearCheck();
            qtn7RadioGroup.clearCheck();
            qtn8RadioGroup.clearCheck();
            qtn9RadioGroup.clearCheck();
            qtn10RadioGroup.clearCheck();
            qtn11RadioGroup.clearCheck();

//            TAKE USER TO THE RESULT PAGE AND PASS THE SCORE AS PARAMETERS

            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("SCORE", String.valueOf(Math.floor(pScore)));
            startActivity(intent);

        }




    }


}
