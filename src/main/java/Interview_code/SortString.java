package Interview_code;

public class SortString {

    public static void main(String[] args) {

        String str="umarbinkhattab";
        char ch[]=str.toCharArray();

        for (int i=0;i<str.length();i++){
            for (int j=0;j<str.length();j++){
                if(ch[j]>ch[i]){
                    System.out.println(ch[i]+"=="+ch[j]);
                    char temp=ch[j];
                    ch[j]=ch[i];
                    ch[i]=temp;
                }
            }
        }

        System.out.println(ch);
    }


}
