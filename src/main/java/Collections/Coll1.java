package Collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Coll1 {

 public static void main(String[] args) {

  List<String> L1=new ArrayList<>();
  L1.add("January");
  L1.add("Februaury");
  L1.add("March");
  L1.add("April");
  L1.add("May");
  L1.add("June");
  L1.add("July");
  L1.add("August");
  L1.add("September");
  L1.add("October");
  L1.add("Novemeber");
  L1.add("December");
  sortMonth(L1);
  System.out.println(L1);

 List<String> L2=new ArrayList<>();
 L2.add("11/01/1991");
  L2.add("16/01/1991");
  L2.add("04/01/1991");
  L2.add("12/01/1990");
  L2.add("01/01/1991");
sortDates(L2);
  System.out.println(L2);


  List<String> L3=new ArrayList<>();
  L3.add("Monday");
  L3.add("Friday");
  L3.add("Sunday");
  L3.add("Tuesday");
  L3.add("Wednesday");
  L3.add("Saturday");
  L3.add("Thursday");

  Collections.sort(L3,new SortByDays());
  System.out.println(L3);



  List<String> L4=new ArrayList<>();
  L4.add("Khaled");
  L4.add("Umar");
  L4.add("Abubakr");
  L4.add("Usman");

  Collections.sort(L4,new SortbyCaliphas());
  System.out.println(L4);


 }



 public static void sortDates(List<String> datelist){
  Collections.sort(datelist, new Comparator<String>() {
   SimpleDateFormat SD=new SimpleDateFormat("dd/mm/yyyy");
   @Override
   public int compare(String o1, String o2) {
    try {
     return SD.parse(o1).compareTo(SD.parse(o2));
    } catch (ParseException e) {
     throw new IllegalArgumentException();
    }
   }
  });
 }


 public static void sortMonth(List<String> datelist){
  Collections.sort(datelist, new Comparator<String>() {
   SimpleDateFormat SD=new SimpleDateFormat("MMM");
   @Override
   public int compare(String o1, String o2) {
    try {
     return SD.parse(o1).compareTo(SD.parse(o2));
    } catch (ParseException e) {
     throw new IllegalArgumentException();
    }
   }
  });
 }



 public static void sortdays(List<String> datelist){
  Collections.sort(datelist, new Comparator<String>() {
   SimpleDateFormat SD=new SimpleDateFormat("DD");
   @Override
   public int compare(String o1, String o2) {
    try {
     return SD.parse(o1).compareTo(SD.parse(o2));
    } catch (ParseException e) {
     throw new IllegalArgumentException();
    }
   }
  });
 }



}

