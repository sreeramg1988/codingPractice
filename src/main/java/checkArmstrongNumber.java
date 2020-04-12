import java.util.Scanner;

public class checkArmstrongNumber {

    /**
     * This function is to find whether the number is an Armstrong number or not
     * @param number
     * @return true if the number is an Armstrong number
     * @return false if the number is not an ArmStrong number
     */
    public static void isArmStrongNumber(int number){
        int result = 0;
        int remainder,originalNumber;
        originalNumber = number;
        while(number > 0){
            remainder = number % 10;
            result = result + (remainder * remainder * remainder);
            number = number / 10;
        }
        if(result == originalNumber)
        System.out.println(result);
    }

    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Printing Armstrong numbers until 1000 ");
        for(int i = 1 ;i <= 1000; i++){
            isArmStrongNumber(i);
        }
        getInput.close();
    }
}
