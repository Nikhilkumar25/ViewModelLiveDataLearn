package com.wordpress.smartedudotin.www.viewmodellivedatalearn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wordpress.smartedudotin.www.viewmodellivedatalearn.ViewModel.ScoreViewModel;

public class MainActivity extends AppCompatActivity {

    ScoreViewModel scoreViewModel;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        scoreViewModel = new ViewModelProvider (MainActivity.this).get(ScoreViewModel.class);

        final TextView scoreTextView  = findViewById (R.id.textView);
        Button addScoreBtn = findViewById (R.id.addScoreBtn);
        Button resetScoreBtn = findViewById (R.id.resetScoreBtn);



        scoreViewModel.getScore ().observe (this, new Observer<Integer> () {
            @Override
            public void onChanged(Integer integer) {
                scoreTextView.setText (String.valueOf (integer));
            }
        });

        addScoreBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                scoreViewModel.addScore ();

            }
        });

        resetScoreBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                scoreViewModel.resetScore ();

            }
        });

    }
}