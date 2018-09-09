package com.example.android.taalhuisnieuwgrieks;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu options and add menu items to the app bar
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //User clicked on a menu option (switch statement used for if any other options get added later)
        switch (item.getItemId()) {
            case R.id.action_lesson_one:
                lessonOneIntent();
                return true;
            case R.id.action_lesson_two:
                lessonTwoIntent();
                return true;
            case R.id.action_lesson_three:
                lessonThreeIntent();
                return true;
            case R.id.action_lesson_four:
                lessonFourIntent();
                return true;
            case R.id.action_lesson_five:
                lessonFiveIntent();
                return true;
            case R.id.action_lesson_six:
                lessonSixIntent();
                return true;
            case R.id.action_lesson_seven:
                lessonSevenIntent();
                return true;
            case R.id.action_lesson_eight:
                lessonEightIntent();
                return true;
            case R.id.action_lesson_nine:
                lessonNineIntent();
                return true;
            case R.id.action_lesson_ten:
                lessonTenIntent();
                return true;
            case R.id.action_lesson_eleven:
                lessonElevenIntent();
                return true;
            case R.id.action_lesson_twelve:
                lessonTwelveIntent();
                return true;
            case R.id.action_lesson_thirteen:
                lessonThirteenIntent();
                return true;
            case R.id.action_lesson_fourteen:
                lessonFourteenIntent();
                return true;
            case R.id.action_lesson_fifteen:
                lessonFifteenIntent();
                return true;
            case R.id.action_lesson_sixteen:
                lessonSixteenIntent();
                return true;
            case R.id.action_lesson_seventeen:
                lessonSeventeenIntent();
                return true;
            case R.id.action_lesson_eighteen:
                lessonEighteenIntent();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    private void lessonOneIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonOneIntent = new Intent(MainActivity.this, LessonOneActivity.class);

        // Start the new activity
        startActivity(lessonOneIntent);
    }

    private void lessonTwoIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonTwoIntent = new Intent(MainActivity.this, LessonTwoActivity.class);

        // Start the new activity
        startActivity(lessonTwoIntent);
    }

    private void lessonThreeIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonThreeIntent = new Intent(MainActivity.this, LessonThreeActivity.class);

        // Start the new activity
        startActivity(lessonThreeIntent);
    }

    private void lessonFourIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonFourIntent = new Intent(MainActivity.this, LessonFourActivity.class);

        // Start the new activity
        startActivity(lessonFourIntent);
    }

    private void lessonFiveIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonFiveIntent = new Intent(MainActivity.this, LessonFiveActivity.class);

        // Start the new activity
        startActivity(lessonFiveIntent);
    }

    private void lessonSixIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonIntent = new Intent(MainActivity.this, LessonSixActivity.class);

        // Start the new activity
        startActivity(lessonIntent);
    }

    private void lessonSevenIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonIntent = new Intent(MainActivity.this, LessonSevenActivity.class);

        // Start the new activity
        startActivity(lessonIntent);
    }

    private void lessonEightIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonIntent = new Intent(MainActivity.this, LessonEightActivity.class);

        // Start the new activity
        startActivity(lessonIntent);
    }

    private void lessonNineIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonIntent = new Intent(MainActivity.this, LessonNineActivity.class);

        // Start the new activity
        startActivity(lessonIntent);
    }

    private void lessonTenIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonIntent = new Intent(MainActivity.this, LessonTenActivity.class);

        // Start the new activity
        startActivity(lessonIntent);
    }

    private void lessonElevenIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonIntent = new Intent(MainActivity.this, LessonElevenActivity.class);

        // Start the new activity
        startActivity(lessonIntent);
    }

    private void lessonTwelveIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonIntent = new Intent(MainActivity.this, LessonTwelveActivity.class);

        // Start the new activity
        startActivity(lessonIntent);
    }

    private void lessonThirteenIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonIntent = new Intent(MainActivity.this, LessonThirteenActivity.class);

        // Start the new activity
        startActivity(lessonIntent);
    }

    private void lessonFourteenIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonIntent = new Intent(MainActivity.this, LessonFourteenActivity.class);

        // Start the new activity
        startActivity(lessonIntent);
    }

    private void lessonFifteenIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonIntent = new Intent(MainActivity.this, LessonFifteenActivity.class);

        // Start the new activity
        startActivity(lessonIntent);
    }

    private void lessonSixteenIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonIntent = new Intent(MainActivity.this, LessonSixteenActivity.class);

        // Start the new activity
        startActivity(lessonIntent);
    }

    private void lessonSeventeenIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonIntent = new Intent(MainActivity.this, LessonSeventeenActivity.class);

        // Start the new activity
        startActivity(lessonIntent);
    }

    private void lessonEighteenIntent() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent lessonIntent = new Intent(MainActivity.this, LessonEighteenActivity.class);

        // Start the new activity
        startActivity(lessonIntent);
    }
}
