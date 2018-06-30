package com.example.android.techknow;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

//        GET THE PARAMETER PASSED FROM THE VIEW AND ASSIGN TO A VARIABLE

        String s = getIntent().getStringExtra("SCORE");

//        PARSE RESULT TO DOUBLE SO WE CAN RUN LOGIC

        Double value = Double.parseDouble(s);

//        CHECK IF VALUE IS GREATER THAN 60 OR EQUALS 100

        if(value >= 60 || value == 100) {

//            DISPLAY IMAGE ON activity_result
            ImageView img = (ImageView) findViewById(R.id.image);
            img.setImageResource(R.drawable.congrats);

//            CONGRATULATE PLAYER GOOD JOB
            TextView txt = (TextView) findViewById(R.id.display_text);
            txt.setText("You scored " + value+ "% Of the quiz. Good job ");

//            CHECK IF VALUE IS LESSER THAN 59
        }else if(value <= 59){

//            DISPLAY IMAGE ON activity_result

            ImageView img = (ImageView) findViewById(R.id.image);
            img.setImageResource(R.drawable.encourage);

//            DISPLAY TEXT TO ENCOURAGE USER TO TRY AGAIN
            TextView txt = (TextView) findViewById(R.id.display_text);
            txt.setText("You scored "+ value + "% of the Quiz. \n You can do better. Try again");
        }
    }
}
