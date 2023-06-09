package CS3560_HW1;

import java.util.Random;

public class Student implements iVote{
    Random rand = new Random();
    public int id;

    public void setID(){
        this.id = rand.nextInt();
    }
    public int getID(){
        return id;
    }
}