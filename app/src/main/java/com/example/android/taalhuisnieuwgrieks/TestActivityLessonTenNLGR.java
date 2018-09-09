package com.example.android.taalhuisnieuwgrieks;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class TestActivityLessonTenNLGR extends AppCompatActivity {
    int i = 0;
    int mCorrectScore = 0;
    int mIncorrectScore = 0;
    boolean hasAnswered = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.ten_gr_word_1, R.string.ten_nl_word_1));
        words.add(new Word(R.string.ten_gr_word_2, R.string.ten_nl_word_2));
        words.add(new Word(R.string.ten_gr_word_3, R.string.ten_nl_word_3));
        words.add(new Word(R.string.ten_gr_word_4, R.string.ten_nl_word_4));
        words.add(new Word(R.string.ten_gr_word_5, R.string.ten_nl_word_5));
        words.add(new Word(R.string.ten_gr_word_6, R.string.ten_nl_word_6));
        words.add(new Word(R.string.ten_gr_word_7, R.string.ten_nl_word_7));
        words.add(new Word(R.string.ten_gr_word_8, R.string.ten_nl_word_8));
        words.add(new Word(R.string.ten_gr_word_9, R.string.ten_nl_word_9));
        words.add(new Word(R.string.ten_gr_word_10, R.string.ten_nl_word_10));
        words.add(new Word(R.string.ten_gr_word_11, R.string.ten_nl_word_11));
        words.add(new Word(R.string.ten_gr_word_12, R.string.ten_nl_word_12));
        words.add(new Word(R.string.ten_gr_word_13, R.string.ten_nl_word_13));
        words.add(new Word(R.string.ten_gr_word_14, R.string.ten_nl_word_14));
        words.add(new Word(R.string.ten_gr_word_15, R.string.ten_nl_word_15));
        words.add(new Word(R.string.ten_gr_word_16, R.string.ten_nl_word_16));
        words.add(new Word(R.string.ten_gr_word_17, R.string.ten_nl_word_17));
        words.add(new Word(R.string.ten_gr_word_18, R.string.ten_nl_word_18));
        words.add(new Word(R.string.ten_gr_word_19, R.string.ten_nl_word_19));
        words.add(new Word(R.string.ten_gr_word_20, R.string.ten_nl_word_20));
        words.add(new Word(R.string.ten_gr_word_21, R.string.ten_nl_word_21));
        words.add(new Word(R.string.ten_gr_word_22, R.string.ten_nl_word_22));
        words.add(new Word(R.string.ten_gr_word_23, R.string.ten_nl_word_23));
        words.add(new Word(R.string.ten_gr_word_24, R.string.ten_nl_word_24));
        words.add(new Word(R.string.ten_gr_word_25, R.string.ten_nl_word_25));
        words.add(new Word(R.string.ten_gr_word_26, R.string.ten_nl_word_26));
        words.add(new Word(R.string.ten_gr_word_27, R.string.ten_nl_word_27));
        words.add(new Word(R.string.ten_gr_word_28, R.string.ten_nl_word_28));
        words.add(new Word(R.string.ten_gr_word_29, R.string.ten_nl_word_29));
        words.add(new Word(R.string.ten_gr_word_30, R.string.ten_nl_word_30));
        words.add(new Word(R.string.ten_gr_word_31, R.string.ten_nl_word_31));
        words.add(new Word(R.string.ten_gr_word_32, R.string.ten_nl_word_32));
        words.add(new Word(R.string.ten_gr_word_33, R.string.ten_nl_word_33));
        words.add(new Word(R.string.ten_gr_word_34, R.string.ten_nl_word_34));
        words.add(new Word(R.string.ten_gr_word_35, R.string.ten_nl_word_35));
        words.add(new Word(R.string.ten_gr_word_36, R.string.ten_nl_word_36));
        words.add(new Word(R.string.ten_gr_word_37, R.string.ten_nl_word_37));
        words.add(new Word(R.string.ten_gr_word_38, R.string.ten_nl_word_38));
        words.add(new Word(R.string.ten_gr_word_39, R.string.ten_nl_word_39));
        words.add(new Word(R.string.ten_gr_word_40, R.string.ten_nl_word_40));
        words.add(new Word(R.string.ten_gr_word_41, R.string.ten_nl_word_41));
        words.add(new Word(R.string.ten_gr_word_42, R.string.ten_nl_word_42));
        words.add(new Word(R.string.ten_gr_word_43, R.string.ten_nl_word_43));
        words.add(new Word(R.string.ten_gr_word_44, R.string.ten_nl_word_44));
        words.add(new Word(R.string.ten_gr_word_45, R.string.ten_nl_word_45));
        words.add(new Word(R.string.ten_gr_word_46, R.string.ten_nl_word_46));
        words.add(new Word(R.string.ten_gr_word_47, R.string.ten_nl_word_47));
        words.add(new Word(R.string.ten_gr_word_48, R.string.ten_nl_word_48));
        words.add(new Word(R.string.ten_gr_word_49, R.string.ten_nl_word_49));
        words.add(new Word(R.string.ten_gr_word_50, R.string.ten_nl_word_50));
        words.add(new Word(R.string.ten_gr_word_51, R.string.ten_nl_word_51));
        words.add(new Word(R.string.ten_gr_word_52, R.string.ten_nl_word_52));
        words.add(new Word(R.string.ten_gr_word_53, R.string.ten_nl_word_53));
        words.add(new Word(R.string.ten_gr_word_54, R.string.ten_nl_word_54));
        words.add(new Word(R.string.ten_gr_word_55, R.string.ten_nl_word_55));
        words.add(new Word(R.string.ten_gr_word_56, R.string.ten_nl_word_56));
        words.add(new Word(R.string.ten_gr_word_57, R.string.ten_nl_word_57));
        words.add(new Word(R.string.ten_gr_word_58, R.string.ten_nl_word_58));
        words.add(new Word(R.string.ten_gr_word_59, R.string.ten_nl_word_59));
        words.add(new Word(R.string.ten_gr_word_60, R.string.ten_nl_word_60));
        words.add(new Word(R.string.ten_gr_word_61, R.string.ten_nl_word_61));
        words.add(new Word(R.string.ten_gr_word_62, R.string.ten_nl_word_62));
        words.add(new Word(R.string.ten_gr_word_63, R.string.ten_nl_word_63));
        words.add(new Word(R.string.ten_gr_word_64, R.string.ten_nl_word_64));
        words.add(new Word(R.string.ten_gr_word_65, R.string.ten_nl_word_65));
        words.add(new Word(R.string.ten_gr_word_66, R.string.ten_nl_word_66));
        words.add(new Word(R.string.ten_gr_word_67, R.string.ten_nl_word_67));
        words.add(new Word(R.string.ten_gr_word_68, R.string.ten_nl_word_68));
        words.add(new Word(R.string.ten_gr_word_69, R.string.ten_nl_word_69));
        words.add(new Word(R.string.ten_gr_word_70, R.string.ten_nl_word_70));
        words.add(new Word(R.string.ten_gr_word_71, R.string.ten_nl_word_71));
        words.add(new Word(R.string.ten_gr_word_72, R.string.ten_nl_word_72));
        words.add(new Word(R.string.ten_gr_word_73, R.string.ten_nl_word_73));
        words.add(new Word(R.string.ten_gr_word_74, R.string.ten_nl_word_74));
        words.add(new Word(R.string.ten_gr_word_75, R.string.ten_nl_word_75));
        words.add(new Word(R.string.ten_gr_word_76, R.string.ten_nl_word_76));
        words.add(new Word(R.string.ten_gr_word_77, R.string.ten_nl_word_77));
        words.add(new Word(R.string.ten_gr_word_78, R.string.ten_nl_word_78));
        words.add(new Word(R.string.ten_gr_word_79, R.string.ten_nl_word_79));
        words.add(new Word(R.string.ten_gr_word_80, R.string.ten_nl_word_80));
        words.add(new Word(R.string.ten_gr_word_81, R.string.ten_nl_word_81));
        words.add(new Word(R.string.ten_gr_word_82, R.string.ten_nl_word_82));
        words.add(new Word(R.string.ten_gr_word_83, R.string.ten_nl_word_83));
        words.add(new Word(R.string.ten_gr_word_84, R.string.ten_nl_word_84));
        words.add(new Word(R.string.ten_gr_word_85, R.string.ten_nl_word_85));
        words.add(new Word(R.string.ten_gr_word_86, R.string.ten_nl_word_86));
        words.add(new Word(R.string.ten_gr_word_87, R.string.ten_nl_word_87));
        words.add(new Word(R.string.ten_gr_word_88, R.string.ten_nl_word_88));
        words.add(new Word(R.string.ten_gr_word_89, R.string.ten_nl_word_89));
        words.add(new Word(R.string.ten_gr_word_90, R.string.ten_nl_word_90));
        words.add(new Word(R.string.ten_gr_word_91, R.string.ten_nl_word_91));
        words.add(new Word(R.string.ten_gr_word_92, R.string.ten_nl_word_92));
        words.add(new Word(R.string.ten_gr_word_93, R.string.ten_nl_word_93));
        words.add(new Word(R.string.ten_gr_word_94, R.string.ten_nl_word_94));
        words.add(new Word(R.string.ten_gr_word_95, R.string.ten_nl_word_95));
        words.add(new Word(R.string.ten_gr_word_96, R.string.ten_nl_word_96));
        words.add(new Word(R.string.ten_gr_word_97, R.string.ten_nl_word_97));
        words.add(new Word(R.string.ten_gr_word_98, R.string.ten_nl_word_98));
        words.add(new Word(R.string.ten_gr_word_99, R.string.ten_nl_word_99));
        words.add(new Word(R.string.ten_gr_word_100, R.string.ten_nl_word_100));
        words.add(new Word(R.string.ten_gr_word_101, R.string.ten_nl_word_101));
        words.add(new Word(R.string.ten_gr_word_102, R.string.ten_nl_word_102));
        words.add(new Word(R.string.ten_gr_word_103, R.string.ten_nl_word_103));
        words.add(new Word(R.string.ten_gr_word_104, R.string.ten_nl_word_104));
        words.add(new Word(R.string.ten_gr_word_105, R.string.ten_nl_word_105));
        words.add(new Word(R.string.ten_gr_word_106, R.string.ten_nl_word_106));
        words.add(new Word(R.string.ten_gr_word_107, R.string.ten_nl_word_107));
        words.add(new Word(R.string.ten_gr_word_108, R.string.ten_nl_word_108));
        words.add(new Word(R.string.ten_gr_word_109, R.string.ten_nl_word_109));
        words.add(new Word(R.string.ten_gr_word_110, R.string.ten_nl_word_110));
        words.add(new Word(R.string.ten_gr_word_111, R.string.ten_nl_word_111));
        words.add(new Word(R.string.ten_gr_word_112, R.string.ten_nl_word_112));
        words.add(new Word(R.string.ten_gr_word_113, R.string.ten_nl_word_113));
        words.add(new Word(R.string.ten_gr_word_114, R.string.ten_nl_word_114));
        words.add(new Word(R.string.ten_gr_word_115, R.string.ten_nl_word_115));
        words.add(new Word(R.string.ten_gr_word_116, R.string.ten_nl_word_116));
        words.add(new Word(R.string.ten_gr_word_117, R.string.ten_nl_word_117));
        words.add(new Word(R.string.ten_gr_word_118, R.string.ten_nl_word_118));
        words.add(new Word(R.string.ten_gr_word_119, R.string.ten_nl_word_119));
        words.add(new Word(R.string.ten_gr_word_120, R.string.ten_nl_word_120));
        words.add(new Word(R.string.ten_gr_word_121, R.string.ten_nl_word_121));
        words.add(new Word(R.string.ten_gr_word_122, R.string.ten_nl_word_122));
        words.add(new Word(R.string.ten_gr_word_123, R.string.ten_nl_word_123));
        words.add(new Word(R.string.ten_gr_word_124, R.string.ten_nl_word_124));
        words.add(new Word(R.string.ten_gr_word_125, R.string.ten_nl_word_125));
        words.add(new Word(R.string.ten_gr_word_126, R.string.ten_nl_word_126));
        words.add(new Word(R.string.ten_gr_word_127, R.string.ten_nl_word_127));
        words.add(new Word(R.string.ten_gr_word_128, R.string.ten_nl_word_128));
        words.add(new Word(R.string.ten_gr_word_129, R.string.ten_nl_word_129));
        words.add(new Word(R.string.ten_gr_word_130, R.string.ten_nl_word_130));
        words.add(new Word(R.string.ten_gr_word_131, R.string.ten_nl_word_131));
        words.add(new Word(R.string.ten_gr_word_132, R.string.ten_nl_word_132));
        words.add(new Word(R.string.ten_gr_word_133, R.string.ten_nl_word_133));
        words.add(new Word(R.string.ten_gr_word_134, R.string.ten_nl_word_134));
        words.add(new Word(R.string.ten_gr_word_135, R.string.ten_nl_word_135));
        words.add(new Word(R.string.ten_gr_word_136, R.string.ten_nl_word_136));
        words.add(new Word(R.string.ten_gr_word_137, R.string.ten_nl_word_137));
        words.add(new Word(R.string.ten_gr_word_138, R.string.ten_nl_word_138));
        words.add(new Word(R.string.ten_gr_word_139, R.string.ten_nl_word_139));
        words.add(new Word(R.string.ten_gr_word_140, R.string.ten_nl_word_140));
        words.add(new Word(R.string.ten_gr_word_141, R.string.ten_nl_word_141));
        words.add(new Word(R.string.ten_gr_word_142, R.string.ten_nl_word_142));
        words.add(new Word(R.string.ten_gr_word_143, R.string.ten_nl_word_143));
        words.add(new Word(R.string.ten_gr_word_144, R.string.ten_nl_word_144));
        words.add(new Word(R.string.ten_gr_word_145, R.string.ten_nl_word_145));
        words.add(new Word(R.string.ten_gr_word_146, R.string.ten_nl_word_146));
        words.add(new Word(R.string.ten_gr_word_147, R.string.ten_nl_word_147));
        words.add(new Word(R.string.ten_gr_word_148, R.string.ten_nl_word_148));
        words.add(new Word(R.string.ten_gr_word_149, R.string.ten_nl_word_149));
        words.add(new Word(R.string.ten_gr_word_150, R.string.ten_nl_word_150));
        words.add(new Word(R.string.ten_gr_word_151, R.string.ten_nl_word_151));

        //TextView to display the current word.
        final TextView currentWordTextView = findViewById(R.id.current_word_text_view);
        currentWordTextView.setVisibility(View.INVISIBLE);
        final TextView currentAnswerTextView = findViewById(R.id.current_answer_text_view);
        currentAnswerTextView.setVisibility(View.INVISIBLE);
        final TextView endOfTheLessonTextView = findViewById(R.id.einde_overhoring_text_view);
        endOfTheLessonTextView.setVisibility(View.INVISIBLE);

        //Button for showing the answer, when the user click on this button, the corrent answer is shown.
        final Button showAnswerButton = findViewById(R.id.show_answer_button);
        showAnswerButton.setVisibility(View.INVISIBLE);
        showAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentAnswerTextView.setVisibility(View.VISIBLE);
                hasAnswered = true;
            }
        });

        //TextView that shows how many answers are correct.
        final TextView correctScoreTextView = findViewById(R.id.correct_score_text_view);
        //Button to increment the amount of correct answers.
        final Button incrementCorrectScore = findViewById(R.id.increment_correct_text_view);
        incrementCorrectScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCorrectScore++;
                correctScoreTextView.setText(String.valueOf(mCorrectScore));
            }
        });

        //TextView that shows how many answers were not correct.
        final TextView incorrectScoreTextView = findViewById(R.id.incorrect_score_text_view);
        //Button to increment the amount of incorrect answers.
        final Button incrementIncorrectScore = findViewById(R.id.increment_incorrect_text_view);
        incrementIncorrectScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIncorrectScore++;
                incorrectScoreTextView.setText(String.valueOf(mIncorrectScore));
            }
        });

        final Context context = this;

        //Button that goes to the next question.
        final Button nextButton = findViewById(R.id.next_button);
        nextButton.setText(R.string.start_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Word word : words) {
                    if (i < words.size()) {
                        word = words.get(i);
                        currentWordTextView.setVisibility(View.VISIBLE);
                        showAnswerButton.setVisibility(View.VISIBLE);
                        currentWordTextView.setText(word.getDefaultTranslationId());
                        currentAnswerTextView.setVisibility(View.INVISIBLE);
                        currentAnswerTextView.setText(word.getGreekTranslationId());
                        nextButton.setText(R.string.next_button);
                        if (hasAnswered == true) {
                            hasAnswered = false;
                            i++;
                        }
                    } else {
                        endOfTheLessonTextView.setVisibility(View.VISIBLE);
                        nextButton.setVisibility(View.INVISIBLE);
                        currentWordTextView.setVisibility(View.INVISIBLE);
                        currentAnswerTextView.setVisibility(View.INVISIBLE);
                        showAnswerButton.setVisibility(View.INVISIBLE);
                        incrementCorrectScore.setVisibility(View.INVISIBLE);
                        incrementIncorrectScore.setVisibility(View.INVISIBLE);
                        //Toast.makeText(context, R.string.einde_overhoring, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
