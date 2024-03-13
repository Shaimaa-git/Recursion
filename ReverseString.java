import java.util.Scanner;

public class ReversString {
        public static void main(String[] args) {
            //Use Scanner to take input from the user
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the String: ");
            String string = input.nextLine();
            //Check if the input is empty or not
            if (string.isEmpty()) {
                System.out.println("Empty input");
                return;
            }
            // if the string not empty then print revers from recursion function
            else {
               String reversResult=reversString(string);
                System.out.println("The revers of String is:"+reversResult);
            }
        }

        //recursion function
        public static String reversString(String str) {
            if (str.isEmpty()){
                return str;
            }
            return reversString(str.substring(1))+str.charAt(0);
        }

    }







