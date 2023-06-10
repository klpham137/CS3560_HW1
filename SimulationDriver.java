package CS3560_HW1;

import java.util.*;

public class SimulationDriver {
    public static void main (String args[]) { 
        int numStudents = 20;
        System.out.println("These are the results of the poll (correct answers are denoted with a '*')");
        
        // the first question is a single-choice question
        List<String> options1 = new ArrayList<>();
        options1.add(" 35");
        options1.add("*25");
        options1.add(" 10");
        options1.add(" 20");
        Question q1 = new Question("What is 5 squared?", options1);

        iVote vote1 = new VotingService(q1);

        // simulates the mentimeter program for 20 students
        for(int i=0; i<numStudents; i++){
            Student stu = new Student("Stu " + i);
            Random rand = new Random();
            String studentAnswer = options1.get(rand.nextInt(options1.size()));
            vote1.vote(stu, studentAnswer);
        };
        vote1.displayResult();

        // question 2 is a multiple-choice question so it utilizes a for loop and array list to get multiple answers
        List<String> options2 = new ArrayList<>();
        options2.add(" helium");
        options2.add(" nitrogen");
        options2.add("*oxygen");
        options2.add("*hydrogen");
        Question q2 = new Question("Which of the following elements make up water?", options2);

        iVote vote2 = new VotingService(q2);

        for(int i=0; i<numStudents; i++){
            Student stu = new Student("Stu " + i);
            List<String> studentAnswers = new ArrayList<>();
            Random rand = new Random();
            int numOptions = rand.nextInt(options2.size()) + 1;
            for (int j = 0; j < numOptions; j++) {
                String answer = options2.get(rand.nextInt(options2.size()));
                studentAnswers.add(answer);
            }
            vote2.vote(stu, studentAnswers);
        }
        vote2.displayResult();

        List<String> options3 = new ArrayList<>();
        options3.add("*5");
        options3.add(" 3");
        options3.add(" 3.5");
        options3.add(" 4");
        Question q3 = new Question("What is 3+4/2?", options3);

        iVote vote3 = new VotingService(q3);

        for(int i=0; i<numStudents; i++){
        Student stu = new Student("Stu " + i);
        Random rand = new Random();
        String studentAnswer = options3.get(rand.nextInt(options3.size()));
        vote3.vote(stu, studentAnswer);
        };
        vote3.displayResult();
    }

}