package com.example.android.taalhuisnieuwgrieks;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class LessonSixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.six_gr_word_1, R.string.six_nl_word_1));
        words.add(new Word(R.string.six_gr_word_2, R.string.six_nl_word_2));
        words.add(new Word(R.string.six_gr_word_3, R.string.six_nl_word_3));
        words.add(new Word(R.string.six_gr_word_4, R.string.six_nl_word_4));
        words.add(new Word(R.string.six_gr_word_5, R.string.six_nl_word_5));
        words.add(new Word(R.string.six_gr_word_6, R.string.six_nl_word_6));
        words.add(new Word(R.string.six_gr_word_7, R.string.six_nl_word_7));
        words.add(new Word(R.string.six_gr_word_8, R.string.six_nl_word_8));
        words.add(new Word(R.string.six_gr_word_9, R.string.six_nl_word_9));
        words.add(new Word(R.string.six_gr_word_10, R.string.six_nl_word_10));
        words.add(new Word(R.string.six_gr_word_11, R.string.six_nl_word_11));
        words.add(new Word(R.string.six_gr_word_12, R.string.six_nl_word_12));
        words.add(new Word(R.string.six_gr_word_13, R.string.six_nl_word_13));
        words.add(new Word(R.string.six_gr_word_14, R.string.six_nl_word_14));
        words.add(new Word(R.string.six_gr_word_15, R.string.six_nl_word_15));
        words.add(new Word(R.string.six_gr_word_16, R.string.six_nl_word_16));

        WordAdapter adapter = new WordAdapter(this, words, R.color.colorBlue);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu options and add menu items to the app bar
        getMenuInflater().inflate(R.menu.menu_lessons, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //User clicked on a menu option (switch statement used for if any other options get added later)
        switch (item.getItemId()) {
            case R.id.action_overhoor_GR_NL:
                intentGRNL();
                return true;
            case R.id.action_overhoor_NL_GR:
                intentNLGR();
                return true;
            // Respond to a click on the "Up" arrow button in the app bar
            case android.R.id.home:
                // Navigate back to parent activity (CatalogActivity)
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void intentGRNL() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent overhoorIntent = new Intent(LessonSixActivity.this, TestActivityLessonSixGRNL.class);

        // Start the new activity
        startActivity(overhoorIntent);
    }

    private void intentNLGR() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent overhoorIntent = new Intent(LessonSixActivity.this, TestActivityLessonSixNLGR.class);

        // Start the new activity
        startActivity(overhoorIntent);
    }
}
