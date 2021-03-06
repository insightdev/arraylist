/*
 * IBStudent class for the ArrayList project
 * Copyright (c) 2016 Alex Balgavy <a.balgavy@gmail.com>
 * 
 * Stores data about the student. Contains accessors and mutators for
 * the student's first name and last name, and an array of IBExam
 * instances for the student (the exams they took). Also contains methods
 * for computing the highest score, the sum of all of the scores, and the 
 * number of fives the student received.
 */
package arraylisttest;
import java.util.*;
/**
 *
 * @author alex
 */
public class IBStudent {
    private String myFirstName;
    private String myLastName;
    private ArrayList<IBExam> myExams;
    
    // CONSTRUCTORS
    public IBStudent() {
        this.myFirstName = "";
        this.myLastName = "";
        myExams = new ArrayList<>();
    }
    public IBStudent(String myFirstName, String myLastName) {
        this.myFirstName = myFirstName;
        this.myLastName = myLastName;
        myExams = new ArrayList<>();
    }
    
    // ACCESSORS
    public String getFirstName() {
        return this.myFirstName;
    }
    public String getLastName() {
        return this.myLastName;
    }
    public ArrayList getExams() {
        return this.myExams;
    }
    
    // MUTATORS
    public void setFirstName(String myFirstName) {
        this.myFirstName = myFirstName;
    }
    public void setLastName(String myLastName) {
        this.myLastName = myLastName;
    }
    
    // ADDITIONAL METHODS
    
    // Add a new exam to student
    public void addExam(IBExam exam) {
        myExams.add(exam);
    }
    
    // Get the sum of all exam scores
    public int computeExamSum() {
        int sum = 0;
        for (IBExam exam : this.myExams) {
            sum += exam.getScore();
        }
        return sum;
    }
    
    // Find the highest score
    public int findHighestExamScore() {
        ArrayList<Integer> scores = new ArrayList<>();
        for (IBExam exam : this.myExams) {
            scores.add(exam.getScore());
        }
        int maximum = scores.get(0);
        for (int score : scores) {
            if (score > maximum) maximum = score;
        }
        return maximum;
    }
    
    // How many fives did the student get?
    public int numberOfFives() {
        
        // Array list to keep track of all scores
        ArrayList<Integer> scores = new ArrayList<>();
        
        // For every exam, add the score to scores list
        for (IBExam exam : this.myExams) {
            scores.add(exam.getScore());
        }
        
        // Loop through each element and if it's a five, add 1 to the total count
        int fives = 0;
        for (int score : scores) {
            if (score == 5) fives++;
        }
        
        // Return the total number of fives
        return fives;
    }
    
}
