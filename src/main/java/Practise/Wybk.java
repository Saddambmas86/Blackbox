package Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Wybk {

    public static void main(String[] args) {


        String S1="[]{{}}";


        Stack<Character> St=new Stack<>();

        for(int i=0;i<S1.length();i++){
            if(S1.charAt(i)=='[' || S1.charAt(i)=='{' || S1.charAt(i)=='('){
                St.push(S1.charAt(i));
            }
            else if(!S1.isEmpty() && (
                    (S1.charAt(i)=='}' && St.peek()=='{')
                    || (S1.charAt(i)==']' && St.peek()=='[')
                    || (S1.charAt(i)==')' && St.peek()=='('))
            ){
                St.pop();
            }
        }

        if(St.empty()){
            System.out.println("Balanced Parenthesis");
        }
        else{
            System.out.println("Not Balanced Parenthesis");
        }



//List<String> L1= new ArrayList<>();
//L1.add("January");
//L1.add("February");
//L1.add("March");
//L1.add("April");
//L1.add("May");
//
//
//for(int i=0;i<L1.size();i++){
//
//    for(int j=i+1;j<L1.get(i).length()-1;j++){
//        int a=L1.get(i).length();
//        int b=L1.get(j).length();
//        if(a<b){
//            int temp=a;
//            a=b;
//            b=temp;
//            System.out.println(L1.get(j));
//        }
//    }
//
//}
//
//



    }




}
