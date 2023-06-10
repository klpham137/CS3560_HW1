package CS3560_HW1;

import java.util.*;


// VotingService class implements the iVote interface
class VotingService implements iVote {
    Map <String, Integer> numAnswers;
    private Question question;

    public VotingService(Question question) {
        this.numAnswers = new HashMap<>();
        this.question = question;
        defaultAnswers();
    }

    private void defaultAnswers() {
        for (String answer : question.getOptions()) {
            numAnswers.put(answer, 0);
        }
    }

    public void vote(Student student, String answer) {
        numAnswers.put(answer, numAnswers.get(answer)+1);
        student.setAnswer(answer);
    }

    public void vote(Student student, List<String> answers) {
        for (String answer : answers) {
            numAnswers.put(answer, numAnswers.get(answer) + 1);
        }
        student.setAnswers(answers);
    }

    public void displayResult() {
        System.out.println(question.getQuestion());
        for (Map.Entry<String, Integer> entry : numAnswers.entrySet()) {
            String answer = entry.getKey();
            int count = entry.getValue();
            System.out.println(answer + ": " + count);
        }
        System.out.println();
    }
}
