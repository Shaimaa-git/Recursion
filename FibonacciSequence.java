import java.util.*;

public class CountDigit {
    public static void main(String[] args) {
        //Use Scanner to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = input.nextInt();
        input.close();
        //Check if the number is negative and print a message
        if (number < 0) {
            System.out.println("Valid input. Enter positive Number Only");
        }
        //if the number positive then it will print the fibonacci sequence from recursion function
        else {
            System.out.println("The fibonacci sequence of number "+number+" is: ");
            for (int i=0; i<=number; i++){
                System.out.print(fibonacciSequence(i)+" ");
            }
        }
    }
    //recursion function
    public static Integer fibonacciSequence(Integer num) {
        if (num==0) {
            return 0;
        }
        if(num==1 || num==2){
            return 1;
        }
           return fibonacciSequence(num-1)+fibonacciSequence(num-2);

        }
    }






