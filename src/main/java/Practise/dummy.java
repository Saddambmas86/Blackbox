package Practise;

import java.util.Scanner;

public class dummy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] char_arr = input.toCharArray();
        int count;
        int i = 0;
        int consecutive=0;
        while(i <= char_arr.length - 1){
            count = 1;
            if(i == char_arr.length - 1)
                break;
            while(char_arr[i] == char_arr[i+1]){
                count++;
                consecutive=consecutive+1;
                i++;
                if(i == char_arr.length - 1)
                    break;
            }
            i++;
        }
        System.out.println(consecutive);
    }

}
