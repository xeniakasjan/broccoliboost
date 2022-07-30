import java.util.Scanner;

public class creatingMethods {

    public static int[] getArrayDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int numOfNums = scanner.nextInt(); //

        int[] numbers = new int[numOfNums]; // Use the number to create an array

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a numbers here: ");
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

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
    }

    //3rd task: write a method to return 3rd smallest number from a set of 5 number entered by the user.

    //get 5 numbers from user
    //find the smallest number
    //return it
    public static int smallestNumber() {
        Scanner scanner = new Scanner(System.in); //getting input from user

        int[] array = new int[5];
        System.out.println("Add 5 numbers: ");
        for (int a = 0; a < 5; a++) {
            array[a] = scanner.nextInt();

            int temp;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array[2];
    }
    // 4th task: Write a method to find the area of a circle with the radius received from a user

    public static float areaOfCircle() {
        Scanner scanner = new Scanner(System.in);
        //float pi = 3.14f;
        double area;

        System.out.println("Write a radius: ");
        float radius = scanner.nextFloat();
        area = Math.PI*(radius*radius);
        //Area of the circle:  A = π * r2
        //return (pi*(radius*radius));
        return (float) area;
    }
}