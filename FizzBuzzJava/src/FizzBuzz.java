import java.util.Scanner;

/**
 * Created by joe on 10/20/16.
 */
public class FizzBuzz {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Fixed fizzbuzz");

        doIt(0, 100);

        System.out.println("Please enter a starting point for the program:");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter an ending point for the program:");
        int end = Integer.parseInt(scanner.nextLine());

        doIt(start, end);
    }


    public static void doIt(int start, int end){
        while(start <= end){
            if((start % 3 == 0) && (start % 5 ==0)){
                System.out.println("FizzBuzz");
            }
            else if(start % 5 ==0){
                System.out.println("Fizz");
            }
            else if(start % 3 ==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(start);
            }
            start ++;
        }
    }
}

