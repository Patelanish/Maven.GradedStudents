package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Classroom {
    Student[] students;


    public Classroom(Student[] Students){
        this.students = Students;
    }

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];

    }

    public Classroom(){
        this.students = new Student[80];
    }

    public Student[] getStudents(){
        return students;
    }

    public Double getAverageExamScores(){
        Double sum = 0.0;
        Integer totalExamScore = 0;

        for (Student student : students){
            for(Double examScore: student.examScores){
                sum += examScore;
                totalExamScore++;
            }
        }
        return sum/totalExamScore;
    }

    public void addStudent(Student student){
        ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(students));
        studentsList.add(student);
        students =studentsList.toArray(students);
    }

    public void removeStudent(String firstName, String lastName){
        ArrayList<Student> arr = new ArrayList<>();
     for(int i = 0; i < students.length; i++){
         arr.add(students[i]);
     }
     for (int i= 0; i < students.length; i++){
         if((students[i].firstName == firstName) && (students[i].lastName == lastName))
             arr.remove(students[i]);
     }
     arr.toArray();
    }

    public void getStudentsByScore(){
        ArrayList<Student> arr = new ArrayList<>();
        for(int i = 0; i < students.length; i++)
            arr.add(students[i]);
        Collections.sort(arr, Collections.reverseOrder());
        arr.toArray();
    }
}

// I was getting help but person had to leave so I might have to get another tutor for it.
//Will for sure get it done though.
