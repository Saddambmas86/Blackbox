package ArraysProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ShuffleArray {


    public static void main(String[] args) {



        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        Collections.shuffle(Arrays.asList(array));


        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            System.out.println("Random: "+randomIndexToSwap);


            int temp = array[randomIndexToSwap];          //--3
            System.out.println("Temp Value: "+temp);
            array[randomIndexToSwap] = array[i];          //--1
            System.out.println(array[randomIndexToSwap]);
            array[i] = temp;
            System.out.println("Value of array[i]: "+array[i]);
        }
        System.out.println(Arrays.toString(array));




    }


}
