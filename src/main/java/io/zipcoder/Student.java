package io.zipcoder;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static com.sun.xml.internal.ws.util.VersionUtil.compare;

public class Student {
    public String firstName;
    public String lastName;
    public ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScore){
        this.firstName = firstName;
        this.lastName = lastName;
        examScores = new ArrayList<>();
        Double testScores = null;
        examScores.addAll(Arrays.asList(testScores));
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName(){

        return lastName;
    }

    public void setLastName(String lastName){

        this.lastName = lastName;
    }

    public String getExamScores(){
        String scoreResult = "Exam Scores";
        for (Double score : examScores){
            scoreResult += "Exam" + (examScores.indexOf(score) +1) + "->" + score.intValue();

        }
        return scoreResult;
    }

    public void addExamScore(Double score){

        examScores.add(score);
    }

    public void setExamScores(int examNumber, double newScore){

        examScores.set(examNumber - 1, newScore);
    }

    public Integer getAverageExamScore(){
        Double sum = 0.0;
        for (Double score : examScores){
            sum+= score;
        }
        return(int)(sum/ examScores.size());
    }

    public void setExamScores(ArrayList<Double> examScores){

        this.examScores = examScores;
    }

    public Integer getNumberOfExamsTaken(){
        return examScores.size();
    }

    static class studentSorter implements Comparator<Student> {


        @Override
        public int compare(Student o1, Student o2) {
            int scoreCompare = o2.getAverageExamScore().compareTo(o1.getAverageExamScore());
            int lastNameCompare = o1.getLastName().compareTo(o2.getFirstName());
            int firstNameCompare = o1.getFirstName().compareTo(o2.getFirstName());

            if (scoreCompare == 0){
                return ((lastNameCompare == 0) ? firstNameCompare : lastNameCompare);
            } else
            return scoreCompare;
        }
    }



}
