import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the movie ticket price");
        int price = input.nextInt();
        System.out.print("Enter the movie rating");
        int rating = input.nextInt();

        if(price >= 12 && rating == 5){
            System.out.println("I'm Interested in Watching the Movie");
        }else{
            System.out.println("I am not interested in watching the movie");
        }
    }

}
