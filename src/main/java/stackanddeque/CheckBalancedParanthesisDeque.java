package stackanddeque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class CheckBalancedParanthesisDeque {

    static boolean isBalanced(String stringToCheck){
        Deque<Character> deque = new LinkedList<>();
        for (char ch : stringToCheck.toCharArray()) {
            if(ch == '{' || ch =='[' || ch == '('){
                deque.addFirst(ch);
            }else{
                if(!deque.isEmpty() && (
                        (deque.peekFirst() == '{' && ch == '}')
                        || (deque.peekFirst() == '[' && ch == ']')
                        || (deque.peekFirst() == '(' && ch == ')'))){
                    deque.removeFirst();
                }else{
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the expression to verify");
        String inputString = input.next();
        if(isBalanced(inputString)){
            System.out.println("The paranthesis is balanced");
        }
        else{
            System.out.println("The parantheses is unbalanced");
        }

    }
}
