package com.example.android.taalhuisnieuwgrieks;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class TestActivityLessonSixNLGR extends AppCompatActivity {
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
