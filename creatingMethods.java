import java.util.Scanner;

public class creatingMethods {

    public static double getArrayDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int numOfNums = scanner.nextInt();

        int[] numbers = new int[numOfNums]; // Use the number to create an array

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a numbers here: ");
            numbers[i] = scanner.nextInt();
        }

        return numbers;


        /* 1st task: Write a method that takes the length and width of a rectangle from a user and finds the returns the perimeter */
        public static int perimeterCalculation () {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Provide length: ");
            int length = scanner.nextInt();
            System.out.print("Provide width: ");
            int width = scanner.nextInt();

            int perimeter = 2 * (length + width);
            //System.out.println("Perimeter of rectangle is: " + perimeter);
            return perimeter;
        }
//
//    /* 2nd task: Write a program that takes a word and returns its reverse*/
//    //Ask to write a word
//    //Reverse it
//    //Return it
//
        public static String reverseWord () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Write down your word: ");
            String word = scanner.next();
            String reverse = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reverse = reverse + word.charAt(i);
            }
            return reverse;
        }

//    //3rd task: write a method to return 3rd smallest number from a set of 5 number entered by the user.
//
//    //get 5 numbers from user
//    //find the smallest number
//    //return it
        public static int smallestNumber () {
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
//
//    // 4th task: Write a method to find the area of a circle with the radius received from a user
        public static double areaOfCircle () {
            Scanner scanner = new Scanner(System.in);
            //float pi = 3.14f;
            double area;

            System.out.println("Write a radius: ");
            float radius = scanner.nextFloat();
            area = Math.PI * (radius * radius);
            //Area of the circle:  A = π * r2
            //return (pi*(radius*radius));
            return area;
        }
//
//    /* 5th task: Write a method that takes a set of 3 numbers from the user and returns true if the addition of all three numbers is less than 100, else it returns false.*/
        public static boolean threeNumbsReturn () {
            Scanner scanner = new Scanner(System.in);

            int[] userInput = new int[3];
            System.out.println("Add 3 numbers: ");
            for (int a = 0; a < 3; a++) {
                userInput[a] = scanner.nextInt();

                int sum = userInput[a];
                sum = sum + userInput[a];

                for (a = 0; a < userInput.length; a++) ;
                if (sum < 100) {
                    return true;
                }
                return false;
            }

    /* 6th task: Write a method to find the square and square root of a sum of 4 numbers entered
    by the user and return the different between the square and square root */

            public static double squareRoot () {
                Scanner scanner = new Scanner(System.in);

                int[] userInput = new int[4];
                System.out.println("Add 4 numbers: ");
                for (int a = 0; a < 4; a++) {
                    userInput[a] = scanner.nextInt();
                }
                //find sum of those four numbers
                int sum = 0;
                for (int a : userInput) {
                    sum += a;
                }
                System.out.println("Sum of 4 numbers: " + sum);
                //find square
                double square = Math.pow(sum, 2);
                {
                    System.out.println("Square of 4 numbers: " + square);
                }
                //find square root
                squareRoot = Math.pow(sum, 0.5);
                {
                    System.out.println("Square root of 4 numbers: " + squareRoot);
                }

                double differenceBetween = (square - squareRoot);
                return differenceBetween;
            }
        }

    /* 7th task: Write a method that takes a string from the user
    and returns true when it is checked that the string entered by the user reads the same forwards and backwards (PALINDROME). */

        public static boolean wordForwardsandBackwards () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write a word here: ");
            String word = scanner.next();

            StringBuffer buffer = new StringBuffer(word);
            buffer.reverse();
            String data = buffer.toString();
            if (word.equals(data)) return true;
            return false;
        }
    /*8th Task: Write a method that accepts a year from the user and returns a result informing the user if the year is leap or not.
    (Divisible by 4, or 400 but not necessarily just 100)*/

        public static int leapYear () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("write down a year: ");
            int year = scanner.nextInt();

            if (year % 400 == 0) {
                System.out.println("this is a leap year");
            } else if (year % 100 == 0) {
                System.out.println("this not a leap year.");
            } else if (year % 4 == 0) {
                System.out.println("this is a leap year");
            } else {
                System.out.println("this is not a leap year");
            }
            return year;
        }
    }
}



