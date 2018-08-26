package com.example.android.taalhuisnieuwgrieks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LessonFifteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.fifteen_gr_word_1, R.string.fifteen_nl_word_1));
        words.add(new Word(R.string.fifteen_gr_word_2, R.string.fifteen_nl_word_2));
        words.add(new Word(R.string.fifteen_gr_word_3, R.string.fifteen_nl_word_3));
        words.add(new Word(R.string.fifteen_gr_word_4, R.string.fifteen_nl_word_4));
        words.add(new Word(R.string.fifteen_gr_word_5, R.string.fifteen_nl_word_5));
        words.add(new Word(R.string.fifteen_gr_word_6, R.string.fifteen_nl_word_6));
        words.add(new Word(R.string.fifteen_gr_word_7, R.string.fifteen_nl_word_7));
        words.add(new Word(R.string.fifteen_gr_word_8, R.string.fifteen_nl_word_8));
        words.add(new Word(R.string.fifteen_gr_word_9, R.string.fifteen_nl_word_9));
        words.add(new Word(R.string.fifteen_gr_word_10, R.string.fifteen_nl_word_10));
        words.add(new Word(R.string.fifteen_gr_word_11, R.string.fifteen_nl_word_11));
        words.add(new Word(R.string.fifteen_gr_word_12, R.string.fifteen_nl_word_12));
        words.add(new Word(R.string.fifteen_gr_word_13, R.string.fifteen_nl_word_13));
        words.add(new Word(R.string.fifteen_gr_word_14, R.string.fifteen_nl_word_14));
        words.add(new Word(R.string.fifteen_gr_word_15, R.string.fifteen_nl_word_15));
        words.add(new Word(R.string.fifteen_gr_word_16, R.string.fifteen_nl_word_16));
        words.add(new Word(R.string.fifteen_gr_word_17, R.string.fifteen_nl_word_17));
        words.add(new Word(R.string.fifteen_gr_word_18, R.string.fifteen_nl_word_18));
        words.add(new Word(R.string.fifteen_gr_word_19, R.string.fifteen_nl_word_19));
        words.add(new Word(R.string.fifteen_gr_word_20, R.string.fifteen_nl_word_20));
        words.add(new Word(R.string.fifteen_gr_word_21, R.string.fifteen_nl_word_21));
        words.add(new Word(R.string.fifteen_gr_word_22, R.string.fifteen_nl_word_22));
        words.add(new Word(R.string.fifteen_gr_word_23, R.string.fifteen_nl_word_23));
        words.add(new Word(R.string.fifteen_gr_word_24, R.string.fifteen_nl_word_24));
        words.add(new Word(R.string.fifteen_gr_word_25, R.string.fifteen_nl_word_25));
        words.add(new Word(R.string.fifteen_gr_word_26, R.string.fifteen_nl_word_26));
        words.add(new Word(R.string.fifteen_gr_word_27, R.string.fifteen_nl_word_27));
        words.add(new Word(R.string.fifteen_gr_word_28, R.string.fifteen_nl_word_28));
        words.add(new Word(R.string.fifteen_gr_word_29, R.string.fifteen_nl_word_29));
        words.add(new Word(R.string.fifteen_gr_word_30, R.string.fifteen_nl_word_30));
        words.add(new Word(R.string.fifteen_gr_word_31, R.string.fifteen_nl_word_31));
        words.add(new Word(R.string.fifteen_gr_word_32, R.string.fifteen_nl_word_32));
        words.add(new Word(R.string.fifteen_gr_word_33, R.string.fifteen_nl_word_33));



        WordAdapter adapter = new WordAdapter(this, words, R.color.colorYellow);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
