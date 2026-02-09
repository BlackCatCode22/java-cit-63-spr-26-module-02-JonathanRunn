import java.util.Scanner;

public class MaddnessWithMethods {
    public static void main(String[] args) {
        int num1 = getAnIntFromTheUser();
        int num2 = getAnIntFromTheUser();

        compareTwoInts(num1, num2);

        int sum = sumTwoInts(num1, num2);
        System.out.println("The sum is: " + sum);
    }

    public static int getAnIntFromTheUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return input.nextInt();
    }

    public static void compareTwoInts(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater.");
        } else if (b > a) {
            System.out.println(b + " is greater.");
        } else {
            System.out.println("They are equal.");
        }
    }

    public static int sumTwoInts(int a, int b) {
        return a + b;
    }
}