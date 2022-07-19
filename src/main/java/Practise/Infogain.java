package Practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Infogain {	
public static void main(String...s) {

	
///////////////////Reverse String	
//String S="I love Ramzan";
//String S1="";
//
//for(int i=S.length()-1;i>=0;i--) {
//	S1=S1+S.charAt(i);
//}
//System.out.println(S1);


///////////Count Vowels and Consonents
//	String S="aeiou as";
//
//Set S1=new HashSet<Character>();
//S1.add('a');
//S1.add('e');
//S1.add('i');
//S1.add('o');
//S1.add('u');
//S1.add('A');
//S1.add('E');
//S1.add('I');
//S1.add('O');
//S1.add('U');
//
//int Vcount=0;
//int Ccount=0;
//
//for(int i=0;i<S.length();i++) {
//	if(S1.contains(S.charAt(i))) {
//		Vcount=Vcount+1;
//	}
//	else if(S.charAt(i)>='a' & S.charAt(i)<='z'){
//		Ccount++;
//	}
//}
//System.out.println("Vcount: "+Vcount);
//System.out.println("Ccount: "+Ccount);
//
	
////////Reverse String but fixed space
	
//String S1="I love Ramzan";
//char [] ch=S1.toCharArray();
//char [] newch=new char[S1.length()];
//
//for(int i=0;i<S1.length();i++) {
//	if(ch[i]==' ') {
//		newch[i]=' ';
//	}
//}
//
//int j=S1.length()-1;
//
//for(int i=0;i<=S1.length()-1;i++) {
//	if(ch[i]!=' ') {
//		if(newch[j]==' ') {
//			j--;
//		}
//		
//		char temp=ch[i];
//		ch[i]=newch[j];
//		newch[j]=temp;
//		j--;
//	}
//}
//
//System.out.println(newch);

	
///////	

//String S1="Tester QA";
//char[] ch=S1.toCharArray();
//
//Set Vowels=new HashSet<Character>();
//Vowels.add('a');
//Vowels.add('e');
//Vowels.add('i');
//Vowels.add('o');
//Vowels.add('u');
//Vowels.add('A');
//Vowels.add('E');
//Vowels.add('I');
//Vowels.add('O');
//Vowels.add('U');
//
//
//int start=0;
//int end=S1.length()-1;
//
//while(start<end) {
//	if(!Vowels.contains(ch[start])) {
//		start++;
//	}
//	if(!Vowels.contains(ch[start])) {
//		end--;
//	}
//	
//	char temp=ch[start];
//	ch[start]=ch[end];
//	ch[end]=temp;
//	
//	start++;
//	end--;
//}
//
//System.out.println(ch);
//

////Reverse word not sentence
	
//	String S1="Umar bin Khattab";
//	String[] S2=S1.split(" ");
//	String S3="";
//	
//	for(int i=0;i<S2.length;i++) {
//		for(int j=S2[i].length()-1;j>=0;j--) {
//			S3=S3+S2[i].charAt(j);
//		}
//		S3=S3+" ";
//	}
//	System.out.println(S3);
	
	
///Print duplicate character:
	
//String S1="Umar bin Khattab";
//Map<Character,Integer> M1=new HashMap<Character,Integer>();
//
//for(int i=0;i<S1.length();i++) {
//	if(M1.containsKey(S1.charAt(i))) {
//		M1.put(S1.charAt(i), M1.get(S1.charAt(i))+1);
//	}
//	else {
//		M1.put(S1.charAt(i), 1);
//}}
//
//System.out.println(M1);
//
//Set S2=M1.entrySet();
//Iterator Itr=S2.iterator();
//
//
//while(Itr.hasNext()){
//	Map.Entry M2=(Map.Entry)Itr.next();
//	if(M2.getValue().equals(2)) {
//		System.out.println(M2.getKey());
//	}
//}
//




//Missing Array number:
	
	int A[]= {1,2,5,9};
	int index=0;
	int len=A[A.length-1];
	for(int i=0;i<len;i++) {
		if(i==A[index]) {
			index++;
		}
		else {
			System.out.println(i);
		}
		
		
	}
	
	
	




	
	







	
	
	
	
	
	
	
	
	
}
}
