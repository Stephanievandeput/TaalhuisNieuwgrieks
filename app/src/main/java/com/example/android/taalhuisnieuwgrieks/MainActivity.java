package com.example.android.taalhuisnieuwgrieks;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows lesson 1
        TextView lessonOne = findViewById(R.id.lesson_one);

        // Set a click listener on that View
        lessonOne.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 1 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonOneActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 2
        TextView lessonTwo = findViewById(R.id.lesson_two);

        // Set a click listener on that View
        lessonTwo.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 2 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonTwoActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 3
        TextView lessonThree = findViewById(R.id.lesson_three);

        // Set a click listener on that View
        lessonThree.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonThreeActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 4
        TextView lessonFour = findViewById(R.id.lesson_four);

        // Set a click listener on that View
        lessonFour.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonFourActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 5
        TextView lessonFive = findViewById(R.id.lesson_five);

        // Set a click listener on that View
        lessonFive.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonFiveActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 6
        TextView lessonSix = findViewById(R.id.lesson_six);

        // Set a click listener on that View
        lessonSix.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonSixActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 7
        TextView lessonSeven = findViewById(R.id.lesson_seven);

        // Set a click listener on that View
        lessonSeven.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonSevenActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 8
        TextView lessonEight = findViewById(R.id.lesson_eight);

        // Set a click listener on that View
        lessonEight.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonEightActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 9
        TextView lessonNine = findViewById(R.id.lesson_nine);

        // Set a click listener on that View
        lessonNine.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonNineActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 10
        TextView lessonTen = findViewById(R.id.lesson_ten);

        // Set a click listener on that View
        lessonTen.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonTenActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 11
        TextView lessonEleven = findViewById(R.id.lesson_eleven);

        // Set a click listener on that View
        lessonEleven.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonElevenActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 12
        TextView lessonTwelve = findViewById(R.id.lesson_twelve);

        // Set a click listener on that View
        lessonTwelve.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonTwelveActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 13
        TextView lessonThirteen = findViewById(R.id.lesson_thirteen);

        // Set a click listener on that View
        lessonThirteen.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonThirteenActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 14
        TextView lessonFourteen = findViewById(R.id.lesson_fourteen);

        // Set a click listener on that View
        lessonFourteen.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonFourteenActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 15
        TextView lessonFifteen = findViewById(R.id.lesson_fifteen);

        // Set a click listener on that View
        lessonFifteen.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonFifteenActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 16
        TextView lessonSixteen = findViewById(R.id.lesson_sixteen);

        // Set a click listener on that View
        lessonSixteen.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonSixteenActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 17
        TextView lessonSeventeen = findViewById(R.id.lesson_seventeen);

        // Set a click listener on that View
        lessonSeventeen.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonSeventeenActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });

        // Find the View that shows lesson 18
        TextView lessonEighteen = findViewById(R.id.lesson_eighteen);

        // Set a click listener on that View
        lessonEighteen.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when lesson 3 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent lessonIntent = new Intent(MainActivity.this, LessonEighteenActivity.class);

                // Start the new activity
                startActivity(lessonIntent);
            }
        });
    }
}
