package CS3560_HW1;

import java.util.*;

// Question class is the builing framework of a question in the mentimeter simulation
public class Question {
    private List<String> options;
    private String question;

    public Question(String question, List<String> options) {
        //this.type = type;
        this.options = options;
        this.question = question;
    }

    // options are the answer choices available (to be declared in SimulationDriver)
    public List<String> getOptions() {
        return options;
    }

    // returns the question that is included in the calling the Question class in SimulationDriver
    public String getQuestion() {
        return question;
    }
}
