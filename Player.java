public class Player {

    protected String choice;
    //Property for storing player

    //Saves player choice from rockpapperscissor
    public void setChoice(String choice) {
        this.choice = choice;


    }
    //Gets the choice that's stored and returns it to where it's called
    public String getChoice(){
        return this.choice;

    }
}
