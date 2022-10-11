import java.util.Random;
public class AI {

    protected int choice;
    Random random = new Random();
    //Property for storing AI choice
    public void generateChoice() {
        this.choice = random.nextInt(3);

    }
    public int getChoice(){
        return this.choice;

    }
}
