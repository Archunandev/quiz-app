package com.example.coronoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView mGrade, mFinalscore;
    Button mRetry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mGrade = (TextView)findViewById(R.id.grade);
        mFinalscore = (TextView)findViewById(R.id.outof);
        mRetry = (Button) findViewById(R.id.retry);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalscore");

        mFinalscore.setText("You have a "+score + " symtomps with in "+ Questions.question.length);
        if (score == 42){
            mGrade.setText("hoo no go o check the hospitals and have the treatment you are in seriuoss contison");
        }
        else if (score == 41){
            mGrade.setText("hoo no go o check the hospitals and have the treatment you are in seriuoss contison");
        }
        else if (score == 40){
            mGrade.setText("hoo no go o check the hospitals and have the treatment you are in seriuoss contison");
        }else if (score == 39){
            mGrade.setText("not bad but go and get your treatment of the test whith in one days");
        }else if (score == 38){
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 37) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 36) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 35) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 34) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 33) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 32) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 31) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 30) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 29) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 28) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 27) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 26) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 25) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 24) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 23) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 22) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 21) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 20) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 19) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 18) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 17) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 16) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 15) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 14) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 13) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 12) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 11) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 10) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 9) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 8) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 7) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 6) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 5) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 4) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 3) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 2) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        }else if (score == 1) {
            mGrade.setText("no is just a one problems take the home treatment are consoloe the doctor");
        } else{
            mGrade.setText("whoo you are not have  a any symtoms feel free eat healthy");
        }
        mRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this,QuizActivity.class));
                ResultActivity.this.finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slidefromleft,R.anim.slidetoright);
    }
}
