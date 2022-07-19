package Fileprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class checkfiledata {

    public static void main(String[] args) throws FileNotFoundException {


        File file=new File("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\resource\\java.txt");

        Scanner scan=new Scanner(file);

        //read the file line by line
        while(scan.hasNext()){
            String line=scan.nextLine();
            if(line.contains("Saddam")){
                System.out.println("Text is in the file");
            }else{
                System.out.println("Text are not in the file");
            }

        }






    }
}
