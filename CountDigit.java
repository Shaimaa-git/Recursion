import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        //Use Scanner to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        //Check if the number is negative and print a message
        if (number < 0) {
            System.out.println("Valid input. Enter positive Number Only");
        }
        //if the number positive then it will calculate number of digit from recursion function
        else {
            int digitCount = calculateNumberOfDigit(number);
            System.out.println("The number of digit is:" + digitCount);
        }
    }

    //recursion function
    public static Integer calculateNumberOfDigit(Integer num) {
        if (num==0) {
            return 0;
        }
        return 1+calculateNumberOfDigit(num/10);

    }

}




