package com.example.android.taalhuisnieuwgrieks;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

//WordAdapter is an ArrayAdapter that can provide the layout for each list item.
public class WordAdapter extends ArrayAdapter<Word> {

    //Resource ID for the background color for the list of words
    private int mColorResourceId;

    //Create a new WordAdapter object
    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId){
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the Word object located at this position in the list
        Word currentWord = getItem(position);

        //Find the TextView in the list_item.xml layout with the id greek_text_view
        TextView greekTextView = listItemView.findViewById(R.id.greek_text_view);

        //Get the Greek translation from the currentWord object and set this to the TextView
        greekTextView.setText(currentWord.getGreekTranslationId());

        //Find the TextView in the list_item.xml layout with the id default_text_view
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);

        //Get the default translation from the currentWord object and set this to the TextView
        defaultTextView.setText(currentWord.getDefaultTranslationId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }

}
