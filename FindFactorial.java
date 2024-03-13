import java.util.Scanner;
public class FindFactorial {
    public static void main(String[] args) {
        //Use Scanner to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        //Check if the number is negative and print a message 
        if(number<0){
            System.out.println("Valid input. Enter positive Number Only");
        }
        //if the number positive then it will calculate the factorial from recursion function 
        else {
            int  rec= calculateFactorial(number);
            System.out.println("The factorial of number " + number + " is:" + rec);
        }
    }
    //recursion function
    public static  Integer calculateFactorial(Integer num){
        if(num>1){
            return num*calculateFactorial(num-1);
        }
        else {
            return 1;
        }
    }
}
