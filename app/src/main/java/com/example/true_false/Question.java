package com.example.true_false;

import java.io.Serializable;

public class Question implements Serializable {

    private int id;
    private String question;
    private String opt_A;
    private String opt_B;
    private String answer;

    public Question() {

    }
    //constructer for setting values


    public Question(int id, String question, String opt_A, String opt_B, String answer) {
        this.id = id;
        this.question = question;
        this.opt_A = opt_A;
        this.opt_B = opt_B;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOpt_A() {
        return opt_A;
    }

    public void setOpt_A(String opt_A) {
        this.opt_A = opt_A;
    }

    public String getOpt_B() {
        return opt_B;
    }

    public void setOpt_B(String opt_B) {
        this.opt_B = opt_B;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;

    }
}
