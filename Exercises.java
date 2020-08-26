import java.util.Scanner;
//Author: Gil Silva
// Java BootCamp exercise
//Create a program that displays: odd numbers, even numbers, print a string in reverse,
//displays factors of a number, computes the factorial of a number.

public class Exercises {
    public static void main(String[] args){
        //Creates a scanner to receive user's input
        Scanner sc = new Scanner(System.in);

        //Displays odd numbers
        System.out.println("Enter an odd number: ");
        int oddNum = sc.nextInt();

        for (int i = 1; i <= oddNum; i++){
            if(i % 2 != 0){
                System.out.print(i + ", ");
            }
        }
        //Displays even number
        System.out.println("\nEnter an even number: ");
        int evenNum = sc.nextInt();

        for (int i = 0; i <= evenNum; i++){
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }

        //Scanner buffer clearing
        sc.nextLine();

        //Reverse string data type
        System.out.println("\nEnter a String Data Type: ");
        String backwards = sc.nextLine();
        String inReverse = new StringBuffer(backwards).reverse().toString();
        System.out.println("String in reverse is: " + inReverse );

        //Display the factors of a number
        System.out.println("Enter a number to know the factors of that number: ");
        int num = sc.nextInt();
        //Makes variable "i" global
        int i;

        for( i = 1; i < num; i++){
            if(num % i ==0) {
                System.out.print(i + ", ");
            }

        }

        //Calculate the factorial of a number
        System.out.println("\nEnter any positive number to find out the factorial of that number: ");
        num = sc.nextInt();

        //int used to calculate the factorial. int initialized.
        int num2 = num;

        for(i = (num - 1); i> 1; i--){

            num2 = num2 * i;

        }
        System.out.println("The factorial of " + num + " is " + num2);

    }
}
