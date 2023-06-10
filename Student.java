package CS3560_HW1;

import java.util.List;

// Student class identifies unique users and their answers
public class Student {
    public String id;
    public List<String> answers;
    public String answer;

    // constructor method initilizes the parameters of the student class
    public Student(String id){
        this.id = id;
    }
    
    // the getter method that returns the student user id 
    public String getID(){
        return id;
    }

    // this setAnswers method allows for a list of answer choices for multiple choice options
    public void setAnswers(List<String> answers){
        this.answers = answers;
    }

    public List<String> getAnswers(){
        return answers;
    }

    // this setAnswers allows for only one answer choice to be picked by the students (single-choice option)
    public void setAnswer(String answer){
        this.answer = answer;
    }

    public String getAnswer(){
        return answer;
    }
}