package CS3560_HW1;

import java.util.List;

public interface iVote {

    /*
     * This method signature is for the voting option for single-choice questions. Students may only select
     * one answer choice and only on choice is correct, hence the String answer parameter.
     */
    void vote(Student student, String answer);

    /*
     * This method signature is for the voting option for multiple-choice questions. Since students can select multiple options,
     * the selection will be loaded into an array list before they are counted towards the result. That is 
     * why the parameter includes a list of string answers.
     */ 
    void vote (Student student, List<String> answers);

    // this method taks in no parameters and displays the results of the student answers
    void displayResult();

    }
}
