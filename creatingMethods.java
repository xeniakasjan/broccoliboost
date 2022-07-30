import java.util.Scanner;

public class creatingMethods {

    /* 1st task: Write a method that takes the length and width of a rectangle from a user and finds the returns the perimeter */
    public static int perimeterCalculation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide length: ");
        int length = scanner.nextInt();
        System.out.print("Provide width: ");
        int width = scanner.nextInt();

        int perimeter = 2 * (length + width);
        //System.out.println("Perimeter of rectangle is: " + perimeter);
        return perimeter;
    }

    /* 2nd task: Write a program that takes a word and returns its reverse*/
    //Ask to write a word
    //Reverse it
    //Return it

    public static String reverseWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write down your word: ");
        String word = scanner.next();
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        return reverse;

//        ANOTHER METHOD (EASY ONE):
//        public static String printWordReverse() {
//            System.out.print("Enter your word: ");
//            String word = scanner.nextLine();
//
//            //returns user word in reverse
//
//            String reverseWord = new StringBuilder(word).reverse().toString();
//            return reverseWord;


    }
}
