package stringoperations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

public class FindSpecialCharactersInString {

    public static void main(String [] args){
        String content = "Following example illustrates how to find a sequence of special characters like !@2019 together ";
        Pattern pattern = Pattern.compile("\\p{Punct}{2,}");
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()){
           System.out.println("The special characters in the String are: " + matcher.group());
        }
    }

}
