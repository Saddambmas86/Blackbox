package StringPrograms;

import java.util.Stack;

public class Parenthesis {

    public static void main(String[] args) {

        String A="[]{{}}";
        Stack<Character> S1=new Stack<>();
        for (int i=0;i<A.length();i++){
            if(A.charAt(i)=='{' || A.charAt(i)=='(' || A.charAt(i)=='['){
                 S1.push(A.charAt(i));
            }
            else if(!S1.empty() &&
                    ((A.charAt(i)=='}' && S1.peek()=='{') ||
                     (A.charAt(i)==']' && S1.peek()=='[')  ||
                            (A.charAt(i)==')' && S1.peek()=='(')))
            {
                S1.pop();
            }
            else{
                S1.push(A.charAt(i));
            }
        }

        if(S1.empty()){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }


    }
}
