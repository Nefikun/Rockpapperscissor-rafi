import java.util.Scanner;

//@TODO: ctrl/cmd+alt+L
    public class Rockpapperscissor{

        //@FIXME: methods should be named with lowercase at beginning
        public void Geym(){
            int i = 0;
            Player player = new Player(); //New instance for player
            AI AI = new AI(); //New instance for AI
            //Loop for game

            while (i < 1) {

                Scanner scan = new Scanner(System.in);
                //Nested loop to check for invalid input
                boolean Pickedchoice = false;
                boolean PlayAgain = false;
                while (!Pickedchoice) {
                    System.out.println("Rock, Paper or Scissor?");
                    player.setChoice(scan.nextLine()); //Check input from user to store
                    AI.generateChoice(); // Generates AI choice

                    if (AI.getChoice() == 0) {
                        System.out.println("AI picks Rock");
                    } else if (AI.getChoice() == 1) {
                        System.out.println("AI picks Paper");
                    } else if (AI.getChoice() == 2) {
                        System.out.println("AI picks Scissor");
                    //Writes out choices for AI
                    }

                    //@TODO: check IntelliJ's suggestion for the if condition and make adjustments
                    if (player.getChoice().equals("rock") || player.getChoice().equals("r") || player.getChoice().equals("Rock")) {

                        if (AI.getChoice() == 0) {
                            System.out.println("It's a tie!");
                        } else if (AI.getChoice() == 1) {
                            System.out.println("You lose!");
                        } else if (AI.getChoice() == 2) {
                            System.out.println("You win!");

                        }
                    //Display result from player choices
                         Pickedchoice = true; //Exit nested loop
                    }
                    else if (player.getChoice().equals("Paper") || player.getChoice().equals("p") || player.getChoice().equals("paper")) {

                        if (AI.getChoice() == 0) {
                            System.out.println("You lose!");
                        } else if (AI.getChoice() == 1) {
                            System.out.println("It's a tie");
                        } else if (AI.getChoice() == 2) {
                            System.out.println("You win!");
                        }

                        Pickedchoice = true;
                    }
                    else if (player.getChoice().equals("Scissors") || player.getChoice().equals("s") || player.getChoice().equals("scissors")) {

                        if (AI.getChoice() == 0) {
                            System.out.println("You win!");
                        } else if (AI.getChoice() == 1) {
                            System.out.println("You lose!");
                        } else if (AI.getChoice() == 2) {
                            System.out.println("It's a tie");
                        }
                        Pickedchoice = true;
                    }
                    else {
                        System.out.println("Invalid choice try again");
                    }
                }

                //@FIXME: check IntelliJ's suggestion for the while condition and make adjustments
                //Nested loop for input validation
                while (PlayAgain == false) {
                    System.out.println("Try again? y/n");
                    String cont = scan.nextLine();
                    // Asks player to play again, checks for input
                    if (cont.equals("yes") || cont.equals("y") || cont.equals("Yes")) {
                        System.out.println("Lets go!");
                        PlayAgain = true;
                    } else if (cont.equals("no") || cont.equals("n") || cont.equals("No")) {
                        i = i + 1;
                        PlayAgain = true;
                    } else {
                        System.out.println("Invalid choice try again");
                    }

                }
            }


        }

    }
