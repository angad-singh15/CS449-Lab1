package com.example.umpirebuddyv10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int ballCount = 0;
    private int strikeCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ballbtn  =  findViewById(R.id.addBallBtn);
        Button strikebtn =  findViewById(R.id.addStrikeBtn);
        Button resetbtn =  findViewById(R.id.resetbtn);
        Button exitbtn = findViewById(R.id.exitButton);

        ballbtn.setOnClickListener(this);
        strikebtn.setOnClickListener(this);
        resetbtn.setOnClickListener(this);
        exitbtn.setOnClickListener(this);
    }

    private void updateBalldisplay() {
        TextView updateBallcnt = findViewById(R.id.ballCounter);
        String dispcount = getString(R.string.current_count_ball);
        dispcount += ballCount;
        updateBallcnt.setText(dispcount);
    }

    private void updateStrikedisplay() {
        TextView updateStrikecnt = findViewById(R.id.strikeCounter);
        String dispcount = getString(R.string.current_count_strike);
        dispcount += strikeCount;
        updateStrikecnt.setText(dispcount);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.addBallBtn:
                ballCount++;
                updateBalldisplay();
                break;

            case R.id.addStrikeBtn:
                strikeCount++;
                updateStrikedisplay();
                break;

            case R.id.resetbtn:
                ballCount = 0;
                strikeCount = 0;
                updateBalldisplay();
                updateStrikedisplay();
                break;

            case R.id.exitButton:
                finish();
                System.exit(0);

        }

    }
}
