import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkPhoneNumber {

    static boolean isValidNumber(String inputSequence) {

        Pattern pattern = Pattern.compile("/d{1,12}");
        Matcher match = pattern.matcher(inputSequence);
        while (match.find()) {
            if (!inputSequence.startsWith("91")) {
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid phone number");
        String inputSequence = scan.next();
        if(isValidNumber(inputSequence)){
            System.out.println("The phone number is valid");
        }
        else{
            System.out.println("The phone number is Invalid!");
        }

    }
}
