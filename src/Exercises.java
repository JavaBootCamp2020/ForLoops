import java.util.Scanner;
//import java.util.*;
//import java.io.*;

public class Exercises {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter an odd number: ");
        int oddNum = sc.nextInt();

        for (int i = 1; i <= oddNum; i++){
            if(i % 2 != 0){
                System.out.print(i + ", ");
            }
        }

        System.out.println("\nEnter an even number: ");
        int evenNum = sc.nextInt();

        for (int i = 0; i <= evenNum; i++){
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }


        sc.nextLine();



        System.out.println("\nEnter a String Data Type: ");
        String backwards = sc.nextLine();
        String inReverse = new StringBuffer(backwards).reverse().toString();
        System.out.println("String in reverse is: " + inReverse );

        //sc.nextInt();
        System.out.println("Enter a number to know the factors of that number: ");
        int num = sc.nextInt();

        int i;

        for( i = 1; i < num; i++){
            if(num % i ==0) {
                System.out.print(i + ", ");
            }

        }


        System.out.println("\nEnter any positive number to find out the factorial of that number: ");
        num = sc.nextInt();
        int num2 = num;

        for(i = (num - 1); i> 1; i--){

            num2 = num2 * i;

        }
        System.out.println("The factorial of " + num + " is " + num2);







    }
}
