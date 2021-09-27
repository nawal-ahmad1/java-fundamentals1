import java.util.Random;
import java.time.LocalDateTime;
import java.util.Locale;


public class Main{
    public static void main(String[] args){
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(3);

        clock();

    }
    public static String pluralize(String word, int number){
        if (number == 0 || number > 1){
            return word + "s";
        } else {
            return word;
        }
    }
    public static void flipNHeads(int n){
        int tailsCounter = 0;
        int headsCounter = 0;

        while (headsCounter < n){
            Random random = new Random();
            if (random.nextDouble() < 0.5){
                tailsCounter++;
                headsCounter = 0;
                System.out.println("tails");
            } else{
                tailsCounter++;
                headsCounter++;
                System.out.println("heads");
            }
        }
        System.out.println("It took " + tailsCounter + " flips to flip " + n + " heads in a row.");
    }
    public static void clock(){
        int second2 = LocalDateTime.now().getSecond();
        while(true){
            int hour = LocalDateTime.now().getHour();
            int minute = LocalDateTime.now().getMinute();
            int second = LocalDateTime.now().getSecond();
            if (second - second2 == 1){
                System.out.println(hour + ":" + minute + ":" + second);
                second2++;
            }
        }
    }
}