package com.example.android.taalhuisnieuwgrieks;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class LessonElevenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.eleven_gr_word_1, R.string.eleven_nl_word_1));
        words.add(new Word(R.string.eleven_gr_word_2, R.string.eleven_nl_word_2));
        words.add(new Word(R.string.eleven_gr_word_3, R.string.eleven_nl_word_3));
        words.add(new Word(R.string.eleven_gr_word_4, R.string.eleven_nl_word_4));
        words.add(new Word(R.string.eleven_gr_word_5, R.string.eleven_nl_word_5));
        words.add(new Word(R.string.eleven_gr_word_6, R.string.eleven_nl_word_6));
        words.add(new Word(R.string.eleven_gr_word_7, R.string.eleven_nl_word_7));
        words.add(new Word(R.string.eleven_gr_word_8, R.string.eleven_nl_word_8));
        words.add(new Word(R.string.eleven_gr_word_9, R.string.eleven_nl_word_9));
        words.add(new Word(R.string.eleven_gr_word_10, R.string.eleven_nl_word_10));
        words.add(new Word(R.string.eleven_gr_word_11, R.string.eleven_nl_word_11));
        words.add(new Word(R.string.eleven_gr_word_12, R.string.eleven_nl_word_12));
        words.add(new Word(R.string.eleven_gr_word_13, R.string.eleven_nl_word_13));
        words.add(new Word(R.string.eleven_gr_word_14, R.string.eleven_nl_word_14));
        words.add(new Word(R.string.eleven_gr_word_15, R.string.eleven_nl_word_15));
        words.add(new Word(R.string.eleven_gr_word_16, R.string.eleven_nl_word_16));
        words.add(new Word(R.string.eleven_gr_word_17, R.string.eleven_nl_word_17));
        words.add(new Word(R.string.eleven_gr_word_18, R.string.eleven_nl_word_18));
        words.add(new Word(R.string.eleven_gr_word_19, R.string.eleven_nl_word_19));
        words.add(new Word(R.string.eleven_gr_word_20, R.string.eleven_nl_word_20));
        words.add(new Word(R.string.eleven_gr_word_21, R.string.eleven_nl_word_21));
        words.add(new Word(R.string.eleven_gr_word_22, R.string.eleven_nl_word_22));
        words.add(new Word(R.string.eleven_gr_word_23, R.string.eleven_nl_word_23));
        words.add(new Word(R.string.eleven_gr_word_24, R.string.eleven_nl_word_24));
        words.add(new Word(R.string.eleven_gr_word_25, R.string.eleven_nl_word_25));
        words.add(new Word(R.string.eleven_gr_word_26, R.string.eleven_nl_word_26));
        words.add(new Word(R.string.eleven_gr_word_27, R.string.eleven_nl_word_27));
        words.add(new Word(R.string.eleven_gr_word_28, R.string.eleven_nl_word_28));
        words.add(new Word(R.string.eleven_gr_word_29, R.string.eleven_nl_word_29));
        words.add(new Word(R.string.eleven_gr_word_30, R.string.eleven_nl_word_30));
        words.add(new Word(R.string.eleven_gr_word_31, R.string.eleven_nl_word_31));
        words.add(new Word(R.string.eleven_gr_word_32, R.string.eleven_nl_word_32));
        words.add(new Word(R.string.eleven_gr_word_33, R.string.eleven_nl_word_33));
        words.add(new Word(R.string.eleven_gr_word_34, R.string.eleven_nl_word_34));
        words.add(new Word(R.string.eleven_gr_word_35, R.string.eleven_nl_word_35));
        words.add(new Word(R.string.eleven_gr_word_36, R.string.eleven_nl_word_36));
        words.add(new Word(R.string.eleven_gr_word_37, R.string.eleven_nl_word_37));
        words.add(new Word(R.string.eleven_gr_word_38, R.string.eleven_nl_word_38));
        words.add(new Word(R.string.eleven_gr_word_39, R.string.eleven_nl_word_39));
        words.add(new Word(R.string.eleven_gr_word_40, R.string.eleven_nl_word_40));
        words.add(new Word(R.string.eleven_gr_word_41, R.string.eleven_nl_word_41));
        words.add(new Word(R.string.eleven_gr_word_42, R.string.eleven_nl_word_42));
        words.add(new Word(R.string.eleven_gr_word_43, R.string.eleven_nl_word_43));
        words.add(new Word(R.string.eleven_gr_word_44, R.string.eleven_nl_word_44));
        words.add(new Word(R.string.eleven_gr_word_45, R.string.eleven_nl_word_45));
        words.add(new Word(R.string.eleven_gr_word_46, R.string.eleven_nl_word_46));
        words.add(new Word(R.string.eleven_gr_word_47, R.string.eleven_nl_word_47));
        words.add(new Word(R.string.eleven_gr_word_48, R.string.eleven_nl_word_48));
        words.add(new Word(R.string.eleven_gr_word_49, R.string.eleven_nl_word_49));
        words.add(new Word(R.string.eleven_gr_word_50, R.string.eleven_nl_word_50));
        words.add(new Word(R.string.eleven_gr_word_51, R.string.eleven_nl_word_51));
        words.add(new Word(R.string.eleven_gr_word_52, R.string.eleven_nl_word_52));
        words.add(new Word(R.string.eleven_gr_word_53, R.string.eleven_nl_word_53));
        words.add(new Word(R.string.eleven_gr_word_54, R.string.eleven_nl_word_54));
        words.add(new Word(R.string.eleven_gr_word_55, R.string.eleven_nl_word_55));
        words.add(new Word(R.string.eleven_gr_word_56, R.string.eleven_nl_word_56));
        words.add(new Word(R.string.eleven_gr_word_57, R.string.eleven_nl_word_57));
        words.add(new Word(R.string.eleven_gr_word_58, R.string.eleven_nl_word_58));
        words.add(new Word(R.string.eleven_gr_word_59, R.string.eleven_nl_word_59));
        words.add(new Word(R.string.eleven_gr_word_60, R.string.eleven_nl_word_60));
        words.add(new Word(R.string.eleven_gr_word_61, R.string.eleven_nl_word_61));
        words.add(new Word(R.string.eleven_gr_word_62, R.string.eleven_nl_word_62));
        words.add(new Word(R.string.eleven_gr_word_63, R.string.eleven_nl_word_63));
        words.add(new Word(R.string.eleven_gr_word_64, R.string.eleven_nl_word_64));
        words.add(new Word(R.string.eleven_gr_word_65, R.string.eleven_nl_word_65));
        words.add(new Word(R.string.eleven_gr_word_66, R.string.eleven_nl_word_66));
        words.add(new Word(R.string.eleven_gr_word_67, R.string.eleven_nl_word_67));
        words.add(new Word(R.string.eleven_gr_word_68, R.string.eleven_nl_word_68));
        words.add(new Word(R.string.eleven_gr_word_69, R.string.eleven_nl_word_69));
        words.add(new Word(R.string.eleven_gr_word_70, R.string.eleven_nl_word_70));
        words.add(new Word(R.string.eleven_gr_word_71, R.string.eleven_nl_word_71));
        words.add(new Word(R.string.eleven_gr_word_72, R.string.eleven_nl_word_72));
        words.add(new Word(R.string.eleven_gr_word_73, R.string.eleven_nl_word_73));
        words.add(new Word(R.string.eleven_gr_word_74, R.string.eleven_nl_word_74));
        words.add(new Word(R.string.eleven_gr_word_75, R.string.eleven_nl_word_75));
        words.add(new Word(R.string.eleven_gr_word_76, R.string.eleven_nl_word_76));
        words.add(new Word(R.string.eleven_gr_word_77, R.string.eleven_nl_word_77));
        words.add(new Word(R.string.eleven_gr_word_78, R.string.eleven_nl_word_78));
        words.add(new Word(R.string.eleven_gr_word_79, R.string.eleven_nl_word_79));
        words.add(new Word(R.string.eleven_gr_word_80, R.string.eleven_nl_word_80));
        words.add(new Word(R.string.eleven_gr_word_81, R.string.eleven_nl_word_81));
        words.add(new Word(R.string.eleven_gr_word_82, R.string.eleven_nl_word_82));
        words.add(new Word(R.string.eleven_gr_word_83, R.string.eleven_nl_word_83));
        words.add(new Word(R.string.eleven_gr_word_84, R.string.eleven_nl_word_84));
        words.add(new Word(R.string.eleven_gr_word_85, R.string.eleven_nl_word_85));
        words.add(new Word(R.string.eleven_gr_word_86, R.string.eleven_nl_word_86));
        words.add(new Word(R.string.eleven_gr_word_87, R.string.eleven_nl_word_87));
        words.add(new Word(R.string.eleven_gr_word_88, R.string.eleven_nl_word_88));
        words.add(new Word(R.string.eleven_gr_word_89, R.string.eleven_nl_word_89));
        words.add(new Word(R.string.eleven_gr_word_90, R.string.eleven_nl_word_90));
        words.add(new Word(R.string.eleven_gr_word_91, R.string.eleven_nl_word_91));
        words.add(new Word(R.string.eleven_gr_word_92, R.string.eleven_nl_word_92));
        words.add(new Word(R.string.eleven_gr_word_93, R.string.eleven_nl_word_93));
        words.add(new Word(R.string.eleven_gr_word_94, R.string.eleven_nl_word_94));
        words.add(new Word(R.string.eleven_gr_word_95, R.string.eleven_nl_word_95));
        words.add(new Word(R.string.eleven_gr_word_96, R.string.eleven_nl_word_96));
        words.add(new Word(R.string.eleven_gr_word_97, R.string.eleven_nl_word_97));
        words.add(new Word(R.string.eleven_gr_word_98, R.string.eleven_nl_word_98));
        words.add(new Word(R.string.eleven_gr_word_99, R.string.eleven_nl_word_99));
        words.add(new Word(R.string.eleven_gr_word_100, R.string.eleven_nl_word_100));
        words.add(new Word(R.string.eleven_gr_word_101, R.string.eleven_nl_word_101));
        words.add(new Word(R.string.eleven_gr_word_102, R.string.eleven_nl_word_102));
        words.add(new Word(R.string.eleven_gr_word_103, R.string.eleven_nl_word_103));
        words.add(new Word(R.string.eleven_gr_word_104, R.string.eleven_nl_word_104));
        words.add(new Word(R.string.eleven_gr_word_105, R.string.eleven_nl_word_105));
        words.add(new Word(R.string.eleven_gr_word_106, R.string.eleven_nl_word_106));
        words.add(new Word(R.string.eleven_gr_word_107, R.string.eleven_nl_word_107));
        words.add(new Word(R.string.eleven_gr_word_108, R.string.eleven_nl_word_108));
        words.add(new Word(R.string.eleven_gr_word_109, R.string.eleven_nl_word_109));
        words.add(new Word(R.string.eleven_gr_word_110, R.string.eleven_nl_word_110));
        words.add(new Word(R.string.eleven_gr_word_111, R.string.eleven_nl_word_111));
        words.add(new Word(R.string.eleven_gr_word_112, R.string.eleven_nl_word_112));
        words.add(new Word(R.string.eleven_gr_word_113, R.string.eleven_nl_word_113));


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
        Intent overhoorIntent = new Intent(LessonElevenActivity.this, TestActivityLessonElevenGRNL.class);

        // Start the new activity
        startActivity(overhoorIntent);
    }

    private void intentNLGR() {
        // Create a new intent to open the {@link NumbersActivity}
        Intent overhoorIntent = new Intent(LessonElevenActivity.this, TestActivityLessonElevenNLGR.class);

        // Start the new activity
        startActivity(overhoorIntent);
    }
}
