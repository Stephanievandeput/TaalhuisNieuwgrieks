package com.example.android.taalhuisnieuwgrieks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LessonFourteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.fourteen_gr_word_1, R.string.fourteen_nl_word_1));
        words.add(new Word(R.string.fourteen_gr_word_2, R.string.fourteen_nl_word_2));
        words.add(new Word(R.string.fourteen_gr_word_3, R.string.fourteen_nl_word_3));
        words.add(new Word(R.string.fourteen_gr_word_4, R.string.fourteen_nl_word_4));
        words.add(new Word(R.string.fourteen_gr_word_5, R.string.fourteen_nl_word_5));
        words.add(new Word(R.string.fourteen_gr_word_6, R.string.fourteen_nl_word_6));
        words.add(new Word(R.string.fourteen_gr_word_7, R.string.fourteen_nl_word_7));
        words.add(new Word(R.string.fourteen_gr_word_8, R.string.fourteen_nl_word_8));
        words.add(new Word(R.string.fourteen_gr_word_9, R.string.fourteen_nl_word_9));
        words.add(new Word(R.string.fourteen_gr_word_10, R.string.fourteen_nl_word_10));
        words.add(new Word(R.string.fourteen_gr_word_11, R.string.fourteen_nl_word_11));
        words.add(new Word(R.string.fourteen_gr_word_12, R.string.fourteen_nl_word_12));
        words.add(new Word(R.string.fourteen_gr_word_13, R.string.fourteen_nl_word_13));
        words.add(new Word(R.string.fourteen_gr_word_14, R.string.fourteen_nl_word_14));
        words.add(new Word(R.string.fourteen_gr_word_15, R.string.fourteen_nl_word_15));
        words.add(new Word(R.string.fourteen_gr_word_16, R.string.fourteen_nl_word_16));
        words.add(new Word(R.string.fourteen_gr_word_17, R.string.fourteen_nl_word_17));
        words.add(new Word(R.string.fourteen_gr_word_18, R.string.fourteen_nl_word_18));
        words.add(new Word(R.string.fourteen_gr_word_19, R.string.fourteen_nl_word_19));
        words.add(new Word(R.string.fourteen_gr_word_20, R.string.fourteen_nl_word_20));
        words.add(new Word(R.string.fourteen_gr_word_21, R.string.fourteen_nl_word_21));
        words.add(new Word(R.string.fourteen_gr_word_22, R.string.fourteen_nl_word_22));
        words.add(new Word(R.string.fourteen_gr_word_23, R.string.fourteen_nl_word_23));
        words.add(new Word(R.string.fourteen_gr_word_24, R.string.fourteen_nl_word_24));
        words.add(new Word(R.string.fourteen_gr_word_25, R.string.fourteen_nl_word_25));
        words.add(new Word(R.string.fourteen_gr_word_26, R.string.fourteen_nl_word_26));
        words.add(new Word(R.string.fourteen_gr_word_27, R.string.fourteen_nl_word_27));
        words.add(new Word(R.string.fourteen_gr_word_28, R.string.fourteen_nl_word_28));
        words.add(new Word(R.string.fourteen_gr_word_29, R.string.fourteen_nl_word_29));
        words.add(new Word(R.string.fourteen_gr_word_30, R.string.fourteen_nl_word_30));
        words.add(new Word(R.string.fourteen_gr_word_31, R.string.fourteen_nl_word_31));
        words.add(new Word(R.string.fourteen_gr_word_32, R.string.fourteen_nl_word_32));
        words.add(new Word(R.string.fourteen_gr_word_33, R.string.fourteen_nl_word_33));
        words.add(new Word(R.string.fourteen_gr_word_34, R.string.fourteen_nl_word_34));
        words.add(new Word(R.string.fourteen_gr_word_35, R.string.fourteen_nl_word_35));
        words.add(new Word(R.string.fourteen_gr_word_36, R.string.fourteen_nl_word_36));
        words.add(new Word(R.string.fourteen_gr_word_37, R.string.fourteen_nl_word_37));
        words.add(new Word(R.string.fourteen_gr_word_38, R.string.fourteen_nl_word_38));
        words.add(new Word(R.string.fourteen_gr_word_39, R.string.fourteen_nl_word_39));
        words.add(new Word(R.string.fourteen_gr_word_40, R.string.fourteen_nl_word_40));
        words.add(new Word(R.string.fourteen_gr_word_41, R.string.fourteen_nl_word_41));
        words.add(new Word(R.string.fourteen_gr_word_42, R.string.fourteen_nl_word_42));
        words.add(new Word(R.string.fourteen_gr_word_43, R.string.fourteen_nl_word_43));
        words.add(new Word(R.string.fourteen_gr_word_44, R.string.fourteen_nl_word_44));
        words.add(new Word(R.string.fourteen_gr_word_45, R.string.fourteen_nl_word_45));
        words.add(new Word(R.string.fourteen_gr_word_46, R.string.fourteen_nl_word_46));
        words.add(new Word(R.string.fourteen_gr_word_47, R.string.fourteen_nl_word_47));
        words.add(new Word(R.string.fourteen_gr_word_48, R.string.fourteen_nl_word_48));
        words.add(new Word(R.string.fourteen_gr_word_49, R.string.fourteen_nl_word_49));
        words.add(new Word(R.string.fourteen_gr_word_50, R.string.fourteen_nl_word_50));
        words.add(new Word(R.string.fourteen_gr_word_51, R.string.fourteen_nl_word_51));
        words.add(new Word(R.string.fourteen_gr_word_52, R.string.fourteen_nl_word_52));
        words.add(new Word(R.string.fourteen_gr_word_53, R.string.fourteen_nl_word_53));
        words.add(new Word(R.string.fourteen_gr_word_54, R.string.fourteen_nl_word_54));
        words.add(new Word(R.string.fourteen_gr_word_55, R.string.fourteen_nl_word_55));
        words.add(new Word(R.string.fourteen_gr_word_56, R.string.fourteen_nl_word_56));
        words.add(new Word(R.string.fourteen_gr_word_57, R.string.fourteen_nl_word_57));
        words.add(new Word(R.string.fourteen_gr_word_58, R.string.fourteen_nl_word_58));
        words.add(new Word(R.string.fourteen_gr_word_59, R.string.fourteen_nl_word_59));
        words.add(new Word(R.string.fourteen_gr_word_60, R.string.fourteen_nl_word_60));
        words.add(new Word(R.string.fourteen_gr_word_61, R.string.fourteen_nl_word_61));
        words.add(new Word(R.string.fourteen_gr_word_62, R.string.fourteen_nl_word_62));
        words.add(new Word(R.string.fourteen_gr_word_63, R.string.fourteen_nl_word_63));
        words.add(new Word(R.string.fourteen_gr_word_64, R.string.fourteen_nl_word_64));
        words.add(new Word(R.string.fourteen_gr_word_65, R.string.fourteen_nl_word_65));
        words.add(new Word(R.string.fourteen_gr_word_66, R.string.fourteen_nl_word_66));
        words.add(new Word(R.string.fourteen_gr_word_67, R.string.fourteen_nl_word_67));
        words.add(new Word(R.string.fourteen_gr_word_68, R.string.fourteen_nl_word_68));


        WordAdapter adapter = new WordAdapter(this, words, R.color.colorBlue);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}