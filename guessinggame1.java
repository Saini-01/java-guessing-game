import java.util.Random;
import java.util.Scanner;
public class guessinggame1 {
    public static void main(String args[]){
        Random rand = new Random();
        int n = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int x;

        while(true){
            System.out.println("Guess a number: ");
            x = input.nextInt();
            if(x>n) {
                System.out.println("Your number is too big.");
            }
            else if(n>x) {
                System.out.println("Your number is too small.");
            }
            else{
                System.out.println("You are correct!");
                break;
            }
        }
    }
}

