package com.londonappbrewery.quizzler;

public class TrueFalse {

    private int mQustionsId;
    private  boolean mAnswer;

    public TrueFalse (int questionResourceID , Boolean TrueOrFalse){

        mQustionsId = questionResourceID;
        mAnswer = TrueOrFalse;
    }

    public int getQustionsId() {
        return mQustionsId;
    }

    public void setQustionsId(int qustionsId) {
        mQustionsId = qustionsId;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
