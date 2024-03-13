import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        //Use Scanner to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        //Check if the number is negative and print a message
        if (number < 0) {
            System.out.println("Valid input. Enter positive Number Only");
            return;
        }
        //if the number positive then it will calculate the sum of N numbers from recursion function
        else {
            int sum = calculateSumOfNNumber(number);
            System.out.println("The sum of N number is:" + sum);
        }
    }

    //recursion function
    public static Integer calculateSumOfNNumber(Integer num) {
        if (num==0) {
            return 0;
        }
        return num+calculateSumOfNNumber(num-1);
        
    }

}




