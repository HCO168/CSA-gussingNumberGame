package main;
import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static int randomInt(int range,int offset){
        return (int) (Math.random()*range)+offset;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        // Choose a random number from 0-100
        int r=randomInt(101,0);
        // Ask the user to guess a number from 0 to 100
        System.out.println("Enter you guess between 0 to 100 inclusive:");
        // Get the first guess using scan.nextInt();
        int guess=scan.nextInt();
        int count=1;

        // Loop while the guess does not equal the random number,

        while(guess!=r){
            // If the guess is less than the random number, print out "Too low!"
            if(guess<r){
                System.out.println("Too low!");
            }
            // If the guess is greater than the random number, print out "Too high!"
            else {
                System.out.println("Too high!");
            }
            // Get a new guess (save it into the same variable)
            guess=scan.nextInt();
            count++;
        }
        // Print out something like "You got it!"
        if(count<=7){
            System.out.println("You got an impossibly good score! You only used "+count+" guesses!");
        }else if(count<=10){
            System.out.println("you did a good job! You used "+count+" guesses!");
        }else{
            System.out.println("Try the divide and conquer strategy next time! You used "+count+" guesses!");
        }
        System.out.println("You take "+count+" time(s) to do it!");


    }
}
