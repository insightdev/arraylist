/*
 * IBExam class for the ArrayList project
 * Copyright (c) 2016 Alex Balgavy <a.balgavy@gmail.com>
 * 
 * Stores data about a single exam the student took (one instance represents
 * one exam). Contains accessors and mutators for the exam subject and score.
 */
package arraylisttest;

/**
 *
 * @author alex
 */
public class IBExam {
    private String mySubject;
    private int myScore;
    
    // CONSTRUCTORS
    public IBExam() {
        this.mySubject = "";
        this.myScore = 1;
    }
    public IBExam(String mySubject, int myScore) {
        this.mySubject = mySubject;
        this.myScore = myScore;
    }
    
    // ACCESSORS
    public String getSubject() {
        return mySubject;
    }
    public int getScore() {
        return myScore;
    }
    
    // MUTATORS
    public void setSubject(String subject) {
        this.mySubject = subject;
    }
    public void setScore(int score) {
        this.myScore = score;
    }
    
    
    // OTHER METHODS
    public boolean equals(IBExam exam) {
        if (exam == null) {
            return false;
        }
        if (exam.mySubject == this.mySubject) {
            if (exam.myScore == this.myScore) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    
    public String toString(IBExam exam) {
        return exam.mySubject + String.valueOf(exam.myScore);
    }
    
    public int compareTo(IBExam exam) {
        if (exam.myScore == this.myScore) {
            return 0;
        }
        else if (exam.myScore > this.myScore) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
