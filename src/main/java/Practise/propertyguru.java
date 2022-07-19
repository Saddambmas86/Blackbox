package Practise;

public class propertyguru {

    public String solution(String riddle) {
        if(riddle==null || riddle.indexOf('?')==-1){
            return riddle;
        }
        StringBuilder Sb=new StringBuilder("");
        char prev='\0';
        for(int i=0;i<riddle.length();i++){
            char current=riddle.charAt(i);
            if(current=='?'){
                char next='\0';
                if(i!=riddle.length()-1){
                    next=riddle.charAt(i+1);
                }
                current=prev!='a' && next!='a' ? 'a'
                        :prev!='b' && next != 'b' ? 'b'
                        : 'c';
            }
            Sb.append(current);
            prev=current;
        }
        return Sb.toString();
    }



}
