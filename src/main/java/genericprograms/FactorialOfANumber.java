package genericprograms;

import java.util.Scanner;

public class FactorialOfANumber {



    /*
    * This function is to find the factorial of an input number.
     */
     public static int findFactorial(int number){
         if(number == 0)
             return 1;
         else
             return number*findFactorial(number-1);
     }

    public static void main (String args[]){
        int inputNumber ;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        //check whether the input is an integer
        if(scan.hasNext()){
            inputNumber = scan.nextInt();
            //check whether the input is non-negative using signum function
            if(Integer.signum(inputNumber) != -1) {
                System.out.println(findFactorial(inputNumber));
                scan.close();
            } else{
                System.out.println("Enter a non-negative integer value");
            }

        }else{
            throw new NumberFormatException();
        }
    }
}
