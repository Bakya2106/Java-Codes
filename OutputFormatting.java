import java.util.*;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                String str=String.valueOf(x);
                if(str.length()==2){
                    str="0"+x;
                } 
                else if(str.length()==1){
                    str="00"+x;
                }                            
                char[] ch=new char[18];
                for(int k=0;k<18;k++){
                    ch[k]=' ';

                }
                for(int j=0;j<s1.length();j++){
                    ch[j]=s1.charAt(j);

                }
                 int o=0;     
                 for(int n=15;n<18;n++){
                     ch[n]=str.charAt(o++);
                  }    
                 StringBuilder sb = new StringBuilder();
 
        // Creating a string using append() method
        for (int z = 0; z < ch.length; z++) {
            sb.append(ch[z]);
        }
                System.out.println(sb.toString());
            }
            System.out.println("================================");

    }
}



