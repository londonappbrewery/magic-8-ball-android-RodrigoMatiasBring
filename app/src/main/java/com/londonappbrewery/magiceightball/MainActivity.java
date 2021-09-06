package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.askButton);
        RelativeLayout buttonParent = (RelativeLayout) myButton.getParent();
        myButton.setWidth(buttonParent.getWidth());
        ImageView ballDisplay = findViewById(R.id.image_eightBall);
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        Random randomNumberGenerator = new Random();
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = randomNumberGenerator.nextInt(5);
                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}
