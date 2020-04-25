import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// This is a program for playing rock paper scissors lizard spock which is a game from The Big Bang Theory tv series.
public class Main {

    public static void main(String[] args) {

        game();
    }

    static void startOver(){
        game();
    }

    static void game(){
        Scanner scanner = new Scanner(System.in);
        int userS = 0; // for counting user score
        int computerS = 0; // for counting computer score
        boolean checkS = true;
        System.out.print("What is your name : ");
        String name = scanner.nextLine();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> RPSLS <<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Hello " + name + " the game is about to start.");
        System.out.println("----------Remember the rules----------\n" +
                "- Rock crushes lizard and scissors\n" +
                "- Paper covers rock and disproves spock\n" +
                "- Scissors cuts paper and decapitates lizard\n" +
                "- Lizard eats paper and poisons spock\n" +
                "- Spock smashes scissors and vaporizes rock\n");
        System.out.println("Please make a choice between 0 and 6\n" +
                "1 = Rock\n" +
                "2 = Paper\n" +
                "3 = Scissors\n" +
                "4 = Lizard\n" +
                "5 = Spock");

        ArrayList<String> array = new ArrayList<>();
        array.add("rock");array.add("paper");array.add("scissors");array.add("lizard");array.add("spock");

        while (checkS) {
            System.out.println("-----------------------------------------------");
            System.out.print("Choose your item : ");
            int uChoice = scanner.nextInt();
            int cChoice = ThreadLocalRandom.current().nextInt(1,6);

            if(uChoice == cChoice){
                System.out.println("Your item was same as the computer's. So nothing happens :) DEWAMKE");
            }

            else if (uChoice == 1) {

                if ((cChoice == 3) | (cChoice == 4)) {
                    userS++;
                }
                else {
                    computerS++;
                }
                System.out.println("Your item was " + array.get(uChoice - 1) + " and computer's was " + array.get(cChoice - 1));
                System.out.println(name + " = " + userS);
                System.out.println("Computer = " + computerS);
            }

            else if (uChoice == 2) {

                if ((cChoice == 1) | (cChoice == 5)) {
                    userS++;
                }
                else {
                    computerS++;
                }
                System.out.println("Your item was " + array.get(uChoice - 1) + " and computer's was " + array.get(cChoice - 1));
                System.out.println(name + " = " + userS);
                System.out.println("Computer = " + computerS);

            }

            else if (uChoice == 3) {

                if ((cChoice == 2) | (cChoice == 4)) {
                    userS++;
                }
                else {
                    computerS++;
                }
                System.out.println("Your item was " + array.get(uChoice - 1) + " and computer's was " + array.get(cChoice - 1));
                System.out.println(name + " = " + userS);
                System.out.println("Computer = " + computerS);

            }

            else if (uChoice == 4) {

                if ((cChoice == 2) | (cChoice == 5)) {
                    userS++;
                }
                else {
                    computerS++;
                }
                System.out.println("Your item was " + array.get(uChoice - 1) + " and computer's was " + array.get(cChoice - 1));
                System.out.println(name + " = " + userS);
                System.out.println("Computer = " + computerS);

            }

            else if (uChoice == 5) {

                if ((cChoice == 1) | (cChoice == 3)) {
                    userS++;
                }
                else {
                    computerS++;
                }
                System.out.println("Your item was " + array.get(uChoice - 1) + " and computer's was " + array.get(cChoice - 1));
                System.out.println(name + " = " + userS);
                System.out.println("Computer = " + computerS);

            }

            if (userS == 3){
                checkS = false;
                System.out.println("THE WINNER IS " + name);
                System.out.print("If you want to start over press 'r'. If you don't, press 'q' to quit : ");
                scanner.nextLine();
                String finishOrContinue = scanner.nextLine();
                if (finishOrContinue.equals("r")) {
                    startOver();
                }

                else if (finishOrContinue.equals("q")){
                    System.exit(0);
                }

            }

            if (computerS == 3){
                checkS = false;
                System.out.println("THE WINNER IS COMPUTER! HAHAHA YOU LOSER, SHAME ON YOU!");
                System.out.print("If you want to start over, press 'r'. If you don't, press 'q' to quit : ");
                scanner.nextLine();
                String finishOrContinue = scanner.nextLine();
                if (finishOrContinue.equals("r")){
                    startOver();
                }

                else if (finishOrContinue.equals("q")){
                    System.exit(0);
                }
            }

        }
    }
}

