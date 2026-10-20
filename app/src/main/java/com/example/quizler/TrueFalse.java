package com.example.quizler;

public class TrueFalse {
    private int mQuestionID;    // rappresenta l'id della domanda
    private boolean mAnswer;    // rappresenta la risposta della domanda

    public TrueFalse(int q, boolean a){
        mQuestionID = q;
        mAnswer = a;
    }

    public int getmQuestionID() {
        return mQuestionID;
    }

    public void setmQuestionID(int mQuestionID) {
        this.mQuestionID = mQuestionID;
    }

    public boolean ismAnswer() {
        return mAnswer;
    }

    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}