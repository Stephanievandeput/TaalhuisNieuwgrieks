package com.example.android.taalhuisnieuwgrieks;

//Word represents a vocabulary word that the user wants to learn.
//It contains resource IDs for the default translation (in Dutch)
//and the Greek translation.
public class Word {

    //String resource ID for the default translation of the word
    private int mDefaultTranslationId;

    //String resource ID for the Greek translation of the work
    private int mGreekTranslationId;

    //Create a new Word object
    public Word(int greekTranslationId, int defaultTranslationId){
        mDefaultTranslationId = defaultTranslationId;
        mGreekTranslationId = greekTranslationId;
    }

    //Get the string resource ID for the default translation of the word
    public int getDefaultTranslationId(){
        return mDefaultTranslationId;
    }

    //Get the string resource ID for the Greek translation of the word
    public int getGreekTranslationId(){
        return mGreekTranslationId;
    }

}
