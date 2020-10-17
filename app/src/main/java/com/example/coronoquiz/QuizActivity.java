package com.example.coronoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class QuizActivity extends AppCompatActivity {

    private TextView mScoreView , mQuestions;
    private Button mTrueButton, mFalseButton;

    private boolean mAnswer;
    private int mScore = 0;
    private int mQuestionnumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView =(TextView)findViewById(R.id.points);
        mQuestions =(TextView)findViewById(R.id.questions);
        mTrueButton =(Button)findViewById(R.id.truebutton);
        mFalseButton = (Button)findViewById(R.id.falsebutton);

        updateQuestions();

        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAnswer == true){
                    mScore++;
                    updatescore(mScore);

                    if (mQuestionnumber == Questions.question.length){
                        Intent i = new Intent(QuizActivity.this,ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore",mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    }
                    else {
                        updateQuestions();
                    }
                }

                else {

                    if (mQuestionnumber == Questions.question.length){
                        Intent i = new Intent(QuizActivity.this,ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore",mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    }
                    else {
                        updateQuestions();
                    }

                }

            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAnswer == false){
                    mScore++;
                    updatescore(mScore);

                    if (mQuestionnumber == Questions.question.length){
                        Intent i = new Intent(QuizActivity.this,ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore",mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    }
                    else {
                        updateQuestions();
                    }
                }

                else {

                    if (mQuestionnumber == Questions.question.length){
                        Intent i = new Intent(QuizActivity.this,ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore",mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    }
                    else {
                        updateQuestions();
                    }

                }
            }
        });

    }

    private void updateQuestions(){

            mQuestions.setText(Questions.question[mQuestionnumber]);
            mAnswer = Questions.answers[mQuestionnumber];
            mQuestionnumber++;
    }

    public void updatescore(int point){

        mScoreView.setText(""+ mScore);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slidefromleft,R.anim.slidetoright);
    }
}
