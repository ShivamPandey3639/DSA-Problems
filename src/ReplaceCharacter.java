import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            String s=sc.next();
            int[] hash=new int[26];
            for(int j=0;j<s.length();j++){
                hash[s.charAt(j)-'a']++;
            }
            char s2='c';
            int max=-1,min=100;
            for(int j=0;j<hash.length;j++){
                if(max<=hash[j]){
                    s2=(char) ((int)'a'+j);
                    max=hash[j];
                }
                if(min>hash[j] && hash[j]!=0){
                    min=hash[j];
                }
            }
            String res="";
            int flag=0;
            for(int j=0;j<s.length();j++){
                if(flag==1){
                    res+=s.charAt(j)+"";
                    continue;
                }
                if(s.charAt(j)!=s2 && hash[s.charAt(j)-'a']==min){
                    res+=s2+"";
                    flag=1;
                }else{
                    res+=s.charAt(j)+"";
                }

            }
            System.out.println(res);
        }
    }
}
