package com.example.android.taalhuisnieuwgrieks;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class LessonSeventeenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.seventeen_gr_word_1, R.string.seventeen_nl_word_1));
        words.add(new Word(R.string.seventeen_gr_word_2, R.string.seventeen_nl_word_2));
        words.add(new Word(R.string.seventeen_gr_word_3, R.string.seventeen_nl_word_3));
        words.add(new Word(R.string.seventeen_gr_word_4, R.string.seventeen_nl_word_4));
        words.add(new Word(R.string.seventeen_gr_word_5, R.string.seventeen_nl_word_5));
        words.add(new Word(R.string.seventeen_gr_word_6, R.string.seventeen_nl_word_6));
        words.add(new Word(R.string.seventeen_gr_word_7, R.string.seventeen_nl_word_7));
        words.add(new Word(R.string.seventeen_gr_word_8, R.string.seventeen_nl_word_8));
        words.add(new Word(R.string.seventeen_gr_word_9, R.string.seventeen_nl_word_9));
        words.add(new Word(R.string.seventeen_gr_word_10, R.string.seventeen_nl_word_10));
        words.add(new Word(R.string.seventeen_gr_word_11, R.string.seventeen_nl_word_11));
        words.add(new Word(R.string.seventeen_gr_word_12, R.string.seventeen_nl_word_12));
        words.add(new Word(R.string.seventeen_gr_word_13, R.string.seventeen_nl_word_13));
        words.add(new Word(R.string.seventeen_gr_word_14, R.string.seventeen_nl_word_14));
        words.add(new Word(R.string.seventeen_gr_word_15, R.string.seventeen_nl_word_15));
        words.add(new Word(R.string.seventeen_gr_word_16, R.string.seventeen_nl_word_16));
        words.add(new Word(R.string.seventeen_gr_word_17, R.string.seventeen_nl_word_17));
        words.add(new Word(R.string.seventeen_gr_word_18, R.string.seventeen_nl_word_18));
        words.add(new Word(R.string.seventeen_gr_word_19, R.string.seventeen_nl_word_19));
        words.add(new Word(R.string.seventeen_gr_word_20, R.string.seventeen_nl_word_20));
        words.add(new Word(R.string.seventeen_gr_word_21, R.string.seventeen_nl_word_21));
        words.add(new Word(R.string.seventeen_gr_word_22, R.string.seventeen_nl_word_22));
        words.add(new Word(R.string.seventeen_gr_word_23, R.string.seventeen_nl_word_23));
        words.add(new Word(R.string.seventeen_gr_word_24, R.string.seventeen_nl_word_24));
        words.add(new Word(R.string.seventeen_gr_word_25, R.string.seventeen_nl_word_25));
        words.add(new Word(R.string.seventeen_gr_word_26, R.string.seventeen_nl_word_26));
        words.add(new Word(R.string.seventeen_gr_word_27, R.string.seventeen_nl_word_27));
        words.add(new Word(R.string.seventeen_gr_word_28, R.string.seventeen_nl_word_28));
        words.add(new Word(R.string.seventeen_gr_word_29, R.string.seventeen_nl_word_29));
        words.add(new Word(R.string.seventeen_gr_word_30, R.string.seventeen_nl_word_30));
        words.add(new Word(R.string.seventeen_gr_word_31, R.string.seventeen_nl_word_31));
        words.add(new Word(R.string.seventeen_gr_word_32, R.string.seventeen_nl_word_32));
        words.add(new Word(R.string.seventeen_gr_word_33, R.string.seventeen_nl_word_33));
        words.add(new Word(R.string.seventeen_gr_word_34, R.string.seventeen_nl_word_34));
        words.add(new Word(R.string.seventeen_gr_word_35, R.string.seventeen_nl_word_35));
        words.add(new Word(R.string.seventeen_gr_word_36, R.string.seventeen_nl_word_36));
        words.add(new Word(R.string.seventeen_gr_word_37, R.string.seventeen_nl_word_37));
        words.add(new Word(R.string.seventeen_gr_word_38, R.string.seventeen_nl_word_38));
        words.add(new Word(R.string.seventeen_gr_word_39, R.string.seventeen_nl_word_39));
        words.add(new Word(R.string.seventeen_gr_word_40, R.string.seventeen_nl_word_40));
        words.add(new Word(R.string.seventeen_gr_word_41, R.string.seventeen_nl_word_41));
        words.add(new Word(R.string.seventeen_gr_word_42, R.string.seventeen_nl_word_42));
        words.add(new Word(R.string.seventeen_gr_word_43, R.string.seventeen_nl_word_43));
        words.add(new Word(R.string.seventeen_gr_word_44, R.string.seventeen_nl_word_44));
        words.add(new Word(R.string.seventeen_gr_word_45, R.string.seventeen_nl_word_45));
        words.add(new Word(R.string.seventeen_gr_word_46, R.string.seventeen_nl_word_46));
        words.add(new Word(R.string.seventeen_gr_word_47, R.string.seventeen_nl_word_47));
        words.add(new Word(R.string.seventeen_gr_word_48, R.string.seventeen_nl_word_48));
        words.add(new Word(R.string.seventeen_gr_word_49, R.string.seventeen_nl_word_49));
        words.add(new Word(R.string.seventeen_gr_word_50, R.string.seventeen_nl_word_50));
        words.add(new Word(R.string.seventeen_gr_word_51, R.string.seventeen_nl_word_51));
        words.add(new Word(R.string.seventeen_gr_word_52, R.string.seventeen_nl_word_52));
        words.add(new Word(R.string.seventeen_gr_word_53, R.string.seventeen_nl_word_53));
        words.add(new Word(R.string.seventeen_gr_word_54, R.string.seventeen_nl_word_54));
        words.add(new Word(R.string.seventeen_gr_word_55, R.string.seventeen_nl_word_55));
        words.add(new Word(R.string.seventeen_gr_word_56, R.string.seventeen_nl_word_56));
        words.add(new Word(R.string.seventeen_gr_word_57, R.string.seventeen_nl_word_57));
        words.add(new Word(R.string.seventeen_gr_word_58, R.string.seventeen_nl_word_58));
        words.add(new Word(R.string.seventeen_gr_word_59, R.string.seventeen_nl_word_59));
        words.add(new Word(R.string.seventeen_gr_word_60, R.string.seventeen_nl_word_60));
        words.add(new Word(R.string.seventeen_gr_word_61, R.string.seventeen_nl_word_61));
        words.add(new Word(R.string.seventeen_gr_word_62, R.string.seventeen_nl_word_62));
        words.add(new Word(R.string.seventeen_gr_word_63, R.string.seventeen_nl_word_63));
        words.add(new Word(R.string.seventeen_gr_word_64, R.string.seventeen_nl_word_64));
        words.add(new Word(R.string.seventeen_gr_word_65, R.string.seventeen_nl_word_65));
        words.add(new Word(R.string.seventeen_gr_word_66, R.string.seventeen_nl_word_66));
        words.add(new Word(R.string.seventeen_gr_word_67, R.string.seventeen_nl_word_67));
        words.add(new Word(R.string.seventeen_gr_word_68, R.string.seventeen_nl_word_68));
        words.add(new Word(R.string.seventeen_gr_word_69, R.string.seventeen_nl_word_69));
        words.add(new Word(R.string.seventeen_gr_word_70, R.string.seventeen_nl_word_70));

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
        Intent overhoorIntent = new Intent(LessonSeventeenActivity.this, TestActivityLessonSeventeenGRNL.class);

        // Start the new activity
        startActivity(overhoorIntent);
    }

    private void intentNLGR() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent overhoorIntent = new Intent(LessonSeventeenActivity.this, TestActivityLessonSeventeenNLGR.class);

        // Start the new activity
        startActivity(overhoorIntent);
    }
}
