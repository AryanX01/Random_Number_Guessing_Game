import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Scanner Class for Taking input

        //Number Picked
        System.out.println("I have Picked a number between 1 and 100, Now guess.. ");
        int num = (int)((Math.random()*100)+1);

        //Guessing the number
        System.out.println("Guess: ");
        int guess_num = 0;
        
        //Commencing Loop
        while(guess_num!=num){
            guess_num=sc.nextInt();    //Taking input

            //Conditions

            if(guess_num==num){
                System.out.println("YES YES YES, Correct. Yoo Guessed Right");
            }
            else{
                System.out.println("Sorry , Wrong Guess. Try Again.. ");
                if(guess_num>num){
                    System.out.println("Go Lower");
                }else{
                    System.out.println("Think Higher");
                }
            }
        }

    }
}