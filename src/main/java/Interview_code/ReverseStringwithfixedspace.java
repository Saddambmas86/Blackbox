package Interview_code;

public class ReverseStringwithfixedspace {

    public static void main(String[] args) {

        String str="Umar Bin Khattab";
        char ch[]=str.toCharArray();
        char newch[]=new char[ch.length];

        for(int i=0;i<str.length();i++){
            if(ch[i]==' '){
                newch[i]=' ';
            }
        }

        int j=str.length()-1;

        for(int i=0;i<str.length();i++){
            if(ch[i]!=' '){
                if(newch[j]==' '){
                    j--;
                }
                newch[j]=ch[i];
                j--;
            }
        }
        System.out.println(newch);
    }


}
