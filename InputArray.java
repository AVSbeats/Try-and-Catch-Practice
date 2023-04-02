import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        System.out.println(); // Space

        int[] numberList = { 0, 0, 0, 0, 0, 0 };

        int i;

        Scanner input = new Scanner(System.in);

        for (i = 0; i < numberList.length; i++) {

            try {
                System.out.print("Enter a number: ");
                numberList[i] = input.nextInt();

            } catch (Exception e) {
                System.out.println("Exception occured! Please enter an integer!");
            }

            input.nextLine(); // This will make the program continue to run
        }

        System.out.println("The numbers are: ");
        for (i = 0; i < numberList.length; i++) {
            System.out.print(numberList[i] + " ");
        }

        System.out.println();
        System.out.println();
    }
}