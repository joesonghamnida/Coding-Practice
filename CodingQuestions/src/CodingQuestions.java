import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;
import java.util.Scanner;

public class CodingQuestions {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //string palindrome
        StringBuffer palindrome = new StringBuffer("anna");
        if (palindrome.equals(palindrome.reverse())) {
            System.out.printf("\n%s is a palindrome", palindrome.toString());
        }

        //method that will remove any character from a string
        removeChar();
    }

    public static void removeChar() {
        System.out.println("Please enter a word");
        String word = scanner.nextLine();
        System.out.println("Please enter a character you wish to remove");
        String letter = scanner.nextLine();
        ArrayList letters = new ArrayList();

    }
}



